import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest46 {

    public static boolean debug = false;

    @Test
    public void test23001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23001");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean23 = dateTimeZone21.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        boolean boolean29 = julianChronology27.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology30 = julianChronology27.withUTC();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology32 = julianChronology27.withZone(dateTimeZone31);
        long long34 = dateTimeZone21.getMillisKeepLocal(dateTimeZone31, 10L);
        org.joda.time.Chronology chronology35 = gJChronology2.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField36 = gJChronology2.dayOfYear();
        org.joda.time.DurationField durationField37 = gJChronology2.millis();
        org.joda.time.DurationField durationField38 = gJChronology2.weeks();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-12219292800000L) + "'", long18 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 11L + "'", long34 == 11L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
    }

    @Test
    public void test23002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DurationField durationField5 = gJChronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        long long18 = dateTimeZone13.convertLocalToUTC((long) (short) 10, false);
        java.lang.String str20 = dateTimeZone13.getName((long) (short) -1);
        org.joda.time.Chronology chronology21 = gJChronology2.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology22 = gJChronology2.withUTC();
        long long26 = gJChronology2.add(0L, (-60514215177256L), 97);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = gJChronology2.getDateTimeMillis(0L, 248400000, 9, (int) (short) 10, 32400000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 248400000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35999990L) + "'", long18 == (-35999990L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-5869878872193832L) + "'", long26 == (-5869878872193832L));
    }

    @Test
    public void test23003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23003");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        long long4 = instant1.getMillis();
        org.joda.time.Chronology chronology5 = instant1.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        boolean boolean9 = dateTimeZone7.isFixed();
        long long12 = dateTimeZone7.convertLocalToUTC((-35999990L), true);
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField14 = julianChronology13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology13.getZone();
        org.joda.time.DateTime dateTime16 = instant1.toDateTime(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant19 = instant1.withDurationAdded(17125341021530592L, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 17125341021530592 * -3600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-71999990L) + "'", long12 == (-71999990L));
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test23004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology2.getZone();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test23005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23005");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-421199991L));
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone3);
        boolean boolean7 = julianChronology5.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology8 = julianChronology5.withUTC();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology5.getZone();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.weekOfWeekyear();
        org.joda.time.Chronology chronology12 = gJChronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.minuteOfHour();
        int int14 = gJChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology10.getZone();
        org.joda.time.DateTime dateTime18 = instant1.toDateTime(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test23006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        boolean boolean17 = julianChronology15.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField18 = julianChronology15.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology15.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology15.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = julianChronology15.dayOfWeek();
        org.joda.time.DurationField durationField22 = julianChronology15.years();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology15.year();
        boolean boolean24 = julianChronology3.equals((java.lang.Object) julianChronology15);
        org.joda.time.Chronology chronology25 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = julianChronology3.year();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test23007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23007");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-1L), locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        boolean boolean9 = dateTimeZone1.isStandardOffset(36000000L);
        java.lang.String str10 = dateTimeZone1.toString();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField12 = gJChronology11.months();
        long long17 = gJChronology11.getDateTimeMillis(8, 10, 16, 20);
        java.lang.String str18 = gJChronology11.toString();
        int int19 = gJChronology11.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61889997599980L) + "'", long17 == (-61889997599980L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GJChronology[+10:00]" + "'", str18, "GJChronology[+10:00]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test23008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23008");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DurationField durationField5 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.yearOfCentury();
        org.joda.time.DurationField durationField12 = julianChronology3.hours();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test23009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.minuteOfHour();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test23010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.minuteOfDay();
        org.joda.time.Instant instant12 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = gJChronology2.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology15 = gJChronology2.withUTC();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test23011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant8.minus(readableDuration24);
        java.util.Date date26 = instant8.toDate();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = gJChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology29.dayOfYear();
        org.joda.time.Instant instant33 = gJChronology29.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.minus(readableDuration34);
        org.joda.time.Instant instant38 = instant35.withDurationAdded((-12219292800000L), 0);
        boolean boolean39 = instant8.isEqual((org.joda.time.ReadableInstant) instant35);
        org.joda.time.DateTimeZone dateTimeZone40 = instant35.getZone();
        boolean boolean41 = instant35.isBeforeNow();
        java.util.Date date42 = instant35.toDate();
        boolean boolean44 = instant35.isEqual((-71936861L));
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, readableInstant47);
        org.joda.time.DateTimeZone dateTimeZone49 = gJChronology48.getZone();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology48.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology48.dayOfYear();
        org.joda.time.Instant instant52 = gJChronology48.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Instant instant54 = instant52.minus(readableDuration53);
        org.joda.time.Instant instant57 = instant54.withDurationAdded((-12219292800000L), 0);
        boolean boolean59 = instant54.isEqual(35L);
        boolean boolean60 = instant45.isEqual((org.joda.time.ReadableInstant) instant54);
        org.joda.time.DateTimeZone dateTimeZone61 = instant54.getZone();
        int int63 = dateTimeZone61.getStandardOffset((-11L));
        org.joda.time.MutableDateTime mutableDateTime64 = instant35.toMutableDateTime(dateTimeZone61);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = null;
        boolean boolean66 = instant35.isSupported(dateTimeFieldType65);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 10:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(gJChronology48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test23012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        java.lang.String str12 = dateTimeZone8.getNameKey(10L);
        java.lang.String str14 = dateTimeZone8.getName((long) (byte) -1);
        org.joda.time.Chronology chronology15 = gJChronology2.withZone(dateTimeZone8);
        long long18 = dateTimeZone8.adjustOffset(0L, true);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone20);
        boolean boolean24 = julianChronology22.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField25 = julianChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField26 = julianChronology22.secondOfDay();
        long long30 = julianChronology22.add((long) (short) 1, (long) 1, 36000000);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone32);
        boolean boolean36 = julianChronology34.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology37 = julianChronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = julianChronology34.era();
        org.joda.time.DateTimeField dateTimeField39 = julianChronology34.minuteOfHour();
        org.joda.time.DurationField durationField40 = julianChronology34.weeks();
        org.joda.time.DurationField durationField41 = julianChronology34.days();
        org.joda.time.DateTimeField dateTimeField42 = julianChronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = julianChronology34.millisOfDay();
        org.joda.time.DurationField durationField44 = julianChronology34.millis();
        org.joda.time.DateTimeField dateTimeField45 = julianChronology34.clockhourOfHalfday();
        boolean boolean46 = julianChronology22.equals((java.lang.Object) julianChronology34);
        boolean boolean47 = dateTimeZone8.equals((java.lang.Object) julianChronology22);
        org.joda.time.Chronology chronology48 = julianChronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField49 = julianChronology22.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 36000001L + "'", long30 == 36000001L);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(julianChronology34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
    }

    @Test
    public void test23013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        long long12 = dateTimeZone5.convertLocalToUTC((-35999900L), false);
        int int14 = dateTimeZone5.getOffsetFromLocal((long) 278);
        boolean boolean16 = dateTimeZone5.isStandardOffset((long) 1582);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.dayOfYear();
        org.joda.time.Instant instant23 = gJChronology19.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant23.minus(readableDuration24);
        org.joda.time.Instant instant28 = instant25.withDurationAdded((-12219292800000L), 0);
        boolean boolean30 = instant25.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, readableInstant32);
        org.joda.time.Chronology chronology34 = gJChronology33.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology33.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology33.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology33.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology33.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology33.monthOfYear();
        boolean boolean41 = instant25.equals((java.lang.Object) dateTimeField40);
        org.joda.time.Instant instant43 = instant25.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        boolean boolean45 = instant43.isSupported(dateTimeFieldType44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        boolean boolean47 = instant43.isSupported(dateTimeFieldType46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = instant43.toString(dateTimeFormatter48);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.Instant instant53 = instant43.withDurationAdded((long) 0, (int) 'a');
        org.joda.time.Chronology chronology54 = instant53.getChronology();
        org.joda.time.Instant instant55 = instant53.toInstant();
        java.lang.String str56 = instant53.toString();
        org.joda.time.Instant instant57 = new org.joda.time.Instant((java.lang.Object) str56);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-71999900L) + "'", long12 == (-71999900L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str49, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str56, "1970-01-01T00:00:00.001Z");
    }

    @Test
    public void test23014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23014");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.DurationField durationField5 = julianChronology3.weeks();
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology3.add(readablePeriod7, 36000000L, 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.Chronology chronology14 = gJChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.hourOfDay();
        boolean boolean18 = julianChronology3.equals((java.lang.Object) gJChronology13);
        org.joda.time.DurationField durationField19 = julianChronology3.months();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology3.secondOfDay();
        org.joda.time.DurationField durationField21 = julianChronology3.months();
        org.joda.time.Chronology chronology22 = julianChronology3.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36000000L + "'", long10 == 36000000L);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test23015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23015");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.millisOfDay();
        org.joda.time.DurationField durationField9 = julianChronology3.centuries();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        boolean boolean15 = julianChronology13.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField16 = julianChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone18.getName((-1L), locale21);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone18.isLocalDateTimeGap(localDateTime23);
        boolean boolean26 = dateTimeZone18.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology27 = julianChronology13.withZone(dateTimeZone18);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology29 = julianChronology3.withZone(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (-395999900L), 83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 83");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test23016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = gJChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis(0L, 3920, (int) (short) 100, (int) '4', 360000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3920 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test23017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, 1644536721436L, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test23018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = gJChronology2.centuries();
        org.joda.time.DurationField durationField13 = gJChronology2.hours();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology2.get(readablePeriod14, (-60514214860216L), (-60514179321380L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test23019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23019");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology11.getZone();
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, (org.joda.time.ReadableInstant) instant17);
        java.lang.String str19 = instant17.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, readableInstant21);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology22.getZone();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.dayOfYear();
        org.joda.time.Instant instant26 = gJChronology22.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.minus(readableDuration27);
        org.joda.time.Instant instant31 = instant28.withDurationAdded((-12219292800000L), 0);
        int int32 = instant17.compareTo((org.joda.time.ReadableInstant) instant28);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant34 = instant17.minus(readableDuration33);
        java.util.Date date35 = instant17.toDate();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = gJChronology38.getZone();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology38.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology38.dayOfYear();
        org.joda.time.Instant instant42 = gJChronology38.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant44 = instant42.minus(readableDuration43);
        org.joda.time.Instant instant47 = instant44.withDurationAdded((-12219292800000L), 0);
        boolean boolean48 = instant17.isEqual((org.joda.time.ReadableInstant) instant44);
        org.joda.time.DateTimeZone dateTimeZone49 = instant44.getZone();
        boolean boolean50 = instant44.isBeforeNow();
        java.util.Date date51 = instant44.toDate();
        boolean boolean53 = instant44.isEqual((-71936861L));
        org.joda.time.ReadableInstant readableInstant54 = null;
        boolean boolean55 = instant44.isAfter(readableInstant54);
        org.joda.time.Instant instant57 = instant44.minus((-60514179282187L));
        org.joda.time.chrono.GJChronology gJChronology58 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant57);
        org.joda.time.DateTimeZone dateTimeZone59 = instant57.getZone();
        org.joda.time.LocalDateTime localDateTime60 = null;
        boolean boolean61 = dateTimeZone59.isLocalDateTimeGap(localDateTime60);
        org.joda.time.Instant instant63 = new org.joda.time.Instant(16010L);
        long long64 = instant63.getMillis();
        int int65 = dateTimeZone59.getOffset((org.joda.time.ReadableInstant) instant63);
        java.util.TimeZone timeZone66 = dateTimeZone59.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str19, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 10:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertNotNull(gJChronology58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 16010L + "'", long64 == 16010L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(timeZone66);
        org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test23020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23020");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.DurationField durationField5 = julianChronology3.weeks();
        org.joda.time.DurationField durationField6 = julianChronology3.minutes();
        org.joda.time.DurationField durationField7 = julianChronology3.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone9.getName((-1L), locale12);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone9.isLocalDateTimeGap(localDateTime14);
        java.lang.String str16 = dateTimeZone9.getID();
        java.lang.String str18 = dateTimeZone9.getNameKey((long) 4);
        org.joda.time.Chronology chronology19 = julianChronology3.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField20 = julianChronology3.hours();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology23.getZone();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology23.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology23.getZone();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, (org.joda.time.ReadableInstant) instant29);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology30.clockhourOfHalfday();
        org.joda.time.Chronology chronology32 = gJChronology30.withUTC();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, readableInstant34);
        org.joda.time.DateTimeZone dateTimeZone36 = gJChronology35.getZone();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str39 = dateTimeZone38.getID();
        org.joda.time.Chronology chronology40 = gJChronology35.withZone(dateTimeZone38);
        java.lang.String str42 = dateTimeZone38.getName((long) (byte) 10);
        long long45 = dateTimeZone38.convertLocalToUTC((-35999900L), false);
        long long48 = dateTimeZone38.adjustOffset((long) '#', false);
        int int50 = dateTimeZone38.getOffset((long) (byte) 10);
        org.joda.time.Chronology chronology51 = chronology32.withZone(dateTimeZone38);
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38, 9730L, (int) (short) 1);
        java.lang.String str56 = dateTimeZone38.getNameKey((long) 69);
        org.joda.time.Chronology chronology57 = julianChronology3.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField58 = julianChronology3.dayOfMonth();
        long long62 = julianChronology3.add(35999907L, (long) 3600000, 43203104);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+10:00" + "'", str39, "+10:00");
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+10:00" + "'", str42, "+10:00");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-71999900L) + "'", long45 == (-71999900L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 35L + "'", long48 == 35L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 36000000 + "'", int50 == 36000000);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(gJChronology54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 155531210399907L + "'", long62 == 155531210399907L);
    }

    @Test
    public void test23021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gJChronology2.add(readablePeriod4, (long) (short) -1, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        java.lang.String str9 = gJChronology2.toString();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GJChronology[+10:00]" + "'", str9, "GJChronology[+10:00]");
    }

    @Test
    public void test23022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23022");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DurationField durationField5 = julianChronology3.millis();
        org.joda.time.DurationField durationField6 = julianChronology3.minutes();
        org.joda.time.DurationField durationField7 = julianChronology3.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test23023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        org.joda.time.Instant instant14 = instant8.toInstant();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant8.minus(readableDuration15);
        long long17 = instant16.getMillis();
        boolean boolean18 = instant16.isAfterNow();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-12219292800000L) + "'", long17 == (-12219292800000L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField9 = gJChronology2.hours();
        org.joda.time.DurationField durationField10 = gJChronology2.millis();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test23025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        boolean boolean13 = instant8.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.Chronology chronology17 = gJChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.monthOfYear();
        boolean boolean24 = instant8.equals((java.lang.Object) dateTimeField23);
        org.joda.time.Instant instant26 = instant8.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = instant26.isSupported(dateTimeFieldType27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30);
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology31.getZone();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.dayOfYear();
        org.joda.time.Instant instant35 = gJChronology31.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant37 = instant35.minus(readableDuration36);
        org.joda.time.Instant instant40 = instant37.withDurationAdded((-12219292800000L), 0);
        boolean boolean42 = instant37.isEqual(35L);
        org.joda.time.Instant instant43 = instant37.toInstant();
        boolean boolean45 = instant43.isBefore((long) ' ');
        boolean boolean46 = instant26.isAfter((org.joda.time.ReadableInstant) instant43);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str49 = dateTimeZone48.getID();
        boolean boolean50 = dateTimeZone48.isFixed();
        long long52 = dateTimeZone48.previousTransition(100L);
        java.util.TimeZone timeZone53 = dateTimeZone48.toTimeZone();
        java.util.TimeZone timeZone54 = dateTimeZone48.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        java.util.TimeZone timeZone56 = dateTimeZone55.toTimeZone();
        org.joda.time.DateTime dateTime57 = instant26.toDateTime(dateTimeZone55);
        java.lang.String str58 = dateTime57.toString();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+10:00" + "'", str49, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1970-01-01T10:00:00.001+10:00" + "'", str58, "1970-01-01T10:00:00.001+10:00");
    }

    @Test
    public void test23026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant8.withDurationAdded(readableDuration11, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = instant8.getZone();
        org.joda.time.Instant instant15 = instant8.toInstant();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant15.plus(readableDuration16);
        org.joda.time.DateTime dateTime18 = instant15.toDateTime();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test23027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        long long11 = gJChronology2.getDateTimeMillis((int) (short) 100, 4, (int) (short) 1, 4);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology2.getZone();
        int int14 = dateTimeZone12.getOffsetFromLocal((-30448000L));
        int int16 = dateTimeZone12.getOffsetFromLocal((-62112218399999L));
        long long19 = dateTimeZone12.adjustOffset((long) 40, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology21 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59003805599996L) + "'", long11 == (-59003805599996L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36000000 + "'", int16 == 36000000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 40L + "'", long19 == 40L);
    }

    @Test
    public void test23028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23028");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.clockhourOfDay();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology8.getZone();
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant14);
        java.lang.String str16 = instant14.toString();
        int int17 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology18 = gJChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[+10:00]" + "'", str2, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str16, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test23029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23029");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 71525);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 71525");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23030");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str13 = dateTimeZone12.getID();
        boolean boolean14 = dateTimeZone12.isFixed();
        long long16 = dateTimeZone12.previousTransition(100L);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.Chronology chronology19 = julianChronology3.withZone(dateTimeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, readableInstant24);
        org.joda.time.DateTimeZone dateTimeZone26 = gJChronology25.getZone();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = gJChronology25.getZone();
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, (org.joda.time.ReadableInstant) instant31);
        long long34 = dateTimeZone29.nextTransition((long) 0);
        long long36 = dateTimeZone22.getMillisKeepLocal(dateTimeZone29, (long) (byte) 100);
        long long39 = dateTimeZone22.convertLocalToUTC((-183080725199990L), false);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40, readableInstant41);
        org.joda.time.Chronology chronology43 = gJChronology42.withUTC();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology42.dayOfWeek();
        org.joda.time.Chronology chronology45 = gJChronology42.withUTC();
        org.joda.time.DurationField durationField46 = gJChronology42.hours();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology42.clockhourOfDay();
        java.lang.String str48 = gJChronology42.toString();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology42.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone50 = gJChronology42.getZone();
        long long53 = dateTimeZone50.adjustOffset((-60514215303803L), false);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone50.getShortName((-60514218900202L), locale55);
        long long58 = dateTimeZone22.getMillisKeepLocal(dateTimeZone50, (-60403659497312L));
        org.joda.time.chrono.JulianChronology julianChronology59 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone22);
        int int60 = julianChronology59.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField61 = julianChronology59.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-183080761199990L) + "'", long39 == (-183080761199990L));
        org.junit.Assert.assertNotNull(gJChronology42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "GJChronology[+10:00]" + "'", str48, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-60514215303803L) + "'", long53 == (-60514215303803L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+10:00" + "'", str56, "+10:00");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-60403659497312L) + "'", long58 == (-60403659497312L));
        org.junit.Assert.assertNotNull(julianChronology59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
        org.junit.Assert.assertNotNull(dateTimeField61);
    }

    @Test
    public void test23031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.hourOfDay();
        org.joda.time.Instant instant10 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant12 = instant10.minus(9730L);
        org.joda.time.Instant instant15 = instant12.withDurationAdded((-179999601L), 36000001);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = instant15.get(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant15);
    }

    @Test
    public void test23032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        int int9 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.halfdayOfDay();
        int int13 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.dayOfMonth();
        org.joda.time.Instant instant15 = gJChronology2.getGregorianCutover();
        org.joda.time.Chronology chronology16 = instant15.getChronology();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test23033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean3 = dateTimeZone1.isFixed();
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str8 = dateTimeZone7.getID();
        boolean boolean9 = dateTimeZone7.isFixed();
        long long11 = dateTimeZone7.previousTransition(100L);
        java.util.TimeZone timeZone12 = dateTimeZone7.toTimeZone();
        java.util.TimeZone timeZone13 = dateTimeZone7.toTimeZone();
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) timeZone13);
        java.lang.String str15 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology18.getZone();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology18.getZone();
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, (org.joda.time.ReadableInstant) instant24);
        java.lang.String str26 = instant24.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = gJChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology29.dayOfYear();
        org.joda.time.Instant instant33 = gJChronology29.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.minus(readableDuration34);
        org.joda.time.Instant instant38 = instant35.withDurationAdded((-12219292800000L), 0);
        int int39 = instant24.compareTo((org.joda.time.ReadableInstant) instant35);
        long long40 = instant24.getMillis();
        org.joda.time.Instant instant43 = instant24.withDurationAdded((long) '#', 278);
        org.joda.time.Instant instant46 = instant43.withDurationAdded((long) 4, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str49 = dateTimeZone48.getID();
        boolean boolean50 = dateTimeZone48.isFixed();
        int int52 = dateTimeZone48.getOffsetFromLocal((-12219292800000L));
        org.joda.time.DateTime dateTime53 = instant43.toDateTime(dateTimeZone48);
        org.joda.time.Instant instant55 = instant43.plus((long) 1200);
        org.joda.time.Instant instant57 = instant43.plus((-12242483999903L));
        org.joda.time.MutableDateTime mutableDateTime58 = instant43.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Instant instant60 = instant43.plus(readableDuration59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology62 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant43, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str26, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 36000000L + "'", long40 == 36000000L);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+10:00" + "'", str49, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 36000000 + "'", int52 == 36000000);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(instant60);
    }

    @Test
    public void test23034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.hourOfHalfday();
        java.lang.String str8 = julianChronology3.toString();
        java.lang.String str9 = julianChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = julianChronology3.getZone();
        org.joda.time.DurationField durationField12 = julianChronology3.seconds();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[+10:00]" + "'", str8, "JulianChronology[+10:00]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JulianChronology[+10:00]" + "'", str9, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test23035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23035");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        boolean boolean6 = instant4.isEqual((long) 1);
        boolean boolean7 = instant4.isBeforeNow();
        org.joda.time.ReadableInstant readableInstant8 = null;
        boolean boolean9 = instant4.isEqual(readableInstant8);
        boolean boolean10 = instant4.isAfterNow();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant4.plus(readableDuration11);
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.millis();
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test23036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23036");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.millisOfSecond();
        long long16 = julianChronology3.getDateTimeMillis((-3599965L), (int) (byte) 0, (int) (short) 0, 19, 8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-35980992L) + "'", long16 == (-35980992L));
    }

    @Test
    public void test23037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField16 = julianChronology3.millis();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = julianChronology3.add(readablePeriod17, 52L, (int) '4');
        org.joda.time.DurationField durationField21 = julianChronology3.millis();
        org.joda.time.DurationField durationField22 = julianChronology3.weeks();
        java.lang.String str23 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology3.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JulianChronology[+10:00]" + "'", str23, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test23038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField11 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField13 = gJChronology2.weekyears();
        java.lang.String str14 = gJChronology2.toString();
        org.joda.time.DurationField durationField15 = gJChronology2.seconds();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str18 = dateTimeZone17.getID();
        boolean boolean19 = dateTimeZone17.isFixed();
        long long21 = dateTimeZone17.previousTransition(100L);
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone17);
        java.lang.String str23 = dateTimeZone17.getID();
        int int25 = dateTimeZone17.getOffsetFromLocal((long) 1);
        java.lang.String str27 = dateTimeZone17.getName((long) 8);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = julianChronology30.minuteOfDay();
        org.joda.time.DurationField durationField32 = julianChronology30.weekyears();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str35 = dateTimeZone34.getID();
        boolean boolean36 = dateTimeZone34.isFixed();
        long long38 = dateTimeZone34.previousTransition(100L);
        java.util.TimeZone timeZone39 = dateTimeZone34.toTimeZone();
        long long41 = dateTimeZone34.previousTransition(5201L);
        org.joda.time.Chronology chronology42 = julianChronology30.withZone(dateTimeZone34);
        long long44 = dateTimeZone17.getMillisKeepLocal(dateTimeZone34, 36000001L);
        java.lang.String str45 = dateTimeZone17.toString();
        org.joda.time.Chronology chronology46 = gJChronology2.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField47 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology2.minuteOfHour();
        int int49 = gJChronology2.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GJChronology[+10:00]" + "'", str14, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:00" + "'", str23, "+10:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 36000000 + "'", int25 == 36000000);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+10:00" + "'", str35, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5201L + "'", long41 == 5201L);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 36000001L + "'", long44 == 36000001L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+10:00" + "'", str45, "+10:00");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
    }

    @Test
    public void test23039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23039");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        boolean boolean9 = julianChronology7.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology10 = julianChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology12 = julianChronology7.withZone(dateTimeZone11);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 10L);
        int int16 = dateTimeZone11.getStandardOffset(11L);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11, (int) (short) 1);
        org.joda.time.DurationField durationField19 = julianChronology18.weekyears();
        org.joda.time.DurationField durationField20 = julianChronology18.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = julianChronology18.getDateTimeMillis((int) '#', 0, 83, 86400000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86400000 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test23040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23040");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.hourOfDay();
        java.lang.String str13 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology3.halfdayOfDay();
        org.joda.time.DurationField durationField19 = julianChronology3.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = julianChronology3.getDateTimeMillis(12, 72009726, 9, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 72009726 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JulianChronology[+10:00]" + "'", str13, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test23041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology2.weeks();
        org.joda.time.DurationField durationField8 = gJChronology2.minutes();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test23042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        long long8 = gJChronology2.add((long) (short) -1, (-71999900L), 1);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        boolean boolean11 = gJChronology2.equals((java.lang.Object) "1582-10-15T00:01:22.800Z");
        org.joda.time.DurationField durationField12 = gJChronology2.hours();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology2.getZone();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-71999901L) + "'", long8 == (-71999901L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test23043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23043");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) 10);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 10);
        org.joda.time.Instant instant6 = instant4.withMillis((-35999990L));
        org.joda.time.Instant instant8 = instant6.plus((-35997494L));
        boolean boolean10 = instant6.isAfter(3492003047L);
        org.joda.time.DateTime dateTime11 = instant6.toDateTimeISO();
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test23044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23044");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.weekyear();
        org.joda.time.DurationField durationField7 = julianChronology3.days();
        org.joda.time.Chronology chronology8 = julianChronology3.withUTC();
        long long12 = julianChronology3.add((long) (byte) 0, 4L, (int) (byte) 100);
        org.joda.time.Chronology chronology13 = julianChronology3.withUTC();
        java.lang.String str14 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology3.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JulianChronology[+10:00]" + "'", str14, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test23045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        java.lang.String str6 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = gJChronology2.weeks();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.weekyear();
        org.joda.time.DurationField durationField11 = gJChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.dayOfYear();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GJChronology[+10:00]" + "'", str6, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test23046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23046");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertLocalToUTC((-35999990L), true);
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) (short) -1, locale9);
        boolean boolean11 = dateTimeZone1.isFixed();
        int int13 = dateTimeZone1.getOffsetFromLocal((-361917494L));
        long long15 = dateTimeZone1.previousTransition((-12219364800000L));
        org.joda.time.Instant instant17 = new org.joda.time.Instant(0L);
        long long18 = instant17.getMillis();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant17.minus(readableDuration19);
        int int21 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant17);
        java.lang.String str22 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-71999990L) + "'", long6 == (-71999990L));
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36000000 + "'", int13 == 36000000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-12219364800000L) + "'", long15 == (-12219364800000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:00" + "'", str22, "+10:00");
    }

    @Test
    public void test23047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology11 = julianChronology10.withUTC();
        int int12 = julianChronology10.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = julianChronology10.get(readablePeriod13, 1692092752648L, 15119999901L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test23048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DurationField durationField5 = gJChronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.clockhourOfDay();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test23049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = julianChronology3.add(readablePeriod9, 36000052L, 3600000);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = julianChronology3.getDateTimeMillis(86400000, 349800000, 32, 3920);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 349800000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36000052L + "'", long12 == 36000052L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test23050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.secondOfMinute();
        org.joda.time.DurationField durationField6 = gJChronology2.eras();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology9.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.Chronology chronology14 = gJChronology9.withZone(dateTimeZone12);
        long long17 = dateTimeZone12.convertLocalToUTC((long) (short) 10, false);
        java.util.TimeZone timeZone18 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        boolean boolean20 = dateTimeZone19.isFixed();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone19.getName((-71999990L), locale22);
        org.joda.time.Chronology chronology24 = gJChronology2.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology2.millisOfSecond();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999990L) + "'", long17 == (-35999990L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:00" + "'", str23, "+10:00");
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test23051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str3 = dateTimeZone1.toString();
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField5 = gJChronology4.hours();
        org.joda.time.DurationField durationField6 = gJChronology4.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test23052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.minuteOfDay();
        boolean boolean12 = julianChronology3.equals((java.lang.Object) dateTimeField11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.secondOfMinute();
        int int14 = julianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16);
        boolean boolean20 = julianChronology18.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField21 = julianChronology18.months();
        boolean boolean22 = julianChronology3.equals((java.lang.Object) julianChronology18);
        org.joda.time.DateTimeField dateTimeField23 = julianChronology18.year();
        org.joda.time.DurationField durationField24 = julianChronology18.weekyears();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = julianChronology18.get(readablePeriod25, (-12839746584109L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test23053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23053");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test23054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6);
        org.joda.time.Chronology chronology8 = gJChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology7.dayOfWeek();
        org.joda.time.Chronology chronology10 = gJChronology7.withUTC();
        org.joda.time.DurationField durationField11 = gJChronology7.halfdays();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology7.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.Chronology chronology16 = gJChronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.dayOfWeek();
        org.joda.time.Chronology chronology18 = gJChronology15.withUTC();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.Chronology chronology21 = chronology18.withZone(dateTimeZone20);
        java.lang.String str22 = dateTimeZone20.getID();
        org.joda.time.Chronology chronology23 = gJChronology7.withZone(dateTimeZone20);
        long long25 = dateTimeZone20.convertUTCToLocal((-107999990L));
        org.joda.time.Chronology chronology26 = julianChronology2.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField27 = julianChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = julianChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = julianChronology2.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone31 = julianChronology2.getZone();
        java.lang.String str33 = dateTimeZone31.getNameKey(35078400010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-107999989L) + "'", long25 == (-107999989L));
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test23055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.seconds();
        long long13 = julianChronology3.add(36000000L, (long) 1, (-1));
        org.joda.time.DurationField durationField14 = julianChronology3.days();
        org.joda.time.DurationField durationField15 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology3.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35999999L + "'", long13 == 35999999L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test23056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23056");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.minus(readableDuration8);
        org.joda.time.Instant instant12 = instant9.withDurationAdded((-12219292800000L), 0);
        boolean boolean14 = instant9.isEqual(35L);
        boolean boolean15 = instant0.isEqual((org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTimeZone dateTimeZone16 = instant0.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = instant0.isSupported(dateTimeFieldType17);
        org.joda.time.Instant instant20 = instant0.withMillis(1759394531080246L);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(instant20);
    }

    @Test
    public void test23057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology20 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.dayOfYear();
        org.joda.time.DurationField durationField22 = gJChronology2.months();
        org.joda.time.DurationField durationField23 = gJChronology2.hours();
        org.joda.time.Instant instant24 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = gJChronology2.years();
        long long30 = gJChronology2.add((-35039992L), 86400000L, 1);
        long long34 = gJChronology2.add((long) 85517911, 20016000L, 278);
        org.joda.time.DurationField durationField35 = gJChronology2.millis();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-12219292800000L) + "'", long18 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 51360008L + "'", long30 == 51360008L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 5649965911L + "'", long34 == 5649965911L);
        org.junit.Assert.assertNotNull(durationField35);
    }

    @Test
    public void test23058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-32399903L));
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 0);
        java.util.Date date12 = instant8.toDate();
        long long13 = instant8.getMillis();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology16.getZone();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, (org.joda.time.ReadableInstant) instant22);
        java.lang.String str24 = instant22.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.dayOfYear();
        org.joda.time.Instant instant31 = gJChronology27.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant31.minus(readableDuration32);
        org.joda.time.Instant instant36 = instant33.withDurationAdded((-12219292800000L), 0);
        int int37 = instant22.compareTo((org.joda.time.ReadableInstant) instant33);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38, readableInstant39);
        org.joda.time.Chronology chronology41 = gJChronology40.withUTC();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology40.dayOfWeek();
        org.joda.time.DurationField durationField43 = gJChronology40.years();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology40.weekyear();
        boolean boolean45 = instant22.equals((java.lang.Object) dateTimeField44);
        org.joda.time.Instant instant47 = instant22.withMillis(32L);
        boolean boolean48 = instant8.isEqual((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Instant instant50 = instant47.minus((long) 1200);
        org.joda.time.DateTimeZone dateTimeZone51 = instant50.getZone();
        long long53 = dateTimeZone1.getMillisKeepLocal(dateTimeZone51, 129605695200000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology56 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 10:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36000000L + "'", long13 == 36000000L);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str24, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 129605695200001L + "'", long53 == 129605695200001L);
    }

    @Test
    public void test23059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.Chronology chronology7 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.clockhourOfHalfday();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.year();
        org.joda.time.DurationField durationField12 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+00:00:00.001]" + "'", str4, "GJChronology[+00:00:00.001]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test23060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekyear();
        org.joda.time.Instant instant14 = gJChronology2.getGregorianCutover();
        org.joda.time.Chronology chronology15 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField16 = gJChronology2.hours();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        java.lang.String str20 = gJChronology19.toString();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology19.dayOfYear();
        org.joda.time.DurationField durationField24 = gJChronology19.seconds();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology19.getZone();
        boolean boolean26 = gJChronology2.equals((java.lang.Object) dateTimeZone25);
        org.joda.time.Instant instant27 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = instant27.isSupported(dateTimeFieldType28);
        java.lang.String str30 = instant27.toString();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GJChronology[+00:00:00.001]" + "'", str20, "GJChronology[+00:00:00.001]");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str30, "1582-10-15T00:00:00.000Z");
    }

    @Test
    public void test23061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23061");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology3.weekOfWeekyear();
        java.lang.String str15 = julianChronology3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JulianChronology[+10:00]" + "'", str15, "JulianChronology[+10:00]");
    }

    @Test
    public void test23062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = gJChronology4.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str8 = dateTimeZone7.getID();
        org.joda.time.Chronology chronology9 = gJChronology4.withZone(dateTimeZone7);
        java.lang.String str11 = dateTimeZone7.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone7);
        java.lang.String str14 = dateTimeZone7.getID();
        java.util.TimeZone timeZone15 = dateTimeZone7.toTimeZone();
        int int17 = dateTimeZone7.getOffsetFromLocal(1644572759806L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str20 = dateTimeZone19.getID();
        boolean boolean21 = dateTimeZone19.isFixed();
        long long23 = dateTimeZone19.previousTransition(100L);
        org.joda.time.chrono.JulianChronology julianChronology24 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone19);
        java.lang.String str25 = dateTimeZone19.getID();
        int int27 = dateTimeZone19.getOffsetFromLocal((long) 1);
        long long29 = dateTimeZone19.convertUTCToLocal(151199999L);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone19.isLocalDateTimeGap(localDateTime30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.chrono.JulianChronology julianChronology35 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone33);
        boolean boolean37 = julianChronology35.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField38 = julianChronology35.months();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone40.getName((-1L), locale43);
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone40.isLocalDateTimeGap(localDateTime45);
        boolean boolean48 = dateTimeZone40.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology49 = julianChronology35.withZone(dateTimeZone40);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40);
        org.joda.time.Chronology chronology51 = gJChronology50.withUTC();
        org.joda.time.DurationField durationField52 = chronology51.weekyears();
        boolean boolean53 = dateTimeZone19.equals((java.lang.Object) chronology51);
        long long55 = dateTimeZone7.getMillisKeepLocal(dateTimeZone19, (-12238012799999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(julianChronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+10:00" + "'", str25, "+10:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36000000 + "'", int27 == 36000000);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 187199999L + "'", long29 == 187199999L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(julianChronology35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+10:00" + "'", str44, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-12238012799999L) + "'", long55 == (-12238012799999L));
    }

    @Test
    public void test23063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        int int9 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField11 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField12 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology2.get(readablePeriod15, (-4428950600003759440L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test23064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23064");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        java.util.Date date5 = instant1.toDate();
        long long6 = instant1.getMillis();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8);
        org.joda.time.Chronology chronology10 = gJChronology9.withUTC();
        java.lang.String str11 = gJChronology9.toString();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.yearOfEra();
        java.lang.String str15 = gJChronology9.toString();
        boolean boolean16 = instant1.equals((java.lang.Object) gJChronology9);
        org.joda.time.Instant instant17 = instant1.toInstant();
        boolean boolean18 = instant17.isEqualNow();
        boolean boolean20 = instant17.isBefore((-62111872799991L));
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 10:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 36000000L + "'", long6 == 36000000L);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GJChronology[+10:00]" + "'", str11, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[+10:00]" + "'", str15, "GJChronology[+10:00]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours(100);
        java.lang.String str4 = dateTimeZone3.getID();
        java.lang.String str6 = dateTimeZone3.getShortName(121800000L);
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, 1764000071L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 24");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1404000081L + "'", long8 == 1404000081L);
    }

    @Test
    public void test23066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.minuteOfDay();
        boolean boolean12 = julianChronology3.equals((java.lang.Object) dateTimeField11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.secondOfMinute();
        int int14 = julianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16);
        boolean boolean20 = julianChronology18.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField21 = julianChronology18.months();
        boolean boolean22 = julianChronology3.equals((java.lang.Object) julianChronology18);
        org.joda.time.DateTimeField dateTimeField23 = julianChronology18.year();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = julianChronology18.secondOfDay();
        org.joda.time.DurationField durationField26 = julianChronology18.seconds();
        org.joda.time.DurationField durationField27 = julianChronology18.weeks();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test23067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant11 = instant6.minus((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone12 = instant6.getZone();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant6.withDurationAdded(readableDuration13, 69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = instant6.toString(dateTimeFormatter16);
        org.joda.time.Instant instant19 = instant6.plus((-138447976L));
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str9, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str17, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant19);
    }

    @Test
    public void test23068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23068");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        org.joda.time.Chronology chronology6 = gJChronology5.withUTC();
        org.joda.time.DurationField durationField7 = gJChronology5.millis();
        long long11 = gJChronology5.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField12 = gJChronology5.millis();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology5.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology5.clockhourOfHalfday();
        org.joda.time.Instant instant15 = gJChronology5.getGregorianCutover();
        boolean boolean16 = instant1.isAfter((org.joda.time.ReadableInstant) instant15);
        boolean boolean18 = instant15.isEqual(1644536718819L);
        org.joda.time.DateTimeZone dateTimeZone19 = instant15.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = instant15.toString(dateTimeFormatter20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant15.withDurationAdded(readableDuration22, 278);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str21, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant24);
    }

    @Test
    public void test23069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23069");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.clockhourOfDay();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology4.getZone();
        java.lang.String str7 = dateTimeZone5.getShortName((-1L));
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.clockhourOfDay();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[+10:00]" + "'", str2, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test23070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.weekyear();
        org.joda.time.Instant instant4 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.yearOfEra();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test23071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.clockhourOfDay();
        java.lang.String str12 = julianChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.joda.time.Chronology chronology15 = julianChronology3.withZone(dateTimeZone14);
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14);
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14);
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = julianChronology17.set(readablePartial18, (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[+10:00]" + "'", str12, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(julianChronology17);
    }

    @Test
    public void test23072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(85517911L, locale3);
        long long8 = dateTimeZone1.convertLocalToUTC((-60514215215113L), false, (-12960072000000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-60514215215112L) + "'", long8 == (-60514215215112L));
    }

    @Test
    public void test23073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23073");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        java.lang.String str12 = dateTimeZone8.getNameKey(10L);
        java.lang.String str14 = dateTimeZone8.getName((long) (byte) -1);
        org.joda.time.Chronology chronology15 = gJChronology2.withZone(dateTimeZone8);
        long long18 = dateTimeZone8.adjustOffset(0L, true);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone20);
        boolean boolean24 = julianChronology22.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField25 = julianChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField26 = julianChronology22.secondOfDay();
        long long30 = julianChronology22.add((long) (short) 1, (long) 1, 36000000);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.chrono.JulianChronology julianChronology34 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone32);
        boolean boolean36 = julianChronology34.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology37 = julianChronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = julianChronology34.era();
        org.joda.time.DateTimeField dateTimeField39 = julianChronology34.minuteOfHour();
        org.joda.time.DurationField durationField40 = julianChronology34.weeks();
        org.joda.time.DurationField durationField41 = julianChronology34.days();
        org.joda.time.DateTimeField dateTimeField42 = julianChronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = julianChronology34.millisOfDay();
        org.joda.time.DurationField durationField44 = julianChronology34.millis();
        org.joda.time.DateTimeField dateTimeField45 = julianChronology34.clockhourOfHalfday();
        boolean boolean46 = julianChronology22.equals((java.lang.Object) julianChronology34);
        boolean boolean47 = dateTimeZone8.equals((java.lang.Object) julianChronology22);
        org.joda.time.DateTimeZone dateTimeZone48 = julianChronology22.getZone();
        org.joda.time.DurationField durationField49 = julianChronology22.hours();
        org.joda.time.DateTimeField dateTimeField50 = julianChronology22.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 36000001L + "'", long30 == 36000001L);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(julianChronology34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
    }

    @Test
    public void test23074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        int int6 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        long long13 = dateTimeZone8.convertLocalToUTC(809L, true, (-3743975152L));
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.monthOfYear();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-35999191L) + "'", long13 == (-35999191L));
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test23075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone11 = julianChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        boolean boolean15 = dateTimeZone13.isFixed();
        long long17 = dateTimeZone13.previousTransition(100L);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        java.lang.String str19 = dateTimeZone13.getID();
        int int21 = dateTimeZone13.getOffsetFromLocal((long) 1);
        org.joda.time.Chronology chronology22 = julianChronology3.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField23 = julianChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology3.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+10:00" + "'", str19, "+10:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test23076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23076");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField8 = julianChronology7.year();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology12.getZone();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone13.getName((long) 36000000, locale15);
        int int18 = dateTimeZone13.getOffset((long) ' ');
        org.joda.time.Chronology chronology19 = julianChronology7.withZone(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime20 = instant3.toMutableDateTime(chronology19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = mutableDateTime20.isSupported(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36000000 + "'", int18 == 36000000);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23077");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-11T09:45:44.080Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        boolean boolean3 = instant1.isSupported(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test23078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        boolean boolean11 = julianChronology9.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology12 = julianChronology9.withUTC();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology14 = julianChronology9.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField15 = julianChronology9.days();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = julianChronology9.getZone();
        org.joda.time.DurationField durationField18 = julianChronology9.days();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology9.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = julianChronology9.getZone();
        org.joda.time.Chronology chronology21 = julianChronology2.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField23 = julianChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology2.monthOfYear();
        org.joda.time.DurationField durationField25 = julianChronology2.hours();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test23079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23079");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.secondOfDay();
        long long11 = julianChronology3.add((long) (short) 1, (long) 1, 36000000);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.monthOfYear();
        org.joda.time.Chronology chronology14 = julianChronology3.withUTC();
        org.joda.time.Chronology chronology15 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology3.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 36000001L + "'", long11 == 36000001L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test23080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology2.getZone();
        long long15 = dateTimeZone12.adjustOffset((-6211221875988790L), false);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology18.getZone();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.dayOfYear();
        org.joda.time.Instant instant22 = gJChronology18.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant22.minus(readableDuration23);
        org.joda.time.Instant instant27 = instant24.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant29 = instant24.plus(readableDuration28);
        org.joda.time.Instant instant30 = instant29.toInstant();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology33 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = julianChronology33.clockhourOfDay();
        int int35 = instant29.get(dateTimeField34);
        org.joda.time.DateTimeZone dateTimeZone36 = instant29.getZone();
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) instant29);
        org.joda.time.Instant instant38 = instant29.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = instant38.isSupported(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-6211221875988790L) + "'", long15 == (-6211221875988790L));
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(julianChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 24 + "'", int35 == 24);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test23081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23081");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        boolean boolean25 = instant8.isBefore((long) 'a');
        org.joda.time.Instant instant26 = instant8.toInstant();
        boolean boolean27 = instant26.isEqualNow();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((java.lang.Object) instant26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30);
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology31.getZone();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.dayOfYear();
        org.joda.time.Instant instant35 = gJChronology31.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant37 = instant35.minus(readableDuration36);
        org.joda.time.Instant instant40 = instant37.withDurationAdded((-12219292800000L), 0);
        boolean boolean42 = instant37.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, readableInstant44);
        org.joda.time.Chronology chronology46 = gJChronology45.withUTC();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology45.millisOfDay();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology45.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology45.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology45.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology45.monthOfYear();
        boolean boolean53 = instant37.equals((java.lang.Object) dateTimeField52);
        org.joda.time.Instant instant55 = instant37.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        boolean boolean57 = instant55.isSupported(dateTimeFieldType56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = null;
        boolean boolean59 = instant55.isSupported(dateTimeFieldType58);
        org.joda.time.Instant instant62 = instant55.withDurationAdded(151199999L, (int) (short) 100);
        org.joda.time.Instant instant64 = instant62.withMillis(187199999L);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.Instant instant67 = instant62.withDurationAdded(readableDuration65, 1200);
        boolean boolean68 = instant26.isEqual((org.joda.time.ReadableInstant) instant62);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        boolean boolean70 = instant62.isSupported(dateTimeFieldType69);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.UTC;
        long long74 = dateTimeZone71.convertLocalToUTC((long) (short) 0, true);
        java.lang.String str76 = dateTimeZone71.getShortName(10L);
        long long79 = dateTimeZone71.convertLocalToUTC(32L, true);
        java.lang.String str80 = dateTimeZone71.toString();
        java.util.TimeZone timeZone81 = dateTimeZone71.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime82 = instant62.toMutableDateTime(dateTimeZone71);
        org.joda.time.Instant instant84 = new org.joda.time.Instant(132477032822400000L);
        boolean boolean85 = mutableDateTime82.isEqual((org.joda.time.ReadableInstant) instant84);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(gJChronology45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertNotNull(instant64);
        org.junit.Assert.assertNotNull(instant67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "+00:00" + "'", str76, "+00:00");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 32L + "'", long79 == 32L);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "UTC" + "'", str80, "UTC");
        org.junit.Assert.assertNotNull(timeZone81);
        org.junit.Assert.assertEquals(timeZone81.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test23082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology20 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.dayOfYear();
        org.joda.time.DurationField durationField22 = gJChronology2.months();
        org.joda.time.DurationField durationField23 = gJChronology2.hours();
        org.joda.time.Instant instant24 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology2.getZone();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-12219292800000L) + "'", long18 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test23083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23083");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DurationField durationField5 = gJChronology2.centuries();
        org.joda.time.DurationField durationField6 = gJChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology2.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
    }

    @Test
    public void test23084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = julianChronology2.withZone(dateTimeZone5);
        java.lang.Class<?> wildcardClass7 = chronology6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        boolean boolean13 = instant8.isEqual(35L);
        org.joda.time.Instant instant14 = instant8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.dayOfYear();
        org.joda.time.Instant instant21 = gJChronology17.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant23 = instant21.minus(readableDuration22);
        org.joda.time.Instant instant26 = instant23.withDurationAdded((-12219292800000L), 0);
        boolean boolean28 = instant23.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30);
        org.joda.time.Chronology chronology32 = gJChronology31.withUTC();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.millisOfDay();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology31.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology31.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology31.monthOfYear();
        boolean boolean39 = instant23.equals((java.lang.Object) dateTimeField38);
        org.joda.time.Instant instant41 = instant23.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = null;
        boolean boolean43 = instant41.isSupported(dateTimeFieldType42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44, readableInstant45);
        org.joda.time.DateTimeZone dateTimeZone47 = gJChronology46.getZone();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology46.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology46.dayOfYear();
        org.joda.time.Instant instant50 = gJChronology46.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Instant instant52 = instant50.minus(readableDuration51);
        org.joda.time.Instant instant55 = instant52.withDurationAdded((-12219292800000L), 0);
        boolean boolean57 = instant52.isEqual(35L);
        org.joda.time.Instant instant58 = instant52.toInstant();
        boolean boolean60 = instant58.isBefore((long) ' ');
        boolean boolean61 = instant41.isAfter((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Instant instant63 = instant41.minus(4L);
        org.joda.time.Chronology chronology64 = instant41.getChronology();
        boolean boolean66 = instant41.isAfter((-107999950L));
        int int67 = instant14.compareTo((org.joda.time.ReadableInstant) instant41);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone69);
        org.joda.time.chrono.JulianChronology julianChronology71 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone69);
        boolean boolean73 = julianChronology71.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology74 = julianChronology71.withUTC();
        org.joda.time.DateTimeZone dateTimeZone75 = julianChronology71.getZone();
        org.joda.time.chrono.GJChronology gJChronology76 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone75);
        org.joda.time.DateTimeField dateTimeField77 = gJChronology76.weekOfWeekyear();
        org.joda.time.Chronology chronology78 = gJChronology76.withUTC();
        org.joda.time.DateTimeField dateTimeField79 = gJChronology76.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField80 = gJChronology76.dayOfYear();
        org.joda.time.DateTimeField dateTimeField81 = gJChronology76.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime82 = instant41.toMutableDateTime((org.joda.time.Chronology) gJChronology76);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = null;
        java.lang.String str84 = instant41.toString(dateTimeFormatter83);
        org.joda.time.MutableDateTime mutableDateTime85 = instant41.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(gJChronology46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(julianChronology71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertNotNull(gJChronology76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str84, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(mutableDateTime85);
    }

    @Test
    public void test23086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23086");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.minuteOfHour();
        java.lang.String str11 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.dayOfYear();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GJChronology[+10:00]" + "'", str11, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test23087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        int int19 = dateTimeZone8.getOffset((-35999900L));
        int int21 = dateTimeZone8.getOffset((long) '#');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23);
        org.joda.time.Chronology chronology25 = gJChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.dayOfWeek();
        org.joda.time.Chronology chronology27 = gJChronology24.withUTC();
        org.joda.time.DurationField durationField28 = gJChronology24.halfdays();
        org.joda.time.DateTimeZone dateTimeZone29 = gJChronology24.getZone();
        int int31 = dateTimeZone29.getOffset((long) 1);
        java.util.TimeZone timeZone32 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.lang.String str35 = dateTimeZone33.getName(36000010L);
        long long37 = dateTimeZone8.getMillisKeepLocal(dateTimeZone33, (-35999890L));
        org.joda.time.chrono.JulianChronology julianChronology38 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone33);
        java.lang.String str40 = dateTimeZone33.getNameKey((-60515942400000L));
        java.lang.String str42 = dateTimeZone33.getShortName(111L);
        int int44 = dateTimeZone33.getOffsetFromLocal((-60514215029614L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 36000000 + "'", int31 == 36000000);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+10:00" + "'", str35, "+10:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-35999890L) + "'", long37 == (-35999890L));
        org.junit.Assert.assertNotNull(julianChronology38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+10:00" + "'", str42, "+10:00");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 36000000 + "'", int44 == 36000000);
    }

    @Test
    public void test23088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.year();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.Chronology chronology15 = gJChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.dayOfWeek();
        org.joda.time.Chronology chronology17 = gJChronology14.withUTC();
        org.joda.time.DurationField durationField18 = gJChronology14.halfdays();
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology14.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, readableInstant21);
        org.joda.time.Chronology chronology23 = gJChronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.dayOfWeek();
        org.joda.time.Chronology chronology25 = gJChronology22.withUTC();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.Chronology chronology28 = chronology25.withZone(dateTimeZone27);
        java.lang.String str29 = dateTimeZone27.getID();
        org.joda.time.Chronology chronology30 = gJChronology14.withZone(dateTimeZone27);
        boolean boolean31 = gJChronology2.equals((java.lang.Object) gJChronology14);
        org.joda.time.DateTimeField dateTimeField32 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology2.secondOfDay();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test23089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23089");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        java.lang.String str7 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = gJChronology2.months();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField12 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField13 = gJChronology2.months();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.set(readablePartial14, (-2699996117L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[+10:00]" + "'", str7, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test23090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField10 = julianChronology8.hours();
        long long14 = julianChronology8.add((long) 36000000, (long) ' ', 3600000);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology8.dayOfWeek();
        boolean boolean16 = julianChronology3.equals((java.lang.Object) julianChronology8);
        org.joda.time.DateTimeField dateTimeField17 = julianChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology8.year();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology8.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 151200000L + "'", long14 == 151200000L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test23091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField11 = gJChronology2.centuries();
        org.joda.time.Chronology chronology12 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField13 = gJChronology2.centuries();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test23092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23092");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        java.lang.String str8 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[+10:00]" + "'", str8, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test23093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekyear();
        org.joda.time.Instant instant14 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant15 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology2.monthOfYear();
        org.joda.time.Instant instant18 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant18.plus(readableDuration19);
        org.joda.time.Instant instant23 = instant18.withDurationAdded(1052L, (int) (short) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((-4319997428L));
        org.joda.time.Instant instant27 = instant25.withMillis((long) (short) 0);
        int int28 = instant23.compareTo((org.joda.time.ReadableInstant) instant27);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test23094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean23 = dateTimeZone21.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        boolean boolean29 = julianChronology27.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology30 = julianChronology27.withUTC();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology32 = julianChronology27.withZone(dateTimeZone31);
        long long34 = dateTimeZone21.getMillisKeepLocal(dateTimeZone31, 10L);
        org.joda.time.Chronology chronology35 = gJChronology2.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField36 = gJChronology2.dayOfYear();
        long long40 = gJChronology2.add(177540895L, 3492003047L, 353);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = gJChronology2.getDateTimeMillis((-35999990L), 3920, (-3600000), 16, 360000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3920 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-12219292800000L) + "'", long18 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 11L + "'", long34 == 11L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1232854616486L + "'", long40 == 1232854616486L);
    }

    @Test
    public void test23095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = gJChronology2.months();
        org.joda.time.DurationField durationField13 = gJChronology2.weeks();
        org.joda.time.DurationField durationField14 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.yearOfEra();
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.dayOfYear();
        org.joda.time.Instant instant23 = gJChronology19.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant23.minus(readableDuration24);
        org.joda.time.Instant instant28 = instant25.withDurationAdded((-12219292800000L), 0);
        boolean boolean30 = instant25.isEqual(35L);
        boolean boolean31 = instant16.isEqual((org.joda.time.ReadableInstant) instant25);
        org.joda.time.DateTimeZone dateTimeZone32 = instant25.getZone();
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.Instant instant36 = instant34.plus(110L);
        boolean boolean38 = instant36.isAfter((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39, readableInstant40);
        org.joda.time.Chronology chronology42 = gJChronology41.withUTC();
        java.lang.String str43 = gJChronology41.toString();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology41.monthOfYear();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology41.millisOfDay();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology41.dayOfWeek();
        org.joda.time.Instant instant47 = gJChronology41.getGregorianCutover();
        org.joda.time.Chronology chronology48 = instant47.getChronology();
        boolean boolean49 = instant36.isAfter((org.joda.time.ReadableInstant) instant47);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, (org.joda.time.ReadableInstant) instant47);
        boolean boolean51 = dateTimeZone32.isFixed();
        java.util.Locale locale53 = null;
        java.lang.String str54 = dateTimeZone32.getName(72320035L, locale53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32);
        org.joda.time.Chronology chronology56 = gJChronology2.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField57 = gJChronology2.secondOfMinute();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(gJChronology41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "GJChronology[+10:00]" + "'", str43, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
    }

    @Test
    public void test23096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        int int19 = dateTimeZone8.getOffset((-35999900L));
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField21 = julianChronology20.months();
        org.joda.time.DurationField durationField22 = julianChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = julianChronology20.centuryOfEra();
        org.joda.time.DurationField durationField26 = julianChronology20.years();
        org.joda.time.DurationField durationField27 = julianChronology20.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test23097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.hourOfDay();
        int int6 = julianChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.Chronology chronology7 = julianChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology2.dayOfMonth();
        org.joda.time.DurationField durationField9 = julianChronology2.months();
        java.lang.Object obj10 = null;
        boolean boolean11 = julianChronology2.equals(obj10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology14.getZone();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getName((long) 36000000, locale17);
        int int20 = dateTimeZone15.getOffset((long) ' ');
        long long22 = dateTimeZone15.previousTransition(1L);
        java.lang.String str24 = dateTimeZone15.getShortName((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        int int27 = dateTimeZone15.getStandardOffset((-30950980L));
        org.joda.time.Chronology chronology28 = julianChronology2.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology29 = julianChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = julianChronology2.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:00" + "'", str18, "+10:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36000000 + "'", int20 == 36000000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36000000 + "'", int27 == 36000000);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test23098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        int int19 = dateTimeZone8.getOffset((-35999900L));
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField21 = julianChronology20.months();
        org.joda.time.DurationField durationField22 = julianChronology20.weeks();
        org.joda.time.DurationField durationField23 = julianChronology20.hours();
        org.joda.time.DurationField durationField24 = julianChronology20.minutes();
        org.joda.time.DateTimeField dateTimeField25 = julianChronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField26 = julianChronology20.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone28);
        org.joda.time.DurationField durationField31 = julianChronology30.weeks();
        org.joda.time.DurationField durationField32 = julianChronology30.millis();
        org.joda.time.DateTimeField dateTimeField33 = julianChronology30.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = julianChronology30.year();
        java.lang.String str35 = julianChronology30.toString();
        org.joda.time.DateTimeField dateTimeField36 = julianChronology30.secondOfDay();
        boolean boolean37 = julianChronology20.equals((java.lang.Object) julianChronology30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "JulianChronology[+10:00]" + "'", str35, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test23099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.yearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test23100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        java.util.Date date7 = instant6.toDate();
        org.joda.time.Instant instant9 = instant6.withMillis((long) (short) -1);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.Chronology chronology16 = gJChronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology16.hours();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology16.getZone();
        org.joda.time.DateTime dateTime20 = instant12.toDateTime(dateTimeZone19);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        boolean boolean24 = dateTime20.isEqual((org.joda.time.ReadableInstant) instant22);
        boolean boolean25 = instant22.isBeforeNow();
        boolean boolean26 = instant6.isAfter((org.joda.time.ReadableInstant) instant22);
        org.joda.time.MutableDateTime mutableDateTime27 = instant6.toMutableDateTime();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(mutableDateTime27);
    }

    @Test
    public void test23101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23101");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.Instant instant7 = instant5.plus((long) (short) 0);
        java.lang.String str8 = instant7.toString();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant7.plus(readableDuration9);
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        boolean boolean13 = mutableDateTime11.isAfter(10371503412098510L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.Chronology chronology21 = gJChronology16.withZone(dateTimeZone19);
        java.lang.String str23 = dateTimeZone19.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology24 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology25 = julianChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = julianChronology24.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = julianChronology24.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29);
        org.joda.time.Chronology chronology31 = gJChronology30.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(36000);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, readableInstant36);
        org.joda.time.Chronology chronology38 = gJChronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology37.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology37.millisOfDay();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology37.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone43, readableInstant44);
        org.joda.time.DateTimeZone dateTimeZone46 = gJChronology45.getZone();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str49 = dateTimeZone48.getID();
        org.joda.time.Chronology chronology50 = gJChronology45.withZone(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone51 = gJChronology45.getZone();
        long long53 = dateTimeZone51.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology54 = gJChronology37.withZone(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean58 = dateTimeZone56.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone60);
        org.joda.time.chrono.JulianChronology julianChronology62 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone60);
        boolean boolean64 = julianChronology62.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology65 = julianChronology62.withUTC();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology67 = julianChronology62.withZone(dateTimeZone66);
        long long69 = dateTimeZone56.getMillisKeepLocal(dateTimeZone66, 10L);
        org.joda.time.Chronology chronology70 = gJChronology37.withZone(dateTimeZone66);
        org.joda.time.Chronology chronology71 = gJChronology37.withUTC();
        org.joda.time.DurationField durationField72 = gJChronology37.years();
        org.joda.time.DateTimeField dateTimeField73 = gJChronology37.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone74 = gJChronology37.getZone();
        long long76 = dateTimeZone34.getMillisKeepLocal(dateTimeZone74, 9110L);
        org.joda.time.Chronology chronology77 = gJChronology30.withZone(dateTimeZone34);
        org.joda.time.Chronology chronology78 = julianChronology24.withZone(dateTimeZone34);
        boolean boolean80 = dateTimeZone34.isStandardOffset(151200024L);
        org.joda.time.MutableDateTime mutableDateTime81 = mutableDateTime11.toMutableDateTime(dateTimeZone34);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str8, "1969-12-31T23:59:59.999Z");
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:00" + "'", str23, "+10:00");
        org.junit.Assert.assertNotNull(julianChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(gJChronology45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+10:00" + "'", str49, "+10:00");
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-12219292800000L) + "'", long53 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(julianChronology62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 11L + "'", long69 == 11L);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-35954890L) + "'", long76 == (-35954890L));
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(mutableDateTime81);
    }

    @Test
    public void test23102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23102");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        long long12 = dateTimeZone5.convertLocalToUTC((-35999900L), false);
        int int14 = dateTimeZone5.getOffsetFromLocal((long) 278);
        boolean boolean16 = dateTimeZone5.isStandardOffset((long) 1582);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.dayOfYear();
        org.joda.time.Instant instant23 = gJChronology19.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant23.minus(readableDuration24);
        org.joda.time.Instant instant28 = instant25.withDurationAdded((-12219292800000L), 0);
        boolean boolean30 = instant25.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, readableInstant32);
        org.joda.time.Chronology chronology34 = gJChronology33.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology33.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology33.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology33.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology33.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology33.monthOfYear();
        boolean boolean41 = instant25.equals((java.lang.Object) dateTimeField40);
        org.joda.time.Instant instant43 = instant25.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        boolean boolean45 = instant43.isSupported(dateTimeFieldType44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        boolean boolean47 = instant43.isSupported(dateTimeFieldType46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = instant43.toString(dateTimeFormatter48);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.DateTimeField dateTimeField51 = gJChronology50.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology50.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone53, readableInstant54);
        org.joda.time.Chronology chronology56 = gJChronology55.withUTC();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology55.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField58 = gJChronology55.millisOfDay();
        org.joda.time.DateTimeField dateTimeField59 = gJChronology55.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField60 = gJChronology55.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField61 = gJChronology55.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField62 = gJChronology55.monthOfYear();
        org.joda.time.Instant instant63 = gJChronology55.getGregorianCutover();
        boolean boolean64 = gJChronology50.equals((java.lang.Object) gJChronology55);
        org.joda.time.DateTimeField dateTimeField65 = gJChronology55.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-71999900L) + "'", long12 == (-71999900L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str49, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(gJChronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTimeField65);
    }

    @Test
    public void test23103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23103");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        boolean boolean25 = instant8.isBefore((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone26 = instant8.getZone();
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        java.lang.String str28 = julianChronology27.toString();
        org.joda.time.DateTimeField dateTimeField29 = julianChronology27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = julianChronology27.era();
        org.joda.time.DateTimeField dateTimeField31 = julianChronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = julianChronology27.clockhourOfDay();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "JulianChronology[UTC]" + "'", str28, "JulianChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test23104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23104");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField13 = julianChronology12.centuries();
        java.lang.String str14 = julianChronology12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology12.getZone();
        long long18 = dateTimeZone15.convertLocalToUTC((long) 0, true);
        boolean boolean19 = gJChronology2.equals((java.lang.Object) true);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23);
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology24.getZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str28 = dateTimeZone27.getID();
        org.joda.time.Chronology chronology29 = gJChronology24.withZone(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = gJChronology24.getZone();
        long long32 = dateTimeZone30.nextTransition((-12219292800000L));
        long long34 = dateTimeZone30.convertUTCToLocal((long) 1);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone30.getName((long) (-1), locale36);
        long long41 = dateTimeZone30.convertLocalToUTC(1L, true, (long) 0);
        org.joda.time.Instant instant43 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant43.plus(readableDuration44);
        java.lang.String str46 = instant43.toString();
        boolean boolean47 = dateTimeZone30.equals((java.lang.Object) instant43);
        org.joda.time.Chronology chronology48 = gJChronology2.withZone(dateTimeZone30);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JulianChronology[+10:00]" + "'", str14, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-36000000L) + "'", long18 == (-36000000L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+10:00" + "'", str28, "+10:00");
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-12219292800000L) + "'", long32 == (-12219292800000L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 36000001L + "'", long34 == 36000001L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+10:00" + "'", str37, "+10:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-35999999L) + "'", long41 == (-35999999L));
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str46, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(chronology48);
    }

    @Test
    public void test23105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23105");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = julianChronology2.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology2.year();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology2.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
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
    public void test23106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23106");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTimeZone dateTimeZone24 = instant8.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.Chronology chronology32 = gJChronology27.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField33 = gJChronology27.minuteOfDay();
        boolean boolean34 = instant8.equals((java.lang.Object) gJChronology27);
        org.joda.time.DateTimeField dateTimeField35 = gJChronology27.year();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+10:00" + "'", str31, "+10:00");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test23107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        java.lang.String str6 = julianChronology3.toString();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology3.add(readablePeriod7, (long) (short) 1, (-1));
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.weekyear();
        java.lang.String str12 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = julianChronology3.add(readablePeriod14, (long) 126000000, (int) 'a');
        org.joda.time.DateTimeField dateTimeField18 = julianChronology3.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20);
        org.joda.time.Chronology chronology22 = gJChronology21.withUTC();
        org.joda.time.DurationField durationField23 = gJChronology21.millis();
        org.joda.time.Chronology chronology24 = gJChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology21.hourOfDay();
        java.lang.String str26 = gJChronology21.toString();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology21.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology21.getZone();
        java.lang.String str29 = dateTimeZone28.toString();
        boolean boolean30 = dateTimeZone28.isFixed();
        org.joda.time.Chronology chronology31 = julianChronology3.withZone(dateTimeZone28);
        java.lang.String str32 = dateTimeZone28.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[+10:00]" + "'", str6, "JulianChronology[+10:00]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[+10:00]" + "'", str12, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 126000000L + "'", long17 == 126000000L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GJChronology[+10:00]" + "'", str26, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+10:00" + "'", str29, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+10:00" + "'", str32, "+10:00");
    }

    @Test
    public void test23108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23108");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-1L), locale4);
        long long7 = dateTimeZone1.previousTransition((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test23109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23109");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant9);
        java.lang.String str11 = instant9.toString();
        int int12 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((java.lang.Object) instant9);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = gJChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.halfdayOfDay();
        boolean boolean22 = instant13.equals((java.lang.Object) gJChronology16);
        int int23 = gJChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField24 = gJChronology16.halfdays();
        org.joda.time.DurationField durationField25 = gJChronology16.minutes();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology16.hourOfDay();
        org.joda.time.Instant instant27 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.dayOfYear();
        org.joda.time.Instant instant34 = gJChronology30.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant34.minus(readableDuration35);
        org.joda.time.Instant instant39 = instant36.withDurationAdded((-12219292800000L), 0);
        boolean boolean41 = instant36.isEqual(35L);
        boolean boolean42 = instant27.isEqual((org.joda.time.ReadableInstant) instant36);
        org.joda.time.DateTimeZone dateTimeZone43 = instant36.getZone();
        long long47 = dateTimeZone43.convertLocalToUTC((-35999105L), false, (-31L));
        org.joda.time.Chronology chronology48 = gJChronology16.withZone(dateTimeZone43);
        int int50 = dateTimeZone43.getOffset((-143999602L));
        java.util.Locale locale52 = null;
        java.lang.String str53 = dateTimeZone43.getShortName(32400020L, locale52);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str11, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-35999105L) + "'", long47 == (-35999105L));
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00" + "'", str53, "+00:00");
    }

    @Test
    public void test23110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23110");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1582-10-15T00:00:00.035Z");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) 353, 36000000);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7);
        org.joda.time.Chronology chronology9 = gJChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology8.monthOfYear();
        org.joda.time.DurationField durationField17 = gJChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology8.getZone();
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = instant1.toDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, readableInstant24);
        org.joda.time.Chronology chronology26 = gJChronology25.withUTC();
        org.joda.time.DurationField durationField27 = gJChronology25.millis();
        long long31 = gJChronology25.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField32 = gJChronology25.millis();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology25.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology25.clockhourOfHalfday();
        org.joda.time.DurationField durationField35 = gJChronology25.months();
        org.joda.time.DurationField durationField36 = gJChronology25.weeks();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology25.dayOfWeek();
        java.lang.String str38 = gJChronology25.toString();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.Chronology chronology40 = gJChronology25.withZone(dateTimeZone39);
        boolean boolean41 = instant1.equals((java.lang.Object) dateTimeZone39);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GJChronology[+10:00]" + "'", str38, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test23111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.era();
        long long14 = julianChronology3.add((-30448000L), (-35999976L), 1);
        long long18 = julianChronology3.add((-35039992L), 6400L, 4);
        org.joda.time.DateTimeField dateTimeField19 = julianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology3.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-66447976L) + "'", long14 == (-66447976L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35014392L) + "'", long18 == (-35014392L));
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test23112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23112");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-1L), locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        boolean boolean9 = dateTimeZone1.isStandardOffset(36000000L);
        java.lang.String str10 = dateTimeZone1.toString();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField12 = gJChronology11.months();
        org.joda.time.DurationField durationField13 = gJChronology11.weeks();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.clockhourOfDay();
        org.joda.time.Chronology chronology15 = gJChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology11.hourOfHalfday();
        org.joda.time.DurationField durationField17 = gJChronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology11.clockhourOfHalfday();
        long long22 = gJChronology11.add((-60514179281379L), (-60514208108823L), (int) (byte) 10);
        org.joda.time.DurationField durationField23 = gJChronology11.months();
        java.lang.String str24 = gJChronology11.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-665656260369609L) + "'", long22 == (-665656260369609L));
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GJChronology[+10:00]" + "'", str24, "GJChronology[+10:00]");
    }

    @Test
    public void test23113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(126000000);
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = gJChronology2.year();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test23114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant11 = instant6.minus((long) 36000000);
        boolean boolean13 = instant6.isAfter((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField18 = julianChronology17.centuries();
        org.joda.time.DurationField durationField19 = julianChronology17.weeks();
        org.joda.time.DurationField durationField20 = julianChronology17.days();
        org.joda.time.DurationField durationField21 = julianChronology17.centuries();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology17.hourOfHalfday();
        org.joda.time.Chronology chronology23 = julianChronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = julianChronology17.minuteOfDay();
        boolean boolean26 = instant6.equals((java.lang.Object) dateTimeField25);
        org.joda.time.DateTimeZone dateTimeZone27 = instant6.getZone();
        long long29 = dateTimeZone27.nextTransition((-16883395135642550L));
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone27.getShortName(36000010L, locale31);
        org.joda.time.chrono.JulianChronology julianChronology33 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology34.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology34.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.era();
        org.joda.time.Chronology chronology38 = gJChronology34.withUTC();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = gJChronology34.add(readablePeriod39, (-1295995878000000L), 516);
        org.joda.time.DateTimeField dateTimeField43 = gJChronology34.minuteOfHour();
        boolean boolean44 = julianChronology33.equals((java.lang.Object) gJChronology34);
        org.joda.time.ReadablePartial readablePartial45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = gJChronology34.get(readablePartial45, (-3488548206047310L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str9, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(julianChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-16883395135642550L) + "'", long29 == (-16883395135642550L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertNotNull(julianChronology33);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1295995878000000L) + "'", long42 == (-1295995878000000L));
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test23115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23115");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        long long7 = julianChronology2.add((-35999900L), 0L, (int) (byte) 10);
        org.joda.time.DurationField durationField8 = julianChronology2.months();
        org.joda.time.Chronology chronology9 = julianChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology2.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-35999900L) + "'", long7 == (-35999900L));
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test23116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23116");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = gJChronology2.hours();
        org.joda.time.DurationField durationField9 = gJChronology2.eras();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test23117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23117");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology3.getZone();
        int int10 = julianChronology3.getMinimumDaysInFirstWeek();
        long long14 = julianChronology3.add(36000277L, 3425068124722063L, 5);
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray16 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            julianChronology3.validate(readablePartial15, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 17125340659610592L + "'", long14 == 17125340659610592L);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
    }

    @Test
    public void test23118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23118");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        org.joda.time.Instant instant14 = instant13.toInstant();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant14.minus(readableDuration15);
        java.lang.String str17 = instant14.toString();
        org.joda.time.Instant instant19 = instant14.minus(18684000000L);
        org.joda.time.Instant instant20 = instant19.toInstant();
        long long21 = instant20.getMillis();
        org.joda.time.Instant instant23 = instant20.minus((-60904828799341L));
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, readableInstant25);
        org.joda.time.Chronology chronology27 = gJChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology26.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology26.millisOfDay();
        org.joda.time.DurationField durationField30 = gJChronology26.halfdays();
        org.joda.time.DurationField durationField31 = gJChronology26.millis();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology34 = gJChronology26.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField35 = gJChronology26.minutes();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology26.halfdayOfDay();
        org.joda.time.DurationField durationField37 = gJChronology26.centuries();
        org.joda.time.DurationField durationField38 = gJChronology26.days();
        org.joda.time.Instant instant39 = gJChronology26.getGregorianCutover();
        org.joda.time.Instant instant40 = instant39.toInstant();
        boolean boolean42 = instant40.isAfter((long) 1970);
        org.joda.time.Instant instant44 = instant40.minus(25200L);
        int int45 = instant20.compareTo((org.joda.time.ReadableInstant) instant40);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str17, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-12237976800000L) + "'", long21 == (-12237976800000L));
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test23119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23119");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DurationField durationField6 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = gJChronology2.centuries();
        int int9 = gJChronology2.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test23120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23120");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getName(36000001L, locale13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.Instant instant16 = gJChronology15.getGregorianCutover();
        int int17 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) instant16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20);
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = gJChronology21.getZone();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, (org.joda.time.ReadableInstant) instant27);
        java.lang.String str29 = instant27.toString();
        int int30 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) instant27);
        org.joda.time.DateTime dateTime31 = instant16.toDateTime(dateTimeZone18);
        java.lang.String str32 = dateTime31.toString();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime31.getZone();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone34, readableInstant35);
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology36.getZone();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology36.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = gJChronology36.getZone();
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40, (org.joda.time.ReadableInstant) instant42);
        java.lang.String str44 = instant42.toString();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45, readableInstant46);
        org.joda.time.DateTimeZone dateTimeZone48 = gJChronology47.getZone();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology47.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology47.dayOfYear();
        org.joda.time.Instant instant51 = gJChronology47.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Instant instant53 = instant51.minus(readableDuration52);
        org.joda.time.Instant instant56 = instant53.withDurationAdded((-12219292800000L), 0);
        int int57 = instant42.compareTo((org.joda.time.ReadableInstant) instant53);
        java.lang.String str58 = instant42.toString();
        boolean boolean59 = dateTime31.isAfter((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Instant instant60 = instant42.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int62 = instant60.get(dateTimeFieldType61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str29, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str32, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(gJChronology43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str44, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(instant51);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str58, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(instant60);
    }

    @Test
    public void test23121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23121");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        java.lang.String str4 = dateTimeZone2.getName(35L);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6);
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology7.getZone();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology7.getZone();
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, (org.joda.time.ReadableInstant) instant13);
        java.lang.String str15 = instant13.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = gJChronology18.getZone();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.dayOfYear();
        org.joda.time.Instant instant22 = gJChronology18.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant22.minus(readableDuration23);
        org.joda.time.Instant instant27 = instant24.withDurationAdded((-12219292800000L), 0);
        int int28 = instant13.compareTo((org.joda.time.ReadableInstant) instant24);
        long long29 = instant13.getMillis();
        org.joda.time.Instant instant31 = instant13.withMillis(110L);
        org.joda.time.chrono.GJChronology gJChronology33 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, (org.joda.time.ReadableInstant) instant13, (int) (short) 1);
        java.lang.String str35 = dateTimeZone2.getNameKey(5649965911L);
        java.util.TimeZone timeZone36 = dateTimeZone2.toTimeZone();
        java.lang.String str38 = dateTimeZone2.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str15, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 36000000L + "'", long29 == 36000000L);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(gJChronology33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test23122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23122");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) '#');
        long long7 = dateTimeZone1.convertLocalToUTC(40L, false, 17125340659610592L);
        int int9 = dateTimeZone1.getOffsetFromLocal(312910024L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        boolean boolean15 = julianChronology13.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology13.era();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology13.hourOfDay();
        int int19 = julianChronology13.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField20 = julianChronology13.millis();
        org.joda.time.DateTimeZone dateTimeZone21 = julianChronology13.getZone();
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (-431999901L));
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField25 = gJChronology24.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant28);
        org.joda.time.Chronology chronology30 = gJChronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology29.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology29.millisOfDay();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology29.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology29.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone35, readableInstant36);
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology37.getZone();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str41 = dateTimeZone40.getID();
        org.joda.time.Chronology chronology42 = gJChronology37.withZone(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone43 = gJChronology37.getZone();
        long long45 = dateTimeZone43.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology46 = gJChronology29.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean50 = dateTimeZone48.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone52);
        org.joda.time.chrono.JulianChronology julianChronology54 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone52);
        boolean boolean56 = julianChronology54.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology57 = julianChronology54.withUTC();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology59 = julianChronology54.withZone(dateTimeZone58);
        long long61 = dateTimeZone48.getMillisKeepLocal(dateTimeZone58, 10L);
        org.joda.time.Chronology chronology62 = gJChronology29.withZone(dateTimeZone58);
        long long64 = dateTimeZone58.nextTransition((long) (byte) -1);
        int int66 = dateTimeZone58.getOffsetFromLocal(0L);
        long long70 = dateTimeZone58.convertLocalToUTC((long) 'a', true, (long) 4);
        java.util.Locale locale72 = null;
        java.lang.String str73 = dateTimeZone58.getShortName(0L, locale72);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.chrono.GJChronology gJChronology76 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone74, readableInstant75);
        org.joda.time.Chronology chronology77 = gJChronology76.withUTC();
        java.lang.String str78 = gJChronology76.toString();
        org.joda.time.DurationField durationField79 = gJChronology76.centuries();
        boolean boolean80 = dateTimeZone58.equals((java.lang.Object) gJChronology76);
        org.joda.time.DateTimeZone dateTimeZone81 = gJChronology76.getZone();
        org.joda.time.Chronology chronology82 = gJChronology24.withZone(dateTimeZone81);
        org.joda.time.DateTimeField dateTimeField83 = gJChronology24.hourOfDay();
        boolean boolean84 = dateTimeZone1.equals((java.lang.Object) dateTimeField83);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 40L + "'", long7 == 40L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-467999901L) + "'", long23 == (-467999901L));
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(gJChronology37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+10:00" + "'", str41, "+10:00");
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-12219292800000L) + "'", long45 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(julianChronology54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 11L + "'", long61 == 11L);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 97L + "'", long70 == 97L);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+00:00" + "'", str73, "+00:00");
        org.junit.Assert.assertNotNull(gJChronology76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "GJChronology[+10:00]" + "'", str78, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }
}

