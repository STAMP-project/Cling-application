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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime2.getZone();
        mutableDateTime2.addHours(6330195);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime12.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.dayOfWeek();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.era();
        boolean boolean18 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.yearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setMillisOfSecond(7);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfMinute();
        int int9 = property8.getMaximumValue();
        java.util.Locale locale10 = null;
        int int11 = property8.getMaximumTextLength(locale10);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.490Z" + "'", str4, "2020-11-25T01:49:53.490Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        mutableDateTime13.add(readablePeriod14, 12);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime13.toMutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 2, chronology23);
        mutableDateTime25.addSeconds(30);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:53.559Z" + "'", str5, "2020-11-25T01:49:53.559Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:53.559Z" + "'", str21, "2020-11-25T01:49:53.559Z");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        mutableDateTime2.setYear(48);
        boolean boolean8 = mutableDateTime2.isAfter((long) 'a');
        int int9 = mutableDateTime2.getMillisOfSecond();
        int int10 = mutableDateTime2.getMonthOfYear();
        org.joda.time.DateTime dateTime11 = mutableDateTime2.toDateTimeISO();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.add(4);
        mutableDateTime7.setDayOfWeek(7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.add((long) ' ');
        int int7 = property3.get();
        java.lang.String str8 = property3.getAsString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "33" + "'", str8, "33");
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
        mutableDateTime9.setMonthOfYear((int) (short) 1);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property27.getFieldType();
        boolean boolean32 = mutableDateTime9.isSupported(dateTimeFieldType31);
        mutableDateTime9.setSecondOfMinute((int) ' ');
        mutableDateTime9.setMillis((long) 6472);
        mutableDateTime9.setYear(365);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.957Z" + "'", str4, "2020-11-25T01:49:53.957Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:53.958Z" + "'", str11, "2020-11-25T01:49:53.958Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:53.958Z" + "'", str15, "2020-11-25T01:49:53.958Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:53.958Z" + "'", str23, "2020-11-25T01:49:53.958Z");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.dayOfWeek();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.era();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(19, (int) (short) 10, (int) (short) 10, 11, (int) '4', 12, 10);
        int int19 = mutableDateTime18.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.roundHalfEven();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        mutableDateTime26.setSecondOfDay((int) '#');
        int int30 = mutableDateTime26.getMonthOfYear();
        long long31 = mutableDateTime26.getMillis();
        int int32 = property21.getDifference((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean33 = mutableDateTime18.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime26.millisOfSecond();
        boolean boolean35 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime26);
        int int36 = mutableDateTime9.getRoundingMode();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 283 + "'", int19 == 283);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1606262435043L + "'", long31 == 1606262435043L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        int int7 = mutableDateTime4.getYearOfCentury();
        org.joda.time.Chronology chronology8 = mutableDateTime4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:49.382Z", chronology8);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:24.569Z", chronology8);
        mutableDateTime11.setMillis((long) 6489915);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:54.193Z" + "'", str6, "2020-11-25T01:49:54.193Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        mutableDateTime9.setMonthOfYear((int) (short) 1);
        java.util.Date date19 = mutableDateTime9.toDate();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:54.286Z" + "'", str4, "2020-11-25T01:49:54.286Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:54.286Z" + "'", str11, "2020-11-25T01:49:54.286Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:54.286Z" + "'", str15, "2020-11-25T01:49:54.286Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 25 01:49:54 UTC 2020");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.monthOfYear();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime2.add(readableDuration6, 10);
        int int9 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.hourOfDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        boolean boolean16 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime7.hourOfDay();
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime20 = property17.set("2020-11-25T01:48:45.149Z", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:48:45.149Z\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:54.525Z" + "'", str4, "2020-11-25T01:49:54.525Z");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:54.525Z" + "'", str12, "2020-11-25T01:49:54.525Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
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
        org.joda.time.DurationField durationField10 = property9.getRangeDurationField();
        org.joda.time.Interval interval11 = property9.toInterval();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setTime((long) '#');
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime14);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        boolean boolean28 = mutableDateTime19.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        int int29 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        int int38 = mutableDateTime33.getWeekOfWeekyear();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.DateTime dateTime43 = mutableDateTime33.toDateTime(dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone42);
        boolean boolean45 = mutableDateTime19.isEqual((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime44.add(readableDuration46, 105);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:54.574Z" + "'", str4, "2020-11-25T01:49:54.574Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(interval11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:54.574Z" + "'", str16, "2020-11-25T01:49:54.574Z");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:54.574Z" + "'", str24, "2020-11-25T01:49:54.574Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11-25T01:49:54.574Z" + "'", str35, "2020-11-25T01:49:54.574Z");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20 + "'", int36 == 20);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 48 + "'", int38 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime2.toString(dateTimeFormatter7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add(0L);
        boolean boolean13 = mutableDateTime11.equals((java.lang.Object) "2020-11-25T01:45:48.082Z");
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.weekyear();
        mutableDateTime11.setMillis((long) 6388);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:54.845Z" + "'", str4, "2020-11-25T01:49:54.845Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:54.845Z" + "'", str8, "2020-11-25T01:49:54.845Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.minuteOfDay();
        java.lang.String str2 = property1.getAsText();
        int int3 = property1.getLeapAmount();
        org.joda.time.Interval interval4 = property1.toInterval();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "109" + "'", str2, "109");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(interval4);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        int int8 = mutableDateTime5.getYearOfCentury();
        org.joda.time.Chronology chronology9 = mutableDateTime5.getChronology();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 335, dateTimeZone14);
        int int19 = mutableDateTime18.getWeekyear();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.weekOfWeekyear();
        org.joda.time.DateTime dateTime21 = mutableDateTime18.toDateTime();
        int int22 = mutableDateTime18.getMinuteOfDay();
        java.lang.String str23 = mutableDateTime18.toString();
        int int24 = mutableDateTime18.getDayOfWeek();
        mutableDateTime18.setMillis((long) 40099);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:55.010Z" + "'", str7, "2020-11-25T01:49:55.010Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T00:00:00.335Z" + "'", str23, "1970-01-01T00:00:00.335Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime7 = property3.add((long) 292278993);
        int int8 = property3.getMinimumValueOverall();
        long long9 = property3.remainder();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        mutableDateTime12.add(readablePeriod13, 12);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:12.798Z", dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone20);
        boolean boolean23 = mutableDateTime22.isAfterNow();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:12.798Z", dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (short) 100, dateTimeZone29);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.monthOfYear();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        mutableDateTime35.setTime((long) '#');
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.centuryOfEra();
        boolean boolean48 = mutableDateTime35.isEqual((org.joda.time.ReadableInstant) mutableDateTime42);
        mutableDateTime42.setDayOfYear(1);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology52);
        mutableDateTime53.setSecondOfMinute((int) '4');
        mutableDateTime53.setYear(48);
        boolean boolean59 = mutableDateTime53.isAfter((long) 'a');
        int int60 = mutableDateTime53.getMillisOfSecond();
        java.lang.Object obj61 = mutableDateTime53.clone();
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.Instant instant65 = mutableDateTime64.toInstant();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime64.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime67 = property66.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime67.toMutableDateTime();
        mutableDateTime68.addMonths(4);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime68.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime73 = property71.add((int) (short) 100);
        int int74 = property71.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField75 = property71.getField();
        mutableDateTime53.setRounding(dateTimeField75);
        int int77 = mutableDateTime42.get(dateTimeField75);
        int int78 = mutableDateTime31.get(dateTimeField75);
        mutableDateTime22.setRounding(dateTimeField75);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:55.182Z" + "'", str4, "2020-11-25T01:49:55.182Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2020-11-25T01:49:55.183Z" + "'", str37, "2020-11-25T01:49:55.183Z");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:55.183Z" + "'", str44, "2020-11-25T01:49:55.183Z");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "0048-01-01T00:00:52.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "0048-01-01T00:00:52.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "0048-01-01T00:00:52.001Z");
        org.junit.Assert.assertNotNull(instant65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(mutableDateTime67);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(dateTimeField75);
// flaky:         org.junit.Assert.assertTrue("'" + int77 + "' != '" + 6595 + "'", int77 == 6595);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone12);
        mutableDateTime14.setMonthOfYear(7);
        int int17 = mutableDateTime14.getYearOfEra();
        org.joda.time.Instant instant18 = mutableDateTime14.toInstant();
        int int19 = mutableDateTime14.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime14.toMutableDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:55.275Z" + "'", str5, "2020-11-25T01:49:55.275Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime5.addDays((int) '#');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        java.lang.String str17 = mutableDateTime10.toString();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.dayOfMonth();
        int int19 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.addYears((int) ' ');
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime10.minuteOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime10.minuteOfHour();
        java.util.Locale locale25 = null;
        int int26 = property24.getMaximumShortTextLength(locale25);
        org.joda.time.DateTimeField dateTimeField27 = property24.getField();
        int int28 = property24.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:55.326Z" + "'", str12, "2020-11-25T01:49:55.326Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:55.326Z" + "'", str17, "2020-11-25T01:49:55.326Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime5.addDays((int) '#');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        java.lang.String str17 = mutableDateTime10.toString();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.dayOfMonth();
        int int19 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.addYears((int) ' ');
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime10.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime10.add(readablePeriod23);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone28);
        mutableDateTime30.addMonths(2020);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        mutableDateTime35.setTime((long) '#');
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.hourOfDay();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime42.dayOfWeek();
        int int49 = property48.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime51 = property48.addWrapField(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property48.getFieldType();
        boolean boolean53 = mutableDateTime35.isSupported(dateTimeFieldType52);
        int int54 = mutableDateTime30.get(dateTimeFieldType52);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime10.property(dateTimeFieldType52);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime10.dayOfMonth();
        java.lang.String str57 = property56.toString();
        org.joda.time.DurationField durationField58 = property56.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:55.406Z" + "'", str12, "2020-11-25T01:49:55.406Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:55.406Z" + "'", str17, "2020-11-25T01:49:55.406Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2020-11-25T01:49:55.406Z" + "'", str37, "2020-11-25T01:49:55.406Z");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:55.406Z" + "'", str44, "2020-11-25T01:49:55.406Z");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 7 + "'", int49 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Property[dayOfMonth]" + "'", str57, "Property[dayOfMonth]");
        org.junit.Assert.assertNull(durationField58);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add(510);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfFloor();
        int int11 = property7.get();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26 + "'", int11 == 26);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setSecondOfDay((int) (short) 100);
        boolean boolean8 = mutableDateTime2.isEqual((long) 105);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime2.add(readableDuration9, 1970);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.addWrapField(6470);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 55 + "'", int4 == 55);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setSecondOfDay((int) (short) 100);
        boolean boolean8 = mutableDateTime2.isEqual((long) 105);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 55 + "'", int4 == 55);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        mutableDateTime4.setSecondOfDay((int) (short) 0);
        mutableDateTime4.addHours(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:11.739Z");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology3);
        mutableDateTime4.setSecondOfMinute((int) '4');
        mutableDateTime4.setYear(48);
        boolean boolean9 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime4.setYear(527);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.setMillis((long) 'a');
        org.joda.time.DateTime dateTime3 = mutableDateTime0.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime3.getZone();
        int int5 = dateTime3.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        int int5 = mutableDateTime4.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime4.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.monthOfYear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime4.setZoneRetainFields(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone11);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = mutableDateTime18.toDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 6388, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 100, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.yearOfEra();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property29);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfCeiling();
        mutableDateTime12.add(1606268938750L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.053Z" + "'", str4, "2020-11-25T01:49:56.053Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        int int7 = property6.getMinimumValueOverall();
        int int8 = property6.getLeapAmount();
        int int9 = property6.getMinimumValue();
        int int10 = property6.getLeapAmount();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        mutableDateTime13.setDate((long) 10);
        int int17 = mutableDateTime13.getCenturyOfEra();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        mutableDateTime20.setMillisOfSecond(7);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.secondOfMinute();
        int int27 = mutableDateTime20.getEra();
        boolean boolean28 = mutableDateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime20.minuteOfHour();
        int int30 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:56.095Z" + "'", str22, "2020-11-25T01:49:56.095Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        mutableDateTime3.setHourOfDay(2);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:12.798Z", dateTimeZone12);
        mutableDateTime3.setZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = mutableDateTime3.getRoundingField();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        int int19 = mutableDateTime18.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime18.copy();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.monthOfYear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone25);
        mutableDateTime18.setZoneRetainFields(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone25);
        mutableDateTime3.setZoneRetainFields(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 6394, dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone25);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone38);
        mutableDateTime40.addMonths(2020);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        mutableDateTime45.setTime((long) '#');
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.hourOfDay();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime52.dayOfWeek();
        int int59 = property58.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime61 = property58.addWrapField(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property58.getFieldType();
        boolean boolean63 = mutableDateTime45.isSupported(dateTimeFieldType62);
        int int64 = mutableDateTime40.get(dateTimeFieldType62);
        boolean boolean65 = mutableDateTime34.isSupported(dateTimeFieldType62);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        int int69 = mutableDateTime68.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime68.copy();
        java.util.Date date71 = mutableDateTime70.toDate();
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = null;
        java.lang.String str76 = mutableDateTime74.toString(dateTimeFormatter75);
        int int77 = mutableDateTime74.getYearOfCentury();
        org.joda.time.Chronology chronology78 = mutableDateTime74.getChronology();
        org.joda.time.MutableDateTime mutableDateTime79 = org.joda.time.MutableDateTime.now(chronology78);
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(chronology78);
        org.joda.time.DateTime dateTime81 = mutableDateTime70.toDateTime(chronology78);
        org.joda.time.MutableDateTime mutableDateTime82 = mutableDateTime34.toMutableDateTime(chronology78);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:56.184Z" + "'", str5, "2020-11-25T01:49:56.184Z");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2020-11-25T01:49:56.184Z" + "'", str47, "2020-11-25T01:49:56.184Z");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2020-11-25T01:49:56.184Z" + "'", str54, "2020-11-25T01:49:56.184Z");
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 7 + "'", int59 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertNotNull(date71);
// flaky:         org.junit.Assert.assertEquals(date71.toString(), "Wed Nov 25 01:49:56 UTC 2020");
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "2020-11-25T01:49:56.184Z" + "'", str76, "2020-11-25T01:49:56.184Z");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 20 + "'", int77 == 20);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(mutableDateTime82);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.DurationField durationField10 = property9.getRangeDurationField();
        org.joda.time.Interval interval11 = property9.toInterval();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setTime((long) '#');
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime14);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        boolean boolean28 = mutableDateTime19.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        int int29 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        int int38 = mutableDateTime33.getWeekOfWeekyear();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.DateTime dateTime43 = mutableDateTime33.toDateTime(dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone42);
        boolean boolean45 = mutableDateTime19.isEqual((org.joda.time.ReadableInstant) mutableDateTime44);
        long long46 = mutableDateTime44.getMillis();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.468Z" + "'", str4, "2020-11-25T01:49:56.468Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(interval11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:56.468Z" + "'", str16, "2020-11-25T01:49:56.468Z");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:56.468Z" + "'", str24, "2020-11-25T01:49:56.468Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11-25T01:49:56.468Z" + "'", str35, "2020-11-25T01:49:56.468Z");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20 + "'", int36 == 20);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 48 + "'", int38 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        java.util.Date date9 = mutableDateTime8.toDate();
        mutableDateTime8.setSecondOfDay(6388);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        int int15 = mutableDateTime14.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime14.copy();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.monthOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone21);
        mutableDateTime14.setZoneRetainFields(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone21);
        mutableDateTime8.setZone(dateTimeZone21);
        mutableDateTime8.setMillis((long) 22);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.628Z" + "'", str4, "2020-11-25T01:49:56.628Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 01:49:56 UTC 2020");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        boolean boolean8 = mutableDateTime2.isBefore((long) 99);
        org.joda.time.Chronology chronology9 = mutableDateTime2.getChronology();
        mutableDateTime2.setDate((long) 59);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.secondOfDay();
        int int14 = mutableDateTime2.getDayOfWeek();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        mutableDateTime17.setDayOfYear((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime17.add(readablePeriod24, (-1));
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.monthOfYear();
        mutableDateTime29.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.addWrapField(4);
        org.joda.time.DateTimeField dateTimeField37 = mutableDateTime36.getRoundingField();
        boolean boolean38 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime36);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.Instant instant42 = mutableDateTime41.toInstant();
        mutableDateTime41.setDate((long) 10);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime41.yearOfCentury();
        int int46 = mutableDateTime17.compareTo((org.joda.time.ReadableInstant) mutableDateTime41);
        boolean boolean47 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime41);
        mutableDateTime41.addSeconds(49);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.702Z" + "'", str4, "2020-11-25T01:49:56.702Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:56.702Z" + "'", str19, "2020-11-25T01:49:56.702Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        boolean boolean14 = mutableDateTime8.isBefore((long) 99);
        org.joda.time.Chronology chronology15 = mutableDateTime8.getChronology();
        mutableDateTime8.setDate((long) 59);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime8.secondOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime8.secondOfDay();
        int int20 = mutableDateTime8.getDayOfWeek();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        mutableDateTime23.setDayOfYear((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime23.add(readablePeriod30, (-1));
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        mutableDateTime35.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.addWrapField(4);
        org.joda.time.DateTimeField dateTimeField43 = mutableDateTime42.getRoundingField();
        boolean boolean44 = mutableDateTime23.isAfter((org.joda.time.ReadableInstant) mutableDateTime42);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.Instant instant48 = mutableDateTime47.toInstant();
        mutableDateTime47.setDate((long) 10);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime47.yearOfCentury();
        int int52 = mutableDateTime23.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        boolean boolean53 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime8.getZone();
        mutableDateTime2.setZone(dateTimeZone54);
        boolean boolean57 = mutableDateTime2.isEqual((long) 6580);
        org.junit.Assert.assertNotNull(chronology5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:56.766Z" + "'", str10, "2020-11-25T01:49:56.766Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:56.766Z" + "'", str25, "2020-11-25T01:49:56.766Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        org.joda.time.DurationField durationField9 = property7.getRangeDurationField();
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        java.lang.String str11 = property7.getAsText();
        int int12 = property7.getMaximumValue();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "56" + "'", str11, "56");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        java.util.Date date9 = mutableDateTime8.toDate();
        mutableDateTime8.setSecondOfDay(6388);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        int int15 = mutableDateTime14.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime14.copy();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.monthOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone21);
        mutableDateTime14.setZoneRetainFields(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone21);
        mutableDateTime8.setZone(dateTimeZone21);
        mutableDateTime8.setDayOfMonth(8);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.843Z" + "'", str4, "2020-11-25T01:49:56.843Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 01:49:56 UTC 2020");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 12);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        mutableDateTime26.setHourOfDay(2);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone34);
        mutableDateTime26.setZoneRetainFields(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime41 = mutableDateTime12.toDateTime(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime41);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        int int48 = mutableDateTime45.getYearOfCentury();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(chronology49);
        org.joda.time.DateTime dateTime51 = dateTime41.toDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology49);
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = mutableDateTime56.toString(dateTimeFormatter57);
        mutableDateTime56.setHourOfDay(2);
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = mutableDateTime63.getZone();
        org.joda.time.MutableDateTime mutableDateTime65 = org.joda.time.MutableDateTime.now(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime67 = org.joda.time.MutableDateTime.now(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(dateTimeZone64);
        mutableDateTime56.setZoneRetainFields(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 70, dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime52.toMutableDateTime(dateTimeZone64);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime71.setDateTime(44, 6471104, 29562891, 6388, 54, 229, (-292273084));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6388 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.008Z" + "'", str4, "2020-11-25T01:49:57.008Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:57.008Z" + "'", str20, "2020-11-25T01:49:57.008Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:57.008Z" + "'", str28, "2020-11-25T01:49:57.008Z");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime41);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2020-11-25T01:49:57.009Z" + "'", str47, "2020-11-25T01:49:57.009Z");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 20 + "'", int48 == 20);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "2020-11-25T01:49:57.009Z" + "'", str58, "2020-11-25T01:49:57.009Z");
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(mutableDateTime67);
        org.junit.Assert.assertNotNull(mutableDateTime71);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime10.toMutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.copy();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        mutableDateTime22.setTime((long) '#');
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.hourOfDay();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime29.dayOfWeek();
        int int36 = property35.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime38 = property35.addWrapField(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property35.getFieldType();
        boolean boolean40 = mutableDateTime22.isSupported(dateTimeFieldType39);
        int int41 = mutableDateTime19.get(dateTimeFieldType39);
        org.joda.time.ReadableDuration readableDuration42 = null;
        mutableDateTime19.add(readableDuration42, 10);
        int int45 = mutableDateTime19.getSecondOfMinute();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.153Z" + "'", str4, "2020-11-25T01:49:57.153Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:57.153Z" + "'", str15, "2020-11-25T01:49:57.153Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:57.153Z" + "'", str24, "2020-11-25T01:49:57.153Z");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:57.153Z" + "'", str31, "2020-11-25T01:49:57.153Z");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 58 + "'", int45 == 58);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        mutableDateTime13.add(readablePeriod14, 12);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime13.toMutableDateTime(chronology23);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setHourOfDay(2);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone35);
        mutableDateTime27.setZoneRetainFields(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime42 = mutableDateTime13.toDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime42);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        int int49 = mutableDateTime46.getYearOfCentury();
        org.joda.time.Chronology chronology50 = mutableDateTime46.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.DateTime dateTime52 = dateTime42.toDateTime(chronology50);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 3, chronology50);
        mutableDateTime53.add(0L);
        org.joda.time.DateTime dateTime56 = mutableDateTime53.toDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:57.260Z" + "'", str5, "2020-11-25T01:49:57.260Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:57.260Z" + "'", str21, "2020-11-25T01:49:57.260Z");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:57.260Z" + "'", str29, "2020-11-25T01:49:57.260Z");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime42);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2020-11-25T01:49:57.260Z" + "'", str48, "2020-11-25T01:49:57.260Z");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20 + "'", int49 == 20);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime56);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime6.setZone(dateTimeZone10);
        java.util.Locale locale14 = null;
        java.util.Calendar calendar15 = mutableDateTime6.toCalendar(locale14);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1606268997411,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=57,MILLISECOND=411,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        long long15 = property13.remainder();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        int int21 = mutableDateTime18.getYearOfEra();
        int int22 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime18.addWeekyears(6366);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.roundFloor();
        org.joda.time.DurationField durationField32 = property29.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime34 = property29.add((long) (short) 10);
        int int35 = mutableDateTime34.getWeekyear();
        int int36 = mutableDateTime18.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37, 19);
        boolean boolean40 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime34);
        mutableDateTime2.setMillisOfSecond(783);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.472Z" + "'", str4, "2020-11-25T01:49:57.472Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:57.472Z" + "'", str8, "2020-11-25T01:49:57.472Z");
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2020 + "'", int21 == 2020);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2021 + "'", int35 == 2021);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.year();
        mutableDateTime12.addWeekyears(6473498);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.569Z" + "'", str4, "2020-11-25T01:49:57.569Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.String str8 = property7.getAsString();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumTextLength(locale9);
        int int11 = property7.get();
        java.lang.String str12 = property7.getAsShortText();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = property7.set("2020-11-25T01:47:54.564Z", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:47:54.564Z\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.641Z" + "'", str4, "2020-11-25T01:49:57.641Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20" + "'", str8, "20");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "20" + "'", str12, "20");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        mutableDateTime9.setSecondOfDay((int) (short) 0);
        mutableDateTime9.addWeekyears(12);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime9.yearOfCentury();
        int int22 = property21.getMinimumValue();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.735Z" + "'", str4, "2020-11-25T01:49:57.735Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:57.735Z" + "'", str11, "2020-11-25T01:49:57.735Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:57.735Z" + "'", str15, "2020-11-25T01:49:57.735Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime1.getZone();
        int int4 = mutableDateTime1.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        boolean boolean19 = property10.equals((java.lang.Object) chronology17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = property10.getAsText(locale20);
        int int22 = property10.get();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.947Z" + "'", str4, "2020-11-25T01:49:57.947Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:57.947Z" + "'", str9, "2020-11-25T01:49:57.947Z");
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:57.947Z" + "'", str15, "2020-11-25T01:49:57.947Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "25" + "'", str21, "25");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        int int7 = property6.getLeapAmount();
        org.joda.time.DurationField durationField8 = property6.getLeapDurationField();
        int int9 = property6.getMaximumValue();
        org.joda.time.DurationField durationField10 = property6.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime12 = property6.set(44);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.004Z" + "'", str4, "2020-11-25T01:49:58.004Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
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
        mutableDateTime2.setTime((long) '#');
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
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property15.getFieldType();
        boolean boolean20 = mutableDateTime2.isSupported(dateTimeFieldType19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        int int25 = mutableDateTime24.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime24.copy();
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime26.toGregorianCalendar();
        int int28 = mutableDateTime26.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime26.dayOfWeek();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime26.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime2.property(dateTimeFieldType31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime2.add(readableDuration33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime2.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType36 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.add(durationFieldType36, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.068Z" + "'", str4, "2020-11-25T01:49:58.068Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:58.068Z" + "'", str11, "2020-11-25T01:49:58.068Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 109 + "'", int28 == 109);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.DurationField durationField8 = property7.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfFloor();
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = mutableDateTime9.toCalendar(locale10);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1609459200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime10.toMutableDateTime(chronology17);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime18.toMutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone22);
        int int25 = mutableDateTime24.getRoundingMode();
        java.util.Date date26 = mutableDateTime24.toDate();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime24.dayOfMonth();
        boolean boolean28 = mutableDateTime24.isAfterNow();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.169Z" + "'", str4, "2020-11-25T01:49:58.169Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:58.170Z" + "'", str15, "2020-11-25T01:49:58.170Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed Nov 25 01:49:58 UTC 2020");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime7 = property3.add((long) 292278993);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        int int11 = mutableDateTime10.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime10.copy();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.monthOfYear();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone17);
        mutableDateTime10.setZoneRetainFields(dateTimeZone17);
        int int23 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime mutableDateTime24 = property3.roundCeiling();
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        int int29 = mutableDateTime28.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime28.copy();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.monthOfYear();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone35);
        mutableDateTime28.setZoneRetainFields(dateTimeZone35);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        int int44 = mutableDateTime43.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime43.copy();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime43.monthOfYear();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(dateTimeZone50);
        mutableDateTime43.setZoneRetainFields(dateTimeZone50);
        org.joda.time.DateTime dateTime56 = mutableDateTime28.toDateTime(dateTimeZone50);
        mutableDateTime24.setDate((org.joda.time.ReadableInstant) dateTime56);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 292260401 + "'", int23 == 292260401);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime56);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:12.798Z", dateTimeZone11);
        mutableDateTime2.setZone(dateTimeZone11);
        mutableDateTime2.addWeekyears(20);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.dayOfYear();
        int int18 = property17.getMaximumValueOverall();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.506Z" + "'", str4, "2020-11-25T01:49:58.506Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 366 + "'", int18 == 366);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        java.lang.String str6 = property3.toString();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        boolean boolean15 = mutableDateTime9.isBefore((long) 99);
        org.joda.time.Chronology chronology16 = mutableDateTime9.getChronology();
        mutableDateTime9.setDate((long) 59);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime9.secondOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime9.secondOfDay();
        int int21 = mutableDateTime9.getDayOfWeek();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        mutableDateTime24.setDayOfYear((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime24.add(readablePeriod31, (-1));
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.monthOfYear();
        mutableDateTime36.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime43 = property41.addWrapField(4);
        org.joda.time.DateTimeField dateTimeField44 = mutableDateTime43.getRoundingField();
        boolean boolean45 = mutableDateTime24.isAfter((org.joda.time.ReadableInstant) mutableDateTime43);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.Instant instant49 = mutableDateTime48.toInstant();
        mutableDateTime48.setDate((long) 10);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime48.yearOfCentury();
        int int53 = mutableDateTime24.compareTo((org.joda.time.ReadableInstant) mutableDateTime48);
        boolean boolean54 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime48);
        long long55 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime48);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[dayOfYear]" + "'", str6, "Property[dayOfYear]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:58.560Z" + "'", str11, "2020-11-25T01:49:58.560Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:58.560Z" + "'", str26, "2020-11-25T01:49:58.560Z");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        java.lang.String str11 = property9.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.roundHalfEven();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime();
        mutableDateTime21.setMillis((long) 'a');
        mutableDateTime20.setTime((org.joda.time.ReadableInstant) mutableDateTime21);
        boolean boolean25 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.620Z" + "'", str4, "2020-11-25T01:49:58.620Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6598" + "'", str11, "6598");
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.joda.time.Chronology chronology17 = mutableDateTime9.getChronology();
        boolean boolean19 = mutableDateTime9.isBefore((long) 6403210);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime9.yearOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.714Z" + "'", str4, "2020-11-25T01:49:58.714Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:58.714Z" + "'", str11, "2020-11-25T01:49:58.714Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:58.714Z" + "'", str15, "2020-11-25T01:49:58.714Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.Chronology chronology7 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
        mutableDateTime8.setMinuteOfHour((int) (byte) 10);
        mutableDateTime8.setYear(54);
        int int13 = mutableDateTime8.getDayOfYear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 329 + "'", int13 == 329);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        boolean boolean8 = mutableDateTime2.isBefore((long) 99);
        org.joda.time.Chronology chronology9 = mutableDateTime2.getChronology();
        mutableDateTime2.setDate((long) 59);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.weekyear();
        int int13 = mutableDateTime2.getWeekyear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.837Z" + "'", str4, "2020-11-25T01:49:58.837Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfEven();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.916Z" + "'", str4, "2020-11-25T01:49:58.916Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:58.916Z" + "'", str9, "2020-11-25T01:49:58.916Z");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:53.498Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:35.966Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutableDateTime5.setDate(readableInstant6);
        java.lang.Object obj8 = mutableDateTime5.clone();
        boolean boolean9 = property2.equals(obj8);
        org.joda.time.MutableDateTime mutableDateTime11 = property2.add((-1));
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "2020-11-25T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "2020-11-25T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "2020-11-25T00:00:00.001Z");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add(510);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.millisOfDay();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        int int7 = property6.getLeapAmount();
        int int8 = property6.getMaximumValue();
        int int9 = property6.getMaximumValue();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.dayOfWeek();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime12.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime20.toMutableDateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime28.copy();
        int int30 = mutableDateTime28.getSecondOfDay();
        int int31 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.Instant instant32 = mutableDateTime28.toInstant();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:59.393Z" + "'", str4, "2020-11-25T01:49:59.393Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:59.393Z" + "'", str14, "2020-11-25T01:49:59.393Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:59.393Z" + "'", str25, "2020-11-25T01:49:59.393Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6600 + "'", int30 == 6600);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(instant32);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        mutableDateTime12.add(readablePeriod13, 12);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:12.798Z", dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.yearOfCentury();
        mutableDateTime23.addMillis(577);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:59.506Z" + "'", str4, "2020-11-25T01:49:59.506Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.roundHalfEven();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        mutableDateTime6.setSecondOfDay((int) '#');
        int int10 = mutableDateTime6.getMonthOfYear();
        long long11 = mutableDateTime6.getMillis();
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) mutableDateTime6);
        int int13 = property1.getMinimumValueOverall();
        org.joda.time.DurationField durationField14 = property1.getRangeDurationField();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1606262435605L + "'", long11 == 1606262435605L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.monthOfYear();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime2.add(readableDuration6, 10);
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime2.getRoundingField();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNull(dateTimeField9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
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
        mutableDateTime2.setTime((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        int int8 = mutableDateTime2.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime2.getZone();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:59.705Z" + "'", str4, "2020-11-25T01:49:59.705Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        boolean boolean8 = mutableDateTime2.isBefore((long) 99);
        org.joda.time.Chronology chronology9 = mutableDateTime2.getChronology();
        mutableDateTime2.setDate((long) 59);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.secondOfDay();
        int int14 = mutableDateTime2.getDayOfWeek();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        mutableDateTime17.setDayOfYear((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime17.add(readablePeriod24, (-1));
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.monthOfYear();
        mutableDateTime29.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.addWrapField(4);
        org.joda.time.DateTimeField dateTimeField37 = mutableDateTime36.getRoundingField();
        boolean boolean38 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime36);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.Instant instant42 = mutableDateTime41.toInstant();
        mutableDateTime41.setDate((long) 10);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime41.yearOfCentury();
        int int46 = mutableDateTime17.compareTo((org.joda.time.ReadableInstant) mutableDateTime41);
        boolean boolean47 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime2.add(readableDuration48, 283);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime2.add(readablePeriod51, 6448);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime2.millisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:59.817Z" + "'", str4, "2020-11-25T01:49:59.817Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:59.818Z" + "'", str19, "2020-11-25T01:49:59.818Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(property54);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        long long6 = property4.remainder();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        int int12 = mutableDateTime9.getYearOfEra();
        int int13 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfEra();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        mutableDateTime2.setMinuteOfDay(4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfEven();
        int int8 = mutableDateTime7.getRoundingMode();
        int int9 = mutableDateTime7.getDayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime12.getZone();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.yearOfCentury();
        mutableDateTime12.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.getMutableDateTime();
        int int26 = mutableDateTime25.getYearOfCentury();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        int int34 = mutableDateTime31.getYearOfCentury();
        org.joda.time.Chronology chronology35 = mutableDateTime31.getChronology();
        int int36 = mutableDateTime31.getWeekOfWeekyear();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.DateTime dateTime41 = mutableDateTime31.toDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone40);
        mutableDateTime25.setZone(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime46 = mutableDateTime17.toDateTime(dateTimeZone40);
        boolean boolean47 = mutableDateTime7.equals((java.lang.Object) mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:59.992Z" + "'", str19, "2020-11-25T01:49:59.992Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:59.992Z" + "'", str33, "2020-11-25T01:49:59.992Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 48 + "'", int36 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.yearOfCentury();
        int int17 = property16.getLeapAmount();
        int int18 = property16.getMaximumValue();
        int int19 = property16.getMaximumValue();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.dayOfWeek();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime22.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundCeiling();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime30.toMutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime38.copy();
        int int40 = mutableDateTime38.getSecondOfDay();
        int int41 = property16.compareTo((org.joda.time.ReadableInstant) mutableDateTime38);
        boolean boolean42 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime38);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        int int48 = mutableDateTime45.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime45.yearOfCentury();
        int int50 = property49.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime51 = property49.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.dayOfYear();
        boolean boolean54 = mutableDateTime51.isBefore((long) 292260401);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime57.add(readablePeriod60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.hourOfDay();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime57.dayOfWeek();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime57.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime65 = property64.roundCeiling();
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = null;
        java.lang.String str70 = mutableDateTime68.toString(dateTimeFormatter69);
        int int71 = mutableDateTime68.getYearOfCentury();
        org.joda.time.Chronology chronology72 = mutableDateTime68.getChronology();
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime65.toMutableDateTime(chronology72);
        boolean boolean74 = mutableDateTime51.isAfter((org.joda.time.ReadableInstant) mutableDateTime73);
        boolean boolean75 = mutableDateTime38.isAfter((org.joda.time.ReadableInstant) mutableDateTime51);
        int int76 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime38);
        int int77 = property3.getMinimumValue();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:50:00.082Z" + "'", str14, "2020-11-25T01:50:00.082Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:50:00.082Z" + "'", str24, "2020-11-25T01:50:00.082Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11-25T01:50:00.082Z" + "'", str35, "2020-11-25T01:50:00.082Z");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20 + "'", int36 == 20);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 6601 + "'", int40 == 6601);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2020-11-25T01:50:00.082Z" + "'", str47, "2020-11-25T01:50:00.082Z");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 20 + "'", int48 == 20);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2020-11-25T01:50:00.082Z" + "'", str59, "2020-11-25T01:50:00.082Z");
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2020-11-25T01:50:00.082Z" + "'", str70, "2020-11-25T01:50:00.082Z");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 20 + "'", int71 == 20);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-18591) + "'", int76 == (-18591));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime5.addDays((int) '#');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        java.lang.String str17 = mutableDateTime10.toString();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.dayOfMonth();
        int int19 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.addYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime10.copy();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime22.add(readablePeriod23, 19);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime22.copy();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:50:00.175Z" + "'", str12, "2020-11-25T01:50:00.175Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:50:00.175Z" + "'", str17, "2020-11-25T01:50:00.175Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.dayOfWeek();
        java.lang.String str10 = property9.getName();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        int int15 = mutableDateTime13.getSecondOfMinute();
        mutableDateTime13.setDate((long) 6334);
        int int18 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.String str19 = property9.getAsString();
        org.joda.time.MutableDateTime mutableDateTime21 = property9.addWrapField(6);
        org.joda.time.Chronology chronology22 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(1606262435949L, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.copy();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:50:00.274Z" + "'", str5, "2020-11-25T01:50:00.274Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "dayOfWeek" + "'", str10, "dayOfWeek");
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3" + "'", str19, "3");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        mutableDateTime6.addDays((int) '#');
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfWeek();
        java.lang.String str18 = mutableDateTime11.toString();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.dayOfMonth();
        int int20 = mutableDateTime6.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        mutableDateTime11.addYears((int) ' ');
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime11.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime11.add(readablePeriod24);
        mutableDateTime11.addWeeks(6468);
        org.joda.time.Chronology chronology28 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 6580, chronology28);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:50:00.478Z" + "'", str13, "2020-11-25T01:50:00.478Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:50:00.478Z" + "'", str18, "2020-11-25T01:50:00.478Z");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime5.addDays((int) '#');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        java.lang.String str17 = mutableDateTime10.toString();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.dayOfMonth();
        int int19 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.addYears((int) ' ');
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime10.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime10.add(readablePeriod23);
        boolean boolean26 = mutableDateTime10.isBefore(1606262435678L);
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
        org.joda.time.Chronology chronology44 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime36.weekyear();
        boolean boolean46 = mutableDateTime10.equals((java.lang.Object) mutableDateTime36);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime10.minuteOfHour();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime10.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:50:00.566Z" + "'", str12, "2020-11-25T01:50:00.566Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:50:00.566Z" + "'", str17, "2020-11-25T01:50:00.566Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:50:00.566Z" + "'", str31, "2020-11-25T01:50:00.566Z");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:50:00.566Z" + "'", str38, "2020-11-25T01:50:00.566Z");
        org.junit.Assert.assertNotNull(property41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2020-11-25T01:50:00.566Z" + "'", str42, "2020-11-25T01:50:00.566Z");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property48);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        mutableDateTime2.setMinuteOfHour(20);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfMonth();
        int int17 = mutableDateTime15.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime15.add(readableDuration18);
        mutableDateTime14.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        boolean boolean21 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        int int22 = mutableDateTime14.getRoundingMode();
        int int23 = mutableDateTime14.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 25 + "'", int17 == 25);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        int int11 = property10.get();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.add((long) ' ');
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime13.add(readableDuration14, 350);
        java.util.Date date17 = mutableDateTime13.toDate();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.minuteOfHour();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.dayOfWeek();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime22.secondOfDay();
        org.joda.time.DurationField durationField30 = property29.getRangeDurationField();
        org.joda.time.Interval interval31 = property29.toInterval();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        mutableDateTime34.setTime((long) '#');
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime34);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        int int45 = mutableDateTime42.getYearOfCentury();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology46);
        boolean boolean48 = mutableDateTime39.isBefore((org.joda.time.ReadableInstant) mutableDateTime47);
        int int49 = property29.compareTo((org.joda.time.ReadableInstant) mutableDateTime39);
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
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone62);
        boolean boolean65 = mutableDateTime39.isEqual((org.joda.time.ReadableInstant) mutableDateTime64);
        boolean boolean66 = mutableDateTime39.isEqualNow();
        mutableDateTime39.setMillisOfDay(2922789);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime39);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:00.722Z" + "'", str4, "2020-11-25T01:50:00.722Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Feb 02 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:50:00.722Z" + "'", str24, "2020-11-25T01:50:00.722Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(interval31);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:50:00.722Z" + "'", str36, "2020-11-25T01:50:00.722Z");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:50:00.722Z" + "'", str44, "2020-11-25T01:50:00.722Z");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20 + "'", int45 == 20);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2020-11-25T01:50:00.722Z" + "'", str55, "2020-11-25T01:50:00.722Z");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 20 + "'", int56 == 20);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 48 + "'", int58 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.lang.String str10 = property8.getAsString();
        boolean boolean11 = property8.isLeap();
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumShortTextLength(locale12);
        java.util.Locale locale14 = null;
        int int15 = property8.getMaximumTextLength(locale14);
        java.lang.String str16 = property8.getAsText();
        java.lang.String str17 = property8.getName();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:00.813Z" + "'", str4, "2020-11-25T01:50:00.813Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3" + "'", str10, "3");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Wednesday" + "'", str16, "Wednesday");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "dayOfWeek" + "'", str17, "dayOfWeek");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.DurationField durationField6 = property3.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime8 = property3.set(1);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.centuryOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean9 = mutableDateTime7.isEqual((long) (short) -1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        int int13 = mutableDateTime12.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime12.copy();
        int int15 = mutableDateTime12.getCenturyOfEra();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        mutableDateTime12.setRounding(dateTimeField24, 3);
        int int27 = mutableDateTime7.get(dateTimeField24);
        mutableDateTime7.addYears(51);
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
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone43);
        mutableDateTime7.setZoneRetainFields(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:50:00.911Z" + "'", str20, "2020-11-25T01:50:00.911Z");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:50:00.911Z" + "'", str36, "2020-11-25T01:50:00.911Z");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 48 + "'", int39 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.Chronology chronology7 = mutableDateTime2.getChronology();
        mutableDateTime2.setYear(22);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setHourOfDay(6554);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6554 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology7);
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
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfCeiling();
        java.lang.String str13 = property8.getName();
        org.joda.time.Interval interval14 = property8.toInterval();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:01.102Z" + "'", str4, "2020-11-25T01:50:01.102Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "dayOfWeek" + "'", str13, "dayOfWeek");
        org.junit.Assert.assertNotNull(interval14);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property6.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfFloor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:49:44.836Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.minuteOfDay();
        boolean boolean4 = mutableDateTime1.isAfter((long) 5);
        java.lang.Object obj5 = mutableDateTime1.clone();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "1970-01-01T00:00:00.010Z");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        mutableDateTime10.setTime((long) '#');
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
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property23.getFieldType();
        boolean boolean28 = mutableDateTime10.isSupported(dateTimeFieldType27);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime10.toMutableDateTimeISO();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.hourOfDay();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime32.dayOfWeek();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.hourOfDay();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime41.dayOfWeek();
        int int48 = property47.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime50 = property47.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime51 = property47.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime51.add(readablePeriod52, 12);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.DateTimeZone dateTimeZone59 = mutableDateTime58.getZone();
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:12.798Z", dateTimeZone59);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime51, dateTimeZone59);
        mutableDateTime32.setZoneRetainFields(dateTimeZone59);
        mutableDateTime29.setZone(dateTimeZone59);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) 45, dateTimeZone59);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(dateTimeZone59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(6403210, 6537, 6489915, 366, 8, (-1052490967), 166, dateTimeZone59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:50:01.343Z" + "'", str12, "2020-11-25T01:50:01.343Z");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:50:01.343Z" + "'", str19, "2020-11-25T01:50:01.343Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(mutableDateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:50:01.343Z" + "'", str34, "2020-11-25T01:50:01.343Z");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2020-11-25T01:50:01.343Z" + "'", str43, "2020-11-25T01:50:01.343Z");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 7 + "'", int48 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone59);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.yearOfCentury();
        int int11 = property10.getLeapAmount();
        int int12 = property10.getMaximumValue();
        int int13 = property10.getMaximumValue();
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
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundCeiling();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime24.toMutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime32.copy();
        int int34 = mutableDateTime32.getSecondOfDay();
        int int35 = property10.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        boolean boolean36 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime32);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.yearOfCentury();
        int int44 = property43.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime45 = property43.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.dayOfYear();
        boolean boolean48 = mutableDateTime45.isBefore((long) 292260401);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime51.add(readablePeriod54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.hourOfDay();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime51.dayOfWeek();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime51.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime59 = property58.roundCeiling();
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = null;
        java.lang.String str64 = mutableDateTime62.toString(dateTimeFormatter63);
        int int65 = mutableDateTime62.getYearOfCentury();
        org.joda.time.Chronology chronology66 = mutableDateTime62.getChronology();
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime59.toMutableDateTime(chronology66);
        boolean boolean68 = mutableDateTime45.isAfter((org.joda.time.ReadableInstant) mutableDateTime67);
        boolean boolean69 = mutableDateTime32.isAfter((org.joda.time.ReadableInstant) mutableDateTime45);
        java.lang.String str70 = mutableDateTime45.toString();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:50:01.437Z" + "'", str8, "2020-11-25T01:50:01.437Z");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:50:01.437Z" + "'", str18, "2020-11-25T01:50:01.437Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:50:01.437Z" + "'", str29, "2020-11-25T01:50:01.437Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6602 + "'", int34 == 6602);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2020-11-25T01:50:01.437Z" + "'", str41, "2020-11-25T01:50:01.437Z");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "2020-11-25T01:50:01.437Z" + "'", str53, "2020-11-25T01:50:01.437Z");
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "2020-11-25T01:50:01.438Z" + "'", str64, "2020-11-25T01:50:01.438Z");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 20 + "'", int65 == 20);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(mutableDateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2020-11-25T01:50:01.437Z" + "'", str70, "2020-11-25T01:50:01.437Z");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:24.334Z");
        java.util.Locale locale2 = null;
        java.util.Calendar calendar3 = mutableDateTime1.toCalendar(locale2);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.yearOfCentury();
        int int11 = property10.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        mutableDateTime1.setRounding(dateTimeField15, 0);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.dayOfYear();
        java.lang.String str19 = property18.getName();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime20.toGregorianCalendar();
        java.lang.String str23 = mutableDateTime20.toString();
        long long24 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime20);
        int int25 = property18.getMaximumValue();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property18.getAsText(locale26);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1606268724334,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=45,SECOND=24,MILLISECOND=334,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:50:01.554Z" + "'", str8, "2020-11-25T01:50:01.554Z");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "dayOfYear" + "'", str19, "dayOfYear");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(gregorianCalendar22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:50:01.554Z" + "'", str23, "2020-11-25T01:50:01.554Z");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 366 + "'", int25 == 366);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "330" + "'", str27, "330");
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
        java.lang.String str8 = property7.getAsString();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumTextLength(locale9);
        java.util.Locale locale11 = null;
        int int12 = property7.getMaximumShortTextLength(locale11);
        int int13 = property7.getMaximumValue();
        java.util.Locale locale14 = null;
        int int15 = property7.getMaximumShortTextLength(locale14);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:01.639Z" + "'", str4, "2020-11-25T01:50:01.639Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20" + "'", str8, "20");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2922789 + "'", int13 == 2922789);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(19, (int) (short) 10, (int) (short) 10, 11, (int) '4', 12, 10);
        int int8 = mutableDateTime7.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.roundHalfEven();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        mutableDateTime15.setSecondOfDay((int) '#');
        int int19 = mutableDateTime15.getMonthOfYear();
        long long20 = mutableDateTime15.getMillis();
        int int21 = property10.getDifference((org.joda.time.ReadableInstant) mutableDateTime15);
        boolean boolean22 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime7.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundFloor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 283 + "'", int8 == 283);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1606262435678L + "'", long20 == 1606262435678L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        int int8 = mutableDateTime5.getYearOfCentury();
        org.joda.time.Chronology chronology9 = mutableDateTime5.getChronology();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 335, dateTimeZone14);
        int int19 = mutableDateTime18.getWeekyear();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.add(32);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.millisOfSecond();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.hourOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:50:01.745Z" + "'", str7, "2020-11-25T01:50:01.745Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = mutableDateTime12.toDateTime(dateTimeZone13);
        mutableDateTime12.setMinuteOfHour(44);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:01.835Z" + "'", str4, "2020-11-25T01:50:01.835Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:50:01.835Z" + "'", str9, "2020-11-25T01:50:01.835Z");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getMinuteOfDay();
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
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
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        int int7 = property6.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        boolean boolean11 = mutableDateTime8.isBefore((long) 292260401);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime14.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime22.toMutableDateTime(chronology29);
        boolean boolean31 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime8.copy();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        boolean boolean42 = mutableDateTime36.isBefore((long) 99);
        org.joda.time.Chronology chronology43 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj33, chronology43);
        mutableDateTime8.setChronology(chronology43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        mutableDateTime8.setZoneRetainFields(dateTimeZone46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime8.yearOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:01.983Z" + "'", str4, "2020-11-25T01:50:01.983Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:50:01.983Z" + "'", str16, "2020-11-25T01:50:01.983Z");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:50:01.983Z" + "'", str27, "2020-11-25T01:50:01.983Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(mutableDateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:50:01.984Z" + "'", str38, "2020-11-25T01:50:01.984Z");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(property48);
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.yearOfEra();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setHourOfDay(2);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:12.798Z", dateTimeZone23);
        mutableDateTime14.setZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField26 = mutableDateTime14.getRoundingField();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        int int30 = mutableDateTime29.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime29.copy();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime29.monthOfYear();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone36);
        mutableDateTime29.setZoneRetainFields(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone36);
        mutableDateTime14.setZoneRetainFields(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) 6394, dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone36);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime48.getZone();
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone49);
        mutableDateTime51.addMonths(2020);
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = mutableDateTime56.toString(dateTimeFormatter57);
        mutableDateTime56.setTime((long) '#');
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = null;
        java.lang.String str65 = mutableDateTime63.toString(dateTimeFormatter64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        mutableDateTime63.add(readablePeriod66);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime63.hourOfDay();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime63.dayOfWeek();
        int int70 = property69.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime72 = property69.addWrapField(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property69.getFieldType();
        boolean boolean74 = mutableDateTime56.isSupported(dateTimeFieldType73);
        int int75 = mutableDateTime51.get(dateTimeFieldType73);
        boolean boolean76 = mutableDateTime45.isSupported(dateTimeFieldType73);
        int int77 = mutableDateTime2.get(dateTimeFieldType73);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:02.108Z" + "'", str4, "2020-11-25T01:50:02.108Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:50:02.108Z" + "'", str16, "2020-11-25T01:50:02.108Z");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "2020-11-25T01:50:02.109Z" + "'", str58, "2020-11-25T01:50:02.109Z");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "2020-11-25T01:50:02.109Z" + "'", str65, "2020-11-25T01:50:02.109Z");
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone9);
        mutableDateTime11.addDays((int) '#');
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        mutableDateTime11.setTime((long) 99);
        int int17 = mutableDateTime11.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime19 = mutableDateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime11.getZone();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime11.add(readableDuration21, 29);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime8.add(readableDuration16, 49);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setMinuteOfHour(6493);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6493 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:50:02.372Z" + "'", str10, "2020-11-25T01:50:02.372Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
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
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.Chronology chronology7 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.yearOfEra();
        java.util.Date date9 = mutableDateTime2.toDate();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 01:50:02 UTC 2020");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setMillisOfSecond(7);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfMinute();
        int int9 = property8.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfEven();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property8.getAsShortText(locale12);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:02.489Z" + "'", str4, "2020-11-25T01:50:02.489Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2" + "'", str13, "2");
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
        java.lang.String str9 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.roundCeiling();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.dayOfYear();
        int int18 = mutableDateTime15.getYear();
        long long19 = mutableDateTime15.getMillis();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        mutableDateTime23.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property28.getFieldType();
        int int30 = mutableDateTime15.get(dateTimeFieldType29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime15.monthOfYear();
        mutableDateTime15.setMillisOfDay(15);
        org.joda.time.ReadableDuration readableDuration34 = null;
        mutableDateTime15.add(readableDuration34);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:02.598Z" + "'", str4, "2020-11-25T01:50:02.598Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:50:02.598Z" + "'", str9, "2020-11-25T01:50:02.598Z");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2020 + "'", int18 == 2020);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1606269002598L + "'", long19 == 1606269002598L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime7 = property3.add((long) 292278993);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        int int10 = mutableDateTime8.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime8.getZone();
        mutableDateTime7.setZone(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime13.setSecondOfDay((int) (byte) 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        mutableDateTime9.addDays(19);
        mutableDateTime9.addSeconds((int) 'a');
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.dayOfWeek();
        int int30 = property29.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime32 = property29.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime33 = property29.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime33.add(readablePeriod34, 12);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime33.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime9.toMutableDateTime(chronology43);
        mutableDateTime9.addMonths(59);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime9.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setTime((-1052490967), 951, 22, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1052490967 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:02.771Z" + "'", str4, "2020-11-25T01:50:02.771Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:50:02.771Z" + "'", str11, "2020-11-25T01:50:02.771Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:50:02.771Z" + "'", str15, "2020-11-25T01:50:02.771Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:50:02.771Z" + "'", str25, "2020-11-25T01:50:02.771Z");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2020-11-25T01:50:02.771Z" + "'", str41, "2020-11-25T01:50:02.771Z");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(property48);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime4 = property1.getMutableDateTime();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        int int8 = mutableDateTime7.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.copy();
        java.util.Date date10 = mutableDateTime9.toDate();
        mutableDateTime9.setMinuteOfHour(11);
        boolean boolean13 = mutableDateTime4.isBefore((org.joda.time.ReadableInstant) mutableDateTime9);
        boolean boolean15 = mutableDateTime9.equals((java.lang.Object) false);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime9.add(readableDuration16);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed Nov 25 01:50:02 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        int int7 = property6.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        boolean boolean11 = mutableDateTime8.isBefore((long) 292260401);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime14.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime22.toMutableDateTime(chronology29);
        boolean boolean31 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.era();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:03.117Z" + "'", str4, "2020-11-25T01:50:03.117Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:50:03.117Z" + "'", str16, "2020-11-25T01:50:03.117Z");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:50:03.117Z" + "'", str27, "2020-11-25T01:50:03.117Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        int int10 = property7.getMaximumValueOverall();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:03.215Z" + "'", str4, "2020-11-25T01:50:03.215Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 23 + "'", int10 == 23);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        int int7 = mutableDateTime4.getYearOfCentury();
        org.joda.time.Chronology chronology8 = mutableDateTime4.getChronology();
        int int9 = mutableDateTime4.getWeekOfWeekyear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTime dateTime14 = mutableDateTime4.toDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.add((long) (short) -1);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone26);
        mutableDateTime28.addDays((int) '#');
        int int31 = property20.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        mutableDateTime28.setTime((long) 99);
        int int34 = mutableDateTime28.getCenturyOfEra();
        boolean boolean35 = mutableDateTime28.isEqualNow();
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) mutableDateTime28);
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = mutableDateTime16.toString("2020-11-25T01:47:30.589Z", locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:50:03.275Z" + "'", str6, "2020-11-25T01:50:03.275Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setHourOfDay(2);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:12.798Z", dateTimeZone18);
        mutableDateTime9.setZone(dateTimeZone18);
        mutableDateTime9.addWeekyears(20);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:24.334Z");
        java.util.Locale locale25 = null;
        java.util.Calendar calendar26 = mutableDateTime24.toCalendar(locale25);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime29.yearOfCentury();
        int int34 = property33.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = property36.getField();
        org.joda.time.DateTimeField dateTimeField38 = property36.getField();
        mutableDateTime24.setRounding(dateTimeField38, 0);
        mutableDateTime9.setRounding(dateTimeField38);
        mutableDateTime2.setRounding(dateTimeField38);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:50:03.342Z" + "'", str11, "2020-11-25T01:50:03.342Z");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1606268724334,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=45,SECOND=24,MILLISECOND=334,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:50:03.342Z" + "'", str31, "2020-11-25T01:50:03.342Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime0.toGregorianCalendar();
        java.lang.String str3 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.weekyear();
        long long5 = mutableDateTime0.getMillis();
        int int6 = mutableDateTime0.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMinuteOfDay(6545087);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6545087 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(gregorianCalendar2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2020-11-25T01:50:03.445Z" + "'", str3, "2020-11-25T01:50:03.445Z");
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1606269003445L + "'", long5 == 1606269003445L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2020 + "'", int6 == 2020);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setDate((long) 6334);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone10);
        boolean boolean16 = mutableDateTime14.isEqual((long) (short) -1);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        int int20 = mutableDateTime19.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.copy();
        int int22 = mutableDateTime19.getCenturyOfEra();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField31 = property30.getField();
        mutableDateTime19.setRounding(dateTimeField31, 3);
        int int34 = mutableDateTime14.get(dateTimeField31);
        int int35 = mutableDateTime2.get(dateTimeField31);
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
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundCeiling();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        int int52 = mutableDateTime49.getYearOfCentury();
        org.joda.time.Chronology chronology53 = mutableDateTime49.getChronology();
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime46.toMutableDateTime(chronology53);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology53);
        boolean boolean56 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime55);
        int int57 = mutableDateTime55.getMillisOfDay();
        int int58 = mutableDateTime55.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:50:03.475Z" + "'", str27, "2020-11-25T01:50:03.475Z");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 19 + "'", int35 == 19);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2020-11-25T01:50:03.475Z" + "'", str40, "2020-11-25T01:50:03.475Z");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2020-11-25T01:50:03.475Z" + "'", str51, "2020-11-25T01:50:03.475Z");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 20 + "'", int52 == 20);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6603475 + "'", int57 == 6603475);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:43.210Z");
        mutableDateTime1.addMillis(283);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.millisOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        boolean boolean19 = property10.equals((java.lang.Object) chronology17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = property10.getAsText(locale20);
        org.joda.time.MutableDateTime mutableDateTime23 = property10.add(330);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 54);
        mutableDateTime26.addMillis(6489915);
        mutableDateTime23.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:03.706Z" + "'", str4, "2020-11-25T01:50:03.706Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:50:03.706Z" + "'", str9, "2020-11-25T01:50:03.706Z");
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:50:03.706Z" + "'", str15, "2020-11-25T01:50:03.706Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "25" + "'", str21, "25");
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundHalfEven();
        int int7 = mutableDateTime6.getMinuteOfHour();
        org.joda.time.Chronology chronology8 = mutableDateTime6.getChronology();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        org.joda.time.DurationField durationField7 = property4.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property4.add((long) (short) 10);
        int int10 = property4.getMaximumValue();
        int int11 = property4.get();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = property4.compareTo(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        int int6 = mutableDateTime4.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.dayOfWeek();
        org.joda.time.DateTime dateTime8 = mutableDateTime4.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime4.toMutableDateTimeISO();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.dayOfWeek();
        java.lang.String str19 = mutableDateTime12.toString();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.dayOfMonth();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology27);
        boolean boolean29 = property20.equals((java.lang.Object) chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime4.toMutableDateTime(chronology27);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime30.setMinuteOfDay(6588);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6588 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(gregorianCalendar5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 110 + "'", int6 == 110);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:50:03.983Z" + "'", str14, "2020-11-25T01:50:03.983Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:50:03.983Z" + "'", str19, "2020-11-25T01:50:03.983Z");
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:50:03.983Z" + "'", str25, "2020-11-25T01:50:03.983Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(mutableDateTime30);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime10.toMutableDateTime(chronology17);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime18.toMutableDateTime(dateTimeZone22);
        mutableDateTime23.setMinuteOfDay(8);
        boolean boolean26 = mutableDateTime23.isBeforeNow();
        int int27 = mutableDateTime23.getMonthOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:04.061Z" + "'", str4, "2020-11-25T01:50:04.061Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:50:04.062Z" + "'", str15, "2020-11-25T01:50:04.062Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        mutableDateTime8.setMillis((long) 'a');
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime8);
        int int12 = mutableDateTime8.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getWeekOfWeekyear();
        int int7 = mutableDateTime5.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.centuryOfEra();
        mutableDateTime5.setHourOfDay(16);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.centuryOfEra();
        java.lang.String str2 = property1.getName();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "centuryOfEra" + "'", str2, "centuryOfEra");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setMillisOfSecond(7);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfMinute();
        java.lang.Object obj9 = mutableDateTime2.clone();
        int int10 = mutableDateTime2.getEra();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        int int15 = mutableDateTime14.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime14.copy();
        java.util.Date date17 = mutableDateTime16.toDate();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = mutableDateTime16.toDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:28.465Z", chronology24);
        org.joda.time.DateTime dateTime29 = mutableDateTime2.toDateTime(chronology24);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime2.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology36);
        boolean boolean40 = mutableDateTime39.isBeforeNow();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        mutableDateTime43.setTime((long) '#');
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime43);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        int int54 = mutableDateTime51.getYearOfCentury();
        org.joda.time.Chronology chronology55 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(chronology55);
        boolean boolean57 = mutableDateTime48.isBefore((org.joda.time.ReadableInstant) mutableDateTime56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime48.secondOfMinute();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology60);
        mutableDateTime61.addMillis((int) 'a');
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = null;
        java.lang.String str68 = mutableDateTime66.toString(dateTimeFormatter67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        mutableDateTime66.add(readablePeriod69);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime66.centuryOfEra();
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = null;
        java.lang.String str76 = mutableDateTime74.toString(dateTimeFormatter75);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        mutableDateTime74.add(readablePeriod77);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime74.hourOfDay();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime74.dayOfWeek();
        int int81 = property80.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime83 = property80.addWrapField(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property80.getFieldType();
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime66.property(dateTimeFieldType84);
        int int86 = mutableDateTime61.get(dateTimeFieldType84);
        boolean boolean87 = mutableDateTime48.isSupported(dateTimeFieldType84);
        int int88 = mutableDateTime39.get(dateTimeFieldType84);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:04.421Z" + "'", str4, "2020-11-25T01:50:04.421Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals(obj9.toString(), "2020-11-25T01:50:04.007Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "2020-11-25T01:50:04.007Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "2020-11-25T01:50:04.007Z");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Wed Nov 25 01:50:04 UTC 2020");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:50:04.421Z" + "'", str22, "2020-11-25T01:50:04.421Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:50:04.422Z" + "'", str34, "2020-11-25T01:50:04.422Z");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:50:04.422Z" + "'", str45, "2020-11-25T01:50:04.422Z");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "2020-11-25T01:50:04.422Z" + "'", str53, "2020-11-25T01:50:04.422Z");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20 + "'", int54 == 20);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(property58);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "2020-11-25T01:50:04.422Z" + "'", str68, "2020-11-25T01:50:04.422Z");
        org.junit.Assert.assertNotNull(property71);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "2020-11-25T01:50:04.422Z" + "'", str76, "2020-11-25T01:50:04.422Z");
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 7 + "'", int81 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime83);
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 4 + "'", int86 == 4);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 3 + "'", int88 == 3);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        java.lang.Class<?> wildcardClass7 = mutableDateTime2.getClass();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 100);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:12.798Z", dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (short) 100, dateTimeZone7);
        mutableDateTime1.setZone(dateTimeZone7);
        int int11 = mutableDateTime1.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        int int13 = mutableDateTime12.getYearOfEra();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.getMutableDateTime();
        int int17 = mutableDateTime16.getYearOfCentury();
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
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone31);
        mutableDateTime16.setZone(dateTimeZone31);
        mutableDateTime16.addMillis(11);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.dayOfWeek();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime49.add(readablePeriod52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.hourOfDay();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime49.dayOfWeek();
        int int56 = property55.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime58 = property55.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime59 = property55.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime59.add(readablePeriod60, 12);
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.DateTimeZone dateTimeZone67 = mutableDateTime66.getZone();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:12.798Z", dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime59, dateTimeZone67);
        mutableDateTime40.setZoneRetainFields(dateTimeZone67);
        mutableDateTime16.setZoneRetainFields(dateTimeZone67);
        mutableDateTime12.setZone(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime1.toMutableDateTime(dateTimeZone67);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime1.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2020 + "'", int13 == 2020);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:50:04.699Z" + "'", str24, "2020-11-25T01:50:04.699Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2020-11-25T01:50:04.699Z" + "'", str42, "2020-11-25T01:50:04.699Z");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property46);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2020-11-25T01:50:04.699Z" + "'", str51, "2020-11-25T01:50:04.699Z");
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 7 + "'", int56 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertNotNull(property74);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        mutableDateTime9.addDays(19);
        org.joda.time.DateTime dateTime19 = mutableDateTime9.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:04.922Z" + "'", str4, "2020-11-25T01:50:04.922Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:50:04.922Z" + "'", str11, "2020-11-25T01:50:04.922Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:50:04.922Z" + "'", str15, "2020-11-25T01:50:04.922Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }
}
