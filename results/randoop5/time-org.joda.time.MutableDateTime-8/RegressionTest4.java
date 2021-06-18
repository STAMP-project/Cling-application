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
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) (short) 10);
        int int11 = property8.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime13 = property8.add(7);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        mutableDateTime17.setZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone21);
        long long25 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.745Z" + "'", str4, "2020-11-25T01:49:29.745Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9L + "'", long25 == 9L);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundFloor();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumTextLength(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundFloor();
        java.lang.String str12 = property7.getAsText();
        int int13 = property7.get();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "20" + "'", str12, "20");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.yearOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.add(23);
        org.joda.time.Interval interval15 = property11.toInterval();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.821Z" + "'", str4, "2020-11-25T01:49:29.821Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:29.821Z" + "'", str8, "2020-11-25T01:49:29.821Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(interval15);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.hourOfDay();
        boolean boolean14 = mutableDateTime2.isAfterNow();
        int int15 = mutableDateTime2.getHourOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.861Z" + "'", str4, "2020-11-25T01:49:29.861Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMonthOfYear((int) (byte) 10);
        boolean boolean4 = mutableDateTime1.isEqualNow();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.secondOfDay();
        boolean boolean7 = mutableDateTime1.isEqual((long) 866);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        mutableDateTime10.add((long) (short) -1);
        boolean boolean19 = property3.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime20 = property3.roundCeiling();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.secondOfMinute();
        boolean boolean23 = mutableDateTime20.isEqual(1606268947611L);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:29.911Z" + "'", str12, "2020-11-25T01:49:29.911Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        int int11 = property10.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.add((long) 0);
        mutableDateTime13.addMillis(53);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:29.952Z" + "'", str4, "2020-11-25T01:49:29.952Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:10.392Z");
        mutableDateTime1.addWeekyears(49);
        org.joda.time.DateTimeField dateTimeField4 = mutableDateTime1.getRoundingField();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property5);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.year();
        mutableDateTime2.addMonths((-18825));
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:30.013Z" + "'", str4, "2020-11-25T01:49:30.013Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:30.013Z" + "'", str8, "2020-11-25T01:49:30.013Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime12.toGregorianCalendar();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        boolean boolean23 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.year();
        boolean boolean25 = property24.isLeap();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:30.048Z" + "'", str4, "2020-11-25T01:49:30.048Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:30.048Z" + "'", str14, "2020-11-25T01:49:30.048Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
