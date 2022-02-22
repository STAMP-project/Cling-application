import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        mutableDateTime4.setZone(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName(10L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        java.util.Locale locale10 = new java.util.Locale("365");
        java.lang.String str11 = locale10.getISO3Language();
        java.lang.String str12 = dateTimeZone5.getName((long) 31, locale10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        org.joda.time.Instant instant12 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime6.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant12", (dateTime6.compareTo(instant12) == 0) == dateTime6.equals(instant12));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.hours();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfMinute();
        org.joda.time.DurationField durationField14 = chronology11.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withChronology(chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField14", Math.signum(durationField12.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField12)));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        java.lang.String str21 = dateTime20.toString();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.Instant instant24 = dateTime20.toInstant();
        boolean boolean25 = dateTime13.isEqual((org.joda.time.ReadableInstant) instant24);
        int int26 = dateTime13.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant24", (dateTime6.compareTo(instant24) == 0) == dateTime6.equals(instant24));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = dateTimeZone2.getName((long) (byte) -1, locale5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime13.minusWeeks(10);
        org.joda.time.DateTime.Property property19 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime21 = dateTime13.plusMillis((-292275054));
        int int22 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime21);
        mutableDateTime0.setZoneRetainFields(dateTimeZone2);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant1", (mutableDateTime0.compareTo(instant1) == 0) == mutableDateTime0.equals(instant1));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        org.joda.time.Instant instant12 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime14.set(dateTimeFieldType15, (-292275054));
        org.joda.time.DateTime dateTime19 = dateTime6.withField(dateTimeFieldType15, (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant12", (dateTime6.compareTo(instant12) == 0) == dateTime6.equals(instant12));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.hours();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = chronology7.add(readablePeriod9, (long) (short) 1, (int) '#');
        org.joda.time.DurationField durationField13 = chronology7.millis();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.secondOfMinute();
        org.joda.time.DurationField durationField15 = chronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField8, and durationField13", !(durationField15.compareTo(durationField8) == 0) || (Math.signum(durationField15.compareTo(durationField13)) == Math.signum(durationField8.compareTo(durationField13))));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        java.lang.String str21 = dateTime20.toString();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.Instant instant24 = dateTime20.toInstant();
        boolean boolean25 = dateTime13.isEqual((org.joda.time.ReadableInstant) instant24);
        org.joda.time.DateTime dateTime27 = dateTime13.minusMillis(8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant24", (dateTime6.compareTo(instant24) == 0) == dateTime6.equals(instant24));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = dateTimeZone8.getName((long) (byte) -1, locale11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime19.minusWeeks(10);
        org.joda.time.DateTime.Property property25 = dateTime19.hourOfDay();
        org.joda.time.DateTime dateTime27 = dateTime19.plusMillis((-292275054));
        int int28 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone8);
        mutableDateTime4.setZone(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) (byte) 1);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate10 = localDate8.plusWeeks((-292275054));
        int int11 = dateTimeField2.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property14 = localDate12.property(dateTimeFieldType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.year();
        boolean boolean16 = localDate12.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate12.dayOfWeek();
        org.joda.time.LocalDate localDate18 = property17.roundCeilingCopy();
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.lang.String str20 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDate18, locale19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        org.joda.time.LocalDate localDate24 = localDate18.withFieldAdded(durationFieldType22, 3);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.dayOfMonth();
        org.joda.time.DurationField durationField28 = chronology25.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField28, and durationField26", !(durationField26.compareTo(durationField28) == 0) || (Math.signum(durationField26.compareTo(durationField26)) == Math.signum(durationField28.compareTo(durationField26))));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.monthOfYear();
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.lang.String str11 = locale10.getCountry();
        java.util.Locale locale12 = locale10.stripExtensions();
        java.lang.String str13 = locale12.getISO3Country();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((-3L), chronology8, locale12, (java.lang.Integer) 364);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        mutableDateTime16.add((long) 100);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone23);
        java.lang.String str26 = dateTime25.toString();
        org.joda.time.DateTime dateTime28 = dateTime25.plus((long) 100);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.util.Calendar calendar31 = dateTime28.toCalendar(locale30);
        int int32 = dateTime28.getMinuteOfHour();
        boolean boolean33 = mutableDateTime16.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Instant instant34 = mutableDateTime16.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime16.property(dateTimeFieldType35);
        dateTimeParserBucket15.saveField(dateTimeFieldType35, 2022);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant34", (mutableDateTime16.compareTo(instant34) == 0) == mutableDateTime16.equals(instant34));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.set(10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        java.lang.String str16 = dateTime15.toString();
        org.joda.time.DateTime dateTime18 = dateTime15.plus((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.withYear(10);
        int int21 = property8.getDifference((org.joda.time.ReadableInstant) dateTime18);
        boolean boolean22 = mutableDateTime4.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        java.lang.String str30 = dateTime29.toString();
        org.joda.time.DateTime dateTime32 = dateTime29.plus((long) 100);
        org.joda.time.DateTime dateTime34 = dateTime32.minusSeconds(0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withChronology(chronology35);
        boolean boolean37 = mutableDateTime4.isAfter((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime();
        mutableDateTime38.add((long) 100);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (-1), chronology42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        org.joda.time.DateTime dateTime47 = localDateTime43.toDateTime(dateTimeZone45);
        java.lang.String str48 = dateTime47.toString();
        org.joda.time.DateTime dateTime50 = dateTime47.plus((long) 100);
        org.joda.time.DateTime.Property property51 = dateTime50.yearOfCentury();
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.util.Calendar calendar53 = dateTime50.toCalendar(locale52);
        int int54 = dateTime50.getMinuteOfHour();
        boolean boolean55 = mutableDateTime38.isEqual((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Instant instant56 = mutableDateTime38.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime38.property(dateTimeFieldType57);
        boolean boolean59 = dateTime36.isSupported(dateTimeFieldType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime38 and instant56", (mutableDateTime38.compareTo(instant56) == 0) == mutableDateTime38.equals(instant56));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime4.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.DurationField durationField10 = chronology7.eras();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField10", Math.signum(durationField8.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField8)));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.Instant instant18 = mutableDateTime1.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronology();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology30.add(readablePeriod32, (long) (-292275054), (int) '4');
        org.joda.time.DateTimeField dateTimeField36 = chronology30.halfdayOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter21.withChronology(chronology30);
        org.joda.time.DateTime dateTime38 = mutableDateTime1.toDateTime(chronology30);
        long long39 = dateTime38.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant18", (mutableDateTime1.compareTo(instant18) == 0) == mutableDateTime1.equals(instant18));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.Instant instant18 = mutableDateTime1.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronology();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology30.add(readablePeriod32, (long) (-292275054), (int) '4');
        org.joda.time.DateTimeField dateTimeField36 = chronology30.halfdayOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter21.withChronology(chronology30);
        org.joda.time.DateTime dateTime38 = mutableDateTime1.toDateTime(chronology30);
        org.joda.time.DurationField durationField39 = chronology30.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant18", (mutableDateTime1.compareTo(instant18) == 0) == mutableDateTime1.equals(instant18));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        java.util.Locale locale19 = null;
        int int20 = property16.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime21 = property16.getDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.minusMonths((int) 'x');
        org.joda.time.Instant instant24 = dateTime21.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (-1), chronology30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = localDateTime31.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter28.withChronology(chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.Chronology chronology39 = chronology36.withZone(dateTimeZone38);
        org.joda.time.DurationField durationField40 = chronology36.weekyears();
        java.util.Locale locale41 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 90, chronology36, locale41, (java.lang.Integer) 13, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime46.setMillisOfDay(10);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField50 = mutableDateTime49.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType51.getDurationType();
        mutableDateTime49.add(durationFieldType52, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter55 = null;
        org.joda.time.format.DateTimeParser dateTimeParser56 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter55, dateTimeParser56);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) (-1), chronology59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone63 = dateTimeZone62.toTimeZone();
        org.joda.time.DateTime dateTime64 = localDateTime60.toDateTime(dateTimeZone62);
        org.joda.time.Chronology chronology65 = dateTime64.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter57.withChronology(chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.monthOfYear();
        org.joda.time.DurationField durationField68 = durationFieldType52.getField(chronology65);
        org.joda.time.DateTimeField dateTimeField69 = chronology65.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = dateTimeField69.getType();
        boolean boolean71 = mutableDateTime46.isSupported(dateTimeFieldType70);
        dateTimeParserBucket44.saveField(dateTimeFieldType70, 33);
        org.joda.time.DateTime dateTime75 = dateTime21.withField(dateTimeFieldType70, 90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant24", (dateTime21.compareTo(instant24) == 0) == dateTime21.equals(instant24));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        org.joda.time.Instant instant12 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) instant12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant12", (dateTime6.compareTo(instant12) == 0) == dateTime6.equals(instant12));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        mutableDateTime9.add((long) 100);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        java.lang.String str19 = dateTime18.toString();
        org.joda.time.DateTime dateTime21 = dateTime18.plus((long) 100);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.util.Calendar calendar24 = dateTime21.toCalendar(locale23);
        int int25 = dateTime21.getMinuteOfHour();
        boolean boolean26 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Instant instant27 = mutableDateTime9.toInstant();
        long long28 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.LocalDateTime localDateTime29 = property8.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant27", (mutableDateTime9.compareTo(instant27) == 0) == mutableDateTime9.equals(instant27));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        mutableDateTime4.setMillis(3849929784006L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.hours();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekyear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((-1));
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime14, locale18);
        int int21 = dateTimeField11.getLeapAmount((long) (-1));
        int int22 = mutableDateTime1.get(dateTimeField11);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology30);
        org.joda.time.DateTime dateTime33 = mutableDateTime1.toDateTime(chronology30);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime1.copy();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (-1), chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTime dateTime41 = localDateTime37.toDateTime(dateTimeZone39);
        org.joda.time.Chronology chronology42 = dateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.secondOfDay();
        org.joda.time.DurationField durationField44 = chronology42.minutes();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.weekyearOfCentury();
        org.joda.time.Chronology chronology46 = chronology42.withUTC();
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = chronology46.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime32 and dateTime47", (mutableDateTime32.compareTo(dateTime47) == 0) == mutableDateTime32.equals(dateTime47));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("365");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate7 = localDate5.plusWeeks((-292275054));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.LocalDate localDate10 = dateTime9.toLocalDate();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays((int) (byte) 0);
        java.util.Date date13 = dateTime12.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime12.getZone();
        org.joda.time.Interval interval15 = localDate5.toInterval(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate1.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.LocalDate.Property property17 = localDate1.dayOfYear();
        org.joda.time.Chronology chronology18 = localDate1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime19", (dateTime9.compareTo(mutableDateTime19) == 0) == dateTime9.equals(mutableDateTime19));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.Instant instant18 = mutableDateTime1.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronology();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology30.add(readablePeriod32, (long) (-292275054), (int) '4');
        org.joda.time.DateTimeField dateTimeField36 = chronology30.halfdayOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter21.withChronology(chronology30);
        org.joda.time.DateTime dateTime38 = mutableDateTime1.toDateTime(chronology30);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime1.add(readablePeriod39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime38", (instant18.compareTo(dateTime38) == 0) == instant18.equals(dateTime38));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(9);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = localDateTime28.toDateTime(dateTimeZone30);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfDay();
        org.joda.time.DurationField durationField35 = chronology33.minutes();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekyearOfCentury();
        org.joda.time.Chronology chronology37 = chronology33.withUTC();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = chronology37.getZone();
        org.joda.time.DateTime dateTime40 = dateTime24.toDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime();
        mutableDateTime41.add(0L);
        org.joda.time.DateTime dateTime44 = mutableDateTime41.toDateTimeISO();
        org.joda.time.DateTime.Property property45 = dateTime44.centuryOfEra();
        org.joda.time.DateTime dateTime47 = dateTime44.minusSeconds((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType48.getRangeDurationType();
        org.joda.time.DateTime dateTime51 = dateTime47.withFieldAdded(durationFieldType49, (int) (short) 0);
        org.joda.time.DateTime dateTime53 = dateTime40.withFieldAdded(durationFieldType49, 28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and mutableDateTime41", (dateTime38.compareTo(mutableDateTime41) == 0) == dateTime38.equals(mutableDateTime41));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMinutes(2);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime11.minus(readablePeriod16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int19 = dateTime11.get(dateTimeFieldType18);
        org.joda.time.DateTime.Property property20 = dateTime11.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getRangeDurationType();
        java.lang.String str23 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property24 = dateTime11.property(dateTimeFieldType21);
        org.joda.time.Instant instant25 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.lang.String str32 = dateTimeZone28.getName((long) (byte) -1, locale31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        java.lang.String str40 = dateTime39.toString();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.plus(readableDuration41);
        org.joda.time.DateTime dateTime44 = dateTime39.minusWeeks(10);
        org.joda.time.DateTime.Property property45 = dateTime39.hourOfDay();
        org.joda.time.DateTime dateTime47 = dateTime39.plusMillis((-292275054));
        int int48 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime47);
        mutableDateTime26.setZoneRetainFields(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime11.toMutableDateTime(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant25", (dateTime11.compareTo(instant25) == 0) == dateTime11.equals(instant25));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add((long) 100);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.DateTime dateTime12 = dateTime9.plus((long) 100);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Calendar calendar15 = dateTime12.toCalendar(locale14);
        int int16 = dateTime12.getMinuteOfHour();
        boolean boolean17 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Instant instant18 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime0.property(dateTimeFieldType19);
        int int21 = property20.getMaximumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant18", (mutableDateTime0.compareTo(instant18) == 0) == mutableDateTime0.equals(instant18));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.Instant instant18 = mutableDateTime1.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronology();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology30.add(readablePeriod32, (long) (-292275054), (int) '4');
        org.joda.time.DateTimeField dateTimeField36 = chronology30.halfdayOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter21.withChronology(chronology30);
        org.joda.time.DateTime dateTime38 = mutableDateTime1.toDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField39 = chronology30.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant18", (mutableDateTime1.compareTo(instant18) == 0) == mutableDateTime1.equals(instant18));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.Instant instant18 = mutableDateTime1.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronology();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology30.add(readablePeriod32, (long) (-292275054), (int) '4');
        org.joda.time.DateTimeField dateTimeField36 = chronology30.halfdayOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter21.withChronology(chronology30);
        org.joda.time.DateTime dateTime38 = mutableDateTime1.toDateTime(chronology30);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.era();
        java.lang.String str40 = dateTimeFieldType39.getName();
        boolean boolean41 = dateTime38.isSupported(dateTimeFieldType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant18", (mutableDateTime1.compareTo(instant18) == 0) == mutableDateTime1.equals(instant18));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.Instant instant18 = mutableDateTime1.toInstant();
        org.joda.time.DateTime dateTime19 = mutableDateTime1.toDateTimeISO();
        mutableDateTime1.setMonthOfYear(9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime19", (instant18.compareTo(dateTime19) == 0) == instant18.equals(dateTime19));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        java.lang.String[] strArray6 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet1.containsAll((java.util.Collection<java.lang.String>) strList7);
        java.lang.Object[] objArray10 = strSet1.toArray();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime(dateTimeZone15);
        java.lang.String str18 = dateTime17.toString();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        boolean boolean21 = strSet1.equals((java.lang.Object) dateTime17);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.secondOfMinute();
        mutableDateTime23.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean29 = strSet1.remove((java.lang.Object) mutableDateTime23);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter32.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.monthOfYear();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = chronology40.days();
        org.joda.time.Chronology chronology45 = chronology40.withUTC();
        mutableDateTime23.setChronology(chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime23", (dateTime17.compareTo(mutableDateTime23) == 0) == dateTime17.equals(mutableDateTime23));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.withYear((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime6.withDayOfYear((int) '#');
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime21 = dateTime6.plus((-9223309849910400000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        java.lang.String[] strArray6 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet1.containsAll((java.util.Collection<java.lang.String>) strList7);
        java.lang.Object[] objArray10 = strSet1.toArray();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime(dateTimeZone15);
        java.lang.String str18 = dateTime17.toString();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        boolean boolean21 = strSet1.equals((java.lang.Object) dateTime17);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.secondOfMinute();
        mutableDateTime23.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean29 = strSet1.remove((java.lang.Object) mutableDateTime23);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter32.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.monthOfYear();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = chronology40.days();
        org.joda.time.Chronology chronology45 = chronology40.withUTC();
        mutableDateTime23.setChronology(chronology45);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime23", (dateTime17.compareTo(mutableDateTime23) == 0) == dateTime17.equals(mutableDateTime23));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = dateTimeZone2.getName((long) (byte) -1, locale5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime13.minusWeeks(10);
        org.joda.time.DateTime.Property property19 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime21 = dateTime13.plusMillis((-292275054));
        int int22 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime21);
        mutableDateTime0.setZoneRetainFields(dateTimeZone2);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime(dateTimeZone28);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.DateTime dateTime33 = dateTime30.plus((long) 100);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfCentury();
        boolean boolean35 = property34.isLeap();
        org.joda.time.DateTime dateTime36 = property34.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime37 = property34.roundHalfFloorCopy();
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        int int39 = property34.getMaximumShortTextLength(locale38);
        java.lang.String str40 = property34.toString();
        org.joda.time.DateTime dateTime42 = property34.addWrapFieldToCopy(25);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) dateTime42);
        mutableDateTime0.addHours(2922750);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (-1), chronology47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        org.joda.time.DateTime dateTime52 = localDateTime48.toDateTime(dateTimeZone50);
        java.lang.String str53 = dateTime52.toString();
        org.joda.time.DateTime dateTime55 = dateTime52.plus((long) 100);
        org.joda.time.DateTime dateTime57 = dateTime55.minusSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.DateTime dateTime59 = dateTime55.minus(readablePeriod58);
        boolean boolean60 = dateTime59.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime62 = org.joda.time.MutableDateTime.now(dateTimeZone61);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) (-1), chronology64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.DateTime dateTime69 = localDateTime65.toDateTime(dateTimeZone67);
        org.joda.time.Chronology chronology70 = dateTime69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.hours();
        org.joda.time.DateTimeField dateTimeField72 = chronology70.secondOfMinute();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) (-1), chronology74);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.weekyear();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.minusHours((-1));
        java.util.Locale locale79 = java.util.Locale.JAPANESE;
        java.lang.String str80 = dateTimeField72.getAsText((org.joda.time.ReadablePartial) localDateTime75, locale79);
        int int82 = dateTimeField72.getLeapAmount((long) (-1));
        int int83 = mutableDateTime62.get(dateTimeField72);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.LocalDateTime localDateTime86 = new org.joda.time.LocalDateTime((long) (-1), chronology85);
        org.joda.time.LocalDateTime.Property property87 = localDateTime86.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone89 = dateTimeZone88.toTimeZone();
        org.joda.time.DateTime dateTime90 = localDateTime86.toDateTime(dateTimeZone88);
        org.joda.time.Chronology chronology91 = dateTime90.getChronology();
        org.joda.time.DateTimeField dateTimeField92 = chronology91.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime93 = new org.joda.time.MutableDateTime(chronology91);
        org.joda.time.DateTime dateTime94 = mutableDateTime62.toDateTime(chronology91);
        java.lang.String str95 = chronology91.toString();
        org.joda.time.DateTime dateTime96 = dateTime59.toDateTime(chronology91);
        org.joda.time.DateTimeField dateTimeField97 = chronology91.hourOfHalfday();
        org.joda.time.DateTime dateTime98 = mutableDateTime0.toDateTime(chronology91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime62", (instant1.compareTo(mutableDateTime62) == 0) == instant1.equals(mutableDateTime62));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(9);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = localDateTime28.toDateTime(dateTimeZone30);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfDay();
        org.joda.time.DurationField durationField35 = chronology33.minutes();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekyearOfCentury();
        org.joda.time.Chronology chronology37 = chronology33.withUTC();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = chronology37.getZone();
        org.joda.time.DateTime dateTime40 = dateTime24.toDateTime(dateTimeZone39);
        int int42 = dateTimeZone39.getOffsetFromLocal((long) 86399999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime40", (dateTime24.compareTo(dateTime40) == 0) == dateTime24.equals(dateTime40));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor3 = strSet2.iterator();
        java.lang.String[] strArray7 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet2.containsAll((java.util.Collection<java.lang.String>) strList8);
        java.lang.Object[] objArray11 = strSet2.toArray();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        java.lang.String str19 = dateTime18.toString();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.plus(readableDuration20);
        boolean boolean22 = strSet2.equals((java.lang.Object) dateTime18);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.secondOfMinute();
        mutableDateTime24.setTime((org.joda.time.ReadableInstant) mutableDateTime27);
        boolean boolean30 = strSet2.remove((java.lang.Object) mutableDateTime24);
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (-1), chronology35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTime dateTime40 = localDateTime36.toDateTime(dateTimeZone38);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter33.withChronology(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.monthOfYear();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.clockhourOfHalfday();
        org.joda.time.DurationField durationField45 = chronology41.days();
        org.joda.time.Chronology chronology46 = chronology41.withUTC();
        mutableDateTime24.setChronology(chronology46);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(1998L, chronology46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime24", (dateTime18.compareTo(mutableDateTime24) == 0) == dateTime18.equals(mutableDateTime24));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMinutes(2);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime11.minus(readablePeriod16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int19 = dateTime11.get(dateTimeFieldType18);
        org.joda.time.DateTime.Property property20 = dateTime11.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getRangeDurationType();
        java.lang.String str23 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property24 = dateTime11.property(dateTimeFieldType21);
        org.joda.time.Instant instant25 = dateTime11.toInstant();
        org.joda.time.DateTime.Property property26 = dateTime11.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant25", (dateTime11.compareTo(instant25) == 0) == dateTime11.equals(instant25));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.minus(readablePeriod12);
        boolean boolean14 = dateTime13.isAfterNow();
        org.joda.time.Instant instant15 = dateTime13.toInstant();
        boolean boolean16 = dateTime13.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant15", (dateTime13.compareTo(instant15) == 0) == dateTime13.equals(instant15));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        long long5 = dateTimeZone0.convertLocalToUTC((long) (-292275054), false, (long) (short) 0);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        java.lang.String str9 = dateTimeZone0.getName((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        mutableDateTime10.add(0L);
        org.joda.time.DateTime dateTime13 = mutableDateTime10.toDateTimeISO();
        org.joda.time.DateTime dateTime14 = dateTime13.withEarlierOffsetAtOverlap();
        int int15 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime24 = localDateTime20.toDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.secondOfDay();
        org.joda.time.DurationField durationField27 = chronology25.minutes();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.weekyearOfCentury();
        org.joda.time.Chronology chronology29 = chronology25.withUTC();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((-315619200000L), chronology29);
        boolean boolean32 = dateTimeZone0.isLocalDateTimeGap(localDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime30", (mutableDateTime1.compareTo(dateTime30) == 0) == mutableDateTime1.equals(dateTime30));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField10 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.weekyearOfCentury();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DurationField durationField14 = chronology12.seconds();
        org.joda.time.DurationField durationField15 = chronology12.minutes();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((-70761599880L), chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField15", (durationField10.compareTo(durationField15) == 0) == durationField10.equals(durationField15));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        mutableDateTime0.setSecondOfDay((int) '#');
        mutableDateTime0.setYear(50);
        mutableDateTime0.addMinutes(1969);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        long long13 = dateTimeZone8.convertLocalToUTC((long) (-292275054), false, (long) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        java.lang.String str17 = dateTimeZone8.getName((long) (byte) 100);
        java.lang.String str18 = dateTimeZone8.getID();
        mutableDateTime0.setZone(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime9", (instant1.compareTo(mutableDateTime9) == 0) == instant1.equals(mutableDateTime9));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.LocalDateTime localDateTime13 = dateTime12.toLocalDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        mutableDateTime14.add(0L);
        org.joda.time.DateTime dateTime17 = mutableDateTime14.toDateTimeISO();
        org.joda.time.DateTime.Property property18 = dateTime17.centuryOfEra();
        org.joda.time.DateTime dateTime20 = dateTime17.minusSeconds((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getRangeDurationType();
        org.joda.time.DateTime dateTime24 = dateTime20.withFieldAdded(durationFieldType22, (int) (short) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (-1), chronology30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = localDateTime31.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter28.withChronology(chronology36);
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(2022L, chronology36, locale38);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.hourOfHalfday();
        org.joda.time.DurationField durationField41 = chronology36.halfdays();
        org.joda.time.DurationField durationField42 = durationFieldType22.getField(chronology36);
        boolean boolean43 = localDateTime13.isSupported(durationFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime14", (dateTime12.compareTo(mutableDateTime14) == 0) == dateTime12.equals(mutableDateTime14));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateTime dateTime11 = dateTime8.plus((long) 100);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        boolean boolean13 = strSet1.equals((java.lang.Object) dateTime11);
        org.joda.time.DateTime dateTime15 = dateTime11.withDayOfWeek(1);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        long long27 = dateTimeZone25.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DateTime dateTime32 = dateTime17.withChronology(chronology30);
        org.joda.time.DurationField durationField33 = chronology30.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime32", (dateTime17.compareTo(dateTime32) == 0) == dateTime17.equals(dateTime32));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.withYear((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime6.withDayOfYear((int) '#');
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter22.withChronology(chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (-1), chronology35);
        boolean boolean37 = dateTimeZone32.isLocalDateTimeGap(localDateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        boolean boolean42 = dateTimeZone32.isLocalDateTimeGap(localDateTime40);
        long long44 = dateTimeZone32.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter22.withZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime46 = instant19.toMutableDateTime(dateTimeZone32);
        boolean boolean47 = dateTimeZone32.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.set(10);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        long long10 = dateTimeZone5.convertLocalToUTC((long) (-292275054), false, (long) (short) 0);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        mutableDateTime4.setZone(dateTimeZone5);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.DateTime dateTime22 = dateTime19.plus((long) 100);
        org.joda.time.DateTime.Property property23 = dateTime22.yearOfCentury();
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.util.Calendar calendar25 = dateTime22.toCalendar(locale24);
        int int26 = dateTime22.getMinuteOfHour();
        org.joda.time.DateTime dateTime28 = dateTime22.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property29 = dateTime22.era();
        boolean boolean31 = dateTime22.isEqual((long) 100);
        org.joda.time.DateTime dateTime33 = dateTime22.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime34 = dateTime22.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property35 = dateTime22.dayOfMonth();
        org.joda.time.DateTime dateTime37 = property35.addToCopy(9);
        org.joda.time.DateTime dateTime38 = dateTime37.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (-1), chronology40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        org.joda.time.DateTime dateTime45 = localDateTime41.toDateTime(dateTimeZone43);
        org.joda.time.Chronology chronology46 = dateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfDay();
        org.joda.time.DurationField durationField48 = chronology46.minutes();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.weekyearOfCentury();
        org.joda.time.Chronology chronology50 = chronology46.withUTC();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = chronology50.getZone();
        org.joda.time.DateTime dateTime53 = dateTime37.toDateTime(dateTimeZone52);
        mutableDateTime4.setZone(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and dateTime51", (mutableDateTime6.compareTo(dateTime51) == 0) == mutableDateTime6.equals(dateTime51));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.seconds();
        org.joda.time.DurationField durationField14 = chronology11.minutes();
        org.joda.time.DurationField durationField15 = chronology11.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField15", (durationField9.compareTo(durationField15) == 0) == durationField9.equals(durationField15));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        boolean boolean8 = mutableDateTime1.isAfter((long) 2022);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime1.copy();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (-1), chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDateTime12.toDateTime(dateTimeZone14);
        java.lang.String str17 = dateTime16.toString();
        org.joda.time.DateTime dateTime19 = dateTime16.plus((long) 100);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Calendar calendar22 = dateTime19.toCalendar(locale21);
        int int23 = dateTime19.getMinuteOfHour();
        org.joda.time.DateTime dateTime25 = dateTime19.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property26 = dateTime19.era();
        org.joda.time.DateTime dateTime27 = property26.roundHalfEvenCopy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (-1), chronology29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfYear();
        org.joda.time.DurationField durationField32 = property31.getLeapDurationField();
        org.joda.time.Interval interval33 = property31.toInterval();
        boolean boolean34 = dateTime27.equals((java.lang.Object) property31);
        java.lang.String str35 = property31.getAsShortText();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) str35, chronology36);
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime37.withYear(54);
        org.joda.time.Instant instant41 = dateTime37.toInstant();
        org.joda.time.DateTime dateTime43 = dateTime37.minusMinutes(103);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant41", (mutableDateTime9.compareTo(instant41) == 0) == mutableDateTime9.equals(instant41));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int19 = mutableDateTime1.get(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField21 = mutableDateTime20.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        mutableDateTime20.add(durationFieldType23, 100);
        mutableDateTime1.add(durationFieldType23, (int) (byte) 0);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (short) 1, chronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone33);
        org.joda.time.DateTime dateTime35 = dateTime30.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = mutableDateTime1.toDateTime(dateTimeZone33);
        org.joda.time.Instant instant37 = mutableDateTime1.toInstant();
        org.joda.time.DateTime dateTime38 = mutableDateTime1.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant37", (dateTime36.compareTo(instant37) == 0) == dateTime36.equals(instant37));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime2.setMillisOfDay(10);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime5.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getDurationType();
        mutableDateTime5.add(durationFieldType8, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter13.withChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.monthOfYear();
        org.joda.time.DurationField durationField24 = durationFieldType8.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = dateTimeField25.getType();
        boolean boolean27 = mutableDateTime2.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime30.set(dateTimeFieldType31, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime30.add(readablePeriod34, 4);
        int int37 = mutableDateTime30.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime30.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime30.copy();
        int int40 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.DateTime dateTime41 = mutableDateTime2.toDateTime(dateTimeZone28);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(31243724943L, dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime41", (mutableDateTime2.compareTo(dateTime41) == 0) == mutableDateTime2.equals(dateTime41));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(9);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfDay();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DurationField durationField37 = chronology34.minutes();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 292278993, chronology34);
        org.joda.time.Chronology chronology39 = chronology34.withUTC();
        org.joda.time.DurationField durationField40 = chronology39.weekyears();
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        org.joda.time.DurationField durationField42 = chronology41.months();
        org.joda.time.DateTime dateTime43 = dateTime25.withChronology(chronology41);
        org.joda.time.DurationField durationField44 = chronology41.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime43", (dateTime24.compareTo(dateTime43) == 0) == dateTime24.equals(dateTime43));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = mutableDateTime1.get(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.secondOfDay();
        org.joda.time.DurationField durationField23 = chronology21.minutes();
        org.joda.time.DurationField durationField24 = chronology21.minutes();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 292278993, chronology21);
        org.joda.time.Chronology chronology26 = chronology21.withUTC();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime1.toMutableDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime27", (mutableDateTime1.compareTo(mutableDateTime27) == 0) == mutableDateTime1.equals(mutableDateTime27));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.add((long) 31);
        mutableDateTime1.addMonths(6);
        org.joda.time.DateTime dateTime7 = mutableDateTime1.toDateTimeISO();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property10 = localDate8.property(dateTimeFieldType9);
        org.joda.time.LocalDate localDate12 = localDate8.withDayOfMonth(10);
        int int13 = localDate12.getWeekyear();
        org.joda.time.LocalDate localDate15 = localDate12.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate12.toDateMidnight(dateTimeZone16);
        org.joda.time.Chronology chronology18 = localDate12.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime7.toDateTime(chronology18);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime19", (mutableDateTime1.compareTo(dateTime19) == 0) == mutableDateTime1.equals(dateTime19));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(9);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfDay();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DurationField durationField37 = chronology34.minutes();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 292278993, chronology34);
        org.joda.time.Chronology chronology39 = chronology34.withUTC();
        org.joda.time.DurationField durationField40 = chronology39.weekyears();
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        org.joda.time.DurationField durationField42 = chronology41.months();
        org.joda.time.DateTime dateTime43 = dateTime25.withChronology(chronology41);
        java.lang.String str44 = chronology41.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime43", (dateTime24.compareTo(dateTime43) == 0) == dateTime24.equals(dateTime43));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.Instant instant18 = mutableDateTime1.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronology();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology30.add(readablePeriod32, (long) (-292275054), (int) '4');
        org.joda.time.DateTimeField dateTimeField36 = chronology30.halfdayOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter21.withChronology(chronology30);
        org.joda.time.DateTime dateTime38 = mutableDateTime1.toDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField39 = chronology30.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant18", (mutableDateTime1.compareTo(instant18) == 0) == mutableDateTime1.equals(instant18));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTime dateTime10 = dateTime7.plus((long) 100);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.util.Calendar calendar13 = dateTime10.toCalendar(locale12);
        int int14 = dateTime10.getMinuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime10.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property17 = dateTime10.era();
        boolean boolean19 = dateTime10.isEqual((long) 100);
        org.joda.time.DateTime dateTime21 = dateTime10.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime22 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime25 = property23.addToCopy(9);
        org.joda.time.DateTime dateTime26 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfDay();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.weekyearOfCentury();
        org.joda.time.Chronology chronology38 = chronology34.withUTC();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = chronology38.getZone();
        org.joda.time.DateTime dateTime41 = dateTime25.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(obj0, dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime41", (dateTime25.compareTo(dateTime41) == 0) == dateTime25.equals(dateTime41));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear(10);
        org.joda.time.DateTime.Property property12 = dateTime9.monthOfYear();
        org.joda.time.DateTime dateTime13 = property12.roundCeilingCopy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.DurationField durationField25 = chronology22.minutes();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 292278993, chronology22);
        org.joda.time.Chronology chronology27 = chronology22.withUTC();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.DateTime dateTime29 = dateTime13.withChronology(chronology27);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = chronology10.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = chronology10.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.years();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField17", (durationField14.compareTo(durationField17) == 0) == durationField14.equals(durationField17));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("365");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate7 = localDate5.plusWeeks((-292275054));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.LocalDate localDate10 = dateTime9.toLocalDate();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays((int) (byte) 0);
        java.util.Date date13 = dateTime12.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime12.getZone();
        org.joda.time.Interval interval15 = localDate5.toInterval(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate1.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.LocalDate.Property property17 = localDate1.dayOfYear();
        org.joda.time.Chronology chronology18 = localDate1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime19", (dateTime9.compareTo(mutableDateTime19) == 0) == dateTime9.equals(mutableDateTime19));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(9);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfDay();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DurationField durationField37 = chronology34.minutes();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 292278993, chronology34);
        org.joda.time.Chronology chronology39 = chronology34.withUTC();
        org.joda.time.DurationField durationField40 = chronology39.weekyears();
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        org.joda.time.DurationField durationField42 = chronology41.months();
        org.joda.time.DateTime dateTime43 = dateTime25.withChronology(chronology41);
        org.joda.time.DateTime.Property property44 = dateTime25.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime43", (dateTime25.compareTo(dateTime43) == 0) == dateTime25.equals(dateTime43));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime6.millisOfSecond();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 1, chronology12);
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) (byte) 0, 292278993);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime6.withPeriodAdded(readablePeriod18, 1);
        org.joda.time.DateTime dateTime21 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        mutableDateTime22.add((long) 100);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTime dateTime31 = localDateTime27.toDateTime(dateTimeZone29);
        java.lang.String str32 = dateTime31.toString();
        org.joda.time.DateTime dateTime34 = dateTime31.plus((long) 100);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        java.util.Locale locale36 = java.util.Locale.GERMANY;
        java.util.Calendar calendar37 = dateTime34.toCalendar(locale36);
        int int38 = dateTime34.getMinuteOfHour();
        boolean boolean39 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Instant instant40 = mutableDateTime22.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime22.property(dateTimeFieldType41);
        org.joda.time.DateTime dateTime44 = dateTime21.withField(dateTimeFieldType41, 123);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant40", (mutableDateTime22.compareTo(instant40) == 0) == mutableDateTime22.equals(instant40));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        org.joda.time.DateTime.Property property13 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant15", (dateTime16.compareTo(instant15) == 0) == dateTime16.equals(instant15));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField11 = chronology9.minutes();
        org.joda.time.DurationField durationField12 = chronology9.minutes();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 292278993, chronology9);
        org.joda.time.Chronology chronology14 = chronology9.withUTC();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.Chronology chronology16 = chronology14.withUTC();
        org.joda.time.DurationField durationField17 = chronology16.months();
        boolean boolean18 = durationFieldType0.isSupported(chronology16);
        org.joda.time.DateTimeField dateTimeField19 = chronology16.secondOfMinute();
        java.util.Locale locale20 = null;
        int int21 = dateTimeField19.getMaximumTextLength(locale20);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.DurationField durationField28 = property27.getLeapDurationField();
        org.joda.time.Interval interval29 = property27.toInterval();
        long long30 = property27.remainder();
        java.lang.String str31 = property27.toString();
        org.joda.time.LocalDateTime localDateTime33 = property27.setCopy((int) (short) 1);
        int int34 = localDateTime33.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localDateTime33.getFieldType(0);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (-1), chronology41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTime dateTime46 = localDateTime42.toDateTime(dateTimeZone44);
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.halfdayOfDay();
        mutableDateTime39.setChronology(chronology47);
        org.joda.time.DurationField durationField50 = chronology47.years();
        org.joda.time.DateTimeField dateTimeField51 = chronology47.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField52 = chronology47.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType37.getField(chronology47);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) (-1), chronology55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone59 = dateTimeZone58.toTimeZone();
        org.joda.time.DateTime dateTime60 = localDateTime56.toDateTime(dateTimeZone58);
        org.joda.time.Chronology chronology61 = dateTime60.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.hours();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.dayOfYear();
        org.joda.time.DateTimeField dateTimeField64 = chronology61.clockhourOfDay();
        java.util.Locale locale67 = new java.util.Locale("2022");
        java.lang.String str68 = dateTimeField64.getAsText(0L, locale67);
        java.lang.String str69 = locale67.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket(67223251L, chronology47, locale67, (java.lang.Integer) 906);
        java.lang.String str72 = dateTimeField19.getAsText(45, locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField50", (durationField15.compareTo(durationField50) == 0) == durationField15.equals(durationField50));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.withYear((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime6.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime20 = dateTime6.minusDays((int) (byte) -1);
        org.joda.time.Instant instant21 = dateTime6.toInstant();
        org.joda.time.DateTime.Property property22 = dateTime6.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant21", (dateTime6.compareTo(instant21) == 0) == dateTime6.equals(instant21));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DurationField durationField10 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(chronology7);
        long long16 = chronology7.add(3218832000030L, 55L, (-292275055));
        org.joda.time.DurationField durationField17 = chronology7.eras();
        org.joda.time.DurationField durationField18 = chronology7.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = chronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = chronology7.centuryOfEra();
        org.joda.time.DurationField durationField17 = chronology7.eras();
        long long21 = chronology7.add(1317600000L, 59997L, 38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.withYear((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime6.withDayOfYear((int) '#');
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter22.withChronology(chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (-1), chronology35);
        boolean boolean37 = dateTimeZone32.isLocalDateTimeGap(localDateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        boolean boolean42 = dateTimeZone32.isLocalDateTimeGap(localDateTime40);
        long long44 = dateTimeZone32.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter22.withZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime46 = instant19.toMutableDateTime(dateTimeZone32);
        long long48 = dateTimeZone32.previousTransition(31536000001L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(9);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = localDateTime28.toDateTime(dateTimeZone30);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfDay();
        org.joda.time.DurationField durationField35 = chronology33.minutes();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekyearOfCentury();
        org.joda.time.Chronology chronology37 = chronology33.withUTC();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = chronology37.getZone();
        org.joda.time.DateTime dateTime40 = dateTime24.toDateTime(dateTimeZone39);
        int int42 = dateTimeZone39.getOffset((-79589347199993L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime40", (dateTime24.compareTo(dateTime40) == 0) == dateTime24.equals(dateTime40));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        java.lang.String[] strArray6 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet1.containsAll((java.util.Collection<java.lang.String>) strList7);
        java.lang.Object[] objArray10 = strSet1.toArray();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime(dateTimeZone15);
        java.lang.String str18 = dateTime17.toString();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        boolean boolean21 = strSet1.equals((java.lang.Object) dateTime17);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.secondOfMinute();
        mutableDateTime23.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean29 = strSet1.remove((java.lang.Object) mutableDateTime23);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter32.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.monthOfYear();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = chronology40.days();
        org.joda.time.Chronology chronology45 = chronology40.withUTC();
        mutableDateTime23.setChronology(chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime23", (dateTime17.compareTo(mutableDateTime23) == 0) == dateTime17.equals(mutableDateTime23));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTime dateTime4 = dateTime1.minusDays((int) (byte) 0);
        java.util.Date date5 = dateTime4.toDate();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime4.getZone();
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTimeISO();
        org.joda.time.DateTime.Property property8 = dateTime4.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withPeriodAdded(readablePeriod9, 8);
        org.joda.time.DateTime dateTime13 = dateTime4.plusYears((-292273084));
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property17 = localDate15.property(dateTimeFieldType16);
        org.joda.time.LocalDate localDate19 = localDate15.withDayOfMonth(10);
        org.joda.time.LocalDate.Property property20 = localDate15.dayOfYear();
        org.joda.time.LocalDate localDate22 = localDate15.plusWeeks((int) '4');
        org.joda.time.Chronology chronology23 = localDate15.getChronology();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(485977104000023L, chronology23);
        org.joda.time.DateTime dateTime25 = dateTime4.toDateTime(chronology23);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property28 = localDate26.property(dateTimeFieldType27);
        org.joda.time.LocalDate localDate30 = localDate26.withDayOfMonth(10);
        org.joda.time.LocalDate.Property property31 = localDate26.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property31.getFieldType();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.DateTime dateTime35 = dateTime4.withField(dateTimeFieldType32, 1970);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime25", (dateTime4.compareTo(dateTime25) == 0) == dateTime4.equals(dateTime25));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        boolean boolean18 = dateTimeZone13.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekyear();
        boolean boolean23 = dateTimeZone13.isLocalDateTimeGap(localDateTime21);
        long long25 = dateTimeZone13.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter3.withZone(dateTimeZone13);
        long long28 = dateTimeZone13.nextTransition((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 1970, dateTimeZone13);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter32.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.monthOfYear();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = chronology40.days();
        org.joda.time.Chronology chronology45 = chronology40.withUTC();
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime29.toMutableDateTime(chronology45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.DateTime dateTime48 = dateTime29.minus(readablePeriod47);
        boolean boolean49 = dateTime29.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime46 and dateTime29", (mutableDateTime46.compareTo(dateTime29) == 0) == mutableDateTime46.equals(dateTime29));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime2.add((long) '#');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        int int11 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        boolean boolean12 = mutableDateTime2.equals((java.lang.Object) mutableDateTime10);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property22 = localTime20.property(dateTimeFieldType21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder16.appendFraction(dateTimeFieldType21, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatterBuilder25.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter26.withOffsetParsed();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.parse("2022", dateTimeFormatter27);
        java.lang.String str29 = mutableDateTime13.toString(dateTimeFormatter27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant14", (mutableDateTime2.compareTo(instant14) == 0) == mutableDateTime2.equals(instant14));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = chronology11.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField15 = chronology11.weekyears();
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 90, chronology11, locale16, (java.lang.Integer) 13, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime21.setMillisOfDay(10);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField25 = mutableDateTime24.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getDurationType();
        mutableDateTime24.add(durationFieldType27, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter32.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.monthOfYear();
        org.joda.time.DurationField durationField43 = durationFieldType27.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = dateTimeField44.getType();
        boolean boolean46 = mutableDateTime21.isSupported(dateTimeFieldType45);
        dateTimeParserBucket19.saveField(dateTimeFieldType45, 33);
        long long49 = dateTimeParserBucket19.computeMillis();
        org.joda.time.Chronology chronology50 = dateTimeParserBucket19.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField15, and durationField43", !(durationField51.compareTo(durationField15) == 0) || (Math.signum(durationField51.compareTo(durationField43)) == Math.signum(durationField15.compareTo(durationField43))));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.seconds();
        org.joda.time.DurationFieldType durationFieldType14 = durationField13.getType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology22);
        java.lang.String str26 = chronology22.toString();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology22);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        boolean boolean29 = durationFieldType14.isSupported(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime27", (dateTime12.compareTo(dateTime27) == 0) == dateTime12.equals(dateTime27));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.minuteOfDay();
        org.joda.time.DurationField durationField13 = chronology7.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.millisOfSecond();
        org.joda.time.DurationField durationField15 = chronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField13", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField13)) == Math.signum(durationField9.compareTo(durationField13))));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateTime dateTime11 = dateTime8.plus((long) 100);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.util.Calendar calendar14 = dateTime11.toCalendar(locale13);
        org.joda.time.DateTime.Property property15 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime16 = property15.roundCeilingCopy();
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra(1);
        int int19 = dateTime16.getMillisOfSecond();
        org.joda.time.DateTime dateTime21 = dateTime16.minusHours(22);
        boolean boolean22 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime.Property property23 = dateTime21.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant1", (mutableDateTime0.compareTo(instant1) == 0) == mutableDateTime0.equals(instant1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) '4');
        long long7 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        int int9 = property3.getMinimumValue();
        int int10 = property3.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField11 = property3.getField();
        org.joda.time.LocalDateTime localDateTime13 = property3.addToCopy(23);
        org.joda.time.LocalDateTime localDateTime14 = property3.roundCeilingCopy();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField16 = mutableDateTime15.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getDurationType();
        mutableDateTime15.add(durationFieldType18, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter23.withChronology(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.monthOfYear();
        org.joda.time.DurationField durationField34 = durationFieldType18.getField(chronology31);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (-1), chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTime dateTime41 = localDateTime37.toDateTime(dateTimeZone39);
        org.joda.time.Chronology chronology42 = dateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.secondOfDay();
        org.joda.time.DurationField durationField44 = chronology42.minutes();
        org.joda.time.DurationField durationField45 = chronology42.minutes();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now(chronology42);
        org.joda.time.DurationField durationField48 = durationFieldType18.getField(chronology42);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (-1), chronology51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.weekyear();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        long long59 = dateTimeZone57.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime52.withFields((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.Chronology chronology62 = localDateTime61.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.secondOfDay();
        org.joda.time.DateTimeField dateTimeField64 = chronology62.yearOfEra();
        org.joda.time.DateTimeField dateTimeField65 = chronology62.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((-4L), chronology62);
        org.joda.time.DurationField durationField67 = durationFieldType18.getField(chronology62);
        boolean boolean68 = localDateTime14.isSupported(durationFieldType18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField34 and durationField67", (durationField34.compareTo(durationField67) == 0) == durationField34.equals(durationField67));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime7.minusWeeks(10);
        boolean boolean14 = dateTime7.isBefore((long) (-1));
        int int15 = dateTime7.getYearOfEra();
        org.joda.time.DateTime dateTime17 = dateTime7.withYear((int) (byte) 0);
        int int18 = dateTime7.getDayOfWeek();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.secondOfDay();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.weekyearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime7.withChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.dayOfWeek();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(10L, chronology26);
        int int33 = dateTime32.getMillisOfDay();
        java.util.GregorianCalendar gregorianCalendar34 = dateTime32.toGregorianCalendar();
        org.joda.time.Instant instant35 = dateTime32.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType36.getRangeDurationType();
        int int38 = instant35.get(dateTimeFieldType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (-1), chronology41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.weekyear();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        long long49 = dateTimeZone47.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime42.withFields((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.Chronology chronology52 = localDateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime55.set(dateTimeFieldType56, (-292275054));
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime55.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType60.getField(chronology61);
        boolean boolean64 = dateTimeField62.isLeap(100L);
        mutableDateTime55.setRounding(dateTimeField62);
        java.util.Locale locale66 = java.util.Locale.TAIWAN;
        java.lang.String str67 = locale66.toLanguageTag();
        java.util.Locale locale68 = java.util.Locale.GERMANY;
        java.lang.String str69 = locale66.getDisplayScript(locale68);
        java.util.Set<java.lang.Character> charSet70 = locale66.getExtensionKeys();
        int int71 = dateTimeField62.getMaximumShortTextLength(locale66);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket(724690124946L, chronology52, locale66, (java.lang.Integer) 69);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((long) (-1), chronology75);
        org.joda.time.LocalDateTime.Property property77 = localDateTime76.weekyear();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime79 = org.joda.time.MutableDateTime.now(dateTimeZone78);
        int int80 = property77.compareTo((org.joda.time.ReadableInstant) mutableDateTime79);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime82 = org.joda.time.MutableDateTime.now(dateTimeZone81);
        org.joda.time.ReadableDuration readableDuration83 = null;
        mutableDateTime82.add(readableDuration83, 100);
        boolean boolean86 = mutableDateTime79.isBefore((org.joda.time.ReadableInstant) mutableDateTime82);
        mutableDateTime82.setTime(31243724946L);
        org.joda.time.Chronology chronology89 = mutableDateTime82.getChronology();
        boolean boolean90 = dateTimeParserBucket73.restoreState((java.lang.Object) chronology89);
        long long93 = dateTimeParserBucket73.computeMillis(true, "2022-02-21T15:06:30.457+00:00:00.003");
        org.joda.time.Chronology chronology94 = dateTimeParserBucket73.getChronology();
        org.joda.time.MutableDateTime mutableDateTime95 = org.joda.time.MutableDateTime.now(chronology94);
        org.joda.time.DateTimeField dateTimeField96 = dateTimeFieldType36.getField(chronology94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant35", (dateTime32.compareTo(instant35) == 0) == dateTime32.equals(instant35));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        java.lang.String str1 = durationFieldType0.toString();
        java.lang.String str2 = durationFieldType0.toString();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.year();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.set(10);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (-1), chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = localDateTime10.toDateTime(dateTimeZone12);
        java.lang.String str15 = dateTime14.toString();
        org.joda.time.DateTime dateTime17 = dateTime14.plus((long) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.minusSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.minus(readablePeriod20);
        boolean boolean22 = dateTime21.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTime dateTime31 = localDateTime27.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.hours();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.secondOfMinute();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (-1), chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.weekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusHours((-1));
        java.util.Locale locale41 = java.util.Locale.JAPANESE;
        java.lang.String str42 = dateTimeField34.getAsText((org.joda.time.ReadablePartial) localDateTime37, locale41);
        int int44 = dateTimeField34.getLeapAmount((long) (-1));
        int int45 = mutableDateTime24.get(dateTimeField34);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (-1), chronology47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        org.joda.time.DateTime dateTime52 = localDateTime48.toDateTime(dateTimeZone50);
        org.joda.time.Chronology chronology53 = dateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology53);
        org.joda.time.DateTime dateTime56 = mutableDateTime24.toDateTime(chronology53);
        java.lang.String str57 = chronology53.toString();
        org.joda.time.DateTime dateTime58 = dateTime21.toDateTime(chronology53);
        mutableDateTime7.setChronology(chronology53);
        java.lang.String str60 = chronology53.toString();
        org.joda.time.DateTimeField dateTimeField61 = chronology53.millisOfDay();
        boolean boolean62 = durationFieldType0.isSupported(chronology53);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) (-1), chronology64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.DateTime dateTime69 = localDateTime65.toDateTime(dateTimeZone67);
        org.joda.time.Chronology chronology70 = dateTime69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.secondOfDay();
        org.joda.time.DurationField durationField72 = chronology70.minutes();
        org.joda.time.DateTimeField dateTimeField73 = chronology70.weekyearOfCentury();
        org.joda.time.Chronology chronology74 = chronology70.withUTC();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.centuryOfEra();
        org.joda.time.DurationField durationField76 = chronology74.minutes();
        boolean boolean77 = durationFieldType0.isSupported(chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField72 and durationField76", (durationField72.compareTo(durationField76) == 0) == durationField72.equals(durationField76));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        long long10 = dateTimeZone8.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime16.set(dateTimeFieldType17, (-292275054));
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        boolean boolean25 = dateTimeField23.isLeap(100L);
        mutableDateTime16.setRounding(dateTimeField23);
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale27.getDisplayScript(locale29);
        java.util.Set<java.lang.Character> charSet31 = locale27.getExtensionKeys();
        int int32 = dateTimeField23.getMaximumShortTextLength(locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(724690124946L, chronology13, locale27, (java.lang.Integer) 69);
        org.joda.time.DurationField durationField35 = chronology13.eras();
        org.joda.time.DateTimeField dateTimeField36 = chronology13.monthOfYear();
        org.joda.time.DurationField durationField37 = dateTimeField36.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField37, and durationField35", !(durationField35.compareTo(durationField37) == 0) || (Math.signum(durationField35.compareTo(durationField35)) == Math.signum(durationField37.compareTo(durationField35))));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear(10);
        org.joda.time.DateTime.Property property12 = dateTime9.monthOfYear();
        org.joda.time.DateTime dateTime13 = property12.roundCeilingCopy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.DurationField durationField25 = chronology22.minutes();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 292278993, chronology22);
        org.joda.time.Chronology chronology27 = chronology22.withUTC();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.DateTime dateTime29 = dateTime13.withChronology(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime13.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        long long36 = dateTimeZone31.convertLocalToUTC((long) (-292275054), false, (long) (short) 0);
        long long38 = dateTimeZone31.previousTransition((long) 3);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime13, dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime13", (dateTime29.compareTo(dateTime13) == 0) == dateTime29.equals(dateTime13));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        mutableDateTime1.setYear(292278993);
        mutableDateTime1.setMillisOfSecond(59);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = dateTime18.plusMillis(0);
        org.joda.time.Instant instant23 = dateTime18.toInstant();
        long long24 = dateTime18.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant23", (mutableDateTime1.compareTo(instant23) == 0) == mutableDateTime1.equals(instant23));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.DateTime dateTime14 = dateTime11.plus((long) 100);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.util.Calendar calendar17 = dateTime14.toCalendar(locale16);
        int int18 = dateTime14.getMinuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime14.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property21 = dateTime14.era();
        boolean boolean23 = dateTime14.isEqual((long) 100);
        org.joda.time.DateTime dateTime25 = dateTime14.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime26 = dateTime14.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property27 = dateTime14.dayOfMonth();
        org.joda.time.DateTime dateTime29 = property27.addWrapFieldToCopy(31);
        int int30 = dateTime29.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 4);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(1640995199997L, dateTimeZone34);
        java.lang.String str37 = dateTimeZone34.getShortName((-725846400000L));
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime29.toMutableDateTime(dateTimeZone34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter4.withZone(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime38", (dateTime14.compareTo(mutableDateTime38) == 0) == dateTime14.equals(mutableDateTime38));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear(10);
        org.joda.time.DateTime.Property property12 = dateTime9.monthOfYear();
        org.joda.time.DateTime dateTime13 = property12.roundCeilingCopy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.DurationField durationField25 = chronology22.minutes();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 292278993, chronology22);
        org.joda.time.Chronology chronology27 = chronology22.withUTC();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.DateTime dateTime29 = dateTime13.withChronology(chronology27);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfWeek();
        org.joda.time.DateTime dateTime31 = property30.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology11);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(5101200000L, chronology11);
        org.joda.time.DurationField durationField17 = chronology11.centuries();
        org.joda.time.DurationField durationField18 = chronology11.eras();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField20 = mutableDateTime19.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        mutableDateTime19.add(durationFieldType22, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (-1), chronology29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        org.joda.time.DateTime dateTime34 = localDateTime30.toDateTime(dateTimeZone32);
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter27.withChronology(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.monthOfYear();
        org.joda.time.DurationField durationField38 = durationFieldType22.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField39 = chronology35.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(chronology35);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        long long44 = dateTimeZone41.convertLocalToUTC(1123200000L, false);
        mutableDateTime40.setZoneRetainFields(dateTimeZone41);
        org.joda.time.Chronology chronology46 = chronology11.withZone(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField18", Math.signum(durationField17.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField17)));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("365");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate7 = localDate5.plusWeeks((-292275054));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.LocalDate localDate10 = dateTime9.toLocalDate();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays((int) (byte) 0);
        java.util.Date date13 = dateTime12.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime12.getZone();
        org.joda.time.Interval interval15 = localDate5.toInterval(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate1.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.LocalDate.Property property17 = localDate1.dayOfYear();
        org.joda.time.Chronology chronology18 = localDate1.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.eras();
        org.joda.time.DurationField durationField20 = chronology18.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField20, and durationField19", !(durationField19.compareTo(durationField20) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField20.compareTo(durationField19))));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("365");
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) 'u');
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate1.withPeriodAdded(readablePeriod4, (int) '4');
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtMidnight();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone10);
        java.lang.String str14 = dateTimeZone10.toString();
        org.joda.time.DateTime dateTime15 = mutableDateTime8.toDateTime(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DurationField durationField10 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(chronology7);
        long long16 = chronology7.add(3218832000030L, 55L, (-292275055));
        org.joda.time.DurationField durationField17 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology7.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.withYear((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime6.withDayOfYear((int) '#');
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter22.withChronology(chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (-1), chronology35);
        boolean boolean37 = dateTimeZone32.isLocalDateTimeGap(localDateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        boolean boolean42 = dateTimeZone32.isLocalDateTimeGap(localDateTime40);
        long long44 = dateTimeZone32.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter22.withZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime46 = instant19.toMutableDateTime(dateTimeZone32);
        long long48 = dateTimeZone32.convertUTCToLocal((-4L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(2072);
        org.joda.time.DateTime dateTime7 = localDate4.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(31243724949L, dateTimeZone6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime7", (mutableDateTime3.compareTo(dateTime7) == 0) == mutableDateTime3.equals(dateTime7));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.minuteOfHour();
        org.joda.time.DurationField durationField15 = chronology7.halfdays();
        org.joda.time.Chronology chronology16 = chronology7.withUTC();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        mutableDateTime19.add((long) 100);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        java.lang.String str29 = dateTime28.toString();
        org.joda.time.DateTime dateTime31 = dateTime28.plus((long) 100);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfCentury();
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.util.Calendar calendar34 = dateTime31.toCalendar(locale33);
        int int35 = dateTime31.getMinuteOfHour();
        boolean boolean36 = mutableDateTime19.isEqual((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Instant instant37 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime19.dayOfMonth();
        mutableDateTime19.setDate((long) 54469325);
        boolean boolean41 = mutableDateTime18.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime18.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime18.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime42", (dateTime11.compareTo(mutableDateTime42) == 0) == dateTime11.equals(mutableDateTime42));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology11.days();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 2922750, chronology11);
        org.joda.time.DurationField durationField17 = chronology11.weekyears();
        org.joda.time.DurationField durationField18 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField15, and durationField17", !(durationField18.compareTo(durationField15) == 0) || (Math.signum(durationField18.compareTo(durationField17)) == Math.signum(durationField15.compareTo(durationField17))));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy(31);
        int int25 = dateTime24.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 4);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(1640995199997L, dateTimeZone29);
        java.lang.String str32 = dateTimeZone29.getShortName((-725846400000L));
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime24.toMutableDateTime(dateTimeZone29);
        org.joda.time.DateTime.Property property34 = dateTime24.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and mutableDateTime33", (dateTime24.compareTo(mutableDateTime33) == 0) == dateTime24.equals(mutableDateTime33));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withMinuteOfHour(0);
        int int11 = localDateTime10.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withFieldAdded(durationFieldType12, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime24 = localDateTime20.toDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter17.withChronology(chronology25);
        org.joda.time.DurationField durationField27 = durationFieldType12.getField(chronology25);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime38 = localDateTime34.toDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter31.withChronology(chronology39);
        java.util.Locale locale41 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(2022L, chronology39, locale41);
        long long45 = dateTimeParserBucket42.computeMillis(false, "DurationField[minutes]");
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        dateTimeParserBucket42.setZone(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeParserBucket42.getZone();
        long long50 = dateTimeParserBucket42.computeMillis(false);
        org.joda.time.Chronology chronology51 = dateTimeParserBucket42.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.monthOfYear();
        org.joda.time.DurationField durationField53 = chronology51.hours();
        org.joda.time.DurationField durationField54 = durationFieldType12.getField(chronology51);
        java.lang.String str55 = chronology51.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField27 and durationField54", (durationField27.compareTo(durationField54) == 0) == durationField27.equals(durationField54));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.lang.String str21 = locale18.getDisplayVariant(locale20);
        java.util.Calendar calendar22 = dateTime15.toCalendar(locale18);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime15.minus(readablePeriod23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime15.plus(readablePeriod25);
        org.joda.time.Instant instant27 = dateTime15.toInstant();
        org.joda.time.DateTime dateTime28 = dateTime15.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant27", (dateTime28.compareTo(instant27) == 0) == dateTime28.equals(instant27));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy(31);
        int int25 = dateTime24.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 4);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(1640995199997L, dateTimeZone29);
        java.lang.String str32 = dateTimeZone29.getShortName((-725846400000L));
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime24.toMutableDateTime(dateTimeZone29);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime33", (dateTime9.compareTo(mutableDateTime33) == 0) == dateTime9.equals(mutableDateTime33));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone1.previousTransition((long) 1);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime5.setWeekyear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        long long13 = dateTimeZone8.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone14 = dateTimeZone8.toTimeZone();
        mutableDateTime5.setZone(dateTimeZone8);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone8);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone8, (long) 'u');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        boolean boolean24 = dateTimeZone19.isLocalDateTimeGap(localDateTime23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.weekyear();
        boolean boolean29 = dateTimeZone19.isLocalDateTimeGap(localDateTime27);
        long long31 = dateTimeZone19.nextTransition((long) 2022);
        long long33 = dateTimeZone19.nextTransition(3600000L);
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, 86400000L);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 1);
        int int38 = mutableDateTime37.getYearOfEra();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime37.add(readablePeriod39, 0);
        int int42 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime37.setZoneRetainFields(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(9223372017043200004L, dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone43);
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.now(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and mutableDateTime46", (dateTime16.compareTo(mutableDateTime46) == 0) == dateTime16.equals(mutableDateTime46));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        mutableDateTime1.setYear(292278993);
        mutableDateTime1.setMillisOfSecond(59);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = dateTime18.plusMillis(0);
        org.joda.time.Instant instant23 = dateTime18.toInstant();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime18.plus(readablePeriod24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant23", (mutableDateTime1.compareTo(instant23) == 0) == mutableDateTime1.equals(instant23));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime17 = dateTime15.withMillis((-1L));
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        int int19 = dateTime17.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.withPeriodAdded(readablePeriod20, 53);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(13);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getNameKey(4460845311L);
        int int29 = dateTimeZone24.getOffsetFromLocal(4460918356L);
        org.joda.time.DateTime dateTime30 = dateTime22.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField32 = mutableDateTime31.getRoundingField();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.dayOfWeek();
        int int34 = mutableDateTime31.getYear();
        mutableDateTime31.setMillis((long) 13);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime31.getZone();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        java.util.Locale locale42 = new java.util.Locale("365");
        java.lang.String str43 = dateTimeZone38.getShortName((long) 3, locale42);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime45 = mutableDateTime31.toDateTime(dateTimeZone38);
        long long47 = dateTimeZone24.getMillisKeepLocal(dateTimeZone38, 1998L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime30", (dateTime6.compareTo(dateTime30) == 0) == dateTime6.equals(dateTime30));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.minuteOfHour();
        org.joda.time.DurationField durationField15 = chronology7.halfdays();
        org.joda.time.Chronology chronology16 = chronology7.withUTC();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.DateTimeField dateTimeField19 = chronology16.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime18", (dateTime11.compareTo(mutableDateTime18) == 0) == dateTime11.equals(mutableDateTime18));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMinutes(2);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime11.minus(readablePeriod16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int19 = dateTime11.get(dateTimeFieldType18);
        org.joda.time.DateTime.Property property20 = dateTime11.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getRangeDurationType();
        java.lang.String str23 = dateTimeFieldType21.getName();
        org.joda.time.DateTime.Property property24 = dateTime11.property(dateTimeFieldType21);
        org.joda.time.Instant instant25 = dateTime11.toInstant();
        org.joda.time.DateTime dateTime28 = dateTime11.withDurationAdded(4461062117L, 35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant25", (dateTime11.compareTo(instant25) == 0) == dateTime11.equals(instant25));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.lang.String str21 = locale18.getDisplayVariant(locale20);
        java.util.Calendar calendar22 = dateTime15.toCalendar(locale18);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTime dateTime31 = localDateTime27.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.secondOfDay();
        org.joda.time.DurationField durationField34 = chronology32.minutes();
        org.joda.time.DurationField durationField35 = chronology32.minutes();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 292278993, chronology32);
        org.joda.time.Chronology chronology37 = chronology32.withUTC();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(45L, chronology37);
        org.joda.time.DateTimeField dateTimeField40 = chronology37.weekyear();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime15.toMutableDateTime(chronology37);
        org.joda.time.DurationField durationField42 = chronology37.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime41", (dateTime15.compareTo(mutableDateTime41) == 0) == dateTime15.equals(mutableDateTime41));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plus(readableDuration8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (-1), chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusHours(0);
        int int19 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime.Property property20 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.withMillisOfSecond(100);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.era();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTime dateTime25 = localDateTime22.toDateTime();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfDay();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.weekyearOfCentury();
        org.joda.time.Chronology chronology38 = chronology34.withUTC();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology38);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((-62040988799969L), chronology38);
        org.joda.time.DateTime dateTime41 = dateTime25.withChronology(chronology38);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime41", (dateTime25.compareTo(dateTime41) == 0) == dateTime25.equals(dateTime41));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField11 = chronology9.minutes();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology9);
        java.lang.String str13 = chronology9.toString();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DurationField durationField15 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType0.getField(chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField15", Math.signum(durationField11.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField11)));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.withYear((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime6.withDayOfYear((int) '#');
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        mutableDateTime20.add(0L);
        org.joda.time.DateTime dateTime23 = mutableDateTime20.toDateTimeISO();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime(dateTimeZone28);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.DateTime dateTime33 = dateTime30.plus((long) 100);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfCentury();
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.util.Calendar calendar36 = dateTime33.toCalendar(locale35);
        int int37 = dateTime33.getMinuteOfHour();
        org.joda.time.DateTime dateTime39 = dateTime33.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property40 = dateTime33.era();
        org.joda.time.DateTime dateTime41 = property40.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime42 = dateTime41.withLaterOffsetAtOverlap();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime44.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime44.add(readableDuration47, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType51 = dateTimeFieldType50.getDurationType();
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType50.getRangeDurationType();
        mutableDateTime44.add(durationFieldType52, (int) (short) 1);
        org.joda.time.DateTime dateTime56 = dateTime42.withFieldAdded(durationFieldType52, (int) 'u');
        mutableDateTime20.add(durationFieldType52, 2022);
        org.joda.time.DateTime dateTime60 = dateTime6.withFieldAdded(durationFieldType52, 2660);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTime dateTime10 = dateTime7.plus((long) 100);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.util.Calendar calendar13 = dateTime10.toCalendar(locale12);
        int int14 = dateTime10.getMinuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime10.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property17 = dateTime10.era();
        boolean boolean19 = dateTime10.isEqual((long) 100);
        org.joda.time.DateTime dateTime21 = dateTime10.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime22 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime25 = property23.addToCopy(9);
        org.joda.time.DateTime dateTime26 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime27 = dateTime26.withEarlierOffsetAtOverlap();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        java.util.Locale locale30 = java.util.Locale.PRC;
        java.lang.String str31 = locale30.getCountry();
        java.util.Calendar calendar32 = mutableDateTime29.toCalendar(locale30);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.fromCalendarFields(calendar32);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.fromCalendarFields(calendar32);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.centuryOfEra();
        org.joda.time.Chronology chronology36 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.months();
        org.joda.time.DateTime dateTime38 = dateTime27.toDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(31536000000L, chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime38", (dateTime25.compareTo(dateTime38) == 0) == dateTime25.equals(dateTime38));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        int int8 = durationField6.getValue((long) 1969);
        boolean boolean9 = durationField6.isSupported();
        java.lang.String str10 = durationField6.getName();
        org.joda.time.DurationFieldType durationFieldType11 = durationField6.getType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfDay();
        org.joda.time.DurationField durationField22 = chronology20.minutes();
        org.joda.time.DurationField durationField23 = chronology20.minutes();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 292278993, chronology20);
        org.joda.time.Chronology chronology25 = chronology20.withUTC();
        org.joda.time.DurationField durationField26 = chronology25.weekyears();
        boolean boolean27 = durationFieldType11.isSupported(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField26", (durationField6.compareTo(durationField26) == 0) == durationField6.equals(durationField26));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("365");
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths((int) 'u');
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate1.withPeriodAdded(readablePeriod4, (int) '4');
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtMidnight();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        int int10 = mutableDateTime8.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology8.add(readablePeriod10, (long) (-292275054), (int) '4');
        org.joda.time.DateTimeField dateTimeField14 = chronology8.halfdayOfDay();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.lang.String str16 = locale15.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 59, chronology8, locale15);
        java.lang.Object obj18 = dateTimeParserBucket17.saveState();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime26 = localDateTime22.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.secondOfDay();
        org.joda.time.DurationField durationField29 = chronology27.minutes();
        org.joda.time.DurationField durationField30 = chronology27.minutes();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 292278993, chronology27);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        java.util.Locale locale36 = new java.util.Locale("365");
        java.lang.String str37 = dateTimeZone32.getShortName((long) 3, locale36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) (-1), chronology43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone47 = dateTimeZone46.toTimeZone();
        org.joda.time.DateTime dateTime48 = localDateTime44.toDateTime(dateTimeZone46);
        java.lang.String str49 = dateTime48.toString();
        org.joda.time.DateTime dateTime51 = dateTime48.plus((long) 100);
        org.joda.time.DateTime dateTime53 = dateTime51.withYear(10);
        int int54 = property41.getDifference((org.joda.time.ReadableInstant) dateTime51);
        int int55 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) (-1), chronology57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone61 = dateTimeZone60.toTimeZone();
        org.joda.time.DateTime dateTime62 = localDateTime58.toDateTime(dateTimeZone60);
        org.joda.time.Chronology chronology63 = dateTime62.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        long long68 = chronology63.add(readablePeriod65, (long) (-292275054), (int) '4');
        org.joda.time.DateTimeField dateTimeField69 = chronology63.halfdayOfDay();
        org.joda.time.DateTime dateTime70 = dateTime51.toDateTime(chronology63);
        mutableDateTime31.setMillis((org.joda.time.ReadableInstant) dateTime70);
        boolean boolean72 = dateTimeParserBucket17.restoreState((java.lang.Object) dateTime70);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.DateTime dateTime75 = dateTime70.withPeriodAdded(readablePeriod73, 102);
        int int76 = dateTime75.getMonthOfYear();
        org.joda.time.Instant instant77 = dateTime75.toInstant();
        org.joda.time.DateTime.Property property78 = dateTime75.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime31 and instant77", (mutableDateTime31.compareTo(instant77) == 0) == mutableDateTime31.equals(instant77));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = dateTimeZone2.getName((long) (byte) -1, locale5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime13.minusWeeks(10);
        org.joda.time.DateTime.Property property19 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime21 = dateTime13.plusMillis((-292275054));
        int int22 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime21);
        mutableDateTime0.setZoneRetainFields(dateTimeZone2);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime(dateTimeZone28);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.DateTime dateTime33 = dateTime30.plus((long) 100);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfCentury();
        boolean boolean35 = property34.isLeap();
        org.joda.time.DateTime dateTime36 = property34.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime37 = property34.roundHalfFloorCopy();
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        int int39 = property34.getMaximumShortTextLength(locale38);
        java.lang.String str40 = property34.toString();
        org.joda.time.DateTime dateTime42 = property34.addWrapFieldToCopy(25);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (-1), chronology45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.weekyear();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        int int50 = property47.compareTo((org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutableDateTime52.add(readableDuration53, 100);
        boolean boolean56 = mutableDateTime49.isBefore((org.joda.time.ReadableInstant) mutableDateTime52);
        mutableDateTime49.add((-31556952000L));
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime49.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime61 = property59.add(0);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime63.setMillisOfDay(10);
        mutableDateTime63.setMillisOfSecond((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        mutableDateTime63.add(readablePeriod68, 365);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime63.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime63.weekyear();
        boolean boolean73 = mutableDateTime61.isEqual((org.joda.time.ReadableInstant) mutableDateTime63);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime52", (instant1.compareTo(mutableDateTime52) == 0) == instant1.equals(mutableDateTime52));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant1 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = dateTimeZone2.getName((long) (byte) -1, locale5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime13.minusWeeks(10);
        org.joda.time.DateTime.Property property19 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime21 = dateTime13.plusMillis((-292275054));
        int int22 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime21);
        mutableDateTime0.setZoneRetainFields(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant1", (mutableDateTime0.compareTo(instant1) == 0) == mutableDateTime0.equals(instant1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfDay();
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((-62040988800969L), chronology8, locale10, (java.lang.Integer) 5, (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType17.getField(chronology18);
        org.joda.time.DurationField durationField20 = dateTimeField19.getDurationField();
        dateTimeParserBucket16.saveField(dateTimeField19, (int) (short) 10);
        java.lang.Integer int23 = dateTimeParserBucket16.getOffsetInteger();
        dateTimeParserBucket16.setOffset(99);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.year();
        org.joda.time.MutableDateTime mutableDateTime30 = property28.set(10);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (-1), chronology32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.weekyear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (-1), chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTime dateTime41 = localDateTime37.toDateTime(dateTimeZone39);
        java.lang.String str42 = dateTime41.toString();
        org.joda.time.DateTime dateTime44 = dateTime41.plus((long) 100);
        org.joda.time.DateTime dateTime46 = dateTime44.withYear(10);
        int int47 = property34.getDifference((org.joda.time.ReadableInstant) dateTime44);
        boolean boolean48 = mutableDateTime30.isEqual((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime30.add(readablePeriod49, 0);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) (-1), chronology53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone57 = dateTimeZone56.toTimeZone();
        org.joda.time.DateTime dateTime58 = localDateTime54.toDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology59 = dateTime58.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.secondOfDay();
        org.joda.time.DurationField durationField61 = chronology59.minutes();
        org.joda.time.DurationField durationField62 = chronology59.seconds();
        org.joda.time.DateTime dateTime63 = mutableDateTime30.toDateTime(chronology59);
        org.joda.time.DurationField durationField64 = chronology59.weekyears();
        org.joda.time.DateTimeField dateTimeField65 = chronology59.monthOfYear();
        boolean boolean66 = dateTimeParserBucket16.restoreState((java.lang.Object) dateTimeField65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField64", (durationField20.compareTo(durationField64) == 0) == durationField20.equals(durationField64));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.Instant instant18 = mutableDateTime1.toInstant();
        org.joda.time.DateTime dateTime19 = mutableDateTime1.toDateTimeISO();
        mutableDateTime1.setMinuteOfHour(3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime19", (instant18.compareTo(dateTime19) == 0) == instant18.equals(dateTime19));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.add((long) 31);
        mutableDateTime1.addMonths(6);
        org.joda.time.DateTime dateTime7 = mutableDateTime1.toDateTimeISO();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property10 = localDate8.property(dateTimeFieldType9);
        org.joda.time.LocalDate localDate12 = localDate8.withDayOfMonth(10);
        int int13 = localDate12.getWeekyear();
        org.joda.time.LocalDate localDate15 = localDate12.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = localDate12.toDateMidnight(dateTimeZone16);
        org.joda.time.Chronology chronology18 = localDate12.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime7.toDateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime19", (mutableDateTime1.compareTo(dateTime19) == 0) == mutableDateTime1.equals(dateTime19));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plus(readableDuration8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (-1), chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusHours(0);
        int int19 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime.Property property20 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.withMillisOfSecond(100);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.era();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTime dateTime25 = localDateTime22.toDateTime();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfDay();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.weekyearOfCentury();
        org.joda.time.Chronology chronology38 = chronology34.withUTC();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology38);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((-62040988799969L), chronology38);
        org.joda.time.DateTime dateTime41 = dateTime25.withChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField42 = chronology38.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime41", (dateTime25.compareTo(dateTime41) == 0) == dateTime25.equals(dateTime41));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = chronology10.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = chronology10.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.years();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField17", (durationField14.compareTo(durationField17) == 0) == durationField14.equals(durationField17));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        mutableDateTime1.setYear(292278993);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.DateTime dateTime22 = dateTime19.plus((long) 100);
        org.joda.time.DateTime.Property property23 = dateTime22.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.plus(readableDuration24);
        boolean boolean26 = dateTimeZone11.equals((java.lang.Object) readableDuration24);
        mutableDateTime1.setZone(dateTimeZone11);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime30.setTime(100L);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.dayOfMonth();
        mutableDateTime30.setMillisOfSecond(3);
        mutableDateTime30.addMillis(12);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime30.add(readablePeriod38);
        int int40 = mutableDateTime30.getSecondOfMinute();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (-1), chronology42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        org.joda.time.DateTime dateTime47 = localDateTime43.toDateTime(dateTimeZone45);
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        long long53 = chronology48.add(readablePeriod50, (long) (-292275054), (int) '4');
        org.joda.time.Chronology chronology54 = chronology48.withUTC();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        mutableDateTime30.setChronology(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(chronology54);
        org.joda.time.DateTime dateTime58 = dateTime28.toDateTime(chronology54);
        org.joda.time.DurationField durationField59 = chronology54.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and dateTime58", (mutableDateTime12.compareTo(dateTime58) == 0) == mutableDateTime12.equals(dateTime58));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) (short) 0);
        int[] intArray6 = localDateTime2.getValues();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        int int13 = property10.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime15.add(readableDuration16, 100);
        boolean boolean19 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime15.add(readableDuration20, (int) (byte) 100);
        mutableDateTime15.setMillis((long) (short) 100);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime15.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime15.property(dateTimeFieldType26);
        boolean boolean28 = localDateTime2.isSupported(dateTimeFieldType26);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (-1), chronology30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = localDateTime31.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.secondOfDay();
        org.joda.time.DurationField durationField38 = chronology36.minutes();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.weekyearOfCentury();
        org.joda.time.Chronology chronology40 = chronology36.withUTC();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(chronology40);
        org.joda.time.DurationField durationField42 = chronology40.seconds();
        org.joda.time.DurationField durationField43 = chronology40.minutes();
        boolean boolean44 = dateTimeFieldType26.isSupported(chronology40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and dateTime41", (mutableDateTime12.compareTo(dateTime41) == 0) == mutableDateTime12.equals(dateTime41));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.DurationField durationField10 = chronology7.eras();
        org.joda.time.DurationField durationField11 = chronology7.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField10", Math.signum(durationField8.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField8)));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime17 = dateTime15.plus((long) (-292275054));
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime21 = dateTime17.plusSeconds((int) 'a');
        org.joda.time.DateTime dateTime23 = dateTime21.plus((-6L));
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        boolean boolean29 = dateTimeZone24.isLocalDateTimeGap(localDateTime28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property32 = localDateTime28.dayOfYear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.withSecondOfMinute((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime28.withDurationAdded(readableDuration35, (int) 'u');
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withMonthOfYear(10);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.minusYears(0);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.withMinuteOfHour(3);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime37.withDurationAdded(readableDuration44, 3);
        org.joda.time.Chronology chronology47 = localDateTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.weekyearOfCentury();
        org.joda.time.DateTime dateTime49 = dateTime21.toDateTime(chronology47);
        org.joda.time.DateTimeField dateTimeField50 = chronology47.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime49", (dateTime21.compareTo(dateTime49) == 0) == dateTime21.equals(dateTime49));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        boolean boolean13 = dateTime6.isBefore((long) (-1));
        org.joda.time.DateTime dateTime15 = dateTime6.minusMinutes(23);
        org.joda.time.DateTime.Property property16 = dateTime6.dayOfMonth();
        org.joda.time.DateTime dateTime18 = dateTime6.plusYears(21);
        org.joda.time.DateTime dateTime20 = dateTime6.withMillis(1154984486400000L);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withMillisOfSecond((int) (byte) 100);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.hours();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) 1154984486400000L, chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and mutableDateTime30", (dateTime20.compareTo(mutableDateTime30) == 0) == dateTime20.equals(mutableDateTime30));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.hours();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField11 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.yearOfCentury();
        boolean boolean15 = dateTimeFieldType0.isSupported(chronology8);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.DateTimeZone dateTimeZone17 = chronology8.getZone();
        java.lang.String str18 = chronology8.toString();
        org.joda.time.DurationField durationField19 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField9, and durationField11", !(durationField19.compareTo(durationField9) == 0) || (Math.signum(durationField19.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusSeconds(0);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.withChronology(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMinutes(2);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime11.minus(readablePeriod16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int19 = dateTime11.get(dateTimeFieldType18);
        org.joda.time.DateTime.Property property20 = dateTime11.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(366);
        org.joda.time.DateTime dateTime24 = dateTime11.toDateTime(dateTimeZone23);
        long long26 = dateTimeZone23.previousTransition(997L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime24", (dateTime9.compareTo(dateTime24) == 0) == dateTime9.equals(dateTime24));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(9);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = localDateTime28.toDateTime(dateTimeZone30);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfDay();
        org.joda.time.DurationField durationField35 = chronology33.minutes();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekyearOfCentury();
        org.joda.time.Chronology chronology37 = chronology33.withUTC();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = chronology37.getZone();
        org.joda.time.DateTime dateTime40 = dateTime24.toDateTime(dateTimeZone39);
        org.joda.time.DateTime.Property property41 = dateTime40.monthOfYear();
        org.joda.time.DateTime dateTime42 = property41.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime40", (dateTime24.compareTo(dateTime40) == 0) == dateTime24.equals(dateTime40));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        java.util.Locale locale19 = null;
        int int20 = property16.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime21 = property16.getDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.minusMonths((int) 'x');
        org.joda.time.Instant instant24 = dateTime21.toInstant();
        org.joda.time.DateTime.Property property25 = dateTime21.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant24", (dateTime21.compareTo(instant24) == 0) == dateTime21.equals(instant24));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.lang.String str7 = property3.toString();
        org.joda.time.LocalDateTime localDateTime9 = property3.setCopy((int) (short) 1);
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusMinutes(50);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusHours(3);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        java.lang.String str22 = dateTime21.toString();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.plus(readableDuration23);
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.DateTime dateTime26 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant25", (dateTime21.compareTo(instant25) == 0) == dateTime21.equals(instant25));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        int int6 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime8.add(readableDuration9, 100);
        boolean boolean12 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime8.add(readableDuration13, (int) (byte) 100);
        mutableDateTime8.setMillis((long) (short) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter20.withChronology(chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Chronology chronology31 = chronology28.withZone(dateTimeZone30);
        org.joda.time.DurationField durationField32 = chronology28.weekyears();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(chronology28);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.minuteOfDay();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime8, chronology34);
        org.joda.time.DateTimeField dateTimeField37 = chronology34.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime36", (mutableDateTime8.compareTo(dateTime36) == 0) == mutableDateTime8.equals(dateTime36));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        long long10 = dateTimeZone8.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime16.set(dateTimeFieldType17, (-292275054));
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        boolean boolean25 = dateTimeField23.isLeap(100L);
        mutableDateTime16.setRounding(dateTimeField23);
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale27.getDisplayScript(locale29);
        java.util.Set<java.lang.Character> charSet31 = locale27.getExtensionKeys();
        int int32 = dateTimeField23.getMaximumShortTextLength(locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(724690124946L, chronology13, locale27, (java.lang.Integer) 69);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (-1), chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.weekyear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        int int41 = property38.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutableDateTime43.add(readableDuration44, 100);
        boolean boolean47 = mutableDateTime40.isBefore((org.joda.time.ReadableInstant) mutableDateTime43);
        mutableDateTime43.setTime(31243724946L);
        org.joda.time.Chronology chronology50 = mutableDateTime43.getChronology();
        boolean boolean51 = dateTimeParserBucket34.restoreState((java.lang.Object) chronology50);
        long long54 = dateTimeParserBucket34.computeMillis(true, "2022-02-21T15:06:30.457+00:00:00.003");
        org.joda.time.Chronology chronology55 = dateTimeParserBucket34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime40 and mutableDateTime56", (mutableDateTime40.compareTo(mutableDateTime56) == 0) == mutableDateTime40.equals(mutableDateTime56));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfMonth(10);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime6.set(dateTimeFieldType7, (-292275054));
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField(chronology12);
        boolean boolean15 = dateTimeField13.isLeap(100L);
        mutableDateTime6.setRounding(dateTimeField13);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime6.add(readableDuration17, (int) 'u');
        mutableDateTime6.addWeeks(100);
        java.lang.Object obj22 = mutableDateTime6.clone();
        org.joda.time.Instant instant23 = mutableDateTime6.toInstant();
        org.joda.time.DateTime dateTime24 = localDate0.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.LocalDate localDate26 = localDate0.minusWeeks(54489);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant23", (mutableDateTime6.compareTo(instant23) == 0) == mutableDateTime6.equals(instant23));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = mutableDateTime1.get(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.secondOfDay();
        org.joda.time.DurationField durationField23 = chronology21.minutes();
        org.joda.time.DurationField durationField24 = chronology21.minutes();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 292278993, chronology21);
        org.joda.time.Chronology chronology26 = chronology21.withUTC();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime1.toMutableDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime27", (mutableDateTime1.compareTo(mutableDateTime27) == 0) == mutableDateTime1.equals(mutableDateTime27));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.minuteOfHour();
        org.joda.time.DurationField durationField15 = chronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology7.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DurationField durationField18 = chronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField9, and durationField15", !(durationField18.compareTo(durationField9) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField9.compareTo(durationField15))));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(9);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = localDateTime28.toDateTime(dateTimeZone30);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfDay();
        org.joda.time.DurationField durationField35 = chronology33.minutes();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekyearOfCentury();
        org.joda.time.Chronology chronology37 = chronology33.withUTC();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = chronology37.getZone();
        org.joda.time.DateTime dateTime40 = dateTime24.toDateTime(dateTimeZone39);
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime40", (dateTime24.compareTo(dateTime40) == 0) == dateTime24.equals(dateTime40));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.lang.String str21 = locale18.getDisplayVariant(locale20);
        java.util.Calendar calendar22 = dateTime15.toCalendar(locale18);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTime dateTime31 = localDateTime27.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.secondOfDay();
        org.joda.time.DurationField durationField34 = chronology32.minutes();
        org.joda.time.DurationField durationField35 = chronology32.minutes();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 292278993, chronology32);
        org.joda.time.Chronology chronology37 = chronology32.withUTC();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(45L, chronology37);
        org.joda.time.DateTimeField dateTimeField40 = chronology37.weekyear();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime15.toMutableDateTime(chronology37);
        org.joda.time.DateTimeField dateTimeField42 = chronology37.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime41", (dateTime15.compareTo(mutableDateTime41) == 0) == dateTime15.equals(mutableDateTime41));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime17 = dateTime15.withMillis((-1L));
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        int int19 = dateTime17.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.withPeriodAdded(readablePeriod20, 53);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(13);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getNameKey(4460845311L);
        int int29 = dateTimeZone24.getOffsetFromLocal(4460918356L);
        org.joda.time.DateTime dateTime30 = dateTime22.toDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime32 = dateTime22.withWeekyear(8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime30", (dateTime6.compareTo(dateTime30) == 0) == dateTime6.equals(dateTime30));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime22 = dateTime20.plusDays((int) (byte) 0);
        org.joda.time.DateTime dateTime24 = dateTime20.withMillisOfSecond(10);
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds(11);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime28.setMillisOfDay(10);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField32 = mutableDateTime31.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType33.getDurationType();
        mutableDateTime31.add(durationFieldType34, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = null;
        org.joda.time.format.DateTimeParser dateTimeParser38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (-1), chronology41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTime dateTime46 = localDateTime42.toDateTime(dateTimeZone44);
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter39.withChronology(chronology47);
        org.joda.time.DateTimeField dateTimeField49 = chronology47.monthOfYear();
        org.joda.time.DurationField durationField50 = durationFieldType34.getField(chronology47);
        org.joda.time.DateTimeField dateTimeField51 = chronology47.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = dateTimeField51.getType();
        boolean boolean53 = mutableDateTime28.isSupported(dateTimeFieldType52);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime56.set(dateTimeFieldType57, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime56.add(readablePeriod60, 4);
        int int63 = mutableDateTime56.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime56.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime56.copy();
        int int66 = dateTimeZone54.getOffset((org.joda.time.ReadableInstant) mutableDateTime65);
        org.joda.time.DateTime dateTime67 = mutableDateTime28.toDateTime(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime26.toMutableDateTime(dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime28 and dateTime67", (mutableDateTime28.compareTo(dateTime67) == 0) == mutableDateTime28.equals(dateTime67));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DurationField durationField10 = chronology7.months();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.millisOfSecond();
        org.joda.time.DurationField durationField14 = chronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField10", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.hours();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = chronology7.add(readablePeriod9, (long) (short) 1, (int) '#');
        org.joda.time.DurationField durationField13 = chronology7.millis();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = chronology7.hourOfHalfday();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        boolean boolean23 = dateTimeZone18.isLocalDateTimeGap(localDateTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.weekyear();
        boolean boolean28 = dateTimeZone18.isLocalDateTimeGap(localDateTime26);
        boolean boolean30 = dateTimeZone18.isStandardOffset(86399999L);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(100L, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusHours(0);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusMinutes(1381);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withWeekOfWeekyear(5);
        int[] intArray39 = chronology7.get((org.joda.time.ReadablePartial) localDateTime35, (-1L));
        org.joda.time.DurationField durationField40 = chronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField8, and durationField13", !(durationField40.compareTo(durationField8) == 0) || (Math.signum(durationField40.compareTo(durationField13)) == Math.signum(durationField8.compareTo(durationField13))));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(2022L, chronology11, locale13);
        java.lang.Object obj15 = null;
        boolean boolean16 = dateTimeParserBucket14.restoreState(obj15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.addWrapField((-1));
        boolean boolean22 = dateTimeParserBucket14.restoreState((java.lang.Object) (-1));
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket14.getZone();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime(dateTimeZone28);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.plus(readableDuration32);
        org.joda.time.DateTime dateTime35 = dateTime30.minusWeeks(10);
        boolean boolean37 = dateTime30.isBefore((long) (-1));
        int int38 = dateTime30.getYearOfEra();
        org.joda.time.DateTime dateTime40 = dateTime30.withYear((int) (byte) 0);
        int int41 = dateTime30.getDayOfWeek();
        org.joda.time.DateTime dateTime43 = dateTime30.withWeekyear(23);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime45 = dateTime30.plus(readablePeriod44);
        int int46 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime49.set(dateTimeFieldType50, (-292275054));
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime49.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime58.secondOfMinute();
        mutableDateTime55.setTime((org.joda.time.ReadableInstant) mutableDateTime58);
        mutableDateTime49.setMillis((org.joda.time.ReadableInstant) mutableDateTime55);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (-1), chronology63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.weekyear();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        long long71 = dateTimeZone69.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone69);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime64.withFields((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.Chronology chronology74 = localDateTime73.getChronology();
        mutableDateTime55.setChronology(chronology74);
        int int76 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) mutableDateTime55);
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime55", (dateTime10.compareTo(mutableDateTime55) == 0) == dateTime10.equals(mutableDateTime55));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(2022L, chronology11, locale13);
        long long17 = dateTimeParserBucket14.computeMillis(false, "DurationField[minutes]");
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        dateTimeParserBucket14.setZone(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeParserBucket14.getZone();
        long long22 = dateTimeParserBucket14.computeMillis(false);
        org.joda.time.Chronology chronology23 = dateTimeParserBucket14.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.monthOfYear();
        org.joda.time.DurationField durationField25 = chronology23.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField27 = chronology23.dayOfWeek();
        org.joda.time.DurationField durationField28 = chronology23.eras();
        org.joda.time.DurationField durationField29 = chronology23.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField25 and durationField28", Math.signum(durationField25.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField25)));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime2.set(dateTimeFieldType3, (-292275054));
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.secondOfMinute();
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        long long24 = dateTimeZone22.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.withFields((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        mutableDateTime8.setChronology(chronology27);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) (-1), chronology35);
        boolean boolean37 = dateTimeZone32.isLocalDateTimeGap(localDateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        boolean boolean42 = dateTimeZone32.isLocalDateTimeGap(localDateTime40);
        boolean boolean44 = dateTimeZone32.isStandardOffset(86399999L);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (-1), chronology48);
        boolean boolean50 = dateTimeZone45.isLocalDateTimeGap(localDateTime49);
        java.lang.String str52 = dateTimeZone45.getName((long) 4);
        long long54 = dateTimeZone32.getMillisKeepLocal(dateTimeZone45, 31244400000L);
        java.util.Locale locale56 = java.util.Locale.TAIWAN;
        java.lang.String str57 = locale56.toLanguageTag();
        java.util.Locale locale58 = java.util.Locale.GERMANY;
        java.lang.String str59 = locale56.getDisplayScript(locale58);
        java.lang.String str60 = locale58.getVariant();
        java.lang.String str61 = dateTimeZone32.getShortName((long) 22, locale58);
        java.lang.String str62 = dateTimeZone30.getShortName((long) 13, locale58);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket(4460973687L, chronology27, locale58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime8", (mutableDateTime2.compareTo(mutableDateTime8) == 0) == mutableDateTime2.equals(mutableDateTime8));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        int[] intArray2 = localTime1.getValues();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime4.setMillisOfDay(10);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField8 = mutableDateTime7.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        mutableDateTime7.add(durationFieldType10, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (-1), chronology17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTime dateTime22 = localDateTime18.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter15.withChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.monthOfYear();
        org.joda.time.DurationField durationField26 = durationFieldType10.getField(chronology23);
        org.joda.time.DateTimeField dateTimeField27 = chronology23.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = dateTimeField27.getType();
        boolean boolean29 = mutableDateTime4.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime32.set(dateTimeFieldType33, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime32.add(readablePeriod36, 4);
        int int39 = mutableDateTime32.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime32.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime32.copy();
        int int42 = dateTimeZone30.getOffset((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTime dateTime43 = mutableDateTime4.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime44 = localTime1.toDateTimeToday(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime43", (mutableDateTime4.compareTo(dateTime43) == 0) == mutableDateTime4.equals(dateTime43));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy(31);
        int int25 = dateTime24.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 4);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(1640995199997L, dateTimeZone29);
        java.lang.String str32 = dateTimeZone29.getShortName((-725846400000L));
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime24.toMutableDateTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay34 = dateTime24.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and mutableDateTime33", (dateTime24.compareTo(mutableDateTime33) == 0) == dateTime24.equals(mutableDateTime33));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime1.add(readablePeriod5, 4);
        int int8 = mutableDateTime1.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime1.secondOfMinute();
        org.joda.time.Chronology chronology12 = null;
        mutableDateTime1.setChronology(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime15.set(dateTimeFieldType16, (-292275054));
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.add(0);
        mutableDateTime21.addSeconds(86399999);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime21.add(readablePeriod25, 69);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(346);
        mutableDateTime21.setZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime21", (mutableDateTime1.compareTo(mutableDateTime21) == 0) == mutableDateTime1.equals(mutableDateTime21));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        boolean boolean8 = property7.isLeap();
        org.joda.time.LocalDate localDate10 = property7.setCopy(365);
        org.joda.time.LocalDate localDate11 = property7.getLocalDate();
        int int12 = localDate11.getWeekyear();
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DurationField durationField16 = chronology14.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField16", Math.signum(durationField15.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField15)));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime15.set(dateTimeFieldType16, (-292275054));
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.yearOfEra();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property22 = localDate20.property(dateTimeFieldType21);
        int int23 = mutableDateTime15.get(dateTimeFieldType21);
        boolean boolean24 = localDate9.isSupported(dateTimeFieldType21);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime27.setTime(100L);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime27.dayOfMonth();
        mutableDateTime27.setMillisOfSecond(3);
        mutableDateTime27.addMillis(12);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime27.add(readablePeriod35);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property39 = localDate37.property(dateTimeFieldType38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.year();
        boolean boolean41 = localDate37.isSupported(dateTimeFieldType40);
        org.joda.time.DateTime dateTime42 = localDate37.toDateTimeAtMidnight();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.years();
        org.joda.time.LocalDate localDate45 = localDate37.withFieldAdded(durationFieldType43, (int) (byte) 100);
        org.joda.time.Chronology chronology46 = localDate37.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.days();
        mutableDateTime27.setChronology(chronology46);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((-3120000L), chronology46);
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType21.getField(chronology46);
        org.joda.time.DateTimeField dateTimeField51 = chronology46.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(chronology46);
        org.joda.time.DateTimeZone dateTimeZone53 = chronology46.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime52", (mutableDateTime12.compareTo(mutableDateTime52) == 0) == mutableDateTime12.equals(mutableDateTime52));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = mutableDateTime1.get(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.millisOfDay();
        java.util.Locale locale14 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.Locale locale16 = java.util.Locale.GERMANY;
        java.lang.String str17 = locale14.getDisplayVariant(locale16);
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = property13.getAsShortText(locale16);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime21.setWeekyear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        long long29 = dateTimeZone24.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone30 = dateTimeZone24.toTimeZone();
        mutableDateTime21.setZone(dateTimeZone24);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone24);
        java.util.Locale locale34 = java.util.Locale.PRC;
        java.lang.String str35 = locale34.getCountry();
        java.util.Locale locale37 = new java.util.Locale("hi!");
        java.lang.String str38 = locale37.getScript();
        java.lang.String str39 = locale37.getDisplayLanguage();
        java.lang.String str40 = locale37.getDisplayCountry();
        java.lang.String str41 = locale34.getDisplayScript(locale37);
        java.lang.String str42 = locale34.getDisplayCountry();
        java.lang.String str43 = locale34.getVariant();
        java.lang.String str44 = dateTimeZone24.getName((-292276906L), locale34);
        java.lang.String str45 = locale34.getScript();
        int int46 = property13.getMaximumShortTextLength(locale34);
        org.joda.time.format.DateTimePrinter dateTimePrinter47 = null;
        org.joda.time.format.DateTimeParser dateTimeParser48 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter47, dateTimeParser48);
        org.joda.time.format.DateTimeParser dateTimeParser50 = dateTimeFormatter49.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter49.withPivotYear((java.lang.Integer) 9);
        java.util.Locale locale53 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter52.withLocale(locale53);
        java.util.Locale locale55 = dateTimeFormatter54.getLocale();
        java.lang.String str56 = locale55.getCountry();
        java.lang.String str57 = locale55.getVariant();
        java.lang.String str58 = locale34.getDisplayCountry(locale55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and dateTime32", (mutableDateTime11.compareTo(dateTime32) == 0) == mutableDateTime11.equals(dateTime32));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        int int6 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime8.add(readableDuration9, 100);
        boolean boolean12 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.DurationField durationField15 = property13.getDurationField();
        org.joda.time.DurationField durationField16 = property13.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime18 = property13.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 4);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(1640995199997L, dateTimeZone22);
        boolean boolean25 = dateTimeZone22.isStandardOffset((-52L));
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone22);
        mutableDateTime18.setZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and dateTime26", (mutableDateTime5.compareTo(dateTime26) == 0) == mutableDateTime5.equals(dateTime26));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int19 = mutableDateTime1.get(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField21 = mutableDateTime20.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        mutableDateTime20.add(durationFieldType23, 100);
        mutableDateTime1.add(durationFieldType23, (int) (byte) 0);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (short) 1, chronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone33);
        org.joda.time.DateTime dateTime35 = dateTime30.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = mutableDateTime1.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology37 = mutableDateTime1.getChronology();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.DateTime dateTime44 = localDateTime40.toDateTime(dateTimeZone42);
        java.lang.String str45 = dateTime44.toString();
        org.joda.time.DateTime dateTime47 = dateTime44.plus((long) 100);
        org.joda.time.DateTime.Property property48 = dateTime47.yearOfCentury();
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        java.util.Calendar calendar50 = dateTime47.toCalendar(locale49);
        int int51 = dateTime47.getMinuteOfHour();
        org.joda.time.DateTime dateTime53 = dateTime47.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime55 = dateTime53.plus((long) (-292275054));
        org.joda.time.DateTime dateTime57 = dateTime53.minusSeconds(1969);
        org.joda.time.Chronology chronology58 = dateTime53.getChronology();
        org.joda.time.DateTime.Property property59 = dateTime53.dayOfYear();
        org.joda.time.DateTime dateTime60 = property59.withMaximumValue();
        org.joda.time.DateTime dateTime61 = dateTime60.toDateTime();
        boolean boolean62 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = mutableDateTime1.toDateTime(dateTimeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime35", (dateTime30.compareTo(dateTime35) == 0) == dateTime30.equals(dateTime35));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        boolean boolean10 = dateTimeField8.isLeap(100L);
        mutableDateTime1.setRounding(dateTimeField8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime1.add(readableDuration12, (int) 'u');
        mutableDateTime1.addWeeks(100);
        java.lang.Object obj17 = mutableDateTime1.clone();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int19 = mutableDateTime1.get(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField21 = mutableDateTime20.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        mutableDateTime20.add(durationFieldType23, 100);
        mutableDateTime1.add(durationFieldType23, (int) (byte) 0);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (short) 1, chronology29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone33);
        org.joda.time.DateTime dateTime35 = dateTime30.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = mutableDateTime1.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology37 = mutableDateTime1.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.eras();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (-1), chronology41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTime dateTime46 = localDateTime42.toDateTime(dateTimeZone44);
        java.lang.String str47 = dateTime46.toString();
        org.joda.time.DateTime dateTime49 = dateTime46.plus((long) 100);
        org.joda.time.DateTime dateTime51 = dateTime49.minusSeconds(0);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.withChronology(chronology52);
        org.joda.time.DateTime dateTime55 = dateTime51.plusMinutes(2);
        org.joda.time.DateTime dateTime57 = dateTime55.minus((long) 1970);
        boolean boolean59 = dateTime57.isAfter(86399999L);
        int int60 = dateTimeZone39.getOffset((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone62 = dateTimeZone61.toTimeZone();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) (-1), chronology64);
        boolean boolean66 = dateTimeZone61.isLocalDateTimeGap(localDateTime65);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime((long) (-1), chronology68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.weekyear();
        boolean boolean71 = dateTimeZone61.isLocalDateTimeGap(localDateTime69);
        long long73 = dateTimeZone39.getMillisKeepLocal(dateTimeZone61, 4460801830L);
        org.joda.time.Chronology chronology74 = chronology37.withZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime36", (mutableDateTime1.compareTo(dateTime36) == 0) == mutableDateTime1.equals(dateTime36));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.seconds();
        org.joda.time.DurationField durationField14 = chronology11.minutes();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField14", (durationField9.compareTo(durationField14) == 0) == durationField9.equals(durationField14));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        java.util.Date date17 = dateTime9.toDate();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) date17);
        boolean boolean20 = mutableDateTime18.isBefore((long) 2022);
        long long21 = mutableDateTime18.getMillis();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = dateTime28.plusHours(1);
        org.joda.time.DateTime dateTime31 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime33 = dateTime28.withWeekyear((-9));
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone36);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime33.toMutableDateTime(dateTimeZone36);
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime42 = dateTime33.minusMillis(2021);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and mutableDateTime39", (mutableDateTime18.compareTo(mutableDateTime39) == 0) == mutableDateTime18.equals(mutableDateTime39));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime1.setWeekyear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        long long9 = dateTimeZone4.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone10 = dateTimeZone4.toTimeZone();
        mutableDateTime1.setZone(dateTimeZone4);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalTime.Property property20 = localTime18.property(dateTimeFieldType19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder14.appendFraction(dateTimeFieldType19, (int) '4', (int) ' ');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatterBuilder23.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendCenturyOfEra(1969, 365);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder23.appendWeekOfWeekyear(292278993);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder23.appendMillisOfSecond(69);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder23.appendFixedDecimal(dateTimeFieldType32, 2);
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType32.getDurationType();
        org.joda.time.DateTime.Property property36 = dateTime12.property(dateTimeFieldType32);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime40 = localTime38.minusSeconds((int) (short) 10);
        int int41 = localTime38.getMinuteOfHour();
        org.joda.time.LocalTime.Property property42 = localTime38.hourOfDay();
        int int43 = localTime38.size();
        int int44 = localTime38.getMinuteOfHour();
        org.joda.time.Chronology chronology45 = localTime38.getChronology();
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(chronology45);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(chronology45);
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType32.getField(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime46", (dateTime12.compareTo(dateTime46) == 0) == dateTime12.equals(dateTime46));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        mutableDateTime1.setYear(292278993);
        mutableDateTime1.setMillisOfSecond(59);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = dateTime18.plusMillis(0);
        org.joda.time.Instant instant23 = dateTime18.toInstant();
        int int24 = dateTime18.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant23", (mutableDateTime1.compareTo(instant23) == 0) == mutableDateTime1.equals(instant23));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime7.minusWeeks(10);
        boolean boolean14 = dateTime7.isBefore((long) (-1));
        int int15 = dateTime7.getYearOfEra();
        org.joda.time.DateTime dateTime17 = dateTime7.withYear((int) (byte) 0);
        int int18 = dateTime7.getDayOfWeek();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.secondOfDay();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.weekyearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime7.withChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.dayOfWeek();
        long long35 = chronology26.add(58455001L, 3124138248000L, 2068);
        org.joda.time.DurationField durationField36 = chronology26.eras();
        java.util.Locale locale38 = new java.util.Locale("196");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(4461082681L, chronology26, locale38, (java.lang.Integer) 54510);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField36", Math.signum(durationField28.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField28)));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTime dateTime4 = dateTime1.minusDays((int) (byte) 0);
        java.util.Date date5 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.minusSeconds(292277023);
        boolean boolean8 = dateTime4.isEqualNow();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = dateTime4.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minus(readableDuration20);
        boolean boolean22 = dateTimeZone11.isLocalDateTimeGap(localDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime12", (dateTime1.compareTo(dateTime12) == 0) == dateTime1.equals(dateTime12));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((-1));
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.hours();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology13.add(readablePeriod15, (long) (short) 1, (int) '#');
        org.joda.time.DurationField durationField19 = chronology13.millis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter4.withChronology(chronology13);
        org.joda.time.DurationField durationField21 = chronology13.halfdays();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology31.add(readablePeriod33, (long) (-292275054), (int) '4');
        org.joda.time.DateTimeField dateTimeField37 = chronology31.halfdayOfDay();
        java.util.Locale locale38 = java.util.Locale.TAIWAN;
        java.lang.String str39 = locale38.getISO3Language();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 59, chronology31, locale38);
        java.lang.Object obj41 = dateTimeParserBucket40.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.centuryOfEra();
        dateTimeParserBucket40.saveField(dateTimeFieldType42, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeParserBucket40.getZone();
        int int47 = dateTimeZone45.getOffset(0L);
        org.joda.time.Chronology chronology48 = chronology13.withZone(dateTimeZone45);
        java.lang.String str49 = chronology48.toString();
        org.joda.time.DurationField durationField50 = chronology48.days();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (-1), chronology52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone56 = dateTimeZone55.toTimeZone();
        org.joda.time.DateTime dateTime57 = localDateTime53.toDateTime(dateTimeZone55);
        java.lang.String str58 = dateTime57.toString();
        org.joda.time.DateTime dateTime60 = dateTime57.plus((long) 100);
        org.joda.time.DateTime.Property property61 = dateTime60.yearOfCentury();
        java.util.Locale locale62 = java.util.Locale.GERMANY;
        java.util.Calendar calendar63 = dateTime60.toCalendar(locale62);
        int int64 = dateTime60.getMinuteOfHour();
        org.joda.time.DateTime dateTime66 = dateTime60.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property67 = dateTime60.era();
        boolean boolean69 = dateTime60.isEqual((long) 100);
        org.joda.time.DateTime dateTime71 = dateTime60.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime72 = dateTime60.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property73 = dateTime60.dayOfMonth();
        org.joda.time.DateTime dateTime75 = property73.addWrapFieldToCopy(31);
        int int76 = dateTime75.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 4);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(1640995199997L, dateTimeZone80);
        java.lang.String str83 = dateTimeZone80.getShortName((-725846400000L));
        org.joda.time.MutableDateTime mutableDateTime84 = dateTime75.toMutableDateTime(dateTimeZone80);
        org.joda.time.Chronology chronology85 = chronology48.withZone(dateTimeZone80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and mutableDateTime84", (dateTime60.compareTo(mutableDateTime84) == 0) == dateTime60.equals(mutableDateTime84));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology8.add(readablePeriod10, (long) (-292275054), (int) '4');
        org.joda.time.DurationField durationField14 = durationFieldType0.getField(chronology8);
        org.joda.time.DurationField durationField15 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField16 = chronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.monthOfYear();
        org.joda.time.Chronology chronology18 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.minuteOfHour();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField14, and durationField15", !(durationField20.compareTo(durationField14) == 0) || (Math.signum(durationField20.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateTime dateTime11 = dateTime8.plus((long) 100);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        boolean boolean13 = strSet1.equals((java.lang.Object) dateTime11);
        org.joda.time.DateTime dateTime15 = dateTime11.withDayOfWeek(1);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((-1));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        long long27 = dateTimeZone25.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.days();
        org.joda.time.DateTime dateTime32 = dateTime17.withChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime32", (dateTime17.compareTo(dateTime32) == 0) == dateTime17.equals(dateTime32));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        boolean boolean11 = property10.isLeap();
        org.joda.time.DateTime dateTime12 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime13 = property10.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = dateTime13.plus((-31468776749L));
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (-1), chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime23 = localDateTime19.toDateTime(dateTimeZone21);
        java.lang.String str24 = dateTime23.toString();
        org.joda.time.DateTime dateTime26 = dateTime23.plus((long) 100);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfCentury();
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.util.Calendar calendar29 = dateTime26.toCalendar(locale28);
        int int30 = dateTime26.getMinuteOfHour();
        org.joda.time.DateTime dateTime32 = dateTime26.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property33 = dateTime26.era();
        boolean boolean35 = dateTime26.isEqual((long) 100);
        org.joda.time.DateTime dateTime37 = dateTime26.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime38 = dateTime26.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property39 = dateTime38.centuryOfEra();
        org.joda.time.DateTime dateTime40 = dateTime38.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMillis(7092000000L);
        java.util.Locale locale43 = null;
        java.util.Calendar calendar44 = dateTime40.toCalendar(locale43);
        int int45 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar44", (calendar29.compareTo(calendar44) == 0) == calendar29.equals(calendar44));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime7.minusWeeks(10);
        boolean boolean14 = dateTime7.isBefore((long) (-1));
        int int15 = dateTime7.getYearOfEra();
        org.joda.time.DateTime dateTime17 = dateTime7.withYear((int) (byte) 0);
        int int18 = dateTime7.getDayOfWeek();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.secondOfDay();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.weekyearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime7.withChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.dayOfWeek();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(10L, chronology26);
        org.joda.time.DurationField durationField33 = chronology26.halfdays();
        org.joda.time.DurationField durationField34 = chronology26.hours();
        org.joda.time.DateTimeField dateTimeField35 = chronology26.dayOfWeek();
        org.joda.time.DurationField durationField36 = chronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField28, and durationField33", !(durationField36.compareTo(durationField28) == 0) || (Math.signum(durationField36.compareTo(durationField33)) == Math.signum(durationField28.compareTo(durationField33))));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        int int6 = localTime1.size();
        int int7 = localTime1.getMinuteOfHour();
        org.joda.time.Chronology chronology8 = localTime1.getChronology();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        org.joda.time.DateTime dateTime12 = property10.withMaximumValue();
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.DateTime dateTime14 = property13.roundFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        mutableDateTime15.add(0L);
        org.joda.time.DateTime dateTime18 = mutableDateTime15.toDateTimeISO();
        org.joda.time.DateTime.Property property19 = dateTime18.centuryOfEra();
        org.joda.time.DateTime dateTime21 = dateTime18.withYearOfEra(16);
        boolean boolean22 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime15", (dateTime9.compareTo(mutableDateTime15) == 0) == dateTime9.equals(mutableDateTime15));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = mutableDateTime1.get(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.millisOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        java.lang.String str22 = dateTime21.toString();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.plus(readableDuration23);
        org.joda.time.DateTime dateTime26 = dateTime21.minusWeeks(10);
        boolean boolean28 = dateTime21.isBefore((long) (-1));
        int int29 = dateTime21.getYearOfEra();
        org.joda.time.DateTime dateTime31 = dateTime21.withYear((int) (byte) 0);
        int int32 = dateTime21.getDayOfWeek();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.secondOfDay();
        org.joda.time.DurationField durationField42 = chronology40.minutes();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.weekyearOfCentury();
        org.joda.time.DateTime dateTime44 = dateTime21.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField45 = chronology40.dayOfWeek();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(10L, chronology40);
        int int47 = dateTime46.getMillisOfDay();
        java.util.GregorianCalendar gregorianCalendar48 = dateTime46.toGregorianCalendar();
        org.joda.time.Instant instant49 = dateTime46.toInstant();
        int int50 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) instant49);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) (-1), chronology54);
        boolean boolean56 = dateTimeZone51.isLocalDateTimeGap(localDateTime55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property59 = localDateTime55.dayOfYear();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.withSecondOfMinute((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime55.withDurationAdded(readableDuration62, (int) 'u');
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.weekyear();
        int int68 = localDateTime64.indexOf(dateTimeFieldType67);
        org.joda.time.DurationFieldType durationFieldType69 = dateTimeFieldType67.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType70 = dateTimeFieldType67.getDurationType();
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField72 = mutableDateTime71.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType73.getDurationType();
        mutableDateTime71.add(durationFieldType74, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter77 = null;
        org.joda.time.format.DateTimeParser dateTimeParser78 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter77, dateTimeParser78);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((long) (-1), chronology81);
        org.joda.time.LocalDateTime.Property property83 = localDateTime82.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone85 = dateTimeZone84.toTimeZone();
        org.joda.time.DateTime dateTime86 = localDateTime82.toDateTime(dateTimeZone84);
        org.joda.time.Chronology chronology87 = dateTime86.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter88 = dateTimeFormatter79.withChronology(chronology87);
        org.joda.time.DateTimeField dateTimeField89 = chronology87.monthOfYear();
        org.joda.time.DurationField durationField90 = durationFieldType74.getField(chronology87);
        org.joda.time.DateTimeField dateTimeField91 = chronology87.millisOfDay();
        org.joda.time.DateTimeField dateTimeField92 = chronology87.year();
        boolean boolean93 = dateTimeFieldType67.isSupported(chronology87);
        int int94 = mutableDateTime1.get(dateTimeFieldType67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and instant49", (dateTime46.compareTo(instant49) == 0) == dateTime46.equals(instant49));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.secondOfMinute();
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime7.monthOfYear();
        mutableDateTime7.addYears(90);
        mutableDateTime7.add((long) 1969);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime22 = localTime20.minusSeconds((int) (short) 10);
        int int23 = localTime20.getMinuteOfHour();
        org.joda.time.LocalTime.Property property24 = localTime20.hourOfDay();
        org.joda.time.LocalTime localTime25 = property24.withMaximumValue();
        boolean boolean26 = property24.isLeap();
        org.joda.time.LocalTime localTime28 = property24.addCopy((int) (byte) -1);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        mutableDateTime7.setChronology(chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime32.set(dateTimeFieldType33, (-292275054));
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.yearOfEra();
        org.joda.time.DurationField durationField37 = property36.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime39 = property36.roundHalfFloor();
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (-1), chronology42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfYear();
        org.joda.time.DurationField durationField45 = property44.getLeapDurationField();
        org.joda.time.Interval interval46 = property44.toInterval();
        long long47 = property44.remainder();
        java.lang.String str48 = property44.toString();
        java.lang.String str49 = property44.getAsText();
        boolean boolean50 = property44.isLeap();
        int int51 = property44.get();
        org.joda.time.LocalDateTime localDateTime52 = property44.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusDays(2);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime56.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration59 = null;
        mutableDateTime56.add(readableDuration59, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int63 = mutableDateTime56.get(dateTimeFieldType62);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) (-1), chronology65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.joda.time.DateTime dateTime70 = localDateTime66.toDateTime(dateTimeZone68);
        org.joda.time.Chronology chronology71 = dateTime70.getChronology();
        org.joda.time.DurationField durationField72 = chronology71.hours();
        org.joda.time.DateTimeField dateTimeField73 = chronology71.secondOfMinute();
        org.joda.time.DurationField durationField74 = chronology71.months();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(chronology71);
        org.joda.time.DurationField durationField76 = chronology71.millis();
        org.joda.time.DateTimeField dateTimeField77 = dateTimeFieldType62.getField(chronology71);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime52.withField(dateTimeFieldType62, 34);
        boolean boolean80 = mutableDateTime39.isSupported(dateTimeFieldType62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime39", (mutableDateTime7.compareTo(mutableDateTime39) == 0) == mutableDateTime7.equals(mutableDateTime39));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear(10);
        org.joda.time.DateTime.Property property12 = dateTime9.monthOfYear();
        org.joda.time.DateTime dateTime13 = property12.roundCeilingCopy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.DurationField durationField25 = chronology22.minutes();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 292278993, chronology22);
        org.joda.time.Chronology chronology27 = chronology22.withUTC();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.DateTime dateTime29 = dateTime13.withChronology(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime13.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime32 = dateTime13.withWeekyear(86340003);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime13", (dateTime29.compareTo(dateTime13) == 0) == dateTime29.equals(dateTime13));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        int int4 = dateTimeField2.getLeapAmount((long) (byte) 1);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate10 = localDate8.plusWeeks((-292275054));
        int int11 = dateTimeField2.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property14 = localDate12.property(dateTimeFieldType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.year();
        boolean boolean16 = localDate12.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate12.dayOfWeek();
        org.joda.time.LocalDate localDate18 = property17.roundCeilingCopy();
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.lang.String str20 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDate18, locale19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        org.joda.time.LocalDate localDate24 = localDate18.withFieldAdded(durationFieldType22, 3);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.clockhourOfDay();
        org.joda.time.DurationField durationField29 = dateTimeField28.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField29, and durationField26", !(durationField26.compareTo(durationField29) == 0) || (Math.signum(durationField26.compareTo(durationField26)) == Math.signum(durationField29.compareTo(durationField26))));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.hours();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekyear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((-1));
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.lang.String str19 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime14, locale18);
        int int21 = dateTimeField11.getLeapAmount((long) (-1));
        int int22 = mutableDateTime1.get(dateTimeField11);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology30);
        org.joda.time.DateTime dateTime33 = mutableDateTime1.toDateTime(chronology30);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime1.copy();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (short) 1, chronology36);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone40);
        org.joda.time.DateTime dateTime42 = dateTime37.toDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField44 = mutableDateTime43.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType45.getDurationType();
        mutableDateTime43.add(durationFieldType46, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter49 = null;
        org.joda.time.format.DateTimeParser dateTimeParser50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter49, dateTimeParser50);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) (-1), chronology53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone57 = dateTimeZone56.toTimeZone();
        org.joda.time.DateTime dateTime58 = localDateTime54.toDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology59 = dateTime58.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter51.withChronology(chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.monthOfYear();
        org.joda.time.DurationField durationField62 = durationFieldType46.getField(chronology59);
        org.joda.time.DateTimeField dateTimeField63 = chronology59.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone64 = chronology59.getZone();
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        long long68 = chronology59.add(readablePeriod65, (long) 54367285, 2000);
        org.joda.time.DateTime dateTime69 = dateTime37.toDateTime(chronology59);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((java.lang.Object) mutableDateTime34, chronology59);
        java.lang.String str71 = mutableDateTime34.toString();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime34.dayOfMonth();
        org.joda.time.Instant instant73 = mutableDateTime34.toInstant();
        int int74 = mutableDateTime34.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant73", (mutableDateTime1.compareTo(instant73) == 0) == mutableDateTime1.equals(instant73));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        java.util.Locale locale19 = null;
        int int20 = property16.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime21 = property16.getDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.minusMonths((int) 'x');
        org.joda.time.Instant instant24 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) instant24);
        mutableDateTime25.setMillis((long) 78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant24", (dateTime9.compareTo(instant24) == 0) == dateTime9.equals(instant24));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear(10);
        org.joda.time.DateTime.Property property12 = dateTime9.monthOfYear();
        org.joda.time.Instant instant13 = dateTime9.toInstant();
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        java.lang.String str15 = chronology14.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant13", (dateTime9.compareTo(instant13) == 0) == dateTime9.equals(instant13));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.addWrapField((-1));
        org.joda.time.MutableDateTime mutableDateTime5 = property2.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime6 = property2.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime8.add(readableDuration9, 100);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (-1));
        org.joda.time.DateTime dateTime16 = dateTime14.plusWeeks((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra(2022);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMillis(102);
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime24 = dateTime20.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property25 = dateTime20.monthOfYear();
        int int26 = dateTime20.getSecondOfMinute();
        org.joda.time.Instant instant27 = dateTime20.toInstant();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant27", (mutableDateTime6.compareTo(instant27) == 0) == mutableDateTime6.equals(instant27));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (-1), chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = localDateTime10.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.secondOfDay();
        org.joda.time.DurationField durationField17 = chronology15.minutes();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology15);
        java.lang.String str19 = chronology15.toString();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DurationField durationField21 = chronology15.eras();
        java.lang.String str22 = durationField21.getName();
        int int23 = durationField7.compareTo(durationField21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField7, and durationField17", !(durationField21.compareTo(durationField7) == 0) || (Math.signum(durationField21.compareTo(durationField17)) == Math.signum(durationField7.compareTo(durationField17))));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        java.lang.String[] strArray6 = new java.lang.String[] { "1969-12-31T23:59:59.999Z", "365", "1969-12-31T23:59:59.999Z" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        boolean boolean9 = strSet1.containsAll((java.util.Collection<java.lang.String>) strList7);
        java.lang.Object[] objArray10 = strSet1.toArray();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime(dateTimeZone15);
        java.lang.String str18 = dateTime17.toString();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        boolean boolean21 = strSet1.equals((java.lang.Object) dateTime17);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.secondOfMinute();
        mutableDateTime23.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean29 = strSet1.remove((java.lang.Object) mutableDateTime23);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter32.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.monthOfYear();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = chronology40.days();
        org.joda.time.Chronology chronology45 = chronology40.withUTC();
        mutableDateTime23.setChronology(chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime23", (dateTime17.compareTo(mutableDateTime23) == 0) == dateTime17.equals(mutableDateTime23));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("365");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate7 = localDate5.plusWeeks((-292275054));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.LocalDate localDate10 = dateTime9.toLocalDate();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays((int) (byte) 0);
        java.util.Date date13 = dateTime12.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime12.getZone();
        org.joda.time.Interval interval15 = localDate5.toInterval(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate1.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.LocalDate.Property property17 = localDate1.dayOfYear();
        org.joda.time.Chronology chronology18 = localDate1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime19", (dateTime9.compareTo(mutableDateTime19) == 0) == dateTime9.equals(mutableDateTime19));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField10 = chronology8.minutes();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology8);
        java.lang.String str12 = chronology8.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        boolean boolean21 = dateTimeZone16.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.weekyear();
        boolean boolean26 = dateTimeZone16.isLocalDateTimeGap(localDateTime24);
        boolean boolean28 = dateTimeZone16.isStandardOffset(86399999L);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (-1), chronology32);
        boolean boolean34 = dateTimeZone29.isLocalDateTimeGap(localDateTime33);
        java.lang.String str36 = dateTimeZone29.getName((long) 4);
        long long38 = dateTimeZone16.getMillisKeepLocal(dateTimeZone29, 31244400000L);
        java.util.Locale locale40 = java.util.Locale.TAIWAN;
        java.lang.String str41 = locale40.toLanguageTag();
        java.util.Locale locale42 = java.util.Locale.GERMANY;
        java.lang.String str43 = locale40.getDisplayScript(locale42);
        java.lang.String str44 = locale42.getVariant();
        java.lang.String str45 = dateTimeZone16.getShortName((long) 22, locale42);
        java.lang.String str46 = dateTimeZone14.getShortName((long) 13, locale42);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(10L, chronology8, locale42, (java.lang.Integer) 86399999);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (-1), chronology51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone55 = dateTimeZone54.toTimeZone();
        org.joda.time.DateTime dateTime56 = localDateTime52.toDateTime(dateTimeZone54);
        java.lang.String str57 = dateTime56.toString();
        org.joda.time.DateTime dateTime59 = dateTime56.plus((long) 100);
        org.joda.time.DateTime dateTime61 = dateTime59.withYear(10);
        org.joda.time.DateTime.Property property62 = dateTime59.monthOfYear();
        org.joda.time.DateTime dateTime63 = property62.roundCeilingCopy();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) (-1), chronology66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone70 = dateTimeZone69.toTimeZone();
        org.joda.time.DateTime dateTime71 = localDateTime67.toDateTime(dateTimeZone69);
        org.joda.time.Chronology chronology72 = dateTime71.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.secondOfDay();
        org.joda.time.DurationField durationField74 = chronology72.minutes();
        org.joda.time.DurationField durationField75 = chronology72.minutes();
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((long) 292278993, chronology72);
        org.joda.time.Chronology chronology77 = chronology72.withUTC();
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(chronology77);
        org.joda.time.DateTime dateTime79 = dateTime63.withChronology(chronology77);
        org.joda.time.DateTime dateTime80 = dateTime63.withLaterOffsetAtOverlap();
        boolean boolean81 = mutableDateTime49.isBefore((org.joda.time.ReadableInstant) dateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime79 and dateTime63", (dateTime79.compareTo(dateTime63) == 0) == dateTime79.equals(dateTime63));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        org.joda.time.DateTime.Property property13 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime14.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime18 = dateTime14.minusDays(86399);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime14", (instant15.compareTo(dateTime14) == 0) == instant15.equals(dateTime14));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DurationField durationField10 = chronology7.minutes();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(chronology7);
        long long16 = chronology7.add(3218832000030L, 55L, (-292275055));
        org.joda.time.DurationField durationField17 = chronology7.eras();
        org.joda.time.DurationFieldType durationFieldType18 = durationField17.getType();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        int int25 = property22.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime27.add(readableDuration28, 100);
        boolean boolean31 = mutableDateTime24.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        mutableDateTime27.setTime(31243724946L);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime27.era();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundHalfEven();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (-1), chronology37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone41 = dateTimeZone40.toTimeZone();
        org.joda.time.DateTime dateTime42 = localDateTime38.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.hours();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.secondOfMinute();
        org.joda.time.DurationField durationField46 = chronology43.months();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.millisOfSecond();
        java.lang.String str48 = chronology43.toString();
        org.joda.time.DateTimeField dateTimeField49 = chronology43.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField50 = chronology43.clockhourOfHalfday();
        org.joda.time.DateTime dateTime51 = mutableDateTime35.toDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology43);
        boolean boolean53 = durationFieldType18.isSupported(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField17", Math.signum(durationField9.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField9)));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(9);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfDay();
        org.joda.time.DurationField durationField36 = chronology34.minutes();
        org.joda.time.DurationField durationField37 = chronology34.minutes();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 292278993, chronology34);
        org.joda.time.Chronology chronology39 = chronology34.withUTC();
        org.joda.time.DurationField durationField40 = chronology39.weekyears();
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        org.joda.time.DurationField durationField42 = chronology41.months();
        org.joda.time.DateTime dateTime43 = dateTime25.withChronology(chronology41);
        int int44 = dateTime25.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime43", (dateTime25.compareTo(dateTime43) == 0) == dateTime25.equals(dateTime43));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property22 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(9);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = localDateTime28.toDateTime(dateTimeZone30);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfDay();
        org.joda.time.DurationField durationField35 = chronology33.minutes();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekyearOfCentury();
        org.joda.time.Chronology chronology37 = chronology33.withUTC();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = chronology37.getZone();
        org.joda.time.DateTime dateTime40 = dateTime24.toDateTime(dateTimeZone39);
        long long44 = dateTimeZone39.convertLocalToUTC(3265200240L, true, (long) 83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime40", (dateTime24.compareTo(dateTime40) == 0) == dateTime24.equals(dateTime40));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        boolean boolean18 = dateTime9.isEqual((long) 100);
        org.joda.time.DateTime dateTime20 = dateTime9.plusMinutes((int) 'x');
        org.joda.time.DateTime dateTime21 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePartial readablePartial22 = null;
        org.joda.time.DateTime dateTime23 = dateTime9.withFields(readablePartial22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfCentury();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) (-1), chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTime dateTime31 = localDateTime27.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology32.add(readablePeriod34, (long) (-292275054), (int) '4');
        org.joda.time.Chronology chronology38 = chronology32.withUTC();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusYears(254);
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.minuteOfHour();
        java.util.Locale locale43 = java.util.Locale.ROOT;
        java.lang.String str44 = property42.getAsShortText(locale43);
        java.util.Calendar calendar45 = dateTime23.toCalendar(locale43);
        java.util.Set<java.lang.Character> charSet46 = locale43.getExtensionKeys();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and calendar45", (calendar12.compareTo(calendar45) == 0) == calendar12.equals(calendar45));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add((long) 100);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.DateTime dateTime12 = dateTime9.plus((long) 100);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Calendar calendar15 = dateTime12.toCalendar(locale14);
        int int16 = dateTime12.getMinuteOfHour();
        boolean boolean17 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Instant instant18 = mutableDateTime0.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime0.dayOfMonth();
        int int20 = property19.getMaximumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant18", (mutableDateTime0.compareTo(instant18) == 0) == mutableDateTime0.equals(instant18));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withDurationAdded(readableDuration11, (int) 'u');
        int int14 = localDateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime4.withWeekOfWeekyear(17);
        org.joda.time.LocalDateTime.Property property17 = localDateTime4.secondOfMinute();
        org.joda.time.LocalDateTime.Property property18 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime4.minusSeconds((int) (byte) -1);
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = locale24.getCountry();
        java.util.Calendar calendar26 = mutableDateTime23.toCalendar(locale24);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.fromCalendarFields(calendar26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.fromCalendarFields(calendar26);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.centuryOfEra();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.months();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.millisOfDay();
        org.joda.time.DateTime dateTime33 = dateTime21.withChronology(chronology30);
        org.joda.time.DurationField durationField34 = chronology30.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime33", (dateTime21.compareTo(dateTime33) == 0) == dateTime21.equals(dateTime33));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology11.millis();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.halfdayOfDay();
        org.joda.time.DurationField durationField17 = chronology11.millis();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 265, chronology11);
        org.joda.time.DateTimeField dateTimeField19 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology11.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField20", Math.signum(durationField15.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField15)));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTime dateTime9 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = chronology10.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = chronology10.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.years();
        org.joda.time.DurationField durationField18 = chronology16.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField17", (durationField14.compareTo(durationField17) == 0) == durationField14.equals(durationField17));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withChronology(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        boolean boolean18 = dateTimeZone13.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.weekyear();
        boolean boolean23 = dateTimeZone13.isLocalDateTimeGap(localDateTime21);
        long long25 = dateTimeZone13.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter3.withZone(dateTimeZone13);
        long long28 = dateTimeZone13.nextTransition((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 1970, dateTimeZone13);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter32.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.monthOfYear();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField44 = chronology40.days();
        org.joda.time.Chronology chronology45 = chronology40.withUTC();
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime29.toMutableDateTime(chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and mutableDateTime46", (dateTime29.compareTo(mutableDateTime46) == 0) == dateTime29.equals(mutableDateTime46));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = mutableDateTime1.get(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.secondOfDay();
        org.joda.time.DurationField durationField23 = chronology21.minutes();
        org.joda.time.DurationField durationField24 = chronology21.minutes();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 292278993, chronology21);
        org.joda.time.Chronology chronology26 = chronology21.withUTC();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime1.toMutableDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime27", (mutableDateTime1.compareTo(mutableDateTime27) == 0) == mutableDateTime1.equals(mutableDateTime27));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.set(10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.DateTime dateTime14 = dateTime11.plus((long) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.minus(readablePeriod17);
        boolean boolean19 = dateTime18.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.hours();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.secondOfMinute();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.weekyear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusHours((-1));
        java.util.Locale locale38 = java.util.Locale.JAPANESE;
        java.lang.String str39 = dateTimeField31.getAsText((org.joda.time.ReadablePartial) localDateTime34, locale38);
        int int41 = dateTimeField31.getLeapAmount((long) (-1));
        int int42 = mutableDateTime21.get(dateTimeField31);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) (-1), chronology44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone48 = dateTimeZone47.toTimeZone();
        org.joda.time.DateTime dateTime49 = localDateTime45.toDateTime(dateTimeZone47);
        org.joda.time.Chronology chronology50 = dateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(chronology50);
        org.joda.time.DateTime dateTime53 = mutableDateTime21.toDateTime(chronology50);
        java.lang.String str54 = chronology50.toString();
        org.joda.time.DateTime dateTime55 = dateTime18.toDateTime(chronology50);
        mutableDateTime4.setChronology(chronology50);
        java.lang.String str57 = chronology50.toString();
        org.joda.time.DateTimeField dateTimeField58 = chronology50.millisOfDay();
        org.joda.time.DateTimeField dateTimeField59 = chronology50.millisOfDay();
        org.joda.time.DurationField durationField60 = chronology50.weekyears();
        org.joda.time.DurationField durationField61 = chronology50.years();
        org.joda.time.Chronology chronology62 = chronology50.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField60 and durationField61", (durationField60.compareTo(durationField61) == 0) == durationField60.equals(durationField61));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Calendar calendar12 = dateTime9.toCalendar(locale11);
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        org.joda.time.DateTime.Property property17 = dateTime9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime9.getZone();
        org.joda.time.Instant instant19 = dateTime9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(1123200000L, dateTimeZone21);
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale23.getDisplayScript();
        java.util.Calendar calendar25 = mutableDateTime22.toCalendar(locale23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = localDateTime28.toDateTime(dateTimeZone30);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.millis();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime22, chronology33);
        boolean boolean39 = dateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime22.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant19", (dateTime9.compareTo(instant19) == 0) == dateTime9.equals(instant19));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = mutableDateTime1.get(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.secondOfDay();
        org.joda.time.DurationField durationField23 = chronology21.minutes();
        org.joda.time.DurationField durationField24 = chronology21.minutes();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 292278993, chronology21);
        org.joda.time.Chronology chronology26 = chronology21.withUTC();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime1.toMutableDateTime(chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime27", (mutableDateTime1.compareTo(mutableDateTime27) == 0) == mutableDateTime1.equals(mutableDateTime27));
    }
}

