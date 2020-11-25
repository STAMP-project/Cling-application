import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZone(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.plus(readableDuration20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DateTime dateTime27 = property25.roundHalfEvenCopy();
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) '#');
        boolean boolean35 = dateTime21.equals((java.lang.Object) dateTime34);
        boolean boolean36 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime38 = dateTime34.minusMonths((int) '4');
        org.joda.time.DateTime.Property property39 = dateTime38.era();
        java.lang.String str40 = property39.toString();
        org.joda.time.DurationField durationField41 = property39.getDurationField();
        int int42 = property39.getMinimumValueOverall();
        org.joda.time.DurationField durationField43 = property39.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Property[era]" + "'", str40, "Property[era]");
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(durationField43);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime14.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime14.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        int int26 = dateTime24.getDayOfMonth();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime24.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        org.joda.time.DateTime dateTime32 = dateTime21.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(0L, dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime7.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone31);
        int int37 = dateTime36.getCenturyOfEra();
        java.util.Date date38 = dateTime36.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = dateTime36.withDayOfWeek(19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Wed Nov 25 02:37:43 UTC 2020");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        org.joda.time.DateTime dateTime11 = dateTime7.withYearOfEra(1);
        org.joda.time.DateTime dateTime14 = dateTime7.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime16 = dateTime14.minusYears(4);
        org.joda.time.DateTime dateTime18 = dateTime14.withDayOfWeek(1);
        org.joda.time.Chronology chronology19 = dateTime14.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(850, 59, (int) (byte) -1, 4319, 36, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4319 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime.Property property11 = dateTime9.yearOfCentury();
        java.lang.String str12 = property11.toString();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfDay();
        java.lang.String str17 = property16.getAsText();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        int int22 = dateTime20.getDayOfMonth();
        long long23 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime24 = property16.withMinimumValue();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.toDateTime(chronology28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded(readableDuration30, 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withZone(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = dateTime34.toLocalDateTime();
        org.joda.time.DateTime dateTime36 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime35);
        int int37 = dateTime24.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime39 = dateTime24.withYear(4);
        org.joda.time.DateTime dateTime41 = dateTime24.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime44 = dateTime41.withPeriodAdded(readablePeriod42, (int) (byte) 0);
        java.util.GregorianCalendar gregorianCalendar45 = dateTime44.toGregorianCalendar();
        org.joda.time.DateTime.Property property46 = dateTime44.weekOfWeekyear();
        org.joda.time.DateTime dateTime47 = dateTime44.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property48 = dateTime44.yearOfCentury();
        int int49 = property11.compareTo((org.joda.time.ReadableInstant) dateTime44);
        int int50 = dateTime44.getYearOfCentury();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[yearOfCentury]" + "'", str12, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(gregorianCalendar45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 70 + "'", int50 == 70);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        long long16 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        int int17 = property9.get();
        org.joda.time.Interval interval18 = property9.toInterval();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZone(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime26.toLocalDateTime();
        int int30 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime31 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTime dateTime33 = dateTime5.plusSeconds((-1));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((int) (short) -1, 0, (int) (short) -1, 37, 292278993, (int) ' ', 11, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.DurationField durationField7 = property3.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime2.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTime.Property property9 = dateTime8.weekOfWeekyear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        int int18 = dateTime12.getDayOfMonth();
        boolean boolean19 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        boolean boolean6 = dateTime5.isEqualNow();
        int int7 = dateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime8 = dateTime5.toLocalDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.minus(readableDuration22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) readableDuration22);
        org.joda.time.DateTime.Property property25 = dateTime24.millisOfSecond();
        long long26 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime28 = dateTime24.minusMillis((int) (short) -1);
        boolean boolean29 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.plus(readableDuration30);
        org.joda.time.DateTime.Property property32 = dateTime31.weekOfWeekyear();
        int int33 = dateTime31.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.plus(readablePeriod34);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-18591L) + "'", long26 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 48 + "'", int33 == 48);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime10 = dateTime9.toLocalDateTime();
        int int11 = dateTime9.getEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis(1970);
        org.joda.time.DateTime.Property property19 = dateTime18.monthOfYear();
        org.joda.time.DateTime.Property property20 = dateTime18.dayOfYear();
        org.joda.time.DateTime.Property property21 = dateTime18.minuteOfDay();
        int int22 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime19);
        int int21 = dateTime20.getWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.plus((long) 'a');
        long long9 = dateTime5.getMillis();
        org.joda.time.DateTime.Property property10 = dateTime5.minuteOfHour();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.DateTime dateTime16 = dateTime13.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime13.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime13.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        int int25 = dateTime23.getDayOfMonth();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime23.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = dateTime20.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime5.toDateTime(dateTimeZone30);
        org.joda.time.DateTime.Property property34 = dateTime5.yearOfCentury();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        int int9 = property3.get();
        int int10 = property3.get();
        int int11 = property3.getMinimumValueOverall();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis(1970);
        org.joda.time.DateTime.Property property19 = dateTime18.monthOfYear();
        boolean boolean20 = property3.equals((java.lang.Object) property19);
        java.lang.String str21 = property3.getAsShortText();
        org.joda.time.DateTime dateTime22 = property3.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField23 = property3.getLeapDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNull(durationField23);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours(100);
        org.joda.time.DateTime dateTime11 = dateTime7.minusWeeks((int) (byte) 100);
        int int12 = dateTime11.getYearOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillis((long) 12);
        org.joda.time.DateTime dateTime16 = dateTime11.withMillisOfDay(7);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readablePeriod17);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1968 + "'", int12 == 1968);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        java.lang.String str5 = property4.getName();
        org.joda.time.DateTime dateTime6 = property4.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "minuteOfHour" + "'", str5, "minuteOfHour");
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        int int29 = dateTime11.getMillisOfDay();
        org.joda.time.DateTime dateTime30 = dateTime11.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime1.minusWeeks((int) ' ');
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        int int7 = property6.get();
        org.joda.time.DateTime dateTime9 = property6.addToCopy(35L);
        org.joda.time.DateTime.Property property10 = dateTime9.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime8 = dateTime2.plusHours(0);
        long long9 = dateTime2.getMillis();
        int int10 = dateTime2.getMinuteOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) (byte) 0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfDay();
        java.lang.String str38 = property37.getAsText();
        org.joda.time.DateTime dateTime39 = property37.roundHalfEvenCopy();
        int int40 = property37.get();
        java.util.Locale locale41 = null;
        int int42 = property37.getMaximumTextLength(locale41);
        int int43 = property37.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property37.getFieldType();
        org.joda.time.DateTime dateTime46 = dateTime31.withField(dateTimeFieldType44, (int) (short) 1);
        int int47 = dateTime31.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = dateTime31.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 1, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.toDateTime(chronology52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime56 = dateTime51.withDurationAdded(readableDuration54, 100);
        org.joda.time.DateTime.Property property57 = dateTime56.dayOfYear();
        org.joda.time.DurationField durationField58 = property57.getLeapDurationField();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (byte) 1, chronology60);
        org.joda.time.DateTime.Property property62 = dateTime61.minuteOfDay();
        java.lang.String str63 = property62.getAsText();
        org.joda.time.DateTime dateTime64 = property62.withMaximumValue();
        org.joda.time.DateTime dateTime66 = property62.setCopy((int) (byte) 10);
        java.lang.String str67 = property62.getAsShortText();
        boolean boolean68 = property62.isLeap();
        org.joda.time.DateTime dateTime69 = property62.withMinimumValue();
        int int70 = dateTime69.getMinuteOfDay();
        long long71 = property57.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime.Property property72 = dateTime69.millisOfDay();
        int int73 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime69);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNull(durationField58);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0" + "'", str67, "0");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        java.util.GregorianCalendar gregorianCalendar32 = dateTime31.toGregorianCalendar();
        org.joda.time.DateTime.Property property33 = dateTime31.weekOfWeekyear();
        org.joda.time.DateTime dateTime34 = dateTime31.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property35 = dateTime31.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.withMinimumValue();
        int int7 = property3.get();
        int int8 = property3.getMaximumValue();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        int int18 = dateTime16.getDayOfMonth();
        long long19 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime20 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime22 = dateTime20.minusWeeks((int) (byte) 10);
        boolean boolean23 = dateTime20.isBeforeNow();
        long long24 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
        java.lang.String str25 = property3.getAsString();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.minus(readableDuration30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.DateTime.Property property33 = dateTime31.weekyear();
        org.joda.time.DateTime dateTime35 = property33.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMillis(12);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        boolean boolean39 = property3.equals((java.lang.Object) property38);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1439 + "'", int8 == 1439);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours(100);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        boolean boolean12 = dateTime9.isEqual(0L);
        org.joda.time.DateTime dateTime15 = dateTime9.withDurationAdded((long) 365, 2020);
        org.joda.time.DateTime dateTime17 = dateTime9.withWeekyear(0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) (byte) 0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfDay();
        java.lang.String str38 = property37.getAsText();
        org.joda.time.DateTime dateTime39 = property37.roundHalfEvenCopy();
        int int40 = property37.get();
        java.util.Locale locale41 = null;
        int int42 = property37.getMaximumTextLength(locale41);
        int int43 = property37.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property37.getFieldType();
        org.joda.time.DateTime dateTime46 = dateTime31.withField(dateTimeFieldType44, (int) (short) 1);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime49 = dateTime31.withDurationAdded(readableDuration47, (int) ' ');
        java.util.Locale locale50 = null;
        java.util.Calendar calendar51 = dateTime49.toCalendar(locale50);
        org.joda.time.DateTime dateTime53 = dateTime49.withMillis((long) 154);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(calendar51);
        org.junit.Assert.assertEquals(calendar51.toString(), "java.util.GregorianCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime53);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalTime localTime18 = dateTime15.toLocalTime();
        org.joda.time.DateTime dateTime19 = dateTime15.toDateTime();
        java.lang.String str20 = dateTime15.toString();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withDurationAdded(readableDuration27, 100);
        int int30 = dateTime24.getDayOfMonth();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.DateTime dateTime34 = dateTime33.toDateTimeISO();
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime24.toMutableDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 1971, chronology35);
        org.joda.time.DateTime dateTime39 = dateTime15.withChronology(chronology35);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(chronology35);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T02:37:48.254Z" + "'", str20, "2020-11-25T02:37:48.254Z");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.minus(readableDuration14);
        int int16 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        java.lang.String str21 = property20.getAsText();
        org.joda.time.DateTimeField dateTimeField22 = property20.getField();
        int int23 = dateTime12.get(dateTimeField22);
        org.joda.time.DateTime dateTime25 = dateTime12.plusHours(20);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime(chronology29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withDurationAdded(readableDuration31, 100);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withZone(dateTimeZone34);
        org.joda.time.DateTime.Property property36 = dateTime35.minuteOfDay();
        org.joda.time.DateTime dateTime38 = dateTime35.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate39 = dateTime38.toLocalDate();
        java.util.Date date40 = dateTime38.toDate();
        org.joda.time.DateTime.Property property41 = dateTime38.dayOfMonth();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.minuteOfDay();
        java.lang.Object obj46 = null;
        boolean boolean47 = property45.equals(obj46);
        org.joda.time.DateTimeField dateTimeField48 = property45.getField();
        org.joda.time.DurationField durationField49 = property45.getRangeDurationField();
        long long50 = property45.remainder();
        org.joda.time.DateTime dateTime51 = property45.roundHalfEvenCopy();
        int int52 = property45.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property45.getFieldType();
        boolean boolean54 = dateTime38.isSupported(dateTimeFieldType53);
        org.joda.time.DateTime dateTime56 = dateTime25.withField(dateTimeFieldType53, 37);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Mon Jan 05 04:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1439 + "'", int52 == 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTime56);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime.Property property7 = dateTime5.centuryOfEra();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        org.joda.time.DateTime dateTime11 = property7.addToCopy(4);
        java.lang.String str12 = property7.getName();
        org.joda.time.DateTime dateTime13 = property7.roundFloorCopy();
        int int14 = property7.get();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86340001L + "'", long6 == 86340001L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "centuryOfEra" + "'", str12, "centuryOfEra");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.minus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTime.Property property11 = dateTime2.centuryOfEra();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property11.getAsText(locale12);
        int int14 = property11.get();
        int int15 = property11.getLeapAmount();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19" + "'", str13, "19");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime1.minusHours(365);
        boolean boolean7 = dateTime5.isBefore((long) 0);
        java.lang.String str8 = dateTime5.toString();
        org.joda.time.DateTime dateTime10 = dateTime5.minusDays(7);
        int int11 = dateTime10.getYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-16T19:00:00.000Z" + "'", str8, "1969-12-16T19:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1969 + "'", int11 == 1969);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime4 = property3.getDateTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        java.lang.String str9 = property8.getAsText();
        org.joda.time.DateTime dateTime10 = property8.roundHalfEvenCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.DateTime dateTime16 = dateTime13.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime13.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime13.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        int int25 = dateTime23.getDayOfMonth();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime23.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = dateTime20.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) dateTime10, dateTimeZone30);
        org.joda.time.DateTime dateTime35 = dateTime4.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime38 = dateTime36.withWeekOfWeekyear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        int int10 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime12 = property8.setCopy((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime12.minusDays(0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.minus(readableDuration25);
        int int27 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime23.withPeriodAdded(readablePeriod28, 1439);
        org.joda.time.Chronology chronology31 = dateTime23.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) ' ', chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.DateTime dateTime36 = dateTime35.toDateTimeISO();
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        org.joda.time.DateTime dateTime38 = dateTime32.toDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime16.toMutableDateTime(chronology37);
        org.joda.time.DateTime.Property property40 = dateTime16.era();
        org.joda.time.DateTime dateTime42 = dateTime16.withCenturyOfEra(12);
        boolean boolean44 = dateTime16.isBefore((long) 7);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        int int18 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfSecond((int) '#');
        boolean boolean25 = dateTime11.equals((java.lang.Object) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime24.withDayOfYear(4);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 1, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfDay();
        java.lang.String str32 = property31.getAsText();
        org.joda.time.DateTime dateTime33 = property31.roundHalfEvenCopy();
        int int34 = property31.get();
        java.util.Locale locale35 = null;
        int int36 = property31.getMaximumTextLength(locale35);
        int int37 = property31.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property31.getFieldType();
        org.joda.time.DateTime.Property property39 = dateTime27.property(dateTimeFieldType38);
        boolean boolean40 = dateTime27.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = property3.setCopy((int) (byte) 10);
        org.joda.time.DateTime dateTime9 = property3.addWrapFieldToCopy((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTimeISO();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DateTime dateTime16 = property14.getDateTime();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.DateTime dateTime20 = dateTime19.toDateTimeISO();
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology21);
        org.joda.time.DateTime dateTime23 = dateTime16.withChronology(chronology21);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime9.toMutableDateTime(chronology21);
        java.util.Locale locale25 = null;
        java.util.Calendar calendar26 = mutableDateTime24.toCalendar(locale25);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=600001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=10,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMillis(12);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTimeISO();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime19);
        boolean boolean22 = dateTime5.isAfter((long) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime5.withPeriodAdded(readablePeriod23, 36);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime5.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DateTime dateTime11 = property9.roundHalfEvenCopy();
        int int12 = property9.get();
        java.util.Locale locale13 = null;
        int int14 = property9.getMaximumTextLength(locale13);
        int int15 = property9.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property9.getFieldType();
        org.joda.time.DateTime.Property property17 = dateTime2.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.minus(readableDuration25);
        int int27 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology28 = dateTime20.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime2.toDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime30 = dateTime29.toLocalDateTime();
        org.joda.time.DateTime dateTime32 = dateTime29.withMillis((-18591L));
        org.joda.time.DateTime dateTime34 = dateTime29.withDayOfYear(156);
        org.joda.time.DateTime dateTime36 = dateTime29.plusYears(330);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime10 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds((int) 'a');
        org.joda.time.DateTime.Property property13 = dateTime12.year();
        java.lang.String str14 = property13.getAsString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969" + "'", str14, "1969");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime.Property property7 = dateTime5.centuryOfEra();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        org.joda.time.DateTime dateTime11 = property7.addToCopy(4);
        java.lang.String str12 = property7.getName();
        org.joda.time.DateTime dateTime13 = property7.roundFloorCopy();
        org.joda.time.DateTime dateTime14 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86340001L + "'", long6 == 86340001L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "centuryOfEra" + "'", str12, "centuryOfEra");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        int int10 = property8.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTime.Property property3 = dateTime1.yearOfEra();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime15.toMutableDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime15.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        int int27 = dateTime25.getDayOfMonth();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.toDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime25.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        org.joda.time.DateTime dateTime33 = dateTime22.toDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(0L, dateTimeZone32);
        org.joda.time.DateTime dateTime36 = dateTime9.withZoneRetainFields(dateTimeZone32);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.toDateTime(chronology40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime44 = dateTime39.withDurationAdded(readableDuration42, 100);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withZone(dateTimeZone45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.plus(readableDuration47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 1, chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.minuteOfDay();
        java.lang.String str53 = property52.getAsText();
        org.joda.time.DateTime dateTime54 = property52.roundHalfEvenCopy();
        int int55 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime58.toMutableDateTime();
        int int60 = dateTime58.getDayOfMonth();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = dateTime58.toDateTime(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime58.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone65 = dateTime64.getZone();
        org.joda.time.DateTime dateTime66 = dateTime54.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime36.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime70 = dateTime36.plusMonths(9);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime(chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime4.withDurationAdded(readableDuration7, 100);
        org.joda.time.DateTime.Property property10 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.plus((long) (short) -1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime17.toMutableDateTime();
        org.joda.time.DateTime dateTime20 = dateTime17.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime17.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime17.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime27.toMutableDateTime();
        int int29 = dateTime27.getDayOfMonth();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.toDateTime(chronology30);
        org.joda.time.DateTime dateTime33 = dateTime27.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        org.joda.time.DateTime dateTime35 = dateTime24.toDateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(0L, dateTimeZone34);
        org.joda.time.DateTime dateTime38 = dateTime11.withZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTime dateTime39 = dateTime1.withZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTime.Property property40 = dateTime39.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readableDuration8);
        int int10 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime6.withPeriodAdded(readablePeriod11, 1439);
        org.joda.time.Chronology chronology14 = dateTime6.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) ' ', chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.year();
        org.joda.time.DateTime.Property property17 = dateTime15.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZone(dateTimeZone27);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        org.joda.time.DateTime dateTime31 = dateTime28.plusHours((int) (byte) 100);
        boolean boolean33 = dateTime31.isBefore(0L);
        org.joda.time.DateTime dateTime35 = dateTime31.withYearOfCentury(0);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime31.withPeriodAdded(readablePeriod36, 99);
        org.joda.time.DateTime dateTime40 = dateTime31.minusMillis(292278993);
        int int41 = property17.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        int int12 = property3.get();
        org.joda.time.DateTime dateTime13 = property3.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = property3.addToCopy(100);
        int int16 = dateTime15.getEra();
        org.joda.time.DateTime.Property property17 = dateTime15.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusSeconds(4);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime10 = property8.setCopy(366);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        int int10 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime12 = property8.setCopy((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime12.minusDays(0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.minus(readableDuration25);
        int int27 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime23.withPeriodAdded(readablePeriod28, 1439);
        org.joda.time.Chronology chronology31 = dateTime23.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) ' ', chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.DateTime dateTime36 = dateTime35.toDateTimeISO();
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        org.joda.time.DateTime dateTime38 = dateTime32.toDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime16.toMutableDateTime(chronology37);
        org.joda.time.DateTime.Property property40 = dateTime16.era();
        org.joda.time.DateTime dateTime42 = dateTime16.withCenturyOfEra(12);
        org.joda.time.DateTime.Property property43 = dateTime16.dayOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime5.era();
        int int9 = property8.getMinimumValueOverall();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTime.Property property18 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime19 = property18.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = property18.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime22 = dateTime20.minusSeconds((int) 'a');
        org.joda.time.DateTime.Property property23 = dateTime22.year();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.joda.time.DateTime dateTime29 = dateTime26.withMillisOfSecond((int) '#');
        long long30 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        int int31 = property8.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property32 = dateTime29.centuryOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTime2.toString("19", locale5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusWeeks(10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.getDateTime();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.minuteOfDay();
        java.lang.String str19 = property18.getAsText();
        org.joda.time.DateTime dateTime20 = property18.roundHalfEvenCopy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.DateTime dateTime26 = dateTime23.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime23.toMutableDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime23.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.toDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime33.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        org.joda.time.DateTime dateTime41 = dateTime30.toDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) dateTime20, dateTimeZone40);
        org.joda.time.DateTime dateTime45 = dateTime14.toDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) '#', dateTimeZone40);
        org.joda.time.DateTime dateTime48 = dateTime2.toDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19" + "'", str6, "19");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMillis((int) (short) -1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTime dateTime29 = dateTime22.plusMillis((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay30 = dateTime22.toTimeOfDay();
        boolean boolean31 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime22.minus(readableDuration32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = dateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.minus(readableDuration36);
        org.joda.time.DateTime dateTime39 = dateTime37.withMillisOfDay(48);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str35, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime15.toMutableDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime15.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        int int27 = dateTime25.getDayOfMonth();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.toDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime25.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        org.joda.time.DateTime dateTime33 = dateTime22.toDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(0L, dateTimeZone32);
        org.joda.time.DateTime dateTime36 = dateTime9.withZoneRetainFields(dateTimeZone32);
        boolean boolean38 = dateTime36.isBefore((long) 154);
        int int39 = dateTime36.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime14.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime14.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        int int26 = dateTime24.getDayOfMonth();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime24.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        org.joda.time.DateTime dateTime32 = dateTime21.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(0L, dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime7.withZoneRetainFields(dateTimeZone31);
        int int36 = dateTime35.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMillis(1439);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(100);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime dateTime13 = dateTime12.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology14 = dateTime12.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime7.withChronology(chronology14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime7.withDurationAdded(readableDuration18, (-18595));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime6.withYearOfEra(154);
        int int10 = dateTime9.getSecondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours(0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime24.plusMillis(1970);
        org.joda.time.DateTime.Property property29 = dateTime28.monthOfYear();
        org.joda.time.DateTime.Property property30 = dateTime28.dayOfYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.DateTime dateTime36 = dateTime33.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime33.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime43.toMutableDateTime();
        int int45 = dateTime43.getDayOfMonth();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = dateTime43.toDateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime43.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime49.getZone();
        org.joda.time.DateTime dateTime51 = dateTime40.toDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime28.toMutableDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime55 = dateTime21.withZone(dateTimeZone50);
        org.joda.time.DateTime.Property property56 = dateTime55.yearOfEra();
        org.joda.time.DateTime.Property property57 = dateTime55.year();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property57);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        int int29 = dateTime11.getMillisOfDay();
        org.joda.time.DateTime.Property property30 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime32 = dateTime11.minusDays(54);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime11.year();
        org.joda.time.DateTime dateTime16 = dateTime11.withSecondOfMinute((int) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        org.joda.time.DateTime dateTime22 = dateTime19.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime19.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime19.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime28 = dateTime19.plusMonths((int) (short) 0);
        org.joda.time.DateTime.Property property29 = dateTime28.year();
        org.joda.time.DateTime dateTime31 = dateTime28.plusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime11.toMutableDateTime(chronology32);
        boolean boolean35 = dateTime11.isEqual((long) 59);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime10 = property7.getDateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.DateTime dateTime13 = dateTime10.minusWeeks(34);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfSecond(48);
        org.joda.time.ReadableInstant readableInstant16 = null;
        boolean boolean17 = dateTime15.isEqual(readableInstant16);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime5.plusMonths((int) ' ');
        int int9 = dateTime8.getMonthOfYear();
        org.joda.time.DateTime.Property property10 = dateTime8.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.minus(readablePeriod11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks((-292275054));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86340001L + "'", long6 == 86340001L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        java.lang.String str6 = dateTime5.toString();
        int int7 = dateTime5.getMonthOfYear();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTime5.toString("806", locale9);
        org.joda.time.DateTime.Property property11 = dateTime5.era();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.035Z" + "'", str6, "1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "806" + "'", str10, "806");
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime12.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime12.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        int int24 = dateTime22.getDayOfMonth();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime22.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        org.joda.time.DateTime dateTime30 = dateTime19.toDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime34 = dateTime32.minusYears(1);
        org.joda.time.LocalDateTime localDateTime35 = dateTime32.toLocalDateTime();
        org.joda.time.DateTime dateTime36 = dateTime9.withFields((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTime.Property property37 = dateTime36.weekOfWeekyear();
        org.joda.time.DateTime dateTime38 = property37.withMinimumValue();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        int int13 = dateTime11.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = dateTime18.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime5.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTime dateTime22 = dateTime5.plusYears(14400);
        org.joda.time.DateTime.Property property23 = dateTime22.era();
        org.joda.time.ReadableInstant readableInstant24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = property23.compareTo(readableInstant24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime4 = property3.roundCeilingCopy();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime5.withTime(4319, 54, (int) (short) 1, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4319 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime11 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime13 = dateTime11.minusSeconds(43);
        boolean boolean14 = dateTime11.isEqualNow();
        java.util.GregorianCalendar gregorianCalendar15 = dateTime11.toGregorianCalendar();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar15);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.minus(readableDuration14);
        int int16 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        java.lang.String str21 = property20.getAsText();
        org.joda.time.DateTimeField dateTimeField22 = property20.getField();
        int int23 = dateTime12.get(dateTimeField22);
        org.joda.time.DateTime dateTime25 = dateTime12.plusHours(20);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfHour();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.minuteOfDay();
        java.lang.String str31 = property30.getAsText();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime34.toMutableDateTime();
        int int36 = dateTime34.getDayOfMonth();
        long long37 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime38 = property30.withMinimumValue();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 1, chronology40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.toDateTime(chronology42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime46 = dateTime41.withDurationAdded(readableDuration44, 100);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.withZone(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime49 = dateTime48.toLocalDateTime();
        org.joda.time.DateTime dateTime50 = dateTime38.withFields((org.joda.time.ReadablePartial) localDateTime49);
        int int51 = dateTime38.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime53 = dateTime38.withYear(4);
        int int54 = dateTime38.getYear();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 1, chronology56);
        org.joda.time.DateTime.Property property58 = dateTime57.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime60 = dateTime57.minus(readableDuration59);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime60.toMutableDateTime();
        org.joda.time.DateTime.Property property62 = dateTime60.weekyear();
        org.joda.time.DateTimeField dateTimeField63 = property62.getField();
        int int64 = dateTime38.get(dateTimeField63);
        int int65 = dateTime25.get(dateTimeField63);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0" + "'", str31, "0");
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1970 + "'", int54 == 1970);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1970 + "'", int64 == 1970);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1970 + "'", int65 == 1970);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime1.minusWeeks((int) ' ');
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        int int7 = property6.get();
        org.joda.time.DateTime dateTime9 = property6.addToCopy(35L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withEra(1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfSecond();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.DateTime dateTime12 = property10.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2" + "'", str11, "2");
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        int int18 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean19 = dateTime17.isEqualNow();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.minus(readableDuration24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime27 = dateTime25.toLocalDateTime();
        org.joda.time.DateTime dateTime28 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.toDateTime(chronology32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withDurationAdded(readableDuration34, 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withZone(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime39 = dateTime38.toLocalDateTime();
        org.joda.time.DateTime dateTime40 = dateTime25.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.DateTime dateTime41 = dateTime17.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.DateTime dateTime43 = dateTime41.plusSeconds((int) (byte) 10);
        java.lang.String str44 = dateTime43.toString();
        org.joda.time.DateTime dateTime46 = dateTime43.plusSeconds(365);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01T00:00:10.001Z" + "'", str44, "1970-01-01T00:00:10.001Z");
        org.junit.Assert.assertNotNull(dateTime46);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes((int) (byte) -1);
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime10 = dateTime2.withLaterOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withHourOfDay(157);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 157 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        java.lang.String str14 = property13.getAsText();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime17.toMutableDateTime();
        int int19 = dateTime17.getDayOfMonth();
        long long20 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int) (byte) 10);
        long long24 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.plusMillis(20);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readablePeriod27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.toDateTime(chronology32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withDurationAdded(readableDuration34, 100);
        org.joda.time.DateTime.Property property37 = dateTime36.dayOfYear();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 1, chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime40.minus(readableDuration42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((java.lang.Object) readableDuration42);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfSecond();
        long long46 = property37.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime48 = dateTime44.minusMillis((int) (short) -1);
        org.joda.time.DateTime dateTime49 = dateTime44.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime51 = dateTime44.minusMillis((int) (short) -1);
        org.joda.time.DateTime.Property property52 = dateTime44.minuteOfHour();
        org.joda.time.DateTime dateTime54 = dateTime44.withMillis(454420108800001L);
        org.joda.time.DateTime dateTime56 = dateTime54.plusMillis(1970);
        int int57 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime56);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-18591L) + "'", long46 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime35 = dateTime31.minusMillis(12);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime31.toMutableDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime dateTime8 = dateTime2.withMillisOfDay(99);
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours((int) (short) -1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.minus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Chronology chronology10 = dateTime2.getChronology();
        org.joda.time.DateTime.Property property11 = dateTime2.centuryOfEra();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property11.getAsText(locale12);
        int int14 = property11.get();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(chronology18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded(readableDuration20, 100);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withZone(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime25 = dateTime24.toLocalDateTime();
        org.joda.time.DateTime dateTime27 = dateTime24.withYear((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime24.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime31 = dateTime24.plusMillis((int) ' ');
        int int32 = property11.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19" + "'", str13, "19");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.toDateTime(chronology9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.withDurationAdded(readableDuration11, 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withZone(dateTimeZone14);
        java.util.GregorianCalendar gregorianCalendar16 = dateTime15.toGregorianCalendar();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(chronology20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.withDurationAdded(readableDuration22, 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withZone(dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.plus(readableDuration27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.minuteOfDay();
        java.lang.String str33 = property32.getAsText();
        org.joda.time.DateTime dateTime34 = property32.roundHalfEvenCopy();
        int int35 = dateTime28.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 1, chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime38.toMutableDateTime();
        org.joda.time.DateTime dateTime41 = dateTime38.withMillisOfSecond((int) '#');
        boolean boolean42 = dateTime28.equals((java.lang.Object) dateTime41);
        org.joda.time.DateTime dateTime44 = dateTime41.withDayOfYear(4);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, chronology46);
        org.joda.time.DateTime.Property property48 = dateTime47.minuteOfDay();
        java.lang.String str49 = property48.getAsText();
        org.joda.time.DateTime dateTime50 = property48.roundHalfEvenCopy();
        int int51 = property48.get();
        java.util.Locale locale52 = null;
        int int53 = property48.getMaximumTextLength(locale52);
        int int54 = property48.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property48.getFieldType();
        org.joda.time.DateTime.Property property56 = dateTime44.property(dateTimeFieldType55);
        org.joda.time.DateTime dateTime58 = dateTime15.withField(dateTimeFieldType55, 1439);
        org.joda.time.Chronology chronology59 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(4319, 34, (-1), (int) ' ', (int) (byte) 1, 54, chronology59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0" + "'", str49, "0");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime13 = dateTime10.minusYears(59);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.minus(readablePeriod16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime(chronology21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime20.withDurationAdded(readableDuration23, 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withZone(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfDay();
        org.joda.time.DateTime dateTime30 = dateTime27.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate31 = dateTime30.toLocalDate();
        java.util.Date date32 = dateTime30.toDate();
        org.joda.time.DateTime.Property property33 = dateTime30.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.withZoneRetainFields(dateTimeZone34);
        boolean boolean36 = dateTime17.equals((java.lang.Object) dateTimeZone34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime41 = dateTime17.withTime((int) (byte) 10, 86399999, 48, 18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Mon Jan 05 04:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime4 = property3.roundCeilingCopy();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((long) 9);
        org.joda.time.DateTime dateTime7 = property3.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        int int18 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        int int23 = dateTime21.getDayOfMonth();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime21.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime27.getZone();
        org.joda.time.DateTime dateTime29 = dateTime17.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime29.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.minus(readablePeriod31);
        int int33 = dateTime29.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(70);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfYear(365);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime15);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime.Property property18 = dateTime16.millisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfYear(365);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.millisOfSecond();
        java.lang.String str18 = property17.getAsShortText();
        org.joda.time.DateTime dateTime19 = property17.withMinimumValue();
        java.util.Locale locale20 = null;
        int int21 = property17.getMaximumShortTextLength(locale20);
        org.joda.time.DateTime dateTime22 = property17.getDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 100);
        org.joda.time.DateTime dateTime19 = dateTime16.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.DateTime dateTime26 = dateTime23.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime23.toMutableDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime23.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.toDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime33.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        org.joda.time.DateTime dateTime41 = dateTime30.toDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(0L, dateTimeZone40);
        org.joda.time.DateTime dateTime44 = dateTime16.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime45 = dateTime8.toDateTime(dateTimeZone40);
        int int46 = dateTime45.getMillisOfDay();
        org.joda.time.DateTime dateTime48 = dateTime45.withWeekyear(36);
        java.util.Locale locale49 = null;
        java.util.Calendar calendar50 = dateTime48.toCalendar(locale49);
        org.joda.time.DateTime.Property property51 = dateTime48.centuryOfEra();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (byte) 1, chronology53);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime54.toMutableDateTime();
        org.joda.time.DateTime dateTime57 = dateTime54.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime54.toMutableDateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime61 = dateTime54.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 1, chronology63);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime64.toMutableDateTime();
        int int66 = dateTime64.getDayOfMonth();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTime dateTime68 = dateTime64.toDateTime(chronology67);
        org.joda.time.DateTime dateTime70 = dateTime64.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone71 = dateTime70.getZone();
        org.joda.time.DateTime dateTime72 = dateTime61.toDateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime76 = dateTime48.toMutableDateTime(dateTimeZone71);
        org.joda.time.DateTime.Property property77 = dateTime48.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1971 + "'", int46 == 1971);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(calendar50);
        org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=-61002115198029,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=36,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=339,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=1,MILLISECOND=971,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertNotNull(property77);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(100);
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = property11.setCopy((int) (byte) 1);
        org.joda.time.DateTime dateTime14 = property11.roundCeilingCopy();
        org.joda.time.DateTime dateTime15 = property11.roundFloorCopy();
        org.joda.time.DurationField durationField16 = property11.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNull(durationField16);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        java.util.Date date7 = mutableDateTime6.toDate();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime28.plus(86340001L);
        org.joda.time.DateTime dateTime32 = dateTime28.minus(0L);
        org.joda.time.DateTime dateTime34 = dateTime28.minusMillis(99);
        org.joda.time.DateTime.Property property35 = dateTime28.secondOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
    }
}
