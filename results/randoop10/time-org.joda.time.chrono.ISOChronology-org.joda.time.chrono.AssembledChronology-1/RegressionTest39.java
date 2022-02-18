import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    @Test
    public void test19501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19501");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DurationField durationField20 = iSOChronology13.years();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology13.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(iSOChronology24);
    }

    @Test
    public void test19502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19502");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.millisOfDay();
        long long17 = dateTimeField15.roundHalfCeiling((long) 49);
        java.util.Locale locale20 = null;
        long long21 = dateTimeField15.set(0L, "2", locale20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeField15.getAsText((-1015876799910L), locale23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 49L + "'", long17 == 49L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3599998L) + "'", long21 == (-3599998L));
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "18000090" + "'", str24, "18000090");
    }

    @Test
    public void test19503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19503");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.dayOfYear();
        boolean boolean24 = dateTimeField22.isLeap(0L);
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeField22.getAsShortText(readablePartial25, (-1958), locale27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1958" + "'", str28, "-1958");
    }

    @Test
    public void test19504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19504");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.yearOfEra();
        org.joda.time.Chronology chronology20 = iSOChronology13.withUTC();
        org.joda.time.DurationField durationField21 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test19505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19505");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField16 = iSOChronology13.days();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.monthOfYear();
        org.joda.time.DurationField durationField21 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField22 = iSOChronology13.millis();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str27 = dateTimeZone26.toString();
        java.lang.String str29 = dateTimeZone26.getShortName(1L);
        int int31 = dateTimeZone26.getOffsetFromLocal((long) (byte) 0);
        int int33 = dateTimeZone26.getStandardOffset((long) (short) 0);
        java.lang.String str34 = dateTimeZone26.getID();
        long long37 = dateTimeZone26.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology38 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField39 = iSOChronology38.months();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology38.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology38.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology38.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = iSOChronology38.weeks();
        org.joda.time.DurationField durationField45 = iSOChronology38.millis();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology38.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology38.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology38.secondOfDay();
        org.joda.time.ReadablePartial readablePartial49 = null;
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        java.lang.String str52 = dateTimeZone51.toString();
        java.lang.String str54 = dateTimeZone51.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone51);
        int int57 = dateTimeZone51.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology58 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone51);
        org.joda.time.DurationField durationField59 = iSOChronology58.days();
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology58.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial61 = null;
        java.util.TimeZone timeZone62 = null;
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        java.lang.String str64 = dateTimeZone63.toString();
        java.lang.String str66 = dateTimeZone63.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone63);
        int int69 = dateTimeZone63.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology70 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone63);
        org.joda.time.DurationField durationField71 = iSOChronology70.minutes();
        org.joda.time.DateTimeField dateTimeField72 = iSOChronology70.weekyear();
        java.lang.String str73 = dateTimeField72.toString();
        org.joda.time.ReadablePartial readablePartial74 = null;
        java.util.TimeZone timeZone75 = null;
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        java.lang.String str77 = dateTimeZone76.toString();
        java.lang.String str79 = dateTimeZone76.getShortName(1L);
        int int81 = dateTimeZone76.getOffsetFromLocal((long) (byte) 0);
        int int83 = dateTimeZone76.getStandardOffset((long) (short) 0);
        java.lang.String str84 = dateTimeZone76.getID();
        long long87 = dateTimeZone76.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology88 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone76);
        org.joda.time.DateTimeField dateTimeField89 = iSOChronology88.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField90 = iSOChronology88.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial91 = null;
        int[] intArray94 = new int[] { (short) -1, 0 };
        int int95 = dateTimeField90.getMinimumValue(readablePartial91, intArray94);
        int int96 = dateTimeField72.getMinimumValue(readablePartial74, intArray94);
        int int97 = dateTimeField60.getMaximumValue(readablePartial61, intArray94);
        int int98 = dateTimeField48.getMaximumValue(readablePartial49, intArray94);
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology13.validate(readablePartial24, intArray94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+97:00" + "'", str29, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 349200000 + "'", int31 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 349200000 + "'", int33 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-349200000L) + "'", long37 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+97:00" + "'", str52, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+97:00" + "'", str54, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 349200000 + "'", int57 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeZone63);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+97:00" + "'", str64, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+97:00" + "'", str66, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 349200000 + "'", int69 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology70);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "DateTimeField[weekyear]" + "'", str73, "DateTimeField[weekyear]");
        org.junit.Assert.assertNotNull(dateTimeZone76);
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "+97:00" + "'", str77, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "+97:00" + "'", str79, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 349200000 + "'", int81 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + 349200000 + "'", int83 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "+97:00" + "'", str84, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-349200000L) + "'", long87 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology88);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertNotNull(dateTimeField90);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-292275054) + "'", int96 == (-292275054));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 59 + "'", int97 == 59);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 86399 + "'", int98 == 86399);
    }

    @Test
    public void test19506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19506");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone15 = iSOChronology13.getZone();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str18 = dateTimeZone17.toString();
        java.lang.String str20 = dateTimeZone17.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        int int23 = dateTimeZone17.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField25 = iSOChronology24.minutes();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology24.minuteOfDay();
        org.joda.time.DurationField durationField29 = iSOChronology24.seconds();
        org.joda.time.DurationField durationField30 = iSOChronology24.millis();
        boolean boolean31 = dateTimeZone15.equals((java.lang.Object) iSOChronology24);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology24.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology24.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 349200000 + "'", int23 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test19507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19507");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = iSOChronology13.add(readablePeriod16, (long) (-297682553), 863999);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        int int23 = dateTimeZone21.getOffsetFromLocal((long) (byte) 1);
        long long25 = dateTimeZone21.convertUTCToLocal(97L);
        java.lang.String str26 = dateTimeZone21.getID();
        int int28 = dateTimeZone21.getOffset(86460000L);
        org.joda.time.Chronology chronology29 = iSOChronology13.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology13.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long35 = iSOChronology13.getDateTimeMillis(19, (-11425), 11, 1482960);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -11425 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-297682553L) + "'", long19 == (-297682553L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 349200000 + "'", int23 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 349200097L + "'", long25 == 349200097L);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 349200000 + "'", int28 == 349200000);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test19508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19508");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16516);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test19509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19509");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.year();
        org.joda.time.DurationField durationField12 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField14 = iSOChronology8.hours();
        org.joda.time.Chronology chronology15 = iSOChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology8.millisOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology8.weeks();
        java.lang.String str20 = iSOChronology8.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = iSOChronology8.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[+97:00]" + "'", str20, "ISOChronology[+97:00]");
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test19510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19510");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.minuteOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology8.seconds();
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        java.lang.String str18 = dateTimeZone15.getShortName(1L);
        int int20 = dateTimeZone15.getOffsetFromLocal((long) (byte) 0);
        int int22 = dateTimeZone15.getStandardOffset((long) (short) 0);
        java.lang.String str23 = dateTimeZone15.getID();
        long long26 = dateTimeZone15.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField28 = iSOChronology27.months();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology27.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology27.clockhourOfHalfday();
        org.joda.time.DurationField durationField33 = iSOChronology27.centuries();
        org.joda.time.DateTimeZone dateTimeZone34 = iSOChronology27.getZone();
        org.joda.time.Chronology chronology35 = iSOChronology8.withZone(dateTimeZone34);
        java.util.TimeZone timeZone36 = dateTimeZone34.toTimeZone();
        long long40 = dateTimeZone34.convertLocalToUTC((-757366839390L), false, 15802878L);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.lang.String str43 = dateTimeZone42.toString();
        java.lang.String str45 = dateTimeZone42.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone42);
        int int48 = dateTimeZone42.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology49 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone42);
        org.joda.time.DurationField durationField50 = iSOChronology49.minutes();
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology49.monthOfYear();
        org.joda.time.DurationField durationField52 = iSOChronology49.weekyears();
        org.joda.time.DateTimeField dateTimeField53 = iSOChronology49.millisOfSecond();
        boolean boolean54 = dateTimeZone34.equals((java.lang.Object) iSOChronology49);
        org.joda.time.DurationField durationField55 = iSOChronology49.minutes();
        org.joda.time.DateTimeZone dateTimeZone56 = iSOChronology49.getZone();
        org.joda.time.DateTimeField dateTimeField57 = iSOChronology49.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField58 = iSOChronology49.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = iSOChronology49.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 349200000 + "'", int20 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 349200000 + "'", int22 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349200000L) + "'", long26 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(timeZone36);
