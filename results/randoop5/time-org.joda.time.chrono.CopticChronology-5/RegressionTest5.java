import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology6.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology6.set(readablePartial10, 250100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        java.lang.String str13 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str13, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DurationField durationField13 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = copticChronology0.get(readablePeriod16, (-472799678798L), 250100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        long long8 = copticChronology0.add(67L, (long) (byte) 1, (int) '#');
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray13 = new int[] { 4, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[4, 97]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = copticChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.weekOfWeekyear();
        java.lang.String str16 = copticChronology9.toString();
        org.joda.time.DurationField durationField17 = copticChronology9.minutes();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean20 = copticChronology18.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology18.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology18.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology18.getZone();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.Chronology chronology25 = copticChronology9.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology26 = copticChronology0.withZone(dateTimeZone23);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str16, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = copticChronology0.get(readablePeriod6, (-50059727999999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        long long11 = copticChronology0.add((long) '#', 250100L, 0);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology0.add(readablePeriod13, (-4727996799L), (int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology0.add(readablePeriod17, 36001035L, 0);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-4727996799L) + "'", long16 == (-4727996799L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36001035L + "'", long20 == 36001035L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.weekyear();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.Chronology chronology14 = copticChronology11.withUTC();
        int int15 = copticChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.minuteOfDay();
        org.joda.time.DurationField durationField18 = copticChronology11.days();
        boolean boolean19 = copticChronology0.equals((java.lang.Object) copticChronology11);
        org.joda.time.DurationField durationField20 = copticChronology11.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology6.secondOfMinute();
        int int10 = copticChronology6.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology6.year();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology6.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DurationField durationField10 = copticChronology8.seconds();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology8.add(readablePeriod11, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology8.getZone();
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(copticChronology20);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7, (int) (short) 1);
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(copticChronology10);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = copticChronology0.getDateTimeMillis(0, (int) (short) 0, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.dayOfYear();
        long long17 = copticChronology7.add((long) (short) -1, 2501032L, (-1));
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = copticChronology7.get(readablePeriod19, 250100L, 9L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-2501033L) + "'", long17 == (-2501033L));
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfMonth();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.weekyear();
        org.joda.time.DurationField durationField17 = copticChronology15.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology15.add(readablePeriod18, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean24 = copticChronology22.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField26 = copticChronology22.millis();
        org.joda.time.DurationField durationField27 = copticChronology22.days();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology22.yearOfCentury();
        boolean boolean29 = copticChronology15.equals((java.lang.Object) copticChronology22);
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology30.millisOfDay();
        org.joda.time.DurationField durationField32 = copticChronology30.seconds();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = copticChronology30.add(readablePeriod33, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology30.secondOfDay();
        org.joda.time.Chronology chronology38 = copticChronology30.withUTC();
        boolean boolean39 = copticChronology15.equals((java.lang.Object) copticChronology30);
        org.joda.time.DurationField durationField40 = copticChronology30.hours();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology30.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = copticChronology30.getZone();
        org.joda.time.Chronology chronology43 = copticChronology7.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology7.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        long long48 = copticChronology7.add(readablePeriod45, (-4L), (int) 'a');
        org.joda.time.DurationField durationField49 = copticChronology7.hours();
        long long53 = copticChronology7.add((-25009383L), 13005232L, (int) ' ');
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(copticChronology30);
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
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 391158041L + "'", long53 == 391158041L);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        long long13 = copticChronology0.getDateTimeMillis(9L, 10, (int) (short) 0, (int) (byte) 1, (int) '#');
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36001035L + "'", long13 == 36001035L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = copticChronology10.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.dayOfWeek();
        org.joda.time.DurationField durationField15 = copticChronology10.months();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology10.year();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology10.year();
        org.joda.time.DurationField durationField18 = copticChronology10.millis();
        boolean boolean19 = copticChronology0.equals((java.lang.Object) durationField18);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = copticChronology0.set(readablePartial12, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean11 = copticChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology9.getZone();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14, 1);
        java.lang.Class<?> wildcardClass19 = copticChronology18.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        long long11 = copticChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField18 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.year();
        org.joda.time.Chronology chronology20 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology0.getDateTimeMillis((int) '#', (int) (byte) -1, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField12 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        int int11 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        long long18 = copticChronology0.getDateTimeMillis((long) (short) 10, (int) (short) 1, (int) (byte) 10, 10, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4210010L + "'", long18 == 4210010L);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology0.getDateTimeMillis((int) (short) 100, 0, 4, (int) (byte) 1, (int) 'a', 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = copticChronology0.getDateTimeMillis(8003200L, (int) '#', 0, 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology6.getZone();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(copticChronology9);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = copticChronology0.getDateTimeMillis((int) (byte) -1, (int) (short) 10, (int) (short) 100, (int) (byte) 0, 1, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DurationField durationField12 = copticChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.year();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.hourOfHalfday();
        boolean boolean18 = copticChronology0.equals((java.lang.Object) dateTimeField17);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.millis();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        boolean boolean5 = copticChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(copticChronology11);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyearOfCentury();
        java.lang.Class<?> wildcardClass10 = dateTimeField9.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfWeek();
        long long11 = copticChronology0.add((long) (short) 0, 0L, (int) (byte) 0);
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology8.weeks();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology8);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.year();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.dayOfWeek();
        org.joda.time.DurationField durationField15 = copticChronology8.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        int int13 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str3, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        long long11 = copticChronology7.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField12 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = copticChronology7.days();
        boolean boolean15 = copticChronology4.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology4.weekyear();
        org.joda.time.DurationField durationField17 = copticChronology4.millis();
        boolean boolean18 = copticChronology0.equals((java.lang.Object) durationField17);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = copticChronology0.get(readablePartial20, (-937L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
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
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology8.seconds();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.millisOfSecond();
        org.joda.time.DurationField durationField15 = copticChronology8.days();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.hourOfHalfday();
        boolean boolean17 = copticChronology6.equals((java.lang.Object) dateTimeField16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology6.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.minuteOfHour();
        long long19 = copticChronology9.getDateTimeMillis((int) (byte) 100, 1, (int) (short) 1, 0);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology9.yearOfEra();
        boolean boolean21 = copticChronology0.equals((java.lang.Object) dateTimeField20);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-50059987200000L) + "'", long19 == (-50059987200000L));
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            copticChronology7.validate(readablePartial10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfEra();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray10 = new int[] { (short) 1, 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial6, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0, 100]");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean12 = copticChronology10.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.halfdayOfDay();
        org.joda.time.DurationField durationField14 = copticChronology10.millis();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology10.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology10.add(readablePeriod17, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology10.getZone();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone21);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(copticChronology24);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology6.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology6.set(readablePartial10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.weekyear();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField13 = copticChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.yearOfCentury();
        boolean boolean15 = copticChronology0.equals((java.lang.Object) dateTimeField14);
        org.joda.time.DurationField durationField16 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.weekyear();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.year();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology19.clockhourOfDay();
        java.lang.String str23 = copticChronology19.toString();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.weekyear();
        boolean boolean25 = copticChronology0.equals((java.lang.Object) dateTimeField24);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str23, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = copticChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.dayOfWeek();
        java.lang.String str14 = copticChronology9.toString();
        org.joda.time.Chronology chronology15 = copticChronology9.withUTC();
        org.joda.time.DurationField durationField16 = copticChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology9.clockhourOfHalfday();
        long long23 = copticChronology9.getDateTimeMillis((long) (byte) -1, (int) (short) 10, (int) '4', 0, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology9.getZone();
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone24);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str14, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-47279968L) + "'", long23 == (-47279968L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(copticChronology26);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DurationField durationField6 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfHalfday();
        int int12 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str10, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology6.months();
        org.joda.time.DurationField durationField9 = copticChronology6.years();
        org.joda.time.Chronology chronology10 = copticChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology6.years();
        int int13 = copticChronology6.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology11.add(readablePeriod13, (-47279968L), 100);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-47279968L) + "'", long16 == (-47279968L));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean11 = copticChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology9.getZone();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField17 = copticChronology16.millis();
        org.joda.time.DurationField durationField18 = copticChronology16.weekyears();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = copticChronology16.add(readablePeriod19, 100L, (int) (short) -1);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.weekyear();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance();
        long long30 = copticChronology26.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField31 = copticChronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology26.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = copticChronology26.days();
        boolean boolean34 = copticChronology23.equals((java.lang.Object) copticChronology26);
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology26.getZone();
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35, (int) (byte) 1);
        org.joda.time.Chronology chronology38 = copticChronology16.withZone(dateTimeZone35);
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        org.joda.time.Chronology chronology40 = copticChronology0.withZone(dateTimeZone35);
        // The following exception was thrown during execution in test generation
        try {
            long long48 = copticChronology0.getDateTimeMillis((int) ' ', (int) 'a', (int) (short) -1, (int) (byte) -1, (int) (short) 1, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(copticChronology26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 98L + "'", long30 == 98L);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(copticChronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(copticChronology39);
        org.junit.Assert.assertNotNull(chronology40);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyear();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.seconds();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology14.add(readablePeriod17, (long) (byte) 10, (int) (byte) 100);
        boolean boolean21 = copticChronology0.equals((java.lang.Object) copticChronology14);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.yearOfCentury();
        long long26 = copticChronology0.add((long) 1, (long) (byte) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = copticChronology0.add(readablePeriod28, (-52087968000000L), (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField33 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-52087968000000L) + "'", long31 == (-52087968000000L));
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray15 = new int[] { '#', (byte) 0, (short) -1, 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial9, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 0, -1, 97, 52]");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        long long14 = copticChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, (long) 10, 10);
        long long22 = copticChronology0.add((long) ' ', 250100L, (int) (byte) 10);
        org.joda.time.DurationField durationField23 = copticChronology0.weeks();
        int int24 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology0.getZone();
        org.joda.time.ReadablePartial readablePartial26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = copticChronology0.get(readablePartial26, 250100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 250100L + "'", long14 == 250100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2501032L + "'", long22 == 2501032L);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 10100L, (int) ' ');
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10100L + "'", long12 == 10100L);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        int int11 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean15 = copticChronology13.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology13.getZone();
        org.joda.time.DurationField durationField19 = copticChronology13.days();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField21 = copticChronology13.centuries();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology22.getZone();
        org.joda.time.Chronology chronology26 = copticChronology13.withZone(dateTimeZone25);
        org.joda.time.Chronology chronology27 = copticChronology0.withZone(dateTimeZone25);
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = copticChronology28.get(readablePeriod29, (-52087968000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(copticChronology28);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = copticChronology0.get(readablePeriod12, 24261363L, (-4727996799L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(copticChronology6);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.millis();
        org.joda.time.DurationField durationField12 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.yearOfCentury();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long21 = copticChronology17.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str22 = copticChronology17.toString();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology23.getZone();
        org.joda.time.Chronology chronology27 = copticChronology17.withZone(dateTimeZone26);
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology29 = copticChronology0.withZone(dateTimeZone26);
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray34 = copticChronology30.get(readablePeriod31, (-47283507231495L), (-2501033L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str22, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(copticChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(copticChronology30);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        long long14 = copticChronology0.add((long) 0, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DurationField durationField5 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.yearOfCentury();
        org.joda.time.DurationField durationField12 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.dayOfYear();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology8.seconds();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean21 = copticChronology19.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology19.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology19.getZone();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField26 = copticChronology25.halfdays();
        org.joda.time.DurationField durationField27 = copticChronology25.halfdays();
        org.joda.time.DurationField durationField28 = copticChronology25.millis();
        boolean boolean29 = copticChronology0.equals((java.lang.Object) durationField28);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(copticChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePartial9, (-83278990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.secondOfMinute();
        int int12 = copticChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology8.getZone();
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology0.add(readablePeriod16, 3492100495L, 0);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3492100495L + "'", long19 == 3492100495L);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.centuryOfEra();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean17 = copticChronology15.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField19 = copticChronology15.millis();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.minuteOfHour();
        long long24 = copticChronology15.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField25 = copticChronology15.weeks();
        org.joda.time.DurationField durationField26 = copticChronology15.seconds();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = copticChronology15.add(readablePeriod27, 100L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField31 = copticChronology15.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology15.minuteOfHour();
        boolean boolean33 = copticChronology7.equals((java.lang.Object) copticChronology15);
        java.lang.Class<?> wildcardClass34 = copticChronology15.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1663L + "'", long24 == 1663L);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
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
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = copticChronology0.get(readablePeriod9, 1663L, 36001035L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField15 = copticChronology0.centuries();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = copticChronology0.get(readablePartial16, (-47280066589999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = copticChronology9.weekyears();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology9.getZone();
        org.joda.time.Chronology chronology16 = copticChronology0.withZone(dateTimeZone15);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(copticChronology17);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 100L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DurationField durationField5 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = copticChronology0.get(readablePeriod11, 1696L, (-50130575995999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField5 = copticChronology0.days();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = copticChronology0.get(readablePartial6, (-47280066589989L));
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
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyearOfCentury();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str10, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology6.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = copticChronology6.get(readablePeriod10, 14692001L, (-99L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.months();
        org.joda.time.DurationField durationField17 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = copticChronology0.get(readablePeriod16, 3492100495L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0, 1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.weekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = copticChronology2.add(readablePeriod4, 9700L, (int) '4');
        org.joda.time.DurationField durationField8 = copticChronology2.days();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9700L + "'", long7 == 9700L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
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
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DurationField durationField9 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        long long11 = copticChronology0.add((long) '#', 250100L, 0);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfDay();
        long long16 = copticChronology0.add((long) (short) 100, (long) 1, 1);
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 101L + "'", long16 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        long long10 = copticChronology0.add(10L, 1L, (int) (byte) -1);
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology6.getZone();
        org.joda.time.Chronology chronology8 = copticChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfSecond();
        org.joda.time.DurationField durationField11 = copticChronology9.seconds();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfMonth();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.weekyear();
        org.joda.time.DurationField durationField17 = copticChronology15.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology15.add(readablePeriod18, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean24 = copticChronology22.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField26 = copticChronology22.millis();
        org.joda.time.DurationField durationField27 = copticChronology22.days();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology22.yearOfCentury();
        boolean boolean29 = copticChronology15.equals((java.lang.Object) copticChronology22);
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology30.millisOfDay();
        org.joda.time.DurationField durationField32 = copticChronology30.seconds();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = copticChronology30.add(readablePeriod33, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology30.secondOfDay();
        org.joda.time.Chronology chronology38 = copticChronology30.withUTC();
        boolean boolean39 = copticChronology15.equals((java.lang.Object) copticChronology30);
        org.joda.time.DurationField durationField40 = copticChronology30.hours();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology30.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = copticChronology30.getZone();
        org.joda.time.Chronology chronology43 = copticChronology7.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology7.dayOfMonth();
        long long48 = copticChronology7.add((long) (byte) 0, 61001L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField49 = copticChronology7.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(copticChronology30);
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
        org.junit.Assert.assertNotNull(dateTimeField49);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology6.getZone();
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone9);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        java.lang.Class<?> wildcardClass7 = copticChronology0.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray9 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial8, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        long long10 = copticChronology0.add(10L, 1L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean11 = copticChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.halfdayOfDay();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField16 = copticChronology0.years();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long21 = copticChronology17.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.halfdayOfDay();
        org.joda.time.DurationField durationField23 = copticChronology17.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean26 = copticChronology24.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology24.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology24.monthOfYear();
        boolean boolean29 = copticChronology17.equals((java.lang.Object) copticChronology24);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology17.dayOfMonth();
        org.joda.time.DurationField durationField32 = copticChronology17.centuries();
        boolean boolean33 = copticChronology0.equals((java.lang.Object) copticChronology17);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField13 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = copticChronology0.get(readablePeriod14, 97L, (-472799679798L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        java.lang.String str12 = copticChronology0.toString();
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        java.lang.Class<?> wildcardClass8 = dateTimeField7.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10, 1);
        org.joda.time.DurationField durationField13 = copticChronology12.days();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfWeek();
        java.lang.String str14 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str14, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7, 1);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(copticChronology9);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology11.getZone();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = copticChronology0.withZone(dateTimeZone14);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.monthOfYear();
        org.joda.time.DurationField durationField14 = copticChronology7.months();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.millisOfSecond();
        org.joda.time.DurationField durationField4 = copticChronology1.millis();
        org.joda.time.DurationField durationField5 = copticChronology1.centuries();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField15);
    }
}

