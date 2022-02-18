import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest45 {

    public static boolean debug = false;

    @Test
    public void test22501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22501");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName(0L, locale12);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, 359999900L, (int) (byte) 1);
        int int19 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
// flaky:         org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(copticChronology10);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.035" + "'", str13, "+00:00:00.035");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 359999900L + "'", long18 == 359999900L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test22502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22502");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.secondOfDay();
        int int10 = copticChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology8.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test22503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22503");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test22504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22504");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField15 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField17 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField20 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test22505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22505");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22506");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = copticChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.hours();
        org.joda.time.DurationField durationField8 = copticChronology5.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology5.clockhourOfHalfday();
        boolean boolean10 = copticChronology2.equals((java.lang.Object) copticChronology5);
        org.joda.time.DurationField durationField11 = copticChronology5.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test22507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22507");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        java.lang.String str13 = copticChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = copticChronology0.get(readablePeriod14, (long) 36000000, (-134700000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[UTC]" + "'", str13, "CopticChronology[UTC]");
    }

    @Test
    public void test22508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22508");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        java.lang.String str4 = dateTimeZone2.getNameKey((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset((long) 0);
        int int13 = dateTimeZone8.getOffset((long) (byte) 1);
        boolean boolean14 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        long long16 = dateTimeZone8.convertUTCToLocal((long) (short) -1);
        java.lang.String str17 = dateTimeZone8.toString();
        long long19 = dateTimeZone8.nextTransition((long) ' ');
        long long22 = dateTimeZone8.adjustOffset((-3599903L), false);
        java.lang.String str24 = dateTimeZone8.getShortName((-391794199L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 34L + "'", long16 == 34L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.035" + "'", str17, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3599903L) + "'", long22 == (-3599903L));
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.035" + "'", str24, "+00:00:00.035");
    }

    @Test
    public void test22509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22509");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.year();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.secondOfDay();
        org.joda.time.DurationField durationField20 = copticChronology12.weeks();
        org.joda.time.DurationField durationField21 = copticChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology12.minuteOfHour();
        org.joda.time.DurationField durationField23 = copticChronology12.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test22510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22510");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        long long13 = dateTimeZone11.nextTransition(3600001L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getName((-82799999L), locale15);
        java.util.TimeZone timeZone17 = dateTimeZone11.toTimeZone();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone11.isLocalDateTimeGap(localDateTime18);
        long long21 = dateTimeZone11.convertUTCToLocal(971L);
        java.lang.String str22 = dateTimeZone11.getID();
        long long26 = dateTimeZone11.convertLocalToUTC(254040987518102704L, false, (-359999910L));
        long long29 = dateTimeZone11.adjustOffset((-114839994600L), true);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600001L + "'", long13 == 3600001L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 971L + "'", long21 == 971L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 254040987518102704L + "'", long26 == 254040987518102704L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-114839994600L) + "'", long29 == (-114839994600L));
    }

    @Test
    public void test22511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22511");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.year();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getNameKey((long) 1);
        org.joda.time.Chronology chronology24 = copticChronology14.withZone(dateTimeZone20);
        long long27 = dateTimeZone20.convertLocalToUTC((long) 0, true);
        long long29 = dateTimeZone20.convertUTCToLocal((long) (short) -1);
        java.lang.String str30 = dateTimeZone20.getID();
        long long32 = dateTimeZone20.previousTransition((long) (short) -1);
        int int34 = dateTimeZone20.getOffsetFromLocal((-5L));
        org.joda.time.Chronology chronology35 = copticChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
// flaky:         org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(chronology24);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-35L) + "'", long27 == (-35L));
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 34L + "'", long29 == 34L);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.035" + "'", str30, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(chronology35);
    }

    @Test
    public void test22512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22512");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22513");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology0.getZone();
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test22514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22514");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology12.getZone();
        java.lang.String str20 = dateTimeZone18.getName(360000000L);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone18.isLocalDateTimeGap(localDateTime21);
        java.lang.String str24 = dateTimeZone18.getName((-8128799889L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
    }

    @Test
    public void test22515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22515");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.era();
        java.lang.String str12 = copticChronology0.toString();
        org.joda.time.DurationField durationField13 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[UTC]" + "'", str10, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[UTC]" + "'", str12, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test22516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22516");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.DurationField durationField11 = copticChronology9.years();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        boolean boolean14 = dateTimeZone12.isFixed();
        java.lang.String str15 = dateTimeZone12.getID();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12, 4);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology17.getZone();
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone19.getShortName((-809639981433L), locale22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone19.getShortName(149700000L, locale25);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.035" + "'", str15, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.035" + "'", str23, "+00:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.035" + "'", str26, "+00:00:00.035");
    }

    @Test
    public void test22517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22517");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test22518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22518");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = copticChronology0.add(readablePeriod5, 0L, 10);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test22519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22519");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[UTC]" + "'", str7, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22520");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test22521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22521");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[UTC]" + "'", str4, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test22522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22522");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        long long13 = copticChronology8.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.centuryOfEra();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.millis();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology20.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology20.getZone();
        org.joda.time.Chronology chronology27 = copticChronology17.withZone(dateTimeZone26);
        org.joda.time.Chronology chronology28 = copticChronology8.withZone(dateTimeZone26);
        java.lang.String str30 = dateTimeZone26.getName(360000099L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(copticChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
    }

    @Test
    public void test22523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22523");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology12.getZone();
        java.lang.String str20 = dateTimeZone18.getName((-105L));
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DurationField durationField23 = copticChronology21.years();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = copticChronology21.withZone(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone24.isLocalDateTimeGap(localDateTime26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone24.getName((long) (byte) -1, locale29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone24.getShortName((long) ' ', locale32);
        long long35 = dateTimeZone18.getMillisKeepLocal(dateTimeZone24, (-1692068644798805L));
        java.lang.String str37 = dateTimeZone24.getName((-129647495990966L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.035" + "'", str30, "+00:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.035" + "'", str33, "+00:00:00.035");
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1692068644798840L) + "'", long35 == (-1692068644798840L));
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.035" + "'", str37, "+00:00:00.035");
    }

    @Test
    public void test22524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22524");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = copticChronology0.add(readablePeriod5, (long) '4', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[UTC]" + "'", str10, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test22525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22525");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, 18909300000L, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, 210L, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 18909300000L + "'", long10 == 18909300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 210L + "'", long14 == 210L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test22526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22526");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology0.weeks();
        org.joda.time.DurationField durationField14 = copticChronology0.weeks();
        org.joda.time.DurationField durationField15 = copticChronology0.years();
        org.joda.time.DurationField durationField16 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test22527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22527");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField16 = copticChronology11.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology11.getZone();
        int int20 = dateTimeZone18.getOffset((-34L));
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone18);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone18.getShortName(2921667084344880000L, locale23);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
    }

    @Test
    public void test22528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22528");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[UTC]" + "'", str9, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test22529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22529");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test22530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22530");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test22531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22531");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[UTC]" + "'", str7, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test22532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22532");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test22533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22533");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = copticChronology0.get(readablePeriod7, (long) 52, 6814802238010398L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test22534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22534");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '4');
        long long7 = dateTimeZone1.nextTransition((long) '#');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) (short) 10, locale9);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.dayOfWeek();
        long long16 = copticChronology11.add(3210L, 36000035L, 10);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.year();
        org.joda.time.DurationField durationField20 = copticChronology17.hours();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = copticChronology22.seconds();
        org.joda.time.DurationField durationField24 = copticChronology22.years();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology26 = copticChronology22.withZone(dateTimeZone25);
        boolean boolean27 = dateTimeZone25.isFixed();
        java.lang.String str28 = dateTimeZone25.getID();
        org.joda.time.Chronology chronology29 = copticChronology17.withZone(dateTimeZone25);
        java.lang.String str30 = dateTimeZone25.getID();
        long long34 = dateTimeZone25.convertLocalToUTC((-1260001126L), false, 359999900L);
        org.joda.time.Chronology chronology35 = copticChronology11.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology11.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.035" + "'", str10, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 360003560L + "'", long16 == 360003560L);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.035" + "'", str28, "+00:00:00.035");
        org.junit.Assert.assertNotNull(chronology29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.035" + "'", str30, "+00:00:00.035");
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1260001161L) + "'", long34 == (-1260001161L));
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test22535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22535");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField12 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test22536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22536");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField14 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test22537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22537");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test22538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22538");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfEra();
        long long10 = copticChronology0.add(0L, (long) 1, 1);
        long long14 = copticChronology0.add((-8279999890L), (long) '4', 35);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-8279998070L) + "'", long14 == (-8279998070L));
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test22539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22539");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.minuteOfDay();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.secondOfMinute();
        org.joda.time.DurationField durationField11 = copticChronology8.halfdays();
        int int12 = copticChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.weekyearOfCentury();
        long long17 = copticChronology8.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology8.era();
        org.joda.time.Chronology chronology20 = copticChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology8.millisOfDay();
        boolean boolean22 = copticChronology0.equals((java.lang.Object) copticChronology8);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology8.weekyearOfCentury();
        java.lang.String str24 = copticChronology8.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) 0);
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, 189300000L);
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField32 = copticChronology31.seconds();
        org.joda.time.DurationField durationField33 = copticChronology31.years();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology35 = copticChronology31.withZone(dateTimeZone34);
        boolean boolean36 = dateTimeZone34.isFixed();
        java.lang.String str37 = dateTimeZone34.getID();
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone34, 4);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology39.hourOfHalfday();
        long long44 = copticChronology39.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology39.clockhourOfDay();
        org.joda.time.DurationField durationField46 = copticChronology39.weeks();
        boolean boolean47 = dateTimeZone25.equals((java.lang.Object) durationField46);
        org.joda.time.Chronology chronology48 = copticChronology8.withZone(dateTimeZone25);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CopticChronology[UTC]" + "'", str3, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 90L + "'", long17 == 90L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CopticChronology[UTC]" + "'", str24, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 153300000L + "'", long30 == 153300000L);
        org.junit.Assert.assertNotNull(copticChronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.035" + "'", str37, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 32L + "'", long44 == 32L);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(chronology48);
    }

    @Test
    public void test22540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22540");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test22541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22541");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField11 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test22542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22542");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test22543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22543");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test22544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22544");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 0L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField14 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.clockhourOfDay();
        org.joda.time.Chronology chronology19 = copticChronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.halfdayOfDay();
        boolean boolean22 = copticChronology0.equals((java.lang.Object) copticChronology17);
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology17.getZone();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology17.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = copticChronology17.get(readablePeriod25, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test22545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22545");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyear();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = chronology5.getDateTimeMillis((int) 'a', 360600000, 97, (-3840000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3840000 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test22546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22546");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22547");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test22548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22548");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test22549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22549");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 0, true);
        long long15 = dateTimeZone6.convertUTCToLocal((long) (short) -1);
        java.lang.String str16 = dateTimeZone6.getID();
        long long18 = dateTimeZone6.previousTransition((long) (short) -1);
        boolean boolean19 = dateTimeZone6.isFixed();
        java.lang.String str20 = dateTimeZone6.getID();
        boolean boolean21 = dateTimeZone6.isFixed();
        boolean boolean23 = dateTimeZone6.isStandardOffset((-6814802238010573L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
// flaky:         org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(chronology10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-35L) + "'", long13 == (-35L));
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 34L + "'", long15 == 34L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.035" + "'", str16, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.035" + "'", str20, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test22550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22550");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.era();
        org.joda.time.DurationField durationField15 = copticChronology0.months();
        org.joda.time.DurationField durationField16 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField20 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology21.year();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = copticChronology24.seconds();
        org.joda.time.DurationField durationField26 = copticChronology24.years();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology28 = copticChronology24.withZone(dateTimeZone27);
        java.lang.String str30 = dateTimeZone27.getNameKey((long) 1);
        org.joda.time.Chronology chronology31 = copticChronology21.withZone(dateTimeZone27);
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField33 = copticChronology32.seconds();
        org.joda.time.DurationField durationField34 = copticChronology32.years();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology36 = copticChronology32.withZone(dateTimeZone35);
        java.lang.String str38 = dateTimeZone35.getNameKey((long) 1);
        int int40 = dateTimeZone35.getStandardOffset((long) (short) 0);
        long long42 = dateTimeZone27.getMillisKeepLocal(dateTimeZone35, (long) (short) 10);
        long long46 = dateTimeZone35.convertLocalToUTC(32L, true, (long) (-1));
        long long49 = dateTimeZone35.convertLocalToUTC((long) (byte) 1, true);
        int int51 = dateTimeZone35.getOffsetFromLocal((long) (-1));
        org.joda.time.Chronology chronology52 = copticChronology0.withZone(dateTimeZone35);
        java.lang.String str54 = dateTimeZone35.getShortName(324000000L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
// flaky:         org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(copticChronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
// flaky:         org.junit.Assert.assertNull(str38);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-3L) + "'", long46 == (-3L));
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-34L) + "'", long49 == (-34L));
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
        org.junit.Assert.assertNotNull(chronology52);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00:00.035" + "'", str54, "+00:00:00.035");
    }

    @Test
    public void test22551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22551");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getName(356400097L, locale11);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test22552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22552");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        int int13 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.millisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.hours();
        org.joda.time.DurationField durationField20 = copticChronology17.minutes();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology17.getZone();
        long long23 = dateTimeZone21.nextTransition(5L);
        java.util.TimeZone timeZone24 = dateTimeZone21.toTimeZone();
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone21);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField27 = copticChronology26.seconds();
        org.joda.time.DurationField durationField28 = copticChronology26.years();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology30 = copticChronology26.withZone(dateTimeZone29);
        java.lang.String str32 = dateTimeZone29.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology33.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology33.monthOfYear();
        org.joda.time.DurationField durationField36 = copticChronology33.centuries();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology33.dayOfYear();
        org.joda.time.DurationField durationField38 = copticChronology33.days();
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField40 = copticChronology39.seconds();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = copticChronology39.add(readablePeriod41, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology39.clockhourOfHalfday();
        org.joda.time.DurationField durationField46 = copticChronology39.minutes();
        org.joda.time.DateTimeZone dateTimeZone47 = copticChronology39.getZone();
        int int49 = dateTimeZone47.getStandardOffset(97L);
        org.joda.time.Chronology chronology50 = copticChronology33.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology51 = copticChronology0.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField52 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5L + "'", long23 == 5L);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(copticChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
// flaky:         org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(copticChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(copticChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
    }

    @Test
    public void test22553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22553");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test22554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22554");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology11 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = copticChronology12.seconds();
        org.joda.time.DurationField durationField14 = copticChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology16 = copticChronology12.withZone(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getNameKey((long) 1);
        boolean boolean20 = dateTimeZone15.equals((java.lang.Object) (-1.0f));
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
// flaky:         org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test22555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22555");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(100L, false, 1L);
        long long12 = dateTimeZone6.nextTransition((long) 0);
        long long14 = dateTimeZone6.convertUTCToLocal(0L);
        long long16 = dateTimeZone6.convertUTCToLocal(100L);
        long long20 = dateTimeZone6.convertLocalToUTC((-1692068644798804L), false, 280800001L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1692068644798804L) + "'", long20 == (-1692068644798804L));
    }

    @Test
    public void test22556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22556");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = copticChronology4.seconds();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology4.add(readablePeriod6, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology4.add(readablePeriod10, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology4.getZone();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName(3600000L, locale17);
        java.lang.String str20 = dateTimeZone15.getName(3600000L);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DurationField durationField23 = copticChronology21.years();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = copticChronology21.withZone(dateTimeZone24);
        int int27 = dateTimeZone24.getOffset((long) 0);
        int int29 = dateTimeZone24.getOffset((long) (byte) 1);
        boolean boolean30 = dateTimeZone15.equals((java.lang.Object) dateTimeZone24);
        org.joda.time.Chronology chronology31 = copticChronology0.withZone(dateTimeZone15);
        java.util.TimeZone timeZone32 = dateTimeZone15.toTimeZone();
        java.util.TimeZone timeZone33 = dateTimeZone15.toTimeZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test22557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22557");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test22558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22558");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.millis();
        org.joda.time.DurationField durationField16 = copticChronology13.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.halfdayOfDay();
        boolean boolean18 = copticChronology0.equals((java.lang.Object) dateTimeField17);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Chronology chronology23 = copticChronology19.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.year();
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology19.getZone();
        long long29 = dateTimeZone25.convertLocalToUTC(100L, false, 1L);
        long long31 = dateTimeZone25.nextTransition((long) 0);
        long long33 = dateTimeZone25.convertUTCToLocal(0L);
        int int35 = dateTimeZone25.getOffset((long) '4');
        org.joda.time.Chronology chronology36 = copticChronology0.withZone(dateTimeZone25);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone25.getShortName(2L, locale38);
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone25.isLocalDateTimeGap(localDateTime40);
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test22559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22559");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test22560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22560");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test22561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22561");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getName((long) (byte) 1);
        java.lang.String str18 = dateTimeZone14.getID();
        java.lang.String str19 = dateTimeZone14.toString();
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField23 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[UTC]" + "'", str10, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.035" + "'", str17, "+00:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.035" + "'", str18, "+00:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.035" + "'", str19, "+00:00:00.035");
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test22562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22562");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = copticChronology0.getDateTimeMillis((int) (byte) 0, 363120000, 35, 115200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test22563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22563");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.joda.time.DurationField durationField14 = copticChronology0.centuries();
        org.joda.time.DurationField durationField15 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test22564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22564");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test22565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22565");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.hours();
        org.joda.time.DurationField durationField14 = copticChronology11.minutes();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology11.getZone();
        long long17 = dateTimeZone15.nextTransition(5L);
        int int19 = dateTimeZone15.getOffset(210L);
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone15);
        java.lang.String str22 = dateTimeZone15.getNameKey((-96L));
        long long25 = dateTimeZone15.adjustOffset((-5986796480L), false);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5L + "'", long17 == 5L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-5986796480L) + "'", long25 == (-5986796480L));
    }

    @Test
    public void test22566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22566");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test22567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22567");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = copticChronology7.seconds();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology11 = copticChronology7.withZone(dateTimeZone10);
        boolean boolean12 = dateTimeZone10.isFixed();
        java.lang.String str13 = dateTimeZone10.getID();
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.DurationField durationField17 = copticChronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getNameKey((long) 1);
        int int23 = dateTimeZone18.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int26 = dateTimeZone18.getOffset((long) (byte) 1);
        boolean boolean28 = dateTimeZone18.isStandardOffset(1L);
        long long32 = dateTimeZone18.convertLocalToUTC(1L, false, (long) (short) 1);
        long long34 = dateTimeZone18.convertUTCToLocal((long) 4);
        org.joda.time.Chronology chronology35 = copticChronology0.withZone(dateTimeZone18);
        long long39 = copticChronology0.add((long) (byte) -1, 0L, 100);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = copticChronology0.get(readablePeriod41, 1296000014399895L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.035" + "'", str13, "+00:00:00.035");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
// flaky:         org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-34L) + "'", long32 == (-34L));
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 39L + "'", long34 == 39L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test22568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22568");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test22569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22569");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test22570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22570");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, 18909300000L, 0);
        org.joda.time.DurationField durationField19 = copticChronology0.days();
        org.joda.time.DurationField durationField20 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology0.getZone();
        int int24 = dateTimeZone22.getOffset(9483605144L);
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 18909300000L + "'", long18 == 18909300000L);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test22571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22571");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.joda.time.DurationField durationField13 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test22572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22572");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        int int19 = dateTimeZone14.getStandardOffset((long) (short) 0);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone14, (long) (short) 10);
        long long25 = dateTimeZone14.convertLocalToUTC(32L, true, (long) (-1));
        long long28 = dateTimeZone14.convertLocalToUTC((long) (byte) 1, true);
        int int30 = dateTimeZone14.getOffsetFromLocal((long) (-1));
        java.util.TimeZone timeZone31 = dateTimeZone14.toTimeZone();
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = dateTimeZone14.isLocalDateTimeGap(localDateTime32);
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField35 = copticChronology34.seconds();
        org.joda.time.DurationField durationField36 = copticChronology34.minutes();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology34.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology34.weekOfWeekyear();
        org.joda.time.DurationField durationField39 = copticChronology34.weeks();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = copticChronology34.add(readablePeriod40, (long) (short) -1, 3600000);
        org.joda.time.DurationField durationField44 = copticChronology34.centuries();
        boolean boolean45 = dateTimeZone14.equals((java.lang.Object) durationField44);
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = dateTimeZone14.isLocalDateTimeGap(localDateTime46);
        int int49 = dateTimeZone14.getOffsetFromLocal((-384000001L));
        long long52 = dateTimeZone14.adjustOffset((-909299967L), true);
        java.util.TimeZone timeZone53 = dateTimeZone14.toTimeZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