// flaky:         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:35.457Z");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.secondOfMinute();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime9.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.dayOfMonth();
        int int18 = property17.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property17.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime22 = property17.add((long) 11);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        mutableDateTime25.setSecondOfDay((int) '#');
        boolean boolean29 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime22.minuteOfHour();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        mutableDateTime33.setDate((long) 10);
        int int37 = mutableDateTime33.getCenturyOfEra();
        boolean boolean39 = mutableDateTime33.isBefore((long) (short) -1);
        boolean boolean40 = mutableDateTime33.isBeforeNow();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property44.add((long) (short) -1);
        mutableDateTime46.setWeekOfWeekyear(53);
        boolean boolean49 = mutableDateTime33.equals((java.lang.Object) 53);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property53.add((long) (short) -1);
        mutableDateTime55.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime63 = property61.add((long) (short) -1);
        mutableDateTime63.setWeekOfWeekyear(53);
        mutableDateTime55.setTime((org.joda.time.ReadableInstant) mutableDateTime63);
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.Instant instant70 = mutableDateTime69.toInstant();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime69.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime72 = property71.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property71.getFieldType();
        int int74 = mutableDateTime63.get(dateTimeFieldType73);
        mutableDateTime33.setMillis((org.joda.time.ReadableInstant) mutableDateTime63);
        mutableDateTime63.setMillisOfDay(2);
        org.joda.time.Chronology chronology78 = mutableDateTime63.getChronology();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime22, chronology78);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(6551, 6551, 6338270, 44, (int) (short) 1, 548, 61, chronology78);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:30.187Z" + "'", str11, "2020-11-25T01:49:30.187Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 19 + "'", int37 == 19);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(instant70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 12 + "'", int74 == 12);
        org.junit.Assert.assertNotNull(chronology78);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = property7.getAsText(locale10);
        java.lang.String str12 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime13 = property7.roundHalfCeiling();
        org.joda.time.DurationField durationField14 = property7.getRangeDurationField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:30.222Z" + "'", str4, "2020-11-25T01:49:30.222Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2" + "'", str11, "2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[hourOfDay]" + "'", str12, "Property[hourOfDay]");
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        org.joda.time.DurationField durationField9 = property7.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime13 = property7.addWrapField(2);
        org.joda.time.MutableDateTime mutableDateTime14 = property7.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = property7.add((long) 44);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[yearOfCentury]" + "'", str8, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        mutableDateTime2.setMinuteOfDay(4);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime2.add(readablePeriod12, 23);
        mutableDateTime2.add((long) 22);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime2.toMutableDateTime(chronology23);
        int int27 = mutableDateTime2.getMinuteOfHour();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:30.313Z" + "'", str4, "2020-11-25T01:49:30.313Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:30.313Z" + "'", str21, "2020-11-25T01:49:30.313Z");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        long long9 = property7.remainder();
        int int10 = property7.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.roundHalfEven();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = property7.set(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(durationField8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 6570355L + "'", long9 == 6570355L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfHour();
        java.lang.String str5 = property4.getAsText();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        int int3 = mutableDateTime2.getYearOfCentury();
        int int4 = mutableDateTime2.getMinuteOfHour();
        mutableDateTime2.addMillis(540);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        boolean boolean8 = mutableDateTime2.isBefore((long) (short) -1);
        boolean boolean9 = mutableDateTime2.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 'a');
        int int12 = mutableDateTime11.getDayOfWeek();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.toMutableDateTime();
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime11.setSecondOfMinute(0);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime11);
        mutableDateTime2.addWeekyears(35);
        boolean boolean26 = mutableDateTime2.isEqualNow();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        int int11 = property10.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property10.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime15 = property10.add((long) 11);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTime();
        java.util.Date date17 = mutableDateTime15.toDate();
        int int18 = mutableDateTime15.getCenturyOfEra();
        boolean boolean19 = mutableDateTime15.isBeforeNow();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:30.535Z" + "'", str4, "2020-11-25T01:49:30.535Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Dec 06 00:00:00 UTC 2020");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
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
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = mutableDateTime17.getDayOfMonth();
        java.lang.Object obj20 = mutableDateTime17.clone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfCeiling();
        mutableDateTime22.setMillis(2684743689L);
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime22.toGregorianCalendar();
        org.joda.time.DateTime dateTime26 = mutableDateTime22.toDateTimeISO();
        boolean boolean28 = dateTime26.isEqual((long) 922);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:30.583Z" + "'", str7, "2020-11-25T01:49:30.583Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25 + "'", int19 == 25);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2020-11-25T01:49:30.583Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2020-11-25T01:49:30.583Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2020-11-25T01:49:30.583Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(gregorianCalendar25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        mutableDateTime10.add((long) (short) -1);
        boolean boolean19 = property3.equals((java.lang.Object) (short) -1);
        boolean boolean20 = property3.isLeap();
        java.lang.String str21 = property3.getAsText();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:30.629Z" + "'", str12, "2020-11-25T01:49:30.629Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97" + "'", str21, "97");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 366, dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(6477, 12, (int) (short) 100, 63, 12, 364, 6561, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 63 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:30.676Z" + "'", str13, "2020-11-25T01:49:30.676Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.addHours(6495886);
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:01.767Z");
        mutableDateTime1.addWeeks((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.hourOfDay();
        int int5 = mutableDateTime1.getHourOfDay();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.minuteOfDay();
        org.joda.time.DurationField durationField7 = property6.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.add((long) 6537);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        mutableDateTime3.setMinuteOfDay(4);
        int int13 = mutableDateTime3.getMonthOfYear();
        mutableDateTime3.setMinuteOfHour((int) '#');
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime3.toMutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 177, dateTimeZone21);
        java.util.Date date27 = mutableDateTime26.toDate();
        mutableDateTime26.setTime((long) 301);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:30.890Z" + "'", str5, "2020-11-25T01:49:30.890Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(2939668L);
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
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.get();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(0);
        long long23 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        long long24 = property7.remainder();
        java.lang.String str25 = property7.getAsString();
        java.lang.String str26 = property7.getAsString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:30.955Z" + "'", str4, "2020-11-25T01:49:30.955Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:30.955Z" + "'", str15, "2020-11-25T01:49:30.955Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2970955L + "'", long24 == 2970955L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2" + "'", str25, "2");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2" + "'", str26, "2");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        mutableDateTime8.addMillis((int) 'a');
        int int11 = mutableDateTime8.getDayOfYear();
        boolean boolean12 = mutableDateTime8.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime5.toMutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.hourOfDay();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        int int4 = mutableDateTime2.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMinuteOfHour(688);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 688 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
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
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        java.util.Locale locale11 = null;
        int int12 = property7.getMaximumTextLength(locale11);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:31.057Z" + "'", str4, "2020-11-25T01:49:31.057Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime2.getZone();
        int int7 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        mutableDateTime11.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.dayOfWeek();
        org.joda.time.DurationField durationField17 = property16.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.property(dateTimeFieldType18);
        mutableDateTime2.addYears((int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = mutableDateTime2.getSecondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.centuryOfEra();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        int int20 = mutableDateTime15.getWeekOfWeekyear();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTime dateTime25 = mutableDateTime15.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime11.toMutableDateTime(dateTimeZone24);
        int int28 = mutableDateTime11.getMillisOfSecond();
        java.util.GregorianCalendar gregorianCalendar29 = mutableDateTime11.toGregorianCalendar();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((-2655L), dateTimeZone35);
        mutableDateTime11.setZone(dateTimeZone35);
        mutableDateTime2.setZone(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone35);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:31.149Z" + "'", str4, "2020-11-25T01:49:31.149Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6571 + "'", int9 == 6571);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:31.150Z" + "'", str17, "2020-11-25T01:49:31.150Z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 895 + "'", int28 == 895);
        org.junit.Assert.assertNotNull(gregorianCalendar29);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(mutableDateTime40);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology7);
        mutableDateTime8.addWeekyears((int) (byte) 1);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = mutableDateTime8.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone14);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:31.202Z" + "'", str5, "2020-11-25T01:49:31.202Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone12);
        mutableDateTime2.setZone(dateTimeZone12);
        int int17 = mutableDateTime2.getDayOfYear();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime2.add(readableDuration18, 996);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime2.monthOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:31.233Z" + "'", str4, "2020-11-25T01:49:31.233Z");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 330 + "'", int17 == 330);
        org.junit.Assert.assertNotNull(property21);
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
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology6);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:31.281Z" + "'", str4, "2020-11-25T01:49:31.281Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
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
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.get();
        org.joda.time.DateTimeField dateTimeField11 = property7.getField();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property7.getAsText(locale12);
        org.joda.time.Interval interval14 = property7.toInterval();
        java.util.Locale locale15 = null;
        int int16 = property7.getMaximumTextLength(locale15);
        org.joda.time.Interval interval17 = property7.toInterval();
        org.joda.time.MutableDateTime mutableDateTime19 = property7.addWrapField(6442);
        int int20 = mutableDateTime19.getYearOfCentury();
        mutableDateTime19.addMonths(632);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:31.303Z" + "'", str4, "2020-11-25T01:49:31.303Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2" + "'", str13, "2");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.set((int) (short) 1);
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        org.joda.time.MutableDateTime mutableDateTime9 = property3.roundHalfFloor();
        org.joda.time.Interval interval10 = property3.toInterval();
        org.joda.time.MutableDateTime mutableDateTime11 = property3.roundHalfEven();
        int int12 = property3.get();
        long long13 = property3.remainder();
        org.joda.time.MutableDateTime mutableDateTime15 = property3.addWrapField(1970);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime15.add(readablePeriod17, 6471);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 366 + "'", int4 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundCeiling();
        java.lang.String str7 = property3.getAsText();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a');
        int int10 = mutableDateTime9.getDayOfWeek();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        int int18 = mutableDateTime13.getWeekOfWeekyear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTime dateTime23 = mutableDateTime13.toDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        boolean boolean26 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        int int27 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime mutableDateTime28 = property3.roundHalfEven();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:31.370Z" + "'", str15, "2020-11-25T01:49:31.370Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-18591) + "'", int27 == (-18591));
        org.junit.Assert.assertNotNull(mutableDateTime28);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        mutableDateTime2.setMillisOfSecond((int) (short) 10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMinuteOfDay((int) 'a');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.dayOfMonth();
        java.lang.String str16 = mutableDateTime2.toString();
        int int17 = mutableDateTime2.getMonthOfYear();
        int int18 = mutableDateTime2.getDayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:31.418Z" + "'", str4, "2020-11-25T01:49:31.418Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:31.418Z" + "'", str9, "2020-11-25T01:49:31.418Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:37:31.010Z" + "'", str16, "2020-11-25T01:37:31.010Z");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 330 + "'", int18 == 330);
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
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj7 = mutableDateTime2.clone();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfDay();
        int int9 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.monthOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime2.toString(dateTimeFormatter11);
        org.joda.time.DateTime dateTime13 = mutableDateTime2.toDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:31.469Z" + "'", str4, "2020-11-25T01:49:31.469Z");
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "2020-11-25T02:49:31.469Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "2020-11-25T02:49:31.469Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "2020-11-25T02:49:31.469Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2020 + "'", int9 == 2020);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T02:49:31.469Z" + "'", str12, "2020-11-25T02:49:31.469Z");
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        int int4 = mutableDateTime2.getWeekyear();
        java.lang.String str5 = mutableDateTime2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:31.548Z" + "'", str5, "2020-11-25T01:49:31.548Z");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        mutableDateTime3.addMillis((int) 'a');
        int int6 = mutableDateTime3.getDayOfYear();
        boolean boolean7 = mutableDateTime3.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.property(dateTimeFieldType10);
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime12.toMutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:09.970Z", dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar31 = mutableDateTime24.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.dayOfMonth();
        int int33 = property32.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime34 = property32.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime34.toMutableDateTime();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology38);
        mutableDateTime39.addMillis((int) 'a');
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime49 = property45.addWrapField((int) 'a');
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.hourOfDay();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime52.dayOfWeek();
        mutableDateTime52.add((long) (short) -1);
        boolean boolean61 = property45.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime63 = property45.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime64 = property45.roundHalfFloor();
        java.util.Locale locale65 = null;
        java.util.Calendar calendar66 = mutableDateTime64.toCalendar(locale65);
        boolean boolean67 = mutableDateTime39.isBefore((org.joda.time.ReadableInstant) mutableDateTime64);
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = mutableDateTime70.toString(dateTimeFormatter71);
        int int73 = mutableDateTime70.getYearOfCentury();
        org.joda.time.Chronology chronology74 = mutableDateTime70.getChronology();
        int int75 = mutableDateTime70.getWeekOfWeekyear();
        java.lang.Object obj76 = null;
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(obj76, chronology77);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = null;
        java.lang.String str80 = mutableDateTime78.toString(dateTimeFormatter79);
        int int81 = mutableDateTime78.getYearOfCentury();
        org.joda.time.Chronology chronology82 = mutableDateTime78.getChronology();
        org.joda.time.MutableDateTime mutableDateTime83 = mutableDateTime70.toMutableDateTime(chronology82);
        org.joda.time.DateTime dateTime84 = mutableDateTime64.toDateTime(chronology82);
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime((long) 53, chronology82);
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime(chronology82);
        org.joda.time.MutableDateTime mutableDateTime87 = mutableDateTime35.toMutableDateTime(chronology82);
        mutableDateTime19.setTime((org.joda.time.ReadableInstant) mutableDateTime87);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:31.571Z" + "'", str21, "2020-11-25T01:49:31.571Z");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:31.571Z" + "'", str26, "2020-11-25T01:49:31.571Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(gregorianCalendar31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 30 + "'", int33 == 30);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime49);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2020-11-25T01:49:31.571Z" + "'", str54, "2020-11-25T01:49:31.571Z");
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(calendar66);
        org.junit.Assert.assertEquals(calendar66.toString(), "java.util.GregorianCalendar[time=-20217600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=4,WEEK_OF_YEAR=20,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=132,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2020-11-25T01:49:31.571Z" + "'", str72, "2020-11-25T01:49:31.571Z");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 20 + "'", int73 == 20);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 48 + "'", int75 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "2020-11-25T01:49:31.571Z" + "'", str80, "2020-11-25T01:49:31.571Z");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 20 + "'", int81 == 20);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(mutableDateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(mutableDateTime87);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(6416, 1, 18, 39, 71, 736, 56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundCeiling();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        mutableDateTime14.addMillis((int) 'a');
        int int17 = mutableDateTime14.getDayOfYear();
        boolean boolean18 = mutableDateTime14.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property20.getFieldType();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.property(dateTimeFieldType21);
        int int23 = property22.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.roundCeiling();
        boolean boolean25 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = property26.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime29 = property26.set(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:31.746Z" + "'", str4, "2020-11-25T01:49:31.746Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        mutableDateTime10.add((long) (short) -1);
        boolean boolean19 = property3.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = property3.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime22 = property3.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime23 = property3.roundHalfEven();
        int int24 = mutableDateTime23.getMinuteOfHour();
        long long25 = mutableDateTime23.getMillis();
        int int26 = mutableDateTime23.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime23.year();
        int int28 = property27.getMinimumValue();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:31.786Z" + "'", str12, "2020-11-25T01:49:31.786Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-20217600000L) + "'", long25 == (-20217600000L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-292275054) + "'", int28 == (-292275054));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:01.767Z");
        mutableDateTime1.addWeeks((int) (byte) 0);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        mutableDateTime6.setZone(dateTimeZone8);
        int int10 = mutableDateTime6.getMinuteOfHour();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        mutableDateTime6.setChronology(chronology17);
        org.joda.time.DateTime dateTime20 = mutableDateTime1.toDateTime(chronology17);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime1.era();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:31.828Z" + "'", str15, "2020-11-25T01:49:31.828Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        mutableDateTime3.addMillis((int) 'a');
        int int6 = mutableDateTime3.getDayOfYear();
        boolean boolean7 = mutableDateTime3.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.property(dateTimeFieldType10);
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime12.toMutableDateTime(dateTimeZone16);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone23);
        mutableDateTime12.setZone(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(1606268703895L, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = property8.getAsShortText(locale13);
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
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime26.toGregorianCalendar();
        boolean boolean28 = property8.equals((java.lang.Object) mutableDateTime26);
        org.joda.time.DateTimeField dateTimeField29 = property8.getField();
        org.joda.time.MutableDateTime mutableDateTime30 = property8.roundHalfEven();
        int int31 = property8.getMinimumValueOverall();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:31.908Z" + "'", str4, "2020-11-25T01:49:31.908Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Wed" + "'", str14, "Wed");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:31.908Z" + "'", str19, "2020-11-25T01:49:31.908Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
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
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.dayOfWeek();
        int int14 = property13.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.addWrapField(0);
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime16.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime16.add(readableDuration18);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.year();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:32.032Z" + "'", str4, "2020-11-25T01:49:32.032Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:32.032Z" + "'", str9, "2020-11-25T01:49:32.032Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addDays(0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.weekyear();
        java.lang.String str7 = property6.getAsString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020" + "'", str7, "2020");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
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
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.monthOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.addMillis((int) 'a');
        int int26 = mutableDateTime23.getDayOfYear();
        boolean boolean27 = mutableDateTime23.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime23.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone28);
        boolean boolean30 = property8.equals((java.lang.Object) mutableDateTime12);
        int int31 = mutableDateTime12.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime12.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = property32.compareTo(readablePartial33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:32.111Z" + "'", str14, "2020-11-25T01:49:32.111Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertNotNull(property32);
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
        mutableDateTime2.addSeconds(18);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:32.182Z" + "'", str4, "2020-11-25T01:49:32.182Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = mutableDateTime2.toCalendar(locale7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:08.366Z");
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 'a');
        int int15 = mutableDateTime14.getDayOfWeek();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        int int23 = mutableDateTime18.getWeekOfWeekyear();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.DateTime dateTime28 = mutableDateTime18.toDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        boolean boolean31 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime30);
        int int32 = mutableDateTime30.getDayOfMonth();
        java.lang.Object obj33 = mutableDateTime30.clone();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime30.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.addWrapField(3);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(1606265154146L);
        boolean boolean39 = mutableDateTime36.isBefore((org.joda.time.ReadableInstant) mutableDateTime38);
        boolean boolean40 = mutableDateTime11.isAfter((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime38.centuryOfEra();
        boolean boolean42 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime38);
        mutableDateTime9.addSeconds(479);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=98,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=98,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:32.211Z" + "'", str20, "2020-11-25T01:49:32.211Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 48 + "'", int23 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 25 + "'", int32 == 25);
        org.junit.Assert.assertNotNull(obj33);
// flaky:         org.junit.Assert.assertEquals(obj33.toString(), "2020-11-25T01:49:32.211Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "2020-11-25T01:49:32.211Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "2020-11-25T01:49:32.211Z");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime1.getRoundingField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfMonth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dateTimeField6);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekOfWeekyear();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime5.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.dayOfWeek();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.secondOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime5.monthOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = property17.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField22 = property17.getField();
        mutableDateTime5.setRounding(dateTimeField22);
        mutableDateTime1.setRounding(dateTimeField22);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:32.306Z" + "'", str7, "2020-11-25T01:49:32.306Z");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.addWrapField((int) 'a');
        org.joda.time.DurationField durationField16 = property11.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime17 = property11.roundCeiling();
        org.joda.time.DateTime dateTime18 = mutableDateTime17.toDateTimeISO();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        mutableDateTime21.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField27 = property26.getField();
        int int28 = dateTime18.get(dateTimeField27);
        mutableDateTime2.setRounding(dateTimeField27);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        mutableDateTime7.setMillis((long) 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.hourOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.addMillis((int) 'a');
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime23 = property19.addWrapField((int) 'a');
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.hourOfDay();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime26.dayOfWeek();
        mutableDateTime26.add((long) (short) -1);
        boolean boolean35 = property19.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime37 = property19.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime38 = property19.roundHalfFloor();
        java.util.Locale locale39 = null;
        java.util.Calendar calendar40 = mutableDateTime38.toCalendar(locale39);
        boolean boolean41 = mutableDateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime38);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        int int47 = mutableDateTime44.getYearOfCentury();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        int int49 = mutableDateTime44.getWeekOfWeekyear();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        int int55 = mutableDateTime52.getYearOfCentury();
        org.joda.time.Chronology chronology56 = mutableDateTime52.getChronology();
        org.joda.time.MutableDateTime mutableDateTime57 = mutableDateTime44.toMutableDateTime(chronology56);
        org.joda.time.DateTime dateTime58 = mutableDateTime38.toDateTime(chronology56);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) 53, chronology56);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (byte) -1, chronology56);
        mutableDateTime2.setChronology(chronology56);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:32.410Z" + "'", str4, "2020-11-25T01:49:32.410Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:32.410Z" + "'", str28, "2020-11-25T01:49:32.410Z");
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(calendar40);
        org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=-20217600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=4,WEEK_OF_YEAR=20,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=132,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:32.410Z" + "'", str46, "2020-11-25T01:49:32.410Z");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20 + "'", int47 == 20);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 48 + "'", int49 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2020-11-25T01:49:32.410Z" + "'", str54, "2020-11-25T01:49:32.410Z");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 20 + "'", int55 == 20);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.property(dateTimeFieldType9);
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime11.toMutableDateTime(dateTimeZone15);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone22);
        mutableDateTime11.setZone(dateTimeZone22);
        int int26 = mutableDateTime11.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        org.joda.time.DurationField durationField9 = property7.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundHalfEven();
        org.joda.time.DurationField durationField12 = property7.getRangeDurationField();
        int int13 = property7.getMaximumValue();
        int int14 = property7.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = property7.add(28432141583L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 28432141583");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[yearOfCentury]" + "'", str8, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = mutableDateTime1.getRoundingField();
        boolean boolean4 = mutableDateTime1.isEqualNow();
        java.lang.Class<?> wildcardClass5 = mutableDateTime1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        mutableDateTime3.setMinuteOfDay(4);
        int int13 = mutableDateTime3.getMonthOfYear();
        mutableDateTime3.addWeekyears((int) (short) -1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.addMillis((int) 'a');
        int int21 = mutableDateTime18.getDayOfYear();
        boolean boolean22 = mutableDateTime18.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime18.property(dateTimeFieldType25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology28);
        mutableDateTime29.addMillis((int) 'a');
        int int32 = mutableDateTime29.getDayOfYear();
        boolean boolean33 = mutableDateTime29.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime29.getZone();
        mutableDateTime18.setZoneRetainFields(dateTimeZone34);
        mutableDateTime3.setZoneRetainFields(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((-18861L), dateTimeZone34);
        mutableDateTime37.addMonths((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:32.606Z" + "'", str5, "2020-11-25T01:49:32.606Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeZone34);
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
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addMinutes((int) (short) -1);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) (short) 100);
        org.joda.time.Chronology chronology16 = mutableDateTime2.getChronology();
        mutableDateTime2.add((long) 17);
        java.util.Date date19 = mutableDateTime2.toDate();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:32.665Z" + "'", str4, "2020-11-25T01:49:32.665Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Nov 25 00:00:00 UTC 2020");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.millisOfSecond();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        int int23 = property22.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime25 = property22.set((int) (short) 1);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfYear();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.year();
        mutableDateTime25.addSeconds((int) (byte) 1);
        java.util.Locale locale30 = null;
        java.util.Calendar calendar31 = mutableDateTime25.toCalendar(locale30);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.centuryOfEra();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 6308);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime43 = property41.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime45 = property41.addWrapField((int) 'a');
        org.joda.time.DurationField durationField46 = property41.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime47 = property41.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration50 = null;
        mutableDateTime48.add(readableDuration50);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.Instant instant55 = mutableDateTime54.toInstant();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime54.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime57 = property56.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property56.getFieldType();
        mutableDateTime48.set(dateTimeFieldType58, 1);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime47.property(dateTimeFieldType58);
        boolean boolean62 = mutableDateTime37.isSupported(dateTimeFieldType58);
        boolean boolean63 = mutableDateTime33.isSupported(dateTimeFieldType58);
        int int64 = mutableDateTime25.get(dateTimeFieldType58);
        int int65 = mutableDateTime17.get(dateTimeFieldType58);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:32.701Z" + "'", str4, "2020-11-25T01:49:32.701Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:32.701Z" + "'", str12, "2020-11-25T01:49:32.701Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 366 + "'", int23 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(calendar31);
        org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=1001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=1,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNull(durationField46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 11 + "'", int65 == 11);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:50.709Z");
        org.junit.Assert.assertNotNull(mutableDateTime1);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.millisOfSecond();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        int int14 = mutableDateTime13.getDayOfWeek();
        mutableDateTime13.addDays(0);
        mutableDateTime13.setDate((long) 4);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        mutableDateTime21.addMillis((int) 'a');
        int int24 = mutableDateTime21.getDayOfYear();
        boolean boolean25 = mutableDateTime21.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime21.getZone();
        mutableDateTime13.setZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = mutableDateTime2.toDateTime(dateTimeZone26);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:32.873Z" + "'", str4, "2020-11-25T01:49:32.873Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = mutableDateTime2.toCalendar(locale7);
        int int9 = mutableDateTime2.getSecondOfDay();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=98,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=98,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime2.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.monthOfYear();
        java.lang.String str11 = property10.getAsShortText();
        int int12 = property10.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime14 = property10.add(2071);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        java.lang.String str24 = mutableDateTime17.toString();
        mutableDateTime17.setMillisOfSecond((int) (short) 10);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime17.toMutableDateTime(chronology33);
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutableDateTime17.add(readableDuration36);
        int int38 = property10.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:32.999Z" + "'", str4, "2020-11-25T01:49:32.999Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nov" + "'", str11, "Nov");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:32.999Z" + "'", str19, "2020-11-25T01:49:32.999Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:32.999Z" + "'", str24, "2020-11-25T01:49:32.999Z");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:32.999Z" + "'", str31, "2020-11-25T01:49:32.999Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2071 + "'", int38 == 2071);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getCenturyOfEra();
        boolean boolean7 = mutableDateTime2.isEqual((-1L));
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime10.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.add(2020);
        int int20 = property17.getLeapAmount();
        java.lang.String str21 = property17.toString();
        org.joda.time.MutableDateTime mutableDateTime23 = property17.addWrapField((-18804));
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime31 = property27.addWrapField((int) 'a');
        org.joda.time.DurationField durationField32 = property27.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime33 = property27.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutableDateTime34.add(readableDuration36);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.Instant instant41 = mutableDateTime40.toInstant();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime40.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        mutableDateTime34.set(dateTimeFieldType44, 1);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime33.property(dateTimeFieldType44);
        int int48 = mutableDateTime23.get(dateTimeFieldType44);
        int int49 = mutableDateTime2.get(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:33.049Z" + "'", str12, "2020-11-25T01:49:33.049Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Property[secondOfDay]" + "'", str21, "Property[secondOfDay]");
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNull(durationField32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 11 + "'", int48 == 11);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 11 + "'", int49 == 11);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        boolean boolean4 = mutableDateTime2.isAfterNow();
        boolean boolean6 = mutableDateTime2.isAfter(702L);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfMonth(2020);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2020 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.set((int) (short) 1);
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        org.joda.time.MutableDateTime mutableDateTime9 = property3.roundHalfFloor();
        org.joda.time.Interval interval10 = property3.toInterval();
        org.joda.time.MutableDateTime mutableDateTime11 = property3.roundHalfEven();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = property3.getDifference(readableInstant12);
        org.joda.time.Interval interval14 = property3.toInterval();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 366 + "'", int4 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-18591) + "'", int13 == (-18591));
        org.junit.Assert.assertNotNull(interval14);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        int int11 = property10.getMaximumValue();
        boolean boolean12 = property10.isLeap();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime14 = property10.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime15.add(durationFieldType17, 105);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:33.244Z" + "'", str4, "2020-11-25T01:49:33.244Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj7 = mutableDateTime2.clone();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfDay();
        int int9 = mutableDateTime2.getYearOfEra();
        mutableDateTime2.addSeconds(30);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime2.add(readablePeriod12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14, 2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:33.277Z" + "'", str4, "2020-11-25T01:49:33.277Z");
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "2020-11-25T02:49:33.277Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "2020-11-25T02:49:33.277Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "2020-11-25T02:49:33.277Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2020 + "'", int9 == 2020);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        int int11 = property10.getMaximumValue();
        boolean boolean12 = property10.isLeap();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime14 = property10.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.toMutableDateTimeISO();
        java.lang.String str16 = mutableDateTime15.toString();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime18.addYears((int) (short) 10);
        int int21 = mutableDateTime18.getMonthOfYear();
        boolean boolean22 = mutableDateTime18.isAfterNow();
        org.joda.time.DateTimeField dateTimeField23 = mutableDateTime18.getRoundingField();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology26);
        mutableDateTime27.addMillis((int) 'a');
        int int30 = mutableDateTime27.getDayOfYear();
        boolean boolean31 = mutableDateTime27.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime27.property(dateTimeFieldType34);
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology38);
        mutableDateTime39.addMillis((int) 'a');
        int int42 = mutableDateTime39.getDayOfYear();
        boolean boolean43 = mutableDateTime39.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime39.getZone();
        mutableDateTime36.setZoneRetainFields(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.978Z", dateTimeZone44);
        org.joda.time.DateTime dateTime47 = mutableDateTime18.toDateTime(dateTimeZone44);
        mutableDateTime15.setZone(dateTimeZone44);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:33.306Z" + "'", str4, "2020-11-25T01:49:33.306Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-26T00:00:00.000Z" + "'", str16, "2020-11-26T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime47);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.year();
        boolean boolean5 = property4.isLeap();
        int int6 = property4.getMinimumValueOverall();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        int int15 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-292275054) + "'", int6 == (-292275054));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:33.363Z" + "'", str11, "2020-11-25T01:49:33.363Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime5.getRoundingField();
        mutableDateTime5.addMonths(292278993);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        mutableDateTime11.addMillis((int) 'a');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = property17.addWrapField((int) 'a');
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.dayOfWeek();
        mutableDateTime24.add((long) (short) -1);
        boolean boolean33 = property17.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime35 = property17.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime36 = property17.roundHalfFloor();
        java.util.Locale locale37 = null;
        java.util.Calendar calendar38 = mutableDateTime36.toCalendar(locale37);
        boolean boolean39 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime36);
        boolean boolean40 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime11);
        int int41 = mutableDateTime5.getRoundingMode();
        org.joda.time.Chronology chronology42 = mutableDateTime5.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNull(dateTimeField6);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:33.394Z" + "'", str26, "2020-11-25T01:49:33.394Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=-20217600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=4,WEEK_OF_YEAR=20,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=132,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(chronology42);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.set((int) (short) 1);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime9.setZone(dateTimeZone11);
        int int13 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime9.add(readablePeriod14, (int) (short) 10);
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.DateTime dateTime18 = mutableDateTime6.toDateTimeISO();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 366 + "'", int4 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfYear();
        java.lang.String str10 = property9.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:33.474Z" + "'", str4, "2020-11-25T01:49:33.474Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:33.474Z" + "'", str8, "2020-11-25T01:49:33.474Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[dayOfYear]" + "'", str10, "Property[dayOfYear]");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:08.366Z");
        boolean boolean2 = mutableDateTime1.isAfterNow();
        java.util.Date date3 = mutableDateTime1.toDate();
        mutableDateTime1.setMillisOfSecond(20);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Wed Nov 25 01:45:08 UTC 2020");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 6571);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime11.add(readableDuration12, 6498);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:33.545Z" + "'", str4, "2020-11-25T01:49:33.545Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:33.545Z" + "'", str8, "2020-11-25T01:49:33.545Z");
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
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addMinutes((int) (short) -1);
        org.joda.time.Instant instant13 = mutableDateTime2.toInstant();
        mutableDateTime2.setTime((long) (short) 0);
        int int16 = mutableDateTime2.getWeekOfWeekyear();
        boolean boolean18 = mutableDateTime2.isBefore((long) 99);
        mutableDateTime2.setTime(0L);
        mutableDateTime2.setWeekyear(25);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:33.574Z" + "'", str4, "2020-11-25T01:49:33.574Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfYear();
        int int3 = mutableDateTime1.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.centuryOfEra();
        int int7 = mutableDateTime5.getYearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        int int17 = mutableDateTime10.getSecondOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        mutableDateTime20.addMillis((int) 'a');
        int int23 = mutableDateTime20.getDayOfYear();
        boolean boolean24 = mutableDateTime20.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime20.property(dateTimeFieldType27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology30);
        mutableDateTime31.addMillis((int) 'a');
        int int34 = mutableDateTime31.getDayOfYear();
        boolean boolean35 = mutableDateTime31.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime31.getZone();
        mutableDateTime20.setZoneRetainFields(dateTimeZone36);
        mutableDateTime10.setTime((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime48 = property46.addWrapField((int) (short) 1);
        int int49 = property46.get();
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
        long long62 = property46.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime61);
        boolean boolean64 = mutableDateTime61.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime65 = mutableDateTime61.toDateTimeISO();
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = null;
        java.lang.String str70 = mutableDateTime68.toString(dateTimeFormatter69);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        mutableDateTime68.add(readablePeriod71);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime68.hourOfDay();
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime68.dayOfWeek();
        int int75 = property74.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime77 = property74.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime78 = property74.roundHalfEven();
        java.lang.Object obj79 = null;
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(obj79, chronology80);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = null;
        java.lang.String str83 = mutableDateTime81.toString(dateTimeFormatter82);
        int int84 = mutableDateTime81.getYearOfCentury();
        org.joda.time.Chronology chronology85 = mutableDateTime81.getChronology();
        org.joda.time.MutableDateTime mutableDateTime86 = new org.joda.time.MutableDateTime(chronology85);
        org.joda.time.MutableDateTime mutableDateTime87 = mutableDateTime78.toMutableDateTime(chronology85);
        org.joda.time.MutableDateTime mutableDateTime88 = mutableDateTime61.toMutableDateTime(chronology85);
        org.joda.time.DateTime dateTime89 = mutableDateTime10.toDateTime(chronology85);
        org.joda.time.MutableDateTime mutableDateTime90 = org.joda.time.MutableDateTime.now(chronology85);
        mutableDateTime5.setChronology(chronology85);
        mutableDateTime1.setChronology(chronology85);
        org.joda.time.MutableDateTime.Property property93 = mutableDateTime1.monthOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:33.606Z" + "'", str12, "2020-11-25T01:49:33.606Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6573 + "'", int17 == 6573);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone36);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2020-11-25T01:49:33.606Z" + "'", str43, "2020-11-25T01:49:33.606Z");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2020-11-25T01:49:33.606Z" + "'", str54, "2020-11-25T01:49:33.606Z");
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 7 + "'", int59 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime61);
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTime65);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2020-11-25T01:49:33.606Z" + "'", str70, "2020-11-25T01:49:33.606Z");
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 7 + "'", int75 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertNotNull(mutableDateTime78);
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "2020-11-25T01:49:33.606Z" + "'", str83, "2020-11-25T01:49:33.606Z");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 20 + "'", int84 == 20);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(mutableDateTime87);
        org.junit.Assert.assertNotNull(mutableDateTime88);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(mutableDateTime90);
        org.junit.Assert.assertNotNull(property93);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        mutableDateTime3.setZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfWeek();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsText(locale13);
        java.util.Locale locale15 = null;
        java.lang.String str16 = property12.getAsText(locale15);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Wednesday" + "'", str14, "Wednesday");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Wednesday" + "'", str16, "Wednesday");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.millisOfSecond();
        boolean boolean10 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 'a');
        int int14 = mutableDateTime13.getDayOfWeek();
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
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        boolean boolean30 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        java.lang.Object obj31 = mutableDateTime29.clone();
        mutableDateTime29.addYears(6380);
        int int34 = mutableDateTime29.getYearOfEra();
        int int35 = property11.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        boolean boolean37 = mutableDateTime29.isEqual((-17714737L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:33.744Z" + "'", str19, "2020-11-25T01:49:33.744Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
// flaky:         org.junit.Assert.assertEquals(obj31.toString(), "2020-11-25T01:49:33.744Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "2020-11-25T01:49:33.744Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "2020-11-25T01:49:33.744Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8400 + "'", int34 == 8400);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.year();
        boolean boolean5 = property4.isLeap();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.weekOfWeekyear();
        boolean boolean8 = property7.isLeap();
        java.lang.String str9 = property7.getAsShortText();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "53" + "'", str9, "53");
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        mutableDateTime14.setSecondOfMinute(15);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:33.827Z" + "'", str4, "2020-11-25T01:49:33.827Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        boolean boolean8 = mutableDateTime7.isEqualNow();
        mutableDateTime7.setWeekOfWeekyear(25);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime7.add(readableDuration11);
        org.joda.time.Chronology chronology13 = mutableDateTime7.getChronology();
        java.lang.Object obj14 = mutableDateTime7.clone();
        org.joda.time.DateTime dateTime15 = mutableDateTime7.toDateTimeISO();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1969-06-16T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1969-06-16T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1969-06-16T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime15);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology6);
        boolean boolean10 = mutableDateTime9.isBeforeNow();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:33.899Z" + "'", str4, "2020-11-25T01:49:33.899Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        org.joda.time.DurationField durationField8 = property3.getLeapDurationField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.set((int) (short) 1);
        java.util.Locale locale16 = null;
        int int17 = property12.getMaximumTextLength(locale16);
        org.joda.time.MutableDateTime mutableDateTime18 = property12.roundHalfFloor();
        int int19 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime18.toMutableDateTime();
        int int22 = mutableDateTime21.getYearOfCentury();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 366 + "'", int13 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 70 + "'", int22 == 70);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj7 = mutableDateTime2.clone();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfDay();
        int int9 = mutableDateTime2.getYearOfEra();
        mutableDateTime2.addSeconds(30);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime2.add(readablePeriod12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime16.toGregorianCalendar();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone27);
        mutableDateTime2.setZoneRetainFields(dateTimeZone27);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:33.986Z" + "'", str4, "2020-11-25T01:49:33.986Z");
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "2020-11-25T02:49:33.986Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "2020-11-25T02:49:33.986Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "2020-11-25T02:49:33.986Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2020 + "'", int9 == 2020);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:33.986Z" + "'", str18, "2020-11-25T01:49:33.986Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(gregorianCalendar23);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.set((int) (short) 1);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime9.setZone(dateTimeZone11);
        int int13 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime9.add(readablePeriod14, (int) (short) 10);
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        int int18 = mutableDateTime9.getSecondOfMinute();
        mutableDateTime9.setTime((long) (byte) -1);
        int int21 = mutableDateTime9.getWeekOfWeekyear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.dayOfWeek();
        java.lang.String str31 = mutableDateTime24.toString();
        mutableDateTime24.setMillisOfSecond((int) (short) 10);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime24.yearOfCentury();
        mutableDateTime24.setMinuteOfDay((int) 'a');
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        mutableDateTime39.setZone(dateTimeZone41);
        int int43 = mutableDateTime39.getMinuteOfHour();
        mutableDateTime39.setTime((int) (byte) 1, 7, (int) (short) 1, 4);
        int int49 = mutableDateTime39.getRoundingMode();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property53.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime57 = property53.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField58 = property53.getField();
        int int59 = mutableDateTime39.get(dateTimeField58);
        int int60 = mutableDateTime24.get(dateTimeField58);
        mutableDateTime9.setRounding(dateTimeField58);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 366 + "'", int4 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:34.032Z" + "'", str26, "2020-11-25T01:49:34.032Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:34.032Z" + "'", str31, "2020-11-25T01:49:34.032Z");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeZone40);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 49 + "'", int43 == 49);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 330 + "'", int59 == 330);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 330 + "'", int60 == 330);
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
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.era();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:34.082Z" + "'", str4, "2020-11-25T01:49:34.082Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:34.082Z" + "'", str8, "2020-11-25T01:49:34.082Z");
        org.junit.Assert.assertNotNull(property12);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.get();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(0);
        long long23 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        java.lang.String str26 = property24.toString();
        org.joda.time.MutableDateTime mutableDateTime27 = property24.roundFloor();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:34.120Z" + "'", str4, "2020-11-25T01:49:34.120Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:34.120Z" + "'", str15, "2020-11-25T01:49:34.120Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Property[weekOfWeekyear]" + "'", str26, "Property[weekOfWeekyear]");
        org.junit.Assert.assertNotNull(mutableDateTime27);
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
        int int6 = mutableDateTime2.getCenturyOfEra();
        int int7 = mutableDateTime2.getWeekyear();
        int int8 = mutableDateTime2.getMinuteOfDay();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 109 + "'", int8 == 109);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        mutableDateTime2.setMillisOfSecond((int) (short) 10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMinuteOfDay((int) 'a');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.dayOfMonth();
        java.lang.String str16 = mutableDateTime2.toString();
        int int17 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.yearOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:34.174Z" + "'", str4, "2020-11-25T01:49:34.174Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:34.174Z" + "'", str9, "2020-11-25T01:49:34.174Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:37:34.010Z" + "'", str16, "2020-11-25T01:37:34.010Z");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        mutableDateTime10.add((long) (short) -1);
        boolean boolean19 = property3.equals((java.lang.Object) (short) -1);
        int int20 = property3.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime21 = property3.roundCeiling();
        int int22 = property3.getLeapAmount();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property3.getAsShortText(locale23);
        org.joda.time.MutableDateTime mutableDateTime26 = property3.add(29);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:34.198Z" + "'", str12, "2020-11-25T01:49:34.198Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "98" + "'", str24, "98");
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:10.392Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundCeiling();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        mutableDateTime2.addYears(48);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.add(54);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.millisOfSecond();
        boolean boolean10 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.monthOfYear();
        java.lang.String str12 = property11.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[monthOfYear]" + "'", str12, "Property[monthOfYear]");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.millisOfSecond();
        boolean boolean10 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.Date date11 = mutableDateTime2.toDate();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        int int19 = mutableDateTime14.getWeekOfWeekyear();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTime dateTime24 = mutableDateTime14.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = dateTime24.isSupported(dateTimeFieldType25);
        int int27 = dateTime24.getSecondOfMinute();
        int int28 = dateTime24.getYearOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime24);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) dateTime24);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        mutableDateTime33.setHourOfDay(2);
        java.lang.Object obj38 = mutableDateTime33.clone();
        mutableDateTime33.setWeekyear(999);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime33.secondOfDay();
        boolean boolean43 = mutableDateTime33.isEqualNow();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:34.306Z" + "'", str16, "2020-11-25T01:49:34.306Z");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 34 + "'", int27 == 34);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2020 + "'", int28 == 2020);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11-25T01:49:34.306Z" + "'", str35, "2020-11-25T01:49:34.306Z");
        org.junit.Assert.assertNotNull(obj38);
