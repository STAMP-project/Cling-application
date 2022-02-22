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
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology15 = null;
        mutableDateTime14.setChronology(chronology15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType17.getField(chronology18);
        mutableDateTime14.setRounding(dateTimeField19, (int) (short) 1);
        boolean boolean22 = dateTimeField19.isSupported();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = dateTimeField19.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = dateTimeField19.getType();
        boolean boolean25 = dateTime6.isSupported(dateTimeFieldType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant12", (dateTime6.compareTo(instant12) == 0) == dateTime6.equals(instant12));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        java.util.GregorianCalendar gregorianCalendar13 = dateTime6.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant12", (dateTime6.compareTo(instant12) == 0) == dateTime6.equals(instant12));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight6 = localDate2.toDateMidnight(dateTimeZone4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime5", (dateTime1.compareTo(mutableDateTime5) == 0) == dateTime1.equals(mutableDateTime5));
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
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        org.joda.time.Instant instant12 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime6.withMillisOfSecond(35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant12", (dateTime6.compareTo(instant12) == 0) == dateTime6.equals(instant12));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfCentury();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) 1, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime9.toDateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDate0.toDateTimeAtStartOfDay(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime14", (dateTime9.compareTo(dateTime14) == 0) == dateTime9.equals(dateTime14));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        int int10 = dateTime9.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfMinute();
        org.joda.time.DateTime dateTime11 = property10.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        mutableDateTime0.add(durationFieldType3, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter8.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType3.getField(chronology16);
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology16.add(readablePeriod21, (-506L), 40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
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
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        org.joda.time.Instant instant12 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime6.plusMinutes(86390000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant12", (dateTime6.compareTo(instant12) == 0) == dateTime6.equals(instant12));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        int int10 = dateTime9.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone18);
        mutableDateTime8.setZone(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        mutableDateTime8.set(dateTimeFieldType21, (int) '4');
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime(dateTimeZone28);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.DateTime dateTime33 = dateTime30.plus((long) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusSeconds(0);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withChronology(chronology36);
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime37.minusMinutes(56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime37", (mutableDateTime8.compareTo(dateTime37) == 0) == mutableDateTime8.equals(dateTime37));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        org.joda.time.Chronology chronology9 = null;
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
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.lang.String str24 = locale23.toLanguageTag();
        java.lang.String str25 = locale21.getDisplayCountry(locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology9, locale21, (java.lang.Integer) 38);
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = null;
        org.joda.time.format.DateTimeParser dateTimeParser29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (-1), chronology32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        org.joda.time.DateTime dateTime37 = localDateTime33.toDateTime(dateTimeZone35);
        org.joda.time.Chronology chronology38 = dateTime37.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter30.withChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.monthOfYear();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.weekyearOfCentury();
        dateTimeParserBucket27.saveField(dateTimeField41, 19);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        dateTimeParserBucket27.saveField(dateTimeFieldType44, 69);
        int int49 = mutableDateTime4.get(dateTimeFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 42, chronology11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
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
        org.joda.time.DateTimeField dateTimeField30 = chronology28.monthOfYear();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(chronology28);
        org.joda.time.DateTimeField dateTimeField32 = chronology28.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = chronology28.centuries();
        org.joda.time.DateTime dateTime34 = dateTime17.toDateTime(chronology28);
        org.joda.time.Chronology chronology35 = dateTime17.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.millis();
        org.joda.time.DateTime dateTime37 = dateTime15.withChronology(chronology35);
        org.joda.time.DurationField durationField38 = chronology35.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField33, and durationField36", !(durationField38.compareTo(durationField33) == 0) || (Math.signum(durationField38.compareTo(durationField36)) == Math.signum(durationField33.compareTo(durationField36))));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        java.lang.String str19 = dateTime18.toString();
        org.joda.time.DateTime dateTime21 = dateTime18.plus((long) 100);
        org.joda.time.DateTime.Property property22 = dateTime18.millisOfSecond();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 1, chronology24);
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded((long) (byte) 0, 292278993);
        int int29 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long33 = dateTimeZone31.convertUTCToLocal((long) 2000);
        org.joda.time.DateTime dateTime34 = dateTime18.withZone(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime6.toDateTime(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime34", (dateTime6.compareTo(dateTime34) == 0) == dateTime6.equals(dateTime34));
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
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime6.millisOfSecond();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 1, chronology12);
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) (byte) 0, 292278993);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long21 = dateTimeZone19.convertUTCToLocal((long) 2000);
        org.joda.time.DateTime dateTime22 = dateTime6.withZone(dateTimeZone19);
        java.util.TimeZone timeZone23 = dateTimeZone19.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime22", (dateTime6.compareTo(dateTime22) == 0) == dateTime6.equals(dateTime22));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        mutableDateTime0.add(durationFieldType3, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter8.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType3.getField(chronology16);
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        int int17 = dateTime6.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime6.toMutableDateTimeISO();
        int int19 = dateTime6.getWeekOfWeekyear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime26 = localDateTime22.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfYear();
        org.joda.time.Chronology chronology29 = chronology27.withUTC();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) dateTime6, chronology29);
        org.joda.time.DurationField durationField31 = chronology29.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime30", (dateTime6.compareTo(dateTime30) == 0) == dateTime6.equals(dateTime30));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1970, chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology11.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField18", Math.signum(durationField15.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField15)));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withYearOfCentury(23);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withWeekOfWeekyear(23);
        int int14 = localDateTime11.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayScript();
        java.lang.String str21 = dateTimeZone16.getName((long) 5, locale19);
        org.joda.time.DateTime dateTime22 = localDateTime11.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfDay();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology30.add(readablePeriod34, (long) 31, 69);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, 33);
        int[] intArray50 = chronology30.get((org.joda.time.ReadablePartial) localDateTime45, 315532800000L);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime11, chronology30);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField53 = chronology30.clockhourOfHalfday();
        org.joda.time.DurationField durationField54 = chronology30.eras();
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField32 and durationField54", Math.signum(durationField32.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField32)));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology7.eras();
        org.joda.time.DurationField durationField11 = chronology7.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField11, and durationField10", !(durationField10.compareTo(durationField11) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField11.compareTo(durationField10))));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusYears(2);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.dayOfYear();
        org.joda.time.Chronology chronology31 = chronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.DateTime dateTime33 = dateTime12.toDateTime(chronology31);
        org.joda.time.DurationField durationField34 = chronology31.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime33", (dateTime9.compareTo(dateTime33) == 0) == dateTime9.equals(dateTime33));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfMonth();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology7);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.dayOfYear();
        org.joda.time.Chronology chronology21 = chronology19.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.clockhourOfDay();
        org.joda.time.DurationField durationField23 = chronology21.centuries();
        org.joda.time.DateTime dateTime24 = dateTime11.withChronology(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField23", Math.signum(durationField9.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField9)));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.setDate((-1L));
        int int5 = mutableDateTime1.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime1.isSupported(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = dateTimeZone9.getName((long) 5, locale12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayScript();
        java.lang.String str22 = dateTimeZone17.getName((long) 5, locale20);
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime(dateTimeZone17);
        mutableDateTime1.setZoneRetainFields(dateTimeZone17);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime1.toDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime27", (mutableDateTime1.compareTo(dateTime27) == 0) == mutableDateTime1.equals(dateTime27));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology12.days();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1970, chronology12);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology12.eras();
        java.util.Locale locale21 = new java.util.Locale("365");
        java.lang.String str22 = locale21.getVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(92233081382400032L, chronology12, locale21, (java.lang.Integer) 86300003, 8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField19", Math.signum(durationField16.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField16)));
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
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        long long22 = dateTimeZone20.previousTransition((long) 1);
        org.joda.time.DateTime dateTime23 = dateTime12.withZone(dateTimeZone20);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter26.withChronology(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.monthOfYear();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.DurationField durationField39 = chronology34.eras();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime23.toMutableDateTime(chronology34);
        org.joda.time.DurationField durationField41 = chronology34.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField41, and durationField39", !(durationField39.compareTo(durationField41) == 0) || (Math.signum(durationField39.compareTo(durationField39)) == Math.signum(durationField41.compareTo(durationField39))));
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
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime25 = dateTime23.minus(315532847000L);
        org.joda.time.DateTime dateTime27 = dateTime25.withHourOfDay(12);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMillis(54);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime38 = localDateTime34.toDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.secondOfDay();
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 575, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        int int48 = dateTimeField46.getLeapAmount((long) (byte) 1);
        long long50 = dateTimeField46.remainder((long) (-292275054));
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (-1), chronology52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekyear();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime53.minus(readablePeriod59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime53.withMonthOfYear(1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusMinutes(292278993);
        int int65 = dateTimeField46.getMinimumValue((org.joda.time.ReadablePartial) localDateTime62);
        long long67 = dateTimeField46.remainder((long) 30);
        long long69 = dateTimeField46.roundHalfCeiling((long) 575);
        long long72 = dateTimeField46.set((long) 0, (int) (byte) 1);
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet75 = locale74.getExtensionKeys();
        java.lang.String str76 = dateTimeField46.getAsText(1999, locale74);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((-3600000L), chronology41, locale74);
        org.joda.time.DateTime dateTime78 = dateTime29.withChronology(chronology41);
        org.joda.time.DateTimeField dateTimeField79 = chronology41.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime78", (dateTime29.compareTo(dateTime78) == 0) == dateTime29.equals(dateTime78));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.setDate((-1L));
        int int5 = mutableDateTime1.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime1.isSupported(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = dateTimeZone9.getName((long) 5, locale12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayScript();
        java.lang.String str22 = dateTimeZone17.getName((long) 5, locale20);
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime(dateTimeZone17);
        mutableDateTime1.setZoneRetainFields(dateTimeZone17);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime1.toDateTime(chronology26);
        org.joda.time.DurationField durationField28 = chronology26.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime27", (mutableDateTime1.compareTo(dateTime27) == 0) == mutableDateTime1.equals(dateTime27));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = mutableDateTime1.get(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime16 = localTime14.minusSeconds((int) (short) 10);
        int int17 = localTime14.getMinuteOfHour();
        org.joda.time.LocalTime.Property property18 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime19 = property18.withMaximumValue();
        boolean boolean20 = property18.isLeap();
        org.joda.time.LocalTime localTime21 = property18.roundFloorCopy();
        org.joda.time.LocalTime.Property property22 = localTime21.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime24.set(dateTimeFieldType25, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime24.add(readablePeriod28, 4);
        int int31 = mutableDateTime24.getMillisOfDay();
        long long32 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime1.addMonths(5);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.add(5270);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        org.joda.time.format.DateTimePrinter dateTimePrinter41 = null;
        org.joda.time.format.DateTimeParser dateTimeParser42 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter41, dateTimeParser42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (-1), chronology45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone49 = dateTimeZone48.toTimeZone();
        org.joda.time.DateTime dateTime50 = localDateTime46.toDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology51 = dateTime50.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter43.withChronology(chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.monthOfYear();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now(chronology51);
        org.joda.time.DateTimeField dateTimeField55 = chronology51.weekOfWeekyear();
        org.joda.time.DurationField durationField56 = chronology51.centuries();
        org.joda.time.DateTime dateTime57 = dateTime40.toDateTime(chronology51);
        org.joda.time.Chronology chronology58 = dateTime40.getChronology();
        org.joda.time.DurationField durationField59 = chronology58.millis();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.millisOfDay();
        mutableDateTime38.setChronology(chronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and dateTime40", (mutableDateTime11.compareTo(dateTime40) == 0) == mutableDateTime11.equals(dateTime40));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.setWeekyear(31);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        int int10 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime12.add(readableDuration13, 100);
        boolean boolean16 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime12.add(readableDuration17, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone22);
        mutableDateTime12.setZone(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime1.toMutableDateTime(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and mutableDateTime12", (mutableDateTime9.compareTo(mutableDateTime12) == 0) == mutableDateTime9.equals(mutableDateTime12));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime2.minusYears(8);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        boolean boolean6 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime4.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter10.withChronology(chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        boolean boolean25 = dateTimeZone20.isLocalDateTimeGap(localDateTime24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekyear();
        boolean boolean30 = dateTimeZone20.isLocalDateTimeGap(localDateTime28);
        long long32 = dateTimeZone20.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter10.withZone(dateTimeZone20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter33.withPivotYear(2022);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter33.withPivotYear((java.lang.Integer) 33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter37.withOffsetParsed();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (-1), chronology40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.weekyear();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime41.minus(readablePeriod47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime41.withYearOfCentury(23);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withWeekOfWeekyear(23);
        int int53 = localDateTime50.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(dateTimeZone55);
        java.util.Locale locale58 = java.util.Locale.ENGLISH;
        java.lang.String str59 = locale58.getDisplayScript();
        java.lang.String str60 = dateTimeZone55.getName((long) 5, locale58);
        org.joda.time.DateTime dateTime61 = localDateTime50.toDateTime(dateTimeZone55);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (-1), chronology63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone67 = dateTimeZone66.toTimeZone();
        org.joda.time.DateTime dateTime68 = localDateTime64.toDateTime(dateTimeZone66);
        org.joda.time.Chronology chronology69 = dateTime68.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.secondOfDay();
        org.joda.time.DurationField durationField71 = chronology69.minutes();
        org.joda.time.DateTimeField dateTimeField72 = chronology69.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        long long76 = chronology69.add(readablePeriod73, (long) 31, 69);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((long) (-1), chronology78);
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.weekyear();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime79.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime79.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        org.joda.time.LocalDateTime localDateTime87 = localDateTime84.withPeriodAdded(readablePeriod85, 33);
        int[] intArray89 = chronology69.get((org.joda.time.ReadablePartial) localDateTime84, 315532800000L);
        org.joda.time.LocalDateTime localDateTime90 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime50, chronology69);
        org.joda.time.DateTimeField dateTimeField91 = chronology69.weekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter92 = dateTimeFormatter38.withChronology(chronology69);
        org.joda.time.DurationField durationField93 = chronology69.minutes();
        org.joda.time.DateTimeField dateTimeField94 = chronology69.weekyear();
        org.joda.time.DateTimeField dateTimeField95 = chronology69.era();
        mutableDateTime4.setChronology(chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime56", (mutableDateTime1.compareTo(mutableDateTime56) == 0) == mutableDateTime1.equals(mutableDateTime56));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.getLocalDate();
        int int10 = localDate9.getDayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 3, chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType14.getRangeDurationType();
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        org.joda.time.LocalDate.Property property18 = localDate13.centuryOfEra();
        org.joda.time.LocalDate localDate19 = property18.roundCeilingCopy();
        org.joda.time.LocalDate localDate20 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate9.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        long long31 = dateTimeZone26.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone32 = dateTimeZone26.toTimeZone();
        long long34 = dateTimeZone26.previousTransition((long) 'a');
        org.joda.time.DateTime dateTime35 = dateTime25.withZoneRetainFields(dateTimeZone26);
        java.lang.String str36 = dateTime25.toString();
        org.joda.time.Instant instant37 = dateTime25.toInstant();
        org.joda.time.DateTime.Property property38 = dateTime25.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant37", (dateTime25.compareTo(instant37) == 0) == dateTime25.equals(instant37));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime8.getRoundingField();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.add((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime14 = property10.add((long) 86399999);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getRangeDurationType();
        mutableDateTime14.add(durationFieldType16, (-1));
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter21.withChronology(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.monthOfYear();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology29);
        org.joda.time.DateTimeField dateTimeField33 = chronology29.weekOfWeekyear();
        org.joda.time.DurationField durationField34 = chronology29.centuries();
        org.joda.time.DurationField durationField35 = chronology29.centuries();
        org.joda.time.DurationField durationField36 = durationFieldType16.getField(chronology29);
        org.joda.time.DurationFieldType durationFieldType37 = durationField36.getType();
        mutableDateTime4.add(durationFieldType37, (int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        mutableDateTime1.addMillis((-292275054));
        java.lang.String str4 = mutableDateTime1.toString();
        mutableDateTime1.addMonths(47);
        org.joda.time.Chronology chronology7 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(54363209L, chronology7);
        org.joda.time.DurationField durationField11 = chronology7.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.addMillis((-292275054));
        java.lang.String str3 = mutableDateTime0.toString();
        mutableDateTime0.addMonths(47);
        org.joda.time.Chronology chronology6 = mutableDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minusMillis(1);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime11.withDurationAdded(readableDuration18, 86399999);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.year();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendFractionOfSecond(33, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType28.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder27.appendShortText(dateTimeFieldType28);
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
        org.joda.time.DateTimeField dateTimeField51 = chronology47.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType28.getField(chronology47);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) (-1), chronology54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.dayOfYear();
        org.joda.time.DurationField durationField57 = property56.getLeapDurationField();
        org.joda.time.Interval interval58 = property56.toInterval();
        long long59 = property56.remainder();
        java.lang.String str60 = property56.toString();
        org.joda.time.LocalDateTime localDateTime62 = property56.setCopy((int) (short) 1);
        int int63 = localDateTime62.getDayOfMonth();
        int int64 = localDateTime62.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.withYearOfCentury((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plus(readablePeriod67);
        int int69 = localDateTime68.getDayOfWeek();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) (-1), chronology71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone75 = dateTimeZone74.toTimeZone();
        org.joda.time.DateTime dateTime76 = localDateTime72.toDateTime(dateTimeZone74);
        org.joda.time.Chronology chronology77 = dateTime76.getChronology();
        org.joda.time.DateTimeField dateTimeField78 = chronology77.secondOfDay();
        org.joda.time.DurationField durationField79 = chronology77.minutes();
        org.joda.time.DateTimeField dateTimeField80 = chronology77.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        long long84 = chronology77.add(readablePeriod81, (long) 31, 69);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime((long) (-1), chronology86);
        org.joda.time.LocalDateTime.Property property88 = localDateTime87.weekyear();
        org.joda.time.LocalDateTime localDateTime90 = localDateTime87.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime87.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod93 = null;
        org.joda.time.LocalDateTime localDateTime95 = localDateTime92.withPeriodAdded(readablePeriod93, 33);
        int[] intArray97 = chronology77.get((org.joda.time.ReadablePartial) localDateTime92, 315532800000L);
        int int98 = dateTimeField52.getMaximumValue((org.joda.time.ReadablePartial) localDateTime68, intArray97);
        chronology6.validate((org.joda.time.ReadablePartial) localDateTime20, intArray97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField50", Math.signum(durationField8.compareTo(durationField50)) == -Math.signum(durationField50.compareTo(durationField8)));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.year();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.yearOfEra();
        org.joda.time.DurationField durationField11 = chronology7.eras();
        org.joda.time.DurationField durationField12 = chronology7.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime1.setMillisOfSecond((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.weekOfWeekyear();
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
        org.joda.time.DateTimeField dateTimeField24 = chronology21.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.DurationField durationField26 = chronology21.eras();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(888L, chronology21);
        mutableDateTime1.setChronology(chronology21);
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
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(chronology39);
        org.joda.time.DateTimeField dateTimeField43 = chronology39.weekOfWeekyear();
        org.joda.time.DurationField durationField44 = chronology39.centuries();
        org.joda.time.DateTimeField dateTimeField45 = chronology39.weekyearOfCentury();
        org.joda.time.DurationField durationField46 = chronology39.weekyears();
        mutableDateTime1.setChronology(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField44", Math.signum(durationField26.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField26)));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.getLocalDate();
        int int10 = localDate9.getDayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 3, chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType14.getRangeDurationType();
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        org.joda.time.LocalDate.Property property18 = localDate13.centuryOfEra();
        org.joda.time.LocalDate localDate19 = property18.roundCeilingCopy();
        org.joda.time.LocalDate localDate20 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate9.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        long long31 = dateTimeZone26.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone32 = dateTimeZone26.toTimeZone();
        long long34 = dateTimeZone26.previousTransition((long) 'a');
        org.joda.time.DateTime dateTime35 = dateTime25.withZoneRetainFields(dateTimeZone26);
        java.lang.String str36 = dateTime25.toString();
        org.joda.time.Instant instant37 = dateTime25.toInstant();
        int int38 = dateTime25.getYearOfCentury();
        org.joda.time.DateTime dateTime40 = dateTime25.minusSeconds(36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant37", (dateTime25.compareTo(instant37) == 0) == dateTime25.equals(instant37));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(31244400000L, chronology11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusYears(0);
        org.joda.time.Chronology chronology22 = localDateTime16.getChronology();
        org.joda.time.DateTime dateTime23 = mutableDateTime13.toDateTime(chronology22);
        org.joda.time.DurationField durationField24 = chronology22.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and dateTime23", (mutableDateTime13.compareTo(dateTime23) == 0) == mutableDateTime13.equals(dateTime23));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime2.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime2.add(readableDuration5, (int) (short) 100);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks(33);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property13 = localDate11.property(dateTimeFieldType12);
        java.util.Locale locale17 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate18 = property13.setCopy("365", locale17);
        org.joda.time.LocalDate localDate20 = property13.addToCopy(59);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTime dateTime22 = mutableDateTime2.toDateTime(chronology21);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime26 = localTime24.minusSeconds((int) (short) 10);
        int int27 = localTime24.getMinuteOfHour();
        org.joda.time.LocalTime.Property property28 = localTime24.hourOfDay();
        org.joda.time.LocalTime localTime29 = property28.withMaximumValue();
        boolean boolean30 = property28.isLeap();
        org.joda.time.LocalTime localTime31 = property28.roundFloorCopy();
        org.joda.time.LocalTime.Property property32 = localTime31.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale35 = java.util.Locale.TAIWAN;
        java.lang.String str36 = locale35.toLanguageTag();
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        java.lang.String str38 = locale35.getDisplayScript(locale37);
        java.lang.String str39 = locale37.getVariant();
        java.lang.String str40 = dateTimeZone33.getName(0L, locale37);
        java.lang.String str41 = locale37.getDisplayCountry();
        int int42 = property32.getMaximumShortTextLength(locale37);
        org.joda.time.LocalTime localTime44 = property32.addCopy(10L);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime48 = localTime46.minusSeconds((int) (short) 10);
        int int49 = localTime46.getMinuteOfHour();
        org.joda.time.LocalTime.Property property50 = localTime46.hourOfDay();
        org.joda.time.LocalTime localTime51 = property50.withMaximumValue();
        boolean boolean52 = property50.isLeap();
        org.joda.time.LocalTime localTime54 = property50.addCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime56 = property50.addNoWrapToCopy(0);
        org.joda.time.LocalTime localTime58 = property50.addCopy(999);
        org.joda.time.LocalTime localTime60 = localTime58.minusSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime();
        mutableDateTime62.add((long) 100);
        org.joda.time.Chronology chronology65 = null;
        mutableDateTime62.setChronology(chronology65);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        long long69 = dateTimeZone67.previousTransition((long) 1);
        mutableDateTime62.setZone(dateTimeZone67);
        int int71 = mutableDateTime62.getSecondOfMinute();
        java.util.Locale locale72 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.Character> charSet73 = locale72.getExtensionKeys();
        java.util.Calendar calendar74 = mutableDateTime62.toCalendar(locale72);
        java.lang.String str75 = localTime58.toString("\u5354\u8abf\u4e16\u754c\u6642\u9593", locale72);
        java.lang.String str76 = property32.getAsShortText(locale72);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket((long) 11, chronology21, locale72, (java.lang.Integer) 0, 292278993);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime22", (mutableDateTime2.compareTo(dateTime22) == 0) == mutableDateTime2.equals(dateTime22));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        int int17 = dateTime6.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime6.toMutableDateTimeISO();
        int int19 = dateTime6.getWeekOfWeekyear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime26 = localDateTime22.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfYear();
        org.joda.time.Chronology chronology29 = chronology27.withUTC();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) dateTime6, chronology29);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime30", (dateTime6.compareTo(dateTime30) == 0) == dateTime6.equals(dateTime30));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology12.days();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1970, chronology12);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology12.eras();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(94694399997L, chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField19", Math.signum(durationField16.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField16)));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1970, chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology11.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField18", Math.signum(durationField15.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField15)));
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
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusYears(2);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.dayOfYear();
        org.joda.time.Chronology chronology31 = chronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.DateTime dateTime33 = dateTime12.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime33", (dateTime9.compareTo(dateTime33) == 0) == dateTime9.equals(dateTime33));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDate0.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks(1969);
        org.joda.time.Instant instant11 = dateTime8.toInstant();
        org.joda.time.DateTime dateTime13 = dateTime8.minusYears(54402);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant11", (dateTime5.compareTo(instant11) == 0) == dateTime5.equals(instant11));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime5 = localTime1.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology6.months();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField11 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField7, and durationField9", !(durationField11.compareTo(durationField7) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addToCopy((int) ' ');
        org.joda.time.LocalDate localDate12 = localDate10.withWeekyear(2);
        org.joda.time.LocalDate.Property property13 = localDate12.monthOfYear();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(53L);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        boolean boolean17 = localDate12.equals((java.lang.Object) dateTime16);
        org.joda.time.Instant instant18 = dateTime16.toInstant();
        org.joda.time.DateTime dateTime21 = dateTime16.withDurationAdded((-3L), 62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant18", (dateTime16.compareTo(instant18) == 0) == dateTime16.equals(instant18));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.setWeekyear(31);
        mutableDateTime1.setMinuteOfHour(4);
        mutableDateTime1.addHours(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int9 = mutableDateTime1.get(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime13 = localTime11.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime15 = localTime11.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology16 = localTime11.getChronology();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.weekOfWeekyear();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime17);
        java.util.Date date20 = mutableDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.fromDateFields(date20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime17", (mutableDateTime1.compareTo(dateTime17) == 0) == mutableDateTime1.equals(dateTime17));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime7.add(readableDuration9, (int) (byte) -1);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime15 = localTime13.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime17 = localTime13.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.millis();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfEra();
        org.joda.time.DurationField durationField21 = chronology18.months();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology18);
        mutableDateTime7.setChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime8", (mutableDateTime7.compareTo(mutableDateTime8) == 0) == mutableDateTime7.equals(mutableDateTime8));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        int int3 = mutableDateTime1.getMillisOfSecond();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property6 = localDate4.property(dateTimeFieldType5);
        java.util.Locale locale10 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate11 = property6.setCopy("365", locale10);
        org.joda.time.LocalDate localDate13 = property6.setCopy((int) 'a');
        org.joda.time.LocalDate localDate15 = property6.setCopy((-1));
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra(1999);
        org.joda.time.Chronology chronology18 = localDate15.getChronology();
        org.joda.time.Chronology chronology19 = chronology18.withUTC();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime1.toMutableDateTime(chronology18);
        org.joda.time.DurationField durationField21 = chronology18.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime20", (mutableDateTime1.compareTo(mutableDateTime20) == 0) == mutableDateTime1.equals(mutableDateTime20));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime2.add((long) '#');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology8 = null;
        mutableDateTime7.setChronology(chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        mutableDateTime7.setRounding(dateTimeField12, (int) (short) 1);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        mutableDateTime2.setDayOfWeek(5);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime21 = localTime19.minusSeconds((int) (short) 10);
        int int22 = localTime19.getMinuteOfHour();
        org.joda.time.LocalTime.Property property23 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime24 = property23.withMaximumValue();
        org.joda.time.DateTime dateTime25 = localTime24.toDateTimeToday();
        int int26 = localTime24.size();
        org.joda.time.LocalTime localTime28 = localTime24.plusHours((-1));
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.millisOfDay();
        org.joda.time.DurationField durationField31 = chronology29.years();
        org.joda.time.DurationField durationField32 = chronology29.weeks();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime2.toMutableDateTime(chronology29);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.now(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime33", (mutableDateTime2.compareTo(mutableDateTime33) == 0) == mutableDateTime2.equals(mutableDateTime33));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime25 = dateTime23.minus(315532847000L);
        org.joda.time.DateTime dateTime27 = dateTime25.withHourOfDay(12);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMillis(54);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime38 = localDateTime34.toDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.secondOfDay();
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 575, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        int int48 = dateTimeField46.getLeapAmount((long) (byte) 1);
        long long50 = dateTimeField46.remainder((long) (-292275054));
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (-1), chronology52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekyear();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime53.minus(readablePeriod59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime53.withMonthOfYear(1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusMinutes(292278993);
        int int65 = dateTimeField46.getMinimumValue((org.joda.time.ReadablePartial) localDateTime62);
        long long67 = dateTimeField46.remainder((long) 30);
        long long69 = dateTimeField46.roundHalfCeiling((long) 575);
        long long72 = dateTimeField46.set((long) 0, (int) (byte) 1);
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet75 = locale74.getExtensionKeys();
        java.lang.String str76 = dateTimeField46.getAsText(1999, locale74);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((-3600000L), chronology41, locale74);
        org.joda.time.DateTime dateTime78 = dateTime29.withChronology(chronology41);
        org.joda.time.DurationField durationField79 = chronology41.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime78", (dateTime29.compareTo(dateTime78) == 0) == dateTime29.equals(dateTime78));
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
        org.joda.time.DateTime dateTime19 = dateTime9.toDateTime();
        org.joda.time.LocalDateTime localDateTime20 = dateTime9.toLocalDateTime();
        org.joda.time.Instant instant21 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime23 = dateTime9.minusYears((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant21", (dateTime23.compareTo(instant21) == 0) == dateTime23.equals(instant21));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime25 = dateTime23.minus(315532847000L);
        org.joda.time.DateTime dateTime27 = dateTime25.withHourOfDay(12);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMillis(54);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime38 = localDateTime34.toDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.secondOfDay();
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 575, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        int int48 = dateTimeField46.getLeapAmount((long) (byte) 1);
        long long50 = dateTimeField46.remainder((long) (-292275054));
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (-1), chronology52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekyear();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime53.minus(readablePeriod59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime53.withMonthOfYear(1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusMinutes(292278993);
        int int65 = dateTimeField46.getMinimumValue((org.joda.time.ReadablePartial) localDateTime62);
        long long67 = dateTimeField46.remainder((long) 30);
        long long69 = dateTimeField46.roundHalfCeiling((long) 575);
        long long72 = dateTimeField46.set((long) 0, (int) (byte) 1);
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet75 = locale74.getExtensionKeys();
        java.lang.String str76 = dateTimeField46.getAsText(1999, locale74);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((-3600000L), chronology41, locale74);
        org.joda.time.DateTime dateTime78 = dateTime29.withChronology(chronology41);
        org.joda.time.DateTimeField dateTimeField79 = chronology41.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime78", (dateTime29.compareTo(dateTime78) == 0) == dateTime29.equals(dateTime78));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateTime dateTime11 = dateTime8.plus((long) 100);
        org.joda.time.DateTime.Property property12 = dateTime8.millisOfSecond();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 1, chronology14);
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded((long) (byte) 0, 292278993);
        int int19 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DurationField durationField31 = chronology28.minutes();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 292278993, chronology28);
        org.joda.time.DateTime dateTime33 = dateTime8.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField34 = chronology28.minuteOfDay();
        java.util.Locale locale35 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 69, chronology28, locale35, (java.lang.Integer) 33, (int) ' ');
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology28);
        java.lang.String str40 = dateTime39.toString();
        org.joda.time.DateTime dateTime42 = dateTime39.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime44 = dateTime39.minusYears(35);
        org.joda.time.DateTime.Property property45 = dateTime44.secondOfMinute();
        org.joda.time.DateTime dateTime47 = dateTime44.withSecondOfMinute(15);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime49.set(dateTimeFieldType50, (-292275054));
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime49.yearOfEra();
        mutableDateTime49.setYear((int) '#');
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) (-1), chronology57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone61 = dateTimeZone60.toTimeZone();
        org.joda.time.DateTime dateTime62 = localDateTime58.toDateTime(dateTimeZone60);
        int int64 = dateTimeZone60.getOffsetFromLocal((long) (byte) 10);
        long long66 = dateTimeZone60.nextTransition((long) 59);
        mutableDateTime49.setZoneRetainFields(dateTimeZone60);
        long long70 = dateTimeZone60.convertLocalToUTC((-1609459200000L), false);
        java.util.Locale locale72 = java.util.Locale.TAIWAN;
        java.lang.String str73 = locale72.toLanguageTag();
        java.util.Locale locale74 = java.util.Locale.GERMANY;
        java.lang.String str75 = locale72.getDisplayScript(locale74);
        java.util.Set<java.lang.Character> charSet76 = locale72.getExtensionKeys();
        java.lang.String str77 = dateTimeZone60.getName(3692163384000L, locale72);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone80);
        boolean boolean83 = dateTimeZone80.isStandardOffset((long) 2);
        org.joda.time.DateTime dateTime84 = org.joda.time.DateTime.now(dateTimeZone80);
        long long87 = dateTimeZone80.convertLocalToUTC(30L, true);
        long long89 = dateTimeZone60.getMillisKeepLocal(dateTimeZone80, (long) (-358));
        org.joda.time.DateTime dateTime90 = dateTime44.toDateTime(dateTimeZone80);
        org.joda.time.MutableDateTime mutableDateTime91 = new org.joda.time.MutableDateTime(59L, dateTimeZone80);
        java.util.GregorianCalendar gregorianCalendar92 = mutableDateTime91.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime84", (dateTime39.compareTo(dateTime84) == 0) == dateTime39.equals(dateTime84));
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
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime6.minusWeeks(10);
        org.joda.time.DateTime.Property property12 = dateTime6.hourOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime24.set(dateTimeFieldType25, (-292275054));
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.yearOfEra();
        mutableDateTime24.setYear((int) '#');
        mutableDateTime24.setYear(292278993);
        int int33 = dateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        int int34 = property12.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (-1), chronology38);
        boolean boolean40 = dateTimeZone35.isLocalDateTimeGap(localDateTime39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (-1), chronology42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.weekyear();
        boolean boolean45 = dateTimeZone35.isLocalDateTimeGap(localDateTime43);
        boolean boolean47 = dateTimeZone35.isStandardOffset(86399999L);
        mutableDateTime24.setZone(dateTimeZone35);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (-1), chronology50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone54 = dateTimeZone53.toTimeZone();
        org.joda.time.DateTime dateTime55 = localDateTime51.toDateTime(dateTimeZone53);
        java.lang.String str56 = dateTime55.toString();
        org.joda.time.DateTime dateTime58 = dateTime55.plus((long) 100);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.DateTime dateTime61 = dateTime58.plus(readableDuration60);
        int int62 = dateTime61.getDayOfMonth();
        java.util.Locale locale64 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleAttributes();
        java.util.Locale locale66 = java.util.Locale.GERMANY;
        java.lang.String str67 = locale64.getDisplayVariant(locale66);
        java.lang.String str68 = dateTime61.toString("365", locale66);
        org.joda.time.DateTime dateTime70 = dateTime61.plusYears(2);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) (-1), chronology72);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone76 = dateTimeZone75.toTimeZone();
        org.joda.time.DateTime dateTime77 = localDateTime73.toDateTime(dateTimeZone75);
        org.joda.time.Chronology chronology78 = dateTime77.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.dayOfYear();
        org.joda.time.Chronology chronology80 = chronology78.withUTC();
        org.joda.time.DateTimeField dateTimeField81 = chronology80.clockhourOfDay();
        org.joda.time.DateTime dateTime82 = dateTime61.toDateTime(chronology80);
        mutableDateTime24.setChronology(chronology80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime58 and dateTime82", (dateTime58.compareTo(dateTime82) == 0) == dateTime58.equals(dateTime82));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfMinute();
        org.joda.time.DateTime.Property property11 = dateTime7.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = dateTime7.toDateMidnight();
        boolean boolean13 = dateTime7.isAfterNow();
        org.joda.time.DateTime.Property property14 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property14.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        org.joda.time.DateTime dateTime18 = property16.setCopy(1);
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar19);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusMillis((-2033));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and gregorianCalendar19", (calendar12.compareTo(gregorianCalendar19) == 0) == calendar12.equals(gregorianCalendar19));
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
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        int int11 = dateTime6.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateTime dateTime11 = dateTime8.plus((long) 100);
        org.joda.time.DateTime.Property property12 = dateTime8.millisOfSecond();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 1, chronology14);
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded((long) (byte) 0, 292278993);
        int int19 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DurationField durationField31 = chronology28.minutes();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 292278993, chronology28);
        org.joda.time.DateTime dateTime33 = dateTime8.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField34 = chronology28.minuteOfDay();
        java.util.Locale locale35 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 69, chronology28, locale35, (java.lang.Integer) 33, (int) ' ');
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology28);
        java.lang.String str40 = dateTime39.toString();
        org.joda.time.DateTime dateTime42 = dateTime39.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime44 = dateTime39.minusYears(35);
        org.joda.time.DateTime.Property property45 = dateTime44.secondOfMinute();
        org.joda.time.DateTime dateTime47 = dateTime44.withSecondOfMinute(15);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime49.set(dateTimeFieldType50, (-292275054));
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime49.yearOfEra();
        mutableDateTime49.setYear((int) '#');
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) (-1), chronology57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone61 = dateTimeZone60.toTimeZone();
        org.joda.time.DateTime dateTime62 = localDateTime58.toDateTime(dateTimeZone60);
        int int64 = dateTimeZone60.getOffsetFromLocal((long) (byte) 10);
        long long66 = dateTimeZone60.nextTransition((long) 59);
        mutableDateTime49.setZoneRetainFields(dateTimeZone60);
        long long70 = dateTimeZone60.convertLocalToUTC((-1609459200000L), false);
        java.util.Locale locale72 = java.util.Locale.TAIWAN;
        java.lang.String str73 = locale72.toLanguageTag();
        java.util.Locale locale74 = java.util.Locale.GERMANY;
        java.lang.String str75 = locale72.getDisplayScript(locale74);
        java.util.Set<java.lang.Character> charSet76 = locale72.getExtensionKeys();
        java.lang.String str77 = dateTimeZone60.getName(3692163384000L, locale72);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone80);
        boolean boolean83 = dateTimeZone80.isStandardOffset((long) 2);
        org.joda.time.DateTime dateTime84 = org.joda.time.DateTime.now(dateTimeZone80);
        long long87 = dateTimeZone80.convertLocalToUTC(30L, true);
        long long89 = dateTimeZone60.getMillisKeepLocal(dateTimeZone80, (long) (-358));
        org.joda.time.DateTime dateTime90 = dateTime44.toDateTime(dateTimeZone80);
        org.joda.time.LocalDateTime localDateTime91 = new org.joda.time.LocalDateTime(dateTimeZone80);
        org.joda.time.LocalDateTime localDateTime92 = new org.joda.time.LocalDateTime(3124396799997L, dateTimeZone80);
        org.joda.time.LocalDateTime.Property property93 = localDateTime92.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime84", (dateTime39.compareTo(dateTime84) == 0) == dateTime39.equals(dateTime84));
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
        int int13 = dateTime9.getMinuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime9.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property16 = dateTime9.era();
        org.joda.time.DateTime dateTime18 = property16.setCopy(1);
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and gregorianCalendar19", (calendar12.compareTo(gregorianCalendar19) == 0) == calendar12.equals(gregorianCalendar19));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusYears(2);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.dayOfYear();
        org.joda.time.Chronology chronology31 = chronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.DateTime dateTime33 = dateTime12.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime33", (dateTime9.compareTo(dateTime33) == 0) == dateTime9.equals(dateTime33));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        mutableDateTime1.setYear(292278993);
        mutableDateTime1.setMillisOfSecond(59);
        mutableDateTime1.addMillis(3);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime1.dayOfWeek();
        mutableDateTime1.setMillisOfSecond(99);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime1.copy();
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(56, (int) '#');
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj19, dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 5, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime1.toMutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime1.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and mutableDateTime25", (mutableDateTime17.compareTo(mutableDateTime25) == 0) == mutableDateTime17.equals(mutableDateTime25));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateTime dateTime11 = dateTime8.plus((long) 100);
        org.joda.time.DateTime.Property property12 = dateTime8.millisOfSecond();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 1, chronology14);
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded((long) (byte) 0, 292278993);
        int int19 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DurationField durationField31 = chronology28.minutes();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 292278993, chronology28);
        org.joda.time.DateTime dateTime33 = dateTime8.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField34 = chronology28.minuteOfDay();
        org.joda.time.DurationField durationField35 = durationFieldType1.getField(chronology28);
        org.joda.time.DurationField durationField36 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField30, and durationField35", !(durationField36.compareTo(durationField30) == 0) || (Math.signum(durationField36.compareTo(durationField35)) == Math.signum(durationField30.compareTo(durationField35))));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfMinute();
        org.joda.time.DateTime.Property property11 = dateTime7.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight13 = dateTime7.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long17 = dateTimeZone15.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.secondOfDay();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DurationField durationField29 = chronology26.minutes();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime32.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutableDateTime32.add(readableDuration35, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int39 = mutableDateTime32.get(dateTimeFieldType38);
        java.lang.String str40 = dateTimeFieldType38.getName();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime30.property(dateTimeFieldType38);
        org.joda.time.DurationField durationField42 = property41.getDurationField();
        boolean boolean43 = dateTimeZone15.equals((java.lang.Object) property41);
        org.joda.time.DateTime dateTime44 = dateMidnight13.toDateTime(dateTimeZone15);
        int int45 = dateMidnight13.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        java.lang.Object obj2 = mutableDateTime1.clone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.weekyear();
        mutableDateTime1.setMillis((long) 292278993);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime7.set(dateTimeFieldType8, (-292275054));
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.yearOfEra();
        mutableDateTime7.setYear((int) '#');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        int int22 = dateTimeZone18.getOffsetFromLocal((long) (byte) 10);
        long long24 = dateTimeZone18.nextTransition((long) 59);
        mutableDateTime7.setZoneRetainFields(dateTimeZone18);
        long long28 = dateTimeZone18.convertLocalToUTC((-1609459200000L), false);
        java.util.Locale locale30 = java.util.Locale.TAIWAN;
        java.lang.String str31 = locale30.toLanguageTag();
        java.util.Locale locale32 = java.util.Locale.GERMANY;
        java.lang.String str33 = locale30.getDisplayScript(locale32);
        java.util.Set<java.lang.Character> charSet34 = locale30.getExtensionKeys();
        java.lang.String str35 = dateTimeZone18.getName(3692163384000L, locale30);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone38);
        boolean boolean41 = dateTimeZone38.isStandardOffset((long) 2);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone38);
        long long45 = dateTimeZone38.convertLocalToUTC(30L, true);
        long long47 = dateTimeZone18.getMillisKeepLocal(dateTimeZone38, (long) (-358));
        mutableDateTime1.setZoneRetainFields(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and mutableDateTime49", (dateTime42.compareTo(mutableDateTime49) == 0) == dateTime42.equals(mutableDateTime49));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        boolean boolean6 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.secondOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.dayOfYear();
        int int10 = mutableDateTime4.getMinuteOfDay();
        mutableDateTime4.addHours(84);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFractionOfSecond(33, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder16.appendMonthOfYearText();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendShortText(dateTimeFieldType18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatterBuilder17.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withDefaultYear(53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter21.withDefaultYear(575);
        java.lang.String str26 = mutableDateTime4.toString(dateTimeFormatter25);
        java.lang.String str28 = dateTimeFormatter25.print((-203699425L));
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime30.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime30.add(readableDuration33, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int37 = mutableDateTime30.get(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        mutableDateTime30.setTime((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime45 = localTime43.minusSeconds((int) (short) 10);
        int int46 = localTime43.getMinuteOfHour();
        org.joda.time.LocalTime.Property property47 = localTime43.hourOfDay();
        org.joda.time.LocalTime localTime48 = property47.withMaximumValue();
        boolean boolean49 = property47.isLeap();
        org.joda.time.LocalTime localTime50 = property47.roundFloorCopy();
        org.joda.time.LocalTime.Property property51 = localTime50.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime53.set(dateTimeFieldType54, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        mutableDateTime53.add(readablePeriod57, 4);
        int int60 = mutableDateTime53.getMillisOfDay();
        long long61 = property51.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime53);
        mutableDateTime30.setMillis((org.joda.time.ReadableInstant) mutableDateTime53);
        mutableDateTime30.addMonths(5);
        int int67 = dateTimeFormatter25.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime30, "", 297);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime40", (mutableDateTime1.compareTo(mutableDateTime40) == 0) == mutableDateTime1.equals(mutableDateTime40));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTime dateTime10 = dateTime7.plus((long) 100);
        org.joda.time.DateTime.Property property11 = dateTime7.millisOfSecond();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 1, chronology13);
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded((long) (byte) 0, 292278993);
        int int18 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime17);
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
        org.joda.time.DateTime dateTime32 = dateTime7.toDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField33 = chronology27.minuteOfDay();
        java.util.Locale locale34 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 69, chronology27, locale34, (java.lang.Integer) 33, (int) ' ');
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology27);
        java.lang.String str39 = dateTime38.toString();
        org.joda.time.DateTime dateTime41 = dateTime38.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime43 = dateTime38.minusYears(35);
        org.joda.time.DateTime.Property property44 = dateTime43.secondOfMinute();
        org.joda.time.DateTime dateTime46 = dateTime43.withSecondOfMinute(15);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime48.set(dateTimeFieldType49, (-292275054));
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime48.yearOfEra();
        mutableDateTime48.setYear((int) '#');
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (-1), chronology56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone60 = dateTimeZone59.toTimeZone();
        org.joda.time.DateTime dateTime61 = localDateTime57.toDateTime(dateTimeZone59);
        int int63 = dateTimeZone59.getOffsetFromLocal((long) (byte) 10);
        long long65 = dateTimeZone59.nextTransition((long) 59);
        mutableDateTime48.setZoneRetainFields(dateTimeZone59);
        long long69 = dateTimeZone59.convertLocalToUTC((-1609459200000L), false);
        java.util.Locale locale71 = java.util.Locale.TAIWAN;
        java.lang.String str72 = locale71.toLanguageTag();
        java.util.Locale locale73 = java.util.Locale.GERMANY;
        java.lang.String str74 = locale71.getDisplayScript(locale73);
        java.util.Set<java.lang.Character> charSet75 = locale71.getExtensionKeys();
        java.lang.String str76 = dateTimeZone59.getName(3692163384000L, locale71);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone79);
        boolean boolean82 = dateTimeZone79.isStandardOffset((long) 2);
        org.joda.time.DateTime dateTime83 = org.joda.time.DateTime.now(dateTimeZone79);
        long long86 = dateTimeZone79.convertLocalToUTC(30L, true);
        long long88 = dateTimeZone59.getMillisKeepLocal(dateTimeZone79, (long) (-358));
        org.joda.time.DateTime dateTime89 = dateTime43.toDateTime(dateTimeZone79);
        org.joda.time.DateTime dateTime90 = dateTime89.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime92 = dateTime89.minusMillis((-1849));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime83", (dateTime38.compareTo(dateTime83) == 0) == dateTime38.equals(dateTime83));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(31);
        org.joda.time.LocalDate.Property property3 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate4 = property3.withMinimumValue();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendFractionOfSecond(33, (int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap9 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendYear((int) (short) 1, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendMinuteOfHour(0);
        boolean boolean16 = property3.equals((java.lang.Object) dateTimeFormatterBuilder15);
        org.joda.time.LocalDate localDate17 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType18.getRangeDurationType();
        org.joda.time.LocalDate.Property property22 = localDate17.property(dateTimeFieldType18);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 3, chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getDurationType();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType27.getRangeDurationType();
        boolean boolean30 = localDate26.isSupported(durationFieldType29);
        org.joda.time.LocalDate.Property property31 = localDate26.centuryOfEra();
        org.joda.time.LocalDate localDate32 = property31.roundCeilingCopy();
        org.joda.time.LocalDate localDate33 = property31.getLocalDate();
        int int34 = localDate33.getDayOfMonth();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 3, chronology36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType38.getDurationType();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType38.getRangeDurationType();
        boolean boolean41 = localDate37.isSupported(durationFieldType40);
        org.joda.time.LocalDate.Property property42 = localDate37.centuryOfEra();
        org.joda.time.LocalDate localDate43 = property42.roundCeilingCopy();
        org.joda.time.LocalDate localDate44 = property42.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = localDate44.toDateTimeAtCurrentTime(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = localDate33.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        long long56 = dateTimeZone51.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone57 = dateTimeZone51.toTimeZone();
        java.util.TimeZone timeZone58 = dateTimeZone51.toTimeZone();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(66L, dateTimeZone51);
        org.joda.time.DateTime dateTime60 = localDate33.toDateTimeAtStartOfDay(dateTimeZone51);
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(obj23, dateTimeZone51);
        org.joda.time.DateTime dateTime63 = localDate17.toDateTimeAtMidnight(dateTimeZone51);
        java.lang.String str65 = dateTimeZone51.getNameKey(2L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime47 and dateTime61", (mutableDateTime47.compareTo(dateTime61) == 0) == mutableDateTime47.equals(dateTime61));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (-1), chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = localDateTime10.toDateTime(dateTimeZone12);
        int int16 = dateTimeZone12.getOffsetFromLocal((long) (byte) 10);
        long long18 = dateTimeZone12.nextTransition((long) 59);
        mutableDateTime1.setZoneRetainFields(dateTimeZone12);
        long long22 = dateTimeZone12.convertLocalToUTC((-1609459200000L), false);
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = locale24.getDisplayScript(locale26);
        java.util.Set<java.lang.Character> charSet28 = locale24.getExtensionKeys();
        java.lang.String str29 = dateTimeZone12.getName(3692163384000L, locale24);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone32);
        boolean boolean35 = dateTimeZone32.isStandardOffset((long) 2);
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone32);
        long long39 = dateTimeZone32.convertLocalToUTC(30L, true);
        long long41 = dateTimeZone12.getMillisKeepLocal(dateTimeZone32, (long) (-358));
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone12);
        long long44 = dateTimeZone12.previousTransition(45L);
        java.lang.String str46 = dateTimeZone12.getNameKey(17536739580000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime42", (dateTime36.compareTo(dateTime42) == 0) == dateTime36.equals(dateTime42));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        org.joda.time.DateTime dateTime18 = property16.setCopy(1);
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        boolean boolean20 = dateTime18.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and gregorianCalendar19", (calendar12.compareTo(gregorianCalendar19) == 0) == calendar12.equals(gregorianCalendar19));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = property2.add((long) 86399999);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        mutableDateTime6.add(durationFieldType8, (-1));
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
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.weekOfWeekyear();
        org.joda.time.DurationField durationField26 = chronology21.centuries();
        org.joda.time.DurationField durationField27 = chronology21.centuries();
        org.joda.time.DurationField durationField28 = durationFieldType8.getField(chronology21);
        org.joda.time.DurationField durationField29 = chronology21.years();
        org.joda.time.DateTimeZone dateTimeZone30 = chronology21.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and durationField29", (durationField28.compareTo(durationField29) == 0) == durationField28.equals(durationField29));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        java.lang.Object obj2 = mutableDateTime1.clone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.weekyear();
        mutableDateTime1.setMillis((long) 292278993);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime7.set(dateTimeFieldType8, (-292275054));
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.yearOfEra();
        mutableDateTime7.setYear((int) '#');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        int int22 = dateTimeZone18.getOffsetFromLocal((long) (byte) 10);
        long long24 = dateTimeZone18.nextTransition((long) 59);
        mutableDateTime7.setZoneRetainFields(dateTimeZone18);
        long long28 = dateTimeZone18.convertLocalToUTC((-1609459200000L), false);
        java.util.Locale locale30 = java.util.Locale.TAIWAN;
        java.lang.String str31 = locale30.toLanguageTag();
        java.util.Locale locale32 = java.util.Locale.GERMANY;
        java.lang.String str33 = locale30.getDisplayScript(locale32);
        java.util.Set<java.lang.Character> charSet34 = locale30.getExtensionKeys();
        java.lang.String str35 = dateTimeZone18.getName(3692163384000L, locale30);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone38);
        boolean boolean41 = dateTimeZone38.isStandardOffset((long) 2);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone38);
        long long45 = dateTimeZone38.convertLocalToUTC(30L, true);
        long long47 = dateTimeZone18.getMillisKeepLocal(dateTimeZone38, (long) (-358));
        mutableDateTime1.setZoneRetainFields(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone18);
        java.lang.String str50 = dateTimeZone18.getID();
        org.joda.time.LocalDate localDate51 = org.joda.time.LocalDate.now(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and mutableDateTime49", (dateTime42.compareTo(mutableDateTime49) == 0) == dateTime42.equals(mutableDateTime49));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.getLocalDate();
        int int10 = localDate9.getDayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 3, chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType14.getRangeDurationType();
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        org.joda.time.LocalDate.Property property18 = localDate13.centuryOfEra();
        org.joda.time.LocalDate localDate19 = property18.roundCeilingCopy();
        org.joda.time.LocalDate localDate20 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate9.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate9.withPeriodAdded(readablePeriod26, (int) ' ');
        org.joda.time.LocalDate localDate30 = localDate9.minusDays((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        long long36 = dateTimeZone31.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone37 = dateTimeZone31.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime38.copy();
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime38.add(readableDuration40, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime38.getZone();
        org.joda.time.DateMidnight dateMidnight44 = localDate30.toDateMidnight(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and mutableDateTime38", (mutableDateTime23.compareTo(mutableDateTime38) == 0) == mutableDateTime23.equals(mutableDateTime38));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTime dateTime10 = dateTime7.plus((long) 100);
        org.joda.time.DateTime.Property property11 = dateTime7.millisOfSecond();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 1, chronology13);
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded((long) (byte) 0, 292278993);
        int int18 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime17);
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
        org.joda.time.DateTime dateTime32 = dateTime7.toDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField33 = chronology27.dayOfYear();
        java.util.Locale locale34 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(10629L, chronology27, locale34, (java.lang.Integer) 69, 42);
        org.joda.time.DurationField durationField38 = chronology27.seconds();
        org.joda.time.DateTimeField dateTimeField39 = chronology27.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(chronology27);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (-1), chronology42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        org.joda.time.DateTime dateTime47 = localDateTime43.toDateTime(dateTimeZone45);
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.secondOfDay();
        org.joda.time.DurationField durationField50 = chronology48.minutes();
        org.joda.time.DurationField durationField51 = chronology48.minutes();
        long long57 = chronology48.getDateTimeMillis(53998L, 0, 2, 0, (int) 'x');
        org.joda.time.DurationField durationField58 = chronology48.eras();
        mutableDateTime40.setChronology(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField29 and durationField58", Math.signum(durationField29.compareTo(durationField58)) == -Math.signum(durationField58.compareTo(durationField29)));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1970, chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology11.eras();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        boolean boolean24 = dateTimeZone19.isLocalDateTimeGap(localDateTime23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withMillisOfDay(5);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.plusHours((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime23.withPeriodAdded(readablePeriod31, 3);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime23.withCenturyOfEra(70);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minus(readableDuration36);
        int[] intArray39 = chronology11.get((org.joda.time.ReadablePartial) localDateTime37, (-61567603198033L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField18", Math.signum(durationField15.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField15)));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withYearOfCentury(23);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withWeekOfWeekyear(23);
        int int14 = localDateTime11.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayScript();
        java.lang.String str21 = dateTimeZone16.getName((long) 5, locale19);
        org.joda.time.DateTime dateTime22 = localDateTime11.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfDay();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology30.add(readablePeriod34, (long) 31, 69);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, 33);
        int[] intArray50 = chronology30.get((org.joda.time.ReadablePartial) localDateTime45, 315532800000L);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime11, chronology30);
        org.joda.time.DateTimeField dateTimeField52 = chronology30.weekOfWeekyear();
        java.util.Locale locale53 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str54 = locale53.getDisplayLanguage();
        int int55 = dateTimeField52.getMaximumShortTextLength(locale53);
        java.lang.String str57 = dateTimeField52.getAsShortText(66L);
        int int59 = dateTimeField52.getMinimumValue((long) 23);
        int int61 = dateTimeField52.getMinimumValue((-62135596800003L));
        java.lang.String str63 = dateTimeField52.getAsShortText(1969L);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) (-1), chronology65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.weekyear();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime69 = org.joda.time.MutableDateTime.now(dateTimeZone68);
        int int70 = property67.compareTo((org.joda.time.ReadableInstant) mutableDateTime69);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime72 = org.joda.time.MutableDateTime.now(dateTimeZone71);
        org.joda.time.ReadableDuration readableDuration73 = null;
        mutableDateTime72.add(readableDuration73, 100);
        boolean boolean76 = mutableDateTime69.isBefore((org.joda.time.ReadableInstant) mutableDateTime72);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime72.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone79 = dateTimeZone78.toTimeZone();
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((long) (-1), chronology81);
        boolean boolean83 = dateTimeZone78.isLocalDateTimeGap(localDateTime82);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime82.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property86 = localDateTime82.dayOfYear();
        int int87 = property77.compareTo((org.joda.time.ReadablePartial) localDateTime82);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime82.withCenturyOfEra(0);
        java.util.Locale locale90 = null;
        java.lang.String str91 = dateTimeField52.getAsShortText((org.joda.time.ReadablePartial) localDateTime89, locale90);
        org.joda.time.LocalDateTime localDateTime93 = localDateTime89.plusMillis(297);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and mutableDateTime69", (mutableDateTime17.compareTo(mutableDateTime69) == 0) == mutableDateTime17.equals(mutableDateTime69));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.setDate((-1L));
        int int5 = mutableDateTime1.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime1.isSupported(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = dateTimeZone9.getName((long) 5, locale12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayScript();
        java.lang.String str22 = dateTimeZone17.getName((long) 5, locale20);
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime(dateTimeZone17);
        mutableDateTime1.setZoneRetainFields(dateTimeZone17);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime1.toDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime27", (mutableDateTime1.compareTo(dateTime27) == 0) == mutableDateTime1.equals(dateTime27));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        java.lang.String str30 = dateTime29.toString();
        org.joda.time.DateTime dateTime32 = dateTime29.plus((long) 100);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Calendar calendar35 = dateTime32.toCalendar(locale34);
        int int36 = dateTime32.getMinuteOfHour();
        org.joda.time.DateTime dateTime38 = dateTime32.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime40 = dateTime38.plus((long) (-292275054));
        org.joda.time.DateTime dateTime42 = dateTime40.plusMonths(30);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        long long45 = dateTimeZone22.getMillisKeepLocal(dateTimeZone43, 300000L);
        org.joda.time.DateTime dateTime46 = dateTime12.withZoneRetainFields(dateTimeZone43);
        java.util.GregorianCalendar gregorianCalendar47 = dateTime46.toGregorianCalendar();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.DateTime dateTime49 = dateTime46.minus(readableDuration48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar35 and gregorianCalendar47", (calendar35.compareTo(gregorianCalendar47) == 0) == calendar35.equals(gregorianCalendar47));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime1.toMutableDateTimeISO();
        java.util.Date date9 = mutableDateTime8.toDate();
        mutableDateTime8.setMillis((-447072L));
        mutableDateTime8.addWeeks(888);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (-1), chronology17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTime dateTime22 = localDateTime18.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.secondOfDay();
        org.joda.time.Chronology chronology25 = chronology23.withUTC();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 575, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType28.getField(chronology29);
        int int32 = dateTimeField30.getLeapAmount((long) (byte) 1);
        long long34 = dateTimeField30.remainder((long) (-292275054));
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (-1), chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.weekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime37.minus(readablePeriod43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime37.withMonthOfYear(1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusMinutes(292278993);
        int int49 = dateTimeField30.getMinimumValue((org.joda.time.ReadablePartial) localDateTime46);
        long long51 = dateTimeField30.remainder((long) 30);
        long long53 = dateTimeField30.roundHalfCeiling((long) 575);
        long long56 = dateTimeField30.set((long) 0, (int) (byte) 1);
        java.util.Locale locale58 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet59 = locale58.getExtensionKeys();
        java.lang.String str60 = dateTimeField30.getAsText(1999, locale58);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((-3600000L), chronology25, locale58);
        org.joda.time.DateTimeField dateTimeField62 = chronology25.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField63 = chronology25.weekyear();
        org.joda.time.DurationField durationField64 = chronology25.minutes();
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime8.toMutableDateTime(chronology25);
        org.joda.time.DurationField durationField67 = chronology25.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime66", (mutableDateTime8.compareTo(mutableDateTime66) == 0) == mutableDateTime8.equals(mutableDateTime66));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1972-10-01");
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter5.withChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = chronology13.days();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1970, chronology13);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.Chronology chronology20 = chronology13.withUTC();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.DateTimeField dateTimeField22 = chronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = chronology13.eras();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) "1972-10-01", chronology13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField23", Math.signum(durationField17.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField17)));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.secondOfMinute();
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.addDays(23);
        mutableDateTime10.addSeconds(42);
        mutableDateTime10.setSecondOfMinute(0);
        int int19 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime21.setTime(100L);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime21.add(readablePeriod25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        java.lang.String str34 = dateTime33.toString();
        org.joda.time.DateTime dateTime36 = dateTime33.plus((long) 100);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.util.Calendar calendar39 = dateTime36.toCalendar(locale38);
        int int40 = dateTime36.getMinuteOfHour();
        org.joda.time.DateTime dateTime42 = dateTime36.withYearOfEra((int) 'u');
        org.joda.time.DateTime.Property property43 = dateTime36.era();
        boolean boolean45 = dateTime36.isEqual((long) 100);
        org.joda.time.DateTime dateTime46 = dateTime36.toDateTime();
        org.joda.time.DateTime dateTime48 = dateTime46.minusHours((-292275054));
        boolean boolean49 = mutableDateTime21.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Instant instant50 = dateTime48.toInstant();
        int int51 = property4.getDifference((org.joda.time.ReadableInstant) instant50);
        boolean boolean52 = property4.isLeap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant50", (dateTime48.compareTo(instant50) == 0) == dateTime48.equals(instant50));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusMillis(116);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfDay();
        org.joda.time.DurationField durationField22 = chronology20.months();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 'u', chronology20);
        java.util.Date date24 = dateTime23.toDate();
        org.joda.time.DateTime dateTime26 = dateTime23.withYear(1439);
        org.joda.time.Instant instant27 = dateTime23.toInstant();
        org.joda.time.DateTimeZone dateTimeZone28 = instant27.getZone();
        org.joda.time.DateTime dateTime29 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillisOfDay(11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant27", (dateTime23.compareTo(instant27) == 0) == dateTime23.equals(instant27));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        org.joda.time.DateTime dateTime18 = dateTime6.withTime(3, 23, 2, 30);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) 70, 4);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        org.joda.time.DurationField durationField23 = property22.getDurationField();
        org.joda.time.DateTime dateTime24 = property22.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        boolean boolean30 = dateTimeZone25.isLocalDateTimeGap(localDateTime29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime29.toDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTime dateTime38 = dateTime35.toDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = dateTime24.toDateTime(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime38", (dateTime6.compareTo(dateTime38) == 0) == dateTime6.equals(dateTime38));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.addDays((int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime1.toMutableDateTimeISO();
        long long9 = mutableDateTime1.getMillis();
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(56, (int) '#');
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj11, dateTimeZone14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 5, dateTimeZone14);
        mutableDateTime1.setZone(dateTimeZone14);
        java.lang.String str19 = dateTimeZone14.getShortName((-3600000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime8", (mutableDateTime1.compareTo(mutableDateTime8) == 0) == mutableDateTime1.equals(mutableDateTime8));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology12.days();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1970, chronology12);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.Chronology chronology19 = chronology12.withUTC();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(99705600019L, chronology12);
        org.joda.time.DurationField durationField22 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology12.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField22", Math.signum(durationField16.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField16)));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime1.setTime(100L);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMinutes((-1));
        org.joda.time.Instant instant7 = mutableDateTime1.toInstant();
        int int8 = mutableDateTime1.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime10.set(dateTimeFieldType11, (-292275054));
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.yearOfEra();
        mutableDateTime10.setYear((int) '#');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (-1), chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime23 = localDateTime19.toDateTime(dateTimeZone21);
        int int25 = dateTimeZone21.getOffsetFromLocal((long) (byte) 10);
        long long27 = dateTimeZone21.nextTransition((long) 59);
        mutableDateTime10.setZoneRetainFields(dateTimeZone21);
        long long31 = dateTimeZone21.convertLocalToUTC((-1609459200000L), false);
        org.joda.time.DateTime dateTime32 = mutableDateTime1.toDateTime(dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime1.add(readableDuration33, (-2526));
        boolean boolean36 = mutableDateTime1.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime32", (instant7.compareTo(dateTime32) == 0) == instant7.equals(dateTime32));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.addDays((int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime1.toMutableDateTimeISO();
        long long9 = mutableDateTime1.getMillis();
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(56, (int) '#');
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj11, dateTimeZone14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 5, dateTimeZone14);
        mutableDateTime1.setZone(dateTimeZone14);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMillisOfSecond((int) (byte) 100);
        boolean boolean25 = dateTimeZone14.isLocalDateTimeGap(localDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime8", (mutableDateTime1.compareTo(mutableDateTime8) == 0) == mutableDateTime1.equals(mutableDateTime8));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusMillis(116);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfDay();
        org.joda.time.DurationField durationField22 = chronology20.months();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 'u', chronology20);
        java.util.Date date24 = dateTime23.toDate();
        org.joda.time.DateTime dateTime26 = dateTime23.withYear(1439);
        org.joda.time.Instant instant27 = dateTime23.toInstant();
        org.joda.time.DateTimeZone dateTimeZone28 = instant27.getZone();
        org.joda.time.DateTime dateTime29 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMillis((-1849));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant27", (dateTime23.compareTo(instant27) == 0) == dateTime23.equals(instant27));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime1.setTime(100L);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMinutes((-1));
        org.joda.time.Instant instant7 = mutableDateTime1.toInstant();
        int int8 = mutableDateTime1.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime10.set(dateTimeFieldType11, (-292275054));
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.yearOfEra();
        mutableDateTime10.setYear((int) '#');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (-1), chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime23 = localDateTime19.toDateTime(dateTimeZone21);
        int int25 = dateTimeZone21.getOffsetFromLocal((long) (byte) 10);
        long long27 = dateTimeZone21.nextTransition((long) 59);
        mutableDateTime10.setZoneRetainFields(dateTimeZone21);
        long long31 = dateTimeZone21.convertLocalToUTC((-1609459200000L), false);
        org.joda.time.DateTime dateTime32 = mutableDateTime1.toDateTime(dateTimeZone21);
        mutableDateTime1.setYear(30849);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime32", (instant7.compareTo(dateTime32) == 0) == instant7.equals(dateTime32));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTime dateTime22 = dateTime12.withLaterOffsetAtOverlap();
        java.lang.String str23 = dateTime22.toString();
        org.joda.time.DateTime.Property property24 = dateTime22.era();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.minus(readablePeriod25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime22.minus(readablePeriod27);
        java.lang.String str30 = dateTime28.toString("+00:00");
        org.joda.time.DateTime dateTime32 = dateTime28.plusYears(54383);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.plus(readableDuration33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField36 = mutableDateTime35.getRoundingField();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime39 = property37.add((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime41 = property37.add((long) 86399999);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getRangeDurationType();
        mutableDateTime41.add(durationFieldType43, (-1));
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (-1), chronology50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone54 = dateTimeZone53.toTimeZone();
        org.joda.time.DateTime dateTime55 = localDateTime51.toDateTime(dateTimeZone53);
        org.joda.time.Chronology chronology56 = dateTime55.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter48.withChronology(chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.monthOfYear();
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.now(chronology56);
        org.joda.time.DateTimeField dateTimeField60 = chronology56.weekOfWeekyear();
        org.joda.time.DurationField durationField61 = chronology56.centuries();
        org.joda.time.DurationField durationField62 = chronology56.centuries();
        org.joda.time.DurationField durationField63 = durationFieldType43.getField(chronology56);
        org.joda.time.DurationField durationField64 = chronology56.years();
        org.joda.time.DateTime dateTime65 = dateTime34.withChronology(chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField63 and durationField64", (durationField63.compareTo(durationField64) == 0) == durationField63.equals(durationField64));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime4.toDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(9);
        org.joda.time.DateTime dateTime13 = dateTime10.toDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime13", (dateTime10.compareTo(dateTime13) == 0) == dateTime10.equals(dateTime13));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone18);
        mutableDateTime8.setZone(dateTimeZone18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime(dateTimeZone25);
        java.lang.String str28 = dateTime27.toString();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime27.plus(readableDuration29);
        org.joda.time.DateTime dateTime32 = dateTime27.minusWeeks(10);
        boolean boolean34 = dateTime27.isBefore((long) (-1));
        int int35 = dateTime27.getYearOfEra();
        org.joda.time.DateTime dateTime37 = dateTime27.plusDays(1969);
        org.joda.time.DateTime dateTime39 = dateTime27.plusDays((int) (short) 10);
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) dateTime27);
        long long41 = dateTime27.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime27", (mutableDateTime8.compareTo(dateTime27) == 0) == mutableDateTime8.equals(dateTime27));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1438);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond(54);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime7 = localTime5.minusSeconds((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.plus(readablePeriod8);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.millisOfSecond();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) dateTime1, chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime13", (dateTime1.compareTo(dateTime13) == 0) == dateTime1.equals(dateTime13));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add((long) 100);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayScript();
        java.lang.String str12 = dateTimeZone7.getName((long) 5, locale10);
        java.lang.String str13 = property3.getAsText(locale10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.dayOfYear();
        long long24 = dateTimeField22.remainder((long) 33);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekyear();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfMonth();
        int int33 = property32.get();
        org.joda.time.DateTimeField dateTimeField34 = property32.getField();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.withDayOfMonth(5);
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.util.Calendar calendar41 = dateTime39.toCalendar(locale40);
        java.lang.String str42 = dateTimeField34.getAsShortText((long) 1970, locale40);
        java.util.Set<java.lang.Character> charSet43 = locale40.getExtensionKeys();
        java.lang.String str44 = dateTimeField22.getAsShortText(69, locale40);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) (-1), chronology46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone50 = dateTimeZone49.toTimeZone();
        org.joda.time.DateTime dateTime51 = localDateTime47.toDateTime(dateTimeZone49);
        java.lang.String str52 = dateTime51.toString();
        org.joda.time.DateTime dateTime54 = dateTime51.plus((long) 100);
        org.joda.time.DateTime dateTime56 = dateTime54.minusSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.DateTime dateTime58 = dateTime54.minus(readablePeriod57);
        org.joda.time.DateTime dateTime60 = dateTime58.minusHours((int) (byte) -1);
        java.util.Locale locale61 = java.util.Locale.TAIWAN;
        java.lang.String str62 = locale61.toLanguageTag();
        java.lang.String str63 = locale61.getDisplayScript();
        java.util.Calendar calendar64 = dateTime58.toCalendar(locale61);
        java.lang.String str65 = locale40.getDisplayScript(locale61);
        java.lang.String str66 = locale61.getDisplayLanguage();
        java.lang.String str67 = locale10.getDisplayName(locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime37", (mutableDateTime8.compareTo(dateTime37) == 0) == mutableDateTime8.equals(dateTime37));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1438);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond(54);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime7 = localTime5.minusSeconds((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.plus(readablePeriod8);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.millisOfSecond();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) dateTime1, chronology10);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime13", (dateTime1.compareTo(dateTime13) == 0) == dateTime1.equals(dateTime13));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        java.lang.String str30 = dateTime29.toString();
        org.joda.time.DateTime dateTime32 = dateTime29.plus((long) 100);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Calendar calendar35 = dateTime32.toCalendar(locale34);
        int int36 = dateTime32.getMinuteOfHour();
        org.joda.time.DateTime dateTime38 = dateTime32.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime40 = dateTime38.plus((long) (-292275054));
        org.joda.time.DateTime dateTime42 = dateTime40.plusMonths(30);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        long long45 = dateTimeZone22.getMillisKeepLocal(dateTimeZone43, 300000L);
        org.joda.time.DateTime dateTime46 = dateTime12.withZoneRetainFields(dateTimeZone43);
        java.util.GregorianCalendar gregorianCalendar47 = dateTime46.toGregorianCalendar();
        org.joda.time.DateTime.Property property48 = dateTime46.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar35 and gregorianCalendar47", (calendar35.compareTo(gregorianCalendar47) == 0) == calendar35.equals(gregorianCalendar47));
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
        org.joda.time.DateTime.Property property10 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime12 = dateTime6.plusYears(0);
        int int13 = dateTime6.getSecondOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime15.set(dateTimeFieldType16, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime15.add(readablePeriod19, 4);
        mutableDateTime15.addWeekyears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime15.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone27);
        java.lang.String str30 = dateTimeZone27.getShortName((long) 2);
        int int32 = dateTimeZone27.getStandardOffset((-457071L));
        mutableDateTime15.setZone(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime6.toMutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField36 = mutableDateTime35.getRoundingField();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime39 = property37.add((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime41 = property37.add((long) 86399999);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getRangeDurationType();
        mutableDateTime41.add(durationFieldType43, (-1));
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (-1), chronology50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone54 = dateTimeZone53.toTimeZone();
        org.joda.time.DateTime dateTime55 = localDateTime51.toDateTime(dateTimeZone53);
        org.joda.time.Chronology chronology56 = dateTime55.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter48.withChronology(chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.monthOfYear();
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.now(chronology56);
        org.joda.time.DateTimeField dateTimeField60 = chronology56.weekOfWeekyear();
        org.joda.time.DurationField durationField61 = chronology56.centuries();
        org.joda.time.DurationField durationField62 = chronology56.centuries();
        org.joda.time.DurationField durationField63 = durationFieldType43.getField(chronology56);
        org.joda.time.DurationField durationField64 = chronology56.years();
        mutableDateTime34.setChronology(chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField63 and durationField64", (durationField63.compareTo(durationField64) == 0) == durationField63.equals(durationField64));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withMillisOfDay(5);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.plusHours((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.withPeriodAdded(readablePeriod12, 3);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime4.plusSeconds(59);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusDays((-1));
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.joda.time.DurationField durationField21 = chronology19.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField21, and durationField20", !(durationField20.compareTo(durationField21) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField21.compareTo(durationField20))));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        strSet1.clear();
        java.util.Iterator<java.lang.String> strItor3 = strSet1.iterator();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime10.minusWeeks(10);
        boolean boolean17 = dateTime10.isBefore((long) (-1));
        int int18 = dateTime10.getYearOfEra();
        org.joda.time.DateTime dateTime20 = dateTime10.plusDays(1969);
        boolean boolean21 = strSet1.equals((java.lang.Object) dateTime10);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime10.withPeriodAdded(readablePeriod22, 11);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str26 = durationFieldType25.getName();
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = null;
        org.joda.time.format.DateTimeParser dateTimeParser29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (-1), chronology32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        org.joda.time.DateTime dateTime37 = localDateTime33.toDateTime(dateTimeZone35);
        org.joda.time.Chronology chronology38 = dateTime37.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter30.withChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.monthOfYear();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = chronology38.days();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1970, chronology38);
        org.joda.time.DurationField durationField44 = chronology38.weekyears();
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(chronology38);
        boolean boolean46 = durationFieldType25.isSupported(chronology38);
        org.joda.time.DateTime dateTime48 = dateTime10.withFieldAdded(durationFieldType25, 999);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField50 = mutableDateTime49.getRoundingField();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime53 = property51.add((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime55 = property51.add((long) 86399999);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType56.getRangeDurationType();
        mutableDateTime55.add(durationFieldType57, (-1));
        org.joda.time.format.DateTimePrinter dateTimePrinter60 = null;
        org.joda.time.format.DateTimeParser dateTimeParser61 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter60, dateTimeParser61);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) (-1), chronology64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.DateTime dateTime69 = localDateTime65.toDateTime(dateTimeZone67);
        org.joda.time.Chronology chronology70 = dateTime69.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter62.withChronology(chronology70);
        org.joda.time.DateTimeField dateTimeField72 = chronology70.monthOfYear();
        org.joda.time.LocalDateTime localDateTime73 = org.joda.time.LocalDateTime.now(chronology70);
        org.joda.time.DateTimeField dateTimeField74 = chronology70.weekOfWeekyear();
        org.joda.time.DurationField durationField75 = chronology70.centuries();
        org.joda.time.DurationField durationField76 = chronology70.centuries();
        org.joda.time.DurationField durationField77 = durationFieldType57.getField(chronology70);
        org.joda.time.DurationField durationField78 = chronology70.years();
        boolean boolean79 = durationFieldType25.isSupported(chronology70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField44 and durationField78", (durationField44.compareTo(durationField78) == 0) == durationField44.equals(durationField78));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) (short) 100);
        mutableDateTime4.addYears(2);
        mutableDateTime4.add(10629L);
        org.joda.time.Chronology chronology9 = mutableDateTime4.getChronology();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.Locale locale14 = new java.util.Locale("hi!");
        java.lang.String str15 = locale14.getScript();
        java.lang.String str16 = locale14.getDisplayLanguage();
        java.lang.String str17 = locale14.getDisplayCountry();
        java.util.Locale locale19 = new java.util.Locale("365");
        java.lang.String str20 = locale19.getISO3Language();
        java.lang.String str21 = locale14.getDisplayLanguage(locale19);
        java.util.Locale locale22 = java.util.Locale.TAIWAN;
        java.lang.String str23 = locale22.getISO3Language();
        java.lang.String str24 = locale19.getDisplayLanguage(locale22);
        java.lang.String str25 = dateTimeZone11.getShortName((long) 5170, locale19);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime4, dateTimeZone11);
        org.joda.time.Instant instant27 = mutableDateTime4.toInstant();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime4.add(readablePeriod28, 9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant27", (mutableDateTime4.compareTo(instant27) == 0) == mutableDateTime4.equals(instant27));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDate0.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks(1969);
        org.joda.time.Instant instant11 = dateTime8.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType12.getRangeDurationType();
        org.joda.time.DateTime.Property property15 = dateTime8.property(dateTimeFieldType12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant11", (dateTime5.compareTo(instant11) == 0) == dateTime5.equals(instant11));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = property2.add((long) 86399999);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        mutableDateTime6.add(durationFieldType8, (-1));
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
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.weekOfWeekyear();
        org.joda.time.DurationField durationField26 = chronology21.centuries();
        org.joda.time.DurationField durationField27 = chronology21.centuries();
        org.joda.time.DurationField durationField28 = durationFieldType8.getField(chronology21);
        org.joda.time.DurationField durationField29 = chronology21.minutes();
        org.joda.time.DurationField durationField30 = chronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField26, and durationField28", !(durationField30.compareTo(durationField26) == 0) || (Math.signum(durationField30.compareTo(durationField28)) == Math.signum(durationField26.compareTo(durationField28))));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime20 = property17.setCopy((int) (short) 0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DurationField durationField25 = property24.getLeapDurationField();
        org.joda.time.Interval interval26 = property24.toInterval();
        long long27 = property24.remainder();
        java.util.Locale locale29 = new java.util.Locale("hi!");
        int int30 = property24.getMaximumShortTextLength(locale29);
        org.joda.time.LocalDateTime localDateTime32 = property24.addToCopy((long) 'u');
        org.joda.time.LocalDateTime localDateTime34 = property24.addToCopy((int) (byte) 10);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DateTime dateTime36 = dateTime20.toDateTime(chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj0, chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime36", (dateTime20.compareTo(dateTime36) == 0) == dateTime20.equals(dateTime36));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.util.Locale locale3 = new java.util.Locale("DateTimeField[yearOfCentury]", "\u6cd5\u6587", "2022-02-21T15:06:07.300+00:00:00.003");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime5.getRoundingField();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = property7.add((long) 86399999);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getRangeDurationType();
        mutableDateTime11.add(durationFieldType13, (-1));
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter18.withChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.monthOfYear();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.weekOfWeekyear();
        org.joda.time.DurationField durationField31 = chronology26.centuries();
        org.joda.time.DurationField durationField32 = chronology26.centuries();
        org.joda.time.DurationField durationField33 = durationFieldType13.getField(chronology26);
        org.joda.time.DurationField durationField34 = chronology26.minutes();
        org.joda.time.DurationField durationField35 = chronology26.years();
        boolean boolean36 = strSet4.contains((java.lang.Object) chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField33 and durationField35", (durationField33.compareTo(durationField35) == 0) == durationField33.equals(durationField35));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime12 = dateTime9.withWeekyear((int) 'x');
        org.joda.time.DateTime dateTime14 = dateTime12.plusWeeks((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime12.minusMillis(3);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime26 = localDateTime22.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter19.withChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.monthOfYear();
        org.joda.time.DateTime dateTime30 = dateTime12.toDateTime(chronology27);
        org.joda.time.DateTime dateTime31 = dateTime12.toDateTimeISO();
        org.joda.time.DateTime dateTime33 = dateTime12.plusDays(19);
        org.joda.time.Instant instant34 = dateTime33.toInstant();
        org.joda.time.DateTime dateTime36 = dateTime33.withWeekyear((int) (short) 1);
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
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone50 = dateTimeZone49.toTimeZone();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (-1), chronology52);
        boolean boolean54 = dateTimeZone49.isLocalDateTimeGap(localDateTime53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (-1), chronology56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.weekyear();
        boolean boolean59 = dateTimeZone49.isLocalDateTimeGap(localDateTime57);
        long long61 = dateTimeZone49.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter39.withZone(dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter62.withPivotYear(0);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) (-1), chronology66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.weekyear();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime67.plusMinutes(292278993);
        org.joda.time.LocalDateTime.Property property73 = localDateTime67.yearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter74 = null;
        org.joda.time.format.DateTimeParser dateTimeParser75 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter74, dateTimeParser75);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((long) (-1), chronology78);
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone82 = dateTimeZone81.toTimeZone();
        org.joda.time.DateTime dateTime83 = localDateTime79.toDateTime(dateTimeZone81);
        org.joda.time.Chronology chronology84 = dateTime83.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter76.withChronology(chronology84);
        boolean boolean86 = localDateTime67.equals((java.lang.Object) chronology84);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter64.withChronology(chronology84);
        org.joda.time.DateTimeField dateTimeField88 = chronology84.weekyearOfCentury();
        org.joda.time.DateTime dateTime89 = dateTime36.toDateTime(chronology84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant34", (dateTime33.compareTo(instant34) == 0) == dateTime33.equals(instant34));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime25 = dateTime23.minus(315532847000L);
        org.joda.time.DateTime dateTime27 = dateTime25.withHourOfDay(12);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMillis(54);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime38 = localDateTime34.toDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.secondOfDay();
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 575, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        int int48 = dateTimeField46.getLeapAmount((long) (byte) 1);
        long long50 = dateTimeField46.remainder((long) (-292275054));
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (-1), chronology52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekyear();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime53.minus(readablePeriod59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime53.withMonthOfYear(1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusMinutes(292278993);
        int int65 = dateTimeField46.getMinimumValue((org.joda.time.ReadablePartial) localDateTime62);
        long long67 = dateTimeField46.remainder((long) 30);
        long long69 = dateTimeField46.roundHalfCeiling((long) 575);
        long long72 = dateTimeField46.set((long) 0, (int) (byte) 1);
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet75 = locale74.getExtensionKeys();
        java.lang.String str76 = dateTimeField46.getAsText(1999, locale74);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((-3600000L), chronology41, locale74);
        org.joda.time.DateTime dateTime78 = dateTime29.withChronology(chronology41);
        org.joda.time.DurationField durationField79 = chronology41.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime78", (dateTime29.compareTo(dateTime78) == 0) == dateTime29.equals(dateTime78));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.setDayOfMonth(4);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime7 = localTime5.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime9 = localTime5.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localTime5.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfEra();
        org.joda.time.DurationField durationField13 = chronology10.hours();
        org.joda.time.DateTime dateTime14 = mutableDateTime0.toDateTime(chronology10);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfSecond();
        java.lang.String str16 = property15.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and dateTime14", (mutableDateTime0.compareTo(dateTime14) == 0) == mutableDateTime0.equals(dateTime14));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.getLocalDate();
        int int10 = localDate9.getDayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 3, chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType14.getRangeDurationType();
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        org.joda.time.LocalDate.Property property18 = localDate13.centuryOfEra();
        org.joda.time.LocalDate localDate19 = property18.roundCeilingCopy();
        org.joda.time.LocalDate localDate20 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate9.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        long long31 = dateTimeZone26.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone32 = dateTimeZone26.toTimeZone();
        long long34 = dateTimeZone26.previousTransition((long) 'a');
        org.joda.time.DateTime dateTime35 = dateTime25.withZoneRetainFields(dateTimeZone26);
        java.lang.String str36 = dateTime25.toString();
        org.joda.time.Instant instant37 = dateTime25.toInstant();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((java.lang.Object) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant37", (dateTime25.compareTo(instant37) == 0) == dateTime25.equals(instant37));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusHours(0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = property10.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = property10.withMinimumValue();
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
        int int26 = dateTime25.getDayOfMonth();
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleAttributes();
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.lang.String str31 = locale28.getDisplayVariant(locale30);
        java.lang.String str32 = dateTime25.toString("365", locale30);
        org.joda.time.DateTime dateTime34 = dateTime25.plusMonths(1969);
        org.joda.time.DateTime dateTime35 = dateTime25.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        org.joda.time.DateTime dateTime38 = dateTime35.withYear(38);
        org.joda.time.DateTime dateTime39 = dateTime35.toDateTime();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (-1), chronology42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        org.joda.time.DateTime dateTime47 = localDateTime43.toDateTime(dateTimeZone45);
        java.lang.String str48 = dateTime47.toString();
        org.joda.time.DateTime dateTime50 = dateTime47.plus((long) 100);
        org.joda.time.DateTime.Property property51 = dateTime47.millisOfSecond();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (short) 1, chronology53);
        org.joda.time.DateTime dateTime57 = dateTime54.withDurationAdded((long) (byte) 0, 292278993);
        int int58 = dateTime47.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) (-1), chronology61);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone65 = dateTimeZone64.toTimeZone();
        org.joda.time.DateTime dateTime66 = localDateTime62.toDateTime(dateTimeZone64);
        org.joda.time.Chronology chronology67 = dateTime66.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.secondOfDay();
        org.joda.time.DurationField durationField69 = chronology67.minutes();
        org.joda.time.DurationField durationField70 = chronology67.minutes();
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime((long) 292278993, chronology67);
        org.joda.time.DateTime dateTime72 = dateTime47.toDateTime(chronology67);
        org.joda.time.DateTimeField dateTimeField73 = chronology67.minuteOfDay();
        java.util.Locale locale74 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) 69, chronology67, locale74, (java.lang.Integer) 33, (int) ' ');
        java.lang.Object obj78 = dateTimeParserBucket77.saveState();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((long) (-1), chronology80);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime81.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.minus(readablePeriod86);
        org.joda.time.LocalDateTime.Property property88 = localDateTime85.millisOfSecond();
        boolean boolean89 = dateTimeParserBucket77.restoreState((java.lang.Object) localDateTime85);
        org.joda.time.Chronology chronology90 = dateTimeParserBucket77.getChronology();
        org.joda.time.MutableDateTime mutableDateTime91 = dateTime39.toMutableDateTime(chronology90);
        org.joda.time.LocalDate localDate92 = new org.joda.time.LocalDate((java.lang.Object) localDateTime12, chronology90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and mutableDateTime91", (dateTime22.compareTo(mutableDateTime91) == 0) == dateTime22.equals(mutableDateTime91));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        int int17 = dateTime6.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime6.toMutableDateTimeISO();
        int int19 = dateTime6.getWeekOfWeekyear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime26 = localDateTime22.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfYear();
        org.joda.time.Chronology chronology29 = chronology27.withUTC();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) dateTime6, chronology29);
        org.joda.time.DurationField durationField31 = chronology29.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime30", (dateTime6.compareTo(dateTime30) == 0) == dateTime6.equals(dateTime30));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.halfdayOfDay();
        org.joda.time.Chronology chronology17 = chronology10.withUTC();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField18, and durationField15", !(durationField15.compareTo(durationField18) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField18.compareTo(durationField15))));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(66L);
        org.joda.time.DateTime dateTime2 = localDate1.toDateTimeAtStartOfDay();
        int int3 = localDate1.getWeekyear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime10.minusWeeks(10);
        org.joda.time.DateTime.Property property16 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime18 = dateTime10.withYear(0);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.dayOfYear();
        org.joda.time.Chronology chronology28 = chronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.clockhourOfDay();
        org.joda.time.DurationField durationField30 = chronology28.halfdays();
        org.joda.time.DurationFieldType durationFieldType31 = durationField30.getType();
        org.joda.time.DurationFieldType durationFieldType32 = durationField30.getType();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime39 = localDateTime35.toDateTime(dateTimeZone37);
        java.lang.String str40 = dateTime39.toString();
        org.joda.time.DateTime dateTime42 = dateTime39.plus((long) 100);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfCentury();
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        java.util.Calendar calendar45 = dateTime42.toCalendar(locale44);
        int int46 = dateTime42.getMinuteOfHour();
        org.joda.time.DateTime dateTime48 = dateTime42.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime50 = dateTime48.plus((long) (-292275054));
        org.joda.time.DateTime.Property property51 = dateTime48.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField53 = mutableDateTime52.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType54.getDurationType();
        mutableDateTime52.add(durationFieldType55, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter58 = null;
        org.joda.time.format.DateTimeParser dateTimeParser59 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter58, dateTimeParser59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) (-1), chronology62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone66 = dateTimeZone65.toTimeZone();
        org.joda.time.DateTime dateTime67 = localDateTime63.toDateTime(dateTimeZone65);
        org.joda.time.Chronology chronology68 = dateTime67.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter60.withChronology(chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.monthOfYear();
        org.joda.time.DurationField durationField71 = durationFieldType55.getField(chronology68);
        org.joda.time.DateTime dateTime72 = dateTime48.toDateTime(chronology68);
        boolean boolean73 = durationFieldType32.isSupported(chronology68);
        org.joda.time.DateTime dateTime75 = dateTime10.withFieldAdded(durationFieldType32, 906);
        java.lang.String str76 = durationFieldType32.getName();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((long) (-1), chronology78);
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone82 = dateTimeZone81.toTimeZone();
        org.joda.time.DateTime dateTime83 = localDateTime79.toDateTime(dateTimeZone81);
        org.joda.time.Chronology chronology84 = dateTime83.getChronology();
        org.joda.time.DurationField durationField85 = chronology84.hours();
        org.joda.time.DateTimeField dateTimeField86 = chronology84.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField87 = chronology84.minuteOfDay();
        long long91 = chronology84.add((long) 52, 999L, 54);
        org.joda.time.DateTimeField dateTimeField92 = chronology84.monthOfYear();
        org.joda.time.DurationField durationField93 = durationFieldType32.getField(chronology84);
        boolean boolean94 = localDate1.isSupported(durationFieldType32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField93", (durationField30.compareTo(durationField93) == 0) == durationField30.equals(durationField93));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        org.joda.time.DateTime dateTime18 = property16.setCopy(1);
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        org.joda.time.DateTime dateTime21 = dateTime18.withYear(32400000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and gregorianCalendar19", (calendar12.compareTo(gregorianCalendar19) == 0) == calendar12.equals(gregorianCalendar19));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        int int17 = dateTime6.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime6.toMutableDateTimeISO();
        int int19 = dateTime6.getWeekOfWeekyear();
        int int20 = dateTime6.getWeekOfWeekyear();
        org.joda.time.Instant instant21 = dateTime6.toInstant();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        java.lang.String str29 = dateTime28.toString();
        org.joda.time.DateTime dateTime31 = dateTime28.plus((long) 100);
        org.joda.time.DateTime dateTime33 = dateTime31.withMillisOfSecond(69);
        org.joda.time.DateTime.Property property34 = dateTime31.year();
        boolean boolean35 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant21", (dateTime6.compareTo(instant21) == 0) == dateTime6.equals(instant21));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.secondOfDay();
        org.joda.time.Chronology chronology16 = chronology10.withUTC();
        org.joda.time.DurationField durationField17 = chronology16.months();
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField14, and durationField17", !(durationField18.compareTo(durationField14) == 0) || (Math.signum(durationField18.compareTo(durationField17)) == Math.signum(durationField14.compareTo(durationField17))));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        int int7 = mutableDateTime1.getHourOfDay();
        org.joda.time.Instant instant8 = mutableDateTime1.toInstant();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (-1), chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDateTime12.toDateTime(dateTimeZone14);
        java.lang.String str17 = dateTime16.toString();
        org.joda.time.DateTime dateTime19 = dateTime16.plus((long) 100);
        org.joda.time.DateTime.Property property20 = dateTime16.millisOfSecond();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 1, chronology22);
        org.joda.time.DateTime dateTime26 = dateTime23.withDurationAdded((long) (byte) 0, 292278993);
        int int27 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (-1), chronology30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = localDateTime31.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.secondOfDay();
        org.joda.time.DurationField durationField38 = chronology36.minutes();
        org.joda.time.DurationField durationField39 = chronology36.minutes();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 292278993, chronology36);
        org.joda.time.DateTime dateTime41 = dateTime16.toDateTime(chronology36);
        org.joda.time.DateTimeField dateTimeField42 = chronology36.minuteOfDay();
        java.util.Locale locale43 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 69, chronology36, locale43, (java.lang.Integer) 33, (int) ' ');
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(chronology36);
        java.lang.String str48 = dateTime47.toString();
        org.joda.time.DateTime dateTime50 = dateTime47.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property51 = dateTime47.dayOfWeek();
        org.joda.time.DateTime.Property property52 = dateTime47.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean54 = dateTime47.isSupported(dateTimeFieldType53);
        boolean boolean55 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant8", (mutableDateTime4.compareTo(instant8) == 0) == mutableDateTime4.equals(instant8));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime7.toMutableDateTimeISO();
        int int20 = dateTime7.getWeekOfWeekyear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.dayOfYear();
        org.joda.time.Chronology chronology30 = chronology28.withUTC();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) dateTime7, chronology30);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 54408, chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime31", (dateTime7.compareTo(dateTime31) == 0) == dateTime7.equals(dateTime31));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfSecond(33, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendMonthOfYearText();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendShortText(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatterBuilder4.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeFormatter8.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter8.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter8.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfMinute();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.weekyear();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((-1));
        java.util.Locale locale30 = java.util.Locale.JAPANESE;
        java.lang.String str31 = dateTimeField23.getAsText((org.joda.time.ReadablePartial) localDateTime26, locale30);
        int int33 = dateTimeField23.getLeapAmount((long) (-1));
        int int34 = mutableDateTime13.get(dateTimeField23);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) (-1), chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTime dateTime41 = localDateTime37.toDateTime(dateTimeZone39);
        org.joda.time.Chronology chronology42 = dateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfYear();
        org.joda.time.Chronology chronology44 = chronology42.withUTC();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfDay();
        mutableDateTime13.setChronology(chronology44);
        org.joda.time.DateTimeField dateTimeField47 = chronology44.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter8.withChronology(chronology44);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 3, chronology50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType52.getDurationType();
        org.joda.time.DurationFieldType durationFieldType54 = dateTimeFieldType52.getRangeDurationType();
        boolean boolean55 = localDate51.isSupported(durationFieldType54);
        org.joda.time.LocalDate.Property property56 = localDate51.centuryOfEra();
        org.joda.time.LocalDate localDate57 = property56.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate59 = property56.addToCopy((int) ' ');
        int int60 = localDate59.size();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((long) 3, chronology62);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType65 = dateTimeFieldType64.getDurationType();
        org.joda.time.DurationFieldType durationFieldType66 = dateTimeFieldType64.getRangeDurationType();
        boolean boolean67 = localDate63.isSupported(durationFieldType66);
        org.joda.time.LocalDate.Property property68 = localDate63.centuryOfEra();
        org.joda.time.LocalDate localDate69 = property68.roundCeilingCopy();
        org.joda.time.LocalDate localDate70 = property68.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(dateTimeZone72);
        org.joda.time.DateTime dateTime74 = localDate70.toDateTimeAtCurrentTime(dateTimeZone72);
        org.joda.time.Interval interval75 = localDate59.toInterval(dateTimeZone72);
        java.lang.String str76 = dateTimeFormatter8.print((org.joda.time.ReadablePartial) localDate59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime73", (mutableDateTime13.compareTo(mutableDateTime73) == 0) == mutableDateTime13.equals(mutableDateTime73));
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
        int int14 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime16 = dateTime6.plusDays(1969);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime6.minus(readablePeriod17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusYears(42);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DurationField durationField31 = chronology28.minutes();
        long long37 = chronology28.getDateTimeMillis(53998L, 0, 2, 0, (int) 'x');
        org.joda.time.DurationField durationField38 = chronology28.eras();
        org.joda.time.DateTime dateTime39 = dateTime20.toDateTime(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField30 and durationField38", Math.signum(durationField30.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField30)));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime7.add(readableDuration9, 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.monthOfYear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 3, chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getDurationType();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType16.getRangeDurationType();
        boolean boolean19 = localDate15.isSupported(durationFieldType18);
        org.joda.time.LocalDate.Property property20 = localDate15.centuryOfEra();
        boolean boolean21 = property20.isLeap();
        org.joda.time.LocalDate localDate22 = property20.getLocalDate();
        org.joda.time.LocalDate localDate24 = property20.setCopy("9");
        org.joda.time.LocalDate localDate26 = localDate24.minusMonths((int) 'u');
        org.joda.time.Chronology chronology27 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime7.toMutableDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime29", (mutableDateTime7.compareTo(mutableDateTime29) == 0) == mutableDateTime7.equals(mutableDateTime29));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withYearOfCentury(23);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withWeekOfWeekyear(23);
        int int14 = localDateTime11.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayScript();
        java.lang.String str21 = dateTimeZone16.getName((long) 5, locale19);
        org.joda.time.DateTime dateTime22 = localDateTime11.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfDay();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology30.add(readablePeriod34, (long) 31, 69);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, 33);
        int[] intArray50 = chronology30.get((org.joda.time.ReadablePartial) localDateTime45, 315532800000L);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime11, chronology30);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField53 = chronology30.clockhourOfHalfday();
        org.joda.time.DurationField durationField54 = chronology30.eras();
        org.joda.time.DurationFieldType durationFieldType55 = durationField54.getType();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) (-1), chronology57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone61 = dateTimeZone60.toTimeZone();
        org.joda.time.DateTime dateTime62 = localDateTime58.toDateTime(dateTimeZone60);
        org.joda.time.Chronology chronology63 = dateTime62.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.secondOfDay();
        org.joda.time.DurationField durationField65 = chronology63.minutes();
        org.joda.time.DateTimeField dateTimeField66 = chronology63.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField67 = chronology63.dayOfMonth();
        org.joda.time.DurationField durationField68 = durationFieldType55.getField(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField32 and durationField68", Math.signum(durationField32.compareTo(durationField68)) == -Math.signum(durationField68.compareTo(durationField32)));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.setDayOfMonth(4);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime7 = localTime5.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime9 = localTime5.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology10 = localTime5.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.millis();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfEra();
        org.joda.time.DurationField durationField13 = chronology10.hours();
        org.joda.time.DateTime dateTime14 = mutableDateTime0.toDateTime(chronology10);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfSecond();
        org.joda.time.DateTime dateTime16 = property15.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and dateTime16", (mutableDateTime0.compareTo(dateTime16) == 0) == mutableDateTime0.equals(dateTime16));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("DateTimeField[year]");
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime3.setWeekyear(31);
        mutableDateTime3.setMinuteOfHour(4);
        mutableDateTime3.addHours(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int11 = mutableDateTime3.get(dateTimeFieldType10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime15 = localTime13.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime17 = localTime13.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.weekOfWeekyear();
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) dateTime19);
        java.util.Date date22 = mutableDateTime3.toDate();
        boolean boolean23 = timeZone1.inDaylightTime(date22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime19", (mutableDateTime3.compareTo(dateTime19) == 0) == mutableDateTime3.equals(dateTime19));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addWeeks(33);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property12 = localDate10.property(dateTimeFieldType11);
        java.util.Locale locale16 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate17 = property12.setCopy("365", locale16);
        org.joda.time.LocalDate localDate19 = property12.addToCopy(59);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTime dateTime21 = mutableDateTime1.toDateTime(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime21", (mutableDateTime1.compareTo(dateTime21) == 0) == mutableDateTime1.equals(dateTime21));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(2);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter10.withChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.DurationField durationField23 = chronology18.eras();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(888L, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter6.withChronology(chronology18);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str27 = durationFieldType26.getName();
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
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.clockhourOfHalfday();
        org.joda.time.DurationField durationField43 = chronology39.days();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 1970, chronology39);
        org.joda.time.DurationField durationField45 = chronology39.weekyears();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(chronology39);
        boolean boolean47 = durationFieldType26.isSupported(chronology39);
        org.joda.time.DateTimeField dateTimeField48 = chronology39.secondOfDay();
        org.joda.time.DateTimeField dateTimeField49 = chronology39.dayOfYear();
        org.joda.time.DateTimeField dateTimeField50 = chronology39.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology39.yearOfEra();
        org.joda.time.DateTimeField dateTimeField52 = chronology39.clockhourOfDay();
        org.joda.time.Chronology chronology53 = chronology39.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter6.withChronology(chronology53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField23 and durationField43", Math.signum(durationField23.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField23)));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        int int8 = localTime6.size();
        org.joda.time.LocalTime localTime10 = localTime6.plusHours((-1));
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.millisOfDay();
        org.joda.time.DurationField durationField13 = chronology11.years();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology11.add(readablePeriod14, (long) 100, 12);
        long long21 = chronology11.add((long) 999, (long) 7, (int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology11.add(readablePeriod22, 0L, 93);
        org.joda.time.DurationField durationField26 = chronology11.weekyears();
        org.joda.time.DurationField durationField27 = chronology11.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField26", (durationField13.compareTo(durationField26) == 0) == durationField13.equals(durationField26));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        mutableDateTime1.setYear(292278993);
        mutableDateTime1.setMillisOfSecond(59);
        mutableDateTime1.addMillis(3);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        mutableDateTime14.addMillis((-292275054));
        java.lang.String str17 = mutableDateTime14.toString();
        mutableDateTime14.addMonths(47);
        org.joda.time.Chronology chronology20 = mutableDateTime14.getChronology();
        org.joda.time.DateTime dateTime21 = mutableDateTime1.toDateTime(chronology20);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property24 = localDate22.property(dateTimeFieldType23);
        java.util.Locale locale28 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate29 = property24.setCopy("365", locale28);
        org.joda.time.LocalDate localDate31 = property24.setCopy((int) 'a');
        org.joda.time.LocalDate localDate32 = property24.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime35 = localDate32.toDateTimeAtMidnight(dateTimeZone34);
        mutableDateTime1.setZone(dateTimeZone34);
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.now(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime21", (mutableDateTime1.compareTo(dateTime21) == 0) == mutableDateTime1.equals(dateTime21));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Instant instant7 = mutableDateTime4.toInstant();
        org.joda.time.DateTimeField dateTimeField8 = mutableDateTime4.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfYear();
        org.joda.time.Chronology chronology10 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.era();
        org.joda.time.tz.NameProvider nameProvider12 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfDay();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.dayOfMonth();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekyear();
        org.joda.time.LocalDateTime localDateTime30 = property29.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField31 = property29.getField();
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.lang.String str34 = locale33.getISO3Language();
        java.lang.String str35 = dateTimeField31.getAsShortText((long) 59, locale33);
        java.util.Locale locale36 = locale33.stripExtensions();
        long long37 = dateTimeField23.set((long) 33, "2", locale36);
        java.lang.String str40 = nameProvider12.getName(locale36, "hours", "3600000");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(5999899L, chronology8, locale36, (java.lang.Integer) 54625295, 0);
        org.joda.time.DurationField durationField44 = chronology8.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField44, and durationField22", !(durationField22.compareTo(durationField44) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField44.compareTo(durationField22))));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds((int) (short) 10);
        int int5 = localTime2.getMinuteOfHour();
        org.joda.time.LocalTime.Property property6 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime7 = property6.withMaximumValue();
        boolean boolean8 = property6.isLeap();
        org.joda.time.LocalTime localTime9 = property6.roundFloorCopy();
        org.joda.time.LocalTime.Property property10 = localTime9.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime12.set(dateTimeFieldType13, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime12.add(readablePeriod16, 4);
        int int19 = mutableDateTime12.getMillisOfDay();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.Chronology chronology21 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.DurationField durationField23 = chronology21.eras();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 54402, chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.clockhourOfDay();
        org.joda.time.DurationField durationField26 = dateTimeField25.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField26, and durationField23", !(durationField23.compareTo(durationField26) == 0) || (Math.signum(durationField23.compareTo(durationField23)) == Math.signum(durationField26.compareTo(durationField23))));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 10, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(202022L, dateTimeZone2);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(2032);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded(readableDuration7, 47);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime6.minusWeeks((-30899993));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime5 = localTime1.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withDurationAdded(readableDuration9, (int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime13.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime13.add(readableDuration16, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int20 = mutableDateTime13.get(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime28 = localTime26.minusSeconds((int) (short) 10);
        int int29 = localTime26.getMinuteOfHour();
        org.joda.time.LocalTime.Property property30 = localTime26.hourOfDay();
        org.joda.time.LocalTime localTime31 = property30.withMaximumValue();
        boolean boolean32 = property30.isLeap();
        org.joda.time.LocalTime localTime33 = property30.roundFloorCopy();
        org.joda.time.LocalTime.Property property34 = localTime33.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime36.set(dateTimeFieldType37, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime36.add(readablePeriod40, 4);
        int int43 = mutableDateTime36.getMillisOfDay();
        long long44 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime36);
        mutableDateTime13.setMillis((org.joda.time.ReadableInstant) mutableDateTime36);
        mutableDateTime13.addMonths(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean49 = mutableDateTime13.isSupported(dateTimeFieldType48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        long long55 = dateTimeZone50.convertLocalToUTC(10L, false, (long) 3);
        int int57 = dateTimeZone50.getOffsetFromLocal((long) (byte) 0);
        mutableDateTime13.setZone(dateTimeZone50);
        long long62 = dateTimeZone50.convertLocalToUTC(2678400575L, false, 946684800000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone50);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(dateTimeZone50);
        long long66 = dateTimeZone50.nextTransition(189302400001L);
        org.joda.time.DateTime dateTime67 = dateTime11.withZone(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime23", (dateTime11.compareTo(mutableDateTime23) == 0) == dateTime11.equals(mutableDateTime23));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = chronology12.centuries();
        org.joda.time.DateTime dateTime18 = dateTime1.toDateTime(chronology12);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(59);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra(196);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        long long29 = dateTimeZone24.convertLocalToUTC((long) 575, false, (long) 49);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime20.toMutableDateTime(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime25", (dateTime1.compareTo(dateTime25) == 0) == dateTime1.equals(dateTime25));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(31244400000L, chronology11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusYears(0);
        org.joda.time.Chronology chronology22 = localDateTime16.getChronology();
        org.joda.time.DateTime dateTime23 = mutableDateTime13.toDateTime(chronology22);
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and dateTime23", (mutableDateTime13.compareTo(dateTime23) == 0) == mutableDateTime13.equals(dateTime23));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        mutableDateTime0.add(durationFieldType3, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter8.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType3.getField(chronology16);
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology16.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 10);
        int int4 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property5 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        boolean boolean7 = property5.isLeap();
        org.joda.time.LocalTime localTime8 = property5.roundFloorCopy();
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime11.set(dateTimeFieldType12, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime11.add(readablePeriod15, 4);
        int int18 = mutableDateTime11.getMillisOfDay();
        long long19 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology20 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DurationField durationField23 = chronology20.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField23, and durationField22", !(durationField22.compareTo(durationField23) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField23.compareTo(durationField22))));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone2.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfDay();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        org.joda.time.DurationField durationField16 = chronology13.minutes();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime19.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime19.add(readableDuration22, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int26 = mutableDateTime19.get(dateTimeFieldType25);
        java.lang.String str27 = dateTimeFieldType25.getName();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime17.property(dateTimeFieldType25);
        org.joda.time.DurationField durationField29 = property28.getDurationField();
        boolean boolean30 = dateTimeZone2.equals((java.lang.Object) property28);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.plusHours(0);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.secondOfMinute();
        org.joda.time.LocalDateTime.Property property43 = localDateTime40.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField45 = mutableDateTime44.getRoundingField();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.dayOfWeek();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (-1), chronology48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfYear();
        org.joda.time.DurationField durationField51 = property50.getLeapDurationField();
        org.joda.time.Interval interval52 = property50.toInterval();
        long long53 = property50.remainder();
        java.util.Locale locale55 = new java.util.Locale("hi!");
        int int56 = property50.getMaximumShortTextLength(locale55);
        java.lang.String str57 = property46.getAsShortText(locale55);
        int int58 = property43.getMaximumTextLength(locale55);
        java.util.Set<java.lang.String> strSet59 = locale55.getUnicodeLocaleKeys();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((long) (-1), chronology62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone66 = dateTimeZone65.toTimeZone();
        org.joda.time.DateTime dateTime67 = localDateTime63.toDateTime(dateTimeZone65);
        org.joda.time.Chronology chronology68 = dateTime67.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.secondOfDay();
        org.joda.time.DurationField durationField70 = chronology68.minutes();
        org.joda.time.DateTimeField dateTimeField71 = chronology68.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        long long75 = chronology68.add(readablePeriod72, (long) 31, 69);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) (-1), chronology77);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.weekyear();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime78.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime78.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        org.joda.time.LocalDateTime localDateTime86 = localDateTime83.withPeriodAdded(readablePeriod84, 33);
        int[] intArray88 = chronology68.get((org.joda.time.ReadablePartial) localDateTime83, 315532800000L);
        java.util.Locale locale89 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket92 = new org.joda.time.format.DateTimeParserBucket(94694400000L, chronology68, locale89, (java.lang.Integer) 1439, 49);
        org.joda.time.DurationField durationField93 = chronology68.millis();
        boolean boolean94 = strSet59.contains((java.lang.Object) chronology68);
        org.joda.time.DateTimeZone dateTimeZone96 = org.joda.time.DateTimeZone.forOffsetHours(30);
        org.joda.time.Chronology chronology97 = chronology68.withZone(dateTimeZone96);
        org.joda.time.DateTime dateTime98 = mutableDateTime31.toDateTime(dateTimeZone96);
        org.joda.time.LocalTime localTime99 = new org.joda.time.LocalTime(62L, dateTimeZone96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateTime98", (mutableDateTime17.compareTo(dateTime98) == 0) == mutableDateTime17.equals(dateTime98));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.joda.time.DateTime dateTime19 = dateTime9.toDateTime();
        org.joda.time.LocalDateTime localDateTime20 = dateTime9.toLocalDateTime();
        org.joda.time.Instant instant21 = dateTime9.toInstant();
        java.util.GregorianCalendar gregorianCalendar22 = dateTime9.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant21", (dateTime9.compareTo(instant21) == 0) == dateTime9.equals(instant21));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusMinutes(292278993);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfSecond(33, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendDayOfYear(517200);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        int int21 = property18.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutableDateTime23.add(readableDuration24, 100);
        boolean boolean27 = mutableDateTime20.isBefore((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime23.add(readableDuration28, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone33);
        mutableDateTime23.setZone(dateTimeZone33);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfHour();
        mutableDateTime23.set(dateTimeFieldType36, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder12.appendText(dateTimeFieldType36);
        boolean boolean40 = localDateTime2.isSupported(dateTimeFieldType36);
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType36.getDurationType();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime44.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime44.add(readableDuration47, (int) (short) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter50 = null;
        org.joda.time.format.DateTimeParser dateTimeParser51 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter50, dateTimeParser51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) (-1), chronology54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone58 = dateTimeZone57.toTimeZone();
        org.joda.time.DateTime dateTime59 = localDateTime55.toDateTime(dateTimeZone57);
        org.joda.time.Chronology chronology60 = dateTime59.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter52.withChronology(chronology60);
        org.joda.time.DateTimeField dateTimeField62 = chronology60.monthOfYear();
        org.joda.time.DateTimeField dateTimeField63 = chronology60.weekyearOfCentury();
        mutableDateTime44.setChronology(chronology60);
        org.joda.time.Chronology chronology65 = chronology60.withUTC();
        org.joda.time.DateTimeField dateTimeField66 = chronology60.weekOfWeekyear();
        java.util.Locale locale67 = java.util.Locale.ENGLISH;
        java.lang.String str68 = locale67.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket(10L, chronology60, locale67, (java.lang.Integer) 42);
        org.joda.time.DurationField durationField71 = chronology60.minutes();
        org.joda.time.DurationField durationField72 = chronology60.centuries();
        boolean boolean73 = dateTimeFieldType36.isSupported(chronology60);
        org.joda.time.DurationField durationField74 = chronology60.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField74, durationField71, and durationField72", !(durationField74.compareTo(durationField71) == 0) || (Math.signum(durationField74.compareTo(durationField72)) == Math.signum(durationField71.compareTo(durationField72))));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 0);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (-292275054), dateTimeZone7);
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone7, 0L);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears(35);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime12", (dateTime3.compareTo(dateTime12) == 0) == dateTime3.equals(dateTime12));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime6 = localTime4.minusSeconds((int) (short) 10);
        int int7 = localTime4.getMinuteOfHour();
        org.joda.time.LocalTime.Property property8 = localTime4.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMaximumValue();
        org.joda.time.DateTime dateTime10 = localTime9.toDateTimeToday();
        long long11 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime.Property property13 = dateTime10.property(dateTimeFieldType12);
        org.joda.time.DateTime dateTime14 = property13.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.plus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(56, (int) '#');
        java.lang.String str21 = dateTimeZone19.getName(300000L);
        org.joda.time.DateTime dateTime22 = dateTime16.withZone(dateTimeZone19);
        org.joda.time.DateTime dateTime24 = dateTime16.minusMinutes(86301003);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime22", (dateTime16.compareTo(dateTime22) == 0) == dateTime16.equals(dateTime22));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime12.setTime(100L);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.dayOfMonth();
        mutableDateTime12.setTime((long) 70);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.millisOfDay();
        boolean boolean19 = instant10.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime12.addMonths(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology7.eras();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology7.add(readablePeriod11, 189302400001L, 21);
        org.joda.time.DurationField durationField15 = chronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField15, and durationField10", !(durationField10.compareTo(durationField15) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField15.compareTo(durationField10))));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        int int18 = dateTime15.getMillisOfSecond();
        org.joda.time.DateTime dateTime19 = dateTime15.toDateTimeISO();
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfCentury(57);
        org.joda.time.Instant instant22 = dateTime19.toInstant();
        org.joda.time.LocalDateTime localDateTime23 = dateTime19.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant22", (dateTime19.compareTo(instant22) == 0) == dateTime19.equals(instant22));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        org.joda.time.DateTime.Property property12 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime14 = dateTime6.withYear(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.Chronology chronology24 = chronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.clockhourOfDay();
        org.joda.time.DurationField durationField26 = chronology24.halfdays();
        org.joda.time.DurationFieldType durationFieldType27 = durationField26.getType();
        org.joda.time.DurationFieldType durationFieldType28 = durationField26.getType();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (-1), chronology30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = localDateTime31.toDateTime(dateTimeZone33);
        java.lang.String str36 = dateTime35.toString();
        org.joda.time.DateTime dateTime38 = dateTime35.plus((long) 100);
        org.joda.time.DateTime.Property property39 = dateTime38.yearOfCentury();
        java.util.Locale locale40 = java.util.Locale.GERMANY;
        java.util.Calendar calendar41 = dateTime38.toCalendar(locale40);
        int int42 = dateTime38.getMinuteOfHour();
        org.joda.time.DateTime dateTime44 = dateTime38.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime46 = dateTime44.plus((long) (-292275054));
        org.joda.time.DateTime.Property property47 = dateTime44.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField49 = mutableDateTime48.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType51 = dateTimeFieldType50.getDurationType();
        mutableDateTime48.add(durationFieldType51, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter54 = null;
        org.joda.time.format.DateTimeParser dateTimeParser55 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter54, dateTimeParser55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) (-1), chronology58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone62 = dateTimeZone61.toTimeZone();
        org.joda.time.DateTime dateTime63 = localDateTime59.toDateTime(dateTimeZone61);
        org.joda.time.Chronology chronology64 = dateTime63.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter56.withChronology(chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology64.monthOfYear();
        org.joda.time.DurationField durationField67 = durationFieldType51.getField(chronology64);
        org.joda.time.DateTime dateTime68 = dateTime44.toDateTime(chronology64);
        boolean boolean69 = durationFieldType28.isSupported(chronology64);
        org.joda.time.DateTime dateTime71 = dateTime6.withFieldAdded(durationFieldType28, 906);
        java.lang.String str72 = durationFieldType28.getName();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) (-1), chronology74);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone78 = dateTimeZone77.toTimeZone();
        org.joda.time.DateTime dateTime79 = localDateTime75.toDateTime(dateTimeZone77);
        org.joda.time.Chronology chronology80 = dateTime79.getChronology();
        org.joda.time.DurationField durationField81 = chronology80.hours();
        org.joda.time.DateTimeField dateTimeField82 = chronology80.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField83 = chronology80.minuteOfDay();
        long long87 = chronology80.add((long) 52, 999L, 54);
        org.joda.time.DateTimeField dateTimeField88 = chronology80.monthOfYear();
        org.joda.time.DurationField durationField89 = durationFieldType28.getField(chronology80);
        java.lang.String str90 = durationFieldType28.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField89", (durationField26.compareTo(durationField89) == 0) == durationField26.equals(durationField89));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(31244400000L, chronology11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (-1), chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusYears(0);
        org.joda.time.Chronology chronology22 = localDateTime16.getChronology();
        org.joda.time.DateTime dateTime23 = mutableDateTime13.toDateTime(chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime13.minuteOfHour();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime13.centuryOfEra();
        java.lang.String str26 = property25.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and dateTime23", (mutableDateTime13.compareTo(dateTime23) == 0) == mutableDateTime13.equals(dateTime23));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTime dateTime22 = dateTime12.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.DateTime dateTime25 = dateTime22.withYear(38);
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) (-1), chronology29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        org.joda.time.DateTime dateTime34 = localDateTime30.toDateTime(dateTimeZone32);
        java.lang.String str35 = dateTime34.toString();
        org.joda.time.DateTime dateTime37 = dateTime34.plus((long) 100);
        org.joda.time.DateTime.Property property38 = dateTime34.millisOfSecond();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (short) 1, chronology40);
        org.joda.time.DateTime dateTime44 = dateTime41.withDurationAdded((long) (byte) 0, 292278993);
        int int45 = dateTime34.compareTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (-1), chronology48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        org.joda.time.DateTime dateTime53 = localDateTime49.toDateTime(dateTimeZone51);
        org.joda.time.Chronology chronology54 = dateTime53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.secondOfDay();
        org.joda.time.DurationField durationField56 = chronology54.minutes();
        org.joda.time.DurationField durationField57 = chronology54.minutes();
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) 292278993, chronology54);
        org.joda.time.DateTime dateTime59 = dateTime34.toDateTime(chronology54);
        org.joda.time.DateTimeField dateTimeField60 = chronology54.minuteOfDay();
        java.util.Locale locale61 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) 69, chronology54, locale61, (java.lang.Integer) 33, (int) ' ');
        java.lang.Object obj65 = dateTimeParserBucket64.saveState();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((long) (-1), chronology67);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.minus(readablePeriod73);
        org.joda.time.LocalDateTime.Property property75 = localDateTime72.millisOfSecond();
        boolean boolean76 = dateTimeParserBucket64.restoreState((java.lang.Object) localDateTime72);
        org.joda.time.Chronology chronology77 = dateTimeParserBucket64.getChronology();
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime26.toMutableDateTime(chronology77);
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(chronology77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime78", (dateTime9.compareTo(mutableDateTime78) == 0) == dateTime9.equals(mutableDateTime78));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime1.setTime(100L);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMinutes((-1));
        org.joda.time.Instant instant7 = mutableDateTime1.toInstant();
        int int8 = mutableDateTime1.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime10.set(dateTimeFieldType11, (-292275054));
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.yearOfEra();
        mutableDateTime10.setYear((int) '#');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (-1), chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime23 = localDateTime19.toDateTime(dateTimeZone21);
        int int25 = dateTimeZone21.getOffsetFromLocal((long) (byte) 10);
        long long27 = dateTimeZone21.nextTransition((long) 59);
        mutableDateTime10.setZoneRetainFields(dateTimeZone21);
        long long31 = dateTimeZone21.convertLocalToUTC((-1609459200000L), false);
        org.joda.time.DateTime dateTime32 = mutableDateTime1.toDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
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
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTime dateTime22 = dateTime12.withLaterOffsetAtOverlap();
        java.lang.String str23 = dateTime22.toString();
        org.joda.time.DateTime.Property property24 = dateTime22.era();
        org.joda.time.DateTime dateTime26 = property24.setCopy(0);
        org.joda.time.DateTime dateTime28 = dateTime26.minusWeeks((-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder29.appendFractionOfSecond(33, (int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap33 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder29.appendTimeZoneShortName(strMap33);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder29.appendWeekyear(2000, 59);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder29.appendDayOfWeek(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getRangeDurationType();
        java.lang.String str42 = dateTimeFieldType40.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder29.appendSignedDecimal(dateTimeFieldType40, 99, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder29.appendShortText(dateTimeFieldType46);
        org.joda.time.DateTime.Property property48 = dateTime28.property(dateTimeFieldType46);
        org.joda.time.DateTimeField dateTimeField49 = property48.getField();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (-1), chronology51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone55 = dateTimeZone54.toTimeZone();
        org.joda.time.DateTime dateTime56 = localDateTime52.toDateTime(dateTimeZone54);
        java.lang.String str57 = dateTime56.toString();
        org.joda.time.DateTime dateTime59 = dateTime56.plus((long) 100);
        org.joda.time.DateTime.Property property60 = dateTime59.yearOfCentury();
        java.util.Locale locale61 = java.util.Locale.GERMANY;
        java.util.Calendar calendar62 = dateTime59.toCalendar(locale61);
        int int63 = dateTime59.getMinuteOfHour();
        org.joda.time.DateTime dateTime65 = dateTime59.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime67 = dateTime65.withMillis((-1L));
        int int68 = dateTime65.getMillisOfSecond();
        org.joda.time.DateTime dateTime70 = dateTime65.plusWeeks(2922750);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) (-1), chronology72);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone76 = dateTimeZone75.toTimeZone();
        org.joda.time.DateTime dateTime77 = localDateTime73.toDateTime(dateTimeZone75);
        java.lang.String str78 = dateTime77.toString();
        org.joda.time.ReadableDuration readableDuration79 = null;
        org.joda.time.DateTime dateTime80 = dateTime77.plus(readableDuration79);
        org.joda.time.DateTime dateTime82 = dateTime77.minusWeeks(10);
        org.joda.time.DateTime.Property property83 = dateTime77.hourOfDay();
        org.joda.time.DateTime dateTime84 = property83.roundFloorCopy();
        boolean boolean85 = dateTime70.isEqual((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTime dateTime87 = dateTime84.withSecondOfMinute(47);
        org.joda.time.DateTime dateTime89 = dateTime87.withMillisOfDay(86399);
        org.joda.time.DateTime dateTime91 = dateTime87.withYear(56);
        boolean boolean93 = dateTime91.isBefore((long) 'u');
        org.joda.time.Instant instant94 = dateTime91.toInstant();
        int int95 = property48.compareTo((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.DateTime dateTime96 = property48.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime91 and instant94", (dateTime91.compareTo(instant94) == 0) == dateTime91.equals(instant94));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTime dateTime22 = dateTime12.withEarlierOffsetAtOverlap();
        long long23 = dateTime12.getMillis();
        org.joda.time.DateTime dateTime25 = dateTime12.minusMinutes(2022);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(30);
        org.joda.time.DateTime dateTime28 = dateTime25.withZone(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = dateTime28.toDateTime();
        int int30 = dateTime29.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime29", (dateTime25.compareTo(dateTime29) == 0) == dateTime25.equals(dateTime29));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withYearOfCentury(23);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withWeekOfWeekyear(23);
        int int14 = localDateTime11.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayScript();
        java.lang.String str21 = dateTimeZone16.getName((long) 5, locale19);
        org.joda.time.DateTime dateTime22 = localDateTime11.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfDay();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology30.add(readablePeriod34, (long) 31, 69);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, 33);
        int[] intArray50 = chronology30.get((org.joda.time.ReadablePartial) localDateTime45, 315532800000L);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime11, chronology30);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField53 = chronology30.clockhourOfHalfday();
        org.joda.time.DurationField durationField54 = chronology30.seconds();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone58);
        boolean boolean61 = dateTimeZone58.isStandardOffset((long) 2);
        java.util.TimeZone timeZone62 = dateTimeZone58.toTimeZone();
        java.util.TimeZone timeZone63 = dateTimeZone58.toTimeZone();
        org.joda.time.DateTime dateTime64 = dateTime55.toDateTime(dateTimeZone58);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) (-1), chronology66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone70 = dateTimeZone69.toTimeZone();
        org.joda.time.DateTime dateTime71 = localDateTime67.toDateTime(dateTimeZone69);
        org.joda.time.Chronology chronology72 = dateTime71.getChronology();
        org.joda.time.DateTimeField dateTimeField73 = chronology72.secondOfDay();
        org.joda.time.Chronology chronology74 = chronology72.withUTC();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.dayOfWeek();
        org.joda.time.DurationField durationField76 = chronology74.seconds();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime(chronology74);
        org.joda.time.DateTimeField dateTimeField78 = chronology74.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(chronology74);
        org.joda.time.DateTime dateTime80 = dateTime55.withChronology(chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and mutableDateTime79", (mutableDateTime17.compareTo(mutableDateTime79) == 0) == mutableDateTime17.equals(mutableDateTime79));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        int int8 = dateTime6.getWeekOfWeekyear();
        org.joda.time.Instant instant9 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (-1));
        org.joda.time.DateTime dateTime13 = dateTime11.plusWeeks(5);
        org.joda.time.DateTime dateTime15 = dateTime13.plusDays(3123);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (-1), chronology17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTime dateTime22 = localDateTime18.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.secondOfDay();
        org.joda.time.DurationField durationField25 = chronology23.minutes();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = chronology23.add(readablePeriod27, (long) 31, 69);
        org.joda.time.DateTimeField dateTimeField31 = chronology23.hourOfDay();
        org.joda.time.DateTime dateTime32 = dateTime13.toDateTime(chronology23);
        org.joda.time.DateTime dateTime33 = dateTime6.toDateTime(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime11", (instant9.compareTo(dateTime11) == 0) == instant9.equals(dateTime11));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        boolean boolean6 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime4);
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
        boolean boolean20 = dateTime13.isBefore((long) (-1));
        int int21 = dateTime13.getYearOfEra();
        org.joda.time.DateTime dateTime23 = dateTime13.plusDays(1969);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Instant instant25 = mutableDateTime1.toInstant();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekyear();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.plusMinutes(292278993);
        org.joda.time.LocalDateTime.Property property34 = localDateTime28.yearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = null;
        org.joda.time.format.DateTimeParser dateTimeParser36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter35, dateTimeParser36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.DateTime dateTime44 = localDateTime40.toDateTime(dateTimeZone42);
        org.joda.time.Chronology chronology45 = dateTime44.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter37.withChronology(chronology45);
        boolean boolean47 = localDateTime28.equals((java.lang.Object) chronology45);
        org.joda.time.DateTimeField dateTimeField48 = chronology45.millisOfDay();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.monthOfYear();
        org.joda.time.DurationField durationField50 = chronology45.centuries();
        mutableDateTime1.setChronology(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant25", (dateTime13.compareTo(instant25) == 0) == dateTime13.equals(instant25));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 1438);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond(54);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime8 = localTime6.minusSeconds((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.plus(readablePeriod9);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.millisOfSecond();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime2, chronology11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(3429255024964800000L, chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime14", (dateTime2.compareTo(dateTime14) == 0) == dateTime2.equals(dateTime14));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime7.add(readableDuration9, 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.monthOfYear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 3, chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getDurationType();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType16.getRangeDurationType();
        boolean boolean19 = localDate15.isSupported(durationFieldType18);
        org.joda.time.LocalDate.Property property20 = localDate15.centuryOfEra();
        boolean boolean21 = property20.isLeap();
        org.joda.time.LocalDate localDate22 = property20.getLocalDate();
        org.joda.time.LocalDate localDate24 = property20.setCopy("9");
        org.joda.time.LocalDate localDate26 = localDate24.minusMonths((int) 'u');
        org.joda.time.Chronology chronology27 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime7.toMutableDateTime(chronology27);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime7.add(readablePeriod30, 3600000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime29", (mutableDateTime8.compareTo(mutableDateTime29) == 0) == mutableDateTime8.equals(mutableDateTime29));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long21 = dateTimeZone19.convertUTCToLocal((long) 2000);
        org.joda.time.DateTime dateTime22 = dateTime6.withZone(dateTimeZone19);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime22", (dateTime6.compareTo(dateTime22) == 0) == dateTime6.equals(dateTime22));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusMillis(116);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfDay();
        org.joda.time.DurationField durationField22 = chronology20.months();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 'u', chronology20);
        java.util.Date date24 = dateTime23.toDate();
        org.joda.time.DateTime dateTime26 = dateTime23.withYear(1439);
        org.joda.time.Instant instant27 = dateTime23.toInstant();
        org.joda.time.DateTimeZone dateTimeZone28 = instant27.getZone();
        org.joda.time.DateTime dateTime29 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.DateTime dateTime30 = dateTime29.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant27", (dateTime23.compareTo(instant27) == 0) == dateTime23.equals(instant27));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add((long) 100);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.dayOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (-1), chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDateTime6.toDateTime(dateTimeZone8);
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.DateTime dateTime13 = dateTime10.plus((long) 100);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        int int17 = dateTime16.getDayOfMonth();
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.lang.String str22 = locale19.getDisplayVariant(locale21);
        java.lang.String str23 = dateTime16.toString("365", locale21);
        org.joda.time.DateTime dateTime25 = dateTime16.plusMonths(1969);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) (-1), chronology31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        org.joda.time.DateTime dateTime36 = localDateTime32.toDateTime(dateTimeZone34);
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter29.withChronology(chronology37);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatter29.getParser();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (-1), chronology41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTime dateTime46 = localDateTime42.toDateTime(dateTimeZone44);
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.secondOfDay();
        org.joda.time.DurationField durationField49 = chronology47.minutes();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        long long54 = chronology47.add(readablePeriod51, (long) 31, 69);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((long) (-1), chronology56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.weekyear();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.withPeriodAdded(readablePeriod63, 33);
        int[] intArray67 = chronology47.get((org.joda.time.ReadablePartial) localDateTime62, 315532800000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter29.withChronology(chronology47);
        org.joda.time.Chronology chronology69 = chronology47.withUTC();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.dayOfMonth();
        org.joda.time.DateTime dateTime71 = dateTime16.toDateTime(chronology69);
        org.joda.time.DurationField durationField72 = chronology69.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and dateTime71", (mutableDateTime0.compareTo(dateTime71) == 0) == mutableDateTime0.equals(dateTime71));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.plusMonths((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        java.lang.Object obj12 = null;
        boolean boolean13 = dateTimeZone11.equals(obj12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (-1), chronology18);
        boolean boolean20 = dateTimeZone15.isLocalDateTimeGap(localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withMillisOfDay(5);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.plusHours((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime19.withPeriodAdded(readablePeriod27, 3);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime19.plusSeconds(59);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (-1), chronology37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone41 = dateTimeZone40.toTimeZone();
        org.joda.time.DateTime dateTime42 = localDateTime38.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter35.withChronology(chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (-1), chronology48);
        boolean boolean50 = dateTimeZone45.isLocalDateTimeGap(localDateTime49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (-1), chronology52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekyear();
        boolean boolean55 = dateTimeZone45.isLocalDateTimeGap(localDateTime53);
        long long57 = dateTimeZone45.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter35.withZone(dateTimeZone45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter58.withPivotYear(2022);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter58.withPivotYear((java.lang.Integer) 33);
        org.joda.time.format.DateTimePrinter dateTimePrinter63 = dateTimeFormatter58.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter58.withPivotYear(48);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTimeFormatter58.getZone();
        org.joda.time.DateTime dateTime67 = localDateTime31.toDateTime(dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) (-1), chronology71);
        boolean boolean73 = dateTimeZone68.isLocalDateTimeGap(localDateTime72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property76 = localDateTime72.dayOfYear();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime72.withSecondOfMinute((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration79 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime72.withDurationAdded(readableDuration79, (int) 'u');
        org.joda.time.LocalDateTime.Property property82 = localDateTime72.monthOfYear();
        org.joda.time.Chronology chronology83 = localDateTime72.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.year();
        org.joda.time.DateTimeZone dateTimeZone85 = chronology83.getZone();
        org.joda.time.DateTime dateTime86 = dateTime67.toDateTime(dateTimeZone85);
        mutableDateTime14.setZone(dateTimeZone85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime67 and dateTime86", (dateTime67.compareTo(dateTime86) == 0) == dateTime67.equals(dateTime86));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withYearOfCentury(23);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withWeekOfWeekyear(23);
        int int14 = localDateTime11.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayScript();
        java.lang.String str21 = dateTimeZone16.getName((long) 5, locale19);
        org.joda.time.DateTime dateTime22 = localDateTime11.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfDay();
        org.joda.time.DurationField durationField32 = chronology30.minutes();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology30.add(readablePeriod34, (long) 31, 69);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, 33);
        int[] intArray50 = chronology30.get((org.joda.time.ReadablePartial) localDateTime45, 315532800000L);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime11, chronology30);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField53 = chronology30.clockhourOfHalfday();
        org.joda.time.DurationField durationField54 = chronology30.eras();
        org.joda.time.DateTimeField dateTimeField55 = chronology30.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField32 and durationField54", Math.signum(durationField32.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField32)));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology12.days();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1970, chronology12);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.Chronology chronology19 = chronology12.withUTC();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(99705600019L, chronology12);
        org.joda.time.DurationField durationField22 = chronology12.eras();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField22", Math.signum(durationField16.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField16)));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        int int7 = mutableDateTime4.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime4.add(readableDuration8, 69);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime14 = localTime12.minusSeconds((int) (short) 10);
        int int15 = localTime12.getMinuteOfHour();
        org.joda.time.LocalTime.Property property16 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime17 = property16.withMaximumValue();
        org.joda.time.DateTime dateTime18 = localTime17.toDateTimeToday();
        int int19 = localTime17.size();
        org.joda.time.LocalTime localTime21 = localTime17.plusHours((-1));
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.dayOfMonth();
        org.joda.time.DurationField durationField25 = chronology22.years();
        mutableDateTime4.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime4", (mutableDateTime1.compareTo(mutableDateTime4) == 0) == mutableDateTime1.equals(mutableDateTime4));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        mutableDateTime7.setWeekyear(2022);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.yearOfCentury();
        mutableDateTime7.add((long) 100);
        mutableDateTime7.addMinutes(53);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime19 = localTime17.minusSeconds((int) (short) 10);
        int int20 = localTime17.getMinuteOfHour();
        org.joda.time.LocalTime.Property property21 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime22 = property21.withMaximumValue();
        boolean boolean23 = property21.isLeap();
        org.joda.time.LocalTime localTime24 = property21.roundFloorCopy();
        org.joda.time.LocalTime.Property property25 = localTime24.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime27.set(dateTimeFieldType28, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime27.add(readablePeriod31, 4);
        int int34 = mutableDateTime27.getMillisOfDay();
        long long35 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Chronology chronology36 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.DurationField durationField38 = chronology36.eras();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 54402, chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology36.hourOfHalfday();
        mutableDateTime7.setChronology(chronology36);
        org.joda.time.DurationField durationField43 = chronology36.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField43, and durationField38", !(durationField38.compareTo(durationField43) == 0) || (Math.signum(durationField38.compareTo(durationField38)) == Math.signum(durationField43.compareTo(durationField38))));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime1.add(readablePeriod5, 4);
        int int8 = mutableDateTime1.getMillisOfDay();
        int int9 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.minuteOfHour();
        mutableDateTime1.setSecondOfMinute(31);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.era();
        mutableDateTime1.add((long) 2525);
        org.joda.time.DateTimeField dateTimeField16 = mutableDateTime1.getRoundingField();
        java.lang.String str17 = mutableDateTime1.toString();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime24 = localDateTime20.toDateTime(dateTimeZone22);
        java.lang.String str25 = dateTime24.toString();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.plus(readableDuration26);
        org.joda.time.DateTime dateTime29 = dateTime24.minusWeeks(10);
        org.joda.time.DateTime.Property property30 = dateTime24.hourOfDay();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (-1), chronology32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        org.joda.time.DateTime dateTime37 = localDateTime33.toDateTime(dateTimeZone35);
        java.lang.String str38 = dateTime37.toString();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.plus(readableDuration39);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime42.set(dateTimeFieldType43, (-292275054));
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime42.yearOfEra();
        mutableDateTime42.setYear((int) '#');
        mutableDateTime42.setYear(292278993);
        int int51 = dateTime40.compareTo((org.joda.time.ReadableInstant) mutableDateTime42);
        int int52 = property30.compareTo((org.joda.time.ReadableInstant) mutableDateTime42);
        org.joda.time.DateTime dateTime53 = property30.roundCeilingCopy();
        org.joda.time.DateTime dateTime55 = dateTime53.withYear(30849);
        org.joda.time.Instant instant56 = dateTime55.toInstant();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) instant56);
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime1.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime55 and instant56", (dateTime55.compareTo(instant56) == 0) == dateTime55.equals(instant56));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime5 = dateTime2.withDurationAdded((long) (byte) 0, 292278993);
        org.joda.time.LocalDate localDate6 = dateTime2.toLocalDate();
        int int7 = dateTime2.getMillisOfDay();
        org.joda.time.Instant instant8 = dateTime2.toInstant();
        int int9 = dateTime2.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant8", (dateTime2.compareTo(instant8) == 0) == dateTime2.equals(instant8));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime1.add(readablePeriod5, 4);
        mutableDateTime1.addWeekyears((int) (short) 100);
        int int10 = mutableDateTime1.getRoundingMode();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekyear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusWeeks((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.minus(readablePeriod20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime14.withYearOfCentury(23);
        org.joda.time.Chronology chronology24 = localDateTime23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale27.getDisplayScript(locale29);
        java.lang.String str31 = locale29.getVariant();
        java.lang.String str32 = dateTimeZone25.getName(0L, locale29);
        java.lang.String str33 = locale29.getDisplayCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 517200, chronology24, locale29, (java.lang.Integer) 30, 2022);
        org.joda.time.DateTime dateTime37 = mutableDateTime1.toDateTime(chronology24);
        org.joda.time.DateTime dateTime39 = dateTime37.withYearOfCentury(46);
        org.joda.time.Instant instant40 = dateTime37.toInstant();
        org.joda.time.DateTime dateTime41 = dateTime37.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant40", (mutableDateTime1.compareTo(instant40) == 0) == mutableDateTime1.equals(instant40));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.Chronology chronology8 = localDate2.getChronology();
        org.joda.time.DateTime dateTime9 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMillisOfSecond(40);
        org.joda.time.DateTime dateTime13 = dateTime9.plusMinutes(69);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime16.set(dateTimeFieldType17, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime16.add(readablePeriod20, 4);
        int int23 = mutableDateTime16.getMillisOfDay();
        int int24 = mutableDateTime16.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime16.minuteOfHour();
        mutableDateTime16.addHours((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime16.getZone();
        long long31 = dateTimeZone28.convertLocalToUTC((long) 3123, true);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 1439, dateTimeZone28);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfMonth();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.era();
        mutableDateTime32.setDate((long) 179);
        boolean boolean37 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.Instant instant38 = dateTime13.toInstant();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) '#');
        org.joda.time.DateTime dateTime42 = instant38.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minus(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant38", (dateTime13.compareTo(instant38) == 0) == dateTime13.equals(instant38));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 0);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (-292275054), dateTimeZone7);
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone7, 0L);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears(35);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.plus(readableDuration15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime12", (dateTime3.compareTo(dateTime12) == 0) == dateTime3.equals(dateTime12));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        int int17 = dateTime6.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime6.toMutableDateTimeISO();
        int int19 = dateTime6.getWeekOfWeekyear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime26 = localDateTime22.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.dayOfYear();
        org.joda.time.Chronology chronology29 = chronology27.withUTC();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) dateTime6, chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime30", (dateTime6.compareTo(dateTime30) == 0) == dateTime6.equals(dateTime30));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology12.days();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1970, chronology12);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.Chronology chronology19 = chronology12.withUTC();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(99705600019L, chronology12);
        org.joda.time.DurationField durationField22 = chronology12.eras();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField22", Math.signum(durationField16.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField16)));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime12 = dateTime9.withWeekyear((int) 'x');
        org.joda.time.DateTime dateTime14 = dateTime12.plusWeeks((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime12.minusMillis(3);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime26 = localDateTime22.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter19.withChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.monthOfYear();
        org.joda.time.DateTime dateTime30 = dateTime12.toDateTime(chronology27);
        org.joda.time.DateTime dateTime31 = dateTime12.toDateTimeISO();
        org.joda.time.DateTime dateTime33 = dateTime12.plusDays(19);
        org.joda.time.Instant instant34 = dateTime33.toInstant();
        int int35 = dateTime33.getEra();
        int int36 = dateTime33.getMonthOfYear();
        org.joda.time.DateTime dateTime38 = dateTime33.withMillis((long) 55);
        org.joda.time.DateTime.Property property39 = dateTime38.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant34", (dateTime33.compareTo(instant34) == 0) == dateTime33.equals(instant34));
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
        org.joda.time.DateTime dateTime12 = dateTime9.withWeekyear((int) 'x');
        org.joda.time.DateTime dateTime14 = dateTime9.plus((-61567603198033L));
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.DateTime.Property property16 = dateTime14.dayOfYear();
        int int17 = property16.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant15", (dateTime14.compareTo(instant15) == 0) == dateTime14.equals(instant15));
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
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime6.millisOfSecond();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 1, chronology12);
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) (byte) 0, 292278993);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long21 = dateTimeZone19.convertUTCToLocal((long) 2000);
        org.joda.time.DateTime dateTime22 = dateTime6.withZone(dateTimeZone19);
        java.lang.String str23 = dateTimeZone19.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime22", (dateTime6.compareTo(dateTime22) == 0) == dateTime6.equals(dateTime22));
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
        org.joda.time.DateTime.Property property10 = dateTime6.millisOfSecond();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 1, chronology12);
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) (byte) 0, 292278993);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long21 = dateTimeZone19.convertUTCToLocal((long) 2000);
        org.joda.time.DateTime dateTime22 = dateTime6.withZone(dateTimeZone19);
        org.joda.time.DateTime dateTime24 = dateTime22.minusSeconds(29);
        org.joda.time.DateTime dateTime26 = dateTime22.plusMonths((-929));
        long long27 = dateTime26.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime22", (dateTime6.compareTo(dateTime22) == 0) == dateTime6.equals(dateTime22));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime1.set(dateTimeFieldType2, (-292275054));
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setYear((int) '#');
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (-1), chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = localDateTime10.toDateTime(dateTimeZone12);
        int int16 = dateTimeZone12.getOffsetFromLocal((long) (byte) 10);
        long long18 = dateTimeZone12.nextTransition((long) 59);
        mutableDateTime1.setZoneRetainFields(dateTimeZone12);
        long long22 = dateTimeZone12.convertLocalToUTC((-1609459200000L), false);
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = locale24.getDisplayScript(locale26);
        java.util.Set<java.lang.Character> charSet28 = locale24.getExtensionKeys();
        java.lang.String str29 = dateTimeZone12.getName(3692163384000L, locale24);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone32);
        boolean boolean35 = dateTimeZone32.isStandardOffset((long) 2);
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone32);
        long long39 = dateTimeZone32.convertLocalToUTC(30L, true);
        long long41 = dateTimeZone12.getMillisKeepLocal(dateTimeZone32, (long) (-358));
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.Instant instant43 = dateTime42.toInstant();
        org.joda.time.DateTime dateTime45 = dateTime42.withMillisOfDay(85512);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant43", (dateTime36.compareTo(instant43) == 0) == dateTime36.equals(instant43));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField10 = chronology8.months();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 'u', chronology8);
        java.util.Date date12 = dateTime11.toDate();
        org.joda.time.DateTime dateTime14 = dateTime11.withYear(1439);
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone16.convertUTCToLocal(997L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.addMillis((-292275054));
        java.lang.String str3 = mutableDateTime0.toString();
        mutableDateTime0.addMonths(47);
        org.joda.time.Chronology chronology6 = mutableDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.era();
        org.joda.time.DurationField durationField10 = chronology6.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField10, and durationField8", !(durationField8.compareTo(durationField10) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField10.compareTo(durationField8))));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusMinutes(292278993);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.minusHours(888);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.year();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.dayOfYear();
        org.joda.time.DurationField durationField15 = chronology13.eras();
        org.joda.time.DurationField durationField16 = chronology13.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField16, and durationField15", !(durationField15.compareTo(durationField16) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField16.compareTo(durationField15))));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        mutableDateTime1.add((long) 100);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.dayOfYear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.DateTime dateTime14 = dateTime11.plus((long) 100);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        int int18 = dateTime17.getDayOfMonth();
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = locale20.getDisplayVariant(locale22);
        java.lang.String str24 = dateTime17.toString("365", locale22);
        org.joda.time.DateTime dateTime26 = dateTime17.plusMonths(1969);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = null;
        org.joda.time.format.DateTimeParser dateTimeParser29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (-1), chronology32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        org.joda.time.DateTime dateTime37 = localDateTime33.toDateTime(dateTimeZone35);
        org.joda.time.Chronology chronology38 = dateTime37.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter30.withChronology(chronology38);
        org.joda.time.format.DateTimeParser dateTimeParser40 = dateTimeFormatter30.getParser();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (-1), chronology42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        org.joda.time.DateTime dateTime47 = localDateTime43.toDateTime(dateTimeZone45);
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.secondOfDay();
        org.joda.time.DurationField durationField50 = chronology48.minutes();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        long long55 = chronology48.add(readablePeriod52, (long) 31, 69);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) (-1), chronology57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.weekyear();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime58.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withPeriodAdded(readablePeriod64, 33);
        int[] intArray68 = chronology48.get((org.joda.time.ReadablePartial) localDateTime63, 315532800000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter30.withChronology(chronology48);
        org.joda.time.Chronology chronology70 = chronology48.withUTC();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.dayOfMonth();
        org.joda.time.DateTime dateTime72 = dateTime17.toDateTime(chronology70);
        java.util.Locale locale73 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) (-1), chronology76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.dayOfYear();
        org.joda.time.DurationField durationField79 = property78.getLeapDurationField();
        org.joda.time.Interval interval80 = property78.toInterval();
        long long81 = property78.remainder();
        java.lang.String str82 = property78.toString();
        org.joda.time.LocalDateTime localDateTime84 = property78.setCopy((int) (short) 1);
        java.util.Locale locale86 = new java.util.Locale("hi!");
        java.lang.String str87 = locale86.getScript();
        java.util.Locale locale88 = locale86.stripExtensions();
        int int89 = property78.getMaximumShortTextLength(locale86);
        java.lang.String str90 = locale73.getDisplayLanguage(locale86);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket93 = new org.joda.time.format.DateTimeParserBucket((-431999943L), chronology70, locale86, (java.lang.Integer) 6, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime72", (mutableDateTime1.compareTo(dateTime72) == 0) == mutableDateTime1.equals(dateTime72));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusHours(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.secondOfMinute();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField14 = mutableDateTime13.getRoundingField();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.dayOfWeek();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (-1), chronology17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.DurationField durationField20 = property19.getLeapDurationField();
        org.joda.time.Interval interval21 = property19.toInterval();
        long long22 = property19.remainder();
        java.util.Locale locale24 = new java.util.Locale("hi!");
        int int25 = property19.getMaximumShortTextLength(locale24);
        java.lang.String str26 = property15.getAsShortText(locale24);
        int int27 = property12.getMaximumTextLength(locale24);
        java.util.Set<java.lang.String> strSet28 = locale24.getUnicodeLocaleKeys();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) (-1), chronology31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        org.joda.time.DateTime dateTime36 = localDateTime32.toDateTime(dateTimeZone34);
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.secondOfDay();
        org.joda.time.DurationField durationField39 = chronology37.minutes();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = chronology37.add(readablePeriod41, (long) 31, 69);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) (-1), chronology46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.weekyear();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withPeriodAdded(readablePeriod53, 33);
        int[] intArray57 = chronology37.get((org.joda.time.ReadablePartial) localDateTime52, 315532800000L);
        java.util.Locale locale58 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket(94694400000L, chronology37, locale58, (java.lang.Integer) 1439, 49);
        org.joda.time.DurationField durationField62 = chronology37.millis();
        boolean boolean63 = strSet28.contains((java.lang.Object) chronology37);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(0L, chronology37);
        org.joda.time.DateTime.Property property65 = dateTime64.secondOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter67 = null;
        org.joda.time.format.DateTimeParser dateTimeParser68 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter67, dateTimeParser68);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) (-1), chronology71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone75 = dateTimeZone74.toTimeZone();
        org.joda.time.DateTime dateTime76 = localDateTime72.toDateTime(dateTimeZone74);
        org.joda.time.Chronology chronology77 = dateTime76.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter69.withChronology(chronology77);
        org.joda.time.DateTimeField dateTimeField79 = chronology77.monthOfYear();
        org.joda.time.DateTimeField dateTimeField80 = chronology77.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(chronology77);
        org.joda.time.DurationField durationField82 = chronology77.eras();
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(888L, chronology77);
        org.joda.time.DateTime dateTime84 = dateTime64.toDateTime(chronology77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField39 and durationField82", Math.signum(durationField39.compareTo(durationField82)) == -Math.signum(durationField82.compareTo(durationField39)));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.setDate((-1L));
        int int5 = mutableDateTime1.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime1.isSupported(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = dateTimeZone9.getName((long) 5, locale12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayScript();
        java.lang.String str22 = dateTimeZone17.getName((long) 5, locale20);
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime(dateTimeZone17);
        mutableDateTime1.setZoneRetainFields(dateTimeZone17);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime1.toDateTime(chronology26);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 5);
        int int30 = localDate29.getDayOfMonth();
        org.joda.time.LocalDate localDate32 = localDate29.minusWeeks((int) (byte) 100);
        org.joda.time.DateTime dateTime33 = dateTime27.withFields((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withDurationAdded(readableDuration34, 85506435);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime27", (mutableDateTime1.compareTo(dateTime27) == 0) == mutableDateTime1.equals(dateTime27));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (-1), chronology4);
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withMillisOfDay(5);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.plusHours((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.withPeriodAdded(readablePeriod13, 3);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime5.plusSeconds(59);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter21.withChronology(chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (-1), chronology34);
        boolean boolean36 = dateTimeZone31.isLocalDateTimeGap(localDateTime35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (-1), chronology38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.weekyear();
        boolean boolean41 = dateTimeZone31.isLocalDateTimeGap(localDateTime39);
        long long43 = dateTimeZone31.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter21.withZone(dateTimeZone31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter44.withPivotYear(2022);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter44.withPivotYear((java.lang.Integer) 33);
        org.joda.time.format.DateTimePrinter dateTimePrinter49 = dateTimeFormatter44.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter44.withPivotYear(48);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeFormatter44.getZone();
        org.joda.time.DateTime dateTime53 = localDateTime17.toDateTime(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone55 = dateTimeZone54.toTimeZone();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) (-1), chronology57);
        boolean boolean59 = dateTimeZone54.isLocalDateTimeGap(localDateTime58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withYearOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property62 = localDateTime58.dayOfYear();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.withSecondOfMinute((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.LocalDateTime localDateTime67 = localDateTime58.withDurationAdded(readableDuration65, (int) 'u');
        org.joda.time.LocalDateTime.Property property68 = localDateTime58.monthOfYear();
        org.joda.time.Chronology chronology69 = localDateTime58.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.year();
        org.joda.time.DateTimeZone dateTimeZone71 = chronology69.getZone();
        org.joda.time.DateTime dateTime72 = dateTime53.toDateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(315534300000L, dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and dateTime72", (dateTime53.compareTo(dateTime72) == 0) == dateTime53.equals(dateTime72));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) (short) 100);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.DateTime dateTime14 = dateTime11.plus((long) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusSeconds(0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withChronology(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusSeconds(99);
        boolean boolean21 = mutableDateTime4.equals((java.lang.Object) dateTime18);
        mutableDateTime4.addMillis(162);
        org.joda.time.Instant instant24 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime4.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant24", (mutableDateTime4.compareTo(instant24) == 0) == mutableDateTime4.equals(instant24));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(31244400000L, chronology11);
        long long17 = chronology11.add(5999899L, (long) 62, 1973);
        org.joda.time.DurationField durationField18 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology11.secondOfDay();
        org.joda.time.DurationField durationField20 = chronology11.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField20, and durationField18", !(durationField18.compareTo(durationField20) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField20.compareTo(durationField18))));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (byte) -1);
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.lang.String str17 = locale16.toLanguageTag();
        java.lang.String str18 = locale16.getDisplayScript();
        java.util.Calendar calendar19 = dateTime13.toCalendar(locale16);
        org.joda.time.DateTime.Property property20 = dateTime13.secondOfDay();
        org.joda.time.DateTime dateTime21 = property20.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime22 = property20.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        java.lang.String str30 = dateTime29.toString();
        org.joda.time.DateTime dateTime32 = dateTime29.plus((long) 100);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Calendar calendar35 = dateTime32.toCalendar(locale34);
        org.joda.time.DateTime.Property property36 = dateTime32.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime37 = dateTime32.toLocalDateTime();
        boolean boolean38 = dateTime32.isAfterNow();
        org.joda.time.DateTime.Property property39 = dateTime32.hourOfDay();
        org.joda.time.DateTime dateTime41 = dateTime32.withYearOfEra(515);
        org.joda.time.DateTime dateTime43 = dateTime32.withMillis((long) (-180));
        int int44 = property20.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar35", (calendar19.compareTo(calendar35) == 0) == calendar19.equals(calendar35));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 'x');
        int int4 = localDateTime3.getHourOfDay();
        org.joda.time.Chronology chronology5 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology5);
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((-59035391999958L), chronology5, locale8);
        org.joda.time.DateTimeField dateTimeField10 = chronology5.yearOfEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.DateTime dateTime22 = dateTime19.plus((long) 100);
        org.joda.time.DateTime.Property property23 = dateTime19.millisOfSecond();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) 1, chronology25);
        org.joda.time.DateTime dateTime29 = dateTime26.withDurationAdded((long) (byte) 0, 292278993);
        int int30 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime38 = localDateTime34.toDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.secondOfDay();
        org.joda.time.DurationField durationField41 = chronology39.minutes();
        org.joda.time.DurationField durationField42 = chronology39.minutes();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 292278993, chronology39);
        org.joda.time.DateTime dateTime44 = dateTime19.toDateTime(chronology39);
        org.joda.time.DateTimeField dateTimeField45 = chronology39.minuteOfDay();
        java.util.Locale locale46 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 69, chronology39, locale46, (java.lang.Integer) 33, (int) ' ');
        org.joda.time.DurationField durationField50 = chronology39.years();
        java.util.Locale locale51 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) (-1), chronology53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone57 = dateTimeZone56.toTimeZone();
        org.joda.time.DateTime dateTime58 = localDateTime54.toDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology59 = dateTime58.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.hours();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.secondOfMinute();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (-1), chronology63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.weekyear();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.minusHours((-1));
        java.util.Locale locale68 = java.util.Locale.JAPANESE;
        java.lang.String str69 = dateTimeField61.getAsText((org.joda.time.ReadablePartial) localDateTime64, locale68);
        java.lang.String str70 = locale51.getDisplayScript(locale68);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket(1L, chronology39, locale51, (java.lang.Integer) 2922750, (int) 'x');
        java.lang.String str74 = locale51.getISO3Country();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket(55L, chronology5, locale51, (java.lang.Integer) 292275055, 31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField41", (durationField6.compareTo(durationField41) == 0) == durationField6.equals(durationField41));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime2.add((long) '#');
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime2.add(readableDuration5);
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        java.util.Date date8 = mutableDateTime2.toDate();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant7", (mutableDateTime2.compareTo(instant7) == 0) == mutableDateTime2.equals(instant7));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        mutableDateTime6.add((long) 100);
        org.joda.time.Chronology chronology9 = null;
        mutableDateTime6.setChronology(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        long long13 = dateTimeZone11.previousTransition((long) 1);
        mutableDateTime6.setZone(dateTimeZone11);
        mutableDateTime6.setMillisOfSecond((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime6.copy();
        org.joda.time.DateTime dateTime18 = localDateTime5.toDateTime((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime5.minus(readablePeriod19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime(dateTimeZone25);
        java.lang.String str28 = dateTime27.toString();
        org.joda.time.DateTime dateTime30 = dateTime27.plus((long) 100);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.DateTime dateTime33 = dateTime30.withWeekyear((int) 'x');
        org.joda.time.DateTime dateTime35 = dateTime30.minusMonths((int) (byte) -1);
        org.joda.time.DateTime dateTime37 = dateTime30.minusDays((int) (byte) -1);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) (-1), chronology39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.DateTime dateTime44 = localDateTime40.toDateTime(dateTimeZone42);
        java.lang.String str45 = dateTime44.toString();
        org.joda.time.DateTime dateTime47 = dateTime44.plus((long) 100);
        org.joda.time.DateTime.Property property48 = dateTime47.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime50 = dateTime47.plus(readableDuration49);
        int int51 = dateTime50.getDayOfMonth();
        java.util.Locale locale53 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleAttributes();
        java.util.Locale locale55 = java.util.Locale.GERMANY;
        java.lang.String str56 = locale53.getDisplayVariant(locale55);
        java.lang.String str57 = dateTime50.toString("365", locale55);
        org.joda.time.DateTime dateTime59 = dateTime50.plusMonths(1969);
        org.joda.time.DateTime dateTime60 = dateTime50.withLaterOffsetAtOverlap();
        java.lang.String str61 = dateTime60.toString();
        org.joda.time.DateTime.Property property62 = dateTime60.era();
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.DateTime dateTime64 = dateTime60.minus(readablePeriod63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.DateTime dateTime66 = dateTime60.minus(readablePeriod65);
        org.joda.time.DateTime dateTime68 = dateTime66.minusYears(21);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone71);
        java.lang.String str74 = dateTimeZone71.getShortName((long) 2);
        long long78 = dateTimeZone71.convertLocalToUTC((long) 69, true, 0L);
        long long80 = dateTimeZone71.previousTransition((long) (byte) 1);
        org.joda.time.DateTime dateTime81 = dateTime68.withZoneRetainFields(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime83 = dateTime37.withZone(dateTimeZone71);
        org.joda.time.DateTime dateTime84 = localDateTime20.toDateTime(dateTimeZone71);
        java.util.GregorianCalendar gregorianCalendar85 = dateTime84.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and dateTime83", (dateTime37.compareTo(dateTime83) == 0) == dateTime37.equals(dateTime83));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        org.joda.time.DateTime dateTime19 = dateTime15.minusSeconds(1969);
        org.joda.time.DateTime dateTime20 = dateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime19.plusWeeks(1439);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) (-1), chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime(dateTimeZone28);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.DateTime dateTime33 = dateTime30.plus((long) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.minus(readablePeriod36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusHours((int) (byte) -1);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (-1), chronology41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTime dateTime46 = localDateTime42.toDateTime(dateTimeZone44);
        java.lang.String str47 = dateTime46.toString();
        org.joda.time.DateTime dateTime49 = dateTime46.plus((long) 100);
        org.joda.time.DateTime.Property property50 = dateTime49.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.plus(readableDuration51);
        int int53 = dateTime52.getDayOfMonth();
        java.util.Locale locale55 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        java.util.Locale locale57 = java.util.Locale.GERMANY;
        java.lang.String str58 = locale55.getDisplayVariant(locale57);
        java.lang.String str59 = dateTime52.toString("365", locale57);
        org.joda.time.DateTime dateTime61 = dateTime52.plusMonths(1969);
        org.joda.time.DateTime dateTime62 = dateTime52.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime64 = dateTime62.withYearOfEra(2022);
        boolean boolean65 = dateTime39.isAfter((org.joda.time.ReadableInstant) dateTime62);
        int int66 = dateTime39.getDayOfWeek();
        org.joda.time.DateTime dateTime68 = dateTime39.withWeekOfWeekyear(45);
        org.joda.time.DateTime dateTime70 = dateTime39.withYearOfCentury(14);
        org.joda.time.DateTime dateTime71 = dateTime70.toDateTime();
        java.util.TimeZone timeZone73 = java.util.TimeZone.getTimeZone("2089-12-30T23:59:59.999Z");
        java.util.TimeZone.setDefault(timeZone73);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        org.joda.time.DateTime dateTime76 = dateTime71.toDateTime(dateTimeZone75);
        org.joda.time.DateTime dateTime77 = dateTime22.withZone(dateTimeZone75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime70 and dateTime76", (dateTime70.compareTo(dateTime76) == 0) == dateTime70.equals(dateTime76));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds((int) (short) 10);
        int int5 = localTime2.getMinuteOfHour();
        org.joda.time.LocalTime.Property property6 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime7 = property6.withMaximumValue();
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        int int9 = localTime7.size();
        org.joda.time.LocalTime localTime11 = localTime7.plusHours((-1));
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.DurationField durationField14 = chronology12.years();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology12.add(readablePeriod15, (long) 100, 12);
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Set<java.lang.Character> charSet21 = locale19.getExtensionKeys();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(311036400000L, chronology12, locale19, (java.lang.Integer) 999);
        org.joda.time.DurationField durationField24 = chronology12.weekyears();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField24", (durationField14.compareTo(durationField24) == 0) == durationField14.equals(durationField24));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfSecond(33, (int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendYear((int) (short) 1, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendMinuteOfHour(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder8.appendMonthOfYear(3600000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendYearOfEra(2022, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendClockhourOfHalfday(25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendTimeZoneId();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property23 = localDate21.property(dateTimeFieldType22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.year();
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType24);
        org.joda.time.LocalDate.Property property26 = localDate21.era();
        org.joda.time.LocalDate.Property property27 = localDate21.dayOfMonth();
        org.joda.time.LocalDate localDate29 = localDate21.minusWeeks(2000);
        org.joda.time.DateTime dateTime30 = localDate21.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean32 = localDate21.isSupported(dateTimeFieldType31);
        org.joda.time.LocalDate.Property property33 = localDate21.monthOfYear();
        int int34 = localDate21.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology37 = null;
        mutableDateTime36.setChronology(chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        java.util.GregorianCalendar gregorianCalendar41 = mutableDateTime40.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone42);
        java.util.GregorianCalendar gregorianCalendar44 = mutableDateTime43.toGregorianCalendar();
        boolean boolean45 = mutableDateTime40.isAfter((org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime43.getZone();
        mutableDateTime36.setZone(dateTimeZone46);
        org.joda.time.Interval interval48 = localDate21.toInterval(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.LocalDate localDate52 = org.joda.time.LocalDate.now(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime53.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime53.property(dateTimeFieldType55);
        boolean boolean57 = localDate21.isSupported(dateTimeFieldType55);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder20.appendFixedDecimal(dateTimeFieldType55, 30900098);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and mutableDateTime51", (dateTime30.compareTo(mutableDateTime51) == 0) == dateTime30.equals(mutableDateTime51));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime5 = property2.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime6 = property2.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property2.getMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (-1), chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = localDateTime10.toDateTime(dateTimeZone12);
        java.lang.String str15 = dateTime14.toString();
        org.joda.time.DateTime dateTime17 = dateTime14.plus((long) 100);
        org.joda.time.DateTime.Property property18 = dateTime14.millisOfSecond();
        org.joda.time.DateTime dateTime20 = dateTime14.plusYears(0);
        int int21 = dateTime14.getSecondOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime23.set(dateTimeFieldType24, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime23.add(readablePeriod27, 4);
        mutableDateTime23.addWeekyears((int) (short) 100);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime23.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone35);
        java.lang.String str38 = dateTimeZone35.getShortName((long) 2);
        int int40 = dateTimeZone35.getStandardOffset((-457071L));
        mutableDateTime23.setZone(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime14.toMutableDateTime(dateTimeZone35);
        java.lang.String str44 = dateTimeZone35.getNameKey(172800000L);
        mutableDateTime7.setZone(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime42", (dateTime14.compareTo(mutableDateTime42) == 0) == dateTime14.equals(mutableDateTime42));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.setDate((-1L));
        int int5 = mutableDateTime1.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime1.isSupported(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = dateTimeZone9.getName((long) 5, locale12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayScript();
        java.lang.String str22 = dateTimeZone17.getName((long) 5, locale20);
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime(dateTimeZone17);
        mutableDateTime1.setZoneRetainFields(dateTimeZone17);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime1.toDateTime(chronology26);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 5);
        int int30 = localDate29.getDayOfMonth();
        org.joda.time.LocalDate localDate32 = localDate29.minusWeeks((int) (byte) 100);
        org.joda.time.DateTime dateTime33 = dateTime27.withFields((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime27.withDurationAdded(readableDuration34, 86369199);
        org.joda.time.DateTime dateTime38 = dateTime36.withMonthOfYear(9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime36", (mutableDateTime1.compareTo(dateTime36) == 0) == mutableDateTime1.equals(dateTime36));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime2.setMillisOfDay(10);
        mutableDateTime2.setMillisOfSecond((int) (short) 1);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 30);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillisOfSecond(5);
        int int11 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        long long17 = dateTimeZone12.convertLocalToUTC(10L, false, (long) 3);
        java.lang.String str19 = dateTimeZone12.getName((long) 2022);
        mutableDateTime2.setZoneRetainFields(dateTimeZone12);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 14, dateTimeZone12);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.LocalDate localDate24 = dateTime23.toLocalDate();
        org.joda.time.DateTime.Property property25 = dateTime23.minuteOfDay();
        org.joda.time.DateTime dateTime27 = property25.addToCopy((int) (short) 100);
        org.joda.time.DateTime dateTime28 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        long long34 = dateTimeZone29.convertLocalToUTC(10L, false, (long) 3);
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str37 = dateTimeZone29.getShortName(0L, locale36);
        int int39 = dateTimeZone29.getOffsetFromLocal((long) 25);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property43 = localDate41.property(dateTimeFieldType42);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.year();
        boolean boolean45 = localDate41.isSupported(dateTimeFieldType44);
        org.joda.time.LocalDate.Property property46 = localDate41.era();
        org.joda.time.LocalDate.Property property47 = localDate41.dayOfMonth();
        org.joda.time.LocalDate localDate49 = localDate41.minusWeeks(2000);
        int int51 = localDate41.getValue((int) (short) 0);
        org.joda.time.LocalDate localDate53 = localDate41.plusDays(1439);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = localDate41.toDateTimeAtStartOfDay(dateTimeZone55);
        int int60 = dateTimeZone55.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime40.toMutableDateTime(dateTimeZone55);
        int int63 = dateTimeZone55.getStandardOffset((long) (-2033));
        org.joda.time.DateTime dateTime64 = dateTime28.toDateTime(dateTimeZone55);
        org.joda.time.DateMidnight dateMidnight65 = localDate21.toDateMidnight(dateTimeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime56", (dateTime23.compareTo(mutableDateTime56) == 0) == dateTime23.equals(mutableDateTime56));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime2.add((long) '#');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.secondOfMinute();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (-1), chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DurationField durationField12 = property11.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime14 = property11.addToCopy((-1));
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.era();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone18);
        boolean boolean21 = dateTimeZone18.isStandardOffset((long) 2);
        java.util.TimeZone timeZone22 = dateTimeZone18.toTimeZone();
        java.util.TimeZone timeZone23 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime24 = localDateTime14.toDateTime(dateTimeZone18);
        java.lang.String str25 = dateTimeZone18.getID();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime6.toMutableDateTime(dateTimeZone18);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime30 = localTime28.minusSeconds((int) (short) 10);
        int int31 = localTime28.getMinuteOfHour();
        org.joda.time.LocalTime.Property property32 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime33 = property32.withMaximumValue();
        org.joda.time.DateTime dateTime34 = localTime33.toDateTimeToday();
        int int35 = localTime33.size();
        org.joda.time.LocalTime localTime37 = localTime33.plusHours((-1));
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.millisOfDay();
        org.joda.time.DurationField durationField40 = chronology38.years();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = chronology38.add(readablePeriod41, (long) 100, 12);
        org.joda.time.DateTimeField dateTimeField45 = chronology38.halfdayOfDay();
        org.joda.time.DurationField durationField46 = chronology38.minutes();
        mutableDateTime6.setChronology(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime26", (mutableDateTime6.compareTo(mutableDateTime26) == 0) == mutableDateTime6.equals(mutableDateTime26));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
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
        org.joda.time.DateTime.Property property12 = dateTime6.hourOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime24.set(dateTimeFieldType25, (-292275054));
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.yearOfEra();
        mutableDateTime24.setYear((int) '#');
        mutableDateTime24.setYear(292278993);
        int int33 = dateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        int int34 = property12.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.DateTime dateTime35 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime37 = dateTime35.withDayOfYear(7);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime39.setTime(100L);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime39.yearOfCentury();
        int int43 = mutableDateTime39.getYearOfEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (short) 1, chronology45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone49);
        org.joda.time.DateTime dateTime51 = dateTime46.toDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime53 = dateTime51.minusYears(7);
        org.joda.time.DateTime.Property property54 = dateTime51.secondOfMinute();
        org.joda.time.DateTime.Property property55 = dateTime51.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight56 = dateTime51.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight57 = dateTime51.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        long long61 = dateTimeZone59.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone59);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) (-1), chronology64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.DateTime dateTime69 = localDateTime65.toDateTime(dateTimeZone67);
        org.joda.time.Chronology chronology70 = dateTime69.getChronology();
        org.joda.time.DateTimeField dateTimeField71 = chronology70.secondOfDay();
        org.joda.time.DurationField durationField72 = chronology70.minutes();
        org.joda.time.DurationField durationField73 = chronology70.minutes();
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(chronology70);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime76.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration79 = null;
        mutableDateTime76.add(readableDuration79, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int83 = mutableDateTime76.get(dateTimeFieldType82);
        java.lang.String str84 = dateTimeFieldType82.getName();
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime74.property(dateTimeFieldType82);
        org.joda.time.DurationField durationField86 = property85.getDurationField();
        boolean boolean87 = dateTimeZone59.equals((java.lang.Object) property85);
        org.joda.time.DateTime dateTime88 = dateMidnight57.toDateTime(dateTimeZone59);
        org.joda.time.MutableDateTime mutableDateTime89 = mutableDateTime39.toMutableDateTime(dateTimeZone59);
        boolean boolean90 = dateTime35.isBefore((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str92 = dateTimeFieldType91.getName();
        java.lang.String str93 = dateTimeFieldType91.toString();
        org.joda.time.DateTime dateTime95 = dateTime35.withField(dateTimeFieldType91, 248);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and dateTime51", (dateTime46.compareTo(dateTime51) == 0) == dateTime46.equals(dateTime51));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 1);
        org.joda.time.LocalDate localDate3 = localDate1.withDayOfYear((int) (byte) 10);
        org.joda.time.LocalDate localDate5 = localDate3.plusWeeks((-292275054));
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra(10);
        int int8 = localDate5.getEra();
        org.joda.time.LocalDate localDate10 = localDate5.plusDays(21);
        org.joda.time.Interval interval11 = localDate10.toInterval();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.secondOfMinute();
        mutableDateTime13.setDate((-1L));
        int int17 = mutableDateTime13.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = mutableDateTime13.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.lang.String str25 = locale24.getDisplayScript();
        java.lang.String str26 = dateTimeZone21.getName((long) 5, locale24);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.lang.String str33 = locale32.getDisplayScript();
        java.lang.String str34 = dateTimeZone29.getName((long) 5, locale32);
        org.joda.time.DateTime dateTime35 = dateTime27.toDateTime(dateTimeZone29);
        mutableDateTime13.setZoneRetainFields(dateTimeZone29);
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now();
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTime dateTime39 = mutableDateTime13.toDateTime(chronology38);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 5);
        int int42 = localDate41.getDayOfMonth();
        org.joda.time.LocalDate localDate44 = localDate41.minusWeeks((int) (byte) 100);
        org.joda.time.DateTime dateTime45 = dateTime39.withFields((org.joda.time.ReadablePartial) localDate41);
        org.joda.time.DateTime dateTime46 = localDate10.toDateTime((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and dateTime45", (mutableDateTime13.compareTo(dateTime45) == 0) == mutableDateTime13.equals(dateTime45));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.joda.time.Interval interval5 = property3.toInterval();
        long long6 = property3.remainder();
        java.lang.String str7 = property3.toString();
        int int8 = property3.get();
        org.joda.time.LocalDateTime localDateTime10 = property3.setCopy(10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (-1), chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.minuteOfHour();
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
        org.joda.time.DateTime.Property property27 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime29 = dateTime21.withYear(0);
        int int30 = dateTime21.getMinuteOfHour();
        long long31 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        int int32 = property3.getDifference((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (-1), chronology37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone41 = dateTimeZone40.toTimeZone();
        org.joda.time.DateTime dateTime42 = localDateTime38.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter35.withChronology(chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (-1), chronology48);
        boolean boolean50 = dateTimeZone45.isLocalDateTimeGap(localDateTime49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (-1), chronology52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.weekyear();
        boolean boolean55 = dateTimeZone45.isLocalDateTimeGap(localDateTime53);
        long long57 = dateTimeZone45.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter35.withZone(dateTimeZone45);
        long long60 = dateTimeZone45.nextTransition((long) (byte) -1);
        long long62 = dateTimeZone45.nextTransition((long) 1969);
        int int64 = dateTimeZone45.getOffset((long) 56);
        org.joda.time.DateTime dateTime65 = dateTime21.withZone(dateTimeZone45);
        org.joda.time.Instant instant66 = dateTime65.toInstant();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime68.set(dateTimeFieldType69, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        mutableDateTime68.add(readablePeriod72, 4);
        int int75 = mutableDateTime68.getMillisOfDay();
        int int76 = mutableDateTime68.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime68.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone80 = dateTimeZone79.toTimeZone();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime((long) (-1), chronology82);
        boolean boolean84 = dateTimeZone79.isLocalDateTimeGap(localDateTime83);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime((long) (-1), chronology86);
        org.joda.time.LocalDateTime.Property property88 = localDateTime87.weekyear();
        boolean boolean89 = dateTimeZone79.isLocalDateTimeGap(localDateTime87);
        boolean boolean91 = dateTimeZone79.isStandardOffset(86399999L);
        org.joda.time.LocalDateTime localDateTime92 = new org.joda.time.LocalDateTime(100L, dateTimeZone79);
        long long96 = dateTimeZone79.convertLocalToUTC((long) 40, true, 43L);
        mutableDateTime68.setZoneRetainFields(dateTimeZone79);
        org.joda.time.DateTime dateTime98 = dateTime65.withZoneRetainFields(dateTimeZone79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime98 and instant66", (dateTime98.compareTo(instant66) == 0) == dateTime98.equals(instant66));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = chronology12.centuries();
        org.joda.time.DateTime dateTime18 = dateTime1.toDateTime(chronology12);
        org.joda.time.Chronology chronology19 = dateTime1.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.minutes();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.DurationField durationField22 = chronology19.hours();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.weekyear();
        org.joda.time.LocalDateTime localDateTime27 = property26.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField28 = property26.getField();
        org.joda.time.DurationField durationField29 = property26.getDurationField();
        long long31 = durationField29.getValueAsLong((long) 2022);
        long long34 = durationField29.getMillis((long) (-101), 33L);
        int int35 = durationField22.compareTo(durationField29);
        int int37 = durationField22.getValue((long) 25);
        org.joda.time.DurationFieldType durationFieldType38 = durationField22.getType();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime40.setTime(100L);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime40.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime45 = property43.add(1970);
        int int46 = mutableDateTime45.getMillisOfSecond();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) (-1), chronology48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        org.joda.time.DateTime dateTime53 = localDateTime49.toDateTime(dateTimeZone51);
        org.joda.time.Chronology chronology54 = dateTime53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.dayOfYear();
        org.joda.time.Chronology chronology56 = chronology54.withUTC();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.clockhourOfDay();
        org.joda.time.DurationField durationField58 = chronology56.centuries();
        org.joda.time.DateTimeField dateTimeField59 = chronology56.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        long long63 = chronology56.add(readablePeriod60, 0L, 86399999);
        mutableDateTime45.setChronology(chronology56);
        org.joda.time.DurationField durationField65 = durationFieldType38.getField(chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField58", (durationField17.compareTo(durationField58) == 0) == durationField17.equals(durationField58));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime2.add((long) '#');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (-1), chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone11);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.DateTime dateTime16 = dateTime13.plus((long) 100);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.util.Calendar calendar19 = dateTime16.toCalendar(locale18);
        int int20 = dateTime16.getMinuteOfHour();
        org.joda.time.DateTime dateTime22 = dateTime16.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime24 = dateTime22.plus((long) (-292275054));
        org.joda.time.DateTime dateTime26 = dateTime22.minusSeconds(1969);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property28 = dateTime22.hourOfDay();
        java.lang.String str29 = property28.toString();
        org.joda.time.DateTime dateTime30 = property28.getDateTime();
        int int31 = dateTime30.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime30", (mutableDateTime2.compareTo(dateTime30) == 0) == mutableDateTime2.equals(dateTime30));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (-1), chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = localDateTime10.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter7.withChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology15.centuries();
        org.joda.time.DateTime dateTime21 = dateTime4.toDateTime(chronology15);
        org.joda.time.Chronology chronology22 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 38, chronology22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(10800014L, chronology22);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.dayOfYear();
        org.joda.time.Chronology chronology36 = chronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfDay();
        org.joda.time.DurationField durationField38 = chronology36.halfdays();
        org.joda.time.DurationFieldType durationFieldType39 = durationField38.getType();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (-1), chronology41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTime dateTime46 = localDateTime42.toDateTime(dateTimeZone44);
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.secondOfDay();
        org.joda.time.Chronology chronology49 = chronology47.withUTC();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.dayOfWeek();
        org.joda.time.DurationField durationField51 = chronology49.seconds();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.DurationField durationField53 = durationFieldType39.getField(chronology49);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime25.toMutableDateTime(chronology49);
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
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) (-1), chronology70);
        boolean boolean72 = dateTimeZone67.isLocalDateTimeGap(localDateTime71);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) (-1), chronology74);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.weekyear();
        boolean boolean77 = dateTimeZone67.isLocalDateTimeGap(localDateTime75);
        long long79 = dateTimeZone67.convertUTCToLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter57.withZone(dateTimeZone67);
        java.util.Locale.Category category81 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale82 = java.util.Locale.getDefault(category81);
        java.util.Locale locale83 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category81, locale83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter80.withLocale(locale83);
        java.util.Locale locale88 = new java.util.Locale("hi!");
        java.lang.String str89 = locale88.getScript();
        java.lang.String str90 = locale88.getDisplayLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter91 = dateTimeFormatter80.withLocale(locale88);
        java.lang.String str92 = locale88.getDisplayLanguage();
        java.lang.String str93 = locale88.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket95 = new org.joda.time.format.DateTimeParserBucket((long) (-1438328), chronology49, locale88, (java.lang.Integer) (-1872));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime54", (dateTime25.compareTo(mutableDateTime54) == 0) == dateTime25.equals(mutableDateTime54));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfYear();
        org.joda.time.Chronology chronology9 = chronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        org.joda.time.DurationFieldType durationFieldType12 = durationField11.getType();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfDay();
        org.joda.time.Chronology chronology22 = chronology20.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfWeek();
        org.joda.time.DurationField durationField24 = chronology22.seconds();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.DurationField durationField26 = durationFieldType12.getField(chronology22);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        java.lang.String str34 = dateTime33.toString();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.plus(readableDuration35);
        org.joda.time.DateTime dateTime38 = dateTime33.minusWeeks(10);
        org.joda.time.DateTime.Property property39 = dateTime33.hourOfDay();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (-1), chronology41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTime dateTime46 = localDateTime42.toDateTime(dateTimeZone44);
        java.lang.String str47 = dateTime46.toString();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.DateTime dateTime49 = dateTime46.plus(readableDuration48);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime51.set(dateTimeFieldType52, (-292275054));
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime51.yearOfEra();
        mutableDateTime51.setYear((int) '#');
        mutableDateTime51.setYear(292278993);
        int int60 = dateTime49.compareTo((org.joda.time.ReadableInstant) mutableDateTime51);
        int int61 = property39.compareTo((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateTime dateTime62 = property39.roundCeilingCopy();
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime64.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration67 = null;
        mutableDateTime64.add(readableDuration67, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType71 = dateTimeFieldType70.getDurationType();
        org.joda.time.DurationFieldType durationFieldType72 = dateTimeFieldType70.getRangeDurationType();
        mutableDateTime64.add(durationFieldType72, (int) (short) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter75 = null;
        org.joda.time.format.DateTimeParser dateTimeParser76 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter75, dateTimeParser76);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime((long) (-1), chronology79);
        org.joda.time.LocalDateTime.Property property81 = localDateTime80.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone83 = dateTimeZone82.toTimeZone();
        org.joda.time.DateTime dateTime84 = localDateTime80.toDateTime(dateTimeZone82);
        org.joda.time.Chronology chronology85 = dateTime84.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter77.withChronology(chronology85);
        org.joda.time.DateTimeField dateTimeField87 = chronology85.minuteOfHour();
        boolean boolean88 = durationFieldType72.isSupported(chronology85);
        org.joda.time.DateTime dateTime89 = dateTime62.withChronology(chronology85);
        org.joda.time.DurationField durationField90 = durationFieldType12.getField(chronology85);
        org.joda.time.DateTimeField dateTimeField91 = chronology85.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField90", (durationField11.compareTo(durationField90) == 0) == durationField11.equals(durationField90));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.halfdayOfDay();
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.DurationField durationField18 = dateTimeField16.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField18, and durationField15", !(durationField15.compareTo(durationField18) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField18.compareTo(durationField15))));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime(dateTimeZone6);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateTime dateTime11 = dateTime8.plus((long) 100);
        org.joda.time.DateTime.Property property12 = dateTime8.millisOfSecond();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 1, chronology14);
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded((long) (byte) 0, 292278993);
        int int19 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDateTime23.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology28.minutes();
        org.joda.time.DurationField durationField31 = chronology28.minutes();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 292278993, chronology28);
        org.joda.time.DateTime dateTime33 = dateTime8.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField34 = chronology28.minuteOfDay();
        java.util.Locale locale35 = java.util.Locale.PRC;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 69, chronology28, locale35, (java.lang.Integer) 33, (int) ' ');
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology28);
        java.lang.String str40 = dateTime39.toString();
        org.joda.time.DateTime dateTime42 = dateTime39.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime44 = dateTime39.minusYears(35);
        org.joda.time.DateTime.Property property45 = dateTime44.secondOfMinute();
        org.joda.time.DateTime dateTime47 = dateTime44.withSecondOfMinute(15);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime49.set(dateTimeFieldType50, (-292275054));
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime49.yearOfEra();
        mutableDateTime49.setYear((int) '#');
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) (-1), chronology57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone61 = dateTimeZone60.toTimeZone();
        org.joda.time.DateTime dateTime62 = localDateTime58.toDateTime(dateTimeZone60);
        int int64 = dateTimeZone60.getOffsetFromLocal((long) (byte) 10);
        long long66 = dateTimeZone60.nextTransition((long) 59);
        mutableDateTime49.setZoneRetainFields(dateTimeZone60);
        long long70 = dateTimeZone60.convertLocalToUTC((-1609459200000L), false);
        java.util.Locale locale72 = java.util.Locale.TAIWAN;
        java.lang.String str73 = locale72.toLanguageTag();
        java.util.Locale locale74 = java.util.Locale.GERMANY;
        java.lang.String str75 = locale72.getDisplayScript(locale74);
        java.util.Set<java.lang.Character> charSet76 = locale72.getExtensionKeys();
        java.lang.String str77 = dateTimeZone60.getName(3692163384000L, locale72);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone80);
        boolean boolean83 = dateTimeZone80.isStandardOffset((long) 2);
        org.joda.time.DateTime dateTime84 = org.joda.time.DateTime.now(dateTimeZone80);
        long long87 = dateTimeZone80.convertLocalToUTC(30L, true);
        long long89 = dateTimeZone60.getMillisKeepLocal(dateTimeZone80, (long) (-358));
        org.joda.time.DateTime dateTime90 = dateTime44.toDateTime(dateTimeZone80);
        org.joda.time.MutableDateTime mutableDateTime91 = new org.joda.time.MutableDateTime(59L, dateTimeZone80);
        org.joda.time.DateTime dateTime92 = new org.joda.time.DateTime(dateTimeZone80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime84", (dateTime39.compareTo(dateTime84) == 0) == dateTime39.equals(dateTime84));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add((long) 100);
        org.joda.time.Chronology chronology3 = null;
        mutableDateTime0.setChronology(chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        long long7 = dateTimeZone5.previousTransition((long) 1);
        mutableDateTime0.setZone(dateTimeZone5);
        int int9 = mutableDateTime0.getSecondOfMinute();
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.util.Calendar calendar12 = mutableDateTime0.toCalendar(locale10);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime0.copy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.Chronology chronology24 = chronology22.withUTC();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology22);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plus(readableDuration26);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.era();
        org.joda.time.DateTime dateTime32 = mutableDateTime0.toDateTime(chronology28);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 1, chronology34);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone38);
        org.joda.time.DateTime dateTime40 = dateTime35.toDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime40.minusYears(7);
        org.joda.time.DateTime.Property property43 = dateTime40.secondOfMinute();
        org.joda.time.DateTime.Property property44 = dateTime40.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight45 = dateTime40.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight46 = dateTime40.toDateMidnight();
        int int47 = dateTime32.compareTo((org.joda.time.ReadableInstant) dateMidnight46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and dateTime40", (dateTime35.compareTo(dateTime40) == 0) == dateTime35.equals(dateTime40));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.setDate((-1L));
        int int5 = mutableDateTime1.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime1.isSupported(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = dateTimeZone9.getName((long) 5, locale12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayScript();
        java.lang.String str22 = dateTimeZone17.getName((long) 5, locale20);
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime(dateTimeZone17);
        mutableDateTime1.setZoneRetainFields(dateTimeZone17);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime1.toDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime27", (mutableDateTime1.compareTo(dateTime27) == 0) == mutableDateTime1.equals(dateTime27));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusYears(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withFieldAdded(durationFieldType9, 1439);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        java.lang.Object obj14 = mutableDateTime13.clone();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.weekyear();
        mutableDateTime13.setMillis((long) 292278993);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime19.set(dateTimeFieldType20, (-292275054));
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime19.yearOfEra();
        mutableDateTime19.setYear((int) '#');
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = localDateTime28.toDateTime(dateTimeZone30);
        int int34 = dateTimeZone30.getOffsetFromLocal((long) (byte) 10);
        long long36 = dateTimeZone30.nextTransition((long) 59);
        mutableDateTime19.setZoneRetainFields(dateTimeZone30);
        long long40 = dateTimeZone30.convertLocalToUTC((-1609459200000L), false);
        java.util.Locale locale42 = java.util.Locale.TAIWAN;
        java.lang.String str43 = locale42.toLanguageTag();
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        java.lang.String str45 = locale42.getDisplayScript(locale44);
        java.util.Set<java.lang.Character> charSet46 = locale42.getExtensionKeys();
        java.lang.String str47 = dateTimeZone30.getName(3692163384000L, locale42);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone50);
        boolean boolean53 = dateTimeZone50.isStandardOffset((long) 2);
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(dateTimeZone50);
        long long57 = dateTimeZone50.convertLocalToUTC(30L, true);
        long long59 = dateTimeZone30.getMillisKeepLocal(dateTimeZone50, (long) (-358));
        mutableDateTime13.setZoneRetainFields(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime63 = localDateTime11.toDateTime(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and mutableDateTime61", (dateTime54.compareTo(mutableDateTime61) == 0) == dateTime54.equals(mutableDateTime61));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime7.add(readableDuration9, 0);
        mutableDateTime7.add(7L);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property16 = localDate14.property(dateTimeFieldType15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.year();
        boolean boolean18 = localDate14.isSupported(dateTimeFieldType17);
        org.joda.time.LocalDate.Property property19 = localDate14.era();
        org.joda.time.LocalDate.Property property20 = localDate14.era();
        org.joda.time.LocalDate localDate22 = localDate14.withYearOfCentury((int) (byte) 0);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.era();
        org.joda.time.DateTime dateTime25 = mutableDateTime7.toDateTime(chronology23);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime25", (mutableDateTime7.compareTo(dateTime25) == 0) == mutableDateTime7.equals(dateTime25));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime2.set(dateTimeFieldType3, (-292275054));
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfEra();
        mutableDateTime2.setYear((int) '#');
        mutableDateTime2.setYear(292278993);
        mutableDateTime2.setMillisOfSecond(59);
        mutableDateTime2.addMillis(3);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        mutableDateTime15.addMillis((-292275054));
        java.lang.String str18 = mutableDateTime15.toString();
        mutableDateTime15.addMonths(47);
        org.joda.time.Chronology chronology21 = mutableDateTime15.getChronology();
        org.joda.time.DateTime dateTime22 = mutableDateTime2.toDateTime(chronology21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property25 = localDate23.property(dateTimeFieldType24);
        java.util.Locale locale29 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate30 = property25.setCopy("365", locale29);
        org.joda.time.LocalDate localDate32 = property25.setCopy((int) 'a');
        org.joda.time.LocalDate localDate33 = property25.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = localDate33.toDateTimeAtMidnight(dateTimeZone35);
        mutableDateTime2.setZone(dateTimeZone35);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(1645456379395L, dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime22", (mutableDateTime2.compareTo(dateTime22) == 0) == mutableDateTime2.equals(dateTime22));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.clockhourOfDay();
        org.joda.time.DurationField durationField17 = chronology10.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField17, and durationField15", !(durationField15.compareTo(durationField17) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField17.compareTo(durationField15))));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str8 = dateTimeZone0.getShortName(0L, locale7);
        int int10 = dateTimeZone0.getOffsetFromLocal((long) 25);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property14 = localDate12.property(dateTimeFieldType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.year();
        boolean boolean16 = localDate12.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate12.era();
        org.joda.time.LocalDate.Property property18 = localDate12.dayOfMonth();
        org.joda.time.LocalDate localDate20 = localDate12.minusWeeks(2000);
        int int22 = localDate12.getValue((int) (short) 0);
        org.joda.time.LocalDate localDate24 = localDate12.plusDays(1439);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDate12.toDateTimeAtStartOfDay(dateTimeZone26);
        int int31 = dateTimeZone26.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime11.toMutableDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = dateTime11.plusSeconds(99);
        boolean boolean35 = dateTime34.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime27", (dateTime11.compareTo(mutableDateTime27) == 0) == dateTime11.equals(mutableDateTime27));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfMinute();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        int int7 = mutableDateTime1.getHourOfDay();
        org.joda.time.Instant instant8 = mutableDateTime1.toInstant();
        mutableDateTime1.setTime((long) 54681854);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant8", (mutableDateTime4.compareTo(instant8) == 0) == mutableDateTime4.equals(instant8));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        boolean boolean6 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime4.toMutableDateTime(dateTimeZone8);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.era();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        mutableDateTime17.setZone(dateTimeZone19);
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime13.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime17", (mutableDateTime1.compareTo(mutableDateTime17) == 0) == mutableDateTime1.equals(mutableDateTime17));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusYears(2);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.dayOfYear();
        org.joda.time.Chronology chronology31 = chronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.DateTime dateTime33 = dateTime12.toDateTime(chronology31);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology31.add(readablePeriod34, 0L, (-23375));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime33", (dateTime9.compareTo(dateTime33) == 0) == dateTime9.equals(dateTime33));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DateTime dateTime22 = dateTime12.withEarlierOffsetAtOverlap();
        long long23 = dateTime12.getMillis();
        org.joda.time.DateTime dateTime25 = dateTime12.minusMinutes(2022);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(30);
        org.joda.time.DateTime dateTime28 = dateTime25.withZone(dateTimeZone27);
        java.lang.String str30 = dateTimeZone27.getShortName(47L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime28", (dateTime25.compareTo(dateTime28) == 0) == dateTime25.equals(dateTime28));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfMinute();
        org.joda.time.DateTime.Property property11 = dateTime7.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight13 = dateTime7.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long17 = dateTimeZone15.previousTransition((long) 1);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (-1), chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.secondOfDay();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        org.joda.time.DurationField durationField29 = chronology26.minutes();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime32.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutableDateTime32.add(readableDuration35, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int39 = mutableDateTime32.get(dateTimeFieldType38);
        java.lang.String str40 = dateTimeFieldType38.getName();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime30.property(dateTimeFieldType38);
        org.joda.time.DurationField durationField42 = property41.getDurationField();
        boolean boolean43 = dateTimeZone15.equals((java.lang.Object) property41);
        org.joda.time.DateTime dateTime44 = dateMidnight13.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (-1), chronology49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTime dateTime54 = localDateTime50.toDateTime(dateTimeZone52);
        java.lang.String str55 = dateTime54.toString();
        org.joda.time.DateTime dateTime57 = dateTime54.plus((long) 100);
        org.joda.time.DateTime.Property property58 = dateTime57.yearOfCentury();
        java.util.Locale locale59 = java.util.Locale.GERMANY;
        java.util.Calendar calendar60 = dateTime57.toCalendar(locale59);
        java.util.Locale locale61 = java.util.Locale.TAIWAN;
        java.lang.String str62 = locale61.toLanguageTag();
        java.lang.String str63 = locale59.getDisplayCountry(locale61);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) 1970, chronology47, locale59, (java.lang.Integer) 38);
        org.joda.time.format.DateTimePrinter dateTimePrinter66 = null;
        org.joda.time.format.DateTimeParser dateTimeParser67 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter66, dateTimeParser67);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) (-1), chronology70);
        org.joda.time.LocalDateTime.Property property72 = localDateTime71.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone74 = dateTimeZone73.toTimeZone();
        org.joda.time.DateTime dateTime75 = localDateTime71.toDateTime(dateTimeZone73);
        org.joda.time.Chronology chronology76 = dateTime75.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter68.withChronology(chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.monthOfYear();
        org.joda.time.DateTimeField dateTimeField79 = chronology76.weekyearOfCentury();
        dateTimeParserBucket65.saveField(dateTimeField79, 19);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.DateTimeField dateTimeField84 = dateTimeFieldType82.getField(chronology83);
        dateTimeParserBucket65.saveField(dateTimeFieldType82, 69);
        java.util.Locale locale87 = dateTimeParserBucket65.getLocale();
        dateTimeParserBucket65.setOffset((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone90 = dateTimeParserBucket65.getZone();
        org.joda.time.MutableDateTime mutableDateTime91 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone90);
        long long93 = dateTimeZone15.getMillisKeepLocal(dateTimeZone90, (-203698030L));
        org.joda.time.DateTime dateTime94 = org.joda.time.DateTime.now(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        org.joda.time.DateTime.Property property12 = dateTime6.hourOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = localDateTime15.toDateTime(dateTimeZone17);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime24.set(dateTimeFieldType25, (-292275054));
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.yearOfEra();
        mutableDateTime24.setYear((int) '#');
        mutableDateTime24.setYear(292278993);
        int int33 = dateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        int int34 = property12.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (-1), chronology38);
        boolean boolean40 = dateTimeZone35.isLocalDateTimeGap(localDateTime39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) (-1), chronology42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.weekyear();
        boolean boolean45 = dateTimeZone35.isLocalDateTimeGap(localDateTime43);
        boolean boolean47 = dateTimeZone35.isStandardOffset(86399999L);
        mutableDateTime24.setZone(dateTimeZone35);
        org.joda.time.ReadableDuration readableDuration49 = null;
        mutableDateTime24.add(readableDuration49, 19);
        mutableDateTime24.setDate((long) 68);
        long long54 = mutableDateTime24.getMillis();
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((long) (short) -1);
        long long57 = mutableDateTime56.getMillis();
        java.lang.Object obj58 = mutableDateTime56.clone();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) (-1), chronology60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone64 = dateTimeZone63.toTimeZone();
        org.joda.time.DateTime dateTime65 = localDateTime61.toDateTime(dateTimeZone63);
        int int67 = dateTimeZone63.getOffsetFromLocal((long) (byte) 10);
        long long69 = dateTimeZone63.nextTransition((long) 59);
        mutableDateTime56.setZone(dateTimeZone63);
        int int71 = mutableDateTime56.getYearOfCentury();
        java.lang.String str73 = mutableDateTime56.toString("00:00:00.005");
        mutableDateTime56.addYears(999);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(56, (int) '#');
        mutableDateTime56.setZoneRetainFields(dateTimeZone78);
        mutableDateTime24.setZone(dateTimeZone78);
        mutableDateTime24.setWeekyear(86399999);
        org.joda.time.MutableDateTime mutableDateTime84 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime84.set(dateTimeFieldType85, (-292275054));
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime84.yearOfEra();
        mutableDateTime84.setYear((int) '#');
        mutableDateTime84.setYear(292278993);
        mutableDateTime84.setMillisOfSecond(59);
        org.joda.time.MutableDateTime mutableDateTime95 = mutableDateTime84.copy();
        org.joda.time.DateTime dateTime96 = mutableDateTime95.toDateTime();
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) mutableDateTime95);
        org.joda.time.DateTimeField dateTimeField98 = mutableDateTime95.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and mutableDateTime84", (mutableDateTime24.compareTo(mutableDateTime84) == 0) == mutableDateTime24.equals(mutableDateTime84));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add((long) 100);
        org.joda.time.Chronology chronology3 = null;
        mutableDateTime0.setChronology(chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        long long7 = dateTimeZone5.previousTransition((long) 1);
        mutableDateTime0.setZone(dateTimeZone5);
        int int9 = mutableDateTime0.getSecondOfMinute();
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime0.add(readableDuration10, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime0.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime0.copy();
        mutableDateTime0.addMillis(2);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        mutableDateTime19.add((long) '#');
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology25 = null;
        mutableDateTime24.setChronology(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        mutableDateTime24.setRounding(dateTimeField29, (int) (short) 1);
        mutableDateTime19.setDate((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime19.setDayOfWeek(5);
        mutableDateTime19.setDayOfWeek((int) (short) 1);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime19.centuryOfEra();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime19.yearOfEra();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (-1), chronology40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        org.joda.time.DateTime dateTime45 = localDateTime41.toDateTime(dateTimeZone43);
        java.lang.String str46 = dateTime45.toString();
        org.joda.time.DateTime dateTime48 = dateTime45.plus((long) 100);
        org.joda.time.DateTime.Property property49 = dateTime48.yearOfCentury();
        java.util.Locale locale50 = java.util.Locale.GERMANY;
        java.util.Calendar calendar51 = dateTime48.toCalendar(locale50);
        org.joda.time.DateTime.Property property52 = dateTime48.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime53 = dateTime48.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusMillis((int) 'a');
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.monthOfYear();
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(chronology56);
        mutableDateTime19.setChronology(chronology56);
        org.joda.time.format.DateTimePrinter dateTimePrinter60 = null;
        org.joda.time.format.DateTimeParser dateTimeParser61 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter60, dateTimeParser61);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) (-1), chronology64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.DateTime dateTime69 = localDateTime65.toDateTime(dateTimeZone67);
        org.joda.time.Chronology chronology70 = dateTime69.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter62.withChronology(chronology70);
        org.joda.time.DateTimeField dateTimeField72 = chronology70.monthOfYear();
        org.joda.time.DurationField durationField73 = chronology70.weekyears();
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        long long77 = chronology70.add(readablePeriod74, (long) 575, 1970);
        org.joda.time.DateTimeField dateTimeField78 = chronology70.millisOfDay();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime19, chronology70);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime19.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime82 = property81.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime82", (mutableDateTime0.compareTo(mutableDateTime82) == 0) == mutableDateTime0.equals(mutableDateTime82));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        boolean boolean8 = dateTimeZone3.isLocalDateTimeGap(localDateTime7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekyear();
        boolean boolean13 = dateTimeZone3.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone3.convertUTCToLocal(0L);
        java.lang.String str17 = dateTimeZone3.getNameKey((long) 575);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone3);
        boolean boolean19 = dateTimeZone2.equals((java.lang.Object) dateTimeZone3);
        boolean boolean20 = dateTimeZone2.isFixed();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekyear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusYears(0);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withPeriodAdded(readablePeriod29, 33);
        int int32 = localDateTime31.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.plusMonths(49);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusYears(33);
        boolean boolean37 = dateTimeZone2.isLocalDateTimeGap(localDateTime34);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone40);
        java.util.Locale locale43 = java.util.Locale.ENGLISH;
        java.lang.String str44 = locale43.getDisplayScript();
        java.lang.String str45 = dateTimeZone40.getName((long) 5, locale43);
        java.lang.String str46 = locale43.getDisplayCountry();
        java.lang.String str47 = dateTimeZone2.getName((-9223372017176400001L), locale43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime41", (dateTime18.compareTo(mutableDateTime41) == 0) == dateTime18.equals(mutableDateTime41));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-1), chronology3);
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime8);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusSeconds((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plus(readablePeriod13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 1, chronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime17.toDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime22.minusYears(7);
        org.joda.time.DateTime.Property property25 = dateTime22.secondOfMinute();
        org.joda.time.DateTime.Property property26 = dateTime22.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight27 = dateTime22.toDateMidnight();
        org.joda.time.DateTime.Property property28 = dateTime22.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        boolean boolean31 = dateTime22.isSupported(dateTimeFieldType29);
        boolean boolean32 = localDateTime12.isSupported(dateTimeFieldType29);
        java.util.Date date33 = localDateTime12.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime22", (dateTime17.compareTo(dateTime22) == 0) == dateTime17.equals(dateTime22));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = dateTimeZone1.getName((long) 5, locale4);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = dateTimeZone9.getName((long) 5, locale12);
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.getDateTime();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readableDuration18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime22 = dateTime17.withFieldAdded(durationFieldType20, 53);
        org.joda.time.DateTime dateTime23 = dateTime22.withLaterOffsetAtOverlap();
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        java.lang.String str25 = dateTime23.toString();
        org.joda.time.DateTime.Property property26 = dateTime23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime23.minusSeconds(41);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime23.toDateTime(chronology29);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime34 = localTime32.minusSeconds((int) (short) 10);
        int int35 = localTime32.getMinuteOfHour();
        org.joda.time.LocalTime.Property property36 = localTime32.hourOfDay();
        org.joda.time.LocalTime localTime37 = property36.withMaximumValue();
        boolean boolean38 = property36.isLeap();
        java.util.Locale locale42 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.lang.String str43 = property36.getAsShortText(locale42);
        org.joda.time.LocalTime localTime44 = property36.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime46.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration49 = null;
        mutableDateTime46.add(readableDuration49, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int53 = mutableDateTime46.get(dateTimeFieldType52);
        java.lang.String str54 = dateTimeFieldType52.getName();
        org.joda.time.LocalTime.Property property55 = localTime44.property(dateTimeFieldType52);
        int int56 = dateTime23.get(dateTimeFieldType52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime30", (dateTime23.compareTo(dateTime30) == 0) == dateTime23.equals(dateTime30));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime1.setTime((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.parse("999");
        mutableDateTime7.setSecondOfDay((int) (short) 10);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundCeiling();
        org.joda.time.Chronology chronology12 = mutableDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.DurationField durationField14 = chronology12.hours();
        org.joda.time.DurationField durationField15 = chronology12.eras();
        mutableDateTime1.setChronology(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField15", Math.signum(durationField14.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField14)));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        org.joda.time.DateTime.Property property12 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime14 = dateTime6.withYear(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.Chronology chronology24 = chronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.clockhourOfDay();
        org.joda.time.DurationField durationField26 = chronology24.halfdays();
        org.joda.time.DurationFieldType durationFieldType27 = durationField26.getType();
        org.joda.time.DurationFieldType durationFieldType28 = durationField26.getType();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (-1), chronology30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone34 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime35 = localDateTime31.toDateTime(dateTimeZone33);
        java.lang.String str36 = dateTime35.toString();
        org.joda.time.DateTime dateTime38 = dateTime35.plus((long) 100);
        org.joda.time.DateTime.Property property39 = dateTime38.yearOfCentury();
        java.util.Locale locale40 = java.util.Locale.GERMANY;
        java.util.Calendar calendar41 = dateTime38.toCalendar(locale40);
        int int42 = dateTime38.getMinuteOfHour();
        org.joda.time.DateTime dateTime44 = dateTime38.withYearOfEra((int) 'u');
        org.joda.time.DateTime dateTime46 = dateTime44.plus((long) (-292275054));
        org.joda.time.DateTime.Property property47 = dateTime44.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField49 = mutableDateTime48.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType51 = dateTimeFieldType50.getDurationType();
        mutableDateTime48.add(durationFieldType51, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter54 = null;
        org.joda.time.format.DateTimeParser dateTimeParser55 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter54, dateTimeParser55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) (-1), chronology58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone62 = dateTimeZone61.toTimeZone();
        org.joda.time.DateTime dateTime63 = localDateTime59.toDateTime(dateTimeZone61);
        org.joda.time.Chronology chronology64 = dateTime63.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter56.withChronology(chronology64);
        org.joda.time.DateTimeField dateTimeField66 = chronology64.monthOfYear();
        org.joda.time.DurationField durationField67 = durationFieldType51.getField(chronology64);
        org.joda.time.DateTime dateTime68 = dateTime44.toDateTime(chronology64);
        boolean boolean69 = durationFieldType28.isSupported(chronology64);
        org.joda.time.DateTime dateTime71 = dateTime6.withFieldAdded(durationFieldType28, 906);
        java.lang.String str72 = durationFieldType28.getName();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) (-1), chronology74);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone78 = dateTimeZone77.toTimeZone();
        org.joda.time.DateTime dateTime79 = localDateTime75.toDateTime(dateTimeZone77);
        org.joda.time.Chronology chronology80 = dateTime79.getChronology();
        org.joda.time.DurationField durationField81 = chronology80.hours();
        org.joda.time.DateTimeField dateTimeField82 = chronology80.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField83 = chronology80.minuteOfDay();
        long long87 = chronology80.add((long) 52, 999L, 54);
        org.joda.time.DateTimeField dateTimeField88 = chronology80.monthOfYear();
        org.joda.time.DurationField durationField89 = durationFieldType28.getField(chronology80);
        org.joda.time.DateTimeField dateTimeField90 = chronology80.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField89", (durationField26.compareTo(durationField89) == 0) == durationField26.equals(durationField89));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfMinute();
        org.joda.time.DateTime.Property property11 = dateTime7.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight13 = dateTime7.toDateMidnight();
        org.joda.time.DateTime dateTime14 = dateMidnight13.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime14.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        mutableDateTime1.setMillisOfDay(10);
        mutableDateTime1.setMillisOfSecond((int) (short) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.dayOfYear();
        mutableDateTime1.setMillisOfDay(1969);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.LocalDate localDate11 = dateTime10.toLocalDate();
        org.joda.time.DateTime.Property property12 = dateTime10.minuteOfDay();
        int int13 = dateTime10.getYear();
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendFractionOfSecond(33, (int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendTimeZoneShortName(strMap20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder21.appendYear((int) (short) 1, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder24.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder24.appendLiteral("Mon");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendHourOfDay(24);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendShortText(dateTimeFieldType30);
        int int32 = dateTime10.get(dateTimeFieldType30);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property35 = localDate33.property(dateTimeFieldType34);
        java.util.Locale locale39 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate40 = property35.setCopy("365", locale39);
        org.joda.time.LocalDate localDate42 = property35.setCopy((int) 'a');
        int int43 = localDate42.getWeekyear();
        org.joda.time.Chronology chronology44 = localDate42.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.weekyears();
        org.joda.time.DurationField durationField46 = chronology44.years();
        boolean boolean47 = dateTimeFieldType30.isSupported(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField45 and durationField46", (durationField45.compareTo(durationField46) == 0) == durationField45.equals(durationField46));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime6 = localTime4.minusSeconds((int) (short) 10);
        int int7 = localTime4.getMinuteOfHour();
        org.joda.time.LocalTime.Property property8 = localTime4.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMaximumValue();
        org.joda.time.DateTime dateTime10 = localTime9.toDateTimeToday();
        long long11 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime.Property property13 = dateTime10.property(dateTimeFieldType12);
        org.joda.time.DateTime dateTime14 = property13.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        java.lang.String str17 = dateTime14.toString();
        org.joda.time.DateTime dateTime19 = dateTime14.withYear(4);
        org.joda.time.Instant instant20 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime22 = dateTime14.plus(3600176L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant20", (dateTime14.compareTo(instant20) == 0) == dateTime14.equals(instant20));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        long long22 = dateTimeZone20.previousTransition((long) 1);
        org.joda.time.DateTime dateTime23 = dateTime12.withZone(dateTimeZone20);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (-1), chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDateTime29.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter26.withChronology(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.monthOfYear();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.DurationField durationField39 = chronology34.eras();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime23.toMutableDateTime(chronology34);
        org.joda.time.DurationField durationField41 = chronology34.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField41, and durationField39", !(durationField39.compareTo(durationField41) == 0) || (Math.signum(durationField39.compareTo(durationField39)) == Math.signum(durationField41.compareTo(durationField39))));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds((int) (short) 10);
        int int5 = localTime2.getMinuteOfHour();
        org.joda.time.LocalTime.Property property6 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime7 = property6.withMaximumValue();
        boolean boolean8 = property6.isLeap();
        org.joda.time.LocalTime localTime9 = property6.roundFloorCopy();
        org.joda.time.LocalTime.Property property10 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime12 = property10.addNoWrapToCopy((int) (short) 100);
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, 3);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.months();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        java.util.Locale locale23 = new java.util.Locale("", "1969-12-31T23:59:59.999Z", "1969-12-31T23:59:59.999Z");
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str26 = locale24.getDisplayCountry();
        java.lang.String str27 = locale23.getDisplayScript(locale24);
        java.lang.String str28 = locale23.getDisplayName();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 67, chronology17, locale23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = mutableDateTime1.get(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime16 = localTime14.minusSeconds((int) (short) 10);
        int int17 = localTime14.getMinuteOfHour();
        org.joda.time.LocalTime.Property property18 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime19 = property18.withMaximumValue();
        boolean boolean20 = property18.isLeap();
        org.joda.time.LocalTime localTime21 = property18.roundFloorCopy();
        org.joda.time.LocalTime.Property property22 = localTime21.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime24.set(dateTimeFieldType25, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime24.add(readablePeriod28, 4);
        int int31 = mutableDateTime24.getMillisOfDay();
        long long32 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime1.addMonths(5);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime1.add(readablePeriod36, (int) 'u');
        mutableDateTime1.setMillisOfSecond(199);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime44 = localTime42.minusSeconds((int) (short) 10);
        int int45 = localTime42.getMinuteOfHour();
        org.joda.time.LocalTime.Property property46 = localTime42.hourOfDay();
        org.joda.time.LocalTime localTime47 = property46.withMaximumValue();
        boolean boolean48 = property46.isLeap();
        org.joda.time.LocalTime localTime49 = property46.roundFloorCopy();
        org.joda.time.LocalTime.Property property50 = localTime49.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime52.set(dateTimeFieldType53, (-292275054));
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        mutableDateTime52.add(readablePeriod56, 4);
        int int59 = mutableDateTime52.getMillisOfDay();
        long long60 = property50.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.Chronology chronology61 = mutableDateTime52.getChronology();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone63 = dateTimeZone62.toTimeZone();
        long long67 = dateTimeZone62.convertLocalToUTC(10L, false, (long) 3);
        java.lang.String str69 = dateTimeZone62.getName((long) 2022);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone71 = dateTimeZone70.toTimeZone();
        long long75 = dateTimeZone70.convertLocalToUTC(10L, false, (long) 3);
        int int77 = dateTimeZone70.getOffsetFromLocal((long) (byte) 0);
        long long79 = dateTimeZone62.getMillisKeepLocal(dateTimeZone70, 31536000000L);
        mutableDateTime52.setZoneRetainFields(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(dateTimeZone70);
        mutableDateTime1.setZone(dateTimeZone70);
        mutableDateTime1.addYears(2081);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime81", (mutableDateTime11.compareTo(mutableDateTime81) == 0) == mutableDateTime11.equals(mutableDateTime81));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology10.add(readablePeriod16, (-107999990L), 2922750);
        org.joda.time.DateTimeZone dateTimeZone20 = chronology10.getZone();
        org.joda.time.DurationField durationField21 = chronology10.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField21, and durationField15", !(durationField15.compareTo(durationField21) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField21.compareTo(durationField15))));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withYearOfEra((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        boolean boolean12 = dateTimeZone7.isLocalDateTimeGap(localDateTime11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        boolean boolean17 = dateTimeZone7.isLocalDateTimeGap(localDateTime15);
        boolean boolean19 = dateTimeZone7.isStandardOffset(86399999L);
        long long23 = dateTimeZone7.convertLocalToUTC((long) 35, true, 2022L);
        org.joda.time.DateTime dateTime24 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime26 = dateTime24.plusSeconds(517200);
        org.joda.time.DateTime.Property property27 = dateTime24.monthOfYear();
        org.joda.time.DateTime dateTime29 = dateTime24.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        boolean boolean35 = dateTimeZone30.isLocalDateTimeGap(localDateTime34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.plusMillis(99);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusDays(6);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) 'a');
        org.joda.time.DateTime dateTime42 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (-1), chronology45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.weekyear();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusMinutes(292278993);
        org.joda.time.LocalDateTime.Property property52 = localDateTime46.yearOfEra();
        org.joda.time.LocalDateTime.Property property53 = localDateTime46.dayOfYear();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime46.minusHours(888);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.year();
        org.joda.time.Chronology chronology57 = localDateTime55.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.dayOfYear();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.clockhourOfHalfday();
        boolean boolean60 = durationFieldType43.isSupported(chronology57);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime62.set(dateTimeFieldType63, (-292275054));
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime62.yearOfEra();
        mutableDateTime62.setYear((int) '#');
        mutableDateTime62.setYear(292278993);
        mutableDateTime62.setMillisOfSecond(59);
        mutableDateTime62.addMillis(3);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime62.dayOfWeek();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime62.weekyear();
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime62.copy();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime79.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration82 = null;
        mutableDateTime79.add(readableDuration82, (int) (short) 100);
        int int85 = mutableDateTime79.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(56, (int) '#');
        mutableDateTime79.setZoneRetainFields(dateTimeZone88);
        mutableDateTime77.setZoneRetainFields(dateTimeZone88);
        org.joda.time.Chronology chronology91 = chronology57.withZone(dateTimeZone88);
        org.joda.time.DateTime dateTime92 = dateTime42.toDateTime(chronology57);
        org.joda.time.DateTimeField dateTimeField93 = chronology57.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime92", (dateTime42.compareTo(dateTime92) == 0) == dateTime42.equals(dateTime92));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (-1), chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTime dateTime7 = localDateTime3.toDateTime(dateTimeZone5);
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTime dateTime10 = dateTime7.plus((long) 100);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        int int14 = dateTime13.getDayOfMonth();
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.lang.String str19 = locale16.getDisplayVariant(locale18);
        java.lang.String str20 = dateTime13.toString("365", locale18);
        org.joda.time.DateTime dateTime22 = dateTime13.plusMonths(1969);
        org.joda.time.DateTime dateTime23 = dateTime13.withLaterOffsetAtOverlap();
        java.lang.String str24 = dateTime23.toString();
        org.joda.time.DateTime.Property property25 = dateTime23.era();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.minus(readablePeriod26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime23.minus(readablePeriod28);
        java.lang.String str31 = dateTime29.toString("+00:00");
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = null;
        org.joda.time.format.DateTimeParser dateTimeParser35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter34, dateTimeParser35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) (-1), chronology38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone42 = dateTimeZone41.toTimeZone();
        org.joda.time.DateTime dateTime43 = localDateTime39.toDateTime(dateTimeZone41);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter36.withChronology(chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.monthOfYear();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now(chronology44);
        org.joda.time.DateTimeField dateTimeField48 = chronology44.weekOfWeekyear();
        org.joda.time.DurationField durationField49 = chronology44.centuries();
        org.joda.time.DateTime dateTime50 = dateTime33.toDateTime(chronology44);
        org.joda.time.Chronology chronology51 = dateTime33.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.millis();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime29.toMutableDateTime(chronology51);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology55);
        org.joda.time.format.DateTimePrinter dateTimePrinter57 = null;
        org.joda.time.format.DateTimeParser dateTimeParser58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter57, dateTimeParser58);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) (-1), chronology61);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone65 = dateTimeZone64.toTimeZone();
        org.joda.time.DateTime dateTime66 = localDateTime62.toDateTime(dateTimeZone64);
        org.joda.time.Chronology chronology67 = dateTime66.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter59.withChronology(chronology67);
        org.joda.time.DateTimeField dateTimeField69 = chronology67.monthOfYear();
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now(chronology67);
        org.joda.time.DateTimeField dateTimeField71 = chronology67.weekOfWeekyear();
        org.joda.time.DurationField durationField72 = chronology67.centuries();
        org.joda.time.DateTime dateTime73 = dateTime56.toDateTime(chronology67);
        org.joda.time.Chronology chronology74 = dateTime56.getChronology();
        org.joda.time.Chronology chronology75 = chronology74.withUTC();
        mutableDateTime54.setChronology(chronology75);
        org.joda.time.LocalTime localTime77 = new org.joda.time.LocalTime(315501900365L, chronology75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime54", (dateTime10.compareTo(mutableDateTime54) == 0) == dateTime10.equals(mutableDateTime54));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        java.lang.String[] strArray15 = new java.lang.String[] { "1970-01-01T00:00:00.099Z", "dayOfWeek", "2022-02-21T15:05:43.974Z", "1972-10-01", "java.io.IOException: hi!", "zh_TW", "2022-02-21T15:05:43.974Z", "DurationField[minutes]", "5", "999", "2022-02-21T15:06:31.589+00:00:00.003", "2022-02-18T05:55:19.904+00:00:00.003", "secondOfDay", "1970-01-01T00:00:00.002+00:00:00.003", "italiano" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (-1), chronology19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime24 = localDateTime20.toDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.clockhourOfDay();
        org.joda.time.DurationField durationField29 = chronology27.halfdays();
        org.joda.time.DurationFieldType durationFieldType30 = durationField29.getType();
        org.joda.time.DurationFieldType durationFieldType31 = durationField29.getType();
        boolean boolean32 = strSet16.equals((java.lang.Object) durationFieldType31);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.secondOfMinute();
        mutableDateTime35.setTime((org.joda.time.ReadableInstant) mutableDateTime38);
        boolean boolean41 = mutableDateTime38.isBeforeNow();
        mutableDateTime38.setMinuteOfDay(7);
        mutableDateTime38.setWeekyear((int) (byte) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter46 = null;
        org.joda.time.format.DateTimeParser dateTimeParser47 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter46, dateTimeParser47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (-1), chronology50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone54 = dateTimeZone53.toTimeZone();
        org.joda.time.DateTime dateTime55 = localDateTime51.toDateTime(dateTimeZone53);
        org.joda.time.Chronology chronology56 = dateTime55.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter48.withChronology(chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.monthOfYear();
        org.joda.time.DateTimeField dateTimeField59 = chronology56.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime38.toMutableDateTime(chronology56);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(45L, chronology56);
        org.joda.time.DurationField durationField63 = durationFieldType31.getField(chronology56);
        org.joda.time.DateTimeField dateTimeField64 = chronology56.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField63", (durationField29.compareTo(durationField63) == 0) == durationField29.equals(durationField63));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addWeeks(33);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property12 = localDate10.property(dateTimeFieldType11);
        java.util.Locale locale16 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate17 = property12.setCopy("365", locale16);
        org.joda.time.LocalDate localDate19 = property12.addToCopy(59);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTime dateTime21 = mutableDateTime1.toDateTime(chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime21", (mutableDateTime1.compareTo(dateTime21) == 0) == mutableDateTime1.equals(dateTime21));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (-1), chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter5.withChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.monthOfYear();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = chronology13.centuries();
        org.joda.time.DateTime dateTime19 = dateTime2.toDateTime(chronology13);
        org.joda.time.Chronology chronology20 = dateTime2.getChronology();
        org.joda.time.Chronology chronology21 = chronology20.withUTC();
        org.joda.time.DurationField durationField22 = chronology21.days();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(4906L, chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime23", (dateTime2.compareTo(mutableDateTime23) == 0) == dateTime2.equals(mutableDateTime23));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusYears(2);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) (-1), chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDateTime24.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.dayOfYear();
        org.joda.time.Chronology chronology31 = chronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.DateTime dateTime33 = dateTime12.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime33", (dateTime9.compareTo(dateTime33) == 0) == dateTime9.equals(dateTime33));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addWeeks(33);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property12 = localDate10.property(dateTimeFieldType11);
        java.util.Locale locale16 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate17 = property12.setCopy("365", locale16);
        org.joda.time.LocalDate localDate19 = property12.addToCopy(59);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTime dateTime21 = mutableDateTime1.toDateTime(chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.minuteOfHour();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone27);
        java.lang.String str30 = dateTime29.toString();
        org.joda.time.DateTime dateTime32 = dateTime29.plus((long) 100);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Calendar calendar35 = dateTime32.toCalendar(locale34);
        java.util.Locale locale36 = locale34.stripExtensions();
        int int37 = property22.getMaximumTextLength(locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime21", (mutableDateTime1.compareTo(dateTime21) == 0) == mutableDateTime1.equals(dateTime21));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology7.eras();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology7.add(readablePeriod11, 189302400001L, 21);
        org.joda.time.DurationField durationField15 = chronology7.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField15, and durationField10", !(durationField10.compareTo(durationField15) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField15.compareTo(durationField10))));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        org.joda.time.DateTime.Property property12 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime14 = dateTime6.withYear(0);
        int int15 = dateTime6.getMinuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime17.set(dateTimeFieldType18, (-292275054));
        java.lang.String str21 = dateTimeFieldType18.toString();
        org.joda.time.DateTime dateTime23 = dateTime6.withField(dateTimeFieldType18, 45);
        org.joda.time.Instant instant24 = dateTime6.toInstant();
        boolean boolean26 = dateTime6.isEqual((long) 54696);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant24", (dateTime6.compareTo(instant24) == 0) == dateTime6.equals(instant24));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.setDate((-1L));
        int int5 = mutableDateTime1.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime1.isSupported(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = dateTimeZone9.getName((long) 5, locale12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayScript();
        java.lang.String str22 = dateTimeZone17.getName((long) 5, locale20);
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime(dateTimeZone17);
        mutableDateTime1.setZoneRetainFields(dateTimeZone17);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime1.toDateTime(chronology26);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 5);
        int int30 = localDate29.getDayOfMonth();
        org.joda.time.LocalDate localDate32 = localDate29.minusWeeks((int) (byte) 100);
        org.joda.time.DateTime dateTime33 = dateTime27.withFields((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate localDate35 = localDate29.plusDays(515);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime27", (mutableDateTime1.compareTo(dateTime27) == 0) == mutableDateTime1.equals(dateTime27));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.ROOT;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((-1609459200003L), chronology1, locale2, (java.lang.Integer) 99, (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.lang.String str13 = dateTimeField8.getAsShortText(189302400001L, locale10);
        org.joda.time.ReadablePartial readablePartial14 = null;
        int int15 = dateTimeField8.getMinimumValue(readablePartial14);
        dateTimeParserBucket5.saveField(dateTimeField8, (int) (short) 100);
        java.lang.Integer int18 = dateTimeParserBucket5.getOffsetInteger();
        java.lang.Integer int19 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 1, chronology21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime22.toDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime27.minusYears(7);
        org.joda.time.DateTime.Property property30 = dateTime27.secondOfMinute();
        org.joda.time.DateTime.Property property31 = dateTime27.weekOfWeekyear();
        org.joda.time.DateTime dateTime32 = property31.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField33 = property31.getField();
        boolean boolean34 = dateTimeParserBucket5.restoreState((java.lang.Object) property31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime27", (dateTime22.compareTo(dateTime27) == 0) == dateTime22.equals(dateTime27));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        boolean boolean8 = dateTimeZone3.isLocalDateTimeGap(localDateTime7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekyear();
        boolean boolean13 = dateTimeZone3.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone3.convertUTCToLocal(0L);
        java.lang.String str17 = dateTimeZone3.getNameKey((long) 575);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone3);
        boolean boolean19 = dateTimeZone2.equals((java.lang.Object) dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone2);
        java.lang.String str21 = dateTimeZone2.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime20", (dateTime18.compareTo(mutableDateTime20) == 0) == dateTime18.equals(mutableDateTime20));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add((long) 100);
        org.joda.time.Chronology chronology3 = null;
        mutableDateTime0.setChronology(chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        long long7 = dateTimeZone5.previousTransition((long) 1);
        mutableDateTime0.setZone(dateTimeZone5);
        int int9 = mutableDateTime0.getSecondOfMinute();
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime0.add(readableDuration10, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime0.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime0.copy();
        mutableDateTime0.addMillis(2);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        mutableDateTime19.add((long) '#');
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology25 = null;
        mutableDateTime24.setChronology(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        mutableDateTime24.setRounding(dateTimeField29, (int) (short) 1);
        mutableDateTime19.setDate((org.joda.time.ReadableInstant) mutableDateTime24);
        mutableDateTime19.setDayOfWeek(5);
        mutableDateTime19.setDayOfWeek((int) (short) 1);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime19.centuryOfEra();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime19.yearOfEra();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (-1), chronology40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        org.joda.time.DateTime dateTime45 = localDateTime41.toDateTime(dateTimeZone43);
        java.lang.String str46 = dateTime45.toString();
        org.joda.time.DateTime dateTime48 = dateTime45.plus((long) 100);
        org.joda.time.DateTime.Property property49 = dateTime48.yearOfCentury();
        java.util.Locale locale50 = java.util.Locale.GERMANY;
        java.util.Calendar calendar51 = dateTime48.toCalendar(locale50);
        org.joda.time.DateTime.Property property52 = dateTime48.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime53 = dateTime48.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusMillis((int) 'a');
        org.joda.time.Chronology chronology56 = localDateTime55.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.monthOfYear();
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now(chronology56);
        mutableDateTime19.setChronology(chronology56);
        org.joda.time.format.DateTimePrinter dateTimePrinter60 = null;
        org.joda.time.format.DateTimeParser dateTimeParser61 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter60, dateTimeParser61);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) (-1), chronology64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        org.joda.time.DateTime dateTime69 = localDateTime65.toDateTime(dateTimeZone67);
        org.joda.time.Chronology chronology70 = dateTime69.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter62.withChronology(chronology70);
        org.joda.time.DateTimeField dateTimeField72 = chronology70.monthOfYear();
        org.joda.time.DurationField durationField73 = chronology70.weekyears();
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        long long77 = chronology70.add(readablePeriod74, (long) 575, 1970);
        org.joda.time.DateTimeField dateTimeField78 = chronology70.millisOfDay();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime19, chronology70);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime19.centuryOfEra();
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime((long) 162);
        java.util.Locale locale87 = new java.util.Locale("1972-10-01", "Property[dayOfMonth]");
        java.lang.String str88 = dateTime83.toString("2000-02-21", locale87);
        java.lang.String str89 = locale87.getLanguage();
        java.lang.String str90 = property81.getAsText(locale87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime19", (mutableDateTime0.compareTo(mutableDateTime19) == 0) == mutableDateTime0.equals(mutableDateTime19));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfMinute();
        org.joda.time.DateTime.Property property11 = dateTime7.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = dateTime7.toDateMidnight();
        boolean boolean13 = dateTime7.isAfterNow();
        org.joda.time.DateTime.Property property14 = dateTime7.yearOfCentury();
        org.joda.time.DurationField durationField15 = property14.getRangeDurationField();
        java.lang.String str16 = durationField15.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        org.joda.time.DateTime dateTime11 = dateTime7.minusSeconds((-66));
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra(30849);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.weekyear();
        org.joda.time.LocalDate localDate8 = localDate0.plusDays(4);
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate11 = property9.addWrapFieldToCopy((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        long long17 = dateTimeZone12.convertLocalToUTC(10L, false, (long) 3);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str20 = dateTimeZone12.getShortName(0L, locale19);
        int int22 = dateTimeZone12.getOffsetFromLocal((long) 25);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property26 = localDate24.property(dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.year();
        boolean boolean28 = localDate24.isSupported(dateTimeFieldType27);
        org.joda.time.LocalDate.Property property29 = localDate24.era();
        org.joda.time.LocalDate.Property property30 = localDate24.dayOfMonth();
        org.joda.time.LocalDate localDate32 = localDate24.minusWeeks(2000);
        int int34 = localDate24.getValue((int) (short) 0);
        org.joda.time.LocalDate localDate36 = localDate24.plusDays(1439);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDate24.toDateTimeAtStartOfDay(dateTimeZone38);
        int int43 = dateTimeZone38.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime23.toMutableDateTime(dateTimeZone38);
        int int46 = dateTimeZone38.getStandardOffset((long) (-2033));
        org.joda.time.DateTime dateTime47 = localDate11.toDateTimeAtCurrentTime(dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime39", (dateTime23.compareTo(mutableDateTime39) == 0) == dateTime23.equals(mutableDateTime39));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale locale7 = new java.util.Locale("hi!");
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.util.Locale locale11 = new java.util.Locale("hi!");
        java.lang.String str12 = locale11.getScript();
        java.lang.String str13 = locale11.getDisplayLanguage();
        java.util.Locale locale15 = new java.util.Locale("hi!");
        java.lang.String str16 = locale15.getScript();
        java.lang.String str17 = locale15.getDisplayLanguage();
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale3, locale4, locale5, locale7, locale11, locale15 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList19, filteringMode21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap23);
        java.util.Locale locale25 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        long long32 = dateTimeZone27.convertLocalToUTC(10L, false, (long) 3);
        boolean boolean33 = strSet26.contains((java.lang.Object) false);
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet26, filteringMode34);
        java.util.Spliterator<java.lang.String> strSpliterator36 = strSet26.spliterator();
        strSet26.clear();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 1, chronology39);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime40.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime47 = dateTime45.minusYears(7);
        org.joda.time.DateTime.Property property48 = dateTime45.secondOfMinute();
        org.joda.time.DateTime.Property property49 = dateTime45.weekOfWeekyear();
        org.joda.time.DateTime dateTime50 = property49.roundFloorCopy();
        boolean boolean51 = strSet26.contains((java.lang.Object) dateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and dateTime45", (dateTime40.compareTo(dateTime45) == 0) == dateTime40.equals(dateTime45));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfMinute();
        org.joda.time.DateTime.Property property11 = dateTime7.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property13 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime7.plusDays(19044);
        org.joda.time.DateTime dateTime17 = dateTime7.plusWeeks(8678);
        org.joda.time.DateTime dateTime19 = dateTime7.minusMillis(248);
        org.joda.time.DateTime dateTime21 = dateTime19.withDayOfYear(334);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime7", (dateTime2.compareTo(dateTime7) == 0) == dateTime2.equals(dateTime7));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now(dateTimeZone1);
        java.util.GregorianCalendar gregorianCalendar3 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar3);
        org.joda.time.LocalDate.Property property5 = localDate4.yearOfCentury();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 3, chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType9.getRangeDurationType();
        boolean boolean12 = localDate8.isSupported(durationFieldType11);
        org.joda.time.LocalDate.Property property13 = localDate8.centuryOfEra();
        org.joda.time.LocalDate localDate14 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate16 = property13.setCopy((int) (byte) 1);
        org.joda.time.LocalDate localDate17 = property13.roundFloorCopy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 3, chronology19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType21.getRangeDurationType();
        boolean boolean24 = localDate20.isSupported(durationFieldType23);
        org.joda.time.LocalDate.Property property25 = localDate20.centuryOfEra();
        org.joda.time.LocalDate localDate26 = property25.roundCeilingCopy();
        org.joda.time.LocalDate localDate27 = property25.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = localDate27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.Interval interval32 = localDate17.toInterval(dateTimeZone29);
        long long34 = dateTimeZone29.nextTransition(35L);
        int int36 = dateTimeZone29.getOffsetFromLocal((long) 'u');
        java.lang.String str38 = dateTimeZone29.getNameKey(248402022L);
        org.joda.time.DateTime dateTime39 = localDate4.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 265, dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime30", (mutableDateTime2.compareTo(mutableDateTime30) == 0) == mutableDateTime2.equals(mutableDateTime30));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        org.joda.time.DateTime dateTime19 = property16.setCopy((int) (short) 0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) (-1), chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfYear();
        org.joda.time.DurationField durationField24 = property23.getLeapDurationField();
        org.joda.time.Interval interval25 = property23.toInterval();
        long long26 = property23.remainder();
        java.util.Locale locale28 = new java.util.Locale("hi!");
        int int29 = property23.getMaximumShortTextLength(locale28);
        org.joda.time.LocalDateTime localDateTime31 = property23.addToCopy((long) 'u');
        org.joda.time.LocalDateTime localDateTime33 = property23.addToCopy((int) (byte) 10);
        org.joda.time.Chronology chronology34 = localDateTime33.getChronology();
        org.joda.time.DateTime dateTime35 = dateTime19.toDateTime(chronology34);
        org.joda.time.DateTime dateTime37 = dateTime19.plus(3692163384000L);
        org.joda.time.DateTime dateTime39 = dateTime19.minusMillis(86399999);
        org.joda.time.DateTime.Property property40 = dateTime19.minuteOfHour();
        org.joda.time.DateTime dateTime42 = property40.addWrapFieldToCopy(35064);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime35", (dateTime19.compareTo(dateTime35) == 0) == dateTime19.equals(dateTime35));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        boolean boolean6 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getOffsetFromLocal((long) (byte) 0);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime4.toMutableDateTime(dateTimeZone8);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.era();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        mutableDateTime17.setZone(dateTimeZone19);
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeParser dateTimeParser24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (-1), chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime32 = localDateTime28.toDateTime(dateTimeZone30);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter25.withChronology(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.monthOfYear();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.clockhourOfHalfday();
        org.joda.time.DurationField durationField37 = chronology33.days();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1970, chronology33);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology33);
        int int40 = mutableDateTime39.getWeekOfWeekyear();
        mutableDateTime13.setDate((org.joda.time.ReadableInstant) mutableDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime17", (mutableDateTime1.compareTo(mutableDateTime17) == 0) == mutableDateTime1.equals(mutableDateTime17));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long21 = dateTimeZone19.convertUTCToLocal((long) 2000);
        org.joda.time.DateTime dateTime22 = dateTime6.withZone(dateTimeZone19);
        org.joda.time.DateTime dateTime24 = dateTime22.minusSeconds(29);
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds((-66));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime22", (dateTime6.compareTo(dateTime22) == 0) == dateTime6.equals(dateTime22));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology2 = null;
        mutableDateTime1.setChronology(chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        mutableDateTime1.setRounding(dateTimeField6, (int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (short) -1);
        long long11 = mutableDateTime10.getMillis();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime1.dayOfMonth();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 3, chronology16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType18.getRangeDurationType();
        boolean boolean21 = localDate17.isSupported(durationFieldType20);
        org.joda.time.LocalDate.Property property22 = localDate17.centuryOfEra();
        org.joda.time.LocalDate localDate23 = property22.roundCeilingCopy();
        org.joda.time.LocalDate localDate24 = property22.getLocalDate();
        int int25 = localDate24.getDayOfMonth();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 3, chronology27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType29.getRangeDurationType();
        boolean boolean32 = localDate28.isSupported(durationFieldType31);
        org.joda.time.LocalDate.Property property33 = localDate28.centuryOfEra();
        org.joda.time.LocalDate localDate34 = property33.roundCeilingCopy();
        org.joda.time.LocalDate localDate35 = property33.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localDate35.toDateTimeAtCurrentTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = localDate24.toDateTimeAtMidnight(dateTimeZone37);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDate localDate43 = localDate24.withPeriodAdded(readablePeriod41, (int) ' ');
        org.joda.time.LocalDate.Property property44 = localDate43.year();
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology46 = localDate43.getChronology();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(10L, chronology46);
        mutableDateTime1.setChronology(chronology46);
        org.joda.time.Chronology chronology49 = mutableDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now(chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime40", (mutableDateTime1.compareTo(dateTime40) == 0) == mutableDateTime1.equals(dateTime40));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.DateTime.Property property3 = dateTime1.minuteOfDay();
        int int4 = dateTime1.getYear();
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfWeek();
        org.joda.time.DateTime dateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property10 = localDate8.property(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        boolean boolean12 = localDate8.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate.Property property13 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate15 = localDate8.plusYears(1969);
        org.joda.time.LocalDate localDate17 = localDate8.minusDays(39);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        long long24 = dateTimeZone19.convertLocalToUTC((long) 575, false, (long) 49);
        java.lang.String str26 = dateTimeZone19.getNameKey(6L);
        org.joda.time.DateTime dateTime27 = localDate17.toDateTimeAtStartOfDay(dateTimeZone19);
        long long29 = dateTimeZone19.convertUTCToLocal((long) 10);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) dateTime7, dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime20", (dateTime1.compareTo(dateTime20) == 0) == dateTime1.equals(dateTime20));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
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
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology10.add(readablePeriod16, (-107999990L), 2922750);
        org.joda.time.DateTimeZone dateTimeZone20 = chronology10.getZone();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) (-1), chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.weekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        int int27 = property24.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime29.add(readableDuration30, 100);
        boolean boolean33 = mutableDateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime26.getZone();
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.Chronology chronology36 = chronology10.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField37 = chronology10.yearOfEra();
        org.joda.time.DurationField durationField38 = chronology10.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField38, and durationField15", !(durationField15.compareTo(durationField38) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField38.compareTo(durationField15))));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        mutableDateTime0.add(durationFieldType3, 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDateTime11.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter8.withChronology(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.monthOfYear();
        org.joda.time.DurationField durationField19 = durationFieldType3.getField(chronology16);
        org.joda.time.DurationField durationField20 = chronology16.eras();
        org.joda.time.DurationFieldType durationFieldType21 = durationField20.getType();
        java.lang.String str22 = durationFieldType21.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField20", Math.signum(durationField19.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField19)));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime1.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4, (int) (short) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addWeeks(33);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property12 = localDate10.property(dateTimeFieldType11);
        java.util.Locale locale16 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate17 = property12.setCopy("365", locale16);
        org.joda.time.LocalDate localDate19 = property12.addToCopy(59);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTime dateTime21 = mutableDateTime1.toDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusYears(58);
        org.joda.time.DateTime.Property property24 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime25 = property24.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime21", (mutableDateTime1.compareTo(dateTime21) == 0) == mutableDateTime1.equals(dateTime21));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime2.add((long) '#');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology8 = null;
        mutableDateTime7.setChronology(chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        mutableDateTime7.setRounding(dateTimeField12, (int) (short) 1);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        mutableDateTime2.setDayOfWeek(5);
        mutableDateTime2.setDayOfWeek((int) (short) 1);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime2.yearOfEra();
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
        org.joda.time.DateTime.Property property35 = dateTime31.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime36 = dateTime31.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusMillis((int) 'a');
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.monthOfYear();
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(chronology39);
        mutableDateTime2.setChronology(chronology39);
        org.joda.time.format.DateTimePrinter dateTimePrinter43 = null;
        org.joda.time.format.DateTimeParser dateTimeParser44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter43, dateTimeParser44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (-1), chronology47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        org.joda.time.DateTime dateTime52 = localDateTime48.toDateTime(dateTimeZone50);
        org.joda.time.Chronology chronology53 = dateTime52.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter45.withChronology(chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.monthOfYear();
        org.joda.time.DurationField durationField56 = chronology53.weekyears();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        long long60 = chronology53.add(readablePeriod57, (long) 575, 1970);
        org.joda.time.DateTimeField dateTimeField61 = chronology53.millisOfDay();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime2, chronology53);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) (-1), chronology64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfYear();
        org.joda.time.DurationField durationField67 = property66.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime69 = property66.addToCopy((-1));
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.era();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone73);
        boolean boolean76 = dateTimeZone73.isStandardOffset((long) 2);
        java.util.TimeZone timeZone77 = dateTimeZone73.toTimeZone();
        java.util.TimeZone timeZone78 = dateTimeZone73.toTimeZone();
        org.joda.time.DateTime dateTime79 = localDateTime69.toDateTime(dateTimeZone73);
        boolean boolean81 = dateTimeZone73.isStandardOffset(0L);
        org.joda.time.Chronology chronology82 = chronology53.withZone(dateTimeZone73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime62", (mutableDateTime2.compareTo(dateTime62) == 0) == mutableDateTime2.equals(dateTime62));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        long long2 = mutableDateTime1.getMillis();
        java.lang.Object obj3 = mutableDateTime1.clone();
        mutableDateTime1.addMillis((int) (byte) 10);
        mutableDateTime1.setMillisOfSecond((int) (byte) 0);
        org.joda.time.Instant instant8 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.yearOfCentury();
        java.util.Locale locale10 = null;
        int int11 = property9.getMaximumShortTextLength(locale10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant8", (mutableDateTime1.compareTo(instant8) == 0) == mutableDateTime1.equals(instant8));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withYearOfEra((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        boolean boolean12 = dateTimeZone7.isLocalDateTimeGap(localDateTime11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        boolean boolean17 = dateTimeZone7.isLocalDateTimeGap(localDateTime15);
        boolean boolean19 = dateTimeZone7.isStandardOffset(86399999L);
        long long23 = dateTimeZone7.convertLocalToUTC((long) 35, true, 2022L);
        org.joda.time.DateTime dateTime24 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime26 = dateTime24.plusSeconds(517200);
        org.joda.time.DateTime.Property property27 = dateTime24.monthOfYear();
        org.joda.time.DateTime dateTime29 = dateTime24.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        boolean boolean35 = dateTimeZone30.isLocalDateTimeGap(localDateTime34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.plusMillis(99);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusDays(6);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) 'a');
        org.joda.time.DateTime dateTime42 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (-1), chronology45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.weekyear();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusMinutes(292278993);
        org.joda.time.LocalDateTime.Property property52 = localDateTime46.yearOfEra();
        org.joda.time.LocalDateTime.Property property53 = localDateTime46.dayOfYear();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime46.minusHours(888);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.year();
        org.joda.time.Chronology chronology57 = localDateTime55.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.dayOfYear();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.clockhourOfHalfday();
        boolean boolean60 = durationFieldType43.isSupported(chronology57);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime62.set(dateTimeFieldType63, (-292275054));
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime62.yearOfEra();
        mutableDateTime62.setYear((int) '#');
        mutableDateTime62.setYear(292278993);
        mutableDateTime62.setMillisOfSecond(59);
        mutableDateTime62.addMillis(3);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime62.dayOfWeek();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime62.weekyear();
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime62.copy();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime79.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration82 = null;
        mutableDateTime79.add(readableDuration82, (int) (short) 100);
        int int85 = mutableDateTime79.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(56, (int) '#');
        mutableDateTime79.setZoneRetainFields(dateTimeZone88);
        mutableDateTime77.setZoneRetainFields(dateTimeZone88);
        org.joda.time.Chronology chronology91 = chronology57.withZone(dateTimeZone88);
        org.joda.time.DateTime dateTime92 = dateTime42.toDateTime(chronology57);
        org.joda.time.DateTimeField dateTimeField93 = chronology57.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime92", (dateTime42.compareTo(dateTime92) == 0) == dateTime42.equals(dateTime92));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getOffsetFromLocal((long) (byte) 0);
        mutableDateTime1.setZoneRetainFields(dateTimeZone2);
        org.joda.time.Chronology chronology6 = mutableDateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DurationField durationField8 = chronology6.minutes();
        org.joda.time.DurationField durationField9 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField7, and durationField8", !(durationField9.compareTo(durationField7) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusMinutes(292278993);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.yearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (-1), chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDateTime14.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter11.withChronology(chronology19);
        boolean boolean21 = localDateTime2.equals((java.lang.Object) chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.monthOfYear();
        org.joda.time.DurationField durationField24 = chronology19.centuries();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.hourOfDay();
        org.joda.time.DurationField durationField26 = chronology19.eras();
        org.joda.time.Chronology chronology27 = chronology19.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField26", Math.signum(durationField24.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField24)));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 3, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType3.getRangeDurationType();
        boolean boolean6 = localDate2.isSupported(durationFieldType5);
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.getLocalDate();
        int int10 = localDate9.getDayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 3, chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType14.getRangeDurationType();
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        org.joda.time.LocalDate.Property property18 = localDate13.centuryOfEra();
        org.joda.time.LocalDate localDate19 = property18.roundCeilingCopy();
        org.joda.time.LocalDate localDate20 = property18.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDate20.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDate9.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        long long32 = dateTimeZone27.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone33 = dateTimeZone27.toTimeZone();
        java.util.TimeZone timeZone34 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(66L, dateTimeZone27);
        org.joda.time.DateTime dateTime36 = localDate9.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone27);
        boolean boolean39 = dateTimeZone27.isStandardOffset((-203697981L));
        long long42 = dateTimeZone27.convertLocalToUTC((long) 68, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and dateTime37", (mutableDateTime23.compareTo(dateTime37) == 0) == mutableDateTime23.equals(dateTime37));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 'x', dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime9 = dateTime7.minusYears(7);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfMinute();
        org.joda.time.DateTime.Property property11 = dateTime7.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight12 = dateTime7.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight13 = dateTime7.toDateMidnight();
        int int14 = dateTime7.getYearOfCentury();
        org.joda.time.DateTime.Property property15 = dateTime7.millisOfDay();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime17 = property15.roundFloorCopy();
        org.joda.time.DateTime dateTime18 = property15.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime18", (dateTime2.compareTo(dateTime18) == 0) == dateTime2.equals(dateTime18));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime6 = localDateTime2.toDateTime(dateTimeZone4);
        java.lang.String str7 = dateTime6.toString();
        org.joda.time.DateTime dateTime9 = dateTime6.plus((long) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.lang.String str18 = locale15.getDisplayVariant(locale17);
        java.lang.String str19 = dateTime12.toString("365", locale17);
        org.joda.time.DateTime dateTime21 = dateTime12.plusMonths(1969);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTime dateTime24 = dateTime21.withFieldAdded(durationFieldType22, (int) 'u');
        org.joda.time.Chronology chronology25 = null;
        boolean boolean26 = durationFieldType22.isSupported(chronology25);
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = null;
        org.joda.time.format.DateTimeParser dateTimeParser29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (-1), chronology32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        org.joda.time.DateTime dateTime37 = localDateTime33.toDateTime(dateTimeZone35);
        org.joda.time.Chronology chronology38 = dateTime37.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter30.withChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.monthOfYear();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.clockhourOfHalfday();
        org.joda.time.DurationField durationField42 = chronology38.days();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1970, chronology38);
        org.joda.time.DateTimeField dateTimeField44 = chronology38.yearOfCentury();
        org.joda.time.DurationField durationField45 = chronology38.eras();
        org.joda.time.DurationField durationField46 = durationFieldType22.getField(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField46 and durationField45", Math.signum(durationField46.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField46)));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate.Property property5 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate6 = property5.roundCeilingCopy();
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear(19);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate6.minus(readablePeriod9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.LocalDate.Property property13 = localDate10.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType14.getRangeDurationType();
        org.joda.time.LocalDate localDate18 = localDate10.withFieldAdded(durationFieldType16, (int) (byte) 1);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property21 = localDate19.property(dateTimeFieldType20);
        java.util.Locale locale25 = new java.util.Locale("Property[dayOfYear]", "");
        org.joda.time.LocalDate localDate26 = property21.setCopy("365", locale25);
        org.joda.time.LocalDate localDate28 = property21.setCopy((int) 'a');
        org.joda.time.LocalDate localDate30 = property21.setCopy((-1));
        org.joda.time.LocalDate localDate32 = localDate30.withYearOfEra(1999);
        org.joda.time.Chronology chronology33 = localDate30.getChronology();
        org.joda.time.Chronology chronology34 = chronology33.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField36 = durationFieldType16.getField(chronology33);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 162);
        java.util.Locale locale42 = new java.util.Locale("1972-10-01", "Property[dayOfMonth]");
        java.lang.String str43 = dateTime38.toString("2000-02-21", locale42);
        org.joda.time.DateTime dateTime45 = dateTime38.minusYears(196);
        org.joda.time.DateTime dateTime47 = dateTime38.withYear(2022);
        org.joda.time.LocalDate localDate48 = dateTime47.toLocalDate();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 3, chronology50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType52.getDurationType();
        org.joda.time.DurationFieldType durationFieldType54 = dateTimeFieldType52.getRangeDurationType();
        boolean boolean55 = localDate51.isSupported(durationFieldType54);
        org.joda.time.LocalDate.Property property56 = localDate51.centuryOfEra();
        boolean boolean57 = property56.isLeap();
        org.joda.time.LocalDate localDate58 = property56.getLocalDate();
        org.joda.time.LocalDate localDate60 = property56.setCopy("9");
        org.joda.time.LocalDate localDate62 = localDate60.minusMonths((int) 'u');
        org.joda.time.Chronology chronology63 = localDate60.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.year();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.minuteOfDay();
        org.joda.time.DateTime dateTime66 = dateTime47.withChronology(chronology63);
        org.joda.time.DurationField durationField67 = durationFieldType16.getField(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime66", (dateTime47.compareTo(dateTime66) == 0) == dateTime47.equals(dateTime66));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = chronology12.centuries();
        org.joda.time.DateTime dateTime18 = dateTime1.toDateTime(chronology12);
        org.joda.time.Chronology chronology19 = dateTime1.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.minutes();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.DurationField durationField22 = chronology19.hours();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (-1), chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.weekyear();
        org.joda.time.LocalDateTime localDateTime27 = property26.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField28 = property26.getField();
        org.joda.time.DurationField durationField29 = property26.getDurationField();
        long long31 = durationField29.getValueAsLong((long) 2022);
        long long34 = durationField29.getMillis((long) (-101), 33L);
        int int35 = durationField22.compareTo(durationField29);
        org.joda.time.DurationFieldType durationFieldType36 = durationField29.getType();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.lang.String str42 = locale41.getDisplayScript();
        java.lang.String str43 = dateTimeZone38.getName((long) 5, locale41);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone38);
        org.joda.time.DateTime.Property property45 = dateTime44.dayOfWeek();
        org.joda.time.Chronology chronology46 = dateTime44.getChronology();
        boolean boolean47 = durationFieldType36.isSupported(chronology46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime39", (dateTime1.compareTo(mutableDateTime39) == 0) == dateTime1.equals(mutableDateTime39));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime2.add((long) '#');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (short) -1);
        org.joda.time.Chronology chronology8 = null;
        mutableDateTime7.setChronology(chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        mutableDateTime7.setRounding(dateTimeField12, (int) (short) 1);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        mutableDateTime2.setDayOfWeek(5);
        mutableDateTime2.setDayOfWeek((int) (short) 1);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime2.yearOfEra();
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
        org.joda.time.DateTime.Property property35 = dateTime31.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime36 = dateTime31.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusMillis((int) 'a');
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.monthOfYear();
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(chronology39);
        mutableDateTime2.setChronology(chronology39);
        org.joda.time.format.DateTimePrinter dateTimePrinter43 = null;
        org.joda.time.format.DateTimeParser dateTimeParser44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter43, dateTimeParser44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) (-1), chronology47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        org.joda.time.DateTime dateTime52 = localDateTime48.toDateTime(dateTimeZone50);
        org.joda.time.Chronology chronology53 = dateTime52.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter45.withChronology(chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.monthOfYear();
        org.joda.time.DurationField durationField56 = chronology53.weekyears();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        long long60 = chronology53.add(readablePeriod57, (long) 575, 1970);
        org.joda.time.DateTimeField dateTimeField61 = chronology53.millisOfDay();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime2, chronology53);
        org.joda.time.DateTimeField dateTimeField63 = chronology53.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime62", (mutableDateTime2.compareTo(dateTime62) == 0) == mutableDateTime2.equals(dateTime62));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.convertLocalToUTC(10L, false, (long) 3);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.copy();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime7.add(readableDuration9, (int) (byte) -1);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(0L);
        org.joda.time.LocalTime localTime15 = localTime13.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime17 = localTime13.minusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.millis();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfEra();
        org.joda.time.DurationField durationField21 = chronology18.months();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology18);
        mutableDateTime7.setChronology(chronology18);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime7.getZone();
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime7.add(readableDuration25, 86369199);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 3, chronology29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType31.getDurationType();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType31.getRangeDurationType();
        boolean boolean34 = localDate30.isSupported(durationFieldType33);
        org.joda.time.LocalDate.Property property35 = localDate30.centuryOfEra();
        org.joda.time.LocalDate localDate36 = property35.roundCeilingCopy();
        org.joda.time.LocalDate localDate37 = property35.getLocalDate();
        int int38 = localDate37.getDayOfMonth();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 3, chronology40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getDurationType();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType42.getRangeDurationType();
        boolean boolean45 = localDate41.isSupported(durationFieldType44);
        org.joda.time.LocalDate.Property property46 = localDate41.centuryOfEra();
        org.joda.time.LocalDate localDate47 = property46.roundCeilingCopy();
        org.joda.time.LocalDate localDate48 = property46.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = localDate48.toDateTimeAtCurrentTime(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = localDate37.toDateTimeAtMidnight(dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDate localDate56 = localDate37.withPeriodAdded(readablePeriod54, (int) ' ');
        java.util.Date date57 = localDate56.toDate();
        int int58 = localDate56.size();
        org.joda.time.LocalDate localDate60 = localDate56.plusYears((int) 'u');
        org.joda.time.LocalDate localDate62 = localDate60.withCenturyOfEra(2922750);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(3);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(dateTimeZone64);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone64);
        org.joda.time.DateTime dateTime68 = localDate62.toDateTimeAtMidnight(dateTimeZone64);
        mutableDateTime7.setZone(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime51", (mutableDateTime8.compareTo(mutableDateTime51) == 0) == mutableDateTime8.equals(mutableDateTime51));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        mutableDateTime1.addMillis((-292275054));
        java.lang.String str4 = mutableDateTime1.toString();
        mutableDateTime1.addMonths(47);
        org.joda.time.Chronology chronology7 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(54363209L, chronology7);
        org.joda.time.DurationField durationField11 = chronology7.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.add((long) 100);
        org.joda.time.Chronology chronology3 = null;
        mutableDateTime0.setChronology(chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        long long7 = dateTimeZone5.previousTransition((long) 1);
        mutableDateTime0.setZone(dateTimeZone5);
        int int9 = mutableDateTime0.getSecondOfMinute();
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.util.Calendar calendar12 = mutableDateTime0.toCalendar(locale10);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime0.copy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (-1), chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime21 = localDateTime17.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.Chronology chronology24 = chronology22.withUTC();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology22);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plus(readableDuration26);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.era();
        org.joda.time.DateTime dateTime32 = mutableDateTime0.toDateTime(chronology28);
        mutableDateTime0.addWeekyears(908);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and dateTime32", (mutableDateTime13.compareTo(dateTime32) == 0) == mutableDateTime13.equals(dateTime32));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDate.Property property2 = localDate0.property(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        boolean boolean4 = localDate0.isSupported(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime7 = dateTime5.minusYears(575);
        org.joda.time.DateTime dateTime8 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.secondOfMinute();
        org.joda.time.DateTime dateTime10 = property9.getDateTime();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        int int12 = dateTime10.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (-1), chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withYearOfEra((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (-1), chronology10);
        boolean boolean12 = dateTimeZone7.isLocalDateTimeGap(localDateTime11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (-1), chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekyear();
        boolean boolean17 = dateTimeZone7.isLocalDateTimeGap(localDateTime15);
        boolean boolean19 = dateTimeZone7.isStandardOffset(86399999L);
        long long23 = dateTimeZone7.convertLocalToUTC((long) 35, true, 2022L);
        org.joda.time.DateTime dateTime24 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime26 = dateTime24.plusSeconds(517200);
        org.joda.time.DateTime.Property property27 = dateTime24.monthOfYear();
        org.joda.time.DateTime dateTime29 = dateTime24.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (-1), chronology33);
        boolean boolean35 = dateTimeZone30.isLocalDateTimeGap(localDateTime34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.plusMillis(99);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusDays(6);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) 'a');
        org.joda.time.DateTime dateTime42 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) (-1), chronology45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.weekyear();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusMinutes(292278993);
        org.joda.time.LocalDateTime.Property property52 = localDateTime46.yearOfEra();
        org.joda.time.LocalDateTime.Property property53 = localDateTime46.dayOfYear();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime46.minusHours(888);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.year();
        org.joda.time.Chronology chronology57 = localDateTime55.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.dayOfYear();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.clockhourOfHalfday();
        boolean boolean60 = durationFieldType43.isSupported(chronology57);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.year();
        mutableDateTime62.set(dateTimeFieldType63, (-292275054));
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime62.yearOfEra();
        mutableDateTime62.setYear((int) '#');
        mutableDateTime62.setYear(292278993);
        mutableDateTime62.setMillisOfSecond(59);
        mutableDateTime62.addMillis(3);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime62.dayOfWeek();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime62.weekyear();
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime62.copy();
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((java.lang.Object) "1969-12-31T23:59:59.999Z");
        mutableDateTime79.addYears((int) 'x');
        org.joda.time.ReadableDuration readableDuration82 = null;
        mutableDateTime79.add(readableDuration82, (int) (short) 100);
        int int85 = mutableDateTime79.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(56, (int) '#');
        mutableDateTime79.setZoneRetainFields(dateTimeZone88);
        mutableDateTime77.setZoneRetainFields(dateTimeZone88);
        org.joda.time.Chronology chronology91 = chronology57.withZone(dateTimeZone88);
        org.joda.time.DateTime dateTime92 = dateTime42.toDateTime(chronology57);
        org.joda.time.DurationField durationField93 = chronology57.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime92", (dateTime42.compareTo(dateTime92) == 0) == dateTime42.equals(dateTime92));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeField dateTimeField1 = mutableDateTime0.getRoundingField();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) (short) 100);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (-1), chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTime dateTime11 = localDateTime7.toDateTime(dateTimeZone9);
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.DateTime dateTime14 = dateTime11.plus((long) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusSeconds(0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.withChronology(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusSeconds(99);
        boolean boolean21 = mutableDateTime4.equals((java.lang.Object) dateTime18);
        mutableDateTime4.addMillis(162);
        org.joda.time.Instant instant24 = mutableDateTime4.toInstant();
        int int25 = mutableDateTime4.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant24", (mutableDateTime4.compareTo(instant24) == 0) == mutableDateTime4.equals(instant24));
    }
}