// flaky:         org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
// flaky:         org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-3L) + "'", long25 == (-3L));
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-34L) + "'", long28 == (-34L));
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(timeZone31);
// flaky:         org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(copticChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-909299967L) + "'", long52 == (-909299967L));
        org.junit.Assert.assertNotNull(timeZone53);
// flaky:         org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test22573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22573");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        java.lang.String str13 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[UTC]" + "'", str13, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test22574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22574");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DurationField durationField11 = copticChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology8.days();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean20 = dateTimeZone19.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology22 = copticChronology8.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology23 = chronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology8);
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
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test22575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22575");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology0.getZone();
        java.lang.String str14 = dateTimeZone12.getNameKey(0L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone12.isLocalDateTimeGap(localDateTime15);
        long long19 = dateTimeZone12.adjustOffset(359999865L, true);
        java.lang.Class<?> wildcardClass20 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
// flaky:         org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 359999865L + "'", long19 == 359999865L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test22576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22576");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long11 = dateTimeZone9.nextTransition((long) 3600000);
        long long13 = dateTimeZone9.nextTransition((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone9.isLocalDateTimeGap(localDateTime14);
        long long18 = dateTimeZone9.convertLocalToUTC(5L, false);
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone9);
        org.joda.time.ReadablePartial readablePartial20 = null;
        int[] intArray21 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial20, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115199995L) + "'", long18 == (-115199995L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test22577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22577");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        long long9 = copticChronology0.add((-53184211200000L), (long) (-3600000), 0);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53184211200000L) + "'", long9 == (-53184211200000L));
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test22578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22578");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone6.getOffset(readableInstant7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName((long) (byte) 0, locale10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField13 = copticChronology12.hours();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test22579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22579");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = copticChronology0.getDateTimeMillis(681480185700004L, (int) (short) -1, (int) (short) -1, (int) (short) -1, 3600000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test22580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22580");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        java.lang.String str19 = dateTimeZone16.getNameKey((long) 1);
        boolean boolean21 = dateTimeZone16.equals((java.lang.Object) (-1.0f));
        int int23 = dateTimeZone16.getOffset((long) 100);
        org.joda.time.Chronology chronology24 = copticChronology11.withZone(dateTimeZone16);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.year();
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = copticChronology28.seconds();
        org.joda.time.DurationField durationField30 = copticChronology28.years();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology32 = copticChronology28.withZone(dateTimeZone31);
        java.lang.String str34 = dateTimeZone31.getNameKey((long) 1);
        org.joda.time.Chronology chronology35 = copticChronology25.withZone(dateTimeZone31);
        long long38 = dateTimeZone31.convertLocalToUTC((long) 0, true);
        long long40 = dateTimeZone31.convertUTCToLocal((long) (byte) 100);
        org.joda.time.Chronology chronology41 = copticChronology11.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology42 = copticChronology0.withZone(dateTimeZone31);
        org.joda.time.DurationField durationField43 = copticChronology0.months();
        org.joda.time.DurationField durationField44 = copticChronology0.hours();
        org.joda.time.DurationField durationField45 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
// flaky:         org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(copticChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(copticChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
// flaky:         org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(chronology35);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-35L) + "'", long38 == (-35L));
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 135L + "'", long40 == 135L);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
    }

    @Test
    public void test22581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22581");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = copticChronology0.get(readablePeriod7, (-10485534387L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test22582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22582");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test22583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22583");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        int int13 = dateTimeZone8.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.millisOfSecond();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        long long21 = copticChronology0.add((-53175981596593L), (-50059728000000L), (int) (short) -1);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3116253596593L) + "'", long21 == (-3116253596593L));
    }

    @Test
    public void test22584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22584");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test22585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22585");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getName((long) (byte) 1);
        java.lang.String str7 = dateTimeZone3.getID();
        long long9 = dateTimeZone3.convertUTCToLocal((long) 'a');
        boolean boolean11 = dateTimeZone3.isStandardOffset((-82799999L));
        long long14 = dateTimeZone3.convertLocalToUTC((long) (byte) 1, false);
        long long17 = dateTimeZone3.adjustOffset(324000000L, true);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.years();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology18.getZone();
        long long24 = dateTimeZone3.getMillisKeepLocal(dateTimeZone22, 3210L);
        java.lang.String str25 = dateTimeZone3.getID();
        int int27 = dateTimeZone3.getStandardOffset((-37919999L));
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone3.getShortName((-1567403986535399890L), locale29);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.035" + "'", str7, "+00:00:00.035");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 132L + "'", long9 == 132L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-34L) + "'", long14 == (-34L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 324000000L + "'", long17 == 324000000L);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3245L + "'", long24 == 3245L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.035" + "'", str25, "+00:00:00.035");
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.035" + "'", str30, "+00:00:00.035");
    }

    @Test
    public void test22586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22586");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology0.add(readablePeriod13, (long) (byte) 0, 35);
        org.joda.time.DurationField durationField17 = copticChronology0.hours();
        org.joda.time.Chronology chronology18 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test22587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22587");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test22588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22588");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test22589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22589");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test22590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22590");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology4.year();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology4.getZone();
        long long14 = dateTimeZone10.convertLocalToUTC(100L, false, 1L);
        java.lang.String str15 = dateTimeZone10.getID();
        int int17 = dateTimeZone10.getOffsetFromLocal((long) (short) 10);
        boolean boolean18 = dateTimeZone10.isFixed();
        int int20 = dateTimeZone10.getOffset(1L);
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone10);
        java.util.TimeZone timeZone22 = dateTimeZone10.toTimeZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test22591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22591");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField15 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField16 = copticChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = copticChronology0.getDateTimeMillis(360600000, 0, 363120000, (int) '#', (int) (byte) 1, 189300000, 97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test22592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22592");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        java.lang.String str15 = dateTimeZone11.getName((long) (short) 10);
        java.lang.String str17 = dateTimeZone11.getNameKey(360000099L);
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone11);
        long long22 = dateTimeZone11.convertLocalToUTC(3599995L, true, 189300004L);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        int int24 = copticChronology23.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.035" + "'", str15, "+00:00:00.035");