// flaky:         org.junit.Assert.assertEquals(obj38.toString(), "2020-11-25T02:49:34.306Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "2020-11-25T02:49:34.306Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "2020-11-25T02:49:34.306Z");
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
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
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        int int8 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setTime((long) 26602667);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:34.361Z" + "'", str4, "2020-11-25T01:49:34.361Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.monthOfYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.addMillis((int) 'a');
        int int16 = mutableDateTime13.getDayOfYear();
        boolean boolean17 = mutableDateTime13.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime13.getZone();
        mutableDateTime2.setZoneRetainFields(dateTimeZone18);
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
        org.joda.time.MutableDateTime mutableDateTime33 = property28.getMutableDateTime();
        mutableDateTime33.addMinutes(20);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime33);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.minuteOfDay();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.weekOfWeekyear();
        boolean boolean44 = property43.isLeap();
        org.joda.time.DateTimeField dateTimeField45 = property43.getField();
        mutableDateTime2.setRounding(dateTimeField45);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology50);
        mutableDateTime51.addMillis((int) 'a');
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime56.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime59 = property57.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime61 = property57.addWrapField((int) 'a');
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = mutableDateTime64.toString(dateTimeFormatter65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        mutableDateTime64.add(readablePeriod67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.hourOfDay();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime64.dayOfWeek();
        mutableDateTime64.add((long) (short) -1);
        boolean boolean73 = property57.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime75 = property57.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime76 = property57.roundHalfFloor();
        java.util.Locale locale77 = null;
        java.util.Calendar calendar78 = mutableDateTime76.toCalendar(locale77);
        boolean boolean79 = mutableDateTime51.isBefore((org.joda.time.ReadableInstant) mutableDateTime76);
        java.lang.Object obj80 = null;
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(obj80, chronology81);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = null;
        java.lang.String str84 = mutableDateTime82.toString(dateTimeFormatter83);
        int int85 = mutableDateTime82.getYearOfCentury();
        org.joda.time.Chronology chronology86 = mutableDateTime82.getChronology();
        int int87 = mutableDateTime82.getWeekOfWeekyear();
        java.lang.Object obj88 = null;
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.MutableDateTime mutableDateTime90 = new org.joda.time.MutableDateTime(obj88, chronology89);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter91 = null;
        java.lang.String str92 = mutableDateTime90.toString(dateTimeFormatter91);
        int int93 = mutableDateTime90.getYearOfCentury();
        org.joda.time.Chronology chronology94 = mutableDateTime90.getChronology();
        org.joda.time.MutableDateTime mutableDateTime95 = mutableDateTime82.toMutableDateTime(chronology94);
        org.joda.time.DateTime dateTime96 = mutableDateTime76.toDateTime(chronology94);
        org.joda.time.MutableDateTime mutableDateTime97 = new org.joda.time.MutableDateTime((long) 53, chronology94);
        org.joda.time.MutableDateTime mutableDateTime98 = new org.joda.time.MutableDateTime((long) 6324, chronology94);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime99 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeField45, chronology94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:34.446Z" + "'", str4, "2020-11-25T01:49:34.446Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:34.446Z" + "'", str24, "2020-11-25T01:49:34.446Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(mutableDateTime61);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2020-11-25T01:49:34.446Z" + "'", str66, "2020-11-25T01:49:34.446Z");
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(mutableDateTime75);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertNotNull(calendar78);
        org.junit.Assert.assertEquals(calendar78.toString(), "java.util.GregorianCalendar[time=-20217600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=4,WEEK_OF_YEAR=20,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=132,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "2020-11-25T01:49:34.446Z" + "'", str84, "2020-11-25T01:49:34.446Z");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 20 + "'", int85 == 20);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 48 + "'", int87 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str92 + "' != '" + "2020-11-25T01:49:34.446Z" + "'", str92, "2020-11-25T01:49:34.446Z");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 20 + "'", int93 == 20);
        org.junit.Assert.assertNotNull(chronology94);
        org.junit.Assert.assertNotNull(mutableDateTime95);
        org.junit.Assert.assertNotNull(dateTime96);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = mutableDateTime9.getRoundingField();
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) "2020-11-25T01:45:01.602Z");
        mutableDateTime9.add((long) 6565227);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:34.498Z" + "'", str4, "2020-11-25T01:49:34.498Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.lang.String str9 = property7.toString();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[secondOfMinute]" + "'", str9, "Property[secondOfMinute]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.hourOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime4.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime4.monthOfYear();
        boolean boolean13 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime4);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        mutableDateTime16.setDate((long) 10);
        mutableDateTime16.setDayOfYear((int) ' ');
        long long22 = mutableDateTime16.getMillis();
        org.joda.time.Chronology chronology23 = mutableDateTime16.getChronology();
        mutableDateTime4.setChronology(chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime4.dayOfYear();
        int int26 = mutableDateTime4.getSecondOfMinute();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:34.607Z" + "'", str6, "2020-11-25T01:49:34.607Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(instant17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2684974607L + "'", long22 == 2684974607L);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 34 + "'", int26 == 34);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        int int14 = mutableDateTime9.getWeekOfWeekyear();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTime dateTime19 = mutableDateTime9.toDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((int) ' ', 6537, 967, 6495886, 18, 6477, 895, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6495886 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:34.657Z" + "'", str11, "2020-11-25T01:49:34.657Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
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
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.monthOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.addMillis((int) 'a');
        int int26 = mutableDateTime23.getDayOfYear();
        boolean boolean27 = mutableDateTime23.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime23.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone28);
        boolean boolean30 = property8.equals((java.lang.Object) mutableDateTime12);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        mutableDateTime33.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.secondOfMinute();
        int int39 = property38.getMaximumValue();
        long long40 = property38.remainder();
        java.lang.String str41 = property38.toString();
        boolean boolean42 = mutableDateTime12.equals((java.lang.Object) str41);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.setDayOfMonth(45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:34.703Z" + "'", str14, "2020-11-25T01:49:34.703Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 59 + "'", int39 == 59);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 703L + "'", long40 == 703L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Property[secondOfMinute]" + "'", str41, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        int int3 = mutableDateTime2.getYearOfEra();
        mutableDateTime2.addHours(98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime12.toGregorianCalendar();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        int int20 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime2.secondOfDay();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        mutableDateTime24.setZone(dateTimeZone26);
        int int28 = mutableDateTime24.getMinuteOfHour();
        mutableDateTime24.setTime((int) (byte) 1, 7, (int) (short) 1, 4);
        int int34 = mutableDateTime24.getRoundingMode();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime42 = property38.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField43 = property38.getField();
        int int44 = mutableDateTime24.get(dateTimeField43);
        int int45 = mutableDateTime2.get(dateTimeField43);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime2.dayOfWeek();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:34.791Z" + "'", str4, "2020-11-25T01:49:34.791Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:34.791Z" + "'", str14, "2020-11-25T01:49:34.791Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 49 + "'", int28 == 49);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 330 + "'", int44 == 330);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 330 + "'", int45 == 330);
        org.junit.Assert.assertNotNull(property46);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        int int5 = mutableDateTime4.getDayOfWeek();
        boolean boolean6 = mutableDateTime4.isAfterNow();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.minuteOfDay();
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime10.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology22);
        mutableDateTime4.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 102, chronology22);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 53, chronology22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:34.828Z" + "'", str12, "2020-11-25T01:49:34.828Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:34.828Z" + "'", str20, "2020-11-25T01:49:34.828Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime12.toGregorianCalendar();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        boolean boolean23 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime22);
        mutableDateTime22.addSeconds(99);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.dayOfYear();
        int int27 = mutableDateTime22.getMillisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:34.882Z" + "'", str4, "2020-11-25T01:49:34.882Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:34.882Z" + "'", str14, "2020-11-25T01:49:34.882Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
