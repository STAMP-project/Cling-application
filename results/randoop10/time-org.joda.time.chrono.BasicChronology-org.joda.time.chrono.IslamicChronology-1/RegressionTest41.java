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
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        java.lang.String str4 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        int int10 = dateTimeZone6.getStandardOffset(10L);
        int int12 = dateTimeZone6.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType13);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long21 = dateTimeZone18.convertLocalToUTC((long) (short) 100, true);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone18.getName(14460100L, locale23);
        org.joda.time.Chronology chronology25 = islamicChronology15.withZone(dateTimeZone18);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        long long30 = dateTimeZone18.convertLocalToUTC(0L, true, 130260099L);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology31.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology31.dayOfYear();
        org.joda.time.DurationField durationField34 = islamicChronology31.minutes();
        org.joda.time.DurationField durationField35 = islamicChronology31.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology31.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology31.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology31.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology31.weekyear();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology31.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology31.millisOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType42 = islamicChronology31.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18, leapYearPatternType42);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology44.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology44.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone47 = islamicChronology44.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-35999900L) + "'", long21 == (-35999900L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(islamicChronology26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-36000000L) + "'", long30 == (-36000000L));
        org.junit.Assert.assertNotNull(islamicChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(leapYearPatternType42);
        org.junit.Assert.assertNotNull(islamicChronology43);
        org.junit.Assert.assertNotNull(islamicChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfHour();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType3 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = islamicChronology0.set(readablePartial4, 475260000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(leapYearPatternType3);
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int4 = dateTimeZone2.getStandardOffset((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        long long8 = dateTimeZone2.previousTransition((long) (-1));
        long long11 = dateTimeZone2.adjustOffset((-1L), false);
        java.lang.String str13 = dateTimeZone2.getName(32L);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone2.getShortName((-40936320000000L), locale16);
        long long19 = dateTimeZone2.convertUTCToLocal(4147199481610991L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4147199517610991L + "'", long19 == 4147199517610991L);
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfMonth();
        int int7 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone1.getShortName((-40761278759967L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+52:00" + "'", str5, "+52:00");
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 52L, (int) (short) 0);
        java.lang.String str10 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-1.0d));
        java.lang.String str16 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str19 = dateTimeZone18.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        int int22 = dateTimeZone18.getStandardOffset(10L);
        int int24 = dateTimeZone18.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18, leapYearPatternType25);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13, leapYearPatternType25);
        int int29 = dateTimeZone13.getStandardOffset(38100000L);
        int int31 = dateTimeZone13.getStandardOffset(3840000L);
        org.joda.time.Chronology chronology32 = islamicChronology0.withZone(dateTimeZone13);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IslamicChronology[UTC]" + "'", str10, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType25);
        org.junit.Assert.assertNotNull(islamicChronology26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        java.lang.Object obj8 = null;
        boolean boolean9 = islamicChronology0.equals(obj8);
        org.joda.time.DurationField durationField10 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray17 = new int[] { 10, 360600000, 240000 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial13, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 360600000, 240000]");
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getName((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.secondOfMinute();
        org.joda.time.DurationField durationField10 = islamicChronology8.halfdays();
        org.joda.time.Chronology chronology11 = islamicChronology8.withUTC();
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) islamicChronology8);
        java.lang.String str14 = dateTimeZone1.getShortName((-209400000L));
        long long17 = dateTimeZone1.adjustOffset(8678628000340L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.001" + "'", str14, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 8678628000340L + "'", long17 == 8678628000340L);
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        java.lang.String str7 = islamicChronology0.toString();
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.era();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[UTC]" + "'", str7, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField8 = islamicChronology7.weeks();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = islamicChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.year();
        org.joda.time.DurationField durationField12 = islamicChronology7.seconds();
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) islamicChronology7);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology7.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = islamicChronology7.get(readablePartial17, 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName(3600000001L, locale7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone11.isLocalDateTimeGap(localDateTime12);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone11.isLocalDateTimeGap(localDateTime14);
        long long18 = dateTimeZone11.adjustOffset(0L, true);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField20 = islamicChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology19.yearOfEra();
        org.joda.time.DurationField durationField22 = islamicChronology19.weekyears();
        org.joda.time.DurationField durationField23 = islamicChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology19.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology19.dayOfMonth();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType26 = islamicChronology19.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11, leapYearPatternType26);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType26);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology28.weekyear();
        org.joda.time.DurationField durationField30 = islamicChronology28.centuries();
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology31.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology31.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology31.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology31.year();
        long long42 = islamicChronology31.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology31.era();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType44 = islamicChronology31.getLeapYearPatternType();
        java.lang.String str45 = islamicChronology31.toString();
        boolean boolean46 = islamicChronology28.equals((java.lang.Object) islamicChronology31);
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology31.millisOfDay();
        org.joda.time.DurationField durationField48 = islamicChronology31.hours();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology31.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(leapYearPatternType26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertNotNull(islamicChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(islamicChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 14460100L + "'", long42 == 14460100L);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(leapYearPatternType44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "IslamicChronology[UTC]" + "'", str45, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.Chronology chronology7 = islamicChronology0.withZone(dateTimeZone5);
        int int9 = dateTimeZone5.getOffset(1L);
        long long12 = dateTimeZone5.adjustOffset((long) (short) 1, false);
        int int14 = dateTimeZone5.getStandardOffset(32L);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField16 = islamicChronology15.weeks();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology15.yearOfEra();
        org.joda.time.DurationField durationField18 = islamicChronology15.millis();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology15.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology15.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology15.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = islamicChronology15.getZone();
        long long24 = dateTimeZone5.getMillisKeepLocal(dateTimeZone22, (long) 4);
        long long27 = dateTimeZone5.adjustOffset(132L, false);
        java.lang.String str29 = dateTimeZone5.getNameKey((-4849448679L));
        java.lang.String str31 = dateTimeZone5.getNameKey(36000098L);
        java.lang.String str33 = dateTimeZone5.getShortName(0L);
        long long37 = dateTimeZone5.convertLocalToUTC(50460200L, false, 223238489L);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 4L + "'", long24 == 4L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 132L + "'", long27 == 132L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 50460200L + "'", long37 == 50460200L);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) (-1), (int) (short) 0);
        org.joda.time.DurationField durationField9 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfDay();
        org.joda.time.Chronology chronology11 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology11.get(readablePeriod12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (byte) 10);
        long long12 = dateTimeZone9.adjustOffset((-41571691199998L), false);
        org.joda.time.Chronology chronology13 = islamicChronology3.withZone(dateTimeZone9);
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology3.get(readablePartial14, (-2641919933L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-41571691199998L) + "'", long12 == (-41571691199998L));
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField11 = islamicChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfEra();
        org.joda.time.DurationField durationField13 = islamicChronology10.millis();
        boolean boolean15 = islamicChronology10.equals((java.lang.Object) 0.0f);
        org.joda.time.DurationField durationField16 = islamicChronology10.months();
        java.lang.String str17 = islamicChronology10.toString();
        org.joda.time.DurationField durationField18 = islamicChronology10.minutes();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology10.hourOfHalfday();
        org.joda.time.DurationField durationField21 = islamicChronology10.millis();
        org.joda.time.Chronology chronology22 = islamicChronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology10.monthOfYear();
        boolean boolean24 = islamicChronology0.equals((java.lang.Object) dateTimeField23);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IslamicChronology[UTC]" + "'", str17, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(leapYearPatternType25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(leapYearPatternType5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal((long) (short) 10);
        java.lang.String str6 = dateTimeZone2.getName((-41572051439999L));
        boolean boolean8 = dateTimeZone2.isStandardOffset(360241000L);
        long long12 = dateTimeZone2.convertLocalToUTC((-2641919933L), true, (-39489728639900L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2677919933L) + "'", long12 == (-2677919933L));
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        long long10 = islamicChronology0.getDateTimeMillis((int) ' ', 1, (int) (byte) 10, 4, (int) (short) 0, (int) (short) 0, 1);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.era();
        org.joda.time.Chronology chronology12 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial17 = null;
        int[] intArray20 = new int[] { '4', 240000 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial17, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-41571691199999L) + "'", long10 == (-41571691199999L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[52, 240000]");
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        long long7 = islamicChronology0.add((-518398999L), (long) 100, 100);
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField11 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField14 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-518388999L) + "'", long7 == (-518388999L));
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology0.getZone();
        java.lang.String str12 = dateTimeZone10.getName(3960240001L);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfMonth();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology8.getDateTimeMillis((-518389009L), (-3600000), 360060000, 187200000, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = islamicChronology0.add(readablePeriod12, 3840000L, (-3660000));
        org.joda.time.DurationField durationField16 = islamicChronology0.days();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3840000L + "'", long15 == 3840000L);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.millis();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePeriod11, (-1318478919119965L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 52L, (int) (short) 0);
        java.lang.String str10 = islamicChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology0.getZone();
        java.lang.String str13 = dateTimeZone11.getName(0L);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IslamicChronology[UTC]" + "'", str10, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.year();
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.era();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.Chronology chronology7 = islamicChronology0.withZone(dateTimeZone5);
        int int9 = dateTimeZone5.getOffset(1L);
        long long12 = dateTimeZone5.adjustOffset((long) (short) 1, false);
        int int14 = dateTimeZone5.getStandardOffset(32L);
        java.lang.String str15 = dateTimeZone5.toString();
        int int17 = dateTimeZone5.getStandardOffset((-8068989000L));
        int int19 = dateTimeZone5.getOffset(3600000L);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        java.lang.String str5 = dateTimeZone1.getName((long) 100);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) (-1), locale7);
        java.lang.String str9 = dateTimeZone1.toString();
        java.lang.String str11 = dateTimeZone1.getName((-518398998L));
        long long13 = dateTimeZone1.nextTransition(117527810716800035L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 117527810716800035L + "'", long13 == 117527810716800035L);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.weekyear();
        java.lang.String str15 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.monthOfYear();
        int int17 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField18 = islamicChronology0.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "IslamicChronology[UTC]" + "'", str15, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField11 = islamicChronology3.minutes();
        long long15 = islamicChronology3.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField16 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField19 = islamicChronology3.millis();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology3.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 36324000035L + "'", long15 == 36324000035L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.yearOfCentury();
        java.lang.String str11 = islamicChronology0.toString();
        java.lang.String str12 = islamicChronology0.toString();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IslamicChronology[UTC]" + "'", str11, "IslamicChronology[UTC]");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IslamicChronology[UTC]" + "'", str12, "IslamicChronology[UTC]");
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean11 = dateTimeZone9.equals((java.lang.Object) (-1.0d));
        int int13 = dateTimeZone9.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone9.isLocalDateTimeGap(localDateTime14);
        org.joda.time.Chronology chronology16 = islamicChronology0.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology19.yearOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology6.eras();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.toString();
        boolean boolean12 = dateTimeZone10.isFixed();
        java.lang.String str13 = dateTimeZone10.getID();
        org.joda.time.Chronology chronology14 = islamicChronology6.withZone(dateTimeZone10);
        org.joda.time.Chronology chronology15 = islamicChronology5.withZone(dateTimeZone10);
        long long17 = dateTimeZone10.previousTransition(35L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str20 = dateTimeZone19.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology21.yearOfEra();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType26 = islamicChronology21.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10, leapYearPatternType26);
        org.joda.time.Chronology chronology28 = islamicChronology0.withZone(dateTimeZone10);
        int int30 = dateTimeZone10.getOffset(50460200L);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(leapYearPatternType26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfDay();
        long long13 = islamicChronology0.add((-39839000L), (-457289707439889L), 0);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-39839000L) + "'", long13 == (-39839000L));
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField5 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfCentury();
        java.lang.String str7 = islamicChronology0.toString();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[UTC]" + "'", str7, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone15.getMillisKeepLocal(dateTimeZone16, (long) (byte) -1);
        org.joda.time.Chronology chronology19 = islamicChronology12.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology20 = islamicChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        java.lang.String str26 = dateTimeZone24.getShortName((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) (-1.0d));
        java.lang.String str32 = dateTimeZone29.getID();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str35 = dateTimeZone34.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        int int38 = dateTimeZone34.getStandardOffset(10L);
        int int40 = dateTimeZone34.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType41 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34, leapYearPatternType41);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29, leapYearPatternType41);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27, leapYearPatternType41);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24, leapYearPatternType41);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21, leapYearPatternType41);
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType41);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology48.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology48.dayOfYear();
        org.joda.time.DurationField durationField51 = islamicChronology48.minutes();
        org.joda.time.DateTimeZone dateTimeZone52 = islamicChronology48.getZone();
        org.joda.time.DateTimeZone dateTimeZone53 = islamicChronology48.getZone();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str56 = dateTimeZone55.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55);
        int int59 = dateTimeZone55.getStandardOffset(10L);
        int int61 = dateTimeZone55.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType62 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology63 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55, leapYearPatternType62);
        java.lang.String str65 = dateTimeZone55.getNameKey(32L);
        org.joda.time.Chronology chronology66 = islamicChronology48.withZone(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime67 = null;
        boolean boolean68 = dateTimeZone55.isLocalDateTimeGap(localDateTime67);
        long long70 = dateTimeZone55.previousTransition((long) (short) -1);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType71 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology72 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55, leapYearPatternType71);
        org.joda.time.chrono.IslamicChronology islamicChronology73 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType71);
        java.lang.String str75 = dateTimeZone16.getShortName(374700100L);
        java.util.TimeZone timeZone76 = dateTimeZone16.toTimeZone();
        org.joda.time.LocalDateTime localDateTime77 = null;
        boolean boolean78 = dateTimeZone16.isLocalDateTimeGap(localDateTime77);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+10:00" + "'", str26, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType41);
        org.junit.Assert.assertNotNull(islamicChronology42);
        org.junit.Assert.assertNotNull(islamicChronology43);
        org.junit.Assert.assertNotNull(islamicChronology44);
        org.junit.Assert.assertNotNull(islamicChronology45);
        org.junit.Assert.assertNotNull(islamicChronology46);
        org.junit.Assert.assertNotNull(islamicChronology47);
        org.junit.Assert.assertNotNull(islamicChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTC" + "'", str56, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType62);
        org.junit.Assert.assertNotNull(islamicChronology63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "UTC" + "'", str65, "UTC");
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertNotNull(leapYearPatternType71);
        org.junit.Assert.assertNotNull(islamicChronology72);
        org.junit.Assert.assertNotNull(islamicChronology73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "+00:00" + "'", str75, "+00:00");
        org.junit.Assert.assertNotNull(timeZone76);
        org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology14.getZone();
        org.joda.time.Chronology chronology18 = islamicChronology14.withUTC();
        boolean boolean19 = islamicChronology0.equals((java.lang.Object) islamicChronology14);
        org.joda.time.DurationField durationField20 = islamicChronology14.days();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = islamicChronology14.getDateTimeMillis(3840000, 3660000, 3660000, 100, 97, 0, (-3600000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField14 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField15 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField16 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14460100L + "'", long11 == 14460100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType11 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(leapYearPatternType11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.weekOfWeekyear();
        int int12 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = islamicChronology0.months();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod8, 324240100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = islamicChronology0.add(readablePeriod12, (-11224660197L), 360240000);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-11224660197L) + "'", long15 == (-11224660197L));
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        boolean boolean7 = islamicChronology0.equals((java.lang.Object) 1);
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePeriod10, 147000000L, 18660101L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis(187200000, 100, (-3660000), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        java.lang.String str4 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        int int10 = dateTimeZone6.getStandardOffset(10L);
        int int12 = dateTimeZone6.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType13);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long21 = dateTimeZone18.convertLocalToUTC((long) (short) 100, true);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone18.getName(14460100L, locale23);
        org.joda.time.Chronology chronology25 = islamicChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology15.year();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-35999900L) + "'", long21 == (-35999900L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        long long10 = dateTimeZone4.nextTransition(14460100L);
        boolean boolean11 = dateTimeZone4.isFixed();
        java.lang.String str12 = dateTimeZone4.getID();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 14460100L + "'", long10 == 14460100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod6, 77099110L, 360240000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        boolean boolean3 = dateTimeZone2.isFixed();
        long long6 = dateTimeZone2.adjustOffset((-84472104L), false);
        java.lang.String str8 = dateTimeZone2.getName((-57539900L));
        long long10 = dateTimeZone2.nextTransition(0L);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.toString();
        boolean boolean16 = dateTimeZone14.isFixed();
        org.joda.time.Chronology chronology17 = islamicChronology11.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology11.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = islamicChronology11.add(readablePeriod19, 3600000001L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology11.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology11.era();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology11.era();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType26 = islamicChronology11.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType26);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField29 = islamicChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology28.yearOfEra();
        org.joda.time.DurationField durationField31 = islamicChronology28.weekyears();
        org.joda.time.Chronology chronology32 = islamicChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology28.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology28.era();
        long long40 = islamicChronology28.add(129599648472L, 31878L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology28.millisOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType42 = islamicChronology28.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType42);
        long long45 = dateTimeZone2.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-84472104L) + "'", long6 == (-84472104L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+52:00" + "'", str8, "+52:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000001L + "'", long22 == 3600000001L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(leapYearPatternType26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertNotNull(islamicChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 129599616594L + "'", long40 == 129599616594L);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(leapYearPatternType42);
        org.junit.Assert.assertNotNull(islamicChronology43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 187203139L + "'", long9 == 187203139L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        long long10 = islamicChronology0.getDateTimeMillis((int) ' ', 1, (int) (byte) 10, 4, (int) (short) 0, (int) (short) 0, 1);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.secondOfDay();
        org.joda.time.Chronology chronology14 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-41571691199999L) + "'", long10 == (-41571691199999L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long8 = dateTimeZone5.getMillisKeepLocal(dateTimeZone6, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone6.getOffset(readableInstant9);
        long long12 = dateTimeZone6.convertUTCToLocal(14460100L);
        org.joda.time.Chronology chronology13 = islamicChronology0.withZone(dateTimeZone6);
        org.joda.time.DurationField durationField14 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField16 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField17 = islamicChronology0.centuries();
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = islamicChronology0.set(readablePartial18, 120901665L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 14460100L + "'", long12 == 14460100L);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }
}
