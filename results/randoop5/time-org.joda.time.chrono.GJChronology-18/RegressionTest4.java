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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.clockhourOfDay();
        org.joda.time.Chronology chronology6 = gJChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.era();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.year();
        org.joda.time.DurationField durationField14 = gJChronology11.centuries();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.dayOfMonth();
        boolean boolean16 = gJChronology3.equals((java.lang.Object) dateTimeField15);
        int int17 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField18 = gJChronology3.months();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.year();
        org.joda.time.DurationField durationField20 = gJChronology3.hours();
        org.joda.time.DurationField durationField21 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology3.dayOfMonth();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = gJChronology3.years();
        org.joda.time.DurationField durationField6 = gJChronology3.years();
        org.joda.time.DurationField durationField7 = gJChronology3.weeks();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology3.get(readablePeriod8, (-42L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology5.add(readablePeriod7, (long) (short) 1, (int) (byte) -1);
        long long15 = gJChronology5.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField16 = gJChronology5.seconds();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology5.getZone();
        org.joda.time.Chronology chronology18 = gJChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = gJChronology22.add(readablePeriod24, (long) (short) 1, (int) (byte) -1);
        long long32 = gJChronology22.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField33 = gJChronology22.seconds();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35, (int) (short) 1);
        boolean boolean39 = gJChronology37.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.year();
        org.joda.time.DateTimeZone dateTimeZone41 = gJChronology37.getZone();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology37.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = gJChronology37.getZone();
        org.joda.time.Chronology chronology44 = gJChronology22.withZone(dateTimeZone43);
        org.joda.time.Chronology chronology45 = gJChronology0.withZone(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField46 = gJChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61062076799990L) + "'", long15 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61062076799990L) + "'", long32 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.weekyear();
        org.joda.time.DurationField durationField17 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.weekOfWeekyear();
        int int19 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField20 = gJChronology3.halfdays();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology21.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, readableInstant24, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology26.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = gJChronology26.add(readablePeriod28, (long) (short) 1, (int) (byte) -1);
        long long36 = gJChronology26.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField37 = gJChronology26.seconds();
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology26.getZone();
        org.joda.time.Chronology chronology39 = gJChronology21.withZone(dateTimeZone38);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41, readableInstant42, (int) (short) 1);
        boolean boolean46 = gJChronology44.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField47 = gJChronology44.year();
        org.joda.time.DateTimeZone dateTimeZone48 = gJChronology44.getZone();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology44.millisOfSecond();
        org.joda.time.DurationField durationField50 = gJChronology44.seconds();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology44.centuryOfEra();
        org.joda.time.DurationField durationField52 = gJChronology44.seconds();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology44.millisOfSecond();
        org.joda.time.Instant instant54 = gJChronology44.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38, (org.joda.time.ReadableInstant) instant54);
        org.joda.time.Chronology chronology56 = gJChronology3.withZone(dateTimeZone38);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-61062076799990L) + "'", long36 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(chronology56);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = gJChronology3.set(readablePartial20, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        boolean boolean13 = gJChronology11.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.year();
        org.joda.time.Instant instant15 = gJChronology11.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant15, (int) (byte) 1);
        org.joda.time.DurationField durationField18 = gJChronology17.weeks();
        org.joda.time.DurationField durationField19 = gJChronology17.weeks();
        java.lang.String str20 = gJChronology17.toString();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology17.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str20, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13, (int) (short) 1);
        boolean boolean17 = gJChronology15.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.centuryOfEra();
        org.joda.time.DurationField durationField19 = gJChronology15.centuries();
        org.joda.time.DurationField durationField20 = gJChronology15.days();
        org.joda.time.DurationField durationField21 = gJChronology15.minutes();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology15.year();
        boolean boolean23 = gJChronology3.equals((java.lang.Object) gJChronology15);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology15.monthOfYear();
        int int25 = gJChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology15.clockhourOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.weekyear();
        org.joda.time.DurationField durationField13 = gJChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology3.getZone();
        org.joda.time.DurationField durationField16 = gJChronology3.days();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.year();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.dayOfMonth();
        long long11 = gJChronology3.add((-1L), (long) (short) 0, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.hours();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.hourOfDay();
        int int5 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = gJChronology0.add(readablePeriod6, 53238L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology0.weekyear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53238L + "'", long9 == 53238L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = gJChronology0.hours();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology3.getZone();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.minuteOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = gJChronology0.weeks();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.weekyear();
        java.lang.String str17 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = gJChronology3.add(readablePeriod19, (-71399996L), (int) '4');
        org.joda.time.DurationField durationField23 = gJChronology3.weeks();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str17, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-71399996L) + "'", long22 == (-71399996L));
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DurationField durationField8 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField12 = gJChronology3.hours();
        long long16 = gJChronology3.add(52L, 32L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3156L + "'", long16 == 3156L);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weekyears();
        java.lang.String str15 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfDay();
        org.joda.time.DurationField durationField17 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField20 = gJChronology3.years();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str15, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.millisOfDay();
        int int11 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.halfdayOfDay();
        org.joda.time.DurationField durationField13 = gJChronology3.centuries();
        org.joda.time.DurationField durationField14 = gJChronology3.halfdays();
        java.lang.Class<?> wildcardClass15 = durationField14.getClass();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = gJChronology3.years();
        org.joda.time.DurationField durationField6 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = gJChronology3.add(readablePeriod17, (long) (short) -1, (int) (byte) 0);
        int int21 = gJChronology3.getMinimumDaysInFirstWeek();
        int int22 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField24 = gJChronology3.years();
        org.joda.time.Chronology chronology25 = gJChronology3.withUTC();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = gJChronology3.hours();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = gJChronology14.add(readablePeriod16, (long) (short) 1, (int) (byte) -1);
        long long24 = gJChronology14.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField25 = gJChronology14.millis();
        org.joda.time.DurationField durationField26 = gJChronology14.centuries();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology14.secondOfDay();
        boolean boolean31 = gJChronology3.equals((java.lang.Object) gJChronology14);
        org.joda.time.DurationField durationField32 = gJChronology3.hours();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = gJChronology3.get(readablePeriod33, 5045L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-61062076799990L) + "'", long24 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(durationField32);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.dayOfWeek();
        java.lang.String str8 = gJChronology3.toString();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str8, "GJChronology[Etc/UTC,mdfw=1]");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField18 = gJChronology3.days();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = gJChronology3.get(readablePeriod19, 61032L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DurationField durationField8 = gJChronology3.seconds();
        int int9 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.year();
        org.joda.time.DurationField durationField18 = gJChronology15.centuries();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology15.getZone();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, (long) (short) 100, (int) (byte) 1);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22);
        org.joda.time.Chronology chronology27 = gJChronology3.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField29 = gJChronology3.weeks();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DurationField durationField8 = gJChronology3.months();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField10 = gJChronology3.years();
        org.joda.time.DurationField durationField11 = gJChronology3.millis();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, 1665L, (int) (short) 1);
        org.joda.time.Instant instant11 = gJChronology10.getGregorianCutover();
        long long17 = gJChronology10.getDateTimeMillis((long) '#', 0, 1, 1, (int) ' ');
        org.joda.time.DurationField durationField18 = gJChronology10.days();
        org.joda.time.DurationField durationField19 = gJChronology10.hours();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 61032L + "'", long17 == 61032L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology3.yearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = gJChronology3.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = gJChronology3.getDateTimeMillis((int) (short) -1, (int) ' ', 1, (-1), (int) '4', 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology5.add(readablePeriod7, (long) (short) 1, (int) (byte) -1);
        long long15 = gJChronology5.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField16 = gJChronology5.seconds();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology5.getZone();
        org.joda.time.Chronology chronology18 = gJChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology21 = gJChronology0.withUTC();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61062076799990L) + "'", long15 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology5.add(readablePeriod7, (long) (short) 1, (int) (byte) -1);
        long long15 = gJChronology5.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField16 = gJChronology5.seconds();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology5.getZone();
        org.joda.time.Chronology chronology18 = gJChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = gJChronology22.add(readablePeriod24, (long) (short) 1, (int) (byte) -1);
        long long32 = gJChronology22.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField33 = gJChronology22.seconds();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35, (int) (short) 1);
        boolean boolean39 = gJChronology37.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.year();
        org.joda.time.DateTimeZone dateTimeZone41 = gJChronology37.getZone();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology37.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = gJChronology37.getZone();
        org.joda.time.Chronology chronology44 = gJChronology22.withZone(dateTimeZone43);
        org.joda.time.Chronology chronology45 = gJChronology0.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, readableInstant47, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology49.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        long long54 = gJChronology49.add(readablePeriod51, (long) (short) 1, (int) (byte) -1);
        org.joda.time.Instant instant55 = gJChronology49.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, (org.joda.time.ReadableInstant) instant55, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58, readableInstant59, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        long long66 = gJChronology61.add(readablePeriod63, (long) (short) 1, (int) (byte) -1);
        long long70 = gJChronology61.add(1L, (long) '4', (int) (short) 0);
        org.joda.time.Instant instant71 = gJChronology61.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology72 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, (org.joda.time.ReadableInstant) instant71);
        org.joda.time.DurationField durationField73 = gJChronology72.halfdays();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology72.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField75 = gJChronology72.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61062076799990L) + "'", long15 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61062076799990L) + "'", long32 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(gJChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(gJChronology57);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(instant71);
        org.junit.Assert.assertNotNull(gJChronology72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology3.getZone();
        org.joda.time.DurationField durationField9 = gJChronology3.days();
        long long13 = gJChronology3.add(100L, (long) (byte) 0, 100);
        org.joda.time.DurationField durationField14 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.millisOfDay();
        java.lang.Class<?> wildcardClass5 = dateTimeField4.getClass();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField17 = gJChronology3.weeks();
        org.joda.time.DurationField durationField18 = gJChronology3.seconds();
        org.joda.time.DurationField durationField19 = gJChronology3.months();
        org.joda.time.DurationField durationField20 = gJChronology3.minutes();
        org.joda.time.DurationField durationField21 = gJChronology3.years();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = gJChronology3.get(readablePeriod22, 161463L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DurationField durationField8 = gJChronology3.seconds();
        int int9 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = gJChronology3.add(readablePeriod10, 100L, 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField15 = gJChronology3.millis();
        org.joda.time.DurationField durationField16 = gJChronology3.millis();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.seconds();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16, (int) (short) 1);
        boolean boolean20 = gJChronology18.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.year();
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology18.getZone();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology18.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology18.getZone();
        org.joda.time.Chronology chronology25 = gJChronology3.withZone(dateTimeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        java.lang.String str27 = gJChronology26.toString();
        java.lang.String str28 = gJChronology26.toString();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30, (int) (short) 1);
        boolean boolean34 = gJChronology32.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.year();
        org.joda.time.DateTimeZone dateTimeZone36 = gJChronology32.getZone();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, readableInstant38, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField41 = gJChronology40.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        long long45 = gJChronology40.add(readablePeriod42, (long) (short) 1, (int) (byte) -1);
        long long50 = gJChronology40.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField51 = gJChronology40.millis();
        boolean boolean52 = gJChronology32.equals((java.lang.Object) gJChronology40);
        org.joda.time.DurationField durationField53 = gJChronology40.seconds();
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField55 = gJChronology54.weeks();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology54.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology54.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = gJChronology54.getZone();
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58);
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58);
        org.joda.time.Chronology chronology61 = gJChronology40.withZone(dateTimeZone58);
        org.joda.time.Chronology chronology62 = gJChronology26.withZone(dateTimeZone58);
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58, (-85747999L), 4);
        org.joda.time.DateTimeField dateTimeField66 = gJChronology65.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField67 = gJChronology65.minuteOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "GJChronology[Etc/UTC]" + "'", str27, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "GJChronology[Etc/UTC]" + "'", str28, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-61062076799990L) + "'", long50 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(gJChronology54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(gJChronology59);
        org.junit.Assert.assertNotNull(gJChronology60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(gJChronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.millisOfDay();
        int int11 = gJChronology3.getMinimumDaysInFirstWeek();
        boolean boolean13 = gJChronology3.equals((java.lang.Object) (-49798948L));
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = gJChronology3.add(readablePeriod14, (long) (byte) 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.minuteOfDay();
        org.joda.time.DurationField durationField19 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology3.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray14 = new int[] { (short) 100, 4 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology3.validate(readablePartial11, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 4]");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology5.add(readablePeriod7, (long) (short) 1, (int) (byte) -1);
        long long15 = gJChronology5.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField16 = gJChronology5.seconds();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology5.getZone();
        org.joda.time.Chronology chronology18 = gJChronology0.withZone(dateTimeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.clockhourOfDay();
        org.joda.time.DurationField durationField21 = gJChronology19.centuries();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.dayOfYear();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61062076799990L) + "'", long15 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.yearOfEra();
        java.lang.String str19 = gJChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, readableInstant21, (int) (short) 1);
        boolean boolean25 = gJChronology23.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField26 = gJChronology23.dayOfYear();
        org.joda.time.DurationField durationField27 = gJChronology23.days();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology23.weekyear();
        boolean boolean29 = gJChronology3.equals((java.lang.Object) gJChronology23);
        org.joda.time.DateTimeField dateTimeField30 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField33 = gJChronology3.months();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str19, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.halfdayOfDay();
        org.joda.time.DurationField durationField8 = gJChronology3.days();
        org.joda.time.DurationField durationField9 = gJChronology3.seconds();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.year();
        org.joda.time.DurationField durationField10 = gJChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.yearOfCentury();
        org.joda.time.DurationField durationField13 = gJChronology3.days();
        org.joda.time.Instant instant14 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.DurationField durationField9 = gJChronology3.seconds();
        org.joda.time.Instant instant10 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.millisOfSecond();
        org.joda.time.DurationField durationField13 = gJChronology3.months();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = gJChronology3.add(readablePeriod15, (-510L), (int) (byte) 1);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-510L) + "'", long18 == (-510L));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField17 = gJChronology3.weeks();
        org.joda.time.DurationField durationField18 = gJChronology3.seconds();
        org.joda.time.DurationField durationField19 = gJChronology3.months();
        org.joda.time.DurationField durationField20 = gJChronology3.minutes();
        org.joda.time.DurationField durationField21 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology3.millisOfSecond();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.halfdayOfDay();
        long long23 = gJChronology3.add(10L, (-51L), 4);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology3.minuteOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-194L) + "'", long23 == (-194L));
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weekyears();
        java.lang.String str15 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.hourOfHalfday();
        org.joda.time.Chronology chronology18 = gJChronology3.withUTC();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str15, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        java.lang.String str8 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, readableInstant11, (int) (short) 1);
        org.joda.time.Chronology chronology14 = gJChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.yearOfEra();
        org.joda.time.Instant instant16 = gJChronology13.getGregorianCutover();
        boolean boolean17 = gJChronology3.equals((java.lang.Object) gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str8, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.DurationField durationField9 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.clockhourOfDay();
        org.joda.time.Chronology chronology13 = gJChronology3.withUTC();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.seconds();
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.dayOfMonth();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.Instant instant16 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.halfdayOfDay();
        org.joda.time.DurationField durationField18 = gJChronology3.weeks();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.era();
        org.joda.time.DurationField durationField17 = gJChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.weekyear();
        org.joda.time.DurationField durationField19 = gJChronology3.months();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology3 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekyear();
        org.joda.time.DurationField durationField5 = gJChronology0.minutes();
        java.lang.String str6 = gJChronology0.toString();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GJChronology[Etc/UTC]" + "'", str6, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.secondOfMinute();
        org.joda.time.DurationField durationField7 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = gJChronology3.millis();
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology12);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfMonth();
        long long13 = gJChronology3.add((long) (short) 1, 52L, (-1));
        org.joda.time.DurationField durationField14 = gJChronology3.centuries();
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-51L) + "'", long13 == (-51L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.seconds();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16, (int) (short) 1);
        boolean boolean20 = gJChronology18.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.year();
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology18.getZone();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology18.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology18.getZone();
        org.joda.time.Chronology chronology25 = gJChronology3.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = gJChronology32.add(readablePeriod34, (long) (short) 1, (int) (byte) -1);
        long long42 = gJChronology32.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField43 = gJChronology32.millis();
        org.joda.time.DurationField durationField44 = gJChronology32.centuries();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology32.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology32.dayOfWeek();
        org.joda.time.DurationField durationField47 = gJChronology32.weekyears();
        org.joda.time.DurationField durationField48 = gJChronology32.halfdays();
        org.joda.time.Instant instant49 = gJChronology32.getGregorianCutover();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) instant49, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-61062076799990L) + "'", long42 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(instant49);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology5.add(readablePeriod7, (long) (short) 1, (int) (byte) -1);
        long long15 = gJChronology5.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField16 = gJChronology5.seconds();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology5.getZone();
        org.joda.time.Chronology chronology18 = gJChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = gJChronology22.add(readablePeriod24, (long) (short) 1, (int) (byte) -1);
        long long32 = gJChronology22.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField33 = gJChronology22.seconds();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35, (int) (short) 1);
        boolean boolean39 = gJChronology37.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.year();
        org.joda.time.DateTimeZone dateTimeZone41 = gJChronology37.getZone();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology37.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = gJChronology37.getZone();
        org.joda.time.Chronology chronology44 = gJChronology22.withZone(dateTimeZone43);
        org.joda.time.Chronology chronology45 = gJChronology0.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, readableInstant47, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology49.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        long long54 = gJChronology49.add(readablePeriod51, (long) (short) 1, (int) (byte) -1);
        org.joda.time.Instant instant55 = gJChronology49.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, (org.joda.time.ReadableInstant) instant55, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58, readableInstant59, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        long long66 = gJChronology61.add(readablePeriod63, (long) (short) 1, (int) (byte) -1);
        long long70 = gJChronology61.add(1L, (long) '4', (int) (short) 0);
        org.joda.time.Instant instant71 = gJChronology61.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology72 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, (org.joda.time.ReadableInstant) instant71);
        org.joda.time.DateTimeField dateTimeField73 = gJChronology72.secondOfMinute();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61062076799990L) + "'", long15 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61062076799990L) + "'", long32 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(gJChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(gJChronology57);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(instant71);
        org.junit.Assert.assertNotNull(gJChronology72);
        org.junit.Assert.assertNotNull(dateTimeField73);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.halfdayOfDay();
        long long23 = gJChronology3.add(10L, (-51L), 4);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology3.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-194L) + "'", long23 == (-194L));
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.era();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.weekyear();
        java.lang.String str17 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = gJChronology3.add(readablePeriod19, (-71399996L), (int) '4');
        org.joda.time.DateTimeField dateTimeField23 = gJChronology3.weekyear();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str17, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-71399996L) + "'", long22 == (-71399996L));
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = gJChronology0.centuries();
        org.joda.time.DurationField durationField4 = gJChronology0.days();
        org.joda.time.DurationField durationField5 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.minuteOfHour();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology21.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = gJChronology21.add(readablePeriod23, (long) (short) 1, (int) (byte) -1);
        long long31 = gJChronology21.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField32 = gJChronology21.seconds();
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology21.getZone();
        org.joda.time.Chronology chronology34 = gJChronology16.withZone(dateTimeZone33);
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField36 = gJChronology35.clockhourOfDay();
        org.joda.time.DurationField durationField37 = gJChronology35.centuries();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology35.secondOfDay();
        boolean boolean39 = gJChronology3.equals((java.lang.Object) gJChronology35);
        org.joda.time.DurationField durationField40 = gJChronology35.years();
        org.joda.time.DurationField durationField41 = gJChronology35.centuries();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-61062076799990L) + "'", long31 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(durationField41);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        boolean boolean13 = gJChronology11.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.year();
        org.joda.time.Instant instant15 = gJChronology11.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant15);
        long long20 = gJChronology16.add((long) (short) 10, (long) 10, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.monthOfYear();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.millisOfDay();
        org.joda.time.DurationField durationField23 = gJChronology16.years();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 110L + "'", long20 == 110L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.halfdayOfDay();
        org.joda.time.Instant instant8 = gJChronology3.getGregorianCutover();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = gJChronology3.add(readablePeriod9, 53238L, (int) (short) 10);
        org.joda.time.DurationField durationField13 = gJChronology3.hours();
        org.joda.time.DurationField durationField14 = gJChronology3.years();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 53238L + "'", long12 == 53238L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.Chronology chronology7 = gJChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = gJChronology3.months();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.yearOfCentury();
        org.joda.time.DurationField durationField18 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology3.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.year();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.dayOfMonth();
        long long11 = gJChronology3.add((-1L), (long) (short) 0, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField13 = gJChronology3.centuries();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        java.lang.String str6 = gJChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        boolean boolean12 = gJChronology10.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.year();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16, (int) (short) 1);
        boolean boolean20 = gJChronology18.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.year();
        org.joda.time.Instant instant22 = gJChronology18.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant22, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26, (int) (short) 1);
        boolean boolean30 = gJChronology28.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.year();
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology28.getZone();
        org.joda.time.Chronology chronology33 = gJChronology24.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology34 = gJChronology3.withZone(dateTimeZone32);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, (long) (short) -1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField38 = gJChronology37.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology37.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str6, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology5 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = gJChronology10.add(readablePeriod12, (long) (short) 1, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        org.joda.time.Chronology chronology17 = gJChronology0.withZone(dateTimeZone16);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField19 = gJChronology18.centuries();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.secondOfMinute();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.year();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.hourOfDay();
        org.joda.time.DurationField durationField8 = gJChronology3.days();
        org.joda.time.DurationField durationField9 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.DurationField durationField17 = gJChronology14.days();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.Chronology chronology19 = gJChronology3.withZone(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, readableInstant17, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = gJChronology19.add(readablePeriod21, (long) (short) 1, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology19.getZone();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.yearOfCentury();
        org.joda.time.Instant instant34 = gJChronology31.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, (org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = gJChronology3.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField37 = gJChronology3.years();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Chronology chronology18 = gJChronology3.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology3.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = gJChronology3.add(readablePeriod21, 3130053L, (int) '4');
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3130053L + "'", long24 == 3130053L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology11.add(readablePeriod13, (long) (short) 1, (int) (byte) -1);
        long long21 = gJChronology11.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField22 = gJChronology11.millis();
        boolean boolean23 = gJChronology3.equals((java.lang.Object) gJChronology11);
        org.joda.time.DurationField durationField24 = gJChronology11.seconds();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField26 = gJChronology25.weeks();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = gJChronology25.getZone();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.Chronology chronology32 = gJChronology11.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology11.weekyear();
        int int34 = gJChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology11.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61062076799990L) + "'", long21 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField17 = gJChronology3.weeks();
        org.joda.time.DurationField durationField18 = gJChronology3.seconds();
        org.joda.time.DurationField durationField19 = gJChronology3.months();
        org.joda.time.DurationField durationField20 = gJChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology3.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.monthOfYear();
        org.joda.time.DurationField durationField11 = gJChronology3.seconds();
        org.joda.time.DurationField durationField12 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.dayOfWeek();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DurationField durationField8 = gJChronology3.days();
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology3.getZone();
        org.joda.time.DurationField durationField10 = gJChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.dayOfMonth();
        long long15 = gJChronology3.add((long) '4', (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 51L + "'", long15 == 51L);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology5.add(readablePeriod7, (long) (short) 1, (int) (byte) -1);
        long long15 = gJChronology5.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField16 = gJChronology5.seconds();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology5.getZone();
        org.joda.time.Chronology chronology18 = gJChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = gJChronology22.add(readablePeriod24, (long) (short) 1, (int) (byte) -1);
        long long32 = gJChronology22.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField33 = gJChronology22.seconds();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35, (int) (short) 1);
        boolean boolean39 = gJChronology37.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.year();
        org.joda.time.DateTimeZone dateTimeZone41 = gJChronology37.getZone();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology37.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = gJChronology37.getZone();
        org.joda.time.Chronology chronology44 = gJChronology22.withZone(dateTimeZone43);
        org.joda.time.Chronology chronology45 = gJChronology0.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, readableInstant47, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology49.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        long long54 = gJChronology49.add(readablePeriod51, (long) (short) 1, (int) (byte) -1);
        org.joda.time.Instant instant55 = gJChronology49.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology57 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, (org.joda.time.ReadableInstant) instant55, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone58, readableInstant59, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField62 = gJChronology61.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        long long66 = gJChronology61.add(readablePeriod63, (long) (short) 1, (int) (byte) -1);
        long long70 = gJChronology61.add(1L, (long) '4', (int) (short) 0);
        org.joda.time.Instant instant71 = gJChronology61.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology72 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, (org.joda.time.ReadableInstant) instant71);
        org.joda.time.DurationField durationField73 = gJChronology72.halfdays();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology72.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61062076799990L) + "'", long15 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-61062076799990L) + "'", long32 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(gJChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(gJChronology57);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(instant71);
        org.junit.Assert.assertNotNull(gJChronology72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology11.add(readablePeriod13, (long) (short) 1, (int) (byte) -1);
        long long21 = gJChronology11.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField22 = gJChronology11.millis();
        boolean boolean23 = gJChronology3.equals((java.lang.Object) gJChronology11);
        long long27 = gJChronology3.add((-61062076799990L), (long) (byte) 10, (int) (short) -1);
        int int28 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField29 = gJChronology3.centuries();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61062076799990L) + "'", long21 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-61062076800000L) + "'", long27 == (-61062076800000L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField9 = gJChronology3.eras();
        long long13 = gJChronology3.add(61033L, (-1631L), (int) (short) 1);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 59402L + "'", long13 == 59402L);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology5.add(readablePeriod7, (long) (short) 1, (int) (byte) -1);
        long long15 = gJChronology5.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField16 = gJChronology5.seconds();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology5.getZone();
        org.joda.time.Chronology chronology18 = gJChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = gJChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23, (int) (short) 1);
        org.joda.time.Chronology chronology26 = gJChronology25.withUTC();
        org.joda.time.DurationField durationField27 = gJChronology25.millis();
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology25.getZone();
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (-85747999L), 4);
        org.joda.time.Chronology chronology32 = gJChronology0.withZone(dateTimeZone28);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, readableInstant36, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField39 = gJChronology38.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = gJChronology38.add(readablePeriod40, (long) (short) 1, (int) (byte) -1);
        long long48 = gJChronology38.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField49 = gJChronology38.weeks();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology38.hourOfDay();
        int int51 = gJChronology38.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology38.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField53 = gJChronology38.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField55 = gJChronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology38.weekyearOfCentury();
        org.joda.time.Instant instant57 = gJChronology38.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) instant57);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-61062076799990L) + "'", long15 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-61062076799990L) + "'", long48 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertNotNull(gJChronology58);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DurationField durationField8 = gJChronology3.days();
        long long12 = gJChronology3.add((long) (-1), 10L, 1);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.era();
        org.joda.time.DurationField durationField15 = gJChronology3.millis();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DurationField durationField8 = gJChronology3.seconds();
        int int9 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.secondOfMinute();
        java.lang.Class<?> wildcardClass12 = dateTimeField11.getClass();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.Chronology chronology4 = gJChronology3.withUTC();
        org.joda.time.DurationField durationField5 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.halfdayOfDay();
        org.joda.time.DurationField durationField7 = gJChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        int int9 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray17 = new int[] { (byte) 0, '4', (-1), (short) 0, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology3.validate(readablePartial10, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 52, -1, 0, 100, 100]");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = gJChronology8.add(readablePeriod10, (long) (short) 1, (int) (byte) -1);
        long long18 = gJChronology8.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField19 = gJChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology8.millisOfSecond();
        org.joda.time.Instant instant22 = gJChronology8.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant22, 4);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology25.minuteOfHour();
        org.joda.time.DurationField durationField27 = gJChronology25.months();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology31.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = gJChronology31.add(readablePeriod33, (long) (short) 1, (int) (byte) -1);
        long long41 = gJChronology31.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField42 = gJChronology31.seconds();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, readableInstant44, (int) (short) 1);
        boolean boolean48 = gJChronology46.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField49 = gJChronology46.year();
        org.joda.time.DateTimeZone dateTimeZone50 = gJChronology46.getZone();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology46.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = gJChronology46.getZone();
        org.joda.time.Chronology chronology53 = gJChronology31.withZone(dateTimeZone52);
        org.joda.time.Chronology chronology54 = gJChronology25.withZone(dateTimeZone52);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField56 = gJChronology55.weeks();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology55.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology55.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone59 = gJChronology55.getZone();
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone61, readableInstant62, (int) (short) 1);
        boolean boolean66 = gJChronology64.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField67 = gJChronology64.year();
        org.joda.time.Instant instant68 = gJChronology64.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology69 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone59, (org.joda.time.ReadableInstant) instant68);
        org.joda.time.chrono.GJChronology gJChronology70 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, (org.joda.time.ReadableInstant) instant68);
        org.joda.time.chrono.GJChronology gJChronology71 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant68);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-61062076799990L) + "'", long18 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-61062076799990L) + "'", long41 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(gJChronology46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(gJChronology60);
        org.junit.Assert.assertNotNull(gJChronology64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(instant68);
        org.junit.Assert.assertNotNull(gJChronology69);
        org.junit.Assert.assertNotNull(gJChronology70);
        org.junit.Assert.assertNotNull(gJChronology71);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.era();
        org.joda.time.DurationField durationField6 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        boolean boolean13 = gJChronology11.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.year();
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology11.getZone();
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, 1665L, (int) (short) 1);
        org.joda.time.Chronology chronology19 = gJChronology3.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField20 = gJChronology3.minutes();
        org.joda.time.DurationField durationField21 = gJChronology3.seconds();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23, (int) (short) 1);
        boolean boolean27 = gJChronology25.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.year();
        org.joda.time.Instant instant29 = gJChronology25.getGregorianCutover();
        org.joda.time.DurationField durationField30 = gJChronology25.millis();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology25.year();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology25.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology25.getZone();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35, (int) (short) 1);
        boolean boolean39 = gJChronology37.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.year();
        org.joda.time.DateTimeZone dateTimeZone41 = gJChronology37.getZone();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone42, readableInstant43, (int) (short) 1);
        boolean boolean47 = gJChronology45.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField48 = gJChronology45.year();
        org.joda.time.Instant instant49 = gJChronology45.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology51 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone41, (org.joda.time.ReadableInstant) instant49, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52, readableInstant53, (int) (short) 1);
        boolean boolean57 = gJChronology55.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField58 = gJChronology55.year();
        org.joda.time.DateTimeZone dateTimeZone59 = gJChronology55.getZone();
        org.joda.time.Chronology chronology60 = gJChronology51.withZone(dateTimeZone59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.chrono.GJChronology gJChronology62 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone59, readableInstant61);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone63, readableInstant64, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField67 = gJChronology66.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        long long71 = gJChronology66.add(readablePeriod68, (long) (short) 1, (int) (byte) -1);
        long long76 = gJChronology66.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField77 = gJChronology66.millis();
        org.joda.time.DurationField durationField78 = gJChronology66.centuries();
        org.joda.time.Instant instant79 = gJChronology66.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology80 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone59, (org.joda.time.ReadableInstant) instant79);
        org.joda.time.chrono.GJChronology gJChronology82 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, (org.joda.time.ReadableInstant) instant79, 1);
        org.joda.time.Chronology chronology83 = gJChronology3.withZone(dateTimeZone33);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(gJChronology45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(gJChronology51);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(gJChronology62);
        org.junit.Assert.assertNotNull(gJChronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-61062076799990L) + "'", long76 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(durationField78);
        org.junit.Assert.assertNotNull(instant79);
        org.junit.Assert.assertNotNull(gJChronology80);
        org.junit.Assert.assertNotNull(gJChronology82);
        org.junit.Assert.assertNotNull(chronology83);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField19 = gJChronology3.days();
        org.joda.time.DurationField durationField20 = gJChronology3.minutes();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = gJChronology3.get(readablePeriod21, 3130001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weekyears();
        java.lang.String str15 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfDay();
        org.joda.time.DurationField durationField17 = gJChronology3.months();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = gJChronology3.add(readablePeriod18, 10L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField23 = gJChronology3.days();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str15, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.months();
        org.joda.time.DurationField durationField16 = gJChronology3.millis();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = gJChronology3.add(readablePeriod17, 100L, 10);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField22 = gJChronology3.hours();
        org.joda.time.DurationField durationField23 = gJChronology3.years();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField2 = gJChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField7 = gJChronology6.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = gJChronology6.add(readablePeriod8, (long) (short) 1, (int) (byte) -1);
        long long16 = gJChronology6.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField17 = gJChronology6.seconds();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19, (int) (short) 1);
        boolean boolean23 = gJChronology21.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology21.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology21.getZone();
        org.joda.time.Chronology chronology28 = gJChronology6.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology29 = gJChronology0.withZone(dateTimeZone27);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField31 = gJChronology30.weeks();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = gJChronology30.getZone();
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37, (int) (short) 1);
        boolean boolean41 = gJChronology39.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField42 = gJChronology39.year();
        org.joda.time.Instant instant43 = gJChronology39.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, 9L, (int) (short) 1);
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-61062076799990L) + "'", long16 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(gJChronology39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertNotNull(gJChronology45);
        org.junit.Assert.assertNotNull(gJChronology48);
        org.junit.Assert.assertNotNull(gJChronology49);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        boolean boolean13 = gJChronology11.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.year();
        org.joda.time.Instant instant15 = gJChronology11.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant15);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = gJChronology16.months();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.weekyearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DurationField durationField8 = gJChronology3.seconds();
        int int9 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = gJChronology3.add(readablePeriod10, 100L, 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.weekOfWeekyear();
        org.joda.time.Instant instant15 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.minuteOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = gJChronology14.add(readablePeriod16, (long) (short) 1, (int) (byte) -1);
        long long24 = gJChronology14.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField25 = gJChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology14.yearOfCentury();
        org.joda.time.Chronology chronology27 = gJChronology14.withUTC();
        org.joda.time.DurationField durationField28 = gJChronology14.seconds();
        org.joda.time.Instant instant29 = gJChronology14.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, (org.joda.time.ReadableInstant) instant29);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-61062076799990L) + "'", long24 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(gJChronology30);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.year();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DurationField durationField7 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.hourOfHalfday();
        org.joda.time.Chronology chronology13 = gJChronology3.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = gJChronology3.getDateTimeMillis((int) (byte) 1, (int) (short) -1, 0, 100, (int) '4', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.Chronology chronology9 = gJChronology3.withUTC();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = gJChronology15.add(readablePeriod17, (long) (short) 1, (int) (byte) -1);
        long long25 = gJChronology15.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField26 = gJChronology15.seconds();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology15.getZone();
        org.joda.time.Chronology chronology28 = gJChronology10.withZone(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology32.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = gJChronology32.add(readablePeriod34, (long) (short) 1, (int) (byte) -1);
        long long42 = gJChronology32.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField43 = gJChronology32.seconds();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44, readableInstant45, (int) (short) 1);
        boolean boolean49 = gJChronology47.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField50 = gJChronology47.year();
        org.joda.time.DateTimeZone dateTimeZone51 = gJChronology47.getZone();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology47.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = gJChronology47.getZone();
        org.joda.time.Chronology chronology54 = gJChronology32.withZone(dateTimeZone53);
        org.joda.time.Chronology chronology55 = gJChronology10.withZone(dateTimeZone53);
        org.joda.time.Chronology chronology56 = gJChronology3.withZone(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone57, readableInstant58, (int) (short) 1);
        boolean boolean62 = gJChronology60.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField63 = gJChronology60.centuryOfEra();
        org.joda.time.DurationField durationField64 = gJChronology60.centuries();
        org.joda.time.DurationField durationField65 = gJChronology60.days();
        org.joda.time.Instant instant66 = gJChronology60.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology67 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone53, (org.joda.time.ReadableInstant) instant66);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-61062076799990L) + "'", long25 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-61062076799990L) + "'", long42 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(gJChronology60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertNotNull(gJChronology67);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField17 = gJChronology3.weeks();
        org.joda.time.DurationField durationField18 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField20 = gJChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology3.clockhourOfDay();
        long long25 = gJChronology3.add((-61062076799990L), 10L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField26 = gJChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField27 = gJChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology3.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-61062076798990L) + "'", long25 == (-61062076798990L));
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField10 = gJChronology3.days();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = gJChronology3.get(readablePeriod11, 128L, 1665L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology11.add(readablePeriod13, (long) (short) 1, (int) (byte) -1);
        long long21 = gJChronology11.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField22 = gJChronology11.millis();
        boolean boolean23 = gJChronology3.equals((java.lang.Object) gJChronology11);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology11.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26, (int) (short) 1);
        boolean boolean30 = gJChronology28.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology28.weekyear();
        org.joda.time.Instant instant33 = gJChronology28.getGregorianCutover();
        long long39 = gJChronology28.getDateTimeMillis(32L, 4, 0, 10, (int) '#');
        org.joda.time.DateTimeField dateTimeField40 = gJChronology28.centuryOfEra();
        boolean boolean41 = gJChronology11.equals((java.lang.Object) gJChronology28);
        org.joda.time.DurationField durationField42 = gJChronology11.years();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology11.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61062076799990L) + "'", long21 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 14410035L + "'", long39 == 14410035L);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.era();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        java.lang.String str7 = gJChronology3.toString();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str7, "GJChronology[Etc/UTC,mdfw=1]");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = gJChronology3.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        boolean boolean13 = gJChronology11.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.year();
        org.joda.time.Instant instant15 = gJChronology11.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant15, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19, (int) (short) 1);
        boolean boolean23 = gJChronology21.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology21.getZone();
        org.joda.time.Chronology chronology26 = gJChronology17.withZone(dateTimeZone25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant27);
        org.joda.time.DateTimeField dateTimeField29 = gJChronology28.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, readableInstant31, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology33.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        long long38 = gJChronology33.add(readablePeriod35, (long) (short) 1, (int) (byte) -1);
        long long43 = gJChronology33.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField44 = gJChronology33.weekyears();
        java.lang.String str45 = gJChronology33.toString();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology33.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology33.hourOfHalfday();
        boolean boolean48 = gJChronology28.equals((java.lang.Object) dateTimeField47);
        int int49 = gJChronology28.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology28.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-61062076799990L) + "'", long43 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str45, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertNotNull(dateTimeField50);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = gJChronology3.halfdays();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology11.months();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = gJChronology17.add(readablePeriod19, (long) (short) 1, (int) (byte) -1);
        long long27 = gJChronology17.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField28 = gJChronology17.seconds();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30, (int) (short) 1);
        boolean boolean34 = gJChronology32.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.year();
        org.joda.time.DateTimeZone dateTimeZone36 = gJChronology32.getZone();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology32.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology32.getZone();
        org.joda.time.Chronology chronology39 = gJChronology17.withZone(dateTimeZone38);
        org.joda.time.Chronology chronology40 = gJChronology11.withZone(dateTimeZone38);
        boolean boolean41 = gJChronology3.equals((java.lang.Object) chronology40);
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology42.minuteOfHour();
        org.joda.time.DurationField durationField44 = gJChronology42.months();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45, readableInstant46, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField49 = gJChronology48.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        long long53 = gJChronology48.add(readablePeriod50, (long) (short) 1, (int) (byte) -1);
        long long58 = gJChronology48.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField59 = gJChronology48.seconds();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.chrono.GJChronology gJChronology63 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone60, readableInstant61, (int) (short) 1);
        boolean boolean65 = gJChronology63.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField66 = gJChronology63.year();
        org.joda.time.DateTimeZone dateTimeZone67 = gJChronology63.getZone();
        org.joda.time.DateTimeField dateTimeField68 = gJChronology63.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone69 = gJChronology63.getZone();
        org.joda.time.Chronology chronology70 = gJChronology48.withZone(dateTimeZone69);
        org.joda.time.Chronology chronology71 = gJChronology42.withZone(dateTimeZone69);
        org.joda.time.chrono.GJChronology gJChronology72 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField73 = gJChronology72.weeks();
        org.joda.time.DateTimeField dateTimeField74 = gJChronology72.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField75 = gJChronology72.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone76 = gJChronology72.getZone();
        org.joda.time.chrono.GJChronology gJChronology77 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.chrono.GJChronology gJChronology81 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone78, readableInstant79, (int) (short) 1);
        boolean boolean83 = gJChronology81.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField84 = gJChronology81.year();
        org.joda.time.Instant instant85 = gJChronology81.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology86 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone76, (org.joda.time.ReadableInstant) instant85);
        org.joda.time.chrono.GJChronology gJChronology87 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone69, (org.joda.time.ReadableInstant) instant85);
        org.joda.time.Chronology chronology88 = gJChronology3.withZone(dateTimeZone69);
        org.joda.time.DateTimeField dateTimeField89 = gJChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField90 = gJChronology3.halfdays();
        java.lang.String str91 = gJChronology3.toString();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-61062076799990L) + "'", long27 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(gJChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-61062076799990L) + "'", long58 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(gJChronology63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(gJChronology72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTimeZone76);
        org.junit.Assert.assertNotNull(gJChronology77);
        org.junit.Assert.assertNotNull(gJChronology81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertNotNull(instant85);
        org.junit.Assert.assertNotNull(gJChronology86);
        org.junit.Assert.assertNotNull(gJChronology87);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertNotNull(durationField90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str91, "GJChronology[Etc/UTC,mdfw=1]");
    }
}