// flaky:         org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Greenwich Mean Time");
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-757716039390L) + "'", long40 == (-757716039390L));
        org.junit.Assert.assertNotNull(dateTimeZone42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+97:00" + "'", str45, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 349200000 + "'", int48 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
    }

    @Test
    public void test19511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19511");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.secondOfDay();
        org.joda.time.DurationField durationField12 = iSOChronology8.minutes();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.toString();
        java.lang.String str17 = dateTimeZone14.getShortName(1L);
        int int19 = dateTimeZone14.getOffsetFromLocal((long) (byte) 0);
        int int21 = dateTimeZone14.getStandardOffset((long) (short) 0);
        java.lang.String str22 = dateTimeZone14.getID();
        long long25 = dateTimeZone14.adjustOffset(0L, true);
        org.joda.time.Chronology chronology26 = iSOChronology8.withZone(dateTimeZone14);
        boolean boolean27 = dateTimeZone14.isFixed();
        java.lang.String str29 = dateTimeZone14.getShortName((long) 7);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone14.isLocalDateTimeGap(localDateTime30);
        boolean boolean32 = dateTimeZone14.isFixed();
        long long35 = dateTimeZone14.adjustOffset(691199931L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 349200000 + "'", int19 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 349200000 + "'", int21 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+97:00" + "'", str29, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 691199931L + "'", long35 == 691199931L);
    }

    @Test
    public void test19512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19512");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField12 = iSOChronology8.years();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = iSOChronology8.add(readablePeriod13, 66866322L, 12177930);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        java.lang.String str21 = dateTimeZone18.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int24 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.DurationField durationField26 = iSOChronology25.minutes();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology25.minuteOfHour();
        org.joda.time.DurationField durationField28 = iSOChronology25.days();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology25.year();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology25.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology25.weekyear();
        org.joda.time.DurationField durationField33 = iSOChronology25.centuries();
        org.joda.time.DurationField durationField34 = iSOChronology25.years();
        org.joda.time.DateTimeZone dateTimeZone35 = iSOChronology25.getZone();
        org.joda.time.Chronology chronology36 = iSOChronology8.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66866322L + "'", long16 == 66866322L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 349200000 + "'", int24 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test19513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19513");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.hourOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology13.millis();
        org.joda.time.DurationField durationField22 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test19514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19514");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.yearOfCentury();
        org.joda.time.DurationField durationField20 = iSOChronology13.centuries();
        org.joda.time.DurationField durationField21 = iSOChronology13.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = durationField21.subtract(51000006L, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test19515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19515");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField16 = iSOChronology13.days();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = iSOChronology13.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test19516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19516");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.minuteOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology8.seconds();
        org.joda.time.DurationField durationField14 = iSOChronology8.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology8.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology8.add(readablePeriod19, (-388680001L), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology8.minuteOfHour();
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeField23.getAsText(10000, locale25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-388680001L) + "'", long22 == (-388680001L));
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10000" + "'", str26, "10000");
    }

    @Test
    public void test19517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19517");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.centuryOfEra();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.toString();
        java.lang.String str19 = dateTimeZone16.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        long long22 = dateTimeZone16.convertUTCToLocal((long) (byte) 10);
        long long25 = dateTimeZone16.convertLocalToUTC((long) 292278993, false);
        org.joda.time.Chronology chronology26 = iSOChronology8.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology8.hourOfHalfday();
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.toString();
        java.lang.String str32 = dateTimeZone29.getShortName(1L);
        int int34 = dateTimeZone29.getOffsetFromLocal((long) (byte) 0);
        int int36 = dateTimeZone29.getStandardOffset((long) (short) 0);
        java.lang.String str37 = dateTimeZone29.getID();
        java.lang.String str39 = dateTimeZone29.getNameKey((long) (byte) -1);
        java.util.TimeZone timeZone40 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.LocalDateTime localDateTime43 = null;
        boolean boolean44 = dateTimeZone42.isLocalDateTimeGap(localDateTime43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone42.getOffset(readableInstant45);
        boolean boolean47 = iSOChronology8.equals((java.lang.Object) int46);
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology8.weekyear();
        org.joda.time.DurationField durationField49 = iSOChronology8.minutes();
        long long52 = durationField49.subtract(43200052L, (long) 6270681);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 349200010L + "'", long22 == 349200010L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-56921007L) + "'", long25 == (-56921007L));
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+97:00" + "'", str30, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 349200000 + "'", int34 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 349200000 + "'", int36 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
// flaky:         org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(timeZone40);
// flaky:         org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-376197659948L) + "'", long52 == (-376197659948L));
    }

    @Test
    public void test19518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19518");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.millisOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology8.minutes();
        org.joda.time.DurationField durationField14 = iSOChronology8.hours();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.millisOfDay();
        org.joda.time.DurationField durationField18 = iSOChronology8.millis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test19519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19519");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.dayOfYear();
        long long17 = iSOChronology8.getDateTimeMillis(0L, (int) (short) 10, (int) (short) 0, 59, (int) '#');
        org.joda.time.DurationField durationField18 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = iSOChronology8.millis();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology8.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32459035L + "'", long17 == 32459035L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test19520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19520");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.weekyearOfCentury();
        org.joda.time.DurationField durationField19 = iSOChronology13.hours();
        org.joda.time.DurationField durationField20 = iSOChronology13.years();
        long long24 = iSOChronology13.add((long) (-36059035), 169860000L, 0);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.year();
        org.joda.time.ReadablePartial readablePartial26 = null;
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeField25.getAsShortText(readablePartial26, 86399999, locale28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-36059035L) + "'", long24 == (-36059035L));
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "86399999" + "'", str29, "86399999");
    }

    @Test
    public void test19521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19521");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.weekyearOfCentury();
        java.util.Locale locale21 = null;
        int int22 = dateTimeField20.getMaximumTextLength(locale21);
        long long24 = dateTimeField20.roundFloor(192654762600003L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 192623353200000L + "'", long24 == 192623353200000L);
    }

    @Test
    public void test19522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19522");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.hourOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology13.millis();
        org.joda.time.DurationField durationField22 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.dayOfYear();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str27 = dateTimeZone26.toString();
        java.lang.String str29 = dateTimeZone26.getShortName(1L);
        int int31 = dateTimeZone26.getOffsetFromLocal((long) (byte) 0);
        int int33 = dateTimeZone26.getStandardOffset((long) (short) 0);
        java.lang.String str34 = dateTimeZone26.getID();
        long long37 = dateTimeZone26.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology38 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField39 = iSOChronology38.months();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology38.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology38.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology38.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = iSOChronology38.centuries();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology38.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology38.monthOfYear();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology38.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology38.millisOfDay();
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.lang.String str53 = dateTimeZone52.toString();
        org.joda.time.Chronology chronology54 = iSOChronology38.withZone(dateTimeZone52);
        java.util.TimeZone timeZone55 = dateTimeZone52.toTimeZone();
        long long57 = dateTimeZone52.convertUTCToLocal(31337413353L);
        int int59 = dateTimeZone52.getOffset(237600006L);
        org.joda.time.Chronology chronology60 = iSOChronology13.withZone(dateTimeZone52);
        java.lang.String str62 = dateTimeZone52.getShortName((-5993954516L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+97:00" + "'", str29, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 349200000 + "'", int31 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 349200000 + "'", int33 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-349200000L) + "'", long37 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeZone52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+97:00" + "'", str53, "+97:00");
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(timeZone55);
// flaky:         org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Greenwich Mean Time");
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + 31686613353L + "'", long57 == 31686613353L);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 349200000 + "'", int59 == 349200000);
        org.junit.Assert.assertNotNull(chronology60);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+97:00" + "'", str62, "+97:00");
    }

    @Test
    public void test19523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19523");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.yearOfEra();
        org.joda.time.DurationField durationField9 = iSOChronology7.halfdays();
        org.joda.time.DurationField durationField10 = iSOChronology7.millis();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.clockhourOfDay();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.toString();
        java.lang.String str17 = dateTimeZone14.getShortName(1L);
        int int19 = dateTimeZone14.getOffsetFromLocal((long) (byte) 0);
        int int21 = dateTimeZone14.getStandardOffset((long) (short) 0);
        java.lang.String str22 = dateTimeZone14.getID();
        long long25 = dateTimeZone14.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField27 = iSOChronology26.months();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology26.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology26.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology26.monthOfYear();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology26.era();
        org.joda.time.DateTimeZone dateTimeZone34 = iSOChronology26.getZone();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.lang.String str37 = dateTimeZone36.toString();
        java.lang.String str39 = dateTimeZone36.getShortName(1L);
        int int41 = dateTimeZone36.getOffsetFromLocal((long) (byte) 0);
        int int43 = dateTimeZone36.getStandardOffset((long) (short) 0);
        java.lang.String str44 = dateTimeZone36.getID();
        long long47 = dateTimeZone36.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone36);
        org.joda.time.DurationField durationField49 = iSOChronology48.months();
        org.joda.time.DurationField durationField50 = iSOChronology48.weeks();
        org.joda.time.DateTimeZone dateTimeZone51 = iSOChronology48.getZone();
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        java.lang.String str54 = dateTimeZone53.toString();
        java.lang.String str56 = dateTimeZone53.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone53);
        int int59 = dateTimeZone53.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone53);
        org.joda.time.DurationField durationField61 = iSOChronology60.minutes();
        org.joda.time.DateTimeField dateTimeField62 = iSOChronology60.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology60.secondOfDay();
        org.joda.time.DurationField durationField64 = iSOChronology60.minutes();
        java.util.TimeZone timeZone65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        java.lang.String str67 = dateTimeZone66.toString();
        java.lang.String str69 = dateTimeZone66.getShortName(1L);
        int int71 = dateTimeZone66.getOffsetFromLocal((long) (byte) 0);
        int int73 = dateTimeZone66.getStandardOffset((long) (short) 0);
        java.lang.String str74 = dateTimeZone66.getID();
        long long77 = dateTimeZone66.adjustOffset(0L, true);
        org.joda.time.Chronology chronology78 = iSOChronology60.withZone(dateTimeZone66);
        boolean boolean79 = dateTimeZone66.isFixed();
        int int81 = dateTimeZone66.getOffset((long) 0);
        java.lang.String str82 = dateTimeZone66.getID();
        long long84 = dateTimeZone51.getMillisKeepLocal(dateTimeZone66, (-61787937599989L));
        java.util.Locale locale86 = null;
        java.lang.String str87 = dateTimeZone66.getName(299410032L, locale86);
        long long89 = dateTimeZone34.getMillisKeepLocal(dateTimeZone66, 45442010354050L);
        boolean boolean91 = dateTimeZone66.isStandardOffset(693810907200000L);
        long long94 = dateTimeZone66.convertLocalToUTC(86460000L, true);
        org.joda.time.Chronology chronology95 = iSOChronology7.withZone(dateTimeZone66);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 349200000 + "'", int19 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 349200000 + "'", int21 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-349200000L) + "'", long25 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+97:00" + "'", str39, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 349200000 + "'", int41 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 349200000 + "'", int43 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+97:00" + "'", str44, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-349200000L) + "'", long47 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+97:00" + "'", str54, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+97:00" + "'", str56, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 349200000 + "'", int59 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeZone66);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+97:00" + "'", str67, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+97:00" + "'", str69, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 349200000 + "'", int71 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int73 + "' != '" + 349200000 + "'", int73 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+97:00" + "'", str74, "+97:00");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 349200000 + "'", int81 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "+97:00" + "'", str82, "+97:00");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-61787937599989L) + "'", long84 == (-61787937599989L));
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "+97:00" + "'", str87, "+97:00");
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 45442010354050L + "'", long89 == 45442010354050L);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long94 + "' != '" + (-262740000L) + "'", long94 == (-262740000L));
        org.junit.Assert.assertNotNull(chronology95);
    }

    @Test
    public void test19524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19524");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.dayOfYear();
        org.joda.time.DurationField durationField24 = iSOChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.weekyearOfCentury();
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeField26.getAsShortText(14, locale28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "14" + "'", str29, "14");
    }

    @Test
    public void test19525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19525");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.year();
        org.joda.time.DurationField durationField21 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.millisOfDay();
        long long26 = dateTimeField23.add(0L, (-28755326001600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-28755326001600000L) + "'", long26 == (-28755326001600000L));
    }

    @Test
    public void test19526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19526");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.weekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition(36059035L);
        boolean boolean21 = dateTimeZone17.isStandardOffset((-1727999988L));
        long long23 = dateTimeZone17.nextTransition((long) 86399);
        long long26 = dateTimeZone17.adjustOffset((long) 292278993, true);
        org.joda.time.Chronology chronology27 = iSOChronology8.withZone(dateTimeZone17);
        int int29 = dateTimeZone17.getStandardOffset(335L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 36059035L + "'", long19 == 36059035L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 86399L + "'", long23 == 86399L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 292278993L + "'", long26 == 292278993L);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 349200000 + "'", int29 == 349200000);
    }

    @Test
    public void test19527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19527");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField18 = iSOChronology13.centuries();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str21 = dateTimeZone20.toString();
        java.lang.String str23 = dateTimeZone20.getShortName(1L);
        int int25 = dateTimeZone20.getOffsetFromLocal((long) (byte) 0);
        int int27 = dateTimeZone20.getStandardOffset((long) (short) 0);
        java.lang.String str28 = dateTimeZone20.getID();
        long long31 = dateTimeZone20.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology32.dayOfYear();
        org.joda.time.DurationField durationField35 = iSOChronology32.weeks();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology32.yearOfCentury();
        org.joda.time.DurationField durationField37 = iSOChronology32.years();
        long long40 = durationField37.getValueAsLong(187200002L, 782829504633600000L);
        int int41 = durationField18.compareTo(durationField37);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 349200000 + "'", int25 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 349200000 + "'", int27 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-349200000L) + "'", long31 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test19528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19528");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = iSOChronology13.days();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology13.add(readablePeriod19, (long) 100, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.weekyearOfCentury();
        org.joda.time.DurationField durationField25 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology13.millisOfDay();
        org.joda.time.ReadablePartial readablePartial30 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long32 = iSOChronology13.set(readablePartial30, 2577600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test19529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19529");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.dayOfYear();
        long long17 = iSOChronology8.getDateTimeMillis(0L, (int) (short) 10, (int) (short) 0, 59, (int) '#');
        org.joda.time.DurationField durationField18 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField25 = iSOChronology8.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32459035L + "'", long17 == 32459035L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test19530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19530");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DurationField durationField10 = iSOChronology8.eras();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = iSOChronology8.getDateTimeMillis((-112178), 86400100, 2922789, 725);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86400100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test19531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19531");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology0.days();
        long long7 = iSOChronology0.add((-151740000L), (-80710596L), 52);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.era();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-4348690992L) + "'", long7 == (-4348690992L));
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test19532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19532");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = iSOChronology8.getDateTimeMillis(757554032459L, (-15860668), 1978, 45582212, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -15860668 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test19533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19533");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str3 = dateTimeZone1.getID();
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        long long8 = dateTimeZone1.adjustOffset((-31513123264L), false);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-25720280481600000L));
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 86460000L);
        long long16 = dateTimeZone1.nextTransition((-1640822400000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+97:00" + "'", str3, "+97:00");
        org.junit.Assert.assertNotNull(timeZone4);
// flaky:         org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31513123264L) + "'", long8 == (-31513123264L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 435659994L + "'", long14 == 435659994L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1640822400000L) + "'", long16 == (-1640822400000L));
    }

    @Test
    public void test19534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19534");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.yearOfEra();
        org.joda.time.DurationField durationField9 = iSOChronology7.halfdays();
        org.joda.time.DurationField durationField10 = iSOChronology7.millis();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.yearOfEra();
        long long13 = dateTimeField11.roundHalfFloor(172374067353600000L);
        int int16 = dateTimeField11.getDifference((-86280001L), (long) 14);
        java.lang.String str18 = dateTimeField11.getAsShortText(131763148804800000L);
        org.joda.time.ReadablePartial readablePartial19 = null;
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeField11.getAsText(readablePartial19, 405544, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 172374075039600000L + "'", long13 == 172374075039600000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4177377" + "'", str18, "4177377");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "405544" + "'", str22, "405544");
    }

    @Test
    public void test19535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19535");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfEra();
        org.joda.time.DurationField durationField17 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.dayOfYear();
        org.joda.time.DurationField durationField19 = iSOChronology13.years();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test19536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19536");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.lang.String str5 = dateTimeZone2.getName(86400000L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-45L), locale7);
        long long11 = dateTimeZone2.adjustOffset(2556144000001L, false);
        long long13 = dateTimeZone2.convertUTCToLocal(57600000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT-01:01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:01" + "'", str5, "-01:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:01" + "'", str8, "-01:01");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2556144000001L + "'", long11 == 2556144000001L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53940000L + "'", long13 == 53940000L);
    }

    @Test
    public void test19537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19537");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.hourOfDay();
        org.joda.time.DurationField durationField14 = iSOChronology8.centuries();
        org.joda.time.DurationField durationField15 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.yearOfCentury();
        long long19 = dateTimeField16.set(0L, 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-2208988800000L) + "'", long19 == (-2208988800000L));
    }

    @Test
    public void test19538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19538");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.hourOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology13.millis();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField23 = iSOChronology13.centuries();
        org.joda.time.DurationField durationField24 = iSOChronology13.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = iSOChronology13.getDateTimeMillis((-297682553), 0, 5819, 365, 29, (-5820), 984720960);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test19539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19539");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.millis();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology13.getZone();
        long long26 = iSOChronology13.getDateTimeMillis(946684800000L, (int) (short) 1, 2, 0, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology13.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 946684920001L + "'", long26 == 946684920001L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test19540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19540");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.dayOfYear();
        long long17 = iSOChronology8.getDateTimeMillis(0L, (int) (short) 10, (int) (short) 0, 59, (int) '#');
        org.joda.time.DurationField durationField18 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField25 = iSOChronology8.minutes();
        org.joda.time.DurationField durationField26 = iSOChronology8.millis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32459035L + "'", long17 == 32459035L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test19541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19541");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField16 = iSOChronology13.days();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.monthOfYear();
        org.joda.time.DurationField durationField21 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.secondOfDay();
        org.joda.time.DurationField durationField23 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test19542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19542");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.year();
        org.joda.time.DurationField durationField17 = iSOChronology13.millis();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test19543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19543");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = iSOChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField16 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.centuryOfEra();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeField17.getAsShortText((-102162), locale19);
        java.lang.String str21 = dateTimeField17.getName();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeField17.getAsText((-7127358L), locale23);
        long long27 = dateTimeField17.set((-172680000L), 312);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-102162" + "'", str20, "-102162");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "centuryOfEra" + "'", str21, "centuryOfEra");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19" + "'", str24, "19");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 924618585720000L + "'", long27 == 924618585720000L);
    }

    @Test
    public void test19544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19544");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField20 = iSOChronology13.months();
        org.joda.time.DurationField durationField21 = iSOChronology13.halfdays();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.toString();
        java.lang.String str26 = dateTimeZone23.getShortName(1L);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (byte) 0);
        int int30 = dateTimeZone23.getStandardOffset((long) (short) 0);
        java.lang.String str31 = dateTimeZone23.getID();
        long long34 = dateTimeZone23.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology35.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology35.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology35.hourOfDay();
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        java.lang.String str42 = dateTimeZone41.toString();
        java.lang.String str44 = dateTimeZone41.getShortName(1L);
        int int46 = dateTimeZone41.getOffsetFromLocal((long) (byte) 0);
        int int48 = dateTimeZone41.getStandardOffset((long) (short) 0);
        java.lang.String str49 = dateTimeZone41.getID();
        long long52 = dateTimeZone41.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology53 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone41);
        org.joda.time.DurationField durationField54 = iSOChronology53.months();
        org.joda.time.DurationField durationField55 = iSOChronology53.weeks();
        org.joda.time.DateTimeField dateTimeField56 = iSOChronology53.year();
        org.joda.time.DateTimeField dateTimeField57 = iSOChronology53.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField58 = iSOChronology53.hourOfDay();
        java.lang.String str59 = iSOChronology53.toString();
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        java.lang.String str62 = dateTimeZone61.toString();
        java.lang.String str63 = dateTimeZone61.getID();
        int int65 = dateTimeZone61.getOffsetFromLocal(36059035L);
        org.joda.time.Chronology chronology66 = iSOChronology53.withZone(dateTimeZone61);
        org.joda.time.Chronology chronology67 = iSOChronology35.withZone(dateTimeZone61);
        java.lang.String str69 = dateTimeZone61.getNameKey((-352800000L));
        java.lang.String str70 = dateTimeZone61.getID();
        long long74 = dateTimeZone61.convertLocalToUTC(8553600100L, true, (long) 407514);
        org.joda.time.Chronology chronology75 = iSOChronology13.withZone(dateTimeZone61);
        org.joda.time.DateTimeField dateTimeField76 = iSOChronology13.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 349200000 + "'", int28 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 349200000 + "'", int30 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-349200000L) + "'", long34 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+97:00" + "'", str42, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+97:00" + "'", str44, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 349200000 + "'", int46 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 349200000 + "'", int48 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+97:00" + "'", str49, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-349200000L) + "'", long52 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ISOChronology[+97:00]" + "'", str59, "ISOChronology[+97:00]");
        org.junit.Assert.assertNotNull(dateTimeZone61);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+97:00" + "'", str62, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+97:00" + "'", str63, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 349200000 + "'", int65 == 349200000);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(chronology67);
