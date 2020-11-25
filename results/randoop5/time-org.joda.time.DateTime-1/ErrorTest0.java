import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) '#');
        java.lang.String str16 = dateTime15.toString();
        int int17 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTime.Property property18 = dateTime17.millisOfDay();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant19", (mutableDateTime3.compareTo(instant19) == 0) == mutableDateTime3.equals(instant19));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property10 = dateTime7.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        int int10 = dateTime7.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime9.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant13", (dateTime15.compareTo(instant13) == 0) == dateTime15.equals(instant13));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        org.joda.time.DateTime.Property property14 = dateTime9.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant13", (dateTime9.compareTo(instant13) == 0) == dateTime9.equals(instant13));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime15 = dateTime9.withSecondOfMinute((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant13", (dateTime9.compareTo(instant13) == 0) == dateTime9.equals(instant13));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withDayOfWeek(1);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime13.withEra((int) (short) 1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        int int21 = dateTime19.getDayOfMonth();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.toDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime19.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.DateTime dateTime27 = dateTime16.withZoneRetainFields(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant14", (dateTime27.compareTo(instant14) == 0) == dateTime27.equals(instant14));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime9.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant13", (dateTime14.compareTo(instant13) == 0) == dateTime14.equals(instant13));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime11.minus(0L);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime(chronology17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withDurationAdded(readableDuration19, 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.withZone(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = dateTime23.toLocalDateTime();
        org.joda.time.DateTime dateTime26 = dateTime23.withYear((int) '#');
        org.joda.time.Instant instant27 = dateTime23.toInstant();
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
        boolean boolean39 = instant27.isSupported(dateTimeFieldType38);
        boolean boolean40 = dateTime11.isSupported(dateTimeFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant27", (dateTime2.compareTo(instant27) == 0) == dateTime2.equals(instant27));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readableDuration8);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        int int11 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.Instant instant12 = mutableDateTime10.toInstant();
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = mutableDateTime10.toCalendar(locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant12", (dateTime2.compareTo(instant12) == 0) == dateTime2.equals(instant12));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        org.joda.time.DateTime dateTime23 = dateTime5.withDurationAdded((long) (short) -1, 1439);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(chronology27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withDurationAdded(readableDuration29, 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withZone(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime34 = dateTime33.toLocalDateTime();
        org.joda.time.DateTime dateTime36 = dateTime33.withYear((int) '#');
        org.joda.time.Instant instant37 = dateTime33.toInstant();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 1, chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.minuteOfDay();
        java.lang.String str42 = property41.getAsText();
        org.joda.time.DateTime dateTime43 = property41.roundHalfEvenCopy();
        int int44 = property41.get();
        java.util.Locale locale45 = null;
        int int46 = property41.getMaximumTextLength(locale45);
        int int47 = property41.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property41.getFieldType();
        boolean boolean49 = instant37.isSupported(dateTimeFieldType48);
        org.joda.time.DateTime.Property property50 = dateTime23.property(dateTimeFieldType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant37", (dateTime2.compareTo(instant37) == 0) == dateTime2.equals(instant37));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        int int14 = dateTime9.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant13", (dateTime9.compareTo(instant13) == 0) == dateTime9.equals(instant13));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withDayOfWeek(1);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime13.withEra((int) (short) 1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        int int21 = dateTime19.getDayOfMonth();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.toDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime19.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime13.toMutableDateTime(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime13", (instant14.compareTo(dateTime13) == 0) == instant14.equals(dateTime13));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readableDuration8);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        int int11 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.Instant instant12 = mutableDateTime10.toInstant();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime(chronology16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.withDurationAdded(readableDuration18, 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withZone(dateTimeZone21);
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfDay();
        org.joda.time.DateTime dateTime25 = dateTime22.plusHours((int) (byte) 100);
        boolean boolean27 = dateTime25.isBefore(0L);
        org.joda.time.LocalTime localTime28 = dateTime25.toLocalTime();
        boolean boolean29 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant12", (dateTime2.compareTo(instant12) == 0) == dateTime2.equals(instant12));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        int int10 = dateTime7.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        org.joda.time.Instant instant14 = dateTime11.toInstant();
        long long15 = dateTime11.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant14", (dateTime11.compareTo(instant14) == 0) == dateTime11.equals(instant14));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        org.joda.time.Instant instant14 = dateTime11.toInstant();
        org.joda.time.DateTime dateTime15 = dateTime11.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant14", (dateTime15.compareTo(instant14) == 0) == dateTime15.equals(instant14));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withDayOfWeek(1);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime13.withEra((int) (short) 1);
        org.joda.time.DateTime dateTime18 = dateTime13.plus((long) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime13", (instant14.compareTo(dateTime13) == 0) == instant14.equals(dateTime13));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withDayOfWeek(1);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime13.withEra((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = dateTime16.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant14", (dateTime16.compareTo(instant14) == 0) == dateTime16.equals(instant14));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime11.minus(0L);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.Instant instant15 = dateTime13.toInstant();
        org.joda.time.DateTime.Property property16 = dateTime13.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant15", (dateTime13.compareTo(instant15) == 0) == dateTime13.equals(instant15));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTime.Property property6 = dateTime2.minuteOfDay();
        org.joda.time.Instant instant7 = dateTime2.toInstant();
        int int8 = dateTime2.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant7", (mutableDateTime3.compareTo(instant7) == 0) == mutableDateTime3.equals(instant7));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withDayOfWeek(1);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime13.withEra((int) (short) 1);
        org.joda.time.DateTime dateTime18 = dateTime13.minus((long) 292278993);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime13", (instant14.compareTo(dateTime13) == 0) == instant14.equals(dateTime13));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        org.joda.time.DateTime dateTime15 = property10.addWrapFieldToCopy((int) (short) 0);
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.DateTime dateTime18 = dateTime15.minusWeeks((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant16", (dateTime15.compareTo(instant16) == 0) == dateTime15.equals(instant16));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withDayOfWeek(1);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.Instant instant15 = instant14.toInstant();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withDurationAdded(readableDuration21, 100);
        org.joda.time.DateTime.Property property24 = dateTime18.yearOfCentury();
        org.joda.time.DateTime dateTime25 = property24.roundFloorCopy();
        org.joda.time.DateTime dateTime26 = property24.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime28 = dateTime26.minusSeconds((int) 'a');
        org.joda.time.DateTime.Property property29 = dateTime28.year();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime dateTime35 = dateTime32.withMillisOfSecond((int) '#');
        long long36 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        java.lang.String str37 = dateTime35.toString();
        int int38 = dateTime35.getYearOfCentury();
        int int39 = dateTime35.getHourOfDay();
        boolean boolean40 = instant14.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant14", (dateTime13.compareTo(instant14) == 0) == dateTime13.equals(instant14));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.DateTime.Property property5 = dateTime3.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }
}

