import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = iSOChronology1.minutes();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        long long12 = iSOChronology1.getDateTimeMillis(0, (int) (byte) 10, (int) (short) 10, 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = iSOChronology1.get(readablePeriod13, (-947L), 117153220L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-62142767999900L) + "'", long12 == (-62142767999900L));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = iSOChronology1.add(readablePeriod6, 0L, (int) ' ');
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = iSOChronology1.add(readablePeriod10, (long) (short) 100, 1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = iSOChronology1.get(readablePartial15, (-62166441600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        long long18 = iSOChronology1.add(0L, 2101035L, (-1));
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField22 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-2101035L) + "'", long18 == (-2101035L));
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        java.lang.String str7 = iSOChronology6.toString();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology6.add(readablePeriod8, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology6.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.weekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology17.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology17.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
        long long25 = iSOChronology21.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology27.dayOfYear();
        org.joda.time.DurationField durationField29 = iSOChronology27.seconds();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology27.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology27.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology27.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology27.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        long long38 = iSOChronology27.add(readablePeriod35, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology27.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology27.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.ISOChronology iSOChronology42 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology42.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology42.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone45 = iSOChronology42.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology46 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone45);
        org.joda.time.chrono.ISOChronology iSOChronology47 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone45);
        org.joda.time.Chronology chronology48 = iSOChronology27.withZone(dateTimeZone45);
        org.joda.time.Chronology chronology49 = iSOChronology21.withZone(dateTimeZone45);
        org.joda.time.chrono.ISOChronology iSOChronology50 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone45);
        org.joda.time.chrono.ISOChronology iSOChronology51 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone45);
        org.joda.time.Chronology chronology52 = iSOChronology14.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField53 = iSOChronology14.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str7, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(iSOChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(iSOChronology46);
        org.junit.Assert.assertNotNull(iSOChronology47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(iSOChronology50);
        org.junit.Assert.assertNotNull(iSOChronology51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        org.joda.time.Chronology chronology10 = iSOChronology1.withUTC();
        org.joda.time.DurationField durationField11 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = iSOChronology1.get(readablePeriod13, 36644401L, (-62167219200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = iSOChronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.centuryOfEra();
        org.joda.time.DurationField durationField9 = iSOChronology5.centuries();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.dayOfYear();
        org.joda.time.DurationField durationField13 = iSOChronology11.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology11.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology19.getZone();
        org.joda.time.Chronology chronology23 = iSOChronology11.withZone(dateTimeZone22);
        org.joda.time.Chronology chronology24 = iSOChronology5.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology5.year();
        boolean boolean26 = iSOChronology0.equals((java.lang.Object) iSOChronology5);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(iSOChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, 0L, 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.halfdayOfDay();
        org.joda.time.DurationField durationField17 = iSOChronology13.halfdays();
        boolean boolean18 = iSOChronology1.equals((java.lang.Object) iSOChronology13);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology13.minuteOfHour();
        org.joda.time.DurationField durationField22 = iSOChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology1.getZone();
        java.lang.String str7 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.era();
        org.joda.time.DurationField durationField9 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str7, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfDay();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str5, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField7 = iSOChronology1.weeks();
        java.lang.String str8 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = iSOChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.centuryOfEra();
        org.joda.time.DurationField durationField20 = iSOChronology16.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.dayOfYear();
        org.joda.time.DurationField durationField24 = iSOChronology22.seconds();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology30.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = iSOChronology30.getZone();
        org.joda.time.Chronology chronology34 = iSOChronology22.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = iSOChronology16.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology36 = iSOChronology1.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology1.dayOfWeek();
        org.joda.time.DurationField durationField39 = iSOChronology1.hours();
        org.joda.time.DurationField durationField40 = iSOChronology1.months();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(durationField40);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.set(readablePartial9, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField9 = iSOChronology1.halfdays();
        org.joda.time.Chronology chronology10 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField2 = iSOChronology0.hours();
        org.joda.time.DurationField durationField3 = iSOChronology0.hours();
        org.joda.time.DurationField durationField4 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology0.getZone();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.millisOfDay();
        boolean boolean10 = iSOChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.era();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology1.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = iSOChronology1.getDateTimeMillis((int) (short) 100, 100, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField12 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField15 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.year();
        java.lang.String str20 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str20, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField5 = iSOChronology0.weeks();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField6 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField5 = iSOChronology1.millis();
        org.joda.time.DurationField durationField6 = iSOChronology1.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (-62142767999900L), (int) (byte) 10);
        org.joda.time.DurationField durationField13 = iSOChronology1.days();
        org.joda.time.Chronology chronology14 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-62142767999900L) + "'", long12 == (-62142767999900L));
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField13 = iSOChronology1.days();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology7.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = iSOChronology7.add(readablePeriod15, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology7.minutes();
        boolean boolean22 = iSOChronology1.equals((java.lang.Object) iSOChronology7);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = iSOChronology7.get(readablePeriod23, (-6217484288857074L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        java.lang.String str7 = iSOChronology6.toString();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology6.add(readablePeriod8, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology6.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str7, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.hourOfHalfday();
        org.joda.time.DurationField durationField9 = iSOChronology5.hours();
        org.joda.time.DurationField durationField10 = iSOChronology5.centuries();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.Chronology chronology7 = iSOChronology5.withUTC();
        java.lang.String str8 = iSOChronology5.toString();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology5.add(readablePeriod9, (-82184790L), (int) (byte) -1);
        org.joda.time.DurationField durationField13 = iSOChronology5.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-82184790L) + "'", long12 == (-82184790L));
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField8 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField9 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone11);
        java.lang.String str13 = iSOChronology12.toString();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = iSOChronology12.add(readablePeriod14, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = iSOChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology12.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology12.getZone();
        org.joda.time.Chronology chronology21 = iSOChronology1.withZone(dateTimeZone20);
        long long25 = iSOChronology1.add(0L, 102830L, (int) (short) 10);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(iSOChronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str13, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1028300L + "'", long25 == 1028300L);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.halfdayOfDay();
        java.lang.String str16 = iSOChronology14.toString();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology14.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = iSOChronology14.years();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology14.dayOfWeek();
        org.joda.time.DurationField durationField20 = iSOChronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology14.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str16, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.millis();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = iSOChronology1.add(readablePeriod5, (long) '4', 10);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology22 = iSOChronology1.withZone(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology23.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology23.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology27.dayOfYear();
        org.joda.time.DurationField durationField29 = iSOChronology27.seconds();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology27.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology27.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology27.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology27.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology35.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology35.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = iSOChronology35.getZone();
        org.joda.time.Chronology chronology39 = iSOChronology27.withZone(dateTimeZone38);
        org.joda.time.chrono.ISOChronology iSOChronology40 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology40.halfdayOfDay();
        java.lang.String str42 = iSOChronology40.toString();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology40.yearOfEra();
        boolean boolean44 = iSOChronology23.equals((java.lang.Object) dateTimeField43);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology23.weekyear();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology23.monthOfYear();
        org.joda.time.DurationField durationField47 = iSOChronology23.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(iSOChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(iSOChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(iSOChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str42, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField47);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField10 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekyear();
        java.lang.String str12 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str12, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology1.getZone();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.minuteOfDay();
        long long10 = iSOChronology1.getDateTimeMillis(3500L, (int) (byte) 10, (int) (short) 10, 10, 0);
        org.joda.time.DurationField durationField11 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36610000L + "'", long10 == 36610000L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        java.lang.String str8 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = iSOChronology1.getZone();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DurationField durationField8 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField6 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.millisOfDay();
        boolean boolean10 = iSOChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DurationField durationField11 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.dayOfMonth();
        java.lang.String str14 = iSOChronology1.toString();
        org.joda.time.DurationField durationField15 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str14, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = iSOChronology0.months();
        org.joda.time.DurationField durationField9 = iSOChronology0.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField11 = iSOChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.dayOfYear();
        org.joda.time.DurationField durationField15 = iSOChronology13.seconds();
        org.joda.time.DurationField durationField16 = iSOChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.millisOfSecond();
        org.joda.time.DurationField durationField18 = iSOChronology13.hours();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology13.getZone();
        org.joda.time.Chronology chronology20 = iSOChronology1.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology1.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        java.lang.String str24 = iSOChronology23.toString();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = iSOChronology23.add(readablePeriod25, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology23.getZone();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = iSOChronology23.add(readablePeriod30, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology23.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology37.dayOfYear();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.era();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology37.era();
        java.lang.String str42 = iSOChronology37.toString();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology37.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone44 = iSOChronology37.getZone();
        org.joda.time.Chronology chronology45 = iSOChronology23.withZone(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology23.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.DurationField durationField49 = iSOChronology48.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology48.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology48.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.ISOChronology iSOChronology53 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone52);
        java.lang.String str54 = iSOChronology53.toString();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        long long58 = iSOChronology53.add(readablePeriod55, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone59 = iSOChronology53.getZone();
        org.joda.time.Chronology chronology60 = iSOChronology48.withZone(dateTimeZone59);
        org.joda.time.Chronology chronology61 = iSOChronology23.withZone(dateTimeZone59);
        boolean boolean62 = iSOChronology1.equals((java.lang.Object) iSOChronology23);
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology1.era();
        org.joda.time.DateTimeZone dateTimeZone65 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField66 = iSOChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str24, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(iSOChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str42, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(iSOChronology53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str54, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTimeField66);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        java.lang.Class<?> wildcardClass8 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfCentury();
        org.joda.time.Chronology chronology10 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField14 = iSOChronology1.years();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        long long12 = iSOChronology1.add((-61851600000000L), 610010L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.hourOfDay();
        org.joda.time.Chronology chronology15 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-61851599389990L) + "'", long12 == (-61851599389990L));
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.millisOfDay();
        boolean boolean10 = iSOChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.hourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField10 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField11 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology22 = iSOChronology1.withZone(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology23.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology23.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField9 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.centuryOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology9 = iSOChronology8.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = iSOChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.centuryOfEra();
        org.joda.time.DurationField durationField20 = iSOChronology16.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.dayOfYear();
        org.joda.time.DurationField durationField24 = iSOChronology22.seconds();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology30.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = iSOChronology30.getZone();
        org.joda.time.Chronology chronology34 = iSOChronology22.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = iSOChronology16.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology36 = iSOChronology1.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology39.clockhourOfDay();
        org.joda.time.DurationField durationField41 = iSOChronology39.months();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology39.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology39.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone44 = iSOChronology39.getZone();
        org.joda.time.Chronology chronology45 = iSOChronology1.withZone(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField48 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology1.clockhourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(iSOChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        long long11 = iSOChronology1.add(1L, (-62142728869948L), (int) ' ');
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1988567323838335L) + "'", long11 == (-1988567323838335L));
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, 0L, 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.halfdayOfDay();
        org.joda.time.DurationField durationField17 = iSOChronology13.halfdays();
        boolean boolean18 = iSOChronology1.equals((java.lang.Object) iSOChronology13);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology22.era();
        boolean boolean28 = iSOChronology1.equals((java.lang.Object) dateTimeField27);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology1.era();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology10.dayOfYear();
        org.joda.time.DurationField durationField12 = iSOChronology10.seconds();
        org.joda.time.DurationField durationField13 = iSOChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology10.weekyear();
        org.joda.time.DurationField durationField17 = iSOChronology10.centuries();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology10.millisOfSecond();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) iSOChronology10);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(iSOChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology6.minuteOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = iSOChronology1.getDateTimeMillis((int) '#', (int) (short) 100, 100, (int) (byte) 100, 1, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField6 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology9.era();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology9.era();
        java.lang.String str14 = iSOChronology9.toString();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology9.dayOfMonth();
        org.joda.time.DurationField durationField16 = iSOChronology9.weekyears();
        org.joda.time.DurationField durationField17 = iSOChronology9.weeks();
        boolean boolean18 = iSOChronology7.equals((java.lang.Object) iSOChronology9);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology7.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
        java.lang.String str22 = iSOChronology21.toString();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology21.minuteOfHour();
        java.lang.String str24 = iSOChronology21.toString();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology21.clockhourOfHalfday();
        boolean boolean26 = iSOChronology7.equals((java.lang.Object) iSOChronology21);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology21.secondOfDay();
        org.joda.time.DurationField durationField28 = iSOChronology21.centuries();
        long long32 = iSOChronology21.add(2364649L, 0L, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology21.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str14, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str22, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str24, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2364649L + "'", long32 == 2364649L);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology0.add(readablePeriod3, (long) 'a', (-1));
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        long long12 = iSOChronology1.add((long) 'a', (long) ' ', 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = iSOChronology1.add(readablePeriod13, 3670000L, 0);
        java.lang.String str17 = iSOChronology1.toString();
        org.joda.time.DurationField durationField18 = iSOChronology1.centuries();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3297L + "'", long12 == 3297L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3670000L + "'", long16 == 3670000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str17, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField10 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField11 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = iSOChronology1.hours();
        org.joda.time.DurationField durationField15 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField17 = iSOChronology1.hours();
        org.joda.time.DurationField durationField18 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePeriod8, 3104L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology15.era();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology15.era();
        java.lang.String str20 = iSOChronology15.toString();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology15.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology15.getZone();
        org.joda.time.Chronology chronology23 = iSOChronology1.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = iSOChronology1.getDateTimeMillis(0, (int) (byte) 1, (int) '4', 0, (int) (byte) 0, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str20, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField8 = iSOChronology1.centuries();
        org.joda.time.Chronology chronology9 = iSOChronology1.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = iSOChronology1.getDateTimeMillis((int) (short) 10, (int) '#', (int) (byte) 10, (int) '4', (int) (short) 100, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.set(readablePartial8, (-82184790L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.centuryOfEra();
        org.joda.time.Chronology chronology8 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField8 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField10 = iSOChronology1.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = iSOChronology1.getZone();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.hours();
        org.joda.time.DurationField durationField15 = iSOChronology1.months();
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        org.joda.time.Chronology chronology17 = iSOChronology1.withUTC();
        org.joda.time.DurationField durationField18 = iSOChronology1.minutes();
        java.lang.Class<?> wildcardClass19 = durationField18.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.years();
        long long6 = iSOChronology1.add(53L, (long) 'a', (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField8 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology11.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        long long19 = iSOChronology15.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology21.dayOfYear();
        org.joda.time.DurationField durationField23 = iSOChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology21.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology21.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = iSOChronology21.add(readablePeriod29, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology21.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology21.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.dayOfYear();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology36.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = iSOChronology36.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology40 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone39);
        org.joda.time.chrono.ISOChronology iSOChronology41 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone39);
        org.joda.time.Chronology chronology42 = iSOChronology21.withZone(dateTimeZone39);
        org.joda.time.Chronology chronology43 = iSOChronology15.withZone(dateTimeZone39);
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.dayOfMonth();
        boolean boolean46 = iSOChronology1.equals((java.lang.Object) iSOChronology44);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9753L + "'", long6 == 9753L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(iSOChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(iSOChronology40);
        org.junit.Assert.assertNotNull(iSOChronology41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(iSOChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = iSOChronology1.add(readablePeriod5, 0L, (int) (short) 100);
        org.joda.time.Chronology chronology9 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = iSOChronology1.getDateTimeMillis((int) (byte) 1, 10, 100, 10, (int) '#', 10, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.era();
        org.joda.time.DurationField durationField10 = iSOChronology1.days();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = iSOChronology1.add(readablePeriod11, (long) (byte) 1, 0);
        org.joda.time.DurationField durationField15 = iSOChronology1.millis();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = iSOChronology15.getZone();
        org.joda.time.Chronology chronology19 = iSOChronology7.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = iSOChronology1.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.year();
        org.joda.time.DurationField durationField22 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = iSOChronology1.weeks();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DurationField durationField8 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = iSOChronology1.add(readablePeriod10, 0L, (int) (byte) 0);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        long long9 = iSOChronology5.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = iSOChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology12.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = iSOChronology12.getZone();
        org.joda.time.Chronology chronology17 = iSOChronology5.withZone(dateTimeZone16);
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(iSOChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(iSOChronology18);
        org.junit.Assert.assertNotNull(iSOChronology19);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = iSOChronology1.add(readablePeriod5, 0L, (int) (short) 100);
        org.joda.time.Chronology chronology9 = iSOChronology1.withUTC();
        long long13 = iSOChronology1.add(11417L, 3670010L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField15 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 356002387L + "'", long13 == 356002387L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.getDateTimeMillis(36644401L, 0, (int) 'a', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        long long9 = iSOChronology1.add((long) (-1), (long) (-1), 0);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.hourOfDay();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray14 = new int[] { (byte) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial11, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology1.halfdays();
        long long8 = iSOChronology1.add((-62143545600000L), (-62171711938968L), (int) (short) 0);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62143545600000L) + "'", long8 == (-62143545600000L));
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = iSOChronology15.getZone();
        org.joda.time.Chronology chronology19 = iSOChronology7.withZone(dateTimeZone18);
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology22 = iSOChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField10 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField11 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.weekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = iSOChronology1.add(readablePeriod10, 2102035L, (int) (short) -1);
        org.joda.time.DurationField durationField14 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2102035L + "'", long13 == 2102035L);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DurationField durationField15 = iSOChronology1.years();
        org.joda.time.DurationField durationField16 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.clockhourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField8 = iSOChronology1.months();
        java.lang.String str9 = iSOChronology1.toString();
        org.joda.time.DurationField durationField10 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str9, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, 53L, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology1.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology11.months();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.clockhourOfDay();
        org.joda.time.DurationField durationField18 = iSOChronology16.months();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.millisOfDay();
        boolean boolean20 = iSOChronology11.equals((java.lang.Object) dateTimeField19);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology11.era();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology11.getZone();
        org.joda.time.Chronology chronology23 = iSOChronology1.withZone(dateTimeZone22);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField6 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField6 = iSOChronology1.weeks();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = iSOChronology8.add(readablePeriod12, 0L, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        java.lang.String str18 = iSOChronology17.toString();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology17.add(readablePeriod19, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology17.getZone();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = iSOChronology17.add(readablePeriod24, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology17.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology31.era();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology31.era();
        java.lang.String str36 = iSOChronology31.toString();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology31.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone38 = iSOChronology31.getZone();
        org.joda.time.Chronology chronology39 = iSOChronology17.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology17.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.chrono.ISOChronology iSOChronology42 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone41);
        org.joda.time.DurationField durationField43 = iSOChronology42.halfdays();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology42.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology42.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.chrono.ISOChronology iSOChronology47 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone46);
        java.lang.String str48 = iSOChronology47.toString();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = iSOChronology47.add(readablePeriod49, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone53 = iSOChronology47.getZone();
        org.joda.time.Chronology chronology54 = iSOChronology42.withZone(dateTimeZone53);
        org.joda.time.Chronology chronology55 = iSOChronology17.withZone(dateTimeZone53);
        org.joda.time.Chronology chronology56 = iSOChronology8.withZone(dateTimeZone53);
        org.joda.time.Chronology chronology57 = iSOChronology1.withZone(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.chrono.ISOChronology iSOChronology59 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology59.dayOfYear();
        org.joda.time.DateTimeField dateTimeField61 = iSOChronology59.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone62 = iSOChronology59.getZone();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology59.millisOfDay();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology59.era();
        org.joda.time.DurationField durationField65 = iSOChronology59.seconds();
        org.joda.time.DateTimeField dateTimeField66 = iSOChronology59.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField67 = iSOChronology59.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone68 = iSOChronology59.getZone();
        org.joda.time.Chronology chronology69 = iSOChronology1.withZone(dateTimeZone68);
        org.joda.time.DurationField durationField70 = iSOChronology1.months();
        org.joda.time.Chronology chronology71 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField72 = iSOChronology1.minuteOfDay();
        org.joda.time.DurationField durationField73 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str18, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str36, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(iSOChronology42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(iSOChronology47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str48, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(iSOChronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(durationField73);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.years();
        org.joda.time.DurationField durationField4 = iSOChronology1.halfdays();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray12 = new int[] { (byte) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial9, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 100]");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.joda.time.DurationField durationField8 = iSOChronology1.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DurationField durationField5 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        java.lang.String str8 = iSOChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology1.add(readablePeriod19, 100L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = iSOChronology26.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(durationField27);
    }
}

