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
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime7.minusHours(3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime5.plusMonths((int) ' ');
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) dateTime5);
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.minus(readableDuration11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant10", (dateTime5.compareTo(instant10) == 0) == dateTime5.equals(instant10));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        org.joda.time.DateTime dateTime18 = dateTime13.withDayOfMonth(9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime13", (instant14.compareTo(dateTime13) == 0) == instant14.equals(dateTime13));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.DateTime dateTime18 = dateTime17.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology19 = dateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = instant14.toMutableDateTime(chronology19);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant14", (dateTime2.compareTo(instant14) == 0) == dateTime2.equals(instant14));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        java.util.Date date13 = mutableDateTime10.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant12", (dateTime2.compareTo(instant12) == 0) == dateTime2.equals(instant12));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        int int15 = dateTime12.getDayOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withDurationAdded(readableDuration21, 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.withZone(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime26 = dateTime25.toLocalDateTime();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear((int) '#');
        org.joda.time.Instant instant29 = dateTime25.toInstant();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.minuteOfDay();
        java.lang.String str34 = property33.getAsText();
        org.joda.time.DateTime dateTime35 = property33.roundHalfEvenCopy();
        int int36 = property33.get();
        java.util.Locale locale37 = null;
        int int38 = property33.getMaximumTextLength(locale37);
        int int39 = property33.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property33.getFieldType();
        boolean boolean41 = instant29.isSupported(dateTimeFieldType40);
        org.joda.time.DateTime.Property property42 = dateTime12.property(dateTimeFieldType40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant29", (dateTime2.compareTo(instant29) == 0) == dateTime2.equals(instant29));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        int int29 = dateTime26.getSecondOfDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.minuteOfDay();
        java.lang.String str34 = property33.getAsText();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime37.toMutableDateTime();
        int int39 = dateTime37.getDayOfMonth();
        long long40 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime41 = property33.withMinimumValue();
        org.joda.time.DateTime dateTime43 = dateTime41.minusWeeks((int) (byte) 10);
        org.joda.time.Instant instant44 = dateTime41.toInstant();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, chronology46);
        org.joda.time.DateTime dateTime48 = dateTime47.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology49 = dateTime47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime50 = instant44.toMutableDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime26.toMutableDateTime(chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant44", (dateTime2.compareTo(instant44) == 0) == dateTime2.equals(instant44));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.YearMonthDay yearMonthDay5 = dateTime2.toYearMonthDay();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMillis((int) (short) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withDurationAdded(readableDuration13, 100);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.withZone(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime18 = dateTime17.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime17.withYear((int) '#');
        org.joda.time.Instant instant21 = dateTime17.toInstant();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DateTime dateTime27 = property25.roundHalfEvenCopy();
        int int28 = property25.get();
        java.util.Locale locale29 = null;
        int int30 = property25.getMaximumTextLength(locale29);
        int int31 = property25.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property25.getFieldType();
        boolean boolean33 = instant21.isSupported(dateTimeFieldType32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 1, chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime40.minus(readableDuration42);
        int int44 = dateTime37.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime47 = dateTime40.withPeriodAdded(readablePeriod45, 1439);
        org.joda.time.Chronology chronology48 = dateTime40.getChronology();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) ' ', chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.year();
        org.joda.time.DateTime dateTime51 = property50.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField52 = property50.getField();
        int int53 = instant21.get(dateTimeField52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 1, chronology55);
        org.joda.time.DateTime.Property property57 = dateTime56.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.minus(readableDuration58);
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime59.toMutableDateTime();
        org.joda.time.DateTime.Property property61 = dateTime59.weekyear();
        org.joda.time.DateTime dateTime63 = property61.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (byte) 1, chronology65);
        org.joda.time.DateTime.Property property67 = dateTime66.minuteOfDay();
        java.lang.String str68 = property67.getAsText();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (byte) 1, chronology70);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime71.toMutableDateTime();
        int int73 = dateTime71.getDayOfMonth();
        long long74 = property67.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime75 = property67.withMinimumValue();
        org.joda.time.DateTime dateTime77 = dateTime75.minusWeeks((int) (byte) 10);
        long long78 = property61.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property61.getFieldType();
        boolean boolean80 = instant21.isSupported(dateTimeFieldType79);
        org.joda.time.DateTime dateTime82 = dateTime7.withField(dateTimeFieldType79, 9417651);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.minus(readablePeriod6);
        boolean boolean9 = dateTime7.isEqual((long) (byte) 10);
        org.joda.time.Instant instant10 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property11 = dateTime7.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant10", (dateTime7.compareTo(instant10) == 0) == dateTime7.equals(instant10));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(142);
        org.joda.time.DateTime dateTime12 = property9.roundHalfEvenCopy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.minus(readableDuration20);
        int int22 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology23 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(chronology23);
        int int25 = property9.getDifference((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.minus(readableDuration34);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime35.toMutableDateTime();
        int int37 = property29.getDifference((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.Instant instant38 = mutableDateTime36.toInstant();
        long long39 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant38", (dateTime2.compareTo(instant38) == 0) == dateTime2.equals(instant38));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTime dateTime6 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTime.Property property8 = dateTime6.year();
        org.joda.time.DateTime dateTime10 = property8.setCopy((-18595));
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((-18591L));
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
        org.joda.time.DateTime dateTime40 = dateTime17.toDateTime(chronology38);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(292278993, (int) (short) 10, 19, (int) (short) 1, (int) (short) 0, chronology38);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime44.toMutableDateTime();
        org.joda.time.DateTime dateTime47 = dateTime44.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (byte) 1, chronology49);
        org.joda.time.DateTime.Property property51 = dateTime50.minuteOfDay();
        java.lang.String str52 = property51.getAsText();
        org.joda.time.DateTime dateTime53 = property51.roundHalfEvenCopy();
        int int54 = property51.get();
        java.util.Locale locale55 = null;
        int int56 = property51.getMaximumTextLength(locale55);
        int int57 = property51.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property51.getFieldType();
        org.joda.time.DateTime.Property property59 = dateTime44.property(dateTimeFieldType58);
        boolean boolean60 = dateTime41.isSupported(dateTimeFieldType58);
        int int61 = dateTime10.get(dateTimeFieldType58);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime10.toMutableDateTime();
        org.joda.time.Instant instant63 = dateTime10.toInstant();
        org.joda.time.DateTime dateTime65 = dateTime10.withDayOfYear((int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime62 and instant63", (mutableDateTime62.compareTo(instant63) == 0) == mutableDateTime62.equals(instant63));
    }
}