// flaky:         org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(chronology18);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3599960L + "'", long22 == 3599960L);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test22593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22593");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DurationField durationField4 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test22594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22594");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.year();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone13);
        long long20 = dateTimeZone13.convertLocalToUTC((long) 0, true);
        boolean boolean22 = dateTimeZone13.isStandardOffset((long) (short) 1);
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long27 = dateTimeZone13.adjustOffset(0L, false);
        boolean boolean29 = dateTimeZone13.isStandardOffset(39L);
        int int31 = dateTimeZone13.getOffsetFromLocal(6669748628121599975L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone13.getName((-41471971083300000L), locale33);
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
// flaky:         org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(chronology17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-35L) + "'", long20 == (-35L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.035" + "'", str34, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology35);
    }

    @Test
    public void test22595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22595");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        long long11 = copticChronology0.getDateTimeMillis(999L, 0, (int) (short) 0, 0, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField16 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test22596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22596");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField12 = copticChronology0.centuries();
        org.joda.time.DurationField durationField13 = copticChronology0.weeks();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField15 = copticChronology0.days();
        org.joda.time.DurationField durationField16 = copticChronology0.centuries();
        org.joda.time.DurationField durationField17 = copticChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test22597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22597");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(100L, false, 1L);
        java.lang.String str11 = dateTimeZone6.getID();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(copticChronology12);
    }

    @Test
    public void test22598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22598");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.year();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = copticChronology12.seconds();
        org.joda.time.DurationField durationField14 = copticChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology16 = copticChronology12.withZone(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getNameKey((long) 1);
        org.joda.time.Chronology chronology19 = copticChronology9.withZone(dateTimeZone15);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone23.getNameKey((long) 1);
        int int28 = dateTimeZone23.getStandardOffset((long) (short) 0);
        long long30 = dateTimeZone15.getMillisKeepLocal(dateTimeZone23, (long) (short) 10);
        java.lang.String str32 = dateTimeZone15.getName(359999999L);
        long long34 = dateTimeZone15.convertUTCToLocal((long) (byte) 0);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone15.getName(5L, locale36);
        java.util.TimeZone timeZone38 = dateTimeZone15.toTimeZone();
        org.joda.time.Chronology chronology39 = copticChronology8.withZone(dateTimeZone15);
        java.lang.String str40 = dateTimeZone15.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField43 = copticChronology42.seconds();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        long long47 = copticChronology42.add(readablePeriod44, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField48 = copticChronology42.millis();
        java.lang.String str49 = copticChronology42.toString();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology42.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology42.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology42.hourOfHalfday();
        boolean boolean53 = dateTimeZone15.equals((java.lang.Object) copticChronology42);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology42.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
// flaky:         org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(copticChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
// flaky:         org.junit.Assert.assertNull(str26);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.035" + "'", str32, "+00:00:00.035");
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.035" + "'", str37, "+00:00:00.035");
        org.junit.Assert.assertNotNull(timeZone38);
// flaky:         org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(chronology39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.035" + "'", str40, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "CopticChronology[UTC]" + "'", str49, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dateTimeField54);
    }

    @Test
    public void test22599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22599");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.year();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        org.joda.time.Chronology chronology18 = copticChronology8.withZone(dateTimeZone14);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.DurationField durationField21 = copticChronology19.years();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology23 = copticChronology19.withZone(dateTimeZone22);
        java.lang.String str25 = dateTimeZone22.getNameKey((long) 1);
        int int27 = dateTimeZone22.getStandardOffset((long) (short) 0);
        long long29 = dateTimeZone14.getMillisKeepLocal(dateTimeZone22, (long) (short) 10);
        long long33 = dateTimeZone22.convertLocalToUTC(32L, true, (long) (-1));
        long long36 = dateTimeZone22.convertLocalToUTC((long) (byte) 1, true);
        int int38 = dateTimeZone22.getOffsetFromLocal((long) (-1));
        java.util.TimeZone timeZone39 = dateTimeZone22.toTimeZone();
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone22.isLocalDateTimeGap(localDateTime40);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.Chronology chronology43 = copticChronology0.withZone(dateTimeZone22);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
// flaky:         org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
// flaky:         org.junit.Assert.assertNull(str25);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3L) + "'", long33 == (-3L));
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-34L) + "'", long36 == (-34L));
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(timeZone39);
// flaky:         org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(chronology43);
    }

    @Test
    public void test22600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22600");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        java.lang.String str8 = dateTimeZone7.getID();
        java.lang.String str10 = dateTimeZone7.getShortName((-384000101L));
        java.lang.String str12 = dateTimeZone7.getNameKey((-8639990190L));
        int int14 = dateTimeZone7.getOffsetFromLocal(549300000L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test22601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22601");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 360000100L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = copticChronology0.getDateTimeMillis(15L, 126060000, 126060000, 37920000, 363120000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 126060000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 360000100L + "'", long12 == 360000100L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test22602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22602");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField14 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test22603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22603");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = copticChronology0.set(readablePartial9, (-7665005743L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test22604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22604");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField16 = copticChronology11.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology11.getZone();
        int int20 = dateTimeZone18.getOffset((-34L));
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone18.getOffset(readableInstant22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone18.getShortName(36000011393L, locale25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone18.getShortName(6669748628135999975L, locale28);
        java.lang.String str31 = dateTimeZone18.getName(21636001972100L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test22605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22605");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DurationField durationField4 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test22606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22606");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test22607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22607");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test22608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22608");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        java.lang.String str15 = dateTimeZone13.getShortName((long) 4);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CopticChronology[UTC]" + "'", str11, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test22609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22609");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[UTC]" + "'", str5, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test22610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22610");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology9.getZone();
        java.lang.String str16 = dateTimeZone15.toString();
        int int18 = dateTimeZone15.getStandardOffset((-241L));
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology20 = chronology19.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test22611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22611");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test22612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22612");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        int int6 = dateTimeZone3.getOffset((long) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long10 = dateTimeZone3.adjustOffset((long) (short) 10, true);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone3.isLocalDateTimeGap(localDateTime11);
        boolean boolean13 = dateTimeZone3.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.util.TimeZone timeZone15 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone16 = dateTimeZone3.toTimeZone();
        int int18 = dateTimeZone3.getOffsetFromLocal(65L);
        long long21 = dateTimeZone3.convertLocalToUTC((-1257086471228385L), true);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1257086471228420L) + "'", long21 == (-1257086471228420L));
    }

    @Test
    public void test22613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22613");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        java.lang.String str6 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[UTC]" + "'", str6, "CopticChronology[UTC]");
    }

    @Test
    public void test22614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22614");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        int int12 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test22615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22615");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        long long13 = dateTimeZone10.convertLocalToUTC((-719999967L), true);
        java.lang.String str15 = dateTimeZone10.getName(1283039960400058L);
        int int17 = dateTimeZone10.getOffsetFromLocal(34320000L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-720000002L) + "'", long13 == (-720000002L));
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.035" + "'", str15, "+00:00:00.035");
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test22616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22616");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DurationField durationField11 = copticChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology8.days();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean20 = dateTimeZone19.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology22 = copticChronology8.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField23 = copticChronology8.centuries();
        long long27 = copticChronology8.add(360000032L, (-356399910L), (int) '#');
        org.joda.time.DurationField durationField28 = copticChronology8.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology8);
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
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-12113996818L) + "'", long27 == (-12113996818L));
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test22617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22617");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.minuteOfDay();
        java.lang.String str20 = copticChronology17.toString();
        org.joda.time.DurationField durationField21 = copticChronology17.halfdays();
        org.joda.time.DurationField durationField22 = copticChronology17.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CopticChronology[+00:00:00.035]" + "'", str20, "CopticChronology[+00:00:00.035]");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test22618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22618");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.centuryOfEra();
        org.joda.time.Chronology chronology18 = copticChronology7.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology20 = copticChronology19.withUTC();
        org.joda.time.DurationField durationField21 = copticChronology19.years();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = copticChronology19.add(readablePeriod22, (long) 1, (int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology26.year();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = copticChronology29.seconds();
        org.joda.time.DurationField durationField31 = copticChronology29.years();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology33 = copticChronology29.withZone(dateTimeZone32);
        java.lang.String str35 = dateTimeZone32.getNameKey((long) 1);
        org.joda.time.Chronology chronology36 = copticChronology26.withZone(dateTimeZone32);
        long long39 = dateTimeZone32.convertLocalToUTC((long) 0, true);
        long long41 = dateTimeZone32.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long45 = dateTimeZone32.getMillisKeepLocal(dateTimeZone43, (long) 100);
        org.joda.time.Chronology chronology46 = copticChronology19.withZone(dateTimeZone32);
        java.lang.String str48 = dateTimeZone32.getName(3600001L);
        org.joda.time.Chronology chronology49 = chronology18.withZone(dateTimeZone32);
        org.joda.time.chrono.CopticChronology copticChronology50 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone32);
        java.lang.String str52 = dateTimeZone32.getShortName(1938003320L);
        org.joda.time.chrono.CopticChronology copticChronology53 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone32);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(copticChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(copticChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(chronology33);
// flaky:         org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(chronology36);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-35L) + "'", long39 == (-35L));
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 34L + "'", long41 == 34L);
        org.junit.Assert.assertNotNull(dateTimeZone43);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 134L + "'", long45 == 134L);
        org.junit.Assert.assertNotNull(chronology46);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.035" + "'", str48, "+00:00:00.035");
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(copticChronology50);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00:00.035" + "'", str52, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology53);
    }

    @Test
    public void test22619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22619");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.052");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-1692068644798840L), locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.052" + "'", str6, "+00:00:00.052");
    }

    @Test
    public void test22620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22620");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology0.add(readablePeriod14, 3600011L, (int) (byte) -1);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3600011L + "'", long17 == 3600011L);
    }

    @Test
    public void test22621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22621");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 90L, 100);
        org.joda.time.DurationField durationField16 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField18 = copticChronology0.seconds();
        org.joda.time.DurationField durationField19 = copticChronology0.days();
        org.joda.time.DurationField durationField20 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 90L + "'", long15 == 90L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test22622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22622");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, (long) (short) 10, 4);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField17 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test22623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22623");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test22624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22624");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        long long13 = dateTimeZone11.nextTransition(3600001L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getName((-82799999L), locale15);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone21.isLocalDateTimeGap(localDateTime23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone21.getName((long) (byte) -1, locale26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone21.getShortName((long) ' ', locale29);
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = copticChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology31.year();
        org.joda.time.DateTimeZone dateTimeZone37 = copticChronology31.getZone();
        long long41 = dateTimeZone37.convertLocalToUTC(100L, false, 1L);
        java.lang.String str42 = dateTimeZone37.getID();
        long long46 = dateTimeZone37.convertLocalToUTC((long) (short) 0, false, 10L);
        long long48 = dateTimeZone21.getMillisKeepLocal(dateTimeZone37, 189300000L);
        org.joda.time.Chronology chronology49 = copticChronology17.withZone(dateTimeZone37);
        long long52 = dateTimeZone37.convertLocalToUTC(0L, false);
        java.lang.String str54 = dateTimeZone37.getShortName(36000099L);
        long long57 = dateTimeZone37.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600001L + "'", long13 == 3600001L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.035" + "'", str27, "+00:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.035" + "'", str30, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 189300035L + "'", long48 == 189300035L);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test22625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22625");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DurationField durationField10 = copticChronology8.months();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology8.getZone();
        int int13 = dateTimeZone11.getOffsetFromLocal(136511517120090L);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.millis();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.dayOfYear();
        boolean boolean18 = dateTimeZone11.equals((java.lang.Object) copticChronology14);
        java.lang.String str20 = dateTimeZone11.getNameKey((-359999981L));
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DurationField durationField23 = copticChronology21.millis();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology21.weekyearOfCentury();
        int int25 = copticChronology21.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology21.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology21.getZone();
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone27.isLocalDateTimeGap(localDateTime28);
        long long33 = dateTimeZone27.convertLocalToUTC(0L, false, 317830300430L);
        java.lang.String str35 = dateTimeZone27.getName(35835142517100235L);
        long long37 = dateTimeZone27.convertUTCToLocal((-5L));
        java.lang.String str39 = dateTimeZone27.getShortName(750620150L);
        long long41 = dateTimeZone11.getMillisKeepLocal(dateTimeZone27, (-39599968L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-5L) + "'", long37 == (-5L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-39599933L) + "'", long41 == (-39599933L));
    }

    @Test
    public void test22626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22626");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField15 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology0.add(readablePeriod18, (-360000031L), (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField23 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-360000031L) + "'", long21 == (-360000031L));
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test22627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22627");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.DurationField durationField11 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField13 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[UTC]" + "'", str8, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test22628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22628");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField14 = copticChronology0.months();
        java.lang.String str15 = copticChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology0.add(readablePeriod16, (-3840276L), (int) (byte) -1);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CopticChronology[UTC]" + "'", str15, "CopticChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3840276L) + "'", long19 == (-3840276L));
    }

    @Test
    public void test22629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22629");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.DurationField durationField21 = copticChronology19.millis();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology19.era();
        boolean boolean23 = copticChronology0.equals((java.lang.Object) dateTimeField22);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test22630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22630");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.DurationField durationField17 = copticChronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getNameKey((long) 1);
        int int23 = dateTimeZone18.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int26 = dateTimeZone18.getOffset((long) (byte) 1);
        boolean boolean28 = dateTimeZone18.isStandardOffset(1L);
        long long32 = dateTimeZone18.convertLocalToUTC(1L, false, (long) (short) 1);
        long long34 = dateTimeZone18.convertUTCToLocal(132L);
        org.joda.time.Chronology chronology35 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology0.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = copticChronology0.get(readablePartial37, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
// flaky:         org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-34L) + "'", long32 == (-34L));
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 167L + "'", long34 == 167L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test22631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22631");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology10.halfdays();
        org.joda.time.DurationField durationField14 = copticChronology10.months();
        org.joda.time.Chronology chronology15 = copticChronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology10.year();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology10.weekyearOfCentury();
        boolean boolean19 = copticChronology0.equals((java.lang.Object) dateTimeField18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test22632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22632");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(100L, false, 1L);
        int int12 = dateTimeZone6.getOffsetFromLocal((long) 10);
        long long14 = dateTimeZone6.nextTransition(97L);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology16.add(readablePeriod18, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = copticChronology16.add(readablePeriod22, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology16.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology16.getZone();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone27.getShortName(3600000L, locale29);
        java.lang.String str32 = dateTimeZone27.getName(3600000L);
        org.joda.time.Chronology chronology33 = copticChronology15.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology15.hourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField36 = copticChronology15.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
    }

    @Test
    public void test22633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22633");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 52);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test22634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22634");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22635");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfMonth();
        java.lang.Class<?> wildcardClass14 = copticChronology0.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test22636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22636");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test22637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22637");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.secondOfMinute();
        org.joda.time.DurationField durationField8 = copticChronology5.halfdays();
        org.joda.time.DurationField durationField9 = copticChronology5.months();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology5.weekyears();
        java.lang.Object obj12 = null;
        boolean boolean13 = copticChronology5.equals(obj12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology5.yearOfCentury();
        org.joda.time.Chronology chronology15 = copticChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology5.clockhourOfHalfday();
        boolean boolean17 = copticChronology0.equals((java.lang.Object) dateTimeField16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField19 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test22638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22638");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 0, true);
        boolean boolean15 = dateTimeZone6.isStandardOffset((long) (short) 1);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone6.getShortName(0L, locale17);
        long long21 = dateTimeZone6.adjustOffset((long) '#', true);
        java.lang.String str23 = dateTimeZone6.getShortName(0L);
        long long25 = dateTimeZone6.previousTransition(35999999864L);
        boolean boolean27 = dateTimeZone6.isStandardOffset(7238L);
        boolean boolean29 = dateTimeZone6.isStandardOffset(34L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
// flaky:         org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(chronology10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-35L) + "'", long13 == (-35L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.035" + "'", str18, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.035" + "'", str23, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35999999864L + "'", long25 == 35999999864L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test22639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22639");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.era();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test22640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22640");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.dayOfWeek();
        org.joda.time.DurationField durationField17 = copticChronology12.hours();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.yearOfCentury();
        org.joda.time.DurationField durationField20 = copticChronology12.months();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = copticChronology12.get(readablePeriod21, (-35834454485891100L), 5160961355270815533L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test22641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22641");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField13 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField14 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.era();
        org.joda.time.DurationField durationField19 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test22642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22642");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.year();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology9.getZone();
        long long19 = dateTimeZone15.convertLocalToUTC(100L, false, 1L);
        java.lang.String str20 = dateTimeZone15.getID();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone15.getOffset(readableInstant21);
        org.joda.time.Chronology chronology23 = copticChronology8.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology24 = copticChronology0.withZone(dateTimeZone15);
        long long28 = dateTimeZone15.convertLocalToUTC((-359999933L), true, (long) (short) -1);
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        long long31 = dateTimeZone15.nextTransition(2608775999997L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone15.getName((-12603608429L), locale33);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-359999933L) + "'", long28 == (-359999933L));
        org.junit.Assert.assertNotNull(copticChronology29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2608775999997L + "'", long31 == 2608775999997L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
    }

    @Test
    public void test22643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22643");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[UTC]" + "'", str6, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test22644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22644");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = copticChronology0.get(readablePeriod13, (-115200000L), (-3003544141164000003L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    }

    @Test
    public void test22645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22645");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = copticChronology0.get(readablePartial6, (-3600035L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test22646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22646");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfWeek();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = copticChronology0.getDateTimeMillis((-1), (int) ' ', 187200000, 6720000, 0, 10, (-4200000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6720000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test22647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22647");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.secondOfMinute();
        org.joda.time.DurationField durationField15 = copticChronology12.halfdays();
        int int16 = copticChronology12.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.weekyearOfCentury();
        long long21 = copticChronology12.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology12.year();
        org.joda.time.DurationField durationField23 = copticChronology12.years();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology24.year();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = copticChronology27.seconds();
        org.joda.time.DurationField durationField29 = copticChronology27.years();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology31 = copticChronology27.withZone(dateTimeZone30);
        java.lang.String str33 = dateTimeZone30.getNameKey((long) 1);
        org.joda.time.Chronology chronology34 = copticChronology24.withZone(dateTimeZone30);
        long long37 = dateTimeZone30.convertLocalToUTC((long) 0, true);
        boolean boolean39 = dateTimeZone30.isStandardOffset((long) (short) 1);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone30.getShortName(0L, locale41);
        java.lang.String str44 = dateTimeZone30.getNameKey((long) (short) -1);
        java.lang.String str46 = dateTimeZone30.getName(360000000L);
        org.joda.time.Chronology chronology47 = copticChronology12.withZone(dateTimeZone30);
        boolean boolean48 = dateTimeZone30.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30);
        boolean boolean50 = dateTimeZone30.isFixed();
        java.lang.String str52 = dateTimeZone30.getNameKey(0L);
        org.joda.time.Chronology chronology53 = copticChronology0.withZone(dateTimeZone30);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone30.getName(134L, locale55);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 90L + "'", long21 == 90L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
// flaky:         org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(chronology34);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-35L) + "'", long37 == (-35L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.035" + "'", str42, "+00:00:00.035");
// flaky:         org.junit.Assert.assertNull(str44);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.035" + "'", str46, "+00:00:00.035");
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(copticChronology49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
// flaky:         org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(chronology53);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.035" + "'", str56, "+00:00:00.035");
    }

    @Test
    public void test22648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22648");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfMinute();
        org.joda.time.DurationField durationField16 = copticChronology13.halfdays();
        org.joda.time.DurationField durationField17 = copticChronology13.months();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology13.year();
        java.lang.String str20 = copticChronology13.toString();
        org.joda.time.DurationField durationField21 = copticChronology13.days();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology13.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.secondOfMinute();
        org.joda.time.DurationField durationField28 = copticChronology25.halfdays();
        int int29 = copticChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField30 = copticChronology25.months();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology25.year();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology25.getZone();
        java.lang.String str33 = dateTimeZone32.toString();
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone32.isLocalDateTimeGap(localDateTime34);
        org.joda.time.Chronology chronology36 = copticChronology13.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology37 = copticChronology0.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField38 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField39 = copticChronology0.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CopticChronology[UTC]" + "'", str20, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(copticChronology25);
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
        org.junit.Assert.assertNotNull(durationField39);
    }

    @Test
    public void test22649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22649");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test22650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22650");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = copticChronology2.seconds();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = copticChronology2.add(readablePeriod4, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology2.add(readablePeriod8, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology2.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.year();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getNameKey((long) 1);
        org.joda.time.Chronology chronology24 = copticChronology14.withZone(dateTimeZone20);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = copticChronology25.seconds();
        org.joda.time.DurationField durationField27 = copticChronology25.years();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        java.lang.String str31 = dateTimeZone28.getNameKey((long) 1);
        int int33 = dateTimeZone28.getStandardOffset((long) (short) 0);
        long long35 = dateTimeZone20.getMillisKeepLocal(dateTimeZone28, (long) (short) 10);
        long long39 = dateTimeZone28.convertLocalToUTC(32L, true, (long) (-1));
        long long41 = dateTimeZone13.getMillisKeepLocal(dateTimeZone28, (long) (-1));
        java.lang.String str43 = dateTimeZone28.getName(35L);
        org.joda.time.Chronology chronology44 = copticChronology0.withZone(dateTimeZone28);
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
// flaky:         org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(copticChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(chronology29);
// flaky:         org.junit.Assert.assertNull(str31);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-3L) + "'", long39 == (-3L));
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-36L) + "'", long41 == (-36L));
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.035" + "'", str43, "+00:00:00.035");
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(copticChronology45);
    }

    @Test
    public void test22651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22651");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = copticChronology2.seconds();
        org.joda.time.DurationField durationField4 = copticChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology6 = copticChronology2.withZone(dateTimeZone5);
        java.lang.String str8 = dateTimeZone5.getNameKey((long) 1);
        boolean boolean10 = dateTimeZone5.equals((java.lang.Object) (-1.0f));
        int int12 = dateTimeZone5.getOffset((long) 100);
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology0.getZone();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone15.getName((-8639999890L), locale18);
        java.lang.String str20 = dateTimeZone15.toString();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        java.lang.String str23 = dateTimeZone15.getName((-8810827780L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(chronology6);
// flaky:         org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
    }

    @Test
    public void test22652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22652");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset(20L);
        long long11 = dateTimeZone7.nextTransition((-8279994870L));
        java.lang.String str13 = dateTimeZone7.getName(275010L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-8279994870L) + "'", long11 == (-8279994870L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test22653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22653");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField9 = copticChronology0.days();
        org.joda.time.DurationField durationField10 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test22654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22654");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test22655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22655");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology6.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology6.year();
        java.lang.String str13 = copticChronology6.toString();
        org.joda.time.DurationField durationField14 = copticChronology6.days();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology6.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology6.year();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology6.year();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology6.getZone();
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField21 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[UTC]" + "'", str13, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test22656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22656");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.minuteOfDay();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CopticChronology[UTC]" + "'", str3, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[UTC]" + "'", str6, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test22657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22657");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test22658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22658");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone3.isLocalDateTimeGap(localDateTime5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone3.getName((long) (byte) -1, locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone3.getShortName((long) ' ', locale11);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.year();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology13.getZone();
        long long23 = dateTimeZone19.convertLocalToUTC(100L, false, 1L);
        java.lang.String str24 = dateTimeZone19.getID();
        long long28 = dateTimeZone19.convertLocalToUTC((long) (short) 0, false, 10L);
        long long30 = dateTimeZone3.getMillisKeepLocal(dateTimeZone19, 189300000L);
        java.lang.String str32 = dateTimeZone19.getNameKey((long) '4');
        java.lang.String str33 = dateTimeZone19.getID();
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone19.getName(36359999999L, locale35);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.035" + "'", str9, "+00:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.035" + "'", str12, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 189300035L + "'", long30 == 189300035L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
    }

    @Test
    public void test22659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22659");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfYear();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology7.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.year();
        org.joda.time.DurationField durationField13 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology7.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology7.getZone();
        org.joda.time.Chronology chronology17 = copticChronology0.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField18 = copticChronology0.minutes();
        org.joda.time.Chronology chronology19 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test22660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22660");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        long long10 = copticChronology0.add((-359999989L), 1L, 3600000);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-356399989L) + "'", long10 == (-356399989L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22661");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 1, (int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.year();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone13);
        long long20 = dateTimeZone13.convertLocalToUTC((long) 0, true);
        long long22 = dateTimeZone13.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 100);
        org.joda.time.Chronology chronology27 = copticChronology0.withZone(dateTimeZone13);
        java.lang.String str29 = dateTimeZone13.getShortName((long) 4);
        java.lang.String str31 = dateTimeZone13.getShortName((-36110891429999900L));
        java.lang.String str33 = dateTimeZone13.getShortName((-363120001L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
// flaky:         org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(chronology17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-35L) + "'", long20 == (-35L));
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 34L + "'", long22 == 34L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 134L + "'", long26 == 134L);
        org.junit.Assert.assertNotNull(chronology27);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.035" + "'", str29, "+00:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.035" + "'", str31, "+00:00:00.035");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.035" + "'", str33, "+00:00:00.035");
    }

    @Test
    public void test22662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22662");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray16 = new int[] { 35, 60000, 360000000, 189300000, 4, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial9, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35, 60000, 360000000, 189300000, 4, 32]");
    }

    @Test
    public void test22663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22663");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[UTC]" + "'", str6, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test22664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22664");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        java.lang.String str4 = dateTimeZone2.getNameKey((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset((long) 0);
        int int13 = dateTimeZone8.getOffset((long) (byte) 1);
        boolean boolean14 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone8.getOffset(readableInstant15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone8.getShortName(1L, locale18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        int int22 = dateTimeZone8.getOffset((-1151999946L));
        int int24 = dateTimeZone8.getStandardOffset((-3599868L));
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone8.getOffset(readableInstant25);
        long long28 = dateTimeZone8.previousTransition(189300236L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.035" + "'", str19, "+00:00:00.035");
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 189300236L + "'", long28 == 189300236L);
    }

    @Test
    public void test22665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22665");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.era();
        org.joda.time.DurationField durationField15 = copticChronology0.months();
        org.joda.time.DurationField durationField16 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial24 = null;
        int[] intArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial24, intArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test22666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22666");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        long long18 = copticChronology0.add((-115084794599L), 33L, 60000);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115082814599L) + "'", long18 == (-115082814599L));
    }

    @Test
    public void test22667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22667");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[UTC]" + "'", str7, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CopticChronology[UTC]" + "'", str11, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test22668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22668");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField8 = chronology7.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test22669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22669");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long4 = dateTimeZone0.convertUTCToLocal((-100L));
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology5.era();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = copticChronology5.get(readablePartial10, (-82800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-65L) + "'", long4 == (-65L));
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test22670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22670");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        long long10 = copticChronology0.add(9843603210L, (long) 189300000, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 19687203210L + "'", long10 == 19687203210L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test22671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22671");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, (-359999989L), 1);
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DurationField durationField14 = copticChronology0.centuries();
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.centuryOfEra();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.millis();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology20.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology20.getZone();
        org.joda.time.Chronology chronology27 = copticChronology17.withZone(dateTimeZone26);
        int int29 = dateTimeZone26.getOffsetFromLocal((long) (byte) 100);
        java.util.TimeZone timeZone30 = dateTimeZone26.toTimeZone();
        org.joda.time.Chronology chronology31 = copticChronology0.withZone(dateTimeZone26);
        org.joda.time.Chronology chronology32 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-359999989L) + "'", long12 == (-359999989L));
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(copticChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test22672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22672");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        boolean boolean13 = dateTimeZone3.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone3.getOffset(readableInstant15);
        long long19 = dateTimeZone3.convertLocalToUTC((-719999968L), false);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-720000003L) + "'", long19 == (-720000003L));
    }

    @Test
    public void test22673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22673");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getShortName((long) ' ', locale11);
        long long14 = dateTimeZone9.previousTransition((long) (byte) 100);
        java.lang.String str16 = dateTimeZone9.getName(35999999899L);
        org.joda.time.Chronology chronology17 = copticChronology0.withZone(dateTimeZone9);
        boolean boolean19 = dateTimeZone9.isStandardOffset((-1449298881L));
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone9.getOffset(readableInstant20);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[UTC]" + "'", str8, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.035" + "'", str12, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.035" + "'", str16, "+00:00:00.035");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test22674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22674");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField12 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    }

    @Test
    public void test22675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22675");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.era();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology10.year();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology10.yearOfCentury();
        boolean boolean18 = copticChronology0.equals((java.lang.Object) dateTimeField17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = copticChronology0.add(readablePeriod19, (-1257121072800485L), (int) (short) 10);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1257121072800485L) + "'", long22 == (-1257121072800485L));
    }

    @Test
    public void test22676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22676");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test22677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22677");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology5.add(readablePeriod7, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology5.add(readablePeriod11, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology5.getZone();
        long long18 = dateTimeZone15.adjustOffset(10L, true);
        long long20 = dateTimeZone15.convertUTCToLocal(99L);
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField22 = copticChronology0.hours();
        org.joda.time.Chronology chronology23 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test22678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22678");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        java.lang.String str13 = dateTimeZone9.getName(189300099L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test22679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22679");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = copticChronology7.getDateTimeMillis((int) (short) 1, 35, 363120000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test22680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22680");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = copticChronology0.get(readablePartial13, (-115010694600L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    }

    @Test
    public void test22681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22681");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        java.lang.String str13 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[UTC]" + "'", str13, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test22682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22682");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test22683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22683");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        boolean boolean11 = dateTimeZone6.isFixed();
        java.lang.String str12 = dateTimeZone6.toString();
        java.lang.Object obj13 = null;
        boolean boolean14 = dateTimeZone6.equals(obj13);
        boolean boolean16 = dateTimeZone6.isStandardOffset((long) 35);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone6.getName((-414712180800138L), locale18);
        int int21 = dateTimeZone6.getStandardOffset((-244799968L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
// flaky:         org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.035" + "'", str12, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.035" + "'", str19, "+00:00:00.035");
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test22684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22684");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.millisOfSecond();
        org.joda.time.DurationField durationField13 = copticChronology10.seconds();
        org.joda.time.DurationField durationField14 = copticChronology10.months();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.monthOfYear();
        org.joda.time.DurationField durationField16 = copticChronology10.minutes();
        boolean boolean17 = copticChronology0.equals((java.lang.Object) copticChronology10);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test22685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22685");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test22686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22686");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePeriod9, 289439760803L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test22687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22687");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test22688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22688");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[UTC]" + "'", str5, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test22689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22689");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test22690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22690");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField18 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test22691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22691");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology1.getZone();
        long long11 = dateTimeZone7.convertLocalToUTC(100L, false, 1L);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone7);
        java.lang.String str16 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.year();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DurationField durationField23 = copticChronology21.years();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = copticChronology21.withZone(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getNameKey((long) 1);
        org.joda.time.Chronology chronology28 = copticChronology18.withZone(dateTimeZone24);
        long long31 = dateTimeZone24.convertLocalToUTC((long) 0, true);
        long long33 = dateTimeZone24.convertUTCToLocal((long) (short) -1);
        java.lang.String str34 = dateTimeZone24.getID();
        long long36 = dateTimeZone24.previousTransition((long) (short) -1);
        boolean boolean37 = dateTimeZone24.isFixed();
        int int39 = dateTimeZone24.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str41 = dateTimeZone24.getNameKey((-100L));
        org.joda.time.Chronology chronology42 = copticChronology0.withZone(dateTimeZone24);
        int int44 = dateTimeZone24.getOffset((long) (byte) 1);
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology45.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology45.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CopticChronology[UTC]" + "'", str16, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
// flaky:         org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(chronology28);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-35L) + "'", long31 == (-35L));
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 34L + "'", long33 == 34L);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.035" + "'", str34, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
// flaky:         org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(chronology42);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(copticChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
    }

    @Test
    public void test22692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22692");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DurationField durationField18 = copticChronology17.millis();
        java.lang.String str19 = copticChronology17.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology17.getZone();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = copticChronology17.get(readablePeriod22, 1260001225L, 396000599L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
// flaky:         org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(durationField18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CopticChronology[+00:00:00.035]" + "'", str19, "CopticChronology[+00:00:00.035]");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test22693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22693");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        long long12 = copticChronology0.add((long) 10, (long) '4', (-3600000));
        org.joda.time.Chronology chronology13 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField15 = copticChronology0.weeks();
        org.joda.time.DurationField durationField16 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField18 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    }

    @Test
    public void test22694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22694");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test22695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22695");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DurationField durationField11 = copticChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.minuteOfHour();
        org.joda.time.DurationField durationField18 = copticChronology8.hours();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology8.secondOfDay();
        org.joda.time.DurationField durationField21 = copticChronology8.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test22696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22696");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = copticChronology0.set(readablePartial11, (long) 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test22697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22697");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfHour();
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology13 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test22698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22698");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test22699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22699");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test22700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22700");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(100L, false, 1L);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.year();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology11.getZone();
        long long21 = dateTimeZone17.convertLocalToUTC(100L, false, 1L);
        java.lang.String str22 = dateTimeZone17.getID();
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone17.getOffset(readableInstant23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        java.lang.String str27 = dateTimeZone17.getName(35L);
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology28.secondOfMinute();
        org.joda.time.DurationField durationField31 = copticChronology28.halfdays();
        int int32 = copticChronology28.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology28.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = copticChronology28.getZone();
        long long36 = dateTimeZone17.getMillisKeepLocal(dateTimeZone34, (long) 4);
        long long38 = dateTimeZone17.nextTransition(360000971L);
        long long40 = dateTimeZone6.getMillisKeepLocal(dateTimeZone17, 4L);
        long long43 = dateTimeZone17.convertLocalToUTC((long) (-1), false);
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology45.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology45.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.Chronology chronology49 = copticChronology45.withZone(dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology45.year();
        org.joda.time.DateTimeZone dateTimeZone51 = copticChronology45.getZone();
        long long55 = dateTimeZone51.convertLocalToUTC(100L, false, 1L);
        java.lang.String str56 = dateTimeZone51.getID();
        org.joda.time.ReadableInstant readableInstant57 = null;
        int int58 = dateTimeZone51.getOffset(readableInstant57);
        org.joda.time.Chronology chronology59 = copticChronology44.withZone(dateTimeZone51);
        java.lang.String str60 = copticChronology44.toString();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology44.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology62 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField63 = copticChronology62.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField64 = copticChronology62.year();
        org.joda.time.chrono.CopticChronology copticChronology65 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField66 = copticChronology65.seconds();
        org.joda.time.DurationField durationField67 = copticChronology65.years();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology69 = copticChronology65.withZone(dateTimeZone68);
        java.lang.String str71 = dateTimeZone68.getNameKey((long) 1);
        org.joda.time.Chronology chronology72 = copticChronology62.withZone(dateTimeZone68);
        long long75 = dateTimeZone68.convertLocalToUTC((long) 0, true);
        long long77 = dateTimeZone68.convertUTCToLocal((long) (short) -1);
        java.lang.String str78 = dateTimeZone68.getID();
        long long80 = dateTimeZone68.previousTransition((long) (short) -1);
        boolean boolean81 = dateTimeZone68.isFixed();
        int int83 = dateTimeZone68.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str85 = dateTimeZone68.getNameKey((-100L));
        org.joda.time.Chronology chronology86 = copticChronology44.withZone(dateTimeZone68);
        boolean boolean87 = dateTimeZone17.equals((java.lang.Object) copticChronology44);
        org.joda.time.DateTimeField dateTimeField88 = copticChronology44.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField89 = copticChronology44.yearOfCentury();
        org.joda.time.DurationField durationField90 = copticChronology44.hours();
        org.joda.time.DateTimeField dateTimeField91 = copticChronology44.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 4L + "'", long36 == 4L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 360000971L + "'", long38 == 360000971L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 4L + "'", long40 == 4L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology44);
        org.junit.Assert.assertNotNull(copticChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 100L + "'", long55 == 100L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTC" + "'", str56, "UTC");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "CopticChronology[UTC]" + "'", str60, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(copticChronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(copticChronology65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "UTC" + "'", str71, "UTC");
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "UTC" + "'", str78, "UTC");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-1L) + "'", long80 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "UTC" + "'", str85, "UTC");
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(dateTimeField88);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertNotNull(durationField90);
        org.junit.Assert.assertNotNull(dateTimeField91);
    }

    @Test
    public void test22701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22701");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField16 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology18 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test22702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22702");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 0L, (int) (short) -1);
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField15 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyear();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField18 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test22703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22703");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.secondOfMinute();
        org.joda.time.DurationField durationField15 = copticChronology12.halfdays();
        int int16 = copticChronology12.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.weekyearOfCentury();
        long long21 = copticChronology12.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology12.year();
        org.joda.time.DurationField durationField23 = copticChronology12.years();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology24.year();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = copticChronology27.seconds();
        org.joda.time.DurationField durationField29 = copticChronology27.years();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology31 = copticChronology27.withZone(dateTimeZone30);
        java.lang.String str33 = dateTimeZone30.getNameKey((long) 1);
        org.joda.time.Chronology chronology34 = copticChronology24.withZone(dateTimeZone30);
        long long37 = dateTimeZone30.convertLocalToUTC((long) 0, true);
        boolean boolean39 = dateTimeZone30.isStandardOffset((long) (short) 1);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone30.getShortName(0L, locale41);
        java.lang.String str44 = dateTimeZone30.getNameKey((long) (short) -1);
        java.lang.String str46 = dateTimeZone30.getName(360000000L);
        org.joda.time.Chronology chronology47 = copticChronology12.withZone(dateTimeZone30);
        boolean boolean48 = dateTimeZone30.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30);
        boolean boolean50 = dateTimeZone30.isFixed();
        java.lang.String str52 = dateTimeZone30.getNameKey(0L);
        org.joda.time.Chronology chronology53 = copticChronology0.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 90L + "'", long21 == 90L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(copticChronology49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTC" + "'", str52, "UTC");
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
    }

    @Test
    public void test22704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22704");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.era();
        org.joda.time.DurationField durationField15 = copticChronology0.months();
        org.joda.time.DurationField durationField16 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField20 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField22 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test22705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22705");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        int int13 = dateTimeZone8.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = copticChronology0.weeks();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test22706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22706");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology9.add(readablePeriod11, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.weekyear();
        org.joda.time.DurationField durationField17 = copticChronology9.seconds();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology9.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.year();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = copticChronology22.seconds();
        org.joda.time.DurationField durationField24 = copticChronology22.years();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology26 = copticChronology22.withZone(dateTimeZone25);
        java.lang.String str28 = dateTimeZone25.getNameKey((long) 1);
        org.joda.time.Chronology chronology29 = copticChronology19.withZone(dateTimeZone25);
        long long32 = dateTimeZone25.convertLocalToUTC((long) 0, true);
        long long34 = dateTimeZone25.convertUTCToLocal((long) (short) -1);
        java.lang.String str35 = dateTimeZone25.getID();
        long long37 = dateTimeZone25.previousTransition((long) (short) -1);
        boolean boolean38 = dateTimeZone25.isFixed();
        int int40 = dateTimeZone25.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str42 = dateTimeZone25.getNameKey((-100L));
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = dateTimeZone25.getOffset(readableInstant43);
        long long46 = dateTimeZone25.nextTransition((-356399996L));
        long long48 = dateTimeZone25.previousTransition(97L);
        org.joda.time.Chronology chronology49 = copticChronology9.withZone(dateTimeZone25);
        org.joda.time.Chronology chronology50 = copticChronology0.withZone(dateTimeZone25);
        int int52 = dateTimeZone25.getOffsetFromLocal(156240004L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-356399996L) + "'", long46 == (-356399996L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 97L + "'", long48 == 97L);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test22707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22707");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField12 = copticChronology0.centuries();
        org.joda.time.DurationField durationField13 = copticChronology0.weeks();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField15 = copticChronology0.days();
        org.joda.time.DurationField durationField16 = copticChronology0.centuries();
        org.joda.time.DurationField durationField17 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test22708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22708");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test22709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22709");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 0L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField14 = copticChronology0.weeks();
        org.joda.time.Chronology chronology15 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyear();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.secondOfMinute();
        org.joda.time.DurationField durationField20 = copticChronology17.halfdays();
        int int21 = copticChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField22 = copticChronology17.months();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology17.year();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology17.getZone();
        java.lang.String str25 = dateTimeZone24.toString();
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone24.isLocalDateTimeGap(localDateTime26);
        long long31 = dateTimeZone24.convertLocalToUTC((-37920000L), true, (-14396759L));
        org.joda.time.Chronology chronology32 = copticChronology0.withZone(dateTimeZone24);
        long long36 = copticChronology0.add((-169206900479880500L), (-1692068317198809L), (int) (byte) 0);
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(copticChronology17);
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
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-169206900479880500L) + "'", long36 == (-169206900479880500L));
    }

    @Test
    public void test22710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22710");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName(3600000L, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone11.getName((-359999968L), locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone11.getName((-8636399890L), locale19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone11.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test22711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22711");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.convertLocalToUTC(0L, false);
        java.lang.String str6 = dateTimeZone1.getNameKey(99L);
        java.lang.String str8 = dateTimeZone1.getShortName(97L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((-2186809391339995L), locale12);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        java.lang.String str15 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-100L) + "'", long4 == (-100L));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
    }

    @Test
    public void test22712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22712");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        long long10 = copticChronology0.getDateTimeMillis((long) (byte) -1, 1, 0, (int) (short) 0, 1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DurationField durationField15 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-82799999L) + "'", long10 == (-82799999L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test22713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22713");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test22714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22714");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone13.getOffset(readableInstant15);
        long long20 = dateTimeZone13.convertLocalToUTC((-125861988935L), false, 254040987158102704L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-125861988935L) + "'", long20 == (-125861988935L));
    }

    @Test
    public void test22715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22715");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology5.getZone();
        java.lang.String str9 = dateTimeZone7.getNameKey((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        int int16 = dateTimeZone13.getOffset((long) 0);
        int int18 = dateTimeZone13.getOffset((long) (byte) 1);
        boolean boolean19 = dateTimeZone7.equals((java.lang.Object) dateTimeZone13);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone13.getOffset(readableInstant20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone13.getShortName(1L, locale23);
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology26.secondOfMinute();
        org.joda.time.DurationField durationField29 = copticChronology26.weeks();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology26.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology26.getZone();
        org.joda.time.DurationField durationField32 = copticChronology26.months();
        org.joda.time.DateTimeZone dateTimeZone33 = copticChronology26.getZone();
        org.joda.time.Chronology chronology34 = copticChronology0.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField35 = chronology34.centuries();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(copticChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test22716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22716");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology0.getZone();
        java.lang.String str16 = dateTimeZone14.getShortName((-1L));
        boolean boolean17 = dateTimeZone14.isFixed();
        java.lang.String str18 = dateTimeZone14.toString();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone14.isLocalDateTimeGap(localDateTime20);
        java.lang.String str22 = dateTimeZone14.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test22717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22717");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 0, true);
        long long15 = dateTimeZone6.convertUTCToLocal((long) (short) -1);
        java.lang.String str16 = dateTimeZone6.getID();
        boolean boolean18 = dateTimeZone6.isStandardOffset((long) (short) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        java.lang.String str20 = dateTimeZone6.toString();
        long long23 = dateTimeZone6.adjustOffset(6669748628135999975L, false);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone6.getShortName((-9850803220L), locale26);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 6669748628135999975L + "'", long23 == 6669748628135999975L);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
    }

    @Test
    public void test22718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22718");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 0L, (int) ' ');
        org.joda.time.DurationField durationField16 = copticChronology0.centuries();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = copticChronology17.add(readablePeriod19, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology17.add(readablePeriod23, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology17.clockhourOfDay();
        org.joda.time.DurationField durationField28 = copticChronology17.days();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology17.hourOfDay();
        boolean boolean30 = copticChronology0.equals((java.lang.Object) copticChronology17);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test22719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22719");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test22720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22720");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test22721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22721");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = copticChronology4.seconds();
        org.joda.time.DurationField durationField6 = copticChronology4.years();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        java.lang.String str10 = dateTimeZone7.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology12 = copticChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfDay();
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField18 = copticChronology17.years();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str27 = dateTimeZone25.getName(1938003320L);
        long long29 = dateTimeZone25.nextTransition(999L);
        org.joda.time.Chronology chronology30 = copticChronology17.withZone(dateTimeZone25);
        long long33 = dateTimeZone25.convertLocalToUTC(5L, false);
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone25.getOffset(readableInstant34);
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField37 = copticChronology36.seconds();
        org.joda.time.DurationField durationField38 = copticChronology36.hours();
        org.joda.time.DurationField durationField39 = copticChronology36.minutes();
        org.joda.time.DateTimeZone dateTimeZone40 = copticChronology36.getZone();
        long long42 = dateTimeZone40.nextTransition(5L);
        java.util.TimeZone timeZone43 = dateTimeZone40.toTimeZone();
        org.joda.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = dateTimeZone40.isLocalDateTimeGap(localDateTime44);
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone40);
        long long48 = dateTimeZone25.getMillisKeepLocal(dateTimeZone40, (-12960014399985L));
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology49.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology49.weekyear();
        org.joda.time.DurationField durationField52 = copticChronology49.hours();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology49.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone54 = copticChronology49.getZone();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology49.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        long long59 = copticChronology49.add(readablePeriod56, 18909300000L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology49.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology49.weekyear();
        boolean boolean62 = dateTimeZone25.equals((java.lang.Object) dateTimeField61);
        int int64 = dateTimeZone25.getOffset(236L);
        org.joda.time.Chronology chronology65 = copticChronology0.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-01:00" + "'", str27, "-01:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 999L + "'", long29 == 999L);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3600005L + "'", long33 == 3600005L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-3600000) + "'", int35 == (-3600000));
        org.junit.Assert.assertNotNull(copticChronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 5L + "'", long42 == 5L);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(copticChronology46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-12960017999985L) + "'", long48 == (-12960017999985L));
        org.junit.Assert.assertNotNull(copticChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 18909300000L + "'", long59 == 18909300000L);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-3600000) + "'", int64 == (-3600000));
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
    }

    @Test
    public void test22722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22722");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfWeek();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField18 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test22723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22723");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        long long14 = copticChronology0.getDateTimeMillis(10, 10, 1, (int) '#');
        org.joda.time.Chronology chronology15 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[UTC]" + "'", str7, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-52876886399965L) + "'", long14 == (-52876886399965L));
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test22724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22724");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.yearOfCentury();
        java.lang.String str18 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CopticChronology[UTC]" + "'", str18, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test22725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22725");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        long long14 = dateTimeZone11.convertLocalToUTC(999L, false);
        java.lang.String str16 = dateTimeZone11.getName((-363600002L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 999L + "'", long14 == 999L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test22726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22726");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology0.getZone();
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[UTC]" + "'", str9, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test22727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22727");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.era();
        org.joda.time.DurationField durationField15 = copticChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology0.add(readablePeriod16, (-376499999L), 349200000);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-376499999L) + "'", long19 == (-376499999L));
    }

    @Test
    public void test22728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22728");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 90L, 100);
        org.joda.time.DurationField durationField16 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField18 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 90L + "'", long15 == 90L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test22729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22729");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.year();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        org.joda.time.Chronology chronology21 = copticChronology11.withZone(dateTimeZone17);
        long long24 = dateTimeZone17.convertLocalToUTC((long) 0, true);
        boolean boolean26 = dateTimeZone17.isStandardOffset((long) (short) 1);
        long long28 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        org.joda.time.Chronology chronology29 = copticChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField30 = copticChronology0.weeks();
        int int31 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField32 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology33.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology33.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.Chronology chronology37 = copticChronology33.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology33.year();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology33.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology33.monthOfYear();
        boolean boolean42 = copticChronology0.equals((java.lang.Object) copticChronology33);
        org.joda.time.DateTimeField dateTimeField43 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(copticChronology14);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(copticChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test22730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22730");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test22731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22731");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        long long6 = copticChronology0.add(10L, 359999999L, (-1));
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, (long) 360000000, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekOfWeekyear();
        long long15 = copticChronology0.add(0L, 8280000022L, 35);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.secondOfMinute();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField18 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-359999989L) + "'", long6 == (-359999989L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 360000000L + "'", long10 == 360000000L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 289800000770L + "'", long15 == 289800000770L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test22732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22732");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test22733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22733");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[UTC]" + "'", str7, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22734");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (-359999968L));
        long long9 = dateTimeZone1.convertLocalToUTC(20L, false, (long) (byte) 0);
        int int11 = dateTimeZone1.getStandardOffset(13826993008435L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-360000002L) + "'", long5 == (-360000002L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 19L + "'", long9 == 19L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test22735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22735");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.weeks();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test22736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22736");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 36L, 126060000);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 36L + "'", long9 == 36L);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test22737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22737");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.year();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField15 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology16.add(readablePeriod18, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = copticChronology16.add(readablePeriod22, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Chronology chronology27 = copticChronology16.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField28 = copticChronology16.minutes();
        int int29 = copticChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology16.era();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology16.millisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = copticChronology33.seconds();
        org.joda.time.DurationField durationField35 = copticChronology33.hours();
        org.joda.time.DurationField durationField36 = copticChronology33.minutes();
        org.joda.time.DateTimeZone dateTimeZone37 = copticChronology33.getZone();
        long long39 = dateTimeZone37.nextTransition(5L);
        java.util.TimeZone timeZone40 = dateTimeZone37.toTimeZone();
        org.joda.time.Chronology chronology41 = copticChronology16.withZone(dateTimeZone37);
        int int43 = dateTimeZone37.getOffsetFromLocal((-3600048L));
        org.joda.time.Chronology chronology44 = copticChronology0.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField45 = chronology44.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[UTC]" + "'", str9, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(copticChronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5L + "'", long39 == 5L);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(durationField45);
    }

    @Test
    public void test22738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22738");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = copticChronology0.weeks();
        org.joda.time.DurationField durationField18 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test22739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22739");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(4);
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str5 = dateTimeZone1.getID();
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.004" + "'", str4, "+00:00:00.004");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.004" + "'", str5, "+00:00:00.004");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test22740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22740");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test22741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22741");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = copticChronology0.add(readablePeriod5, 35639999896L, 187200000);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePeriod9, 363120100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35639999896L + "'", long8 == 35639999896L);
    }

    @Test
    public void test22742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22742");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 0);
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology13.add(readablePeriod14, 36L, (int) (short) 0);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 36L + "'", long17 == 36L);
    }

    @Test
    public void test22743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22743");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        java.lang.Class<?> wildcardClass9 = dateTimeField8.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22744");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) -1, locale12);
        long long15 = dateTimeZone6.convertUTCToLocal((long) 3600000);
        java.lang.String str16 = dateTimeZone6.toString();
        int int18 = dateTimeZone6.getOffset((-327599968L));
        java.util.TimeZone timeZone19 = dateTimeZone6.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.004' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.004" + "'", str13, "+00:00:00.004");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600004L + "'", long15 == 3600004L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.004" + "'", str16, "+00:00:00.004");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test22745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22745");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        int int10 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test22746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22746");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = copticChronology0.getDateTimeMillis((int) (byte) 100, 36000000, 349200000, 363120000, (-3840000), 4, 126060000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363120000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test22747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22747");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.year();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.DurationField durationField17 = copticChronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getNameKey((long) 1);
        org.joda.time.Chronology chronology22 = copticChronology12.withZone(dateTimeZone18);
        long long25 = dateTimeZone18.convertLocalToUTC((long) 0, true);
        boolean boolean27 = dateTimeZone18.isStandardOffset((long) (short) 1);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone18.getShortName(0L, locale29);
        java.lang.String str32 = dateTimeZone18.getNameKey((long) (short) -1);
        java.lang.String str34 = dateTimeZone18.getName(360000000L);
        org.joda.time.Chronology chronology35 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 90L + "'", long9 == 90L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-4L) + "'", long25 == (-4L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.004" + "'", str30, "+00:00:00.004");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.004" + "'", str34, "+00:00:00.004");
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test22748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22748");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(100L, false, 1L);
        java.lang.String str11 = dateTimeZone6.getID();
        long long14 = dateTimeZone6.adjustOffset(359999999L, true);
        boolean boolean16 = dateTimeZone6.isStandardOffset((long) (short) 1);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.millisOfSecond();
        long long23 = copticChronology17.add(360000099L, 152L, (int) 'a');
        org.joda.time.DurationField durationField24 = copticChronology17.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 359999999L + "'", long14 == 359999999L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 360014843L + "'", long23 == 360014843L);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test22749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22749");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(100L, false, 1L);
        java.lang.String str11 = dateTimeZone6.getID();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone6.getOffset(readableInstant12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        java.lang.String str16 = dateTimeZone6.getName(35L);
        long long19 = dateTimeZone6.adjustOffset((long) 3600000, false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone6.getShortName(0L, locale21);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone6.isLocalDateTimeGap(localDateTime23);
        long long28 = dateTimeZone6.convertLocalToUTC(36003210L, true, 999L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone6.getName((-37919964L), locale30);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3600000L + "'", long19 == 3600000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 36003210L + "'", long28 == 36003210L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test22750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22750");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        long long6 = copticChronology0.add(10L, 359999999L, (-1));
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.DurationField durationField12 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-359999989L) + "'", long6 == (-359999989L));
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[UTC]" + "'", str10, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test22751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22751");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 0, true);
        long long15 = dateTimeZone6.convertUTCToLocal((long) (short) -1);
        java.lang.String str16 = dateTimeZone6.getID();
        long long18 = dateTimeZone6.previousTransition((long) (short) -1);
        boolean boolean19 = dateTimeZone6.isFixed();
        int int21 = dateTimeZone6.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str23 = dateTimeZone6.getNameKey((-100L));
        java.lang.String str25 = dateTimeZone6.getName((-82800000L));
        java.util.TimeZone timeZone26 = dateTimeZone6.toTimeZone();
        long long29 = dateTimeZone6.convertLocalToUTC((-35999989L), false);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-35999989L) + "'", long29 == (-35999989L));
    }

    @Test
    public void test22752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22752");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    }

    @Test
    public void test22753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22753");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.weeks();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.hours();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = copticChronology17.add(readablePeriod19, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology17.add(readablePeriod23, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = copticChronology17.getZone();
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone28.getShortName(3600000L, locale30);
        java.lang.String str33 = dateTimeZone28.getName(3600000L);
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField35 = copticChronology34.seconds();
        org.joda.time.DurationField durationField36 = copticChronology34.years();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology38 = copticChronology34.withZone(dateTimeZone37);
        int int40 = dateTimeZone37.getOffset((long) 0);
        int int42 = dateTimeZone37.getOffset((long) (byte) 1);
        boolean boolean43 = dateTimeZone28.equals((java.lang.Object) dateTimeZone37);
        org.joda.time.Chronology chronology44 = copticChronology13.withZone(dateTimeZone28);
        java.util.TimeZone timeZone45 = dateTimeZone28.toTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField47 = copticChronology46.seconds();
        org.joda.time.DurationField durationField48 = copticChronology46.minutes();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology46.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology46.clockhourOfHalfday();
        org.joda.time.DurationField durationField51 = copticChronology46.weeks();
        org.joda.time.DurationField durationField52 = copticChronology46.halfdays();
        boolean boolean53 = dateTimeZone28.equals((java.lang.Object) copticChronology46);
        long long57 = dateTimeZone28.convertLocalToUTC(149700000L, false, (-8089199925L));
        org.joda.time.Chronology chronology58 = copticChronology0.withZone(dateTimeZone28);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(copticChronology46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 149700000L + "'", long57 == 149700000L);
        org.junit.Assert.assertNotNull(chronology58);
    }

    @Test
    public void test22754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22754");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getName((long) (short) 0);
        java.lang.String str5 = dateTimeZone1.getID();
        long long7 = dateTimeZone1.nextTransition(1283039960400058L);
        long long9 = dateTimeZone1.convertUTCToLocal((-53175297599990L));
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.year();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        java.lang.String str19 = dateTimeZone16.getNameKey((long) 1);
        org.joda.time.Chronology chronology20 = copticChronology10.withZone(dateTimeZone16);
        long long23 = dateTimeZone16.convertLocalToUTC((long) 0, true);
        long long25 = dateTimeZone16.convertUTCToLocal((long) (short) -1);
        int int27 = dateTimeZone16.getOffsetFromLocal((-1L));
        int int29 = dateTimeZone16.getOffsetFromLocal(3600001L);
        long long31 = dateTimeZone16.convertUTCToLocal((-189299900L));
        boolean boolean32 = dateTimeZone16.isFixed();
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone16.getShortName((-8279999925L), locale34);
        java.lang.String str37 = dateTimeZone16.getNameKey((-15356790L));
        long long39 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, 9843603175L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1283039960400058L + "'", long7 == 1283039960400058L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53175297599990L) + "'", long9 == (-53175297599990L));
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-189299900L) + "'", long31 == (-189299900L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 9843603175L + "'", long39 == 9843603175L);
    }

    @Test
    public void test22755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22755");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = copticChronology2.seconds();
        org.joda.time.DurationField durationField4 = copticChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology6 = copticChronology2.withZone(dateTimeZone5);
        java.lang.String str8 = dateTimeZone5.getNameKey((long) 1);
        boolean boolean10 = dateTimeZone5.equals((java.lang.Object) (-1.0f));
        int int12 = dateTimeZone5.getOffset((long) 100);
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test22756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22756");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField7 = copticChronology6.seconds();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology6.add(readablePeriod8, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology12 = copticChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology6.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology6.getZone();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.secondOfMinute();
        org.joda.time.DurationField durationField19 = copticChronology16.halfdays();
        int int20 = copticChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology16.weekyearOfCentury();
        org.joda.time.DurationField durationField22 = copticChronology16.months();
        org.joda.time.DurationField durationField23 = copticChronology16.years();
        org.joda.time.DurationField durationField24 = copticChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology16.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology16.secondOfMinute();
        org.joda.time.DurationField durationField28 = copticChronology16.millis();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology16.clockhourOfHalfday();
        boolean boolean31 = dateTimeZone15.equals((java.lang.Object) copticChronology16);
        long long33 = dateTimeZone15.previousTransition((-8639999890L));
        org.joda.time.Chronology chronology34 = copticChronology0.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField36 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-8639999890L) + "'", long33 == (-8639999890L));
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
    }

    @Test
    public void test22757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22757");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test22758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22758");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.centuryOfEra();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.year();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.DurationField durationField17 = copticChronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getNameKey((long) 1);
        org.joda.time.Chronology chronology22 = copticChronology12.withZone(dateTimeZone18);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = copticChronology23.seconds();
        org.joda.time.DurationField durationField25 = copticChronology23.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology27 = copticChronology23.withZone(dateTimeZone26);
        java.lang.String str29 = dateTimeZone26.getNameKey((long) 1);
        int int31 = dateTimeZone26.getStandardOffset((long) (short) 0);
        long long33 = dateTimeZone18.getMillisKeepLocal(dateTimeZone26, (long) (short) 10);
        java.lang.String str35 = dateTimeZone18.getName(359999999L);
        long long37 = dateTimeZone18.convertUTCToLocal((long) (byte) 0);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone18.getName(5L, locale39);
        org.joda.time.Chronology chronology41 = copticChronology7.withZone(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = dateTimeZone18.isLocalDateTimeGap(localDateTime42);
        int int45 = dateTimeZone18.getOffset((-52870260899966L));
        long long48 = dateTimeZone18.convertLocalToUTC((-395999989L), true);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-395999989L) + "'", long48 == (-395999989L));
    }

    @Test
    public void test22759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22759");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField7 = copticChronology6.seconds();
        org.joda.time.DurationField durationField8 = copticChronology6.millis();
        org.joda.time.DurationField durationField9 = copticChronology6.hours();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName((long) ' ', locale17);
        org.joda.time.Chronology chronology19 = copticChronology12.withZone(dateTimeZone15);
        java.lang.String str20 = copticChronology12.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology12.getZone();
        boolean boolean23 = dateTimeZone21.isStandardOffset(135L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone21.getOffset(readableInstant24);
        org.joda.time.Chronology chronology26 = copticChronology6.withZone(dateTimeZone21);
        java.lang.String str28 = dateTimeZone21.getNameKey(684000000L);
        org.joda.time.Chronology chronology29 = copticChronology0.withZone(dateTimeZone21);
        long long31 = dateTimeZone21.nextTransition((-1239249407769445L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CopticChronology[UTC]" + "'", str20, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1239249407769445L) + "'", long31 == (-1239249407769445L));
    }

    @Test
    public void test22760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22760");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = copticChronology0.getDateTimeMillis(115200000, (int) (byte) 0, (-3600000), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test22761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22761");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        long long10 = copticChronology0.getDateTimeMillis((long) (byte) -1, 1, 0, (int) (short) 0, 1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField15 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-82799999L) + "'", long10 == (-82799999L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test22762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22762");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray13 = new int[] { 32, (byte) 100, 6720000 };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial9, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 100, 6720000]");
    }

    @Test
    public void test22763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22763");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[UTC]" + "'", str5, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test22764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22764");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.millis();
        org.joda.time.DurationField durationField14 = copticChronology11.seconds();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology11.getZone();
        int int17 = dateTimeZone15.getStandardOffset((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.hours();
        org.joda.time.DurationField durationField21 = copticChronology18.minutes();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology18.getZone();
        long long24 = dateTimeZone22.nextTransition(5L);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        int int27 = dateTimeZone22.getOffset((-359999968L));
        java.lang.String str28 = dateTimeZone22.toString();
        java.lang.String str30 = dateTimeZone22.getNameKey((-35279991294L));
        int int32 = dateTimeZone22.getOffset(360000000L);
        long long34 = dateTimeZone15.getMillisKeepLocal(dateTimeZone22, (-53175297599990L));
        java.util.TimeZone timeZone35 = dateTimeZone22.toTimeZone();
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone22.getShortName(18666250035L, locale37);
        org.joda.time.Chronology chronology39 = copticChronology0.withZone(dateTimeZone22);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5L + "'", long24 == 5L);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-53175297599990L) + "'", long34 == (-53175297599990L));
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertNotNull(chronology39);
    }

    @Test
    public void test22765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22765");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 0, true);
        long long15 = dateTimeZone6.convertUTCToLocal((long) (byte) 100);
        long long17 = dateTimeZone6.convertUTCToLocal((long) ' ');
        long long19 = dateTimeZone6.nextTransition((-359999989L));
        java.lang.String str20 = dateTimeZone6.toString();
        boolean boolean22 = dateTimeZone6.isStandardOffset((-4L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-359999989L) + "'", long19 == (-359999989L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test22766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22766");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 4);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField18 = copticChronology13.hours();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology13.getZone();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology21.secondOfMinute();
        org.joda.time.DurationField durationField24 = copticChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology21.minuteOfDay();
        boolean boolean27 = dateTimeZone20.equals((java.lang.Object) dateTimeField26);
        java.util.TimeZone timeZone28 = dateTimeZone20.toTimeZone();
        int int30 = dateTimeZone20.getStandardOffset((-356399968L));
        long long32 = dateTimeZone10.getMillisKeepLocal(dateTimeZone20, (long) 360000000);
        long long34 = dateTimeZone20.previousTransition(360000035L);
        long long37 = dateTimeZone20.adjustOffset((-1080L), true);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 360000000L + "'", long32 == 360000000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 360000035L + "'", long34 == 360000035L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1080L) + "'", long37 == (-1080L));
    }

    @Test
    public void test22767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22767");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getOffsetFromLocal((long) 0);
        java.lang.String str15 = dateTimeZone10.getShortName((long) 4);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10, 4);
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone10);
        java.lang.String str20 = dateTimeZone10.getNameKey((-1080599968L));
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test22768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22768");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.era();
        org.joda.time.DurationField durationField15 = copticChronology0.months();
        org.joda.time.DurationField durationField16 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test22769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22769");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        int int19 = dateTimeZone14.getStandardOffset((long) (short) 0);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone14, (long) (short) 10);
        long long24 = dateTimeZone14.adjustOffset((-82799999L), true);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = copticChronology25.seconds();
        org.joda.time.DurationField durationField27 = copticChronology25.years();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        boolean boolean30 = dateTimeZone28.isFixed();
        java.lang.String str31 = dateTimeZone28.getID();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28, 4);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology33.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology33.getZone();
        long long37 = dateTimeZone14.getMillisKeepLocal(dateTimeZone35, 3600001L);
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = copticChronology38.getZone();
        long long42 = dateTimeZone40.convertUTCToLocal(277199999L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-82799999L) + "'", long24 == (-82799999L));
        org.junit.Assert.assertNotNull(copticChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertNotNull(copticChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3600001L + "'", long37 == 3600001L);
        org.junit.Assert.assertNotNull(copticChronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 277199999L + "'", long42 == 277199999L);
    }

    @Test
    public void test22770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22770");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField16 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test22771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22771");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        long long6 = copticChronology0.add(10L, 359999999L, (-1));
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-359999989L) + "'", long6 == (-359999989L));
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[UTC]" + "'", str10, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22772");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test22773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22773");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.millisOfDay();
        boolean boolean4 = dateTimeZone0.equals((java.lang.Object) dateTimeField3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone0.getOffset(readableInstant5);
        int int8 = dateTimeZone0.getOffsetFromLocal(3600236L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test22774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22774");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, (long) '#', (int) '#');
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField14 = copticChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology0.getZone();
        org.joda.time.DurationField durationField16 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test22775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22775");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.minuteOfDay();
        org.joda.time.Chronology chronology20 = copticChronology17.withUTC();
        org.joda.time.DurationField durationField21 = copticChronology17.years();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology17.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test22776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22776");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfDay();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = copticChronology0.set(readablePartial15, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    }

    @Test
    public void test22777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22777");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test22778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22778");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, 5L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone14);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5L + "'", long11 == 5L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test22779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22779");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        long long11 = copticChronology0.add((long) (-1), (long) (byte) 10, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DurationField durationField15 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.secondOfMinute();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 99L + "'", long11 == 99L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test22780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22780");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.millis();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = copticChronology12.seconds();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology12.add(readablePeriod14, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology12.add(readablePeriod18, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology12.getZone();
        long long25 = dateTimeZone22.adjustOffset(10L, true);
        int int27 = dateTimeZone22.getOffsetFromLocal((long) 'a');
        long long29 = dateTimeZone22.previousTransition(5L);
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone22);
        org.joda.time.Chronology chronology31 = copticChronology7.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology7.dayOfYear();
        org.joda.time.DurationField durationField33 = copticChronology7.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5L + "'", long29 == 5L);
        org.junit.Assert.assertNotNull(copticChronology30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test22781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22781");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.years();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology6.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        long long11 = dateTimeZone8.nextTransition(189300000L);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.dayOfYear();
        int int16 = copticChronology12.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.minuteOfHour();
        org.joda.time.DurationField durationField18 = copticChronology12.centuries();
        boolean boolean19 = dateTimeZone8.equals((java.lang.Object) durationField18);
        boolean boolean21 = dateTimeZone8.isStandardOffset((-3599999L));
        org.joda.time.Chronology chronology22 = copticChronology0.withZone(dateTimeZone8);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 189300000L + "'", long11 == 189300000L);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test22782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22782");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        long long10 = copticChronology0.add((-187199990L), (long) (short) 0, 189300000);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.year();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        org.joda.time.Chronology chronology21 = copticChronology11.withZone(dateTimeZone17);
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = copticChronology22.seconds();
        org.joda.time.DurationField durationField24 = copticChronology22.years();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology26 = copticChronology22.withZone(dateTimeZone25);
        java.lang.String str28 = dateTimeZone25.getNameKey((long) 1);
        int int30 = dateTimeZone25.getStandardOffset((long) (short) 0);
        long long32 = dateTimeZone17.getMillisKeepLocal(dateTimeZone25, (long) (short) 10);
        int int34 = dateTimeZone17.getStandardOffset((long) (byte) 100);
        long long37 = dateTimeZone17.convertLocalToUTC((long) (byte) 0, true);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone17.getShortName(999L, locale39);
        org.joda.time.Chronology chronology41 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology0.dayOfYear();
        int int43 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField44 = copticChronology0.centuries();
        org.joda.time.DurationField durationField45 = copticChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial46 = null;
        int[] intArray47 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial46, intArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-187199990L) + "'", long10 == (-187199990L));
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
    }

    @Test
    public void test22783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22783");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        long long12 = copticChronology0.add((long) 10, (long) '4', (-3600000));
        org.joda.time.Chronology chronology13 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField15 = copticChronology0.weeks();
        org.joda.time.DurationField durationField16 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology0.add(readablePeriod18, (-8279994870L), (int) '4');
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-8279994870L) + "'", long21 == (-8279994870L));
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test22784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22784");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test22785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22785");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = copticChronology0.add(176460000L, (-52087456799856L), 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -52087456799856 * 3600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test22786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22786");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        long long8 = copticChronology0.add((-7178255810700000L), 360000032L, 360000000);
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePartial9, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 122421755709300000L + "'", long8 == 122421755709300000L);
    }

    @Test
    public void test22787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22787");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.secondOfMinute();
        org.joda.time.DurationField durationField15 = copticChronology12.halfdays();
        int int16 = copticChronology12.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField18 = copticChronology12.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.year();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = copticChronology22.seconds();
        org.joda.time.DurationField durationField24 = copticChronology22.years();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology26 = copticChronology22.withZone(dateTimeZone25);
        java.lang.String str28 = dateTimeZone25.getNameKey((long) 1);
        org.joda.time.Chronology chronology29 = copticChronology19.withZone(dateTimeZone25);
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField31 = copticChronology30.seconds();
        org.joda.time.DurationField durationField32 = copticChronology30.years();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology34 = copticChronology30.withZone(dateTimeZone33);
        java.lang.String str36 = dateTimeZone33.getNameKey((long) 1);
        int int38 = dateTimeZone33.getStandardOffset((long) (short) 0);
        long long40 = dateTimeZone25.getMillisKeepLocal(dateTimeZone33, (long) (short) 10);
        int int42 = dateTimeZone25.getStandardOffset((long) (byte) 100);
        long long45 = dateTimeZone25.convertLocalToUTC((long) (byte) 0, true);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone25.getShortName(999L, locale47);
        long long52 = dateTimeZone25.convertLocalToUTC(0L, false, (long) (byte) 0);
        org.joda.time.Chronology chronology53 = copticChronology12.withZone(dateTimeZone25);
        int int55 = dateTimeZone25.getOffsetFromLocal((-53175657599990L));
        org.joda.time.Chronology chronology56 = copticChronology0.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField57 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology0.clockhourOfHalfday();
        long long62 = copticChronology0.add(0L, (-360000002L), 0);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(copticChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
    }

    @Test
    public void test22788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22788");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology10.add(readablePeriod12, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology16 = copticChronology10.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.year();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone23.getNameKey((long) 1);
        org.joda.time.Chronology chronology27 = copticChronology17.withZone(dateTimeZone23);
        long long30 = dateTimeZone23.convertLocalToUTC((long) 0, true);
        boolean boolean32 = dateTimeZone23.isStandardOffset((long) (short) 1);
        org.joda.time.Chronology chronology33 = copticChronology10.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        long long38 = dateTimeZone23.convertLocalToUTC(277200000L, true, 132L);
        java.lang.String str39 = dateTimeZone23.getID();
        org.joda.time.Chronology chronology40 = copticChronology0.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField41 = chronology40.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(copticChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 277200000L + "'", long38 == 277200000L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
    }
}
