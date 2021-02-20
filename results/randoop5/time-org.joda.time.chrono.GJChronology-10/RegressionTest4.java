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
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.era();
        org.joda.time.DurationField durationField6 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.monthOfYear();
        org.joda.time.DurationField durationField9 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology3.get(readablePeriod11, (-1631L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
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
        org.joda.time.DurationField durationField21 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology3.year();
        long long26 = gJChronology3.add((-49798948L), 3156L, 0);
        org.joda.time.DateTimeField dateTimeField27 = gJChronology3.weekyearOfCentury();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-49798948L) + "'", long26 == (-49798948L));
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.era();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
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
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.halfdayOfDay();
        int int22 = gJChronology19.getMinimumDaysInFirstWeek();
        java.lang.String str23 = gJChronology19.toString();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology19.clockhourOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GJChronology[Etc/UTC]" + "'", str23, "GJChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.joda.time.DurationField durationField33 = gJChronology0.years();
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
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.yearOfCentury();
        org.joda.time.DurationField durationField11 = gJChronology3.weeks();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = gJChronology3.get(readablePeriod12, 1921010L, 532371L);
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
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.halfdayOfDay();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
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
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.yearOfCentury();
        org.joda.time.Chronology chronology16 = gJChronology3.withUTC();
        org.joda.time.DurationField durationField17 = gJChronology3.seconds();
        org.joda.time.Instant instant18 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.hourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61062076799990L) + "'", long13 == (-61062076799990L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.millisOfSecond();
        int int19 = gJChronology3.getMinimumDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = gJChronology3.getDateTimeMillis((-49798848L), (int) 'a', (int) (short) 0, 0, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, (-510L), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(dateTimeZone21);
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
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.yearOfCentury();
        org.joda.time.DurationField durationField18 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = gJChronology3.centuries();
        long long26 = gJChronology3.getDateTimeMillis(51L, 0, (int) ' ', (int) (short) 1, (int) (short) 10);
        org.joda.time.DurationField durationField27 = gJChronology3.halfdays();
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
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1921010L + "'", long26 == 1921010L);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology3.getZone();
        org.joda.time.DurationField durationField9 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.era();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField13 = gJChronology3.halfdays();
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
}

