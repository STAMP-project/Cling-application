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
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        int int17 = property16.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime20 = property16.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime20.add(readablePeriod21, 40);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime20.toMutableDateTime(chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 100, chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(29, 18, 51, 1971, 1, 70, 722, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1971 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:22.573Z" + "'", str12, "2020-11-25T01:49:22.573Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:22.573Z" + "'", str28, "2020-11-25T01:49:22.573Z");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        mutableDateTime5.setMinuteOfDay(4);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        int int16 = mutableDateTime11.getWeekOfWeekyear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTime dateTime21 = mutableDateTime11.toDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime5.toMutableDateTime(dateTimeZone20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        boolean boolean31 = mutableDateTime22.isAfter((org.joda.time.ReadableInstant) mutableDateTime30);
        boolean boolean32 = property2.equals((java.lang.Object) boolean31);
        int int33 = property2.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime34 = property2.roundHalfFloor();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.hourOfDay();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime37.dayOfWeek();
        int int44 = property43.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime46 = property43.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime47 = property43.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime47.add(readablePeriod48, 40);
        mutableDateTime47.setMinuteOfHour(1);
        int int53 = mutableDateTime34.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.DateTimeField dateTimeField54 = mutableDateTime47.getRoundingField();
        mutableDateTime47.add((long) 233);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:22.610Z" + "'", str13, "2020-11-25T01:49:22.610Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:22.610Z" + "'", str27, "2020-11-25T01:49:22.610Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime34);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2020-11-25T01:49:22.610Z" + "'", str39, "2020-11-25T01:49:22.610Z");
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 7 + "'", int44 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(dateTimeField54);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfWeek();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        int int11 = mutableDateTime10.getDayOfWeek();
        mutableDateTime10.addSeconds((int) (byte) 0);
        int int14 = mutableDateTime10.getSecondOfMinute();
        mutableDateTime10.setWeekyear(20);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        int int18 = mutableDateTime6.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime6.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.weekOfWeekyear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsText(locale4);
        boolean boolean7 = property3.equals((java.lang.Object) "2020-11-25T01:44:41.098Z");
        long long8 = property3.remainder();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime14.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime14.copy();
        mutableDateTime17.setYear((int) (byte) 0);
        org.joda.time.Chronology chronology20 = mutableDateTime17.getChronology();
        mutableDateTime17.addHours(981);
        int int23 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(gregorianCalendar15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        int int8 = property7.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.centuryOfEra();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:44.742Z", dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime17.add(readablePeriod18, 336);
        mutableDateTime17.setTime(0L);
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) mutableDateTime17);
        java.util.Locale locale25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = mutableDateTime9.toString("2020-02-01T01:48:58.226Z", locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:22.731Z" + "'", str4, "2020-11-25T01:49:22.731Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.yearOfCentury();
        int int8 = mutableDateTime6.getMinuteOfHour();
        mutableDateTime6.setMillisOfDay(442);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumTextLength(locale9);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property7.getAsText(locale11);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:22.829Z" + "'", str4, "2020-11-25T01:49:22.829Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "20" + "'", str12, "20");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfFloor();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        mutableDateTime13.setTime((long) '#');
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        java.lang.String str26 = mutableDateTime20.toString();
        int int27 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj28 = mutableDateTime13.clone();
        long long29 = mutableDateTime13.getMillis();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property37.getFieldType();
        int int39 = mutableDateTime13.get(dateTimeFieldType38);
        int int40 = mutableDateTime10.get(dateTimeFieldType38);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.hourOfDay();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime44.dayOfWeek();
        int int51 = property50.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime53 = property50.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime54 = property50.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime54.add(readablePeriod55, 40);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        int int63 = mutableDateTime60.getYearOfCentury();
        org.joda.time.Chronology chronology64 = mutableDateTime60.getChronology();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime54.toMutableDateTime(chronology64);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(6436228L, chronology64);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime10.toMutableDateTime(chronology64);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:22.866Z" + "'", str4, "2020-11-25T01:49:22.866Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:22.866Z" + "'", str15, "2020-11-25T01:49:22.866Z");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:22.866Z" + "'", str22, "2020-11-25T01:49:22.866Z");
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:22.866Z" + "'", str26, "2020-11-25T01:49:22.866Z");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1606262400035L + "'", long29 == 1606262400035L);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:22.866Z" + "'", str34, "2020-11-25T01:49:22.866Z");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:22.866Z" + "'", str46, "2020-11-25T01:49:22.866Z");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 7 + "'", int51 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "2020-11-25T01:49:22.866Z" + "'", str62, "2020-11-25T01:49:22.866Z");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 20 + "'", int63 == 20);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(mutableDateTime67);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = mutableDateTime2.get(dateTimeField17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.yearOfEra();
        mutableDateTime2.setWeekyear(353);
        java.lang.Object obj22 = mutableDateTime2.clone();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:22.934Z" + "'", str4, "2020-11-25T01:49:22.934Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:22.934Z" + "'", str13, "2020-11-25T01:49:22.934Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(obj22);