// flaky:         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 882 + "'", int27 == 882);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        mutableDateTime11.setZone(dateTimeZone13);
        int int15 = mutableDateTime11.getMinuteOfHour();
        int int16 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        int int17 = mutableDateTime11.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime11.add(readableDuration18, 6324);
        int int21 = mutableDateTime11.getCenturyOfEra();
        int int22 = mutableDateTime11.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setSecondOfMinute(6559);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6559 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 922 + "'", int17 == 922);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime2.getZone();
        int int7 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        mutableDateTime2.setDate((long) 99);
        mutableDateTime2.setMillisOfDay(29);
        mutableDateTime2.addMonths(922);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:35.126Z" + "'", str4, "2020-11-25T01:49:35.126Z");
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology14);
        int int17 = mutableDateTime16.getMonthOfYear();
        long long18 = mutableDateTime16.getMillis();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:35.204Z" + "'", str4, "2020-11-25T01:49:35.204Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:35.204Z" + "'", str12, "2020-11-25T01:49:35.204Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1606268975204L + "'", long18 == 1606268975204L);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        int int11 = property10.getMaximumValue();
        boolean boolean12 = property10.isLeap();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.roundCeiling();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime16.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime16.dayOfMonth();
        int int25 = property24.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property24.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime29 = property24.add((long) 11);
        org.joda.time.DateTime dateTime30 = mutableDateTime29.toDateTime();
        mutableDateTime29.addWeeks(22);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        mutableDateTime35.addMillis((int) 'a');
        int int38 = mutableDateTime35.getDayOfYear();
        java.util.Date date39 = mutableDateTime35.toDate();
        long long40 = mutableDateTime35.getMillis();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        int int48 = mutableDateTime43.getWeekOfWeekyear();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        org.joda.time.DateTime dateTime53 = mutableDateTime43.toDateTime(dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(dateTimeZone52);
        mutableDateTime35.setZoneRetainFields(dateTimeZone52);
        org.joda.time.DateTime dateTime56 = mutableDateTime29.toDateTime(dateTimeZone52);
        mutableDateTime13.setZoneRetainFields(dateTimeZone52);
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        int int62 = mutableDateTime61.getDayOfWeek();
        boolean boolean63 = mutableDateTime61.isAfterNow();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime61.minuteOfDay();
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = mutableDateTime67.toString(dateTimeFormatter68);
        int int70 = mutableDateTime67.getYearOfCentury();
        org.joda.time.Chronology chronology71 = mutableDateTime67.getChronology();
        int int72 = mutableDateTime67.getWeekOfWeekyear();
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = null;
        java.lang.String str77 = mutableDateTime75.toString(dateTimeFormatter76);
        int int78 = mutableDateTime75.getYearOfCentury();
        org.joda.time.Chronology chronology79 = mutableDateTime75.getChronology();
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime67.toMutableDateTime(chronology79);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(chronology79);
        mutableDateTime61.setChronology(chronology79);
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime((long) 102, chronology79);
        org.joda.time.MutableDateTime mutableDateTime84 = org.joda.time.MutableDateTime.now(chronology79);
        mutableDateTime13.setChronology(chronology79);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:35.234Z" + "'", str4, "2020-11-25T01:49:35.234Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:35.234Z" + "'", str18, "2020-11-25T01:49:35.234Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(gregorianCalendar23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30 + "'", int25 == 30);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 98L + "'", long40 == 98L);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:35.234Z" + "'", str45, "2020-11-25T01:49:35.234Z");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20 + "'", int46 == 20);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 48 + "'", int48 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(property64);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "2020-11-25T01:49:35.234Z" + "'", str69, "2020-11-25T01:49:35.234Z");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 20 + "'", int70 == 20);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 48 + "'", int72 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "2020-11-25T01:49:35.234Z" + "'", str77, "2020-11-25T01:49:35.234Z");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 20 + "'", int78 == 20);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(mutableDateTime80);
        org.junit.Assert.assertNotNull(mutableDateTime84);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime5.getRoundingField();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        mutableDateTime9.addMillis((int) 'a');
        int int12 = mutableDateTime9.getDayOfYear();
        java.util.Date date13 = mutableDateTime9.toDate();
        long long14 = mutableDateTime9.getMillis();
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
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        mutableDateTime9.setZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = mutableDateTime5.toDateTime(dateTimeZone26);
        java.lang.String str31 = mutableDateTime5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 98L + "'", long14 == 98L);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:35.391Z" + "'", str19, "2020-11-25T01:49:35.391Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:44:54.005Z" + "'", str31, "2020-11-25T01:44:54.005Z");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        mutableDateTime8.addMillis((int) 'a');
        int int11 = mutableDateTime8.getDayOfYear();
        boolean boolean12 = mutableDateTime8.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime5.toMutableDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        int int18 = mutableDateTime17.getYearOfCentury();
        boolean boolean19 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int20 = mutableDateTime14.getHourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime14.millisOfSecond();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 70 + "'", int18 == 70);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
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
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = mutableDateTime17.getDayOfMonth();
        java.lang.Object obj20 = mutableDateTime17.clone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.hourOfDay();
        int int22 = mutableDateTime17.getSecondOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime17.add(readablePeriod23, (-18591));
        mutableDateTime17.addDays(6539);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:35.478Z" + "'", str7, "2020-11-25T01:49:35.478Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25 + "'", int19 == 25);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2020-11-25T01:49:35.478Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2020-11-25T01:49:35.478Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2020-11-25T01:49:35.478Z");
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6575 + "'", int22 == 6575);
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
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = property7.getAsText(locale10);
        java.lang.String str12 = property7.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property7.getAsText(locale13);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:35.506Z" + "'", str4, "2020-11-25T01:49:35.506Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2" + "'", str11, "2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[hourOfDay]" + "'", str12, "Property[hourOfDay]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2" + "'", str14, "2");
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
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.millisOfDay();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        mutableDateTime12.setSecondOfDay((int) '#');
        mutableDateTime12.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        mutableDateTime12.setMinuteOfDay(54);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime12.weekyear();
        boolean boolean24 = mutableDateTime12.isBeforeNow();
        long long25 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:35.545Z" + "'", str4, "2020-11-25T01:49:35.545Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-659580889010L) + "'", long25 == (-659580889010L));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        mutableDateTime14.addDays(6308);
        int int17 = mutableDateTime14.getWeekyear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        mutableDateTime20.addMillis((int) 'a');
        int int23 = mutableDateTime20.getDayOfYear();
        java.util.Date date24 = mutableDateTime20.toDate();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime20);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.addWrapField((int) (short) 1);
        int int36 = property33.get();
        org.joda.time.DateTimeField dateTimeField37 = property33.getField();
        mutableDateTime25.setRounding(dateTimeField37);
        boolean boolean40 = mutableDateTime25.isBefore(1606268745402L);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime25.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime25.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((java.lang.Object) int17, dateTimeZone42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:35.589Z" + "'", str4, "2020-11-25T01:49:35.589Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2038 + "'", int17 == 2038);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 UTC 1970");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:35.589Z" + "'", str30, "2020-11-25T01:49:35.589Z");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
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
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = mutableDateTime17.getDayOfMonth();
        java.lang.Object obj20 = mutableDateTime17.clone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.hourOfDay();
        int int22 = mutableDateTime17.getSecondOfDay();
        mutableDateTime17.addWeeks(2);
        boolean boolean25 = mutableDateTime17.isBeforeNow();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:35.650Z" + "'", str7, "2020-11-25T01:49:35.650Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25 + "'", int19 == 25);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2020-11-25T01:49:35.650Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2020-11-25T01:49:35.650Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2020-11-25T01:49:35.650Z");
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6575 + "'", int22 == 6575);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        mutableDateTime3.setMinuteOfDay(4);
        int int13 = mutableDateTime3.getMonthOfYear();
        mutableDateTime3.setMinuteOfHour((int) '#');
        boolean boolean16 = mutableDateTime3.isEqualNow();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone22);
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime27.toMutableDateTime(chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology39);
        mutableDateTime24.setChronology(chronology39);
        org.joda.time.DateTime dateTime43 = mutableDateTime3.toDateTime(chronology39);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:28.134Z", chronology39);
        java.lang.Object obj45 = mutableDateTime44.clone();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:35.688Z" + "'", str5, "2020-11-25T01:49:35.688Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:35.689Z" + "'", str29, "2020-11-25T01:49:35.689Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 48 + "'", int32 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2020-11-25T01:49:35.689Z" + "'", str37, "2020-11-25T01:49:35.689Z");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20 + "'", int38 == 20);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "2020-11-25T01:45:28.134Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "2020-11-25T01:45:28.134Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "2020-11-25T01:45:28.134Z");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.addMillis(132);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        mutableDateTime9.addMillis((int) 'a');
        int int12 = mutableDateTime9.getDayOfYear();
        boolean boolean13 = mutableDateTime9.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.property(dateTimeFieldType16);
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        boolean boolean19 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime27 = property23.addWrapField((int) 'a');
        java.lang.String str28 = property23.getAsShortText();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.dayOfWeek();
        int int38 = property37.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime40 = property37.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime41 = property37.roundHalfEven();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        int int47 = mutableDateTime44.getYearOfCentury();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime41.toMutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) str28, chronology48);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime2.toMutableDateTime(chronology48);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:35.802Z" + "'", str4, "2020-11-25T01:49:35.802Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "97" + "'", str28, "97");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:35.802Z" + "'", str33, "2020-11-25T01:49:35.802Z");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 7 + "'", int38 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:35.802Z" + "'", str46, "2020-11-25T01:49:35.802Z");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20 + "'", int47 == 20);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        int int6 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7, (int) (short) 10);
        boolean boolean10 = mutableDateTime2.isAfterNow();
        mutableDateTime2.setDate((long) 688);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setHourOfDay(2);
        java.lang.Object obj14 = mutableDateTime9.clone();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.secondOfDay();
        int int16 = mutableDateTime9.getYearOfEra();
        mutableDateTime9.addSeconds(30);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime9.millisOfDay();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant28 = null;
        mutableDateTime22.setDate(readableInstant28);
        mutableDateTime22.setMinuteOfDay(4);
        int int32 = mutableDateTime22.getMonthOfYear();
        mutableDateTime22.addWeekyears((int) (short) -1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology36);
        mutableDateTime37.addMillis((int) 'a');
        int int40 = mutableDateTime37.getDayOfYear();
        boolean boolean41 = mutableDateTime37.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property43.getFieldType();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime37.property(dateTimeFieldType44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology47);
        mutableDateTime48.addMillis((int) 'a');
        int int51 = mutableDateTime48.getDayOfYear();
        boolean boolean52 = mutableDateTime48.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime48.getZone();
        mutableDateTime37.setZoneRetainFields(dateTimeZone53);
        mutableDateTime22.setZoneRetainFields(dateTimeZone53);
        mutableDateTime9.setZone(dateTimeZone53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(41, 18331, 15, (int) (byte) 1, 71, 6457, 693, dateTimeZone53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 71 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:35.878Z" + "'", str11, "2020-11-25T01:49:35.878Z");
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals(obj14.toString(), "2020-11-25T02:49:35.878Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "2020-11-25T02:49:35.878Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "2020-11-25T02:49:35.878Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2020 + "'", int16 == 2020);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:35.878Z" + "'", str24, "2020-11-25T01:49:35.878Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11 + "'", int32 == 11);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dateTimeZone53);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 102, dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(63, 109, 107, 100, 550, 6492, 6431, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:35.923Z" + "'", str12, "2020-11-25T01:49:35.923Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
        mutableDateTime2.add((long) (byte) 100);
        int int7 = mutableDateTime2.getMinuteOfHour();
        int int8 = mutableDateTime2.getYear();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = mutableDateTime9.getRoundingField();
        mutableDateTime9.setMillisOfDay(998);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfYear();
        mutableDateTime9.addWeekyears(6452);
        int int17 = mutableDateTime9.getHourOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:35.979Z" + "'", str4, "2020-11-25T01:49:35.979Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNull(dateTimeField11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1606265154146L);
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.hourOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime4.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime4.toGregorianCalendar();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime1.setTime(0L);
        java.util.Date date15 = mutableDateTime1.toDate();
        int int16 = mutableDateTime1.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime1.getZone();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:36.010Z" + "'", str6, "2020-11-25T01:49:36.010Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        boolean boolean7 = mutableDateTime1.isEqual((long) 106);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime1.copy();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = property12.addWrapField((int) 'a');
        mutableDateTime16.setMillis((long) 0);
        boolean boolean19 = mutableDateTime8.isEqual((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime12.toGregorianCalendar();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime12.toMutableDateTime(chronology26);
        mutableDateTime12.addYears((-18591));
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime12.secondOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.074Z" + "'", str4, "2020-11-25T01:49:36.074Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:36.074Z" + "'", str14, "2020-11-25T01:49:36.074Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(gregorianCalendar18);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:36.074Z" + "'", str24, "2020-11-25T01:49:36.074Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property31);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = property7.getName();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.getMutableDateTime();
        int int10 = mutableDateTime9.getDayOfMonth();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.117Z" + "'", str4, "2020-11-25T01:49:36.117Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hourOfDay" + "'", str8, "hourOfDay");
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology6);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant17 = null;
        mutableDateTime11.setDate(readableInstant17);
        mutableDateTime11.setMinuteOfDay(4);
        int int21 = mutableDateTime11.getMonthOfYear();
        mutableDateTime11.setMinuteOfHour((int) '#');
        boolean boolean24 = mutableDateTime11.isEqualNow();
        mutableDateTime11.setMillisOfDay(19);
        int int27 = mutableDateTime11.getDayOfMonth();
        boolean boolean28 = mutableDateTime8.isEqual((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime11.dayOfMonth();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.153Z" + "'", str4, "2020-11-25T01:49:36.153Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:36.153Z" + "'", str13, "2020-11-25T01:49:36.153Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
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
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.setMinuteOfDay(45);
        int int21 = mutableDateTime17.getCenturyOfEra();
        mutableDateTime17.setDayOfMonth((int) (byte) 1);
        mutableDateTime17.setMillis((long) 132);
        mutableDateTime17.setSecondOfDay(21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:36.180Z" + "'", str7, "2020-11-25T01:49:36.180Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundCeiling();
        org.joda.time.DurationField durationField7 = property3.getLeapDurationField();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.addWrapField((int) (short) 10);
        mutableDateTime18.addWeeks(30);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant29 = null;
        mutableDateTime23.setDate(readableInstant29);
        mutableDateTime23.setMinuteOfDay(4);
        int int33 = mutableDateTime23.getMonthOfYear();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property38.getFieldType();
        int int41 = mutableDateTime23.get(dateTimeFieldType40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime18.property(dateTimeFieldType40);
        int int43 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime18);
        int int44 = property3.getMaximumValue();
        org.joda.time.DurationField durationField45 = property3.getRangeDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:36.227Z" + "'", str12, "2020-11-25T01:49:36.227Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:36.227Z" + "'", str25, "2020-11-25T01:49:36.227Z");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11 + "'", int33 == 11);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 11 + "'", int41 == 11);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-18804) + "'", int43 == (-18804));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 365 + "'", int44 == 365);
        org.junit.Assert.assertNotNull(durationField45);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime18 = property14.addWrapField((int) 'a');
        boolean boolean19 = mutableDateTime18.isEqualNow();
        mutableDateTime18.setWeekOfWeekyear(25);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime18.add(readableDuration22);
        org.joda.time.Chronology chronology24 = mutableDateTime18.getChronology();
        int int25 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime18.dayOfMonth();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.272Z" + "'", str4, "2020-11-25T01:49:36.272Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTime();
        mutableDateTime5.setYear(59);
        int int9 = mutableDateTime5.getWeekOfWeekyear();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        mutableDateTime5.addWeeks(0);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        boolean boolean7 = mutableDateTime1.isEqual((long) 106);
        int int8 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfDay();
        org.joda.time.DurationField durationField10 = property9.getRangeDurationField();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        java.util.Locale locale12 = null;
        int int13 = property9.getMaximumTextLength(locale12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:17.098Z");
        org.joda.time.DateTime dateTime2 = mutableDateTime1.toDateTime();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime8.getRoundingField();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        int int15 = mutableDateTime12.getDayOfYear();
        java.util.Date date16 = mutableDateTime12.toDate();
        long long17 = mutableDateTime12.getMillis();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        int int25 = mutableDateTime20.getWeekOfWeekyear();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.DateTime dateTime30 = mutableDateTime20.toDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        mutableDateTime12.setZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = mutableDateTime8.toDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime1.toMutableDateTime(dateTimeZone29);
        mutableDateTime1.addMillis(301);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 98L + "'", long17 == 98L);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:36.390Z" + "'", str22, "2020-11-25T01:49:36.390Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 48 + "'", int25 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:10.392Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfYear();
        int int3 = property2.get();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 330 + "'", int3 == 330);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        mutableDateTime15.setZone(dateTimeZone17);
        int int19 = mutableDateTime15.getMinuteOfHour();
        mutableDateTime15.setTime((int) (byte) 1, 7, (int) (short) 1, 4);
        int int25 = mutableDateTime15.getRoundingMode();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime33 = property29.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField34 = property29.getField();
        int int35 = mutableDateTime15.get(dateTimeField34);
        int int36 = mutableDateTime2.get(dateTimeField34);
        int int37 = mutableDateTime2.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMonthOfYear(16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.469Z" + "'", str4, "2020-11-25T01:49:36.469Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 330 + "'", int35 == 330);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 330 + "'", int36 == 330);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2020 + "'", int37 == 2020);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        mutableDateTime2.setMinuteOfDay(4);
        int int12 = mutableDateTime2.getMonthOfYear();
        mutableDateTime2.addWeekyears((int) (short) -1);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add(2019);
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
        org.joda.time.MutableDateTime mutableDateTime31 = property26.getMutableDateTime();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfYear();
        int int36 = property35.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime38 = property35.set((int) (short) 1);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfYear();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.year();
        mutableDateTime38.addSeconds((int) (byte) 1);
        java.util.Locale locale43 = null;
        java.util.Calendar calendar44 = mutableDateTime38.toCalendar(locale43);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.centuryOfEra();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 6308);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime56 = property54.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime58 = property54.addWrapField((int) 'a');
        org.joda.time.DurationField durationField59 = property54.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime60 = property54.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration63 = null;
        mutableDateTime61.add(readableDuration63);
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.Instant instant68 = mutableDateTime67.toInstant();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime67.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime70 = property69.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property69.getFieldType();
        mutableDateTime61.set(dateTimeFieldType71, 1);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime60.property(dateTimeFieldType71);
        boolean boolean75 = mutableDateTime50.isSupported(dateTimeFieldType71);
        boolean boolean76 = mutableDateTime46.isSupported(dateTimeFieldType71);
        int int77 = mutableDateTime38.get(dateTimeFieldType71);
        int int78 = mutableDateTime31.get(dateTimeFieldType71);
        boolean boolean79 = mutableDateTime17.isSupported(dateTimeFieldType71);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.502Z" + "'", str4, "2020-11-25T01:49:36.502Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:36.503Z" + "'", str22, "2020-11-25T01:49:36.503Z");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 366 + "'", int36 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(calendar44);
        org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=1,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNull(durationField59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(instant68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 11 + "'", int78 == 11);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj7 = mutableDateTime2.clone();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        mutableDateTime9.addMillis(6427);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = mutableDateTime9.get(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.600Z" + "'", str4, "2020-11-25T01:49:36.600Z");
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "2020-11-25T02:49:36.600Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "2020-11-25T02:49:36.600Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "2020-11-25T02:49:36.600Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        boolean boolean12 = mutableDateTime2.isAfter((long) 1970);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.centuryOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.629Z" + "'", str4, "2020-11-25T01:49:36.629Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(property13);
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
        int int9 = mutableDateTime2.getSecondOfDay();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.dayOfWeek();
        int int19 = mutableDateTime12.getSecondOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        mutableDateTime22.addMillis((int) 'a');
        int int25 = mutableDateTime22.getDayOfYear();
        boolean boolean26 = mutableDateTime22.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property28.getFieldType();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime22.property(dateTimeFieldType29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.addMillis((int) 'a');
        int int36 = mutableDateTime33.getDayOfYear();
        boolean boolean37 = mutableDateTime33.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime33.getZone();
        mutableDateTime22.setZoneRetainFields(dateTimeZone38);
        mutableDateTime12.setTime((org.joda.time.ReadableInstant) mutableDateTime22);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime50 = property48.addWrapField((int) (short) 1);
        int int51 = property48.get();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        mutableDateTime54.add(readablePeriod57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime54.hourOfDay();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime54.dayOfWeek();
        int int61 = property60.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime63 = property60.addWrapField(0);
        long long64 = property48.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime63);
        boolean boolean66 = mutableDateTime63.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime67 = mutableDateTime63.toDateTimeISO();
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = mutableDateTime70.toString(dateTimeFormatter71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableDateTime70.add(readablePeriod73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime70.hourOfDay();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime70.dayOfWeek();
        int int77 = property76.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime79 = property76.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime80 = property76.roundHalfEven();
        java.lang.Object obj81 = null;
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime(obj81, chronology82);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = null;
        java.lang.String str85 = mutableDateTime83.toString(dateTimeFormatter84);
        int int86 = mutableDateTime83.getYearOfCentury();
        org.joda.time.Chronology chronology87 = mutableDateTime83.getChronology();
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime(chronology87);
        org.joda.time.MutableDateTime mutableDateTime89 = mutableDateTime80.toMutableDateTime(chronology87);
        org.joda.time.MutableDateTime mutableDateTime90 = mutableDateTime63.toMutableDateTime(chronology87);
        org.joda.time.DateTime dateTime91 = mutableDateTime12.toDateTime(chronology87);
        org.joda.time.MutableDateTime mutableDateTime92 = org.joda.time.MutableDateTime.now(chronology87);
        int int93 = mutableDateTime92.getHourOfDay();
        boolean boolean94 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime92);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime92.setDayOfWeek(6510);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6510 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.689Z" + "'", str4, "2020-11-25T01:49:36.689Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6576 + "'", int9 == 6576);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:36.690Z" + "'", str14, "2020-11-25T01:49:36.690Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6576 + "'", int19 == 6576);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeZone38);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:36.690Z" + "'", str45, "2020-11-25T01:49:36.690Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "2020-11-25T01:49:36.690Z" + "'", str56, "2020-11-25T01:49:36.690Z");
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 7 + "'", int61 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTime67);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2020-11-25T01:49:36.690Z" + "'", str72, "2020-11-25T01:49:36.690Z");
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 7 + "'", int77 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(mutableDateTime80);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "2020-11-25T01:49:36.690Z" + "'", str85, "2020-11-25T01:49:36.690Z");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 20 + "'", int86 == 20);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(mutableDateTime89);
        org.junit.Assert.assertNotNull(mutableDateTime90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(mutableDateTime92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.set((int) (short) 1);
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        org.joda.time.MutableDateTime mutableDateTime9 = property3.roundHalfFloor();
        org.joda.time.Interval interval10 = property3.toInterval();
        org.joda.time.MutableDateTime mutableDateTime11 = property3.roundHalfEven();
        mutableDateTime11.setMillisOfSecond(617);
        mutableDateTime11.addSeconds(33);
        org.joda.time.Chronology chronology16 = mutableDateTime11.getChronology();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 366 + "'", int4 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.property(dateTimeFieldType9);
        mutableDateTime2.add((long) 8);
        org.joda.time.Chronology chronology13 = mutableDateTime2.getChronology();
        mutableDateTime2.addWeeks(6465);
        boolean boolean16 = mutableDateTime2.isBeforeNow();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        boolean boolean7 = mutableDateTime1.isEqual((long) 106);
        int int8 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime1.add(readablePeriod10, 59);
        boolean boolean14 = mutableDateTime1.isAfter((long) 50);
        int int15 = mutableDateTime1.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        mutableDateTime2.setMillisOfSecond((int) (short) 10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime2.toMutableDateTime(chronology18);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime2.add(readableDuration21, 6499);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.818Z" + "'", str4, "2020-11-25T01:49:36.818Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:36.818Z" + "'", str9, "2020-11-25T01:49:36.818Z");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:36.818Z" + "'", str16, "2020-11-25T01:49:36.818Z");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
        mutableDateTime4.addMillis(2);
        int int7 = mutableDateTime4.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        mutableDateTime7.addYears(56);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property8.getAsShortText(locale13);
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
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime26.toGregorianCalendar();
        boolean boolean28 = property8.equals((java.lang.Object) mutableDateTime26);
        mutableDateTime26.addHours((int) (short) -1);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.dayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.913Z" + "'", str4, "2020-11-25T01:49:36.913Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Wed" + "'", str14, "Wed");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:36.913Z" + "'", str19, "2020-11-25T01:49:36.913Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMillis((long) 'a');
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfDay();
        mutableDateTime1.setWeekyear(15);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime1.toMutableDateTime();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime7);
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        int int9 = property7.get();
        java.lang.String str10 = property7.getAsText();
        java.util.Locale locale11 = null;
        int int12 = property7.getMaximumTextLength(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property7.add(0L);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "36" + "'", str10, "36");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime2.getZone();
        int int8 = mutableDateTime2.getMonthOfYear();
        boolean boolean10 = mutableDateTime2.isEqual(1606265107684L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime18 = property14.addWrapField((int) 'a');
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.dayOfWeek();
        mutableDateTime21.add((long) (short) -1);
        boolean boolean30 = property14.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime32 = property14.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime33 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime34 = property14.roundHalfCeiling();
        boolean boolean35 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime34);
        boolean boolean37 = mutableDateTime2.isEqual((long) 25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:37.006Z" + "'", str23, "2020-11-25T01:49:37.006Z");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        int int11 = property10.getMaximumValue();
        boolean boolean12 = property10.isLeap();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime14 = property10.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.secondOfMinute();
        int int17 = mutableDateTime14.getYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.044Z" + "'", str4, "2020-11-25T01:49:37.044Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2020 + "'", int17 == 2020);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.addMillis(132);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.addMillis((int) 'a');
        int int19 = mutableDateTime16.getDayOfYear();
        boolean boolean20 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime16.property(dateTimeFieldType23);
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        boolean boolean26 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = property30.addWrapField((int) 'a');
        java.lang.String str35 = property30.getAsShortText();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime38.dayOfWeek();
        int int45 = property44.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime47 = property44.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime48 = property44.roundHalfEven();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        int int54 = mutableDateTime51.getYearOfCentury();
        org.joda.time.Chronology chronology55 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(chronology55);
        org.joda.time.MutableDateTime mutableDateTime57 = mutableDateTime48.toMutableDateTime(chronology55);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((java.lang.Object) str35, chronology55);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime9.toMutableDateTime(chronology55);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(693, 45, 6294005, 6465, 336, 31, 6557, chronology55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6465 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:37.124Z" + "'", str11, "2020-11-25T01:49:37.124Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "97" + "'", str35, "97");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2020-11-25T01:49:37.125Z" + "'", str40, "2020-11-25T01:49:37.125Z");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 7 + "'", int45 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "2020-11-25T01:49:37.125Z" + "'", str53, "2020-11-25T01:49:37.125Z");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20 + "'", int54 == 20);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(mutableDateTime59);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj7 = mutableDateTime2.clone();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfDay();
        int int9 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setMinuteOfDay(814);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.193Z" + "'", str4, "2020-11-25T01:49:37.193Z");
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "2020-11-25T02:49:37.193Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "2020-11-25T02:49:37.193Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "2020-11-25T02:49:37.193Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2020 + "'", int9 == 2020);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        mutableDateTime7.setSecondOfDay(53);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.weekyear();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        org.joda.time.DurationField durationField13 = property10.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime15 = property10.addWrapField(61);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime15.setMinuteOfDay((-18804));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -18804 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.220Z" + "'", str4, "2020-11-25T01:49:37.220Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020" + "'", str11, "2020");
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.monthOfYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.addMillis((int) 'a');
        int int16 = mutableDateTime13.getDayOfYear();
        boolean boolean17 = mutableDateTime13.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime13.getZone();
        mutableDateTime2.setZoneRetainFields(dateTimeZone18);
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
        org.joda.time.MutableDateTime mutableDateTime33 = property28.getMutableDateTime();
        mutableDateTime33.addMinutes(20);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime33);
        int int37 = mutableDateTime2.getHourOfDay();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime2.weekyear();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.roundCeiling();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.dayOfWeek();
        java.lang.String str50 = mutableDateTime43.toString();
        mutableDateTime43.setMillisOfSecond((int) (short) 10);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime43.yearOfCentury();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime43.dayOfWeek();
        mutableDateTime43.setTime((long) 12);
        org.joda.time.DateTime dateTime57 = mutableDateTime43.toDateTimeISO();
        int int58 = dateTime57.getYearOfCentury();
        boolean boolean59 = property38.equals((java.lang.Object) int58);
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.Instant instant63 = mutableDateTime62.toInstant();
        mutableDateTime62.setSecondOfDay((int) '#');
        mutableDateTime62.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int71 = mutableDateTime62.getHourOfDay();
        mutableDateTime62.setSecondOfDay(1969);
        int int74 = property38.compareTo((org.joda.time.ReadableInstant) mutableDateTime62);
        org.joda.time.MutableDateTime mutableDateTime76 = property38.add(364);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.242Z" + "'", str4, "2020-11-25T01:49:37.242Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:37.243Z" + "'", str24, "2020-11-25T01:49:37.243Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:37.244Z" + "'", str45, "2020-11-25T01:49:37.244Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2020-11-25T01:49:37.244Z" + "'", str50, "2020-11-25T01:49:37.244Z");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 20 + "'", int58 == 20);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime76);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        mutableDateTime11.setMillisOfDay((int) '#');
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
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone26);
        mutableDateTime11.setZoneRetainFields(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime11.year();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        int int37 = mutableDateTime36.getDayOfWeek();
        boolean boolean38 = mutableDateTime36.isAfterNow();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime36.minuteOfDay();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        int int45 = mutableDateTime42.getYearOfCentury();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        int int47 = mutableDateTime42.getWeekOfWeekyear();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        int int53 = mutableDateTime50.getYearOfCentury();
        org.joda.time.Chronology chronology54 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime42.toMutableDateTime(chronology54);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(chronology54);
        mutableDateTime36.setChronology(chronology54);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime36.monthOfYear();
        org.joda.time.DateTimeField dateTimeField59 = property58.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setRounding(dateTimeField59, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 44");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.318Z" + "'", str4, "2020-11-25T01:49:37.318Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:37.318Z" + "'", str19, "2020-11-25T01:49:37.318Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:37.318Z" + "'", str44, "2020-11-25T01:49:37.318Z");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20 + "'", int45 == 20);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 48 + "'", int47 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2020-11-25T01:49:37.318Z" + "'", str52, "2020-11-25T01:49:37.318Z");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20 + "'", int53 == 20);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTimeField59);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        int int13 = property8.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property8.add(702L);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTime();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = mutableDateTime22.getRoundingField();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.centuryOfEra();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = mutableDateTime22.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime33 = mutableDateTime15.toDateTime(dateTimeZone28);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.368Z" + "'", str4, "2020-11-25T01:49:37.368Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNull(dateTimeField23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.dayOfWeek();
        java.lang.String str10 = mutableDateTime3.toString();
        mutableDateTime3.setMillisOfSecond((int) (short) 10);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime3.toMutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 6308, chronology19);
        mutableDateTime22.setSecondOfDay(866);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:37.438Z" + "'", str5, "2020-11-25T01:49:37.438Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:37.438Z" + "'", str10, "2020-11-25T01:49:37.438Z");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:37.438Z" + "'", str17, "2020-11-25T01:49:37.438Z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        mutableDateTime10.add((long) (short) -1);
        boolean boolean19 = property3.equals((java.lang.Object) (short) -1);
        java.util.Locale locale20 = null;
        java.lang.String str21 = property3.getAsText(locale20);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:37.459Z" + "'", str12, "2020-11-25T01:49:37.459Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97" + "'", str21, "97");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        mutableDateTime2.setSecondOfMinute((int) (byte) 10);
        mutableDateTime2.addWeekyears(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = mutableDateTime2.toString("2020-11-25T01:47:25.935Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        int int6 = mutableDateTime2.getMinuteOfHour();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        mutableDateTime2.setChronology(chronology13);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.secondOfMinute();
        int int17 = mutableDateTime2.getMinuteOfHour();
        long long18 = mutableDateTime2.getMillis();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:37.545Z" + "'", str11, "2020-11-25T01:49:37.545Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1606268977545L + "'", long18 == 1606268977545L);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        mutableDateTime8.add(readableDuration16, 4);
        mutableDateTime8.addMillis(5);
        mutableDateTime8.addHours(617);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:37.567Z" + "'", str10, "2020-11-25T01:49:37.567Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = mutableDateTime9.getRoundingField();
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) "2020-11-25T01:45:01.602Z");
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime9.add(readablePeriod14, 107);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.614Z" + "'", str4, "2020-11-25T01:49:37.614Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) (short) 10);
        java.lang.String str11 = property8.getAsText();
        int int12 = property8.getMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = property8.add((-1580946911235L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1580946911235 * 86400000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.657Z" + "'", str4, "2020-11-25T01:49:37.657Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Saturday" + "'", str11, "Saturday");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) (short) 10);
        mutableDateTime10.addWeeks(30);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant21 = null;
        mutableDateTime15.setDate(readableInstant21);
        mutableDateTime15.setMinuteOfDay(4);
        int int25 = mutableDateTime15.getMonthOfYear();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = mutableDateTime15.get(dateTimeFieldType32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime10.property(dateTimeFieldType32);
        int int35 = property34.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime37 = property34.set("2020-11-25T01:45:02.194Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:45:02.194Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.686Z" + "'", str4, "2020-11-25T01:49:37.686Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:37.686Z" + "'", str17, "2020-11-25T01:49:37.686Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11 + "'", int33 == 11);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 12 + "'", int35 == 12);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) (short) 10);
        java.lang.String str11 = property8.getAsText();
        int int12 = property8.getMinimumValue();
        java.lang.String str13 = property8.getAsText();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.714Z" + "'", str4, "2020-11-25T01:49:37.714Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Saturday" + "'", str11, "Saturday");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Saturday" + "'", str13, "Saturday");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime10.toMutableDateTimeISO();
        mutableDateTime15.setSecondOfDay(53);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.weekyear();
        java.lang.String str19 = property18.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        int int21 = mutableDateTime7.get(dateTimeFieldType20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        int int26 = property25.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime28 = property25.set((int) (short) 1);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfYear();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.hourOfDay();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime32.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.addWrapField((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime41 = property38.roundCeiling();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology43);
        mutableDateTime44.addMillis((int) 'a');
        int int47 = mutableDateTime44.getDayOfYear();
        boolean boolean48 = mutableDateTime44.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property50.getFieldType();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime44.property(dateTimeFieldType51);
        int int53 = property52.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime54 = property52.roundCeiling();
        boolean boolean55 = mutableDateTime41.isBefore((org.joda.time.ReadableInstant) mutableDateTime54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime54.dayOfYear();
        org.joda.time.DateTimeField dateTimeField57 = property56.getField();
        mutableDateTime28.setRounding(dateTimeField57);
        int int59 = mutableDateTime7.get(dateTimeField57);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.742Z" + "'", str4, "2020-11-25T01:49:37.742Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:37.742Z" + "'", str12, "2020-11-25T01:49:37.742Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020" + "'", str19, "2020");
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2020 + "'", int21 == 2020);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 366 + "'", int26 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:37.742Z" + "'", str34, "2020-11-25T01:49:37.742Z");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 330 + "'", int59 == 330);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.get();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(0);
        long long23 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        int int24 = property7.getMinimumValue();
        java.util.Locale locale25 = null;
        int int26 = property7.getMaximumShortTextLength(locale25);
        org.joda.time.MutableDateTime mutableDateTime28 = property7.add(28);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant37 = null;
        mutableDateTime31.setDate(readableInstant37);
        mutableDateTime31.setMinuteOfDay(4);
        int int41 = mutableDateTime31.getMonthOfYear();
        mutableDateTime31.setMinuteOfHour((int) '#');
        boolean boolean44 = mutableDateTime31.isEqualNow();
        boolean boolean45 = mutableDateTime28.isEqual((org.joda.time.ReadableInstant) mutableDateTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.829Z" + "'", str4, "2020-11-25T01:49:37.829Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:37.829Z" + "'", str15, "2020-11-25T01:49:37.829Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime28);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:37.829Z" + "'", str33, "2020-11-25T01:49:37.829Z");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 11 + "'", int41 == 11);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = mutableDateTime9.getRoundingField();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime9.toMutableDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant21 = null;
        mutableDateTime15.setDate(readableInstant21);
        mutableDateTime15.setMinuteOfDay(4);
        int int25 = mutableDateTime15.getMonthOfYear();
        mutableDateTime15.setMinuteOfHour((int) '#');
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime15.toMutableDateTime(dateTimeZone33);
        mutableDateTime12.setZoneRetainFields(dateTimeZone33);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.Instant instant42 = mutableDateTime41.toInstant();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime44 = property43.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime44.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundFloor();
        int int48 = mutableDateTime47.getMillisOfDay();
        org.joda.time.Chronology chronology49 = mutableDateTime47.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone33, chronology49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.909Z" + "'", str4, "2020-11-25T01:49:37.909Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNull(dateTimeField11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:37.909Z" + "'", str17, "2020-11-25T01:49:37.909Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(chronology49);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        mutableDateTime8.setSecondOfDay((int) '#');
        mutableDateTime8.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int17 = mutableDateTime8.getHourOfDay();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.Instant instant19 = mutableDateTime2.toInstant();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(instant19);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.minuteOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        int int15 = mutableDateTime14.getDayOfWeek();
        boolean boolean16 = mutableDateTime14.isAfterNow();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.minuteOfDay();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        int int25 = mutableDateTime20.getWeekOfWeekyear();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime20.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology32);
        mutableDateTime14.setChronology(chronology32);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 102, chronology32);
        mutableDateTime2.setChronology(chronology32);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundHalfEven();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.hourOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.972Z" + "'", str4, "2020-11-25T01:49:37.972Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:37.972Z" + "'", str22, "2020-11-25T01:49:37.972Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 48 + "'", int25 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:37.972Z" + "'", str30, "2020-11-25T01:49:37.972Z");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfYear();
        int int7 = property6.getMaximumValueOverall();
        long long8 = property6.remainder();
        int int9 = property6.getMinimumValueOverall();
        int int10 = property6.get();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 366 + "'", int7 == 366);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35033L + "'", long8 == 35033L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 330 + "'", int10 == 330);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.get();
        org.joda.time.DateTimeField dateTimeField11 = property7.getField();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property7.getAsText(locale12);
        org.joda.time.Interval interval14 = property7.toInterval();
        org.joda.time.MutableDateTime mutableDateTime15 = property7.roundHalfEven();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.weekyear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.085Z" + "'", str4, "2020-11-25T01:49:38.085Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2" + "'", str13, "2");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        int int11 = property10.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property10.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime15 = property10.add((long) 11);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTime();
        mutableDateTime15.addWeeks(22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime15.toString(dateTimeFormatter19);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.117Z" + "'", str4, "2020-11-25T01:49:38.117Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2021-05-09T00:00:00.000Z" + "'", str20, "2021-05-09T00:00:00.000Z");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 1969, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) '4', dateTimeZone5);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        mutableDateTime8.addMillis((int) 'a');
        int int11 = mutableDateTime8.getDayOfYear();
        boolean boolean12 = mutableDateTime8.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime5.toMutableDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        int int18 = mutableDateTime17.getYearOfCentury();
        boolean boolean19 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.addWeekyears(999);
        org.joda.time.DateTimeField dateTimeField22 = mutableDateTime17.getRoundingField();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 70 + "'", int18 == 70);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dateTimeField22);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = property8.getAsShortText(locale13);
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
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime26.toGregorianCalendar();
        boolean boolean28 = property8.equals((java.lang.Object) mutableDateTime26);
        org.joda.time.DateTimeField dateTimeField29 = property8.getField();
        org.joda.time.MutableDateTime mutableDateTime30 = property8.roundHalfEven();
        int int31 = mutableDateTime30.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.monthOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.242Z" + "'", str4, "2020-11-25T01:49:38.242Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Wed" + "'", str14, "Wed");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:38.242Z" + "'", str19, "2020-11-25T01:49:38.242Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.String str8 = property7.getName();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfEven();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.281Z" + "'", str4, "2020-11-25T01:49:38.281Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:20.192Z", dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property3.add((int) (short) -1);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        int int18 = mutableDateTime13.getWeekOfWeekyear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTime dateTime23 = mutableDateTime13.toDateTime(dateTimeZone22);
        long long24 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime13);
        int int25 = property3.get();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:38.325Z" + "'", str15, "2020-11-25T01:49:38.325Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-18861L) + "'", long24 == (-18861L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 96 + "'", int25 == 96);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime7.addYears((int) (short) 10);
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        int int11 = mutableDateTime7.getRoundingMode();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        mutableDateTime7.addWeeks(6324);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        int int8 = property3.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime9 = property3.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
        int int11 = property10.getMinimumValue();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = property10.set("2020-11-25T01:45:00.386Z", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:45:00.386Z\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        org.joda.time.MutableDateTime mutableDateTime13 = property8.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = property8.roundCeiling();
        boolean boolean15 = mutableDateTime14.isBeforeNow();
        int int16 = mutableDateTime14.getSecondOfMinute();
        long long17 = mutableDateTime14.getMillis();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.424Z" + "'", str4, "2020-11-25T01:49:38.424Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1606262400000L + "'", long17 == 1606262400000L);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        long long9 = property7.remainder();
        int int10 = property7.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.getMutableDateTime();
        boolean boolean13 = mutableDateTime11.isAfter((long) 59);
        mutableDateTime11.setDate((long) 2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(durationField8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 6578461L + "'", long9 == 6578461L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        mutableDateTime2.setMillisOfSecond((int) (short) 10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.setTime((long) 12);
        org.joda.time.DateTime dateTime16 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfWeek();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.493Z" + "'", str4, "2020-11-25T01:49:38.493Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:38.493Z" + "'", str9, "2020-11-25T01:49:38.493Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        boolean boolean7 = mutableDateTime1.isEqual((long) 106);
        int int8 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.monthOfYear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime2.toString(dateTimeFormatter7);
        org.joda.time.DateTime dateTime9 = mutableDateTime2.toDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.555Z" + "'", str4, "2020-11-25T01:49:38.555Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:38.555Z" + "'", str8, "2020-11-25T01:49:38.555Z");
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
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
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.setMinuteOfDay(45);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime17.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime17.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime22.setSecondOfMinute(6448);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6448 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:38.591Z" + "'", str7, "2020-11-25T01:49:38.591Z");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = mutableDateTime2.getSecondOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        int int15 = mutableDateTime12.getDayOfYear();
        boolean boolean16 = mutableDateTime12.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.property(dateTimeFieldType19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.addMillis((int) 'a');
        int int26 = mutableDateTime23.getDayOfYear();
        boolean boolean27 = mutableDateTime23.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime23.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone28);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.dayOfWeek();
        mutableDateTime33.add((long) (short) -1);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime33.secondOfDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime48 = property46.add((long) (short) -1);
        mutableDateTime48.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime48.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime53 = property51.getMutableDateTime();
        boolean boolean54 = mutableDateTime53.isAfterNow();
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
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime57.monthOfYear();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology67);
        mutableDateTime68.addMillis((int) 'a');
        int int71 = mutableDateTime68.getDayOfYear();
        boolean boolean72 = mutableDateTime68.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone73 = mutableDateTime68.getZone();
        mutableDateTime57.setZoneRetainFields(dateTimeZone73);
        mutableDateTime53.setZone(dateTimeZone73);
        mutableDateTime33.setZone(dateTimeZone73);
        org.joda.time.MutableDateTime mutableDateTime77 = org.joda.time.MutableDateTime.now(dateTimeZone73);
        mutableDateTime12.setZoneRetainFields(dateTimeZone73);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.625Z" + "'", str4, "2020-11-25T01:49:38.625Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6578 + "'", int9 == 6578);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11-25T01:49:38.625Z" + "'", str35, "2020-11-25T01:49:38.625Z");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2020-11-25T01:49:38.625Z" + "'", str59, "2020-11-25T01:49:38.625Z");
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(mutableDateTime77);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        int int11 = property10.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property10.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime15 = property10.add((long) 11);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        mutableDateTime18.setSecondOfDay((int) '#');
        boolean boolean22 = mutableDateTime15.isEqual((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime15.minuteOfHour();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        mutableDateTime26.setDate((long) 10);
        int int30 = mutableDateTime26.getCenturyOfEra();
        boolean boolean32 = mutableDateTime26.isBefore((long) (short) -1);
        boolean boolean33 = mutableDateTime26.isBeforeNow();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property37.add((long) (short) -1);
        mutableDateTime39.setWeekOfWeekyear(53);
        boolean boolean42 = mutableDateTime26.equals((java.lang.Object) 53);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime48 = property46.add((long) (short) -1);
        mutableDateTime48.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime56 = property54.add((long) (short) -1);
        mutableDateTime56.setWeekOfWeekyear(53);
        mutableDateTime48.setTime((org.joda.time.ReadableInstant) mutableDateTime56);
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.Instant instant63 = mutableDateTime62.toInstant();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime62.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime65 = property64.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = property64.getFieldType();
        int int67 = mutableDateTime56.get(dateTimeFieldType66);
        mutableDateTime26.setMillis((org.joda.time.ReadableInstant) mutableDateTime56);
        mutableDateTime56.setMillisOfDay(2);
        org.joda.time.Chronology chronology71 = mutableDateTime56.getChronology();
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime15, chronology71);
        java.util.Locale locale73 = null;
        java.util.Calendar calendar74 = mutableDateTime15.toCalendar(locale73);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.692Z" + "'", str4, "2020-11-25T01:49:38.692Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19 + "'", int30 == 19);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 12 + "'", int67 == 12);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(calendar74);
        org.junit.Assert.assertEquals(calendar74.toString(), "java.util.GregorianCalendar[time=1607212800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=341,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) (short) 10);
        int int11 = property8.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime13 = property8.add(7);
        long long14 = property8.remainder();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.811Z" + "'", str4, "2020-11-25T01:49:38.811Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 6578811L + "'", long14 == 6578811L);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        mutableDateTime2.setMillisOfSecond((int) (short) 10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.getMutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTime dateTime26 = mutableDateTime16.toDateTime(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = dateTime26.isSupported(dateTimeFieldType27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime26);
        int int30 = mutableDateTime29.getSecondOfDay();
        long long31 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime29);
        java.util.Locale locale32 = null;
        int int33 = property12.getMaximumTextLength(locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = property12.getMutableDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.852Z" + "'", str4, "2020-11-25T01:49:38.852Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:38.852Z" + "'", str9, "2020-11-25T01:49:38.852Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:38.853Z" + "'", str18, "2020-11-25T01:49:38.853Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6578 + "'", int30 == 6578);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime34);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        int int3 = mutableDateTime2.getYearOfCentury();
        int int4 = mutableDateTime2.getDayOfYear();
        int int5 = mutableDateTime2.getDayOfMonth();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:38.923Z" + "'", str10, "2020-11-25T01:49:38.923Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.set((int) (short) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfYear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.year();
        mutableDateTime6.addSeconds((int) (byte) 1);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        int int18 = mutableDateTime13.getWeekOfWeekyear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime13.toMutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, chronology25);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 366 + "'", int4 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:38.968Z" + "'", str15, "2020-11-25T01:49:38.968Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:38.968Z" + "'", str23, "2020-11-25T01:49:38.968Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        mutableDateTime10.add((long) (short) -1);
        boolean boolean19 = property3.equals((java.lang.Object) (short) -1);
        int int20 = property3.getMinimumValueOverall();
        org.joda.time.Interval interval21 = property3.toInterval();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:39.018Z" + "'", str12, "2020-11-25T01:49:39.018Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(interval21);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.year();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property13.getAsText(locale14);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.053Z" + "'", str4, "2020-11-25T01:49:39.053Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:39.053Z" + "'", str8, "2020-11-25T01:49:39.053Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020" + "'", str15, "2020");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.Chronology chronology6 = mutableDateTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime5.copy();
        mutableDateTime7.setDate((long) 437);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.DateTime dateTime22 = mutableDateTime7.toDateTime(chronology18);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:39.080Z" + "'", str16, "2020-11-25T01:49:39.080Z");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = mutableDateTime2.getSecondOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        int int15 = mutableDateTime12.getDayOfYear();
        boolean boolean16 = mutableDateTime12.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.property(dateTimeFieldType19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.addMillis((int) 'a');
        int int26 = mutableDateTime23.getDayOfYear();
        boolean boolean27 = mutableDateTime23.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime23.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone28);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.addWrapField((int) (short) 1);
        int int41 = property38.get();
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
        long long54 = property38.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime53);
        boolean boolean56 = mutableDateTime53.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime57 = mutableDateTime53.toDateTimeISO();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        mutableDateTime60.add(readablePeriod63);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime60.hourOfDay();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime60.dayOfWeek();
        int int67 = property66.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime69 = property66.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime70 = property66.roundHalfEven();
        java.lang.Object obj71 = null;
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(obj71, chronology72);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = null;
        java.lang.String str75 = mutableDateTime73.toString(dateTimeFormatter74);
        int int76 = mutableDateTime73.getYearOfCentury();
        org.joda.time.Chronology chronology77 = mutableDateTime73.getChronology();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(chronology77);
        org.joda.time.MutableDateTime mutableDateTime79 = mutableDateTime70.toMutableDateTime(chronology77);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime53.toMutableDateTime(chronology77);
        org.joda.time.DateTime dateTime81 = mutableDateTime2.toDateTime(chronology77);
        int int82 = mutableDateTime2.getSecondOfDay();
        org.joda.time.DateTime dateTime83 = mutableDateTime2.toDateTimeISO();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.126Z" + "'", str4, "2020-11-25T01:49:39.126Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6579 + "'", int9 == 6579);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11-25T01:49:39.126Z" + "'", str35, "2020-11-25T01:49:39.126Z");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:39.126Z" + "'", str46, "2020-11-25T01:49:39.126Z");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 7 + "'", int51 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime53);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTime57);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "2020-11-25T01:49:39.126Z" + "'", str62, "2020-11-25T01:49:39.126Z");
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 7 + "'", int67 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime69);
        org.junit.Assert.assertNotNull(mutableDateTime70);
// flaky:         org.junit.Assert.assertEquals("'" + str75 + "' != '" + "2020-11-25T01:49:39.126Z" + "'", str75, "2020-11-25T01:49:39.126Z");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 20 + "'", int76 == 20);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(mutableDateTime80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(dateTime83);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime12 = property9.roundCeiling();
        boolean boolean13 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.secondOfMinute();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.lang.String str6 = mutableDateTime5.toString();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime9.addYears((int) (short) 10);
        int int12 = mutableDateTime9.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime9.add(readablePeriod13);
        mutableDateTime9.setMillis(1606265101746L);
        int int17 = mutableDateTime9.getMillisOfDay();
        int int18 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:39.294Z" + "'", str6, "2020-11-25T01:49:39.294Z");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2701746 + "'", int17 == 2701746);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime3.toMutableDateTime(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(1606268947611L, chronology15);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:39.356Z" + "'", str5, "2020-11-25T01:49:39.356Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:39.356Z" + "'", str13, "2020-11-25T01:49:39.356Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
        int int5 = mutableDateTime4.getSecondOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime8.toGregorianCalendar();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime18.toGregorianCalendar();
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        boolean boolean29 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime28);
        boolean boolean30 = mutableDateTime4.isAfter((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6579 + "'", int5 == 6579);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:39.472Z" + "'", str10, "2020-11-25T01:49:39.472Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(gregorianCalendar15);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:39.473Z" + "'", str20, "2020-11-25T01:49:39.473Z");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(gregorianCalendar24);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.getMutableDateTime();
        boolean boolean11 = mutableDateTime10.isAfterNow();
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
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.monthOfYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        mutableDateTime25.addMillis((int) 'a');
        int int28 = mutableDateTime25.getDayOfYear();
        boolean boolean29 = mutableDateTime25.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime25.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone30);
        mutableDateTime10.setZone(dateTimeZone30);
        boolean boolean33 = mutableDateTime10.isEqualNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:39.541Z" + "'", str16, "2020-11-25T01:49:39.541Z");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        int int6 = mutableDateTime1.getSecondOfDay();
        mutableDateTime1.add(1606265113866L);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.secondOfMinute();
        int int10 = mutableDateTime1.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime1.millisOfSecond();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        int int11 = property10.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property10.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime15 = property10.add((long) 11);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTime();
        mutableDateTime15.addWeeks(22);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.millisOfDay();
        mutableDateTime15.addDays(6365);
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime15.toGregorianCalendar();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.703Z" + "'", str4, "2020-11-25T01:49:39.703Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(gregorianCalendar22);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundHalfFloor();
        int int11 = mutableDateTime10.getMinuteOfHour();
        mutableDateTime10.addSeconds(44);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        mutableDateTime2.setMinuteOfDay(4);
        int int12 = mutableDateTime2.getMonthOfYear();
        mutableDateTime2.setMinuteOfHour((int) '#');
        boolean boolean15 = mutableDateTime2.isEqualNow();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        mutableDateTime18.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        mutableDateTime2.setRounding(dateTimeField24);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology33);
        mutableDateTime34.addMillis((int) 'a');
        int int37 = mutableDateTime34.getDayOfYear();
        boolean boolean38 = mutableDateTime34.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime31.toMutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone39);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.secondOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.841Z" + "'", str4, "2020-11-25T01:49:39.841Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(property42);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.get();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(0);
        long long23 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        boolean boolean25 = mutableDateTime22.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime26 = mutableDateTime22.toDateTimeISO();
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
        org.joda.time.MutableDateTime mutableDateTime39 = property35.roundHalfEven();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        int int45 = mutableDateTime42.getYearOfCentury();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology46);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime39.toMutableDateTime(chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime22.toMutableDateTime(chronology46);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime22.yearOfCentury();
        int int51 = property50.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime53 = property50.set(6498);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6498 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.900Z" + "'", str4, "2020-11-25T01:49:39.900Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:39.900Z" + "'", str15, "2020-11-25T01:49:39.900Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:39.900Z" + "'", str31, "2020-11-25T01:49:39.900Z");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:39.900Z" + "'", str44, "2020-11-25T01:49:39.900Z");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20 + "'", int45 == 20);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 99 + "'", int51 == 99);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        int int4 = mutableDateTime3.getDayOfWeek();
        boolean boolean5 = mutableDateTime3.isAfterNow();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime3.minuteOfDay();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        int int14 = mutableDateTime9.getWeekOfWeekyear();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime9.toMutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology21);
        mutableDateTime3.setChronology(chronology21);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 102, chronology21);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(chronology21);
        int int30 = mutableDateTime29.getDayOfYear();
        mutableDateTime29.setWeekyear(6432);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone38);
        boolean boolean43 = mutableDateTime29.isEqual((org.joda.time.ReadableInstant) mutableDateTime42);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:40.006Z" + "'", str11, "2020-11-25T01:49:40.006Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:40.006Z" + "'", str19, "2020-11-25T01:49:40.006Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 330 + "'", int30 == 330);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfCeiling();
        int int8 = mutableDateTime7.getMinuteOfDay();
        boolean boolean10 = mutableDateTime7.isBefore((long) 18);
        int int11 = mutableDateTime7.getEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime7.setDayOfYear(922);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 922 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.101Z" + "'", str4, "2020-11-25T01:49:40.101Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 109 + "'", int8 == 109);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        mutableDateTime10.addMillis((int) 'a');
        int int13 = mutableDateTime10.getDayOfYear();
        boolean boolean14 = mutableDateTime10.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.property(dateTimeFieldType17);
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime19.toMutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:09.970Z", dateTimeZone23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(2701746, (-18804), 6492, 6537, (-18591), 0, 99, dateTimeZone23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6537 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        int int3 = mutableDateTime1.getYearOfCentury();
        boolean boolean4 = mutableDateTime1.isBeforeNow();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        mutableDateTime6.setMillis(2246693864L);
        mutableDateTime6.add((long) 292278993);
        mutableDateTime6.addMinutes(8462);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        int int8 = property3.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime9 = property3.roundHalfCeiling();
        java.lang.String str10 = property3.getAsText();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97" + "'", str10, "97");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.centuryOfEra();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.Chronology chronology6 = mutableDateTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime5.copy();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime5.setZoneRetainFields(dateTimeZone12);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 102, dateTimeZone12);
        mutableDateTime17.setTime(2, 13, 3, 8);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfMonth();
        boolean boolean24 = property23.isLeap();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.addWrapField((-1));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:40.552Z" + "'", str5, "2020-11-25T01:49:40.552Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.centuryOfEra();
        int int21 = mutableDateTime19.getYearOfCentury();
        int int22 = property17.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.662Z" + "'", str4, "2020-11-25T01:49:40.662Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:40.662Z" + "'", str12, "2020-11-25T01:49:40.662Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.get();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(0);
        long long23 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        boolean boolean25 = mutableDateTime22.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime26 = mutableDateTime22.toDateTimeISO();
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
        org.joda.time.MutableDateTime mutableDateTime39 = property35.roundHalfEven();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        int int45 = mutableDateTime42.getYearOfCentury();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology46);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime39.toMutableDateTime(chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime22.toMutableDateTime(chronology46);
        org.joda.time.DateTime dateTime50 = mutableDateTime49.toDateTimeISO();
        int int51 = dateTime50.getWeekyear();
        org.joda.time.DateTime dateTime52 = dateTime50.toDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.765Z" + "'", str4, "2020-11-25T01:49:40.765Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:40.765Z" + "'", str15, "2020-11-25T01:49:40.765Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:40.765Z" + "'", str31, "2020-11-25T01:49:40.765Z");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:40.766Z" + "'", str44, "2020-11-25T01:49:40.766Z");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20 + "'", int45 == 20);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2020 + "'", int51 == 2020);
        org.junit.Assert.assertNotNull(dateTime52);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        mutableDateTime10.add((long) (short) -1);
        boolean boolean19 = property3.equals((java.lang.Object) (short) -1);
        boolean boolean20 = property3.isLeap();
        java.lang.String str21 = property3.getAsString();
        org.joda.time.MutableDateTime mutableDateTime23 = property3.addWrapField(721);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:40.874Z" + "'", str12, "2020-11-25T01:49:40.874Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97" + "'", str21, "97");
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.secondOfMinute();
        int int18 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        int int19 = mutableDateTime2.getMillisOfSecond();
        mutableDateTime2.addMinutes(53);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:40.997Z" + "'", str11, "2020-11-25T01:49:40.997Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 997 + "'", int19 == 997);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.addMillis(132);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        int int8 = mutableDateTime2.getRoundingMode();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.097Z" + "'", str4, "2020-11-25T01:49:41.097Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 2020, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        int int9 = property7.get();
        java.lang.String str10 = property7.getAsText();
        boolean boolean11 = property7.isLeap();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 41 + "'", int9 == 41);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "41" + "'", str10, "41");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        mutableDateTime2.setSecondOfMinute((int) (byte) 10);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property14.getFieldType();
        int int17 = mutableDateTime2.get(dateTimeFieldType16);
        int int18 = mutableDateTime2.getDayOfYear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.set((int) (short) 1);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        mutableDateTime9.setZone(dateTimeZone11);
        int int13 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime9.add(readablePeriod14, (int) (short) 10);
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.setMillis((long) (-1));
        int int20 = mutableDateTime9.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.centuryOfEra();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        int int31 = mutableDateTime26.getWeekOfWeekyear();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTime dateTime36 = mutableDateTime26.toDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime22.toMutableDateTime(dateTimeZone35);
        int int39 = mutableDateTime22.getMillisOfSecond();
        java.util.GregorianCalendar gregorianCalendar40 = mutableDateTime22.toGregorianCalendar();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((-2655L), dateTimeZone46);
        mutableDateTime22.setZone(dateTimeZone46);
        org.joda.time.DateTime dateTime50 = mutableDateTime9.toDateTime(dateTimeZone46);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 366 + "'", int4 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 365 + "'", int20 == 365);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:41.339Z" + "'", str28, "2020-11-25T01:49:41.339Z");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 48 + "'", int31 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 895 + "'", int39 == 895);
        org.junit.Assert.assertNotNull(gregorianCalendar40);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime2.getZone();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7, 49);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.dayOfMonth();
        java.lang.String str12 = property11.getName();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "dayOfMonth" + "'", str12, "dayOfMonth");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        mutableDateTime8.addMillis((int) 'a');
        int int11 = mutableDateTime8.getDayOfYear();
        boolean boolean12 = mutableDateTime8.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime5.toMutableDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        int int18 = mutableDateTime17.getYearOfCentury();
        boolean boolean19 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime14.toMutableDateTime();
        java.lang.String str21 = mutableDateTime20.toString();
        mutableDateTime20.setDate((long) 49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime20.toString(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 70 + "'", int18 == 70);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-12-01T00:00:00.000Z" + "'", str21, "2020-12-01T00:00:00.000Z");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str25, "1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        mutableDateTime7.setSecondOfDay(53);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        int int13 = mutableDateTime12.getYearOfCentury();
        int int14 = mutableDateTime12.getEra();
        int int15 = mutableDateTime12.getWeekyear();
        int int16 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        boolean boolean18 = mutableDateTime7.isEqual((long) 99);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.607Z" + "'", str4, "2020-11-25T01:49:41.607Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 70 + "'", int13 == 70);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology14);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.addWrapField((int) (short) 1);
        int int30 = property27.getLeapAmount();
        org.joda.time.DateTimeField dateTimeField31 = property27.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime19.setRounding(dateTimeField31, 810);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 810");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.666Z" + "'", str4, "2020-11-25T01:49:41.666Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:41.666Z" + "'", str12, "2020-11-25T01:49:41.666Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:41.666Z" + "'", str24, "2020-11-25T01:49:41.666Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        org.joda.time.DurationField durationField8 = property3.getLeapDurationField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.set((int) (short) 1);
        java.util.Locale locale16 = null;
        int int17 = property12.getMaximumTextLength(locale16);
        org.joda.time.MutableDateTime mutableDateTime18 = property12.roundHalfFloor();
        int int19 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime18.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 366 + "'", int13 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.secondOfMinute();
        int int13 = mutableDateTime11.getSecondOfMinute();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.822Z" + "'", str4, "2020-11-25T01:49:41.822Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 41 + "'", int13 == 41);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.addWrapField((int) 'a');
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.dayOfWeek();
        mutableDateTime15.add((long) (short) -1);
        boolean boolean24 = property8.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime26 = property8.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime27 = property8.roundHalfFloor();
        java.util.Locale locale28 = null;
        java.util.Calendar calendar29 = mutableDateTime27.toCalendar(locale28);
        boolean boolean30 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.add((long) (short) -1);
        mutableDateTime36.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime36.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime41 = property39.getMutableDateTime();
        boolean boolean42 = mutableDateTime41.isAfterNow();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime45.add(readablePeriod48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.hourOfDay();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime45.dayOfWeek();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime45.secondOfDay();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime45.monthOfYear();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology55);
        mutableDateTime56.addMillis((int) 'a');
        int int59 = mutableDateTime56.getDayOfYear();
        boolean boolean60 = mutableDateTime56.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime56.getZone();
        mutableDateTime45.setZoneRetainFields(dateTimeZone61);
        mutableDateTime41.setZone(dateTimeZone61);
        mutableDateTime2.setZoneRetainFields(dateTimeZone61);
        int int65 = mutableDateTime2.getMillisOfSecond();
        int int66 = mutableDateTime2.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:41.858Z" + "'", str17, "2020-11-25T01:49:41.858Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=-20217600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=4,WEEK_OF_YEAR=20,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=132,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2020-11-25T01:49:41.858Z" + "'", str47, "2020-11-25T01:49:41.858Z");
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 98 + "'", int65 == 98);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 98 + "'", int66 == 98);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = mutableDateTime2.toString("2020-11-25T01:49:25.063Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.985Z" + "'", str4, "2020-11-25T01:49:41.985Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        int int8 = mutableDateTime2.getYearOfCentury();
        int int9 = mutableDateTime2.getCenturyOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.039Z" + "'", str4, "2020-11-25T01:49:42.039Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        java.util.Locale locale13 = null;
        java.lang.String str14 = property8.getAsShortText(locale13);
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
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime26.toGregorianCalendar();
        boolean boolean28 = property8.equals((java.lang.Object) mutableDateTime26);
        org.joda.time.DateTimeField dateTimeField29 = property8.getField();
        org.joda.time.MutableDateTime mutableDateTime31 = property8.add((long) 6471);
        org.joda.time.DateTime dateTime32 = mutableDateTime31.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.secondOfDay();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property33.getAsShortText(locale34);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.129Z" + "'", str4, "2020-11-25T01:49:42.129Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Wed" + "'", str14, "Wed");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:42.129Z" + "'", str19, "2020-11-25T01:49:42.129Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0" + "'", str35, "0");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        org.joda.time.DurationField durationField8 = property3.getLeapDurationField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.set((int) (short) 1);
        java.util.Locale locale16 = null;
        int int17 = property12.getMaximumTextLength(locale16);
        org.joda.time.MutableDateTime mutableDateTime18 = property12.roundHalfFloor();
        int int19 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfCeiling();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant30 = null;
        mutableDateTime24.setDate(readableInstant30);
        mutableDateTime24.setMinuteOfDay(4);
        int int34 = mutableDateTime24.getMonthOfYear();
        mutableDateTime24.setMinuteOfHour((int) '#');
        boolean boolean37 = mutableDateTime24.isEqualNow();
        mutableDateTime24.setMillisOfDay(19);
        mutableDateTime24.addWeekyears(0);
        long long42 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime24.addDays(8400);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 366 + "'", int13 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:42.198Z" + "'", str26, "2020-11-25T01:49:42.198Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 11 + "'", int34 == 11);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-18591L) + "'", long42 == (-18591L));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.weekyear();
        int int14 = property13.get();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.addWrapField((int) (short) 10);
        java.lang.String str26 = property23.getAsText();
        org.joda.time.MutableDateTime mutableDateTime27 = property23.roundCeiling();
        long long28 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.260Z" + "'", str4, "2020-11-25T01:49:42.260Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2020 + "'", int14 == 2020);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:42.260Z" + "'", str19, "2020-11-25T01:49:42.260Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Saturday" + "'", str26, "Saturday");
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }
}
