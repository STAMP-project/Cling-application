import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DurationField durationField11 = iSOChronology9.seconds();
        org.joda.time.DurationField durationField12 = iSOChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = iSOChronology9.millis();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology9.centuryOfEra();
        boolean boolean20 = iSOChronology1.equals((java.lang.Object) iSOChronology9);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField22 = iSOChronology9.seconds();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology9.secondOfDay();
        org.joda.time.DurationField durationField24 = iSOChronology9.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField6 = iSOChronology0.days();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        java.lang.String str9 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str9, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        java.lang.String str4 = iSOChronology1.toString();
        org.joda.time.DurationField durationField5 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField6 = iSOChronology1.seconds();
        long long10 = iSOChronology1.add(0L, 0L, (int) (short) 1);
        org.joda.time.DurationField durationField11 = iSOChronology1.years();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str4, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        org.joda.time.DurationField durationField14 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = iSOChronology1.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        long long20 = iSOChronology1.add((long) (byte) -1, (long) (byte) 0, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = iSOChronology1.getDateTimeMillis((int) (short) 10, (int) (byte) 0, 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3297L + "'", long12 == 3297L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3670000L + "'", long16 == 3670000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.secondOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField40 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology1.weekyearOfCentury();
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
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = iSOChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology12.millisOfDay();
        org.joda.time.DurationField durationField18 = iSOChronology12.centuries();
        org.joda.time.DurationField durationField19 = iSOChronology12.hours();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology12.hourOfDay();
        boolean boolean21 = iSOChronology1.equals((java.lang.Object) dateTimeField20);
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology1.year();
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
        org.junit.Assert.assertNotNull(iSOChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        java.lang.String str8 = iSOChronology1.toString();
        org.joda.time.DurationField durationField9 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.year();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology15 = iSOChronology1.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.dayOfYear();
        org.joda.time.DurationField durationField19 = iSOChronology17.seconds();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology17.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology25.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = iSOChronology25.getZone();
        org.joda.time.Chronology chronology29 = iSOChronology17.withZone(dateTimeZone28);
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.halfdayOfDay();
        java.lang.String str32 = iSOChronology30.toString();
        boolean boolean33 = iSOChronology1.equals((java.lang.Object) str32);
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology1.hourOfDay();
        org.joda.time.DurationField durationField35 = iSOChronology1.months();
        org.joda.time.DurationField durationField36 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long45 = iSOChronology1.getDateTimeMillis((int) (byte) 0, (int) (short) -1, (int) (short) 100, (int) (short) 10, 10, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(iSOChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str32, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        java.lang.String str3 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology6.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology6.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = iSOChronology13.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        long long21 = iSOChronology17.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology17.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField25 = iSOChronology24.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = iSOChronology24.getZone();
        org.joda.time.Chronology chronology29 = iSOChronology17.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology30 = iSOChronology6.withZone(dateTimeZone28);
        boolean boolean31 = iSOChronology0.equals((java.lang.Object) dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray34 = iSOChronology0.get(readablePeriod32, (-62171711938968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str3, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        long long6 = iSOChronology0.getDateTimeMillis(0L, 1, 1, (int) (byte) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = iSOChronology0.add(readablePeriod10, (long) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = iSOChronology0.getDateTimeMillis(601001L, (int) '#', (int) (byte) 10, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3670000L + "'", long6 == 3670000L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField12 = iSOChronology1.weekyears();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        java.lang.String str15 = iSOChronology14.toString();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = iSOChronology14.add(readablePeriod16, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology14.getZone();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = iSOChronology14.add(readablePeriod21, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology14.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology14.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology28.era();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology28.era();
        java.lang.String str33 = iSOChronology28.toString();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology28.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone35 = iSOChronology28.getZone();
        org.joda.time.Chronology chronology36 = iSOChronology14.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology14.secondOfDay();
        org.joda.time.DurationField durationField38 = iSOChronology14.seconds();
        boolean boolean39 = iSOChronology1.equals((java.lang.Object) iSOChronology14);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = iSOChronology14.get(readablePeriod40, 610010L);
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
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(iSOChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str33, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField5 = iSOChronology1.years();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.dayOfYear();
        org.joda.time.DurationField durationField10 = iSOChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = iSOChronology8.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology15 = iSOChronology1.withZone(dateTimeZone13);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(iSOChronology17);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        org.joda.time.DurationField durationField18 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.hourOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.minuteOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DurationField durationField7 = iSOChronology1.months();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = iSOChronology1.add(readablePeriod7, 3670000L, (int) (short) 10);
        org.joda.time.DurationField durationField11 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3670000L + "'", long10 == 3670000L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField12 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.hourOfDay();
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
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        java.lang.Class<?> wildcardClass14 = dateTimeField13.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.era();
        org.joda.time.DurationField durationField9 = iSOChronology1.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        org.joda.time.DurationField durationField9 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField10 = iSOChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = iSOChronology1.withZone(dateTimeZone11);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField10 = iSOChronology1.halfdays();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = iSOChronology1.add(readablePeriod11, 36010010L, 0);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36010010L + "'", long14 == 36010010L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        org.joda.time.DateTimeZone dateTimeZone10 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = iSOChronology11.months();
        java.lang.String str13 = iSOChronology11.toString();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str13, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology0.add(readablePeriod3, (long) 'a', (-1));
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.era();
        org.joda.time.DurationField durationField8 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField9 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = iSOChronology0.seconds();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = iSOChronology1.add(readablePeriod7, (long) (byte) -1, 100);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField12 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.weekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        long long11 = iSOChronology1.add(97L, 2101035L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.dayOfMonth();
        java.lang.String str13 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2100938L) + "'", long11 == (-2100938L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str13, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology14.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = iSOChronology14.add(readablePeriod17, (-1L), (int) (short) -1);
        org.joda.time.DurationField durationField21 = iSOChronology14.hours();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology23.dayOfYear();
        org.joda.time.DurationField durationField25 = iSOChronology23.seconds();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology23.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology31.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = iSOChronology31.getZone();
        org.joda.time.Chronology chronology35 = iSOChronology23.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology23.weekOfWeekyear();
        java.lang.String str37 = iSOChronology23.toString();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone38);
        org.joda.time.DurationField durationField40 = iSOChronology39.halfdays();
        boolean boolean41 = iSOChronology23.equals((java.lang.Object) durationField40);
        org.joda.time.DurationField durationField42 = iSOChronology23.seconds();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone45 = iSOChronology23.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology46 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone45);
        org.joda.time.Chronology chronology47 = iSOChronology14.withZone(dateTimeZone45);
        org.joda.time.ReadablePartial readablePartial48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray50 = iSOChronology14.get(readablePartial48, 0L);
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
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str37, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(iSOChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(iSOChronology46);
        org.junit.Assert.assertNotNull(chronology47);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology0.seconds();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology1.millis();
        org.joda.time.DurationField durationField12 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField14 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.yearOfEra();
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
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField19 = iSOChronology1.millis();
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
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        long long9 = iSOChronology5.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology5.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        java.lang.String str18 = iSOChronology17.toString();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology17.add(readablePeriod19, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology17.getZone();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = iSOChronology17.add(readablePeriod24, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField28 = iSOChronology17.hours();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology17.year();
        boolean boolean32 = iSOChronology1.equals((java.lang.Object) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology17.year();
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
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str18, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.Chronology chronology10 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology1.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology1.days();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField15 = iSOChronology1.weeks();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.centuryOfEra();
        org.joda.time.Chronology chronology9 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.Chronology chronology10 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField13 = iSOChronology1.millis();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = iSOChronology1.get(readablePeriod14, (-9968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        long long13 = iSOChronology1.getDateTimeMillis(0L, 0, (int) (byte) 10, (int) (short) 10, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = iSOChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology16.dayOfYear();
        boolean boolean22 = iSOChronology1.equals((java.lang.Object) dateTimeField21);
        org.joda.time.DurationField durationField23 = iSOChronology1.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 610010L + "'", long13 == 610010L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField6 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        java.lang.String str9 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str9, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        org.joda.time.DurationField durationField14 = iSOChronology1.minutes();
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
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.millisOfDay();
        java.lang.String str16 = iSOChronology1.toString();
        org.joda.time.ReadablePartial readablePartial17 = null;
        int[] intArray23 = new int[] { '4', '4', (byte) 1, (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial17, intArray23);
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
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str16, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 52, 1, 10, 0]");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        org.joda.time.DurationField durationField25 = iSOChronology23.eras();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = iSOChronology23.get(readablePeriod26, 0L, (-62171711938968L));
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
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = iSOChronology1.add(readablePeriod7, 3670000L, (int) (short) 10);
        org.joda.time.DurationField durationField11 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3670000L + "'", long10 == 3670000L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        java.lang.String str8 = iSOChronology1.toString();
        java.lang.String str9 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = iSOChronology1.millis();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str9, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField17 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.weekOfWeekyear();
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
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.halfdayOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField9 = iSOChronology8.millis();
        org.joda.time.DurationField durationField10 = iSOChronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.minuteOfHour();
        long long16 = iSOChronology8.add(10L, (long) (byte) -1, 0);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology8.era();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) iSOChronology8);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology8.hourOfDay();
        java.lang.String str21 = iSOChronology8.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str21, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField25 = iSOChronology1.days();
        org.joda.time.DurationField durationField26 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology1.minuteOfDay();
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
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField4 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        long long11 = iSOChronology1.add(97L, 2101035L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = iSOChronology1.getDateTimeMillis(2101935L, (int) (short) -1, (int) ' ', 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2100938L) + "'", long11 == (-2100938L));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        long long23 = iSOChronology1.add(2467479L, 0L, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2467479L + "'", long23 == 2467479L);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology1.days();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField6 = iSOChronology5.millis();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology5.getZone();
        org.joda.time.Chronology chronology8 = iSOChronology1.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField19 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField20 = iSOChronology1.centuries();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology24.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology27.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology27.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = iSOChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology27.millisOfDay();
        org.joda.time.DurationField durationField32 = iSOChronology27.millis();
        boolean boolean33 = iSOChronology24.equals((java.lang.Object) durationField32);
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology24.year();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology24.minuteOfHour();
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
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(iSOChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField11 = iSOChronology1.seconds();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = iSOChronology13.getZone();
        org.joda.time.DurationField durationField16 = iSOChronology13.seconds();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone17);
        java.lang.String str19 = iSOChronology18.toString();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = iSOChronology18.add(readablePeriod20, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = iSOChronology18.getZone();
        org.joda.time.Chronology chronology25 = iSOChronology13.withZone(dateTimeZone24);
        org.joda.time.Chronology chronology26 = iSOChronology1.withZone(dateTimeZone24);
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
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(iSOChronology18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str19, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        java.lang.String str18 = iSOChronology17.toString();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology17.add(readablePeriod19, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology17.getZone();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = iSOChronology17.add(readablePeriod24, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField28 = iSOChronology17.hours();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology17.year();
        boolean boolean32 = iSOChronology1.equals((java.lang.Object) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology1.monthOfYear();
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
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str18, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = iSOChronology1.add(readablePeriod7, (long) (byte) -1, 100);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = iSOChronology1.getDateTimeMillis((int) (short) 0, (int) (short) 100, (int) (byte) -1, (int) (byte) 1, (int) '#', (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        java.lang.String str6 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = iSOChronology0.get(readablePeriod11, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DurationField durationField20 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology25.era();
        org.joda.time.DurationField durationField27 = iSOChronology25.hours();
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
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(iSOChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField6 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.yearOfEra();
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
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePartial6, 3661035L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.dayOfYear();
        org.joda.time.DurationField durationField13 = iSOChronology11.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology11.centuryOfEra();
        boolean boolean19 = iSOChronology0.equals((java.lang.Object) iSOChronology11);
        org.joda.time.DurationField durationField20 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology0.minuteOfDay();
        java.lang.Class<?> wildcardClass22 = iSOChronology0.getClass();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = iSOChronology1.add(readablePeriod12, (-1000L), (int) 'a');
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1000L) + "'", long15 == (-1000L));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.secondOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology0.get(readablePartial8, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField9 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = iSOChronology1.minutes();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology1.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.era();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.era();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology5.millisOfDay();
        org.joda.time.DurationField durationField12 = iSOChronology5.halfdays();
        org.joda.time.DateTimeZone dateTimeZone13 = iSOChronology5.getZone();
        org.joda.time.Chronology chronology14 = iSOChronology1.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField14 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.clockhourOfDay();
        java.lang.Object obj17 = null;
        boolean boolean18 = iSOChronology1.equals(obj17);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField20 = iSOChronology1.years();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.Chronology chronology6 = iSOChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        java.lang.String str9 = iSOChronology8.toString();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.dayOfYear();
        org.joda.time.DurationField durationField12 = iSOChronology8.millis();
        org.joda.time.DateTimeZone dateTimeZone13 = iSOChronology8.getZone();
        org.joda.time.Chronology chronology14 = iSOChronology0.withZone(dateTimeZone13);
        long long22 = iSOChronology0.getDateTimeMillis((int) '4', 10, (int) (byte) 10, 1, 1, (int) ' ', (int) ' ');
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str9, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60501769107968L) + "'", long22 == (-60501769107968L));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfDay();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str5, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(iSOChronology8);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = iSOChronology1.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = iSOChronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology10.dayOfMonth();
        long long19 = iSOChronology10.add(0L, (long) (byte) 1, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology10.getZone();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology10.hourOfDay();
        boolean boolean22 = iSOChronology1.equals((java.lang.Object) dateTimeField21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = iSOChronology24.getZone();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology24.millisOfDay();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology24.era();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology24.era();
        org.joda.time.DurationField durationField31 = iSOChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology24.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology24.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology24.weekOfWeekyear();
        boolean boolean35 = iSOChronology1.equals((java.lang.Object) dateTimeField34);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(iSOChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.minutes();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = iSOChronology1.get(readablePeriod4, 601001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = iSOChronology1.add(readablePeriod4, (long) (short) 0, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        java.lang.Class<?> wildcardClass18 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField15 = iSOChronology1.weekyears();
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
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField11 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfDay();
        java.lang.Class<?> wildcardClass14 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField19 = iSOChronology1.years();
        org.joda.time.ReadablePartial readablePartial20 = null;
        int[] intArray22 = new int[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial20, intArray22);
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
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.millisOfSecond();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = iSOChronology1.add(readablePeriod7, (long) (byte) -1, 100);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField15 = iSOChronology1.months();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.monthOfYear();
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
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.joda.time.DurationField durationField8 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = iSOChronology1.get(readablePeriod10, (long) (-1), 0L);
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
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
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
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        org.joda.time.DateTimeZone dateTimeZone16 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField17 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField18 = iSOChronology1.hours();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology1.add(readablePeriod19, 249764477L, (int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = iSOChronology1.get(readablePeriod23, (-61851599389990L), 366444L);
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
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 249764477L + "'", long22 == 249764477L);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DurationField durationField20 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology25.millisOfSecond();
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
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(iSOChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.year();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology1.get(readablePeriod7, 356002387L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        org.joda.time.DurationField durationField10 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.clockhourOfHalfday();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        java.lang.String str4 = iSOChronology1.toString();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str4, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.dayOfMonth();
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
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        org.joda.time.DurationField durationField14 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.halfdayOfDay();
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
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = iSOChronology1.get(readablePeriod13, (-62134819189900L), (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        long long9 = iSOChronology1.add((long) (-1), (long) (-1), 0);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.minuteOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology5.years();
        java.lang.String str10 = iSOChronology5.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str10, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField8 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = iSOChronology1.add(readablePeriod10, 36010010L, 1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField16 = iSOChronology1.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36010010L + "'", long13 == 36010010L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        long long9 = iSOChronology5.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.dayOfYear();
        org.joda.time.DurationField durationField13 = iSOChronology11.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology11.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology11.add(readablePeriod19, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology11.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology26.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.Chronology chronology32 = iSOChronology11.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology33 = iSOChronology5.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField35 = iSOChronology5.centuries();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology5.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray41 = iSOChronology5.get(readablePeriod38, 97L, (-61851600000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.era();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology11.millisOfSecond();
        org.joda.time.DurationField durationField17 = iSOChronology11.eras();
        boolean boolean18 = iSOChronology1.equals((java.lang.Object) durationField17);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = iSOChronology1.getDateTimeMillis((int) '4', 10, 10, (int) (short) 10, (int) 'a', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfYear();
        org.joda.time.Chronology chronology5 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.clockhourOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology19.months();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology19.clockhourOfDay();
        boolean boolean24 = iSOChronology19.equals((java.lang.Object) (-1.0f));
        org.joda.time.DurationField durationField25 = iSOChronology19.centuries();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology19.hourOfHalfday();
        org.joda.time.DurationField durationField28 = iSOChronology19.days();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology19.dayOfMonth();
        boolean boolean31 = iSOChronology1.equals((java.lang.Object) dateTimeField30);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology1.minuteOfHour();
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
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(iSOChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField14 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField15 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField16 = iSOChronology1.years();
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, 53L, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.clockhourOfDay();
        org.joda.time.Chronology chronology9 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField8 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        org.joda.time.DurationField durationField10 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology1.weeks();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField8 = iSOChronology1.minutes();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.set(readablePartial9, (-62166441600000L));
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
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField2 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = iSOChronology0.set(readablePartial5, 36610097L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (-1L), (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.set(readablePartial8, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = iSOChronology1.get(readablePeriod10, (-2090762L), 2467579L);
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
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DurationField durationField20 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology1.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = iSOChronology1.getDateTimeMillis(0, (int) '#', 100, 100, (int) (short) 1, (int) 'a', (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField15 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField16 = iSOChronology1.months();
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
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
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
        org.joda.time.DurationField durationField14 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = iSOChronology1.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
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
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology11.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = iSOChronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology26.centuryOfEra();
        org.joda.time.DurationField durationField30 = iSOChronology26.centuries();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology32.dayOfYear();
        org.joda.time.DurationField durationField34 = iSOChronology32.seconds();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology32.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology32.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology32.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.chrono.ISOChronology iSOChronology40 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology40.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = iSOChronology40.getZone();
        org.joda.time.Chronology chronology44 = iSOChronology32.withZone(dateTimeZone43);
        org.joda.time.Chronology chronology45 = iSOChronology26.withZone(dateTimeZone43);
        org.joda.time.Chronology chronology46 = iSOChronology11.withZone(dateTimeZone43);
        org.joda.time.Chronology chronology47 = iSOChronology1.withZone(dateTimeZone43);
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone43);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
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
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(iSOChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(iSOChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(iSOChronology48);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.dayOfYear();
        org.joda.time.DurationField durationField19 = iSOChronology17.seconds();
        org.joda.time.DurationField durationField20 = iSOChronology17.weeks();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology17.centuryOfEra();
        boolean boolean23 = iSOChronology1.equals((java.lang.Object) dateTimeField22);
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
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray11 = new int[] { 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial8, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        long long7 = iSOChronology1.add(100L, (-1L), 0);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField9 = iSOChronology1.weekyears();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = iSOChronology1.add(readablePeriod10, (-6217516799996468L), (int) (byte) 1);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-6217516799996468L) + "'", long13 == (-6217516799996468L));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, 53L, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology1.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.era();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.hourOfHalfday();
        org.joda.time.DurationField durationField9 = iSOChronology5.years();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = iSOChronology5.get(readablePartial10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = iSOChronology1.days();
        java.lang.String str11 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.millisOfSecond();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str11, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField12 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.minuteOfHour();
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
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.era();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology1.years();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = iSOChronology1.add(readablePeriod12, 2467579L, (int) (short) 10);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2467579L + "'", long15 == 2467579L);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology14.hourOfDay();
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
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        org.joda.time.DurationField durationField14 = iSOChronology1.weekyears();
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
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.clockhourOfHalfday();
        java.lang.Class<?> wildcardClass19 = iSOChronology1.getClass();
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
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology1.hours();
        org.joda.time.DurationField durationField12 = iSOChronology1.seconds();
        java.lang.String str13 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology1);
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
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str13, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.year();
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
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        long long12 = iSOChronology1.add(3297L, (long) '#', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray17 = new int[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial15, intArray17);
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
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3297L + "'", long12 == 3297L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        long long7 = iSOChronology1.add(100L, (-1L), 0);
        org.joda.time.DurationField durationField8 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.clockhourOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        java.lang.String str18 = iSOChronology17.toString();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology17.add(readablePeriod19, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology17.getZone();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = iSOChronology17.add(readablePeriod24, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField28 = iSOChronology17.hours();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology17.year();
        boolean boolean32 = iSOChronology1.equals((java.lang.Object) iSOChronology17);
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology33.monthOfYear();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology33.monthOfYear();
        boolean boolean36 = iSOChronology1.equals((java.lang.Object) dateTimeField35);
        org.joda.time.DurationField durationField37 = iSOChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology39.dayOfYear();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology39.secondOfDay();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology39.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology39.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology39.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology39.clockhourOfHalfday();
        boolean boolean46 = iSOChronology1.equals((java.lang.Object) dateTimeField45);
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
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str18, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(iSOChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(iSOChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField15 = iSOChronology1.years();
        org.joda.time.DurationField durationField16 = iSOChronology1.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = iSOChronology1.getDateTimeMillis((-2100714L), (int) ' ', (int) (byte) -1, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        long long6 = iSOChronology1.add(10L, (long) ' ', (int) ' ');
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.getDateTimeMillis((-2101035L), (int) 'a', (int) ' ', (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1034L + "'", long6 == 1034L);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = iSOChronology1.get(readablePeriod18, 0L, 356002387L);
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
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.getDateTimeMillis((int) (short) -1, (int) 'a', (int) (short) 100, (int) (byte) 10, (int) (short) 1, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.hours();
        org.joda.time.DurationField durationField6 = iSOChronology1.weeks();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        java.lang.String str4 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str4, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField25 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology1.monthOfYear();
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
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        org.joda.time.Chronology chronology16 = iSOChronology1.withUTC();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = iSOChronology1.set(readablePartial17, (-62175167999965L));
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
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField14 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField15 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField16 = iSOChronology1.seconds();
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology14.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = iSOChronology14.add(readablePeriod17, (-1L), (int) (short) -1);
        org.joda.time.DurationField durationField21 = iSOChronology14.hours();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology14.weekyear();
        org.joda.time.DurationField durationField23 = iSOChronology14.years();
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
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology0.getDateTimeMillis(1100L, 1, (int) (byte) -1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfDay();
        java.lang.String str4 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        java.lang.String str6 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.minuteOfDay();
        java.lang.String str9 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str9, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        boolean boolean6 = iSOChronology1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField10 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology0.add(readablePeriod3, (long) 'a', (-1));
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology0.getDateTimeMillis((int) (short) -1, (int) (short) 100, (int) (byte) 100, (int) (byte) 1, (int) (short) 1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        boolean boolean22 = iSOChronology14.equals((java.lang.Object) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        java.lang.String str25 = iSOChronology24.toString();
        org.joda.time.DurationField durationField26 = iSOChronology24.millis();
        org.joda.time.DurationField durationField27 = iSOChronology24.hours();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology24.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology24.millisOfDay();
        boolean boolean31 = iSOChronology14.equals((java.lang.Object) dateTimeField30);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str25, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField12 = iSOChronology1.weekyears();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        java.lang.String str15 = iSOChronology14.toString();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = iSOChronology14.add(readablePeriod16, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology14.getZone();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = iSOChronology14.add(readablePeriod21, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology14.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology14.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology28.era();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology28.era();
        java.lang.String str33 = iSOChronology28.toString();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology28.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone35 = iSOChronology28.getZone();
        org.joda.time.Chronology chronology36 = iSOChronology14.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology14.secondOfDay();
        org.joda.time.DurationField durationField38 = iSOChronology14.seconds();
        boolean boolean39 = iSOChronology1.equals((java.lang.Object) iSOChronology14);
        org.joda.time.DurationField durationField40 = iSOChronology1.days();
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
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(iSOChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str33, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(durationField40);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology1.getDateTimeMillis(610010L, (int) (short) 1, (int) 'a', 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology1.months();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = iSOChronology0.add(readablePeriod4, (long) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = iSOChronology0.add(readablePeriod10, 0L, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
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
        org.junit.Assert.assertNotNull(iSOChronology21);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = iSOChronology0.add(readablePeriod4, 3297L, (int) (byte) 100);
        org.joda.time.DurationField durationField8 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.era();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3297L + "'", long7 == 3297L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.era();
        org.joda.time.Chronology chronology12 = iSOChronology1.withUTC();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.era();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfWeek();
        java.lang.Class<?> wildcardClass15 = dateTimeField14.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-62142767999900L) + "'", long12 == (-62142767999900L));
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField7 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField10 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        org.joda.time.DurationField durationField14 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = iSOChronology1.withZone(dateTimeZone18);
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
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.monthOfYear();
        org.joda.time.Chronology chronology12 = iSOChronology1.withUTC();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.weekOfWeekyear();
        java.lang.String str17 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str17, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology19.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        long long27 = iSOChronology23.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.dayOfYear();
        org.joda.time.DurationField durationField31 = iSOChronology29.seconds();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology29.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        long long40 = iSOChronology29.add(readablePeriod37, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology29.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology44.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = iSOChronology44.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.chrono.ISOChronology iSOChronology49 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.Chronology chronology50 = iSOChronology29.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology51 = iSOChronology23.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology52 = iSOChronology1.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField53 = iSOChronology1.hours();
        org.joda.time.DurationField durationField54 = iSOChronology1.millis();
        org.joda.time.DurationField durationField55 = iSOChronology1.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long63 = iSOChronology1.getDateTimeMillis((int) '#', 1, (-1), (int) 'a', 100, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(iSOChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(iSOChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(iSOChronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(durationField55);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = iSOChronology1.add(readablePeriod6, 53L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField12 = iSOChronology1.halfdays();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = iSOChronology1.add(readablePeriod13, (-2090762L), (int) (byte) 10);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-2090762L) + "'", long16 == (-2090762L));
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField12 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.weekyear();
        org.joda.time.Chronology chronology14 = iSOChronology1.withUTC();
        org.joda.time.DurationField durationField15 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.minuteOfDay();
        org.joda.time.DurationField durationField10 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        long long10 = iSOChronology1.add((-62166441600000L), 60097L, 0);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-62166441600000L) + "'", long10 == (-62166441600000L));
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField8 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField9 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField10 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField11 = iSOChronology1.years();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField20 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.clockhourOfHalfday();
        long long25 = iSOChronology1.add(2101035L, (-50339968L), (int) 'a');
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
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-4880875861L) + "'", long25 == (-4880875861L));
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField14 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        long long9 = iSOChronology5.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.dayOfYear();
        org.joda.time.DurationField durationField13 = iSOChronology11.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology11.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology11.add(readablePeriod19, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology11.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology26.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.Chronology chronology32 = iSOChronology11.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology33 = iSOChronology5.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology5.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfHour();
        long long8 = iSOChronology0.add(10L, (long) (byte) -1, 0);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField12 = iSOChronology0.days();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = iSOChronology0.add(readablePeriod4, 3297L, (int) (byte) 100);
        org.joda.time.DurationField durationField8 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology0.centuries();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3297L + "'", long7 == 3297L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.dayOfYear();
        org.joda.time.DurationField durationField8 = iSOChronology6.seconds();
        org.joda.time.DurationField durationField9 = iSOChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology6.year();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology14.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology14.getZone();
        org.joda.time.Chronology chronology20 = iSOChronology6.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology21 = iSOChronology0.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField22 = iSOChronology0.millis();
        org.joda.time.DurationField durationField23 = iSOChronology0.hours();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfWeek();
        org.joda.time.DurationField durationField17 = iSOChronology15.days();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology15.halfdayOfDay();
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
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.hourOfHalfday();
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
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekyearOfCentury();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = iSOChronology1.add(readablePeriod5, 9753L, (int) ' ');
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9753L + "'", long8 == 9753L);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.months();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.set(readablePartial9, 1131L);
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
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.minutes();
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
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.year();
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
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = iSOChronology1.add(readablePeriod11, 10273L, (int) (short) 0);
        org.joda.time.DurationField durationField15 = iSOChronology1.days();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10273L + "'", long14 == 10273L);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology1.months();
        org.joda.time.DurationField durationField10 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField11 = iSOChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField15 = iSOChronology13.months();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = iSOChronology13.getZone();
        org.joda.time.Chronology chronology18 = iSOChronology1.withZone(dateTimeZone17);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        long long7 = iSOChronology1.add(100L, (-1L), 0);
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        java.lang.String str9 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str9, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = iSOChronology8.millis();
        org.joda.time.DurationField durationField10 = iSOChronology8.hours();
        org.joda.time.DurationField durationField11 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology8.getZone();
        org.joda.time.Chronology chronology15 = iSOChronology1.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.year();
        org.joda.time.DurationField durationField17 = iSOChronology1.hours();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = iSOChronology1.get(readablePeriod18, (-82184790L), (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField11 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.clockhourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField10 = iSOChronology1.centuries();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology1.getDateTimeMillis((int) (short) 10, (int) (short) 1, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
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
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.months();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.millisOfDay();
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
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.hourOfHalfday();
        org.joda.time.DurationField durationField9 = iSOChronology5.years();
        org.joda.time.DurationField durationField10 = iSOChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology5.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology5.minuteOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        long long20 = iSOChronology1.add((long) (byte) -1, (long) (byte) 0, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField22 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology1.hourOfDay();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField8 = iSOChronology1.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.hourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        org.joda.time.DurationField durationField9 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField13 = iSOChronology1.centuries();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology12.dayOfYear();
        org.joda.time.DurationField durationField14 = iSOChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology12.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology20.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology20.getZone();
        org.joda.time.Chronology chronology24 = iSOChronology12.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField25 = iSOChronology12.millis();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone30 = iSOChronology12.getZone();
        org.joda.time.Chronology chronology31 = iSOChronology1.withZone(dateTimeZone30);
        org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone30);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = iSOChronology32.getDateTimeMillis(36052000L, 10, (int) 'a', (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(iSOChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(iSOChronology32);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = iSOChronology1.get(readablePeriod23, 11417L, 52L);
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
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        java.lang.String str3 = iSOChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology0.getZone();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str3, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        long long9 = iSOChronology1.add(100L, 3661035L, (int) ' ');
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 117153220L + "'", long9 == 117153220L);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField7 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology1.getDateTimeMillis((int) (byte) 100, (int) (short) 10, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology1.monthOfYear();
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
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.yearOfEra();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }
}