// flaky:         org.junit.Assert.assertEquals(obj22.toString(), "0353-11-25T01:49:22.934Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "0353-11-25T01:49:22.934Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "0353-11-25T01:49:22.934Z");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.secondOfDay();
        java.lang.String str9 = property8.getAsString();
        java.lang.String str10 = property8.getAsShortText();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6562" + "'", str9, "6562");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6562" + "'", str10, "6562");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime2.add(readableDuration10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        int int16 = mutableDateTime15.getDayOfWeek();
        mutableDateTime15.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.secondOfMinute();
        int int20 = property12.getDifference((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.String str21 = property12.getName();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:22.994Z" + "'", str4, "2020-11-25T01:49:22.994Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "centuryOfEra" + "'", str21, "centuryOfEra");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime1.add(readableDuration3, 6417070);
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime1.add(readableDuration6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.weekyear();
        long long11 = property10.remainder();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField12, 442);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 442");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 259200010L + "'", long11 == 259200010L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        mutableDateTime12.setMillisOfSecond(7);
        java.util.Locale locale18 = null;
        java.util.Calendar calendar19 = mutableDateTime12.toCalendar(locale18);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.set(49);
        org.joda.time.DurationField durationField30 = property27.getDurationField();
        org.joda.time.DateTimeField dateTimeField31 = property27.getField();
        int int32 = mutableDateTime12.get(dateTimeField31);
        mutableDateTime2.setRounding(dateTimeField31);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime2.millisOfSecond();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.hourOfDay();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime37.dayOfWeek();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime37.secondOfDay();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime37.centuryOfEra();
        boolean boolean46 = mutableDateTime37.isBeforeNow();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology48);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.centuryOfEra();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        int int63 = mutableDateTime60.getYearOfCentury();
        org.joda.time.Chronology chronology64 = mutableDateTime60.getChronology();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime52.toMutableDateTime(chronology64);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime49, chronology64);
        mutableDateTime37.setChronology(chronology64);
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = mutableDateTime70.toString(dateTimeFormatter71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableDateTime70.add(readablePeriod73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime70.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property75.getFieldType();
        boolean boolean77 = mutableDateTime37.isSupported(dateTimeFieldType76);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime2.property(dateTimeFieldType76);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:23.063Z" + "'", str4, "2020-11-25T01:49:23.063Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:23.063Z" + "'", str14, "2020-11-25T01:49:23.063Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1606268963007,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=23,MILLISECOND=7,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertNotNull(property34);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2020-11-25T01:49:23.064Z" + "'", str39, "2020-11-25T01:49:23.064Z");
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2020-11-25T01:49:23.064Z" + "'", str54, "2020-11-25T01:49:23.064Z");
        org.junit.Assert.assertNotNull(property57);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "2020-11-25T01:49:23.064Z" + "'", str62, "2020-11-25T01:49:23.064Z");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 20 + "'", int63 == 20);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2020-11-25T01:49:23.064Z" + "'", str72, "2020-11-25T01:49:23.064Z");
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(property78);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        mutableDateTime5.setMinuteOfDay(4);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        int int16 = mutableDateTime11.getWeekOfWeekyear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTime dateTime21 = mutableDateTime11.toDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime5.toMutableDateTime(dateTimeZone20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        boolean boolean31 = mutableDateTime22.isAfter((org.joda.time.ReadableInstant) mutableDateTime30);
        boolean boolean32 = property2.equals((java.lang.Object) boolean31);
        org.joda.time.MutableDateTime mutableDateTime33 = property2.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime35 = property2.addWrapField(2020);
        java.lang.String str36 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:23.174Z" + "'", str13, "2020-11-25T01:49:23.174Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:23.174Z" + "'", str27, "2020-11-25T01:49:23.174Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "3990" + "'", str36, "3990");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.dayOfWeek();
        int int10 = property9.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime13 = property9.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, 40);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime13.toMutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 100, chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology23);
        mutableDateTime26.setDate((long) 59);
        int int29 = mutableDateTime26.getYearOfEra();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime26.millisOfSecond();
        java.util.Locale locale31 = null;
        int int32 = property30.getMaximumShortTextLength(locale31);
        java.lang.String str33 = property30.getAsText();
        org.joda.time.DurationField durationField34 = property30.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime36 = property30.addWrapField(409);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime38 = property30.set("2020-11-25T01:47:15.188Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:47:15.188Z\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:23.218Z" + "'", str5, "2020-11-25T01:49:23.218Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:23.218Z" + "'", str21, "2020-11-25T01:49:23.218Z");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "218" + "'", str33, "218");
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.weekyear();
        long long11 = property10.remainder();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.joda.time.MutableDateTime mutableDateTime14 = property10.add(1L);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime14.copy();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology23);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (-26769600), chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(2922789, 12, 366, 15, 100, (int) '#', 112, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 259200010L + "'", long11 == 259200010L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:23.263Z" + "'", str21, "2020-11-25T01:49:23.263Z");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7);
        mutableDateTime2.setMonthOfYear((int) (byte) 1);
        boolean boolean11 = mutableDateTime2.isBeforeNow();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:23.303Z" + "'", str4, "2020-11-25T01:49:23.303Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfEra();
        org.joda.time.DateTime dateTime9 = mutableDateTime7.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0, 6351, 48, 319, 34, 409, 55, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 319 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        mutableDateTime11.setTime((long) '#');
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        java.lang.String str24 = mutableDateTime18.toString();
        int int25 = mutableDateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj26 = mutableDateTime11.clone();
        long long27 = mutableDateTime11.getMillis();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        int int37 = mutableDateTime11.get(dateTimeFieldType36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime2.property(dateTimeFieldType36);
        mutableDateTime2.setDayOfYear((int) (short) 100);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime2.dayOfMonth();
        java.util.Locale locale42 = null;
        java.util.Calendar calendar43 = mutableDateTime2.toCalendar(locale42);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:23.429Z" + "'", str4, "2020-11-25T01:49:23.429Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:23.429Z" + "'", str13, "2020-11-25T01:49:23.429Z");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:23.429Z" + "'", str20, "2020-11-25T01:49:23.429Z");
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:23.429Z" + "'", str24, "2020-11-25T01:49:23.429Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1606262400035L + "'", long27 == 1606262400035L);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:23.429Z" + "'", str32, "2020-11-25T01:49:23.429Z");
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=1586396963429,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=100,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=23,MILLISECOND=429,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        mutableDateTime5.setMinuteOfDay(4);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        int int16 = mutableDateTime11.getWeekOfWeekyear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTime dateTime21 = mutableDateTime11.toDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime5.toMutableDateTime(dateTimeZone20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        boolean boolean31 = mutableDateTime22.isAfter((org.joda.time.ReadableInstant) mutableDateTime30);
        boolean boolean32 = property2.equals((java.lang.Object) boolean31);
        org.joda.time.MutableDateTime mutableDateTime33 = property2.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime35 = property2.addWrapField(2020);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime35.add(readablePeriod36, 6423656);
        mutableDateTime35.setMinuteOfDay((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:30.255Z");
        mutableDateTime42.addWeeks((-1));
        int int45 = mutableDateTime42.getMillisOfDay();
        mutableDateTime35.setMillis((org.joda.time.ReadableInstant) mutableDateTime42);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:23.482Z" + "'", str13, "2020-11-25T01:49:23.482Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:23.483Z" + "'", str27, "2020-11-25T01:49:23.483Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 6330255 + "'", int45 == 6330255);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime2.add(readablePeriod6);
        int int8 = mutableDateTime2.getDayOfWeek();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        int int13 = mutableDateTime11.getSecondOfMinute();
        boolean boolean14 = mutableDateTime2.equals((java.lang.Object) int13);
        mutableDateTime2.setSecondOfMinute((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.copy();
        int int18 = mutableDateTime17.getMonthOfYear();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        long long3 = property2.remainder();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology5);
        mutableDateTime6.setSecondOfMinute((int) '4');
        int int9 = mutableDateTime6.getMinuteOfDay();
        int int10 = mutableDateTime6.getCenturyOfEra();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        int int14 = mutableDateTime13.getDayOfWeek();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        mutableDateTime13.setZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = mutableDateTime6.toDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        long long23 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        int int24 = property2.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime26 = property2.add(330);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime26.setWeekOfWeekyear(6485);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6485 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 259200010L + "'", long3 == 259200010L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-50L) + "'", long23 == (-50L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-292275054) + "'", int24 == (-292275054));
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfDay();
        mutableDateTime2.add((long) 3);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.monthOfYear();
        int int13 = mutableDateTime2.getYearOfEra();
        int int14 = mutableDateTime2.getMillisOfDay();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.yearOfCentury();
        boolean boolean23 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int24 = mutableDateTime2.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setWeekOfWeekyear(173);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 173 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:23.645Z" + "'", str4, "2020-11-25T01:49:23.645Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2020 + "'", int13 == 2020);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6563648 + "'", int14 == 6563648);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:23.645Z" + "'", str19, "2020-11-25T01:49:23.645Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 40);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        mutableDateTime24.setMillis((long) 2020);
        java.lang.String str28 = mutableDateTime24.toString();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.roundFloor();
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) mutableDateTime38);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:23.681Z" + "'", str4, "2020-11-25T01:49:23.681Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:23.681Z" + "'", str20, "2020-11-25T01:49:23.681Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01T00:00:02.020Z" + "'", str28, "1970-01-01T00:00:02.020Z");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:23.681Z" + "'", str33, "2020-11-25T01:49:23.681Z");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.secondOfMinute();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.hourOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime4.dayOfWeek();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        mutableDateTime13.setTime((long) '#');
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        java.lang.String str26 = mutableDateTime20.toString();
        int int27 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj28 = mutableDateTime13.clone();
        long long29 = mutableDateTime13.getMillis();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property37.getFieldType();
        int int39 = mutableDateTime13.get(dateTimeFieldType38);
        boolean boolean40 = property10.equals((java.lang.Object) mutableDateTime13);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime13.dayOfYear();
        boolean boolean42 = mutableDateTime0.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        boolean boolean43 = mutableDateTime13.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime13.setDateTime(0, 211, 981, 353, 17, 6439, 993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 353 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:23.727Z" + "'", str6, "2020-11-25T01:49:23.727Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:23.727Z" + "'", str15, "2020-11-25T01:49:23.727Z");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:23.727Z" + "'", str22, "2020-11-25T01:49:23.727Z");
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:23.727Z" + "'", str26, "2020-11-25T01:49:23.727Z");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1606262400035L + "'", long29 == 1606262400035L);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:23.727Z" + "'", str34, "2020-11-25T01:49:23.727Z");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        int int6 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        java.lang.String str22 = mutableDateTime16.toString();
        int int23 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj24 = mutableDateTime9.clone();
        long long25 = mutableDateTime9.getMillis();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        int int35 = mutableDateTime9.get(dateTimeFieldType34);
        int int36 = mutableDateTime2.get(dateTimeFieldType34);
        int int37 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime2.weekOfWeekyear();
        mutableDateTime2.setYear(318);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 23 + "'", int6 == 23);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:23.762Z" + "'", str11, "2020-11-25T01:49:23.762Z");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:23.762Z" + "'", str18, "2020-11-25T01:49:23.762Z");
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:23.762Z" + "'", str22, "2020-11-25T01:49:23.762Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1606262400035L + "'", long25 == 1606262400035L);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:23.762Z" + "'", str30, "2020-11-25T01:49:23.762Z");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfMinute();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        mutableDateTime9.setSecondOfMinute((int) '4');
        int int12 = mutableDateTime9.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.dayOfYear();
        mutableDateTime9.setDate((long) 693);
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.era();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        int int8 = property7.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.centuryOfEra();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:44.742Z", dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime17.add(readablePeriod18, 336);
        mutableDateTime17.setTime(0L);
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) mutableDateTime17);
        int int24 = mutableDateTime9.getMinuteOfHour();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:23.836Z" + "'", str4, "2020-11-25T01:49:23.836Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        int int8 = property7.get();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumShortTextLength(locale9);
        java.util.Locale locale11 = null;
        int int12 = property7.getMaximumTextLength(locale11);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.dayOfWeek();
        int int23 = property22.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime25 = property22.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime26 = property22.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime26.add(readablePeriod27, 40);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime26.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 100, chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime39.add(readablePeriod40, (int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime39.copy();
        int int44 = mutableDateTime39.getMonthOfYear();
        int int45 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime39.dayOfMonth();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime49.add(readablePeriod52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime49.toMutableDateTimeISO();
        int int56 = property46.getDifference((org.joda.time.ReadableInstant) mutableDateTime49);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:23.876Z" + "'", str4, "2020-11-25T01:49:23.876Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:23.876Z" + "'", str18, "2020-11-25T01:49:23.876Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:23.876Z" + "'", str34, "2020-11-25T01:49:23.876Z");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 11 + "'", int44 == 11);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(property46);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2020-11-25T01:49:23.876Z" + "'", str51, "2020-11-25T01:49:23.876Z");
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:41.430Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        java.util.Date date7 = mutableDateTime5.toDate();
        int int8 = mutableDateTime5.getYear();
        java.util.Date date9 = mutableDateTime5.toDate();
        mutableDateTime5.setTime(0L);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime5.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:44:41 UTC 2020");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 01:44:41 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfDay();
        mutableDateTime2.add((long) 3);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.monthOfYear();
        java.util.Locale locale13 = null;
        int int14 = property12.getMaximumShortTextLength(locale13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        int int22 = mutableDateTime17.getWeekOfWeekyear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.DateTime dateTime27 = mutableDateTime17.toDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime17.copy();
        mutableDateTime17.setDayOfYear(12);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime17.weekyear();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfCeiling();
        long long33 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:23.970Z" + "'", str4, "2020-11-25T01:49:23.970Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:23.970Z" + "'", str19, "2020-11-25T01:49:23.970Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        boolean boolean14 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.addWrapField((int) '4');
        java.lang.String str18 = mutableDateTime17.toString();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.dayOfWeek();
        int int28 = property27.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime30 = property27.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime31 = property27.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime32 = property27.roundHalfFloor();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        mutableDateTime35.setSecondOfMinute((int) '4');
        int int38 = mutableDateTime35.getMinuteOfDay();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField48 = property47.getField();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime51.add(readablePeriod54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.centuryOfEra();
        int int57 = property47.getDifference((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime51.toMutableDateTimeISO();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime61.getZone();
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime58.toMutableDateTime(dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) 815, dateTimeZone62);
        mutableDateTime35.setZoneRetainFields(dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime32, dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime17, dateTimeZone62);
        org.joda.time.DurationFieldType durationFieldType68 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime17.add(durationFieldType68, 56942393);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:24.021Z" + "'", str4, "2020-11-25T01:49:24.021Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:50:16.021Z" + "'", str18, "2020-11-25T01:50:16.021Z");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:24.021Z" + "'", str23, "2020-11-25T01:49:24.021Z");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:24.021Z" + "'", str44, "2020-11-25T01:49:24.021Z");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeField48);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "2020-11-25T01:49:24.021Z" + "'", str53, "2020-11-25T01:49:24.021Z");
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(mutableDateTime63);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        boolean boolean10 = mutableDateTime9.isEqualNow();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.dayOfMonth();
        int int12 = mutableDateTime9.getWeekOfWeekyear();
        int int13 = mutableDateTime9.getRoundingMode();
        mutableDateTime9.addSeconds(51);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.weekOfWeekyear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        long long3 = property2.remainder();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.MutableDateTime mutableDateTime6 = property2.add(1L);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.yearOfCentury();
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime6.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.monthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 259200010L + "'", long3 == 259200010L);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getSecondOfDay();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTimeISO();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 38149 + "'", int11 == 38149);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        org.joda.time.DurationField durationField3 = property2.getLeapDurationField();
        java.lang.String str4 = property2.getAsString();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.getMutableDateTime();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        int int13 = mutableDateTime8.getWeekOfWeekyear();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime18 = mutableDateTime8.toDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime8.copy();
        boolean boolean20 = mutableDateTime8.isAfterNow();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime8.secondOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime8.minuteOfDay();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.centuryOfEra();
        int int31 = property30.get();
        org.joda.time.MutableDateTime mutableDateTime33 = property30.addWrapField(6300);
        long long34 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime33);
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970" + "'", str4, "1970");
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:24.154Z" + "'", str10, "2020-11-25T01:49:24.154Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:24.154Z" + "'", str27, "2020-11-25T01:49:24.154Z");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-331347996000L) + "'", long34 == (-331347996000L));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        int int10 = property8.getMaximumValueOverall();
        long long11 = property8.remainder();
        org.joda.time.MutableDateTime mutableDateTime13 = property8.addWrapField(29);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:24.229Z" + "'", str4, "2020-11-25T01:49:24.229Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 6564229L + "'", long11 == 6564229L);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfDay();
        mutableDateTime2.add((long) 3);
        mutableDateTime2.addWeekyears((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.minuteOfDay();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        int int24 = property23.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.addWrapField(0);
        boolean boolean27 = mutableDateTime26.isBeforeNow();
        long long28 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.MutableDateTime mutableDateTime29 = property14.roundHalfCeiling();
        org.joda.time.DurationFieldType durationFieldType30 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime29.add(durationFieldType30, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:24.347Z" + "'", str4, "2020-11-25T01:49:24.347Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:24.347Z" + "'", str19, "2020-11-25T01:49:24.347Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52597440L + "'", long28 == 52597440L);
        org.junit.Assert.assertNotNull(mutableDateTime29);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfMonth();
        boolean boolean4 = mutableDateTime1.isBefore((long) 9);
        org.joda.time.Chronology chronology5 = mutableDateTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(6335532L, chronology5);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology5);
        mutableDateTime8.setDayOfYear(319);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.set(19);
        boolean boolean8 = property5.isLeap();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property5.getAsShortText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property5.roundHalfFloor();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19" + "'", str10, "19");
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        boolean boolean14 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.addWrapField((int) '4');
        int int18 = property15.getLeapAmount();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.yearOfCentury();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.dayOfWeek();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime21.millisOfDay();
        mutableDateTime21.add((long) 3);
        mutableDateTime21.addWeekyears((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime21.weekOfWeekyear();
        mutableDateTime21.addMinutes((-292275054));
        boolean boolean36 = property15.equals((java.lang.Object) (-292275054));
        int int37 = property15.getMinimumValue();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:24.449Z" + "'", str4, "2020-11-25T01:49:24.449Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:24.449Z" + "'", str23, "2020-11-25T01:49:24.449Z");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property7.getFieldType();
        org.joda.time.DurationField durationField12 = property7.getDurationField();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = property7.compareTo(readablePartial13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        int int6 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        java.lang.String str22 = mutableDateTime16.toString();
        int int23 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj24 = mutableDateTime9.clone();
        long long25 = mutableDateTime9.getMillis();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        int int35 = mutableDateTime9.get(dateTimeFieldType34);
        int int36 = mutableDateTime2.get(dateTimeFieldType34);
        int int37 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.DateTime dateTime38 = mutableDateTime2.toDateTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:24.531Z" + "'", str11, "2020-11-25T01:49:24.531Z");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:24.531Z" + "'", str18, "2020-11-25T01:49:24.531Z");
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:24.531Z" + "'", str22, "2020-11-25T01:49:24.531Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1606262400035L + "'", long25 == 1606262400035L);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:24.531Z" + "'", str30, "2020-11-25T01:49:24.531Z");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfDay();
        mutableDateTime2.add((long) 3);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add(11);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.add(durationFieldType15, 6481);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:24.586Z" + "'", str4, "2020-11-25T01:49:24.586Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfSecond();
        int int9 = property8.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = property8.set("2020-11-25T01:48:17.521Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:48:17.521Z\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:48:48.899Z");
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(mutableDateTime2);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfMonth();
        int int12 = mutableDateTime10.getCenturyOfEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.setSecondOfMinute((int) '4');
        int int18 = mutableDateTime15.getMinuteOfDay();
        int int19 = mutableDateTime15.getCenturyOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        int int23 = mutableDateTime22.getDayOfWeek();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        mutableDateTime22.setZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = mutableDateTime15.toDateTime(dateTimeZone27);
        mutableDateTime10.setZoneRetainFields(dateTimeZone27);
        mutableDateTime2.setZone(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        int int34 = mutableDateTime33.getMillisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:24.804Z" + "'", str4, "2020-11-25T01:49:24.804Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 805 + "'", int34 == 805);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        int int17 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime11.toMutableDateTimeISO();
        int int20 = mutableDateTime19.getWeekyear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime19.add(readablePeriod21, 365);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.dayOfWeek();
        int int25 = mutableDateTime19.getYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:24.839Z" + "'", str4, "2020-11-25T01:49:24.839Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:24.839Z" + "'", str13, "2020-11-25T01:49:24.839Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2020 + "'", int25 == 2020);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property10.getAsText(locale13);
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = property10.compareTo(readablePartial15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:24.886Z" + "'", str4, "2020-11-25T01:49:24.886Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        int int7 = mutableDateTime2.getHourOfDay();
        int int8 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addWeeks((int) ' ');
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant9 = null;
        mutableDateTime3.setDate(readableInstant9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfMonth();
        int int13 = mutableDateTime11.getCenturyOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.setSecondOfMinute((int) '4');
        int int19 = mutableDateTime16.getMinuteOfDay();
        int int20 = mutableDateTime16.getCenturyOfEra();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        int int24 = mutableDateTime23.getDayOfWeek();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        mutableDateTime23.setZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = mutableDateTime16.toDateTime(dateTimeZone28);
        mutableDateTime11.setZoneRetainFields(dateTimeZone28);
        mutableDateTime3.setZone(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone28);
        mutableDateTime36.setMillisOfDay(53);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:24.943Z" + "'", str5, "2020-11-25T01:49:24.943Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime34);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime2.add(readableDuration10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.centuryOfEra();
        boolean boolean13 = mutableDateTime2.isBeforeNow();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.dayOfWeek();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime16.secondOfDay();
        int int24 = mutableDateTime16.getWeekOfWeekyear();
        mutableDateTime16.add(0L);
        int int27 = mutableDateTime16.getMillisOfSecond();
        int int28 = mutableDateTime16.getDayOfYear();
        org.joda.time.Chronology chronology29 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime2.toMutableDateTime(chronology29);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:25.014Z" + "'", str4, "2020-11-25T01:49:25.014Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:25.014Z" + "'", str18, "2020-11-25T01:49:25.014Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 48 + "'", int24 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14 + "'", int27 == 14);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 330 + "'", int28 == 330);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime2.add(readablePeriod6);
        int int8 = mutableDateTime2.getDayOfWeek();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        int int13 = mutableDateTime11.getSecondOfMinute();
        boolean boolean14 = mutableDateTime2.equals((java.lang.Object) int13);
        mutableDateTime2.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField17 = mutableDateTime2.getRoundingField();
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.dayOfWeek();
        int int29 = property28.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime32 = property28.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime32.add(readablePeriod33, 40);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime32.toMutableDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) 100, chronology42);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfFloor();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime49.add(readablePeriod52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.yearOfCentury();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime49.dayOfWeek();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime49.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime57 = property56.roundCeiling();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property58.getFieldType();
        boolean boolean60 = mutableDateTime46.isSupported(dateTimeFieldType59);
        int int61 = mutableDateTime2.get(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateTimeField17);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:25.059Z" + "'", str24, "2020-11-25T01:49:25.059Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2020-11-25T01:49:25.059Z" + "'", str40, "2020-11-25T01:49:25.059Z");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20 + "'", int41 == 20);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2020-11-25T01:49:25.059Z" + "'", str51, "2020-11-25T01:49:25.059Z");
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1970 + "'", int61 == 1970);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:25.142Z" + "'", str4, "2020-11-25T01:49:25.142Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        boolean boolean14 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.addWrapField((int) '4');
        int int18 = mutableDateTime17.getSecondOfMinute();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:25.173Z" + "'", str4, "2020-11-25T01:49:25.173Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.setTime((long) 233);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfDay();
        mutableDateTime2.add((long) 3);
        mutableDateTime2.addWeekyears((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.minuteOfDay();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        int int24 = property23.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.addWrapField(0);
        boolean boolean27 = mutableDateTime26.isBeforeNow();
        long long28 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.MutableDateTime mutableDateTime29 = property14.roundHalfCeiling();
        mutableDateTime29.setTime((long) 26);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime29.weekOfWeekyear();
        java.util.Locale locale33 = null;
        int int34 = property32.getMaximumTextLength(locale33);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:25.304Z" + "'", str4, "2020-11-25T01:49:25.304Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:25.304Z" + "'", str19, "2020-11-25T01:49:25.304Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52597440L + "'", long28 == 52597440L);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.copy();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        mutableDateTime20.setTime((long) '#');
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        java.lang.String str33 = mutableDateTime27.toString();
        int int34 = mutableDateTime20.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime27.millisOfDay();
        org.joda.time.Chronology chronology36 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology36);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        java.lang.String str46 = mutableDateTime40.toString();
        mutableDateTime40.setSecondOfDay(2);
        int int49 = mutableDateTime40.getDayOfWeek();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        mutableDateTime52.setMinuteOfDay(4);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        int int61 = mutableDateTime58.getYearOfCentury();
        org.joda.time.Chronology chronology62 = mutableDateTime58.getChronology();
        int int63 = mutableDateTime58.getWeekOfWeekyear();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.DateTimeZone dateTimeZone67 = mutableDateTime66.getZone();
        org.joda.time.DateTime dateTime68 = mutableDateTime58.toDateTime(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime52.toMutableDateTime(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(dateTimeZone67);
        mutableDateTime40.setZoneRetainFields(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime37.toMutableDateTime(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(dateTimeZone67);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:25.341Z" + "'", str4, "2020-11-25T01:49:25.341Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:25.341Z" + "'", str11, "2020-11-25T01:49:25.341Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:25.341Z" + "'", str15, "2020-11-25T01:49:25.341Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:25.341Z" + "'", str22, "2020-11-25T01:49:25.341Z");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:25.341Z" + "'", str29, "2020-11-25T01:49:25.341Z");
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:25.341Z" + "'", str33, "2020-11-25T01:49:25.341Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(chronology36);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2020-11-25T01:49:25.341Z" + "'", str42, "2020-11-25T01:49:25.341Z");
        org.junit.Assert.assertNotNull(property45);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:25.341Z" + "'", str46, "2020-11-25T01:49:25.341Z");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone53);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2020-11-25T01:49:25.341Z" + "'", str60, "2020-11-25T01:49:25.341Z");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 48 + "'", int63 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(mutableDateTime69);
        org.junit.Assert.assertNotNull(mutableDateTime72);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.weekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        int int15 = mutableDateTime10.getWeekOfWeekyear();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime10.toDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime10.copy();
        boolean boolean22 = mutableDateTime10.isAfterNow();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime10.centuryOfEra();
        int int24 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime mutableDateTime26 = property7.add(35);
        mutableDateTime26.addSeconds(2025);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:25.461Z" + "'", str12, "2020-11-25T01:49:25.461Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.dayOfYear();
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfMonth();
        int int9 = mutableDateTime7.getCenturyOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.setSecondOfMinute((int) '4');
        int int15 = mutableDateTime12.getMinuteOfDay();
        int int16 = mutableDateTime12.getCenturyOfEra();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        int int20 = mutableDateTime19.getDayOfWeek();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        mutableDateTime19.setZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = mutableDateTime12.toDateTime(dateTimeZone24);
        mutableDateTime7.setZoneRetainFields(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime3.toMutableDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) '#', dateTimeZone24);
        org.joda.time.DateTime dateTime32 = mutableDateTime31.toDateTimeISO();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime13 = property8.roundHalfFloor();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.setSecondOfMinute((int) '4');
        int int19 = mutableDateTime16.getMinuteOfDay();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.centuryOfEra();
        int int38 = property28.getDifference((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime32.toMutableDateTimeISO();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime39.toMutableDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) 815, dateTimeZone43);
        mutableDateTime16.setZoneRetainFields(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, dateTimeZone43);
        mutableDateTime47.setMillis((long) 862);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:25.559Z" + "'", str4, "2020-11-25T01:49:25.559Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:25.559Z" + "'", str25, "2020-11-25T01:49:25.559Z");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeField29);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:25.559Z" + "'", str34, "2020-11-25T01:49:25.559Z");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        boolean boolean14 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add(2189);
        java.lang.String str18 = mutableDateTime17.toString();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.yearOfCentury();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.dayOfWeek();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime21.millisOfDay();
        mutableDateTime21.add((long) 3);
        boolean boolean31 = mutableDateTime17.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime17.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = property32.addWrapField(1);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:25.614Z" + "'", str4, "2020-11-25T01:49:25.614Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T02:25:54.614Z" + "'", str18, "2020-11-25T02:25:54.614Z");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:25.614Z" + "'", str23, "2020-11-25T01:49:25.614Z");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.DateTimeField dateTimeField14 = mutableDateTime11.getRoundingField();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.minuteOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.dayOfWeek();
        int int31 = property30.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime33 = property30.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime34 = property30.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime34.add(readablePeriod35, 40);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        int int43 = mutableDateTime40.getYearOfCentury();
        org.joda.time.Chronology chronology44 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime34.toMutableDateTime(chronology44);
        mutableDateTime17.setChronology(chronology44);
        mutableDateTime11.setChronology(chronology44);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime2.toMutableDateTime(chronology44);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.year();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:25.707Z" + "'", str4, "2020-11-25T01:49:25.707Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:25.707Z" + "'", str13, "2020-11-25T01:49:25.707Z");
        org.junit.Assert.assertNull(dateTimeField14);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:25.707Z" + "'", str26, "2020-11-25T01:49:25.707Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2020-11-25T01:49:25.707Z" + "'", str42, "2020-11-25T01:49:25.707Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20 + "'", int43 == 20);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:48:47.932Z");
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 40);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        int int25 = mutableDateTime24.getRoundingMode();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:25.814Z" + "'", str4, "2020-11-25T01:49:25.814Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:25.814Z" + "'", str20, "2020-11-25T01:49:25.814Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.hourOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime4.dayOfWeek();
        int int11 = property10.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.addWrapField(0);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        mutableDateTime16.setMinuteOfDay(4);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        int int27 = mutableDateTime22.getWeekOfWeekyear();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.DateTime dateTime32 = mutableDateTime22.toDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime16.toMutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = mutableDateTime13.toDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 56942393, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(1580521636072L, dateTimeZone31);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:25.853Z" + "'", str6, "2020-11-25T01:49:25.853Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:25.853Z" + "'", str24, "2020-11-25T01:49:25.853Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:41.430Z", dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 627, dateTimeZone14);
        mutableDateTime16.setSecondOfMinute((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime16.add(readableDuration19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfMonth();
        boolean boolean24 = mutableDateTime21.isBefore((long) 9);
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology25);
        mutableDateTime16.setChronology(chronology25);
        mutableDateTime2.setChronology(chronology25);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime2.add(readablePeriod29);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.dayOfWeek();
        java.lang.String str40 = mutableDateTime33.toString();
        org.joda.time.ReadableDuration readableDuration41 = null;
        mutableDateTime33.add(readableDuration41, (int) (byte) 0);
        org.joda.time.Instant instant44 = mutableDateTime33.toInstant();
        int int45 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) instant44);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:25.916Z" + "'", str4, "2020-11-25T01:49:25.916Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11-25T01:49:25.916Z" + "'", str35, "2020-11-25T01:49:25.916Z");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2020-11-25T01:49:25.916Z" + "'", str40, "2020-11-25T01:49:25.916Z");
        org.junit.Assert.assertNotNull(instant44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.weekyear();
        java.lang.String str13 = property12.getAsString();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020" + "'", str13, "2020");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DurationField durationField6 = property3.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime7 = property3.roundHalfEven();
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = property3.set("2020-11-25T01:47:21.832Z", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:47:21.832Z\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology3);
        mutableDateTime4.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.minuteOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.year();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfWeek();
        int int18 = property17.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime21 = property17.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime21.add(readablePeriod22, 40);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime21.toMutableDateTime(chronology31);
        mutableDateTime4.setChronology(chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj1, chronology31);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 10, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        mutableDateTime36.add(readableDuration39, 6300);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:26.031Z" + "'", str13, "2020-11-25T01:49:26.031Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:26.031Z" + "'", str29, "2020-11-25T01:49:26.031Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01T00:00:00.010Z" + "'", str38, "1970-01-01T00:00:00.010Z");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        long long9 = mutableDateTime8.getMillis();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant18 = null;
        mutableDateTime12.setDate(readableInstant18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        int int22 = mutableDateTime20.getCenturyOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        mutableDateTime25.setSecondOfMinute((int) '4');
        int int28 = mutableDateTime25.getMinuteOfDay();
        int int29 = mutableDateTime25.getCenturyOfEra();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        int int33 = mutableDateTime32.getDayOfWeek();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        mutableDateTime32.setZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = mutableDateTime25.toDateTime(dateTimeZone37);
        mutableDateTime20.setZoneRetainFields(dateTimeZone37);
        mutableDateTime12.setZone(dateTimeZone37);
        org.joda.time.DateTime dateTime43 = mutableDateTime8.toDateTime(dateTimeZone37);
        mutableDateTime8.setMillis((long) 6389);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1580521766090L + "'", long9 == 1580521766090L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:26.090Z" + "'", str14, "2020-11-25T01:49:26.090Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 19 + "'", int29 == 19);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = mutableDateTime2.clone();
        long long18 = mutableDateTime2.getMillis();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        mutableDateTime19.setYear(6382);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.dayOfMonth();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:26.165Z" + "'", str4, "2020-11-25T01:49:26.165Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:26.165Z" + "'", str11, "2020-11-25T01:49:26.165Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:26.165Z" + "'", str15, "2020-11-25T01:49:26.165Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1606262400035L + "'", long18 == 1606262400035L);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        boolean boolean14 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add(2189);
        java.lang.String str18 = mutableDateTime17.toString();
        mutableDateTime17.addWeekyears(53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime17.toString(dateTimeFormatter21);
        mutableDateTime17.setMillisOfSecond(635);
        int int25 = mutableDateTime17.getYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:26.213Z" + "'", str4, "2020-11-25T01:49:26.213Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T02:25:55.213Z" + "'", str18, "2020-11-25T02:25:55.213Z");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2073-11-29T02:25:55.213Z" + "'", str22, "2073-11-29T02:25:55.213Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2073 + "'", int25 == 2073);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.Interval interval4 = property2.toInterval();
        org.joda.time.MutableDateTime mutableDateTime6 = property2.add(336);
        mutableDateTime6.setMinuteOfHour(17);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime6.add(readableDuration9);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.secondOfDay();
        java.lang.String str9 = property8.getName();
        int int10 = property8.getLeapAmount();
        long long11 = property8.remainder();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondOfDay" + "'", str9, "secondOfDay");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 313L + "'", long11 == 313L);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = mutableDateTime5.clone();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        mutableDateTime9.setMillisOfSecond(7);
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = mutableDateTime9.toCalendar(locale15);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.set(49);
        org.joda.time.DurationField durationField27 = property24.getDurationField();
        org.joda.time.DateTimeField dateTimeField28 = property24.getField();
        int int29 = mutableDateTime9.get(dateTimeField28);
        mutableDateTime5.setRounding(dateTimeField28);
        mutableDateTime5.add(1580521560970L);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundCeiling();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        mutableDateTime5.setRounding(dateTimeField39);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "2020-12-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "2020-12-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "2020-12-01T00:00:00.000Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:26.350Z" + "'", str11, "2020-11-25T01:49:26.350Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1606268966007,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=26,MILLISECOND=7,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeField39);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        mutableDateTime2.addMillis(7);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime2.toString(dateTimeFormatter10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfEra();
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = mutableDateTime2.toCalendar(locale13);
        int int15 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime2.toMutableDateTime();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=6566424,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=26,MILLISECOND=424,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T01:49:26.424Z" + "'", str11, "1970-01-01T01:49:26.424Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=6566424,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=26,MILLISECOND=424,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 424 + "'", int15 == 424);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        long long3 = property2.remainder();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.MutableDateTime mutableDateTime6 = property2.set(815);
        int int7 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 259200010L + "'", long3 == 259200010L);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-292275054) + "'", int7 == (-292275054));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime5.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.dayOfWeek();
        int int12 = property11.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        int int15 = mutableDateTime13.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.dayOfYear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        org.joda.time.DurationField durationField26 = property25.getRangeDurationField();
        java.util.Locale locale27 = null;
        int int28 = property25.getMaximumShortTextLength(locale27);
        org.joda.time.MutableDateTime mutableDateTime30 = property25.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.centuryOfEra();
        boolean boolean32 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime30);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.dayOfWeek();
        org.joda.time.DurationField durationField43 = property42.getRangeDurationField();
        org.joda.time.DurationField durationField44 = property42.getDurationField();
        org.joda.time.DateTimeField dateTimeField45 = property42.getField();
        int int46 = mutableDateTime1.get(dateTimeField45);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:26.474Z" + "'", str7, "2020-11-25T01:49:26.474Z");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:26.474Z" + "'", str21, "2020-11-25T01:49:26.474Z");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:26.474Z" + "'", str38, "2020-11-25T01:49:26.474Z");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        mutableDateTime3.setSecondOfMinute((int) '4');
        int int6 = mutableDateTime3.getMinuteOfDay();
        int int7 = mutableDateTime3.getCenturyOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        int int11 = mutableDateTime10.getDayOfWeek();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime10.setZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = mutableDateTime3.toDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(259200010L, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.copy();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime2.add(readableDuration10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.centuryOfEra();
        java.lang.String str13 = property12.getAsString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:26.581Z" + "'", str4, "2020-11-25T01:49:26.581Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "20" + "'", str13, "20");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        int int8 = mutableDateTime3.getWeekOfWeekyear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTime dateTime13 = mutableDateTime3.toDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((-1L), dateTimeZone12);
        org.joda.time.DateTime dateTime15 = mutableDateTime14.toDateTimeISO();
        java.util.Locale locale16 = null;
        java.util.Calendar calendar17 = mutableDateTime14.toCalendar(locale16);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime20.add(readablePeriod25);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        mutableDateTime29.setTime((long) '#');
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        java.lang.String str42 = mutableDateTime36.toString();
        int int43 = mutableDateTime29.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        java.lang.Object obj44 = mutableDateTime29.clone();
        long long45 = mutableDateTime29.getMillis();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime48.add(readablePeriod51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property53.getFieldType();
        int int55 = mutableDateTime29.get(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime20.property(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime20.secondOfMinute();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        mutableDateTime60.add(readablePeriod63);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime60.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime60.toMutableDateTimeISO();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = mutableDateTime69.toString(dateTimeFormatter70);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        mutableDateTime69.add(readablePeriod72);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime69.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField75 = property74.getField();
        int int76 = mutableDateTime60.get(dateTimeField75);
        int int77 = mutableDateTime20.get(dateTimeField75);
        mutableDateTime14.setRounding(dateTimeField75, 0);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:26.616Z" + "'", str5, "2020-11-25T01:49:26.616Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:26.616Z" + "'", str22, "2020-11-25T01:49:26.616Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(chronology24);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:26.616Z" + "'", str31, "2020-11-25T01:49:26.616Z");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:26.616Z" + "'", str38, "2020-11-25T01:49:26.616Z");
        org.junit.Assert.assertNotNull(property41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2020-11-25T01:49:26.616Z" + "'", str42, "2020-11-25T01:49:26.616Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1606262400035L + "'", long45 == 1606262400035L);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2020-11-25T01:49:26.616Z" + "'", str50, "2020-11-25T01:49:26.616Z");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property57);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "2020-11-25T01:49:26.617Z" + "'", str62, "2020-11-25T01:49:26.617Z");
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "2020-11-25T01:49:26.617Z" + "'", str71, "2020-11-25T01:49:26.617Z");
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 20 + "'", int76 == 20);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 20 + "'", int77 == 20);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add((long) (short) -1);
        mutableDateTime17.setWeekOfWeekyear((int) '4');
        org.joda.time.Chronology chronology20 = mutableDateTime17.getChronology();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime23.minuteOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime23.year();
        java.lang.String str28 = property27.getAsString();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.roundHalfFloor();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.yearOfCentury();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime32.dayOfWeek();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime32.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        int int41 = mutableDateTime29.get(dateTimeFieldType40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime17.property(dateTimeFieldType40);
        boolean boolean43 = mutableDateTime11.isSupported(dateTimeFieldType40);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:26.714Z" + "'", str4, "2020-11-25T01:49:26.714Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970" + "'", str28, "1970");
        org.junit.Assert.assertNotNull(mutableDateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:26.714Z" + "'", str34, "2020-11-25T01:49:26.714Z");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 19 + "'", int41 == 19);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundFloor();
        mutableDateTime17.addMinutes(107);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime17.setMinuteOfDay((-26769600));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -26769600 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:26.764Z" + "'", str4, "2020-11-25T01:49:26.764Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        int int8 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfSecond();
        long long10 = mutableDateTime2.getMillis();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:26.792Z" + "'", str4, "2020-11-25T01:49:26.792Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1606268966792L + "'", long10 == 1606268966792L);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        int int9 = mutableDateTime8.getWeekOfWeekyear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:26.821Z" + "'", str4, "2020-11-25T01:49:26.821Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:49:18.688Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekOfWeekyear();
        long long9 = property8.remainder();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        int int14 = mutableDateTime13.getDayOfWeek();
        mutableDateTime13.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(1606268874700L, dateTimeZone18);
        int int20 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:26.867Z" + "'", str4, "2020-11-25T01:49:26.867Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 179366867L + "'", long9 == 179366867L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setWeekOfWeekyear(48);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:41.430Z", dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 627, dateTimeZone8);
        mutableDateTime10.setSecondOfMinute((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime10.add(readableDuration13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfMonth();
        boolean boolean18 = mutableDateTime15.isBefore((long) 9);
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology19);
        mutableDateTime10.setChronology(chronology19);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, chronology19);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology19);
        mutableDateTime23.addMinutes(0);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = mutableDateTime2.clone();
        long long18 = mutableDateTime2.getMillis();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        int int28 = mutableDateTime2.get(dateTimeFieldType27);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now();
        mutableDateTime30.setWeekOfWeekyear(48);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:41.430Z", dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 627, dateTimeZone38);
        mutableDateTime40.setSecondOfMinute((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration43 = null;
        mutableDateTime40.add(readableDuration43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.dayOfMonth();
        boolean boolean48 = mutableDateTime45.isBefore((long) 9);
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(chronology49);
        mutableDateTime40.setChronology(chronology49);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime30, chronology49);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime29.toMutableDateTime(chronology49);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:26.946Z" + "'", str4, "2020-11-25T01:49:26.946Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:26.946Z" + "'", str11, "2020-11-25T01:49:26.946Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:26.946Z" + "'", str15, "2020-11-25T01:49:26.946Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1606262400035L + "'", long18 == 1606262400035L);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:26.946Z" + "'", str23, "2020-11-25T01:49:26.946Z");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime53);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        int int5 = mutableDateTime2.getMinuteOfDay();
        mutableDateTime2.setDate((long) 6300);
        boolean boolean9 = mutableDateTime2.isBefore((long) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) (short) -1);
        mutableDateTime15.setWeekOfWeekyear(40);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.dayOfWeek();
        int int27 = property26.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime29 = property26.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime30 = property26.roundHalfEven();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.year();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = mutableDateTime34.getYearOfCentury();
        org.joda.time.Chronology chronology38 = mutableDateTime34.getChronology();
        int int39 = mutableDateTime34.getWeekOfWeekyear();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.DateTime dateTime44 = mutableDateTime34.toDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime34.copy();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.dayOfWeek();
        mutableDateTime30.setDate((org.joda.time.ReadableInstant) mutableDateTime45);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableDateTime50.add(readablePeriod53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime50.centuryOfEra();
        int int56 = property55.get();
        org.joda.time.MutableDateTime mutableDateTime58 = property55.addWrapField(6300);
        org.joda.time.DateTimeField dateTimeField59 = property55.getField();
        int int60 = mutableDateTime30.get(dateTimeField59);
        mutableDateTime15.setRounding(dateTimeField59);
        mutableDateTime2.setRounding(dateTimeField59);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setHourOfDay((-718728));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -718728 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:27.017Z" + "'", str22, "2020-11-25T01:49:27.017Z");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property31);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:27.017Z" + "'", str36, "2020-11-25T01:49:27.017Z");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 48 + "'", int39 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(property46);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2020-11-25T01:49:27.018Z" + "'", str52, "2020-11-25T01:49:27.018Z");
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 20 + "'", int56 == 20);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 20 + "'", int60 == 20);
        org.junit.Assert.assertNotNull(property63);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.Interval interval4 = property2.toInterval();
        int int5 = property2.get();
        org.joda.time.MutableDateTime mutableDateTime7 = property2.add((long) 565);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.millisOfSecond();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = dateTime12.isSupported(dateTimeFieldType13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        int int24 = property23.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime27 = property23.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime27.add(readablePeriod28, 40);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime27.toMutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology37);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.dayOfYear();
        mutableDateTime39.setMillis((long) 2020);
        java.lang.String str43 = mutableDateTime39.toString();
        boolean boolean44 = dateTime12.isAfter((org.joda.time.ReadableInstant) mutableDateTime39);
        mutableDateTime39.addSeconds(17);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.098Z" + "'", str4, "2020-11-25T01:49:27.098Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:27.098Z" + "'", str19, "2020-11-25T01:49:27.098Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11-25T01:49:27.098Z" + "'", str35, "2020-11-25T01:49:27.098Z");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20 + "'", int36 == 20);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01T00:00:02.020Z" + "'", str43, "1970-01-01T00:00:02.020Z");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        int int10 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.add(0L);
        int int13 = mutableDateTime2.getMillisOfSecond();
        int int14 = mutableDateTime2.getDayOfYear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.millisOfSecond();
        java.util.Date date16 = mutableDateTime2.toDate();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.149Z" + "'", str4, "2020-11-25T01:49:27.149Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 149 + "'", int13 == 149);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 330 + "'", int14 == 330);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Wed Nov 25 01:49:27 UTC 2020");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        mutableDateTime2.setDate((long) 815);
        org.joda.time.Instant instant9 = mutableDateTime2.toInstant();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.178Z" + "'", str4, "2020-11-25T01:49:27.178Z");
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        mutableDateTime2.addMillis(7);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime2.toString(dateTimeFormatter10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfEra();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.dayOfWeek();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        mutableDateTime24.setTime((long) '#');
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        java.lang.String str37 = mutableDateTime31.toString();
        int int38 = mutableDateTime24.compareTo((org.joda.time.ReadableInstant) mutableDateTime31);
        java.lang.Object obj39 = mutableDateTime24.clone();
        long long40 = mutableDateTime24.getMillis();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property48.getFieldType();
        int int50 = mutableDateTime24.get(dateTimeFieldType49);
        boolean boolean51 = property21.equals((java.lang.Object) mutableDateTime24);
        java.util.Locale locale52 = null;
        int int53 = property21.getMaximumTextLength(locale52);
        org.joda.time.DateTimeField dateTimeField54 = property21.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setRounding(dateTimeField54, 424);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 424");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=6567222,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=27,MILLISECOND=222,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T01:49:27.222Z" + "'", str11, "1970-01-01T01:49:27.222Z");
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:27.215Z" + "'", str17, "2020-11-25T01:49:27.215Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:27.215Z" + "'", str26, "2020-11-25T01:49:27.215Z");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:27.215Z" + "'", str33, "2020-11-25T01:49:27.215Z");
        org.junit.Assert.assertNotNull(property36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2020-11-25T01:49:27.215Z" + "'", str37, "2020-11-25T01:49:27.215Z");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1606262400035L + "'", long40 == 1606262400035L);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:27.215Z" + "'", str45, "2020-11-25T01:49:27.215Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 9 + "'", int53 == 9);
        org.junit.Assert.assertNotNull(dateTimeField54);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.add((int) '#');
        mutableDateTime8.setMillisOfSecond(0);
        int int11 = mutableDateTime8.getDayOfWeek();
        java.lang.String str12 = mutableDateTime8.toString();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2023-11-01T00:00:00.000Z" + "'", str12, "2023-11-01T00:00:00.000Z");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.monthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        int int16 = property15.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime19 = property15.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime19.add(readablePeriod20, 40);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime19.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 100, chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology29);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime2.dayOfWeek();
        java.util.Locale locale35 = null;
        int int36 = property34.getMaximumTextLength(locale35);
        org.joda.time.MutableDateTime mutableDateTime37 = property34.roundHalfEven();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:27.307Z" + "'", str11, "2020-11-25T01:49:27.307Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:27.307Z" + "'", str27, "2020-11-25T01:49:27.307Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertNotNull(mutableDateTime37);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        org.joda.time.DateTimeField dateTimeField11 = property8.getField();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setTime((long) '#');
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        java.lang.String str27 = mutableDateTime21.toString();
        int int28 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        java.lang.Object obj29 = mutableDateTime14.clone();
        long long30 = mutableDateTime14.getMillis();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime14);
        mutableDateTime31.setYear(6382);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        int int37 = mutableDateTime36.getDayOfWeek();
        mutableDateTime36.addSeconds((int) (byte) 0);
        mutableDateTime36.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime36);
        long long43 = mutableDateTime42.getMillis();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime46.add(readablePeriod49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant52 = null;
        mutableDateTime46.setDate(readableInstant52);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime54.dayOfMonth();
        int int56 = mutableDateTime54.getCenturyOfEra();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology58);
        mutableDateTime59.setSecondOfMinute((int) '4');
        int int62 = mutableDateTime59.getMinuteOfDay();
        int int63 = mutableDateTime59.getCenturyOfEra();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        int int67 = mutableDateTime66.getDayOfWeek();
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.DateTimeZone dateTimeZone71 = mutableDateTime70.getZone();
        org.joda.time.MutableDateTime mutableDateTime72 = org.joda.time.MutableDateTime.now(dateTimeZone71);
        mutableDateTime66.setZoneRetainFields(dateTimeZone71);
        org.joda.time.DateTime dateTime74 = mutableDateTime59.toDateTime(dateTimeZone71);
        mutableDateTime54.setZoneRetainFields(dateTimeZone71);
        mutableDateTime46.setZone(dateTimeZone71);
        org.joda.time.DateTime dateTime77 = mutableDateTime42.toDateTime(dateTimeZone71);
        org.joda.time.DateTimeZone dateTimeZone78 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime31, dateTimeZone78);
        mutableDateTime79.addWeekyears(36);
        boolean boolean83 = mutableDateTime79.isBefore((long) 105);
        int int84 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime79);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime79.secondOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.373Z" + "'", str4, "2020-11-25T01:49:27.373Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:27.373Z" + "'", str16, "2020-11-25T01:49:27.373Z");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:27.373Z" + "'", str23, "2020-11-25T01:49:27.373Z");
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:27.373Z" + "'", str27, "2020-11-25T01:49:27.373Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1606262400035L + "'", long30 == 1606262400035L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1580521767374L + "'", long43 == 1580521767374L);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2020-11-25T01:49:27.374Z" + "'", str48, "2020-11-25T01:49:27.374Z");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 20 + "'", int56 == 20);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 19 + "'", int63 == 19);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTimeZone78);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(property85);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        java.lang.String str12 = property8.getAsText();
        java.util.Locale locale13 = null;
        int int14 = property8.getMaximumTextLength(locale13);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.478Z" + "'", str4, "2020-11-25T01:49:27.478Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Wednesday" + "'", str12, "Wednesday");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime5.copy();
        mutableDateTime8.setYear((int) (byte) 0);
        org.joda.time.Chronology chronology11 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology11);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.centuryOfEra();
        int int9 = property8.getMinimumValueOverall();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.546Z" + "'", str4, "2020-11-25T01:49:27.546Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:39.774Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        mutableDateTime5.setMinuteOfDay(4);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        int int16 = mutableDateTime11.getWeekOfWeekyear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTime dateTime21 = mutableDateTime11.toDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime5.toMutableDateTime(dateTimeZone20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        boolean boolean31 = mutableDateTime22.isAfter((org.joda.time.ReadableInstant) mutableDateTime30);
        boolean boolean32 = property2.equals((java.lang.Object) boolean31);
        int int33 = property2.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime34 = property2.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.weekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:27.590Z" + "'", str13, "2020-11-25T01:49:27.590Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:27.590Z" + "'", str27, "2020-11-25T01:49:27.590Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime2.getRoundingField();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant18 = null;
        mutableDateTime12.setDate(readableInstant18);
        mutableDateTime12.setMillis((long) 'a');
        boolean boolean22 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        int int23 = mutableDateTime2.getMonthOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.627Z" + "'", str4, "2020-11-25T01:49:27.627Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(dateTimeField9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:27.628Z" + "'", str14, "2020-11-25T01:49:27.628Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.set(46);
        org.joda.time.ReadableInstant readableInstant14 = null;
        long long15 = property11.getDifferenceAsLong(readableInstant14);
        boolean boolean16 = property11.isLeap();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 15305696L + "'", long15 == 15305696L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 40);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        int int24 = mutableDateTime12.getSecondOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.696Z" + "'", str4, "2020-11-25T01:49:27.696Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:27.696Z" + "'", str20, "2020-11-25T01:49:27.696Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        boolean boolean9 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.hourOfDay();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.property(dateTimeFieldType19);
        long long21 = mutableDateTime2.getMillis();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setHourOfDay(6460774);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6460774 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.732Z" + "'", str4, "2020-11-25T01:49:27.732Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:27.732Z" + "'", str8, "2020-11-25T01:49:27.732Z");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:27.732Z" + "'", str15, "2020-11-25T01:49:27.732Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1606268967732L + "'", long21 == 1606268967732L);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.hourOfDay();
        int int12 = property11.get();
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.752Z" + "'", str4, "2020-11-25T01:49:27.752Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfHour();
        mutableDateTime2.setMillisOfSecond(21);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        int int5 = mutableDateTime2.getMonthOfYear();
        int int6 = mutableDateTime2.getMillisOfSecond();
        int int7 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        int int9 = mutableDateTime2.getEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27 + "'", int4 == 27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 805 + "'", int6 == 805);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.dayOfWeek();
        int int10 = property9.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime13 = property9.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, 40);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime13.toMutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 100, chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology23);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology23);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology23);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.weekyear();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:27.826Z" + "'", str5, "2020-11-25T01:49:27.826Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:27.826Z" + "'", str21, "2020-11-25T01:49:27.826Z");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.weekyear();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTime();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant18 = null;
        mutableDateTime12.setDate(readableInstant18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        int int22 = mutableDateTime20.getCenturyOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        mutableDateTime25.setSecondOfMinute((int) '4');
        int int28 = mutableDateTime25.getMinuteOfDay();
        int int29 = mutableDateTime25.getCenturyOfEra();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        int int33 = mutableDateTime32.getDayOfWeek();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        mutableDateTime32.setZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = mutableDateTime25.toDateTime(dateTimeZone37);
        mutableDateTime20.setZoneRetainFields(dateTimeZone37);
        mutableDateTime12.setZone(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, dateTimeZone37);
        org.joda.time.DateTime dateTime45 = mutableDateTime2.toDateTime(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone37);
        int int48 = mutableDateTime47.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:27.894Z" + "'", str14, "2020-11-25T01:49:27.894Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 19 + "'", int29 == 19);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 48 + "'", int48 == 48);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.weekOfWeekyear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        mutableDateTime20.setHourOfDay((int) (byte) 0);
        mutableDateTime20.setMinuteOfHour(10);
        boolean boolean25 = property15.equals((java.lang.Object) mutableDateTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.952Z" + "'", str4, "2020-11-25T01:49:27.952Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        int int11 = property8.get();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:27.991Z" + "'", str4, "2020-11-25T01:49:27.991Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.Interval interval4 = property2.toInterval();
        org.joda.time.MutableDateTime mutableDateTime6 = property2.add(336);
        org.joda.time.MutableDateTime mutableDateTime7 = property2.roundCeiling();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = property2.set(56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        int int13 = property11.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.getMutableDateTime();
        long long15 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.weekyear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        mutableDateTime21.setMinuteOfDay(4);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        int int32 = mutableDateTime27.getWeekOfWeekyear();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.DateTime dateTime37 = mutableDateTime27.toDateTime(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime21.toMutableDateTime(dateTimeZone36);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        int int44 = mutableDateTime41.getYearOfCentury();
        org.joda.time.Chronology chronology45 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(chronology45);
        boolean boolean47 = mutableDateTime38.isAfter((org.joda.time.ReadableInstant) mutableDateTime46);
        boolean boolean48 = property18.equals((java.lang.Object) boolean47);
        int int49 = property18.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime50 = property18.roundHalfFloor();
        org.joda.time.DateTime dateTime51 = mutableDateTime50.toDateTime();
        mutableDateTime50.setSecondOfMinute(56);
        int int54 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime50);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        mutableDateTime57.setTime((long) '#');
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = mutableDateTime64.toString(dateTimeFormatter65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        mutableDateTime64.add(readablePeriod67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.hourOfDay();
        java.lang.String str70 = mutableDateTime64.toString();
        int int71 = mutableDateTime57.compareTo((org.joda.time.ReadableInstant) mutableDateTime64);
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime57.copy();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime57.dayOfYear();
        int int74 = mutableDateTime57.getEra();
        int int75 = mutableDateTime57.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime76 = mutableDateTime57.toMutableDateTimeISO();
        long long77 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.DurationFieldType durationFieldType78 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime57.add(durationFieldType78, 445);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone22);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:28.063Z" + "'", str29, "2020-11-25T01:49:28.063Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 48 + "'", int32 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2020-11-25T01:49:28.063Z" + "'", str43, "2020-11-25T01:49:28.063Z");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20 + "'", int44 == 20);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2020-11-25T01:49:28.063Z" + "'", str59, "2020-11-25T01:49:28.063Z");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2020-11-25T01:49:28.063Z" + "'", str66, "2020-11-25T01:49:28.063Z");
        org.junit.Assert.assertNotNull(property69);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2020-11-25T01:49:28.063Z" + "'", str70, "2020-11-25T01:49:28.063Z");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 35 + "'", int75 == 35);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-18591L) + "'", long77 == (-18591L));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        boolean boolean10 = mutableDateTime9.isEqualNow();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.dayOfMonth();
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9);
        java.util.Locale locale14 = null;
        java.util.Calendar calendar15 = mutableDateTime13.toCalendar(locale14);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=2521929600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2049,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=335,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.centuryOfEra();
        boolean boolean11 = mutableDateTime2.isBeforeNow();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.centuryOfEra();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime17.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime14, chronology29);
        mutableDateTime2.setChronology(chronology29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        boolean boolean42 = mutableDateTime2.isSupported(dateTimeFieldType41);
        int int43 = mutableDateTime2.getMinuteOfHour();
        mutableDateTime2.setTime((long) 39);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:28.146Z" + "'", str4, "2020-11-25T01:49:28.146Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:28.146Z" + "'", str19, "2020-11-25T01:49:28.146Z");
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:28.146Z" + "'", str27, "2020-11-25T01:49:28.146Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2020-11-25T01:49:28.146Z" + "'", str37, "2020-11-25T01:49:28.146Z");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 49 + "'", int43 == 49);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        org.joda.time.DurationField durationField3 = property2.getLeapDurationField();
        java.lang.String str4 = property2.getAsString();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.getMutableDateTime();
        org.joda.time.Interval interval6 = property2.toInterval();
        int int7 = property2.get();
        org.joda.time.MutableDateTime mutableDateTime9 = property2.add(6389);
        mutableDateTime9.setMinuteOfDay(787);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime9.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970" + "'", str4, "1970");
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.monthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        int int16 = property15.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime19 = property15.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime19.add(readablePeriod20, 40);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime19.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 100, chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology29);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.DateTime dateTime35 = mutableDateTime34.toDateTimeISO();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime38.dayOfWeek();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime38.secondOfDay();
        int int46 = mutableDateTime38.getWeekOfWeekyear();
        mutableDateTime38.setMillis((long) 6);
        mutableDateTime34.setDate((org.joda.time.ReadableInstant) mutableDateTime38);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:28.251Z" + "'", str11, "2020-11-25T01:49:28.251Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:28.251Z" + "'", str27, "2020-11-25T01:49:28.251Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2020-11-25T01:49:28.252Z" + "'", str40, "2020-11-25T01:49:28.252Z");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 48 + "'", int46 == 48);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        int int10 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.add(0L);
        int int13 = mutableDateTime2.getMillisOfSecond();
        int int14 = mutableDateTime2.getDayOfYear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.millisOfSecond();
        int int16 = property15.getMaximumValue();
        int int17 = property15.get();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:28.318Z" + "'", str4, "2020-11-25T01:49:28.318Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 318 + "'", int13 == 318);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 330 + "'", int14 == 330);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 999 + "'", int16 == 999);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 318 + "'", int17 == 318);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        int int8 = property7.get();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:28.361Z" + "'", str4, "2020-11-25T01:49:28.361Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.copy();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime2.toMutableDateTime(chronology24);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        mutableDateTime29.setTime((long) '#');
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        java.lang.String str42 = mutableDateTime36.toString();
        int int43 = mutableDateTime29.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime29.copy();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        int int50 = mutableDateTime47.getYearOfCentury();
        org.joda.time.Chronology chronology51 = mutableDateTime47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology51);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime29.toMutableDateTime(chronology51);
        org.joda.time.DateTime dateTime54 = mutableDateTime2.toDateTime(chronology51);
        mutableDateTime2.setYear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMonthOfYear(17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:28.387Z" + "'", str4, "2020-11-25T01:49:28.387Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:28.387Z" + "'", str11, "2020-11-25T01:49:28.387Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:28.387Z" + "'", str15, "2020-11-25T01:49:28.387Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:28.387Z" + "'", str22, "2020-11-25T01:49:28.387Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:28.387Z" + "'", str31, "2020-11-25T01:49:28.387Z");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:28.387Z" + "'", str38, "2020-11-25T01:49:28.387Z");
        org.junit.Assert.assertNotNull(property41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2020-11-25T01:49:28.387Z" + "'", str42, "2020-11-25T01:49:28.387Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime44);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2020-11-25T01:49:28.387Z" + "'", str49, "2020-11-25T01:49:28.387Z");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20 + "'", int50 == 20);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj10 = mutableDateTime9.clone();
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime9.getZone();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.yearOfCentury();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime14.millisOfDay();
        mutableDateTime14.add((long) 3);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime14.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime14.toString(dateTimeFormatter25);
        mutableDateTime14.addWeekyears((int) (short) 1);
        boolean boolean29 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "2020-02-01T01:49:28.426Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "2020-02-01T01:49:28.426Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "2020-02-01T01:49:28.426Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:28.426Z" + "'", str16, "2020-11-25T01:49:28.426Z");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:28.429Z" + "'", str26, "2020-11-25T01:49:28.429Z");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        java.util.Locale locale6 = null;
        int int7 = property3.getMaximumShortTextLength(locale6);
        long long8 = property3.remainder();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        mutableDateTime11.setSecondOfDay((int) '#');
        mutableDateTime11.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int20 = mutableDateTime11.getMillisOfSecond();
        int int21 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime11.millisOfSecond();
        int int23 = mutableDateTime11.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        int int16 = property15.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime19 = property15.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime19.add(readablePeriod20, 40);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime19.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.dayOfWeek();
        int int42 = property41.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime44 = property41.addWrapField(0);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        mutableDateTime47.setMinuteOfDay(4);
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        int int56 = mutableDateTime53.getYearOfCentury();
        org.joda.time.Chronology chronology57 = mutableDateTime53.getChronology();
        int int58 = mutableDateTime53.getWeekOfWeekyear();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime61.getZone();
        org.joda.time.DateTime dateTime63 = mutableDateTime53.toDateTime(dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime47.toMutableDateTime(dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime66 = mutableDateTime44.toDateTime(dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime67 = org.joda.time.MutableDateTime.now(dateTimeZone62);
        mutableDateTime32.setZoneRetainFields(dateTimeZone62);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(1439, 610, 6528, 6488934, 981, 19, 0, dateTimeZone62);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6488934 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:28.496Z" + "'", str11, "2020-11-25T01:49:28.496Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:28.496Z" + "'", str27, "2020-11-25T01:49:28.496Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2020-11-25T01:49:28.496Z" + "'", str37, "2020-11-25T01:49:28.496Z");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 7 + "'", int42 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone48);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2020-11-25T01:49:28.496Z" + "'", str55, "2020-11-25T01:49:28.496Z");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 20 + "'", int56 == 20);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 48 + "'", int58 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(mutableDateTime67);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:41.430Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        mutableDateTime5.addMillis(23);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 40);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        java.lang.String str26 = property25.getAsString();
        long long27 = property25.remainder();
        org.joda.time.DurationField durationField28 = property25.getRangeDurationField();
        org.joda.time.DurationField durationField29 = property25.getRangeDurationField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:28.573Z" + "'", str4, "2020-11-25T01:49:28.573Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:28.573Z" + "'", str20, "2020-11-25T01:49:28.573Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "330" + "'", str26, "330");
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 6568573L + "'", long27 == 6568573L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        int int13 = property11.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.getMutableDateTime();
        long long15 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.weekyear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        mutableDateTime21.setMinuteOfDay(4);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        int int32 = mutableDateTime27.getWeekOfWeekyear();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.DateTime dateTime37 = mutableDateTime27.toDateTime(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime21.toMutableDateTime(dateTimeZone36);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        int int44 = mutableDateTime41.getYearOfCentury();
        org.joda.time.Chronology chronology45 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(chronology45);
        boolean boolean47 = mutableDateTime38.isAfter((org.joda.time.ReadableInstant) mutableDateTime46);
        boolean boolean48 = property18.equals((java.lang.Object) boolean47);
        int int49 = property18.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime50 = property18.roundHalfFloor();
        org.joda.time.DateTime dateTime51 = mutableDateTime50.toDateTime();
        mutableDateTime50.setSecondOfMinute(56);
        int int54 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime50);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        mutableDateTime57.setTime((long) '#');
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = mutableDateTime64.toString(dateTimeFormatter65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        mutableDateTime64.add(readablePeriod67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.hourOfDay();
        java.lang.String str70 = mutableDateTime64.toString();
        int int71 = mutableDateTime57.compareTo((org.joda.time.ReadableInstant) mutableDateTime64);
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime57.copy();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime57.dayOfYear();
        int int74 = mutableDateTime57.getEra();
        int int75 = mutableDateTime57.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime76 = mutableDateTime57.toMutableDateTimeISO();
        long long77 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.MutableDateTime mutableDateTime78 = property3.roundHalfFloor();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone22);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:28.610Z" + "'", str29, "2020-11-25T01:49:28.610Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 48 + "'", int32 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2020-11-25T01:49:28.610Z" + "'", str43, "2020-11-25T01:49:28.610Z");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20 + "'", int44 == 20);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2020-11-25T01:49:28.610Z" + "'", str59, "2020-11-25T01:49:28.610Z");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2020-11-25T01:49:28.610Z" + "'", str66, "2020-11-25T01:49:28.610Z");
        org.junit.Assert.assertNotNull(property69);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2020-11-25T01:49:28.610Z" + "'", str70, "2020-11-25T01:49:28.610Z");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 35 + "'", int75 == 35);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-18591L) + "'", long77 == (-18591L));
        org.junit.Assert.assertNotNull(mutableDateTime78);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        boolean boolean14 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add(2189);
        java.lang.String str18 = mutableDateTime17.toString();
        int int19 = mutableDateTime17.getDayOfYear();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.dayOfWeek();
        int int21 = mutableDateTime17.getDayOfMonth();
        boolean boolean22 = mutableDateTime17.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime17.getZone();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:28.716Z" + "'", str4, "2020-11-25T01:49:28.716Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T02:25:57.716Z" + "'", str18, "2020-11-25T02:25:57.716Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 330 + "'", int19 == 330);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25 + "'", int21 == 25);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.setWeekyear((int) (short) 10);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.millisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        mutableDateTime2.addWeeks(17);
        mutableDateTime2.addMinutes(2);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.yearOfEra();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        int int8 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.add((long) 330);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.addSeconds(9);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:28.816Z" + "'", str4, "2020-11-25T01:49:28.816Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.String str3 = property2.getAsString();
        int int4 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime2.copy();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:28.859Z" + "'", str4, "2020-11-25T01:49:28.859Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        int int8 = property7.get();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.copy();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:28.897Z" + "'", str4, "2020-11-25T01:49:28.897Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:08.350Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        int int5 = mutableDateTime4.getDayOfWeek();
        mutableDateTime4.addSeconds((int) (byte) 0);
        int int8 = mutableDateTime4.getSecondOfMinute();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        mutableDateTime11.setTime((long) '#');
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        java.lang.String str24 = mutableDateTime18.toString();
        int int25 = mutableDateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj26 = mutableDateTime11.clone();
        long long27 = mutableDateTime11.getMillis();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        int int37 = mutableDateTime11.get(dateTimeFieldType36);
        int int38 = mutableDateTime4.get(dateTimeFieldType36);
        int int39 = mutableDateTime4.getCenturyOfEra();
        boolean boolean40 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime4);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.yearOfCentury();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property49.getFieldType();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime4.property(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 28 + "'", int8 == 28);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:28.934Z" + "'", str13, "2020-11-25T01:49:28.934Z");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:28.934Z" + "'", str20, "2020-11-25T01:49:28.934Z");
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:28.934Z" + "'", str24, "2020-11-25T01:49:28.934Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1606262400035L + "'", long27 == 1606262400035L);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:28.934Z" + "'", str32, "2020-11-25T01:49:28.934Z");
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:28.934Z" + "'", str45, "2020-11-25T01:49:28.934Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        int int4 = mutableDateTime3.getDayOfWeek();
        mutableDateTime3.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.secondOfMinute();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.weekyear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        int int16 = mutableDateTime11.getWeekOfWeekyear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTime dateTime21 = mutableDateTime11.toDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime11.copy();
        boolean boolean23 = mutableDateTime11.isAfterNow();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime11.centuryOfEra();
        int int25 = property8.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        mutableDateTime11.setSecondOfDay(21);
        mutableDateTime11.addHours(104);
        mutableDateTime11.addWeekyears(3);
        org.joda.time.Chronology chronology32 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 6317185, chronology32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:28.994Z" + "'", str13, "2020-11-25T01:49:28.994Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.DateTimeField dateTimeField14 = mutableDateTime11.getRoundingField();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.minuteOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.year();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.dayOfWeek();
        int int31 = property30.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime33 = property30.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime34 = property30.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime34.add(readablePeriod35, 40);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        int int43 = mutableDateTime40.getYearOfCentury();
        org.joda.time.Chronology chronology44 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime34.toMutableDateTime(chronology44);
        mutableDateTime17.setChronology(chronology44);
        mutableDateTime11.setChronology(chronology44);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime2.toMutableDateTime(chronology44);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime2.dayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.040Z" + "'", str4, "2020-11-25T01:49:29.040Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:29.041Z" + "'", str13, "2020-11-25T01:49:29.041Z");
        org.junit.Assert.assertNull(dateTimeField14);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:29.041Z" + "'", str26, "2020-11-25T01:49:29.041Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2020-11-25T01:49:29.041Z" + "'", str42, "2020-11-25T01:49:29.041Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20 + "'", int43 == 20);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        java.lang.String str11 = property9.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.089Z" + "'", str4, "2020-11-25T01:49:29.089Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[secondOfDay]" + "'", str11, "Property[secondOfDay]");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundHalfCeiling();
        org.joda.time.DateTimeField dateTimeField11 = property8.getField();
        int int12 = property8.getMinimumValueOverall();
        int int13 = property8.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime14 = property8.roundHalfCeiling();
        int int15 = mutableDateTime14.getDayOfMonth();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.113Z" + "'", str4, "2020-11-25T01:49:29.113Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        int int17 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime mutableDateTime18 = property7.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = property7.set(296);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.147Z" + "'", str4, "2020-11-25T01:49:29.147Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:29.147Z" + "'", str13, "2020-11-25T01:49:29.147Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        int int5 = mutableDateTime2.getMinuteOfDay();
        int int6 = mutableDateTime2.getCenturyOfEra();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        mutableDateTime9.setZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = mutableDateTime2.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.dayOfYear();
        int int19 = mutableDateTime2.getEra();
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime2.add(readableDuration20);
        int int22 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime2.copy();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        mutableDateTime26.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime26.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime26.add(readablePeriod30);
        mutableDateTime23.setMillis((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundHalfCeiling();
        org.joda.time.DateTimeField dateTimeField11 = property8.getField();
        int int12 = property8.getMinimumValueOverall();
        int int13 = property8.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime14 = property8.roundHalfCeiling();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.setHourOfDay(233);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 233 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.221Z" + "'", str4, "2020-11-25T01:49:29.221Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        mutableDateTime13.setWeekOfWeekyear((int) '4');
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.secondOfDay();
        org.joda.time.Interval interval18 = property17.toInterval();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.260Z" + "'", str4, "2020-11-25T01:49:29.260Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        long long3 = property2.remainder();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology5);
        mutableDateTime6.setSecondOfMinute((int) '4');
        int int9 = mutableDateTime6.getMinuteOfDay();
        int int10 = mutableDateTime6.getCenturyOfEra();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        int int14 = mutableDateTime13.getDayOfWeek();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        mutableDateTime13.setZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = mutableDateTime6.toDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        long long23 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime mutableDateTime24 = property2.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime26 = property2.add((long) 9);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 259200010L + "'", long3 == 259200010L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-50L) + "'", long23 == (-50L));
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:21.556Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj10 = mutableDateTime2.clone();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.357Z" + "'", str4, "2020-11-25T01:49:29.357Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "2020-11-25T01:49:29.357Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "2020-11-25T01:49:29.357Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "2020-11-25T01:49:29.357Z");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        mutableDateTime11.setSecondOfMinute((int) '4');
        int int14 = mutableDateTime11.getMinuteOfDay();
        int int15 = mutableDateTime11.getCenturyOfEra();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        int int19 = mutableDateTime18.getDayOfWeek();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        mutableDateTime18.setZoneRetainFields(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = mutableDateTime11.toDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 1439, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 7, dateTimeZone23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(4, 18, (int) (short) 1, 2060, 17, (int) (short) -1, 6549032, dateTimeZone23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2060 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.toMutableDateTime();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime11);
        java.lang.String str13 = mutableDateTime11.toString();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-12-01T00:00:00.000Z" + "'", str13, "2020-12-01T00:00:00.000Z");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundCeiling();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.minuteOfHour();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property5.getAsText(locale6);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DurationField durationField6 = property3.getLeapDurationField();
        java.lang.String str7 = property3.getAsShortText();
        java.util.Locale locale8 = null;
        int int9 = property3.getMaximumShortTextLength(locale8);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        mutableDateTime2.addYears(1);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.minuteOfDay();
        int int12 = property11.getMaximumValue();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property11.getAsShortText(locale13);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.roundFloor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1439 + "'", int12 == 1439);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "109" + "'", str14, "109");
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.copy();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        mutableDateTime20.setTime((long) '#');
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        java.lang.String str33 = mutableDateTime27.toString();
        int int34 = mutableDateTime20.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime27.millisOfDay();
        org.joda.time.Chronology chronology36 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology36);
        java.lang.String str38 = mutableDateTime37.toString();
        boolean boolean40 = mutableDateTime37.equals((java.lang.Object) "106");
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.hourOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.495Z" + "'", str4, "2020-11-25T01:49:29.495Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:29.495Z" + "'", str11, "2020-11-25T01:49:29.495Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:29.495Z" + "'", str15, "2020-11-25T01:49:29.495Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:29.495Z" + "'", str22, "2020-11-25T01:49:29.495Z");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:29.495Z" + "'", str29, "2020-11-25T01:49:29.495Z");
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:29.495Z" + "'", str33, "2020-11-25T01:49:29.495Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T00:00:00.035Z" + "'", str38, "2020-11-25T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.copy();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime2.toMutableDateTime(chronology24);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        mutableDateTime29.setTime((long) '#');
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        java.lang.String str42 = mutableDateTime36.toString();
        int int43 = mutableDateTime29.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime29.copy();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        int int50 = mutableDateTime47.getYearOfCentury();
        org.joda.time.Chronology chronology51 = mutableDateTime47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology51);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime29.toMutableDateTime(chronology51);
        org.joda.time.DateTime dateTime54 = mutableDateTime2.toDateTime(chronology51);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime57.add(readablePeriod60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.yearOfCentury();
        int int63 = property62.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime64 = property62.roundFloor();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime64.centuryOfEra();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.DateTimeZone dateTimeZone70 = mutableDateTime69.getZone();
        org.joda.time.MutableDateTime mutableDateTime71 = org.joda.time.MutableDateTime.now(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:44.742Z", dateTimeZone70);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableDateTime72.add(readablePeriod73, 336);
        mutableDateTime72.setTime(0L);
        mutableDateTime64.setMillis((org.joda.time.ReadableInstant) mutableDateTime72);
        org.joda.time.DateTimeZone dateTimeZone79 = mutableDateTime64.getZone();
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone79);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMinuteOfHour((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.537Z" + "'", str4, "2020-11-25T01:49:29.537Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:29.537Z" + "'", str11, "2020-11-25T01:49:29.537Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:29.537Z" + "'", str15, "2020-11-25T01:49:29.537Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:29.537Z" + "'", str22, "2020-11-25T01:49:29.537Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:29.537Z" + "'", str31, "2020-11-25T01:49:29.537Z");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:29.537Z" + "'", str38, "2020-11-25T01:49:29.537Z");
        org.junit.Assert.assertNotNull(property41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2020-11-25T01:49:29.537Z" + "'", str42, "2020-11-25T01:49:29.537Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime44);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2020-11-25T01:49:29.537Z" + "'", str49, "2020-11-25T01:49:29.537Z");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20 + "'", int50 == 20);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2020-11-25T01:49:29.537Z" + "'", str59, "2020-11-25T01:49:29.537Z");
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertNotNull(dateTimeZone79);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(10L);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set(49);
        boolean boolean10 = mutableDateTime9.isEqualNow();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.dayOfMonth();
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.DateTime dateTime13 = mutableDateTime9.toDateTime();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertNotNull(dateTime13);
    }
}
