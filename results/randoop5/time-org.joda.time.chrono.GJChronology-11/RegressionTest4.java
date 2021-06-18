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
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, 1665L, (int) (short) 1);
        org.joda.time.DurationField durationField11 = gJChronology10.months();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.millisOfSecond();
        org.joda.time.DurationField durationField14 = gJChronology10.months();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.joda.time.DurationField durationField12 = gJChronology3.weeks();
        org.joda.time.DurationField durationField13 = gJChronology3.months();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = gJChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.hourOfDay();
        int int5 = gJChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField6 = gJChronology0.hours();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(durationField6);
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
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = gJChronology3.halfdays();
        org.joda.time.DurationField durationField11 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
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
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.year();
        org.joda.time.DurationField durationField10 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.dayOfMonth();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.joda.time.DurationField durationField19 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology3.era();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology3.weekyearOfCentury();
        org.joda.time.Chronology chronology23 = gJChronology3.withUTC();
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
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.joda.time.DurationField durationField19 = gJChronology3.halfdays();
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
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (long) (short) 100, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = gJChronology13.minutes();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.Chronology chronology4 = gJChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology3.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14, (int) (short) 1);
        boolean boolean18 = gJChronology16.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.dayOfYear();
        org.joda.time.DurationField durationField20 = gJChronology16.days();
        org.joda.time.DurationField durationField21 = gJChronology16.seconds();
        int int22 = gJChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.clockhourOfDay();
        org.joda.time.Instant instant24 = gJChronology16.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant24);
        java.lang.String str27 = gJChronology26.toString();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "GJChronology[Etc/UTC]" + "'", str27, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.DurationField durationField9 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.dayOfYear();
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
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DurationField durationField2 = gJChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.yearOfEra();
        java.lang.String str7 = gJChronology0.toString();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[Etc/UTC]" + "'", str7, "GJChronology[Etc/UTC]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology3.era();
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
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.weekyear();
        int int16 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, 9L, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology3.set(readablePartial9, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        java.lang.String str18 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.halfdayOfDay();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str18, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        boolean boolean18 = gJChronology3.equals((java.lang.Object) 10);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology3.clockhourOfDay();
        java.lang.String str21 = gJChronology3.toString();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str21, "GJChronology[Etc/UTC,mdfw=1]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.weekyearOfCentury();
        int int18 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = gJChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology3.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        long long17 = gJChronology3.add(readablePeriod14, (long) '4', (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField20 = gJChronology3.weekyears();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField5 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.millisOfSecond();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.hourOfHalfday();
        org.joda.time.Chronology chronology19 = gJChronology3.withUTC();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = gJChronology17.add(readablePeriod19, (long) (short) 1, (int) (byte) -1);
        long long27 = gJChronology17.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField28 = gJChronology17.millis();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology17.weekyear();
        org.joda.time.DurationField durationField30 = gJChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology17.secondOfDay();
        org.joda.time.DurationField durationField32 = gJChronology17.halfdays();
        org.joda.time.DurationField durationField33 = gJChronology17.hours();
        boolean boolean34 = gJChronology3.equals((java.lang.Object) gJChronology17);
        int int35 = gJChronology3.getMinimumDaysInFirstWeek();
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
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-61062076799990L) + "'", long27 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        org.joda.time.DateTimeField dateTimeField23 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology3.dayOfMonth();
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
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology3.getZone();
        org.joda.time.DurationField durationField9 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField12 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.yearOfEra();
        long long17 = gJChronology3.add((long) 'a', (long) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        org.joda.time.DateTimeField dateTimeField27 = gJChronology3.weekyear();
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
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        java.lang.String str20 = gJChronology3.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = gJChronology3.getDateTimeMillis(0, (int) (byte) 100, 0, (int) '4', 1, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str20, "GJChronology[Etc/UTC,mdfw=1]");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = gJChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.joda.time.DurationField durationField20 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology3.hourOfHalfday();
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
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField17 = gJChronology3.hours();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19, (int) (short) 1);
        boolean boolean23 = gJChronology21.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology21.year();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology21.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, readableInstant27, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField30 = gJChronology29.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology29.year();
        org.joda.time.DurationField durationField32 = gJChronology29.centuries();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology29.dayOfMonth();
        boolean boolean34 = gJChronology21.equals((java.lang.Object) dateTimeField33);
        int int35 = gJChronology21.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField36 = gJChronology21.months();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology21.secondOfMinute();
        boolean boolean38 = gJChronology3.equals((java.lang.Object) gJChronology21);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39, readableInstant40, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField43 = gJChronology42.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        long long47 = gJChronology42.add(readablePeriod44, (long) (short) 1, (int) (byte) -1);
        long long52 = gJChronology42.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField53 = gJChronology42.weeks();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology42.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField55 = gJChronology42.millisOfDay();
        org.joda.time.DateTimeField dateTimeField56 = gJChronology42.weekyearOfCentury();
        int int57 = gJChronology42.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology42.weekyearOfCentury();
        boolean boolean59 = gJChronology21.equals((java.lang.Object) gJChronology42);
        java.lang.String str60 = gJChronology21.toString();
        org.joda.time.DurationField durationField61 = gJChronology21.years();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-61062076799990L) + "'", long52 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "GJChronology[Etc/UTC,mdfw=1]" + "'", str60, "GJChronology[Etc/UTC,mdfw=1]");
        org.junit.Assert.assertNotNull(durationField61);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.year();
        long long9 = gJChronology3.add((long) 10, (long) (byte) 100, (int) (short) 0);
        org.joda.time.DurationField durationField10 = gJChronology3.weekyears();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = gJChronology3.add(readablePeriod11, 3130053L, 10);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3130053L + "'", long14 == 3130053L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology3.getZone();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, 1110L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology14.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology14.getZone();
        java.lang.Class<?> wildcardClass18 = dateTimeZone17.getClass();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(wildcardClass18);
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
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.era();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.millisOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology3.getZone();
        org.joda.time.DurationField durationField9 = gJChronology3.millis();
        org.joda.time.DurationField durationField10 = gJChronology3.minutes();
        org.joda.time.DurationField durationField11 = gJChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.minuteOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }
}