// flaky:         org.junit.Assert.assertNull(str69);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+97:00" + "'", str70, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long74 + "' != '" + 8204400100L + "'", long74 == 8204400100L);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateTimeField76);
    }

    @Test
    public void test19545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19545");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.dayOfYear();
        org.joda.time.DurationField durationField14 = iSOChronology8.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.minuteOfDay();
        org.joda.time.DurationField durationField16 = iSOChronology8.months();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology8.months();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test19546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19546");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.dayOfMonth();
        org.joda.time.DurationField durationField16 = iSOChronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology8.era();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology8.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 349200000 + "'", int7 == 349200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test19547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19547");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str3 = dateTimeZone1.getID();
        long long7 = dateTimeZone1.convertLocalToUTC(10L, false, (long) '4');
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        java.lang.String str11 = dateTimeZone9.getID();
        java.util.TimeZone timeZone12 = dateTimeZone9.toTimeZone();
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone9);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone9.getOffset(readableInstant14);
        long long19 = dateTimeZone9.convertLocalToUTC(2037360000L, false, 25256447827200100L);
        long long22 = dateTimeZone9.convertLocalToUTC(1L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+97:00" + "'", str3, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199990L) + "'", long7 == (-349199990L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 349200000 + "'", int15 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1688160000L + "'", long19 == 1688160000L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199999L) + "'", long22 == (-349199999L));
    }

    @Test
    public void test19548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19548");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfCentury();
        long long22 = iSOChronology13.getDateTimeMillis(12, (int) (byte) 1, (int) (short) 10, 11);
        long long27 = iSOChronology13.getDateTimeMillis((int) (byte) 0, (int) (short) 1, 1, (int) ' ');
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology13.halfdayOfDay();
        org.joda.time.DurationField durationField30 = iSOChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology13.centuryOfEra();
        org.joda.time.DurationField durationField32 = iSOChronology13.weeks();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-61788099599989L) + "'", long22 == (-61788099599989L));
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-62167568399968L) + "'", long27 == (-62167568399968L));
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
    }

    @Test
    public void test19549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19549");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.millisOfSecond();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.hourOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology13.millis();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.millisOfSecond();
        org.joda.time.Chronology chronology24 = iSOChronology13.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test19550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19550");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField20 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test19551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19551");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.secondOfMinute();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test19552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19552");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.yearOfEra();
        org.joda.time.Chronology chronology20 = iSOChronology13.withUTC();
        org.joda.time.DurationField durationField21 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.yearOfEra();
        java.lang.String str23 = iSOChronology13.toString();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.minuteOfDay();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str27 = dateTimeZone26.toString();
        java.lang.String str29 = dateTimeZone26.getShortName(1L);
        int int31 = dateTimeZone26.getOffsetFromLocal((long) (byte) 0);
        int int33 = dateTimeZone26.getStandardOffset((long) (short) 0);
        java.lang.String str34 = dateTimeZone26.getID();
        long long37 = dateTimeZone26.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology38 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField39 = iSOChronology38.months();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology38.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology38.dayOfWeek();
        org.joda.time.DurationField durationField44 = iSOChronology38.millis();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone46);
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone46);
        org.joda.time.Chronology chronology49 = iSOChronology38.withZone(dateTimeZone46);
        org.joda.time.Chronology chronology50 = iSOChronology13.withZone(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology13.dayOfYear();
        boolean boolean53 = dateTimeField51.isLeap(115501468320360000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 349200000 + "'", int6 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200000L) + "'", long12 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ISOChronology[+97:00]" + "'", str23, "ISOChronology[+97:00]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+97:00" + "'", str29, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 349200000 + "'", int31 == 349200000);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 349200000 + "'", int33 == 349200000);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-349200000L) + "'", long37 == (-349200000L));
        org.junit.Assert.assertNotNull(iSOChronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test19553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19553");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.minuteOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology8.seconds();
        org.joda.time.DurationField durationField14 = iSOChronology8.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField16 = iSOChronology8.millis();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology8.minuteOfHour();
        boolean boolean19 = dateTimeField18.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = dateTimeField18.set(1314060000L, (-6171435));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -6171435 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test19554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19554");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.weekyearOfCentury();
        long long22 = iSOChronology13.add((long) (short) 100, 0L, 3);
        org.joda.time.Chronology chronology23 = iSOChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test19555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19555");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.yearOfCentury();
        org.joda.time.DurationField durationField16 = iSOChronology8.weeks();
        long long18 = durationField16.getMillis(7);
        long long20 = durationField16.getMillis(14400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4233600000L + "'", long18 == 4233600000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 8709120000000000L + "'", long20 == 8709120000000000L);
    }

    @Test
    public void test19556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19556");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfCentury();
        org.joda.time.DurationField durationField17 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology13.getZone();
        long long23 = iSOChronology13.add(5804847410L, 305424068400000L, (-5820));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1777568072283152590L) + "'", long23 == (-1777568072283152590L));
    }

    @Test
    public void test19557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19557");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        java.lang.String str7 = dateTimeZone1.getID();
        boolean boolean8 = dateTimeZone1.isFixed();
        java.lang.String str10 = dateTimeZone1.getShortName(181083187353600000L);
        java.lang.String str11 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+52:00" + "'", str7, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+52:00" + "'", str10, "+52:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+52:00" + "'", str11, "+52:00");
    }

    @Test
    public void test19558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19558");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.millisOfSecond();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test19559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19559");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = iSOChronology8.add(readablePeriod14, (-158535120L), 8904);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str20 = dateTimeZone19.toString();
        java.lang.String str22 = dateTimeZone19.getShortName(1L);
        int int24 = dateTimeZone19.getOffsetFromLocal((long) (byte) 0);
        int int26 = dateTimeZone19.getStandardOffset((long) (short) 0);
        java.lang.String str27 = dateTimeZone19.getID();
        long long30 = dateTimeZone19.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField32 = iSOChronology31.months();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology31.secondOfDay();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology31.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology31.clockhourOfHalfday();
        org.joda.time.DurationField durationField37 = iSOChronology31.weeks();
        org.joda.time.DurationField durationField38 = iSOChronology31.millis();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology31.secondOfMinute();
        java.lang.String str41 = iSOChronology31.toString();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology31.era();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology31.minuteOfDay();
        boolean boolean44 = iSOChronology8.equals((java.lang.Object) iSOChronology31);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology31.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-158535120L) + "'", long17 == (-158535120L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+52:00" + "'", str20, "+52:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+52:00" + "'", str22, "+52:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 187200000 + "'", int24 == 187200000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 187200000 + "'", int26 == 187200000);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+52:00" + "'", str27, "+52:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-187200000L) + "'", long30 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ISOChronology[+52:00]" + "'", str41, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeField45);
    }

    @Test
    public void test19560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19560");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology8.months();
        org.joda.time.DurationField durationField12 = iSOChronology8.weekyears();
        org.joda.time.DurationField durationField13 = iSOChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.weekOfWeekyear();
        long long20 = dateTimeField17.set((long) 43, 3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1209600043L + "'", long20 == 1209600043L);
    }

    @Test
    public void test19561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19561");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.millisOfDay();
        org.joda.time.Chronology chronology12 = iSOChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test19562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19562");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.dayOfYear();
        org.joda.time.DurationField durationField16 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = dateTimeField19.set(31341013353L, (-2735));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2735 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test19563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19563");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-36059035));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test19564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19564");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField20 = iSOChronology13.hours();
        org.joda.time.DurationField durationField21 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test19565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19565");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfCentury();
        org.joda.time.DurationField durationField17 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.hours();
        org.joda.time.DurationField durationField20 = iSOChronology13.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = iSOChronology13.getDateTimeMillis((-17260318L), 170, (-11), 6380357, (-182074498));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 170 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test19566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19566");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology13.getZone();
        org.joda.time.DurationField durationField21 = iSOChronology13.years();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = iSOChronology13.getZone();
        long long30 = dateTimeZone28.convertUTCToLocal(2180112698388198861L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2180112698575398861L + "'", long30 == 2180112698575398861L);
    }

    @Test
    public void test19567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19567");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfCentury();
        long long20 = iSOChronology13.add(97L, 36059035L, (int) '#');
        org.joda.time.DurationField durationField21 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.era();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.toString();
        java.lang.String str27 = dateTimeZone24.getShortName(1L);
        int int29 = dateTimeZone24.getOffsetFromLocal((long) (byte) 0);
        int int31 = dateTimeZone24.getStandardOffset((long) (short) 0);
        java.lang.String str32 = dateTimeZone24.getID();
        long long35 = dateTimeZone24.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField37 = iSOChronology36.months();
        org.joda.time.DurationField durationField38 = iSOChronology36.weeks();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.year();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology36.yearOfCentury();
        long long46 = iSOChronology36.getDateTimeMillis(259200100L, 11, (int) (byte) 10, (int) (short) 10, (int) ' ');
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology36.era();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology36.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone49 = iSOChronology36.getZone();
        org.joda.time.Chronology chronology50 = iSOChronology13.withZone(dateTimeZone49);
        org.joda.time.DurationField durationField51 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField52 = iSOChronology13.era();
        int int54 = dateTimeField52.getMinimumValue(86399931L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1262066322L + "'", long20 == 1262066322L);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+52:00" + "'", str25, "+52:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+52:00" + "'", str27, "+52:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 187200000 + "'", int29 == 187200000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 187200000 + "'", int31 == 187200000);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+52:00" + "'", str32, "+52:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-187200000L) + "'", long35 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 285010032L + "'", long46 == 285010032L);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test19568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19568");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.secondOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology8.millis();
        org.joda.time.DurationField durationField14 = iSOChronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.era();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test19569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19569");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.millisOfSecond();
        org.joda.time.DurationField durationField12 = iSOChronology8.days();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.toString();
        java.lang.String str17 = dateTimeZone14.getShortName(1L);
        int int19 = dateTimeZone14.getOffsetFromLocal((long) (byte) 0);
        int int21 = dateTimeZone14.getStandardOffset((long) (short) 0);
        java.lang.String str22 = dateTimeZone14.getID();
        long long25 = dateTimeZone14.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField27 = iSOChronology26.months();
        org.joda.time.DurationField durationField28 = iSOChronology26.weeks();
        org.joda.time.DurationField durationField29 = iSOChronology26.weeks();
        boolean boolean30 = iSOChronology8.equals((java.lang.Object) durationField29);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology8.dayOfYear();
        org.joda.time.DurationField durationField32 = iSOChronology8.centuries();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology8.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+52:00" + "'", str15, "+52:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:00" + "'", str17, "+52:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 187200000 + "'", int19 == 187200000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 187200000 + "'", int21 == 187200000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+52:00" + "'", str22, "+52:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-187200000L) + "'", long25 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test19570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19570");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(223200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19571");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.hourOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology13.millis();
        org.joda.time.DurationField durationField22 = iSOChronology13.hours();
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology13.getZone();
        int int25 = dateTimeZone23.getOffsetFromLocal((-517877731392082553L));
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str28 = dateTimeZone27.toString();
        java.lang.String str30 = dateTimeZone27.getShortName(1L);
        int int32 = dateTimeZone27.getOffsetFromLocal((long) (byte) 0);
        int int34 = dateTimeZone27.getStandardOffset((long) (short) 0);
        java.lang.String str35 = dateTimeZone27.getID();
        long long38 = dateTimeZone27.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone27);
        org.joda.time.DurationField durationField40 = iSOChronology39.months();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology39.secondOfDay();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology39.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology39.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology39.dayOfWeek();
        java.lang.String str47 = iSOChronology39.toString();
        org.joda.time.DurationField durationField48 = iSOChronology39.halfdays();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology39.secondOfMinute();
        boolean boolean50 = dateTimeZone23.equals((java.lang.Object) iSOChronology39);
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology39.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial52 = null;
        java.util.Locale locale53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = dateTimeField51.getAsShortText(readablePartial52, locale53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 187200000 + "'", int25 == 187200000);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+52:00" + "'", str28, "+52:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+52:00" + "'", str30, "+52:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 187200000 + "'", int32 == 187200000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 187200000 + "'", int34 == 187200000);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+52:00" + "'", str35, "+52:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-187200000L) + "'", long38 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ISOChronology[+52:00]" + "'", str47, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeField51);
    }

    @Test
    public void test19572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19572");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test19573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19573");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.hourOfHalfday();
        org.joda.time.DurationField durationField17 = iSOChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.yearOfEra();
        org.joda.time.Chronology chronology19 = iSOChronology13.withUTC();
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = chronology19.get(readablePartial20, 536399999L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test19574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19574");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.weekyearOfCentury();
        org.joda.time.DurationField durationField28 = iSOChronology13.minutes();
        int int31 = durationField28.getValue((-9678L), (-221196696771L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test19575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19575");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfCentury();
        org.joda.time.DurationField durationField17 = iSOChronology13.days();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test19576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19576");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.dayOfYear();
        long long17 = iSOChronology8.getDateTimeMillis(0L, (int) (short) 10, (int) (short) 0, 59, (int) '#');
        org.joda.time.DurationField durationField18 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology8.year();
        int int24 = dateTimeField21.getDifference(90820958400052L, (-61891603200000L));
        int int26 = dateTimeField21.getLeapAmount((-25719772579200000L));
        int int28 = dateTimeField21.getMinimumValue(54969745287829386L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21659035L + "'", long17 == 21659035L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4839 + "'", int24 == 4839);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-292275054) + "'", int28 == (-292275054));
    }

    @Test
    public void test19577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19577");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.dayOfYear();
        long long17 = iSOChronology8.getDateTimeMillis(0L, (int) (short) 10, (int) (short) 0, 59, (int) '#');
        org.joda.time.DurationField durationField18 = iSOChronology8.days();
        org.joda.time.Chronology chronology19 = iSOChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology8.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTimeField21.getAsText(readablePartial22, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21659035L + "'", long17 == 21659035L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test19578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19578");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfDay();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dateTimeField4.set(896894208000000L, "987033600", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 987033600 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test19579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19579");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = iSOChronology8.getDateTimeMillis(0L, (-10250), (-81945016), 62317, 1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10250 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test19580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19580");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.hourOfDay();
        java.lang.String str19 = iSOChronology13.toString();
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.lang.String str22 = dateTimeZone21.toString();
        java.lang.String str23 = dateTimeZone21.getID();
        int int25 = dateTimeZone21.getOffsetFromLocal(36059035L);
        org.joda.time.Chronology chronology26 = iSOChronology13.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology13.yearOfCentury();
        java.util.Locale locale34 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long35 = dateTimeField31.set(0L, "-36822299", locale34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -36822299 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[+52:00]" + "'", str19, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+52:00" + "'", str22, "+52:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+52:00" + "'", str23, "+52:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 187200000 + "'", int25 == 187200000);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test19581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19581");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.year();
        org.joda.time.DurationField durationField19 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.dayOfWeek();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.toString();
        java.lang.String str26 = dateTimeZone23.getShortName(1L);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (byte) 0);
        int int30 = dateTimeZone23.getStandardOffset((long) (short) 0);
        java.lang.String str31 = dateTimeZone23.getID();
        long long34 = dateTimeZone23.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField36 = iSOChronology35.months();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology35.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology35.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology35.clockhourOfHalfday();
        org.joda.time.DurationField durationField41 = iSOChronology35.centuries();
        org.joda.time.DurationField durationField42 = iSOChronology35.years();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology35.hourOfDay();
        java.lang.String str44 = dateTimeField43.getName();
        boolean boolean45 = iSOChronology13.equals((java.lang.Object) dateTimeField43);
        org.joda.time.DateTimeZone dateTimeZone46 = iSOChronology13.getZone();
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone46.getName(25675199990L, locale48);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+52:00" + "'", str24, "+52:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+52:00" + "'", str26, "+52:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 187200000 + "'", int28 == 187200000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 187200000 + "'", int30 == 187200000);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+52:00" + "'", str31, "+52:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-187200000L) + "'", long34 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hourOfDay" + "'", str44, "hourOfDay");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+52:00" + "'", str49, "+52:00");
    }

    @Test
    public void test19582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19582");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.year();
        org.joda.time.DurationField durationField21 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField22 = iSOChronology13.weekyears();
        org.joda.time.Chronology chronology23 = iSOChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.centuryOfEra();
        org.joda.time.DurationField durationField25 = dateTimeField24.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNull(durationField25);
    }

    @Test
    public void test19583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19583");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField12 = iSOChronology8.years();
        org.joda.time.DurationField durationField13 = iSOChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.yearOfEra();
        org.joda.time.DurationField durationField17 = iSOChronology8.months();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = durationField17.subtract((-24345L), (-1893417120000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Magnitude of add amount is too large: 1893417120000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test19584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19584");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = iSOChronology13.getDateTimeMillis(3, (-36822299), 13, 364);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -36822299 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test19585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19585");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.dayOfYear();
        org.joda.time.DurationField durationField16 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.year();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = iSOChronology13.add(readablePeriod21, 777660000L, 34537691);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 777660000L + "'", long24 == 777660000L);
    }

    @Test
    public void test19586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19586");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.hourOfHalfday();
        java.lang.String str22 = dateTimeField20.getAsText((long) 5);
        long long25 = dateTimeField20.add(25252904995200L, 2L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 25252912195200L + "'", long25 == 25252912195200L);
    }

    @Test
    public void test19587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19587");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField12 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.era();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.dayOfYear();
        java.lang.String str17 = iSOChronology8.toString();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology8.yearOfCentury();
        org.joda.time.DurationField durationField20 = iSOChronology8.months();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[+52:00]" + "'", str17, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test19588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19588");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.yearOfEra();
        org.joda.time.Chronology chronology20 = iSOChronology13.withUTC();
        org.joda.time.DurationField durationField21 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.yearOfEra();
        java.lang.String str23 = iSOChronology13.toString();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.hourOfDay();
        int int27 = dateTimeField26.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ISOChronology[+52:00]" + "'", str23, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test19589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19589");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = iSOChronology8.add(readablePeriod11, (-1727999988L), 187200000);
        org.joda.time.DurationField durationField15 = iSOChronology8.years();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField17.getDifferenceAsLong((-98403887729403594L), 5907399247957800100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2283795901");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1727999988L) + "'", long14 == (-1727999988L));
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test19590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19590");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = iSOChronology8.add(readablePeriod14, (long) 'a', (-1));
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology8.dayOfMonth();
        org.joda.time.DurationField durationField19 = iSOChronology8.minutes();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology8.getZone();
        org.joda.time.DurationField durationField21 = iSOChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology8.secondOfMinute();
        org.joda.time.DurationField durationField23 = iSOChronology8.weeks();
        org.joda.time.DurationField durationField24 = iSOChronology8.days();
        long long27 = durationField24.getMillis(24000000L, 113605027117200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 2073600000000000L + "'", long27 == 2073600000000000L);
    }

    @Test
    public void test19591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19591");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = iSOChronology13.weeks();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology20 = iSOChronology13.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField21 = iSOChronology13.weeks();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.toString();
        java.lang.String str26 = dateTimeZone23.getShortName(1L);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (byte) 0);
        int int30 = dateTimeZone23.getStandardOffset((long) (short) 0);
        java.lang.String str31 = dateTimeZone23.getID();
        long long34 = dateTimeZone23.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField36 = iSOChronology35.months();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology35.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology35.secondOfMinute();
        org.joda.time.DurationField durationField40 = iSOChronology35.weeks();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology35.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology35.dayOfYear();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology35.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology35.weekyear();
        boolean boolean45 = iSOChronology13.equals((java.lang.Object) iSOChronology35);
        org.joda.time.DurationField durationField46 = iSOChronology35.millis();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology35.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology35.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+52:00" + "'", str24, "+52:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+52:00" + "'", str26, "+52:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 187200000 + "'", int28 == 187200000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 187200000 + "'", int30 == 187200000);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+52:00" + "'", str31, "+52:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-187200000L) + "'", long34 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
    }

    @Test
    public void test19592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19592");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.millisOfDay();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.toString();
        java.lang.String str16 = dateTimeZone13.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        int int19 = dateTimeZone13.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField21 = iSOChronology20.minutes();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology20.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology20.minuteOfHour();
        boolean boolean24 = iSOChronology8.equals((java.lang.Object) iSOChronology20);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology20.millisOfSecond();
        org.joda.time.DurationField durationField26 = iSOChronology20.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = durationField26.getMillis(1000971931L, 1021282605L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+52:00" + "'", str14, "+52:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+52:00" + "'", str16, "+52:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 187200000 + "'", int19 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test19593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19593");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfCentury();
        long long22 = iSOChronology13.getDateTimeMillis(12, (int) (byte) 1, (int) (short) 10, 11);
        long long27 = iSOChronology13.getDateTimeMillis((int) (byte) 0, (int) (short) 1, 1, (int) ' ');
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.secondOfMinute();
        java.lang.String str29 = iSOChronology13.toString();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology13.hourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-61787937599989L) + "'", long22 == (-61787937599989L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-62167406399968L) + "'", long27 == (-62167406399968L));
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ISOChronology[+52:00]" + "'", str29, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test19594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19594");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.secondOfMinute();
        java.lang.String str14 = iSOChronology8.toString();
        org.joda.time.Chronology chronology15 = iSOChronology8.withUTC();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = iSOChronology8.get(readablePeriod16, 442108800000L, (-2313724212000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[+52:00]" + "'", str14, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test19595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19595");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField20 = iSOChronology13.hours();
        java.lang.String str21 = iSOChronology13.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology13.getZone();
        org.joda.time.DurationField durationField23 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.monthOfYear();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str27 = dateTimeZone26.toString();
        java.lang.String str29 = dateTimeZone26.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        int int32 = dateTimeZone26.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField34 = iSOChronology33.minutes();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology33.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology33.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology33.year();
        org.joda.time.DurationField durationField38 = iSOChronology33.seconds();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology33.halfdayOfDay();
        org.joda.time.DurationField durationField41 = iSOChronology33.weeks();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        org.joda.time.Chronology chronology44 = iSOChronology33.withZone(dateTimeZone43);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        java.lang.String str47 = dateTimeZone46.toString();
        java.lang.String str49 = dateTimeZone46.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone46);
        int int52 = dateTimeZone46.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology53 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone54 = iSOChronology53.getZone();
        org.joda.time.DateTimeField dateTimeField55 = iSOChronology53.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField56 = iSOChronology53.year();
        org.joda.time.DurationField durationField57 = iSOChronology53.minutes();
        org.joda.time.DateTimeField dateTimeField58 = iSOChronology53.era();
        org.joda.time.DateTimeZone dateTimeZone59 = iSOChronology53.getZone();
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        java.lang.String str62 = dateTimeZone61.toString();
        boolean boolean63 = dateTimeZone61.isFixed();
        org.joda.time.Chronology chronology64 = iSOChronology53.withZone(dateTimeZone61);
        boolean boolean66 = dateTimeZone61.isStandardOffset(0L);
        long long69 = dateTimeZone61.adjustOffset(187201439L, true);
        org.joda.time.Chronology chronology70 = iSOChronology33.withZone(dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forID("+00:00");
        int int74 = dateTimeZone72.getOffsetFromLocal((long) 10);
        java.lang.String str75 = dateTimeZone72.getID();
        org.joda.time.ReadableInstant readableInstant76 = null;
        int int77 = dateTimeZone72.getOffset(readableInstant76);
        long long81 = dateTimeZone72.convertLocalToUTC((-7043511686774400000L), false, 8445360100L);
        long long83 = dateTimeZone61.getMillisKeepLocal(dateTimeZone72, 1970L);
        java.lang.String str85 = dateTimeZone72.getNameKey(452003L);
        org.joda.time.Chronology chronology86 = iSOChronology13.withZone(dateTimeZone72);
        org.joda.time.DateTimeField dateTimeField87 = iSOChronology13.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ISOChronology[+52:00]" + "'", str21, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+52:00" + "'", str27, "+52:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+52:00" + "'", str29, "+52:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 187200000 + "'", int32 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+52:00" + "'", str47, "+52:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+52:00" + "'", str49, "+52:00");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 187200000 + "'", int52 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+52:00" + "'", str62, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 187201439L + "'", long69 == 187201439L);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "UTC" + "'", str75, "UTC");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-7043511686774400000L) + "'", long81 == (-7043511686774400000L));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 187201970L + "'", long83 == 187201970L);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "UTC" + "'", str85, "UTC");
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(dateTimeField87);
    }

    @Test
    public void test19596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19596");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology8.getZone();
        boolean boolean16 = dateTimeZone14.isStandardOffset((-21274847510399941L));
        int int18 = dateTimeZone14.getStandardOffset((-104400000L));
        long long20 = dateTimeZone14.previousTransition(3146400000L);
        java.lang.String str21 = dateTimeZone14.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 187200000 + "'", int18 == 187200000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3146400000L + "'", long20 == 3146400000L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+52:00" + "'", str21, "+52:00");
    }

    @Test
    public void test19597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19597");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.halfdayOfDay();
        org.joda.time.DurationField durationField12 = iSOChronology8.halfdays();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.toString();
        java.lang.String str17 = dateTimeZone14.getShortName(1L);
        int int19 = dateTimeZone14.getOffsetFromLocal((long) (byte) 0);
        int int21 = dateTimeZone14.getStandardOffset((long) (short) 0);
        java.lang.String str22 = dateTimeZone14.getID();
        long long25 = dateTimeZone14.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField27 = iSOChronology26.months();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology26.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology26.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology26.centuryOfEra();
        org.joda.time.DurationField durationField33 = iSOChronology26.weekyears();
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.lang.String str36 = dateTimeZone35.toString();
        java.lang.String str38 = dateTimeZone35.getShortName(1L);
        int int40 = dateTimeZone35.getOffsetFromLocal((long) (byte) 0);
        int int42 = dateTimeZone35.getStandardOffset((long) (short) 0);
        java.lang.String str43 = dateTimeZone35.getID();
        long long46 = dateTimeZone35.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology47 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone35);
        org.joda.time.DurationField durationField48 = iSOChronology47.months();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology47.secondOfDay();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology47.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField52 = iSOChronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField53 = iSOChronology47.halfdayOfDay();
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        java.lang.String str56 = dateTimeZone55.toString();
        java.lang.String str58 = dateTimeZone55.getShortName(1L);
        int int60 = dateTimeZone55.getOffsetFromLocal((long) (byte) 0);
        int int62 = dateTimeZone55.getStandardOffset((long) (short) 0);
        java.lang.String str63 = dateTimeZone55.getID();
        long long66 = dateTimeZone55.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology67 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone55);
        org.joda.time.DurationField durationField68 = iSOChronology67.months();
        org.joda.time.DateTimeZone dateTimeZone69 = iSOChronology67.getZone();
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        java.lang.String str72 = dateTimeZone71.toString();
        java.lang.String str74 = dateTimeZone71.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone71);
        int int77 = dateTimeZone71.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology78 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone71);
        org.joda.time.DurationField durationField79 = iSOChronology78.minutes();
        org.joda.time.DateTimeField dateTimeField80 = iSOChronology78.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField81 = iSOChronology78.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField82 = iSOChronology78.minuteOfDay();
        org.joda.time.DurationField durationField83 = iSOChronology78.seconds();
        org.joda.time.DurationField durationField84 = iSOChronology78.millis();
        boolean boolean85 = dateTimeZone69.equals((java.lang.Object) iSOChronology78);
        org.joda.time.Chronology chronology86 = iSOChronology47.withZone(dateTimeZone69);
        org.joda.time.Chronology chronology87 = iSOChronology26.withZone(dateTimeZone69);
        org.joda.time.Chronology chronology88 = iSOChronology8.withZone(dateTimeZone69);
        java.lang.String str89 = dateTimeZone69.toString();
        org.joda.time.chrono.ISOChronology iSOChronology90 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField91 = iSOChronology90.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField92 = iSOChronology90.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+52:00" + "'", str15, "+52:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:00" + "'", str17, "+52:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 187200000 + "'", int19 == 187200000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 187200000 + "'", int21 == 187200000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+52:00" + "'", str22, "+52:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-187200000L) + "'", long25 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+52:00" + "'", str36, "+52:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+52:00" + "'", str38, "+52:00");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 187200000 + "'", int40 == 187200000);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 187200000 + "'", int42 == 187200000);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+52:00" + "'", str43, "+52:00");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-187200000L) + "'", long46 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+52:00" + "'", str56, "+52:00");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+52:00" + "'", str58, "+52:00");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 187200000 + "'", int60 == 187200000);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 187200000 + "'", int62 == 187200000);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+52:00" + "'", str63, "+52:00");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-187200000L) + "'", long66 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology67);
        org.junit.Assert.assertNotNull(durationField68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+52:00" + "'", str72, "+52:00");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+52:00" + "'", str74, "+52:00");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 187200000 + "'", int77 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(durationField83);
        org.junit.Assert.assertNotNull(durationField84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "+52:00" + "'", str89, "+52:00");
        org.junit.Assert.assertNotNull(iSOChronology90);
        org.junit.Assert.assertNotNull(dateTimeField91);
        org.junit.Assert.assertNotNull(dateTimeField92);
    }

    @Test
    public void test19598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19598");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField12 = iSOChronology8.hours();
        org.joda.time.DurationField durationField13 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = iSOChronology8.getZone();
        org.joda.time.DurationField durationField16 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.year();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test19599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19599");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.era();
        org.joda.time.DurationField durationField21 = iSOChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test19600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19600");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology13.getZone();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str23 = dateTimeZone22.toString();
        java.lang.String str25 = dateTimeZone22.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        int int28 = dateTimeZone22.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone30 = iSOChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology29.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.year();
        org.joda.time.DurationField durationField33 = iSOChronology29.minutes();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.dayOfWeek();
        org.joda.time.DurationField durationField35 = iSOChronology29.years();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology29.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology29.clockhourOfHalfday();
        org.joda.time.DurationField durationField38 = iSOChronology29.millis();
        org.joda.time.DurationFieldType durationFieldType39 = durationField38.getType();
        boolean boolean40 = dateTimeZone20.equals((java.lang.Object) durationField38);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.lang.String str43 = dateTimeZone42.toString();
        java.lang.String str45 = dateTimeZone42.getShortName(1L);
        int int47 = dateTimeZone42.getOffsetFromLocal((long) (byte) 0);
        int int49 = dateTimeZone42.getStandardOffset((long) (short) 0);
        java.lang.String str50 = dateTimeZone42.getID();
        long long53 = dateTimeZone42.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology54 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone42);
        org.joda.time.DurationField durationField55 = iSOChronology54.months();
        org.joda.time.DateTimeField dateTimeField56 = iSOChronology54.secondOfDay();
        org.joda.time.DateTimeField dateTimeField57 = iSOChronology54.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField58 = iSOChronology54.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField59 = iSOChronology54.dayOfWeek();
        org.joda.time.DurationField durationField60 = iSOChronology54.millis();
        org.joda.time.DateTimeField dateTimeField61 = iSOChronology54.monthOfYear();
        boolean boolean62 = dateTimeZone20.equals((java.lang.Object) dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+52:00" + "'", str23, "+52:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+52:00" + "'", str25, "+52:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 187200000 + "'", int28 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+52:00" + "'", str43, "+52:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+52:00" + "'", str45, "+52:00");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 187200000 + "'", int47 == 187200000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 187200000 + "'", int49 == 187200000);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+52:00" + "'", str50, "+52:00");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-187200000L) + "'", long53 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test19601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19601");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.millisOfSecond();
        org.joda.time.DurationField durationField21 = iSOChronology13.weeks();
        long long25 = iSOChronology13.add(0L, 1930035L, (-333));
        org.joda.time.DurationField durationField26 = iSOChronology13.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = iSOChronology13.getDateTimeMillis(539963L, 246, 0, 2342, 34536);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 246 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-642701655L) + "'", long25 == (-642701655L));
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test19602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19602");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField20 = iSOChronology13.hours();
        java.lang.String str21 = iSOChronology13.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.yearOfCentury();
        long long26 = dateTimeField24.roundHalfFloor((-378691200000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ISOChronology[+52:00]" + "'", str21, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-378878400000L) + "'", long26 == (-378878400000L));
    }

    @Test
    public void test19603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19603");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.year();
        org.joda.time.DurationField durationField21 = iSOChronology13.minutes();
        org.joda.time.DurationField durationField22 = iSOChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField25 = iSOChronology13.years();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = iSOChronology13.getDateTimeMillis(148317695963476L, (-3660000), (-5819), 37076, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3660000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test19604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19604");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.hourOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology13.millis();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dateTimeField22.getAsShortText(readablePartial23, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test19605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19605");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.year();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.yearOfCentury();
        org.joda.time.DurationField durationField15 = iSOChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.dayOfWeek();
        java.lang.String str18 = dateTimeField16.getAsText(62156088120000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Monday" + "'", str18, "Monday");
    }

    @Test
    public void test19606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19606");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfCentury();
        long long22 = iSOChronology13.getDateTimeMillis(12, (int) (byte) 1, (int) (short) 10, 11);
        long long27 = iSOChronology13.getDateTimeMillis((int) (byte) 0, (int) (short) 1, 1, (int) ' ');
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology13.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long36 = iSOChronology13.getDateTimeMillis(4643854056000000L, (-3652), 360000000, 86401870, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3652 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-61787937599989L) + "'", long22 == (-61787937599989L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-62167406399968L) + "'", long27 == (-62167406399968L));
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test19607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19607");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DurationField durationField16 = iSOChronology13.weeks();
        org.joda.time.Chronology chronology17 = iSOChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.halfdayOfDay();
        long long24 = dateTimeField21.add((-535278L), 65);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2807464722L + "'", long24 == 2807464722L);
    }

    @Test
    public void test19608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19608");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.year();
        long long12 = dateTimeField10.roundFloor((long) (byte) 0);
        long long15 = dateTimeField10.addWrapField((-291600000L), (int) (short) -1);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeField10.getAsText(2664322502460000L, locale17);
        boolean boolean20 = dateTimeField10.isLeap((-186794456L));
        java.lang.String str21 = dateTimeField10.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-31827600000L) + "'", long15 == (-31827600000L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "86399" + "'", str18, "86399");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateTimeField[year]" + "'", str21, "DateTimeField[year]");
    }

    @Test
    public void test19609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19609");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.year();
        org.joda.time.DurationField durationField22 = iSOChronology13.hours();
        org.joda.time.DurationField durationField23 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test19610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19610");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = iSOChronology13.set(readablePartial25, (long) (-117133));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test19611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19611");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.yearOfCentury();
        org.joda.time.Chronology chronology16 = iSOChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test19612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19612");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField20 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.secondOfDay();
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = dateTimeField23.set((-6999L), "999054669", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999054669 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test19613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19613");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField22 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.clockhourOfDay();
        org.joda.time.Chronology chronology24 = iSOChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.centuryOfEra();
        org.joda.time.DurationField durationField26 = iSOChronology13.seconds();
        org.joda.time.DurationField durationField27 = iSOChronology13.seconds();
        org.joda.time.ReadablePartial readablePartial28 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long30 = iSOChronology13.set(readablePartial28, (-187199991L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test19614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19614");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.dayOfWeek();
        org.joda.time.DurationField durationField19 = iSOChronology13.millis();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.year();
        org.joda.time.DurationField durationField22 = iSOChronology13.weeks();
        java.lang.String str23 = iSOChronology13.toString();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeField24.getAsShortText(readablePartial25, 24, locale27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ISOChronology[+52:00]" + "'", str23, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "24" + "'", str28, "24");
    }

    @Test
    public void test19615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19615");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfCentury();
        long long23 = iSOChronology13.getDateTimeMillis(259200100L, 11, (int) (byte) 10, (int) (short) 10, (int) ' ');
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.era();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology13.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 285010032L + "'", long23 == 285010032L);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test19616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19616");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone15 = iSOChronology13.getZone();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.lang.String str18 = dateTimeZone17.toString();
        java.lang.String str20 = dateTimeZone17.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        int int23 = dateTimeZone17.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField25 = iSOChronology24.minutes();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology24.minuteOfDay();
        org.joda.time.DurationField durationField29 = iSOChronology24.seconds();
        org.joda.time.DurationField durationField30 = iSOChronology24.millis();
        boolean boolean31 = dateTimeZone15.equals((java.lang.Object) iSOChronology24);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology24.centuryOfEra();
        org.joda.time.DurationField durationField33 = iSOChronology24.minutes();
        org.joda.time.Chronology chronology34 = iSOChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology24.hourOfHalfday();
        long long37 = dateTimeField35.roundCeiling((-446280001L));
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeField35.getAsShortText(0, locale39);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+52:00" + "'", str18, "+52:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+52:00" + "'", str20, "+52:00");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 187200000 + "'", int23 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-442800000L) + "'", long37 == (-442800000L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
    }

    @Test
    public void test19617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19617");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.weekyearOfCentury();
        long long22 = iSOChronology13.add((long) (short) 100, 0L, 3);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test19618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19618");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.hourOfHalfday();
        org.joda.time.Chronology chronology13 = iSOChronology8.withUTC();
        org.joda.time.DurationField durationField14 = iSOChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = iSOChronology8.years();
        int int19 = durationField17.getValue((-62167467600037L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1970) + "'", int19 == (-1970));
    }

    @Test
    public void test19619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19619");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone24 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.era();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test19620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19620");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.hourOfHalfday();
        org.joda.time.DurationField durationField21 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.era();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test19621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19621");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField16 = iSOChronology13.days();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.dayOfWeek();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.minuteOfDay();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.toString();
        java.lang.String str27 = dateTimeZone24.getShortName(1L);
        int int29 = dateTimeZone24.getOffsetFromLocal((long) (byte) 0);
        int int31 = dateTimeZone24.getStandardOffset((long) (short) 0);
        java.lang.String str32 = dateTimeZone24.getID();
        long long35 = dateTimeZone24.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone37 = iSOChronology36.getZone();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology36.weekyear();
        java.lang.String str39 = iSOChronology36.toString();
        org.joda.time.DateTimeZone dateTimeZone40 = iSOChronology36.getZone();
        org.joda.time.Chronology chronology41 = iSOChronology13.withZone(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology13.era();
        org.joda.time.DurationField durationField43 = iSOChronology13.weeks();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+52:00" + "'", str25, "+52:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+52:00" + "'", str27, "+52:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 187200000 + "'", int29 == 187200000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 187200000 + "'", int31 == 187200000);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+52:00" + "'", str32, "+52:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-187200000L) + "'", long35 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ISOChronology[+52:00]" + "'", str39, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
    }

    @Test
    public void test19622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19622");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.year();
        org.joda.time.DurationField durationField21 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.secondOfDay();
        org.joda.time.DurationField durationField23 = iSOChronology13.millis();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test19623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19623");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField20 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.clockhourOfDay();
        int int25 = dateTimeField23.getLeapAmount((-262800998L));
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeField23.getAsText((-292275054), locale27);
        int int30 = dateTimeField23.get(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-292275054" + "'", str28, "-292275054");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test19624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19624");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField12 = iSOChronology8.years();
        org.joda.time.DurationField durationField13 = iSOChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.year();
        org.joda.time.DurationField durationField15 = iSOChronology8.millis();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.era();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField17.add((-187199987L), 3120000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test19625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19625");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.dayOfYear();
        long long17 = iSOChronology8.getDateTimeMillis(0L, (int) (short) 10, (int) (short) 0, 59, (int) '#');
        org.joda.time.DurationField durationField18 = iSOChronology8.days();
        long long19 = durationField18.getUnitMillis();
        java.lang.String str20 = durationField18.getName();
        long long22 = durationField18.getValueAsLong(2766964254473575805L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 21659035L + "'", long17 == 21659035L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 86400000L + "'", long19 == 86400000L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "days" + "'", str20, "days");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32025049241L + "'", long22 == 32025049241L);
    }

    @Test
    public void test19626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19626");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField18 = iSOChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.era();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test19627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19627");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = iSOChronology13.getZone();
        java.lang.String str18 = iSOChronology13.toString();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.era();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.weekyear();
        java.lang.String str24 = iSOChronology13.toString();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.yearOfCentury();
        java.util.Locale locale26 = null;
        int int27 = dateTimeField25.getMaximumShortTextLength(locale26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[+52:00]" + "'", str18, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ISOChronology[+52:00]" + "'", str24, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test19628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19628");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.dayOfWeek();
        org.joda.time.Chronology chronology22 = iSOChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.era();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.dayOfYear();
        org.joda.time.Chronology chronology26 = iSOChronology13.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test19629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19629");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.yearOfCentury();
        long long20 = iSOChronology13.add(97L, 36059035L, (int) '#');
        org.joda.time.DurationField durationField21 = iSOChronology13.hours();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.era();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str25 = dateTimeZone24.toString();
        java.lang.String str27 = dateTimeZone24.getShortName(1L);
        int int29 = dateTimeZone24.getOffsetFromLocal((long) (byte) 0);
        int int31 = dateTimeZone24.getStandardOffset((long) (short) 0);
        java.lang.String str32 = dateTimeZone24.getID();
        long long35 = dateTimeZone24.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField37 = iSOChronology36.months();
        org.joda.time.DurationField durationField38 = iSOChronology36.weeks();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.year();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology36.yearOfCentury();
        long long46 = iSOChronology36.getDateTimeMillis(259200100L, 11, (int) (byte) 10, (int) (short) 10, (int) ' ');
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology36.era();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology36.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone49 = iSOChronology36.getZone();
        org.joda.time.Chronology chronology50 = iSOChronology13.withZone(dateTimeZone49);
        org.joda.time.DurationField durationField51 = iSOChronology13.days();
        org.joda.time.DateTimeField dateTimeField52 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = iSOChronology13.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        long long57 = iSOChronology13.add(readablePeriod54, 727878993L, (-56031041));
        org.joda.time.DateTimeField dateTimeField58 = iSOChronology13.year();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1262066322L + "'", long20 == 1262066322L);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+52:00" + "'", str25, "+52:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+52:00" + "'", str27, "+52:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 187200000 + "'", int29 == 187200000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 187200000 + "'", int31 == 187200000);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+52:00" + "'", str32, "+52:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-187200000L) + "'", long35 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 285010032L + "'", long46 == 285010032L);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 727878993L + "'", long57 == 727878993L);
        org.junit.Assert.assertNotNull(dateTimeField58);
    }

    @Test
    public void test19630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19630");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField16 = dateTimeField15.getLeapDurationField();
        int int18 = dateTimeField15.getMinimumValue((long) (short) 0);
        java.lang.String str20 = dateTimeField15.getAsText(292278993L);
        java.lang.String str21 = dateTimeField15.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "11" + "'", str20, "11");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateTimeField[minuteOfHour]" + "'", str21, "DateTimeField[minuteOfHour]");
    }

    @Test
    public void test19631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19631");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test19632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19632");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(366);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-349203L), locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+366:00" + "'", str4, "+366:00");
    }

    @Test
    public void test19633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19633");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.monthOfYear();
        org.joda.time.DurationField durationField17 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.year();
        long long22 = iSOChronology13.add((-355938525L), (-18745561008L), 75224542);
        java.lang.String str23 = iSOChronology13.toString();
        org.joda.time.DurationField durationField24 = iSOChronology13.halfdays();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1410126241715796861L) + "'", long22 == (-1410126241715796861L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ISOChronology[+52:00]" + "'", str23, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test19634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19634");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone15 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = iSOChronology13.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test19635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19635");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.centuryOfEra();
        org.joda.time.DurationField durationField20 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.yearOfCentury();
        org.joda.time.DurationField durationField23 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test19636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19636");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = iSOChronology13.halfdays();
        java.lang.String str19 = iSOChronology13.toString();
        org.joda.time.DurationField durationField20 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.era();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 0);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str27 = dateTimeZone26.toString();
        java.lang.String str29 = dateTimeZone26.getShortName(1L);
        int int31 = dateTimeZone26.getOffsetFromLocal((long) (byte) 0);
        long long34 = dateTimeZone26.convertLocalToUTC(0L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        long long37 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, 0L);
        org.joda.time.Chronology chronology38 = iSOChronology13.withZone(dateTimeZone24);
        long long41 = dateTimeZone24.convertLocalToUTC((-3599999L), true);
        long long44 = dateTimeZone24.convertLocalToUTC(31337413353L, false);
        int int46 = dateTimeZone24.getOffsetFromLocal((-7043511686587171336L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[+52:00]" + "'", str19, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+52:00" + "'", str27, "+52:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+52:00" + "'", str29, "+52:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 187200000 + "'", int31 == 187200000);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-187200000L) + "'", long34 == (-187200000L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-190800000L) + "'", long37 == (-190800000L));
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 31341013353L + "'", long44 == 31341013353L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-3600000) + "'", int46 == (-3600000));
    }

    @Test
    public void test19637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19637");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.minuteOfHour();
        org.joda.time.DurationField durationField12 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.era();
        org.joda.time.DurationField durationField14 = iSOChronology8.weeks();
        long long18 = iSOChronology8.add(118200000L, (-187199993L), 59);
        org.joda.time.DurationField durationField19 = iSOChronology8.years();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology8.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10926599587L) + "'", long18 == (-10926599587L));
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test19638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19638");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField3 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test19639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19639");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.era();
        org.joda.time.DateTimeZone dateTimeZone11 = iSOChronology8.getZone();
        org.joda.time.DurationField durationField12 = iSOChronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.weekyearOfCentury();
        long long17 = iSOChronology8.add((-197882691771480965L), (long) 613, 31197);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-197882691752357204L) + "'", long17 == (-197882691752357204L));
    }

    @Test
    public void test19640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19640");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.Chronology chronology22 = iSOChronology13.withZone(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology13.getZone();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        int int27 = dateTimeZone23.getOffsetFromLocal(189302401872L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 187200000 + "'", int27 == 187200000);
    }

    @Test
    public void test19641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19641");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField20 = iSOChronology13.months();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str23 = dateTimeZone22.toString();
        java.lang.String str25 = dateTimeZone22.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        int int28 = dateTimeZone22.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField30 = iSOChronology29.minutes();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology29.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.minuteOfDay();
        org.joda.time.DurationField durationField34 = iSOChronology29.seconds();
        org.joda.time.DurationField durationField35 = iSOChronology29.millis();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology29.weekyear();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology29.era();
        org.joda.time.DurationField durationField38 = iSOChronology29.minutes();
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.lang.String str41 = dateTimeZone40.toString();
        java.lang.String str43 = dateTimeZone40.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        int int46 = dateTimeZone40.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology47 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone40);
        org.joda.time.DurationField durationField48 = iSOChronology47.minutes();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology47.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology47.minuteOfHour();
        org.joda.time.DurationField durationField51 = iSOChronology47.minutes();
        org.joda.time.DateTimeField dateTimeField52 = iSOChronology47.halfdayOfDay();
        org.joda.time.DurationField durationField53 = iSOChronology47.minutes();
        int int54 = durationField38.compareTo(durationField53);
        int int55 = durationField20.compareTo(durationField53);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+52:00" + "'", str23, "+52:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+52:00" + "'", str25, "+52:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 187200000 + "'", int28 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+52:00" + "'", str41, "+52:00");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+52:00" + "'", str43, "+52:00");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 187200000 + "'", int46 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test19642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19642");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = iSOChronology13.weeks();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology20 = iSOChronology13.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField21 = iSOChronology13.weeks();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.toString();
        java.lang.String str26 = dateTimeZone23.getShortName(1L);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (byte) 0);
        int int30 = dateTimeZone23.getStandardOffset((long) (short) 0);
        java.lang.String str31 = dateTimeZone23.getID();
        long long34 = dateTimeZone23.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField36 = iSOChronology35.months();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology35.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology35.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology35.minuteOfDay();
        org.joda.time.DurationField durationField41 = iSOChronology35.weekyears();
        org.joda.time.DurationField durationField42 = iSOChronology35.hours();
        org.joda.time.DurationField durationField43 = iSOChronology35.hours();
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        java.lang.String str46 = dateTimeZone45.toString();
        java.lang.String str48 = dateTimeZone45.getShortName(1L);
        int int50 = dateTimeZone45.getOffsetFromLocal((long) (byte) 0);
        int int52 = dateTimeZone45.getStandardOffset((long) (short) 0);
        java.lang.String str53 = dateTimeZone45.getID();
        long long56 = dateTimeZone45.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology57 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone45);
        org.joda.time.DurationField durationField58 = iSOChronology57.months();
        org.joda.time.DateTimeField dateTimeField59 = iSOChronology57.secondOfDay();
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology57.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField61 = iSOChronology57.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField62 = iSOChronology57.minuteOfDay();
        org.joda.time.DurationField durationField63 = iSOChronology57.weekyears();
        org.joda.time.DurationField durationField64 = iSOChronology57.hours();
        java.lang.String str65 = iSOChronology57.toString();
        org.joda.time.DateTimeZone dateTimeZone66 = iSOChronology57.getZone();
        org.joda.time.Chronology chronology67 = iSOChronology35.withZone(dateTimeZone66);
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        long long71 = dateTimeZone69.previousTransition((long) 'a');
        long long73 = dateTimeZone66.getMillisKeepLocal(dateTimeZone69, (long) (byte) 1);
        org.joda.time.Chronology chronology74 = iSOChronology13.withZone(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField75 = iSOChronology13.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+52:00" + "'", str24, "+52:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+52:00" + "'", str26, "+52:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 187200000 + "'", int28 == 187200000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 187200000 + "'", int30 == 187200000);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+52:00" + "'", str31, "+52:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-187200000L) + "'", long34 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+52:00" + "'", str46, "+52:00");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+52:00" + "'", str48, "+52:00");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 187200000 + "'", int50 == 187200000);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 187200000 + "'", int52 == 187200000);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+52:00" + "'", str53, "+52:00");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-187200000L) + "'", long56 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ISOChronology[+52:00]" + "'", str65, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 97L + "'", long71 == 97L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(dateTimeField75);
    }

    @Test
    public void test19643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19643");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 10);
        int int5 = dateTimeZone1.getOffset((long) 349200000);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        long long8 = dateTimeZone1.convertUTCToLocal(3155760000001L);
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.weekyear();
        java.util.Locale locale11 = null;
        int int12 = dateTimeField10.getMaximumTextLength(locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3155760000001L + "'", long8 == 3155760000001L);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test19644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19644");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DurationField durationField18 = iSOChronology13.hours();
        long long21 = durationField18.getDifferenceAsLong(261273600000000L, 864000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 72575760L + "'", long21 == 72575760L);
    }

    @Test
    public void test19645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19645");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.hourOfDay();
        java.lang.String str19 = iSOChronology13.toString();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone21 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.yearOfEra();
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dateTimeField24.getAsShortText(readablePartial25, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[+52:00]" + "'", str19, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test19646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19646");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-18));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test19647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19647");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.year();
        org.joda.time.DurationField durationField16 = iSOChronology13.days();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfYear();
        java.lang.String str18 = iSOChronology13.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[+52:00]" + "'", str18, "ISOChronology[+52:00]");
    }

    @Test
    public void test19648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19648");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DateTimeZone dateTimeZone16 = iSOChronology13.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = iSOChronology17.minutes();
        org.joda.time.DurationField durationField22 = iSOChronology17.hours();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = iSOChronology17.add(readablePeriod23, (-62025278391096L), 5462316);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology17.secondOfMinute();
        org.joda.time.DurationField durationField30 = iSOChronology17.days();
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.lang.String str33 = dateTimeZone32.toString();
        java.lang.String str35 = dateTimeZone32.getShortName(1L);
        int int37 = dateTimeZone32.getOffsetFromLocal((long) (byte) 0);
        int int39 = dateTimeZone32.getStandardOffset((long) (short) 0);
        java.lang.String str40 = dateTimeZone32.getID();
        java.lang.String str42 = dateTimeZone32.getNameKey((long) (byte) -1);
        java.util.TimeZone timeZone43 = dateTimeZone32.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        int int46 = dateTimeZone44.getOffsetFromLocal(52L);
        int int48 = dateTimeZone44.getStandardOffset(187200097L);
        long long50 = dateTimeZone32.getMillisKeepLocal(dateTimeZone44, 187199999L);
        org.joda.time.ReadableInstant readableInstant51 = null;
        int int52 = dateTimeZone32.getOffset(readableInstant51);
        org.joda.time.Chronology chronology53 = iSOChronology17.withZone(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-62025278391096L) + "'", long26 == (-62025278391096L));
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+52:00" + "'", str33, "+52:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+52:00" + "'", str35, "+52:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 187200000 + "'", int37 == 187200000);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 187200000 + "'", int39 == 187200000);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+52:00" + "'", str40, "+52:00");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 374399999L + "'", long50 == 374399999L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 187200000 + "'", int52 == 187200000);
        org.junit.Assert.assertNotNull(chronology53);
    }

    @Test
    public void test19649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19649");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DurationField durationField15 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.year();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfCentury();
        long long23 = iSOChronology13.getDateTimeMillis(259200100L, 11, (int) (byte) 10, (int) (short) 10, (int) ' ');
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology13.era();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology13.hourOfDay();
        org.joda.time.DurationField durationField31 = iSOChronology13.minutes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 285010032L + "'", long23 == 285010032L);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test19650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19650");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.dayOfYear();
        long long24 = dateTimeField22.roundHalfFloor(25249967395L);
        java.lang.String str26 = dateTimeField22.getAsText(25252564651200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 25214400000L + "'", long24 == 25214400000L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "338" + "'", str26, "338");
    }

    @Test
    public void test19651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19651");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = iSOChronology13.add(readablePeriod16, (long) (-297682553), 863999);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = iSOChronology13.get(readablePeriod22, (-4492799999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-297682553L) + "'", long19 == (-297682553L));
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test19652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19652");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.year();
        org.joda.time.DurationField durationField12 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.era();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology8.getZone();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.toString();
        boolean boolean18 = dateTimeZone16.isFixed();
        org.joda.time.Chronology chronology19 = iSOChronology8.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology8.weekyearOfCentury();
        java.lang.String str21 = iSOChronology8.toString();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology8.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField22.getType();
        int int24 = dateTimeField22.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 187200000 + "'", int7 == 187200000);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:00" + "'", str17, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ISOChronology[+52:00]" + "'", str21, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292278993 + "'", int24 == 292278993);
    }

    @Test
    public void test19653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19653");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.centuryOfEra();
        java.lang.String str19 = iSOChronology13.toString();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.year();
        java.util.Locale locale23 = null;
        int int24 = dateTimeField22.getMaximumTextLength(locale23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[+52:00]" + "'", str19, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test19654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19654");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfDay();
        org.joda.time.DurationField durationField19 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField20 = iSOChronology13.hours();
        java.lang.String str21 = iSOChronology13.toString();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology13.dayOfWeek();
        org.joda.time.DurationField durationField23 = iSOChronology13.months();
        org.joda.time.DurationField durationField24 = iSOChronology13.weeks();
        org.joda.time.DurationField durationField25 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology13.era();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology13.hourOfDay();
        org.joda.time.DurationField durationField29 = iSOChronology13.halfdays();
        org.joda.time.DurationField durationField30 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology13.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ISOChronology[+52:00]" + "'", str21, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test19655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19655");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(1L);
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (byte) 0);
        int int8 = dateTimeZone1.getStandardOffset((long) (short) 0);
        java.lang.String str9 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField14 = iSOChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone15 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = iSOChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.hourOfDay();
        int int21 = dateTimeField18.getDifference(90821120400052L, 349199977L);
        long long24 = dateTimeField18.add(0L, 1229);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+52:00" + "'", str2, "+52:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+52:00" + "'", str4, "+52:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 187200000 + "'", int6 == 187200000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 187200000 + "'", int8 == 187200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187200000L) + "'", long12 == (-187200000L));
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25227992 + "'", int21 == 25227992);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 4424400000L + "'", long24 == 4424400000L);
    }
}
