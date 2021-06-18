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
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(20);
        org.joda.time.DateTime dateTime13 = dateTime9.plusWeeks(70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime9.withEra(1440);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1440 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime11 = dateTime2.plusMonths((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.Chronology chronology13 = dateTime11.getChronology();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.minus(readablePeriod14);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTime();
        java.util.Date date17 = dateTime16.toDate();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.DateTime dateTime23 = dateTime22.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology24 = dateTime22.getChronology();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((java.lang.Object) dateTime15, chronology24);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime11 = dateTime2.plusMonths((int) (short) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTime.Property property20 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime21 = property20.roundFloorCopy();
        org.joda.time.DateTime dateTime23 = dateTime21.plus((long) (short) -1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime27.toMutableDateTime();
        org.joda.time.DateTime dateTime30 = dateTime27.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime27.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime37.toMutableDateTime();
        int int39 = dateTime37.getDayOfMonth();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.toDateTime(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime37.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime43.getZone();
        org.joda.time.DateTime dateTime45 = dateTime34.toDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(0L, dateTimeZone44);
        org.joda.time.DateTime dateTime48 = dateTime21.withZoneRetainFields(dateTimeZone44);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 1, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.toDateTime(chronology52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime56 = dateTime51.withDurationAdded(readableDuration54, 100);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.withZone(dateTimeZone57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime60 = dateTime56.plus(readableDuration59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (byte) 1, chronology62);
        org.joda.time.DateTime.Property property64 = dateTime63.minuteOfDay();
        java.lang.String str65 = property64.getAsText();
        org.joda.time.DateTime dateTime66 = property64.roundHalfEvenCopy();
        int int67 = dateTime60.compareTo((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (byte) 1, chronology69);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime70.toMutableDateTime();
        int int72 = dateTime70.getDayOfMonth();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = dateTime70.toDateTime(chronology73);
        org.joda.time.DateTime dateTime76 = dateTime70.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime76.getZone();
        org.joda.time.DateTime dateTime78 = dateTime66.toDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime48.toDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime81 = dateTime2.withZoneRetainFields(dateTimeZone77);
        org.joda.time.DateTime.Property property82 = dateTime2.monthOfYear();
        org.joda.time.DateTime dateTime84 = dateTime2.plus((long) (short) 1);
        org.joda.time.DateTime dateTime86 = dateTime84.minusMinutes(440);
        java.lang.String str87 = dateTime84.toString();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "1970-01-01T00:00:00.002Z" + "'", str87, "1970-01-01T00:00:00.002Z");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        long long16 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime17 = property9.withMinimumValue();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime(chronology21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime20.withDurationAdded(readableDuration23, 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withZone(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = dateTime27.toLocalDateTime();
        org.joda.time.DateTime dateTime29 = dateTime17.withFields((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime dateTime35 = dateTime32.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime32.toMutableDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime32.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (byte) 1, chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime42.toMutableDateTime();
        int int44 = dateTime42.getDayOfMonth();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = dateTime42.toDateTime(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime42.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime48.getZone();
        org.joda.time.DateTime dateTime50 = dateTime39.toDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = dateTime29.withZone(dateTimeZone49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(2, 0, 19, 0, (int) (byte) 1, 7, dateTimeZone49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime10 = dateTime9.toLocalDateTime();
        org.joda.time.DateTime dateTime12 = dateTime9.withYear((int) '#');
        org.joda.time.DateTime dateTime14 = dateTime9.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears(984);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("0");
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (short) 10);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime9 = dateTime6.plusSeconds((int) (byte) 100);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        org.joda.time.DateTime.Property property26 = dateTime11.weekOfWeekyear();
        java.util.Locale locale27 = null;
        int int28 = property26.getMaximumShortTextLength(locale27);
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
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTimeISO();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withPeriodAdded(readablePeriod5, 971);
        boolean boolean8 = dateTime7.isBeforeNow();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = property3.setCopy((int) (byte) 10);
        java.lang.String str8 = property3.getAsShortText();
        boolean boolean9 = property3.isLeap();
        org.joda.time.DateTime dateTime10 = property3.withMinimumValue();
        int int11 = dateTime10.getHourOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        org.joda.time.DateTime dateTime21 = dateTime19.minusHours(100);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfWeek();
        boolean boolean23 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime.Property property24 = dateTime21.centuryOfEra();
        org.joda.time.DateTime.Property property25 = dateTime21.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime21.withDayOfYear(9379630);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9379630 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = property7.setCopy((-18595));
        org.joda.time.DateTime dateTime12 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime14 = dateTime11.withCenturyOfEra(0);
        int int15 = dateTime14.getMinuteOfHour();
        int int16 = dateTime14.getMonthOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        org.joda.time.DateTime dateTime32 = dateTime11.minusMinutes(1971);
        org.joda.time.DateTime.Property property33 = dateTime11.monthOfYear();
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
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        long long24 = dateTime11.getMillis();
        org.joda.time.DateTime dateTime26 = dateTime11.withDayOfYear((int) 'a');
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.minus(readableDuration31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) readableDuration31);
        org.joda.time.DateTime dateTime35 = dateTime33.plusWeeks(0);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 1, chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime38.toMutableDateTime();
        org.joda.time.DateTime dateTime41 = dateTime38.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.minuteOfDay();
        java.lang.String str46 = property45.getAsText();
        org.joda.time.DateTime dateTime47 = property45.roundHalfEvenCopy();
        int int48 = property45.get();
        java.util.Locale locale49 = null;
        int int50 = property45.getMaximumTextLength(locale49);
        int int51 = property45.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property45.getFieldType();
        org.joda.time.DateTime.Property property53 = dateTime38.property(dateTimeFieldType52);
        int int54 = dateTime35.get(dateTimeFieldType52);
        org.joda.time.DateTime dateTime56 = dateTime35.withWeekyear(70);
        int int57 = dateTime35.getMonthOfYear();
        boolean boolean58 = dateTime35.isEqualNow();
        org.joda.time.DateTime dateTime60 = dateTime35.plus((long) '#');
        boolean boolean61 = dateTime11.isBefore((org.joda.time.ReadableInstant) dateTime60);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0" + "'", str46, "0");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertNotNull(property53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 157 + "'", int54 == 157);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 11 + "'", int57 == 11);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTime dateTime6 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTime.Property property8 = dateTime6.year();
        org.joda.time.DateTime dateTime10 = property8.setCopy(59);
        org.joda.time.DateTime dateTime12 = property8.addWrapFieldToCopy(5);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.minus(readableDuration20);
        int int22 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime18.withPeriodAdded(readablePeriod23, 1439);
        org.joda.time.Chronology chronology26 = dateTime18.getChronology();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.minus(readableDuration31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime.Property property34 = dateTime32.weekyear();
        org.joda.time.DateTime dateTime36 = property34.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.minuteOfDay();
        java.lang.String str41 = property40.getAsText();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime44.toMutableDateTime();
        int int46 = dateTime44.getDayOfMonth();
        long long47 = property40.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime48 = property40.withMinimumValue();
        org.joda.time.DateTime dateTime50 = dateTime48.minusWeeks((int) (byte) 10);
        long long51 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime.Property property52 = dateTime50.centuryOfEra();
        int int53 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 1, chronology55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.toDateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime56.plusMillis(1970);
        org.joda.time.TimeOfDay timeOfDay61 = dateTime56.toTimeOfDay();
        org.joda.time.DateTime dateTime62 = dateTime50.withFields((org.joda.time.ReadablePartial) timeOfDay61);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = property8.compareTo((org.joda.time.ReadablePartial) timeOfDay61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0" + "'", str41, "0");
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        org.joda.time.DateTime dateTime34 = dateTime11.withLaterOffsetAtOverlap();
        boolean boolean35 = dateTime34.isEqualNow();
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
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours(100);
        org.joda.time.DateTime dateTime11 = dateTime7.minusWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) (byte) 100, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        java.lang.String str9 = property7.getAsString();
        org.joda.time.DateTime dateTime10 = property7.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        java.util.GregorianCalendar gregorianCalendar10 = dateTime9.toGregorianCalendar();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded(readableDuration16, 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withZone(dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfDay();
        java.lang.String str27 = property26.getAsText();
        org.joda.time.DateTime dateTime28 = property26.roundHalfEvenCopy();
        int int29 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime dateTime35 = dateTime32.withMillisOfSecond((int) '#');
        boolean boolean36 = dateTime22.equals((java.lang.Object) dateTime35);
        org.joda.time.DateTime dateTime38 = dateTime35.withDayOfYear(4);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 1, chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfDay();
        java.lang.String str43 = property42.getAsText();
        org.joda.time.DateTime dateTime44 = property42.roundHalfEvenCopy();
        int int45 = property42.get();
        java.util.Locale locale46 = null;
        int int47 = property42.getMaximumTextLength(locale46);
        int int48 = property42.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property42.getFieldType();
        org.joda.time.DateTime.Property property50 = dateTime38.property(dateTimeFieldType49);
        org.joda.time.DateTime dateTime52 = dateTime9.withField(dateTimeFieldType49, 1439);
        org.joda.time.Chronology chronology53 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0" + "'", str43, "0");
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        int int9 = property3.get();
        org.joda.time.DateTime dateTime10 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime13.withYearOfEra(1);
        org.joda.time.DateTime dateTime20 = dateTime13.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime22 = dateTime20.minusYears(4);
        org.joda.time.DateTime dateTime24 = dateTime20.withDayOfWeek(1);
        int int25 = property3.getDifference((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = property3.setCopy("758");
        int int28 = dateTime27.getDayOfMonth();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4319 + "'", int25 == 4319);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime2.withSecondOfMinute((int) (short) 1);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime.Property property16 = dateTime14.weekyear();
        org.joda.time.DateTime dateTime18 = property16.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.minus(readableDuration23);
        int int25 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        java.lang.String str30 = property29.getAsText();
        org.joda.time.DateTimeField dateTimeField31 = property29.getField();
        int int32 = dateTime21.get(dateTimeField31);
        int int33 = dateTime2.get(dateTimeField31);
        java.util.GregorianCalendar gregorianCalendar34 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime.Property property35 = dateTime2.weekyear();
        java.util.Locale locale36 = null;
        java.util.Calendar calendar37 = dateTime2.toCalendar(locale36);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(gregorianCalendar34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(calendar37);
        org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plus((-18591L));
        boolean boolean12 = dateTime9.isAfterNow();
        org.joda.time.DateTime.Property property13 = dateTime9.millisOfSecond();
        org.joda.time.DateTime dateTime15 = dateTime9.plusMinutes(2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime dateTime8 = dateTime2.withMillisOfDay(99);
        org.joda.time.DateTime dateTime9 = dateTime2.withEarlierOffsetAtOverlap();
        int int10 = dateTime2.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        org.joda.time.DateTime dateTime19 = dateTime15.minusMonths((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        int int14 = dateTime12.getMinuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime12.minusYears(3);
        org.joda.time.DateTime.Property property17 = dateTime12.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        org.joda.time.DurationField durationField15 = property14.getDurationField();
        org.joda.time.DateTime dateTime16 = property14.getDateTime();
        boolean boolean17 = dateTime16.isBeforeNow();
        boolean boolean18 = dateTime16.isAfterNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readableDuration9);
        int int11 = dateTime10.getMillisOfSecond();
        org.joda.time.DateTime dateTime12 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfEra();
        org.joda.time.DateTime dateTime15 = dateTime12.minusMonths(1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withPeriodAdded(readablePeriod4, 984);
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.DateTime dateTime8 = dateTime5.minusDays(10);
        org.joda.time.DateTime dateTime10 = dateTime8.withDayOfYear(34);
        org.joda.time.DateTime.Property property11 = dateTime10.secondOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.035Z" + "'", str6, "1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        org.joda.time.DateTime dateTime32 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.plus(readablePeriod34);
        org.joda.time.DateTime dateTime37 = dateTime32.plusMonths(59);
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
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
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
        java.lang.String str8 = property3.getAsShortText();
        boolean boolean9 = property3.isLeap();
        org.joda.time.DateTime dateTime10 = property3.withMinimumValue();
        int int11 = dateTime10.getMinuteOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.plusDays((int) (byte) -1);
        boolean boolean15 = dateTime10.isEqual(0L);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime10.getZone();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.minus(readableDuration21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) readableDuration21);
        org.joda.time.DateTime dateTime25 = dateTime23.plusWeeks(0);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTime();
        org.joda.time.DateTime dateTime31 = dateTime28.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.minuteOfDay();
        java.lang.String str36 = property35.getAsText();
        org.joda.time.DateTime dateTime37 = property35.roundHalfEvenCopy();
        int int38 = property35.get();
        java.util.Locale locale39 = null;
        int int40 = property35.getMaximumTextLength(locale39);
        int int41 = property35.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property35.getFieldType();
        org.joda.time.DateTime.Property property43 = dateTime28.property(dateTimeFieldType42);
        int int44 = dateTime25.get(dateTimeFieldType42);
        org.joda.time.DateTime dateTime46 = dateTime25.withWeekyear(70);
        boolean boolean47 = dateTime10.equals((java.lang.Object) dateTime46);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 157 + "'", int44 == 157);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTime dateTime20 = dateTime17.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime21 = dateTime17.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime17.minus(readableDuration22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.DateTime dateTime27 = dateTime26.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology28 = dateTime26.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime17.toDateTime(chronology28);
        org.joda.time.DateTime dateTime30 = dateTime8.withChronology(chronology28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(31348800001L, chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(1970, 4, 4319, 570, (int) (short) 0, chronology28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 570 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime3.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime12 = dateTime3.plusMonths((int) (short) 0);
        org.joda.time.DateTime.Property property13 = dateTime12.year();
        org.joda.time.DateTime dateTime15 = dateTime12.plusMinutes((int) (byte) 0);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 1200, chronology16);
        int int18 = dateTime17.getYearOfCentury();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 70 + "'", int18 == 70);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = property3.setCopy((int) (byte) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekyear(1439);
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(1970);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(7, 0, 2040, 6, 1966, 62, 984, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1966 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        int int8 = property7.getMaximumValue();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumShortTextLength(locale9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.DateTime dateTime16 = dateTime13.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime13.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = dateTime13.toDateTimeISO();
        org.joda.time.DateTime dateTime21 = dateTime19.withMillis((long) (-1));
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withDurationAdded(readableDuration27, 100);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfYear();
        org.joda.time.DateTime dateTime32 = property30.addWrapFieldToCopy(100);
        int int33 = dateTime32.getMillisOfSecond();
        java.util.Date date34 = dateTime32.toDate();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTime(chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withDurationAdded(readableDuration40, 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.withZone(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime45 = dateTime42.toLocalDateTime();
        org.joda.time.DateTime dateTime46 = dateTime32.withFields((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.DateTime dateTime47 = dateTime19.withFields((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.DateTime dateTime49 = dateTime19.withMillisOfSecond(20);
        int int50 = property7.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeField dateTimeField51 = property7.getField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Apr 11 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(dateTimeField51);
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
        int int8 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime2.toMutableDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(chronology13);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        java.lang.String str22 = property21.getAsText();
        org.joda.time.DateTime dateTime23 = property21.roundHalfEvenCopy();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        java.lang.String str28 = property27.getAsText();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        int int33 = dateTime31.getDayOfMonth();
        long long34 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        int int35 = property27.get();
        org.joda.time.Interval interval36 = property27.toInterval();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.toDateTime(chronology40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime44 = dateTime39.withDurationAdded(readableDuration42, 100);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withZone(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime47 = dateTime44.toLocalDateTime();
        int int48 = property27.compareTo((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.DateTime dateTime49 = dateTime23.withFields((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.DateTime dateTime50 = dateTime23.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology51 = dateTime50.getChronology();
        org.joda.time.DateTime dateTime53 = dateTime50.minus((long) 2040);
        boolean boolean54 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        int int9 = dateTime8.getEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.minus(readableDuration19);
        int int21 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime17.withPeriodAdded(readablePeriod22, 1439);
        org.joda.time.Chronology chronology25 = dateTime17.getChronology();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) ' ', chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.DateTime dateTime30 = dateTime29.toDateTimeISO();
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime26.toDateTime(chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime35.toMutableDateTime();
        org.joda.time.DateTime dateTime38 = dateTime35.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime35.toMutableDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime35.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 1, chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime45.toMutableDateTime();
        int int47 = dateTime45.getDayOfMonth();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateTime45.toDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime45.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTime51.getZone();
        org.joda.time.DateTime dateTime53 = dateTime42.toDateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime32.toDateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(86340001L, dateTimeZone52);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime8.toMutableDateTime(dateTimeZone52);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        int int11 = dateTime9.getDayOfMonth();
        org.joda.time.DateTime dateTime13 = dateTime9.withYearOfEra(1);
        org.joda.time.DateTime.Property property14 = dateTime13.monthOfYear();
        int int15 = dateTime13.getYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        org.joda.time.DateTime dateTime21 = dateTime18.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime18.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime18.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTime();
        int int30 = dateTime28.getDayOfMonth();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime28.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime34.getZone();
        org.joda.time.DateTime dateTime36 = dateTime25.toDateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime13.toMutableDateTime(dateTimeZone35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((int) (byte) 100, 1200, 971, 31, 9343817, 440, 70, dateTimeZone35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, 815, 48, 9397966, 154, 790);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9397966 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime2.withSecondOfMinute((int) (short) 1);
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = dateTime2.toCalendar(locale9);
        java.util.Date date11 = dateTime2.toDate();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        java.lang.String str21 = property20.getAsText();
        org.joda.time.DateTime dateTime22 = property20.roundHalfEvenCopy();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.joda.time.DateTime dateTime28 = dateTime25.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime25.toMutableDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime25.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime35.toMutableDateTime();
        int int37 = dateTime35.getDayOfMonth();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime35.toDateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime35.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime41.getZone();
        org.joda.time.DateTime dateTime43 = dateTime32.toDateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((java.lang.Object) dateTime22, dateTimeZone42);
        org.joda.time.DateTime dateTime47 = dateTime16.toDateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) dateTime2, dateTimeZone42);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((-18591L));
        boolean boolean51 = dateTime48.equals((java.lang.Object) (-18591L));
        org.joda.time.DateTime.Property property52 = dateTime48.dayOfMonth();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(property52);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMillis((int) (short) 1);
        org.joda.time.DateTime dateTime13 = dateTime9.withWeekyear(0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        int int69 = dateTime36.getMillisOfDay();
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.DateTime dateTime72 = dateTime36.withPeriodAdded(readablePeriod70, 34);
        org.joda.time.DateTime dateTime74 = dateTime72.withYear(5);
        org.joda.time.DateTime dateTime76 = dateTime74.withMillis((long) 4);
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        org.joda.time.DateTime dateTime30 = dateTime11.plus(readablePeriod29);
        org.joda.time.DateTime.Property property31 = dateTime30.weekOfWeekyear();
        int int32 = property31.getMinimumValue();
        java.util.Locale locale33 = null;
        java.lang.String str34 = property31.getAsText(locale33);
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
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1" + "'", str34, "1");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Interval interval11 = property3.toInterval();
        org.joda.time.DateTime dateTime12 = property3.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.DurationField durationField7 = property3.getRangeDurationField();
        org.joda.time.DateTime dateTime8 = property3.getDateTime();
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
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.toDateTime(chronology24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withDurationAdded(readableDuration26, 100);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withZone(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = dateTime30.toLocalDateTime();
        org.joda.time.DateTime dateTime32 = dateTime20.withFields((org.joda.time.ReadablePartial) localDateTime31);
        int int33 = dateTime20.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime35 = dateTime20.withYear(4);
        org.joda.time.DateTime dateTime37 = dateTime20.withMillis((long) (byte) 10);
        long long38 = dateTime37.getMillis();
        int int39 = dateTime37.getYear();
        org.joda.time.DateTime dateTime41 = dateTime37.withSecondOfMinute(0);
        int int42 = property3.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime44 = dateTime41.withMillis(619200001L);
        org.joda.time.DateTime dateTime46 = dateTime41.minusMinutes(2020);
        org.joda.time.DateTime.Property property47 = dateTime46.weekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
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
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime33 = dateTime15.minus(readablePeriod32);
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
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.DurationField durationField7 = property3.getRangeDurationField();
        org.joda.time.DateTime dateTime8 = property3.getDateTime();
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
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.toDateTime(chronology24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withDurationAdded(readableDuration26, 100);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withZone(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = dateTime30.toLocalDateTime();
        org.joda.time.DateTime dateTime32 = dateTime20.withFields((org.joda.time.ReadablePartial) localDateTime31);
        int int33 = dateTime20.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime35 = dateTime20.withYear(4);
        org.joda.time.DateTime dateTime37 = dateTime20.withMillis((long) (byte) 10);
        long long38 = dateTime37.getMillis();
        int int39 = dateTime37.getYear();
        org.joda.time.DateTime dateTime41 = dateTime37.withSecondOfMinute(0);
        int int42 = property3.compareTo((org.joda.time.ReadableInstant) dateTime41);
        int int43 = property3.getLeapAmount();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        int int14 = dateTime13.getYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1969 + "'", int14 == 1969);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTime dateTime6 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTime.Property property8 = dateTime6.year();
        org.joda.time.DateTime dateTime10 = property8.setCopy(59);
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(7);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfDay();
        java.lang.String str17 = property16.getAsText();
        org.joda.time.DateTime dateTime18 = property16.roundHalfEvenCopy();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        java.lang.String str23 = property22.getAsText();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        int int28 = dateTime26.getDayOfMonth();
        long long29 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        int int30 = property22.get();
        org.joda.time.Interval interval31 = property22.toInterval();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(chronology35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime39 = dateTime34.withDurationAdded(readableDuration37, 100);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.withZone(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = dateTime39.toLocalDateTime();
        int int43 = property22.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.DateTime dateTime44 = dateTime18.withFields((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.toDateTime(chronology48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime52 = dateTime47.withDurationAdded(readableDuration50, 100);
        org.joda.time.DateTime.Property property53 = dateTime47.yearOfCentury();
        org.joda.time.DateTime dateTime54 = property53.roundFloorCopy();
        org.joda.time.DateTime dateTime56 = dateTime54.plus((long) (short) -1);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 1, chronology59);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime60.toMutableDateTime();
        org.joda.time.DateTime dateTime63 = dateTime60.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime60.toMutableDateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime67 = dateTime60.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (byte) 1, chronology69);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime70.toMutableDateTime();
        int int72 = dateTime70.getDayOfMonth();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = dateTime70.toDateTime(chronology73);
        org.joda.time.DateTime dateTime76 = dateTime70.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime76.getZone();
        org.joda.time.DateTime dateTime78 = dateTime67.toDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(0L, dateTimeZone77);
        org.joda.time.DateTime dateTime81 = dateTime54.withZoneRetainFields(dateTimeZone77);
        org.joda.time.DateTime dateTime82 = dateTime18.withZoneRetainFields(dateTimeZone77);
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime84 = dateTime12.withZone(dateTimeZone77);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime86 = dateTime84.withWeekOfWeekyear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime84);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = property3.setCopy((int) (byte) 10);
        java.lang.String str8 = property3.getAsShortText();
        boolean boolean9 = property3.isLeap();
        int int10 = property3.getMaximumValueOverall();
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        java.lang.Class<?> wildcardClass12 = dateTime11.getClass();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1439 + "'", int10 == 1439);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.DurationField durationField7 = property3.getRangeDurationField();
        org.joda.time.DateTime dateTime8 = property3.getDateTime();
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
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.toDateTime(chronology24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withDurationAdded(readableDuration26, 100);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withZone(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = dateTime30.toLocalDateTime();
        org.joda.time.DateTime dateTime32 = dateTime20.withFields((org.joda.time.ReadablePartial) localDateTime31);
        int int33 = dateTime20.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime35 = dateTime20.withYear(4);
        org.joda.time.DateTime dateTime37 = dateTime20.withMillis((long) (byte) 10);
        long long38 = dateTime37.getMillis();
        int int39 = dateTime37.getYear();
        org.joda.time.DateTime dateTime41 = dateTime37.withSecondOfMinute(0);
        int int42 = property3.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DurationField durationField43 = property3.getLeapDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(durationField43);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.DurationField durationField7 = property3.getRangeDurationField();
        long long8 = property3.remainder();
        org.joda.time.DateTime dateTime9 = property3.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField10 = property3.getField();
        org.joda.time.DateTime dateTime11 = property3.roundHalfFloorCopy();
        int int12 = dateTime11.getMinuteOfDay();
        org.joda.time.DateTime.Property property13 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime11.plusHours((int) '#');
        boolean boolean16 = dateTime15.isAfterNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime.Property property7 = dateTime5.centuryOfEra();
        java.util.Locale locale9 = null;
        org.joda.time.DateTime dateTime10 = property7.setCopy("468", locale9);
        boolean boolean12 = dateTime10.isBefore((long) 5);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86340001L + "'", long6 == 86340001L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.joda.time.DateTime dateTime48 = dateTime46.plusMonths(292278993);
        org.joda.time.DateTime dateTime49 = dateTime46.toDateTime();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (byte) 1, chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime52.minus(readableDuration54);
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime55.toMutableDateTime();
        org.joda.time.DateTime.Property property57 = dateTime55.weekyear();
        org.joda.time.DateTime dateTime59 = property57.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime61 = property57.setCopy((-18595));
        org.joda.time.DateTime dateTime62 = dateTime61.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime64 = dateTime61.withCenturyOfEra(0);
        int int65 = dateTime64.getMinuteOfHour();
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.DateTime dateTime67 = dateTime64.minus(readableDuration66);
        boolean boolean68 = dateTime49.isEqual((org.joda.time.ReadableInstant) dateTime64);
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
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.getDateTime();
        org.joda.time.DateTime dateTime7 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(410);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTime dateTime6 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTime.Property property8 = dateTime6.year();
        org.joda.time.DateTime dateTime10 = property8.setCopy(59);
        org.joda.time.DurationField durationField11 = property8.getRangeDurationField();
        org.joda.time.DateTime dateTime12 = property8.roundFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        int int9 = property8.getMinimumValue();
        org.joda.time.DateTime dateTime10 = property8.withMinimumValue();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property8.getAsShortText(locale11);
        int int13 = property8.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "70" + "'", str12, "70");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        org.joda.time.DateTime dateTime15 = dateTime11.plusMonths((int) ' ');
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        org.joda.time.DateTime dateTime42 = dateTime41.toDateTime();
        org.joda.time.DateTime dateTime44 = dateTime41.withHourOfDay(0);
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
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime11 = dateTime2.plusMonths((int) (short) 0);
        int int12 = dateTime11.getCenturyOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.withYearOfEra(86398);
        int int15 = dateTime14.getEra();
        org.joda.time.DateTime.Property property16 = dateTime14.monthOfYear();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusSeconds(4);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.DateTime dateTime13 = property11.roundHalfEvenCopy();
        boolean boolean14 = dateTime13.isEqualNow();
        int int15 = dateTime13.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = dateTime13.toLocalDateTime();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(chronology20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.withDurationAdded(readableDuration22, 100);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfYear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.minus(readableDuration30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((java.lang.Object) readableDuration30);
        org.joda.time.DateTime.Property property33 = dateTime32.millisOfSecond();
        long long34 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime36 = dateTime32.minusMillis((int) (short) -1);
        boolean boolean37 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = dateTime5.equals((java.lang.Object) dateTime13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = dateTime5.toString(dateTimeFormatter39);
        org.joda.time.DateTime dateTime42 = dateTime5.minusMinutes(34);
        org.joda.time.DateTime.Property property43 = dateTime5.secondOfMinute();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-18591L) + "'", long34 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str40, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime10.withHourOfDay(0);
        boolean boolean14 = dateTime12.isEqual((-18591L));
        org.joda.time.DateTime.Property property15 = dateTime12.yearOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.lang.String str7 = property3.toString();
        org.joda.time.DateTime dateTime9 = property3.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMillis(70);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra(60);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfDay]" + "'", str7, "Property[minuteOfDay]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        org.joda.time.DateTime dateTime19 = dateTime15.plusMonths((-1));
        org.joda.time.DateTime.Property property20 = dateTime19.monthOfYear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.minus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusWeeks((int) '4');
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        org.joda.time.DateTime dateTime48 = dateTime31.plusSeconds((int) '#');
        org.joda.time.DateTime dateTime50 = dateTime31.withCenturyOfEra(0);
        org.joda.time.DateTime.Property property51 = dateTime50.centuryOfEra();
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
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime13 = property10.addToCopy((long) (byte) 0);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime4 = property3.getDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.withYear(0);
        int int7 = dateTime4.getDayOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        boolean boolean42 = property39.isLeap();
        java.util.Locale locale44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime45 = property39.setCopy("2185-01-25T02:36:56.197Z", locale44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2185-01-25T02:36:56.197Z\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withDayOfWeek(1);
        int int14 = dateTime13.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = dateTime13.plusYears(1969);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime44.toMutableDateTime();
        int int46 = dateTime44.getDayOfMonth();
        org.joda.time.DateTime dateTime48 = dateTime44.withYearOfEra(1);
        org.joda.time.DateTime dateTime51 = dateTime44.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime53 = dateTime51.withDayOfYear(20);
        boolean boolean54 = dateTime41.isEqual((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime56 = dateTime53.withMillisOfDay(1970);
        org.joda.time.DateTime dateTime58 = dateTime53.minusYears((int) (byte) -1);
        org.joda.time.DateTime dateTime61 = dateTime58.withDurationAdded(10L, 1970);
        org.joda.time.DateTime dateTime63 = dateTime58.plusMinutes((int) (short) 0);
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
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        java.lang.String str14 = property13.getAsText();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        int int16 = dateTime7.get(dateTimeField15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.minus(readableDuration26);
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime24.withPeriodAdded(readablePeriod29, 1439);
        org.joda.time.Chronology chronology32 = dateTime24.getChronology();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) ' ', chronology32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.DateTime dateTime37 = dateTime36.toDateTimeISO();
        org.joda.time.Chronology chronology38 = dateTime37.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime33.toDateTime(chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) ' ', chronology38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.toDateTime(chronology44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTime dateTime48 = dateTime43.withDurationAdded(readableDuration46, 100);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withZone(dateTimeZone49);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime48.plus(readableDuration51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (byte) 1, chronology54);
        org.joda.time.DateTime.Property property56 = dateTime55.minuteOfDay();
        java.lang.String str57 = property56.getAsText();
        org.joda.time.DateTime dateTime58 = property56.roundHalfEvenCopy();
        int int59 = dateTime52.compareTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (byte) 1, chronology61);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime62.toMutableDateTime();
        org.joda.time.DateTime dateTime65 = dateTime62.withMillisOfSecond((int) '#');
        boolean boolean66 = dateTime52.equals((java.lang.Object) dateTime65);
        org.joda.time.DateTime dateTime68 = dateTime65.withDayOfYear(4);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (byte) 1, chronology70);
        org.joda.time.DateTime.Property property72 = dateTime71.minuteOfDay();
        java.lang.String str73 = property72.getAsText();
        org.joda.time.DateTime dateTime74 = property72.roundHalfEvenCopy();
        int int75 = property72.get();
        java.util.Locale locale76 = null;
        int int77 = property72.getMaximumTextLength(locale76);
        int int78 = property72.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property72.getFieldType();
        org.joda.time.DateTime.Property property80 = dateTime68.property(dateTimeFieldType79);
        boolean boolean81 = dateTime40.isSupported(dateTimeFieldType79);
        org.joda.time.DateTime.Property property82 = dateTime7.property(dateTimeFieldType79);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0" + "'", str57, "0");
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 4 + "'", int77 == 4);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(property82);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        long long29 = dateTime28.getMillis();
        int int30 = dateTime28.getYear();
        org.joda.time.DateTime dateTime32 = dateTime28.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime34 = dateTime28.plusSeconds(69);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTime(chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withDurationAdded(readableDuration40, 100);
        org.joda.time.DateTime dateTime45 = dateTime42.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfMonth();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 1, chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime49.toMutableDateTime();
        org.joda.time.DateTime dateTime52 = dateTime49.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime49.toMutableDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime49.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime58 = dateTime49.plusMonths((int) (short) 0);
        java.lang.String str60 = dateTime58.toString("0");
        int int61 = dateTime45.compareTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 1, chronology63);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime64.toMutableDateTime();
        int int66 = dateTime64.getDayOfMonth();
        org.joda.time.DateTime dateTime68 = dateTime64.withYearOfEra(1);
        org.joda.time.DateTime.Property property69 = dateTime68.monthOfYear();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) (byte) 1, chronology71);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = dateTime72.toDateTime(chronology73);
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.DateTime dateTime77 = dateTime72.withDurationAdded(readableDuration75, 100);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateTime dateTime79 = dateTime77.withZone(dateTimeZone78);
        org.joda.time.LocalDateTime localDateTime80 = dateTime79.toLocalDateTime();
        int int81 = property69.compareTo((org.joda.time.ReadablePartial) localDateTime80);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = property69.getFieldType();
        org.joda.time.DateTime.Property property83 = dateTime45.property(dateTimeFieldType82);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime85 = dateTime28.withField(dateTimeFieldType82, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0" + "'", str60, "0");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType82);
        org.junit.Assert.assertNotNull(property83);
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
        org.joda.time.DateTime.Property property28 = dateTime24.dayOfWeek();
        long long29 = property28.remainder();
        org.joda.time.DateTime dateTime31 = property28.addToCopy((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = dateTime31.withEra(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime3.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.toDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime13.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        org.joda.time.DateTime dateTime21 = dateTime10.toDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 86398, dateTimeZone20);
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(0);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.DateTime dateTime30 = dateTime29.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime24.toMutableDateTime(chronology31);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DateTime.Property property8 = dateTime6.dayOfYear();
        org.joda.time.DateTime.Property property9 = dateTime6.minuteOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundCeilingCopy();
        java.util.Locale locale12 = null;
        org.joda.time.DateTime dateTime13 = property9.setCopy("19", locale12);
        org.joda.time.DateTime dateTime15 = property9.addToCopy(100L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property10 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime12 = dateTime5.minusYears(4319);
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTimeISO();
        org.joda.time.LocalDate localDate14 = dateTime5.toLocalDate();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.DateTime dateTime13 = property12.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(2020);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime13.withMillisOfSecond(1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime5.era();
        org.joda.time.DateTime dateTime9 = property8.withMinimumValue();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
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
        org.joda.time.DateTime.Property property27 = dateTime11.minuteOfDay();
        int int28 = dateTime11.getWeekOfWeekyear();
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
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime11 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime13 = dateTime7.plusMillis(0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        org.joda.time.DateTime dateTime37 = dateTime4.minusMonths((-50));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = dateTime37.withTime(86340001, 59, 19, 971);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86340001 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTime37);
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
        org.joda.time.DateTime dateTime22 = dateTime20.plusWeeks(59);
        java.lang.String str23 = dateTime20.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str23, "1970-01-01T00:00:00.001Z");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DateTime dateTime9 = dateTime6.minusMillis(466);
        java.util.Date date10 = dateTime6.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime6.withDate((int) (short) 0, 1971, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1971 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Mon Jan 03 00:00:00 UTC 1");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology4 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(chronology4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology4);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readableDuration7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withEra(156);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 156 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime1.minusWeeks((int) ' ');
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        int int7 = property6.get();
        org.joda.time.DurationField durationField8 = property6.getDurationField();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        org.joda.time.DateTime dateTime20 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime22 = dateTime20.withSecondOfMinute(19);
        int int23 = dateTime22.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (byte) 1, chronology41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.toDateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime42.plusMillis(1970);
        org.joda.time.DateTime.Property property47 = dateTime46.monthOfYear();
        org.joda.time.DateTime.Property property48 = dateTime46.dayOfYear();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 1, chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime51.toMutableDateTime();
        org.joda.time.DateTime dateTime54 = dateTime51.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime51.toMutableDateTime(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime51.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (byte) 1, chronology60);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime61.toMutableDateTime();
        int int63 = dateTime61.getDayOfMonth();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = dateTime61.toDateTime(chronology64);
        org.joda.time.DateTime dateTime67 = dateTime61.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime67.getZone();
        org.joda.time.DateTime dateTime69 = dateTime58.toDateTime(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime46.toMutableDateTime(dateTimeZone68);
        boolean boolean73 = property39.equals((java.lang.Object) mutableDateTime72);
        org.joda.time.DurationField durationField74 = property39.getDurationField();
        org.joda.time.DateTime dateTime75 = property39.roundHalfEvenCopy();
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
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(durationField74);
        org.junit.Assert.assertNotNull(dateTime75);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillis((long) (byte) -1);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfMonth();
        org.joda.time.DateTime dateTime6 = property5.roundFloorCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime9.withWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime9.toDateTimeISO();
        org.joda.time.DateTime dateTime16 = dateTime14.plusHours(12);
        org.joda.time.DateTime dateTime18 = dateTime14.plusYears(0);
        org.joda.time.DateTime dateTime20 = dateTime18.minusHours((-50));
        boolean boolean21 = dateTime18.isBeforeNow();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        org.joda.time.DateMidnight dateMidnight32 = dateTime5.toDateMidnight();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.toDateTime(chronology36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime40 = dateTime35.withDurationAdded(readableDuration38, 100);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = dateTime40.withZone(dateTimeZone41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTime dateTime44 = dateTime40.plus(readableDuration43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, chronology46);
        org.joda.time.DateTime.Property property48 = dateTime47.minuteOfDay();
        java.lang.String str49 = property48.getAsText();
        org.joda.time.DateTime dateTime50 = property48.roundHalfEvenCopy();
        int int51 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (byte) 1, chronology53);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime54.toMutableDateTime();
        org.joda.time.DateTime dateTime57 = dateTime54.withMillisOfSecond((int) '#');
        boolean boolean58 = dateTime44.equals((java.lang.Object) dateTime57);
        org.joda.time.DateTime dateTime60 = dateTime57.withDayOfYear(4);
        boolean boolean61 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime57);
        int int62 = dateTime57.getSecondOfDay();
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
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0" + "'", str49, "0");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        int int10 = dateTime2.getDayOfYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis(1970);
        org.joda.time.DateTime.Property property18 = dateTime17.monthOfYear();
        org.joda.time.DateTime.Property property19 = dateTime17.dayOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        org.joda.time.DateTime dateTime25 = dateTime22.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime22.toMutableDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime22.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        int int34 = dateTime32.getDayOfMonth();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.toDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime32.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime38.getZone();
        org.joda.time.DateTime dateTime40 = dateTime29.toDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime17.toMutableDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((-18591L));
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (byte) 1, chronology54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.DateTime dateTime61 = dateTime58.minus(readableDuration60);
        int int62 = dateTime55.compareTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.DateTime dateTime65 = dateTime58.withPeriodAdded(readablePeriod63, 1439);
        org.joda.time.Chronology chronology66 = dateTime58.getChronology();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) ' ', chronology66);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) (byte) 1, chronology69);
        org.joda.time.DateTime dateTime71 = dateTime70.toDateTimeISO();
        org.joda.time.Chronology chronology72 = dateTime71.getChronology();
        org.joda.time.DateTime dateTime73 = dateTime67.toDateTime(chronology72);
        org.joda.time.DateTime dateTime74 = dateTime51.toDateTime(chronology72);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(292278993, (int) (short) 10, 19, (int) (short) 1, (int) (short) 0, chronology72);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) 12, chronology72);
        org.joda.time.DateTime dateTime77 = dateTime17.withChronology(chronology72);
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime2.toMutableDateTime(chronology72);
        org.joda.time.DateTime dateTime79 = dateTime2.withLaterOffsetAtOverlap();
        int int80 = dateTime79.getHourOfDay();
        org.joda.time.DateTime dateTime82 = dateTime79.plusMonths(1966);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(mutableDateTime78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(dateTime82);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.minus(readableDuration10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.DateTime.Property property13 = dateTime11.weekyear();
        org.joda.time.DateTime dateTime15 = property13.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.minus(readableDuration20);
        int int22 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfDay();
        java.lang.String str27 = property26.getAsText();
        org.joda.time.DateTimeField dateTimeField28 = property26.getField();
        int int29 = dateTime18.get(dateTimeField28);
        org.joda.time.DateTime dateTime31 = dateTime18.plusHours(20);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours(1968);
        org.joda.time.Chronology chronology34 = dateTime31.getChronology();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(365, 4, (int) (byte) 10, 20, 58, 59, chronology34);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(chronology34);
    }
}
