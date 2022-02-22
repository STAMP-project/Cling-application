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
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Chronology chronology2 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant0.plus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant0.withDurationAdded(readableDuration4, 26176946);
        org.joda.time.DateTime dateTime7 = instant0.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime8 = instant0.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant0.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Chronology chronology5 = instant3.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        timeZone3.setID("Etc/UTC");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        int int8 = timeZone3.getOffset((long) 52);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        timeZone12.setID("Etc/UTC");
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone12, locale15);
        boolean boolean17 = timeZone3.hasSameRules(timeZone12);
        timeZone3.setRawOffset(26167);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar16", (calendar6.compareTo(calendar16) == 0) == calendar6.equals(calendar16));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        int int9 = mutableDateTime8.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant7", (dateTime5.compareTo(instant7) == 0) == dateTime5.equals(instant7));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant6.minus(readableDuration9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant10", (dateTime5.compareTo(instant10) == 0) == dateTime5.equals(instant10));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = instant0.toDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        int int7 = localDateTime5.getDayOfYear();
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTime dateTime11 = instant0.toDateTime(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        org.joda.time.Instant instant9 = instant7.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant9", (dateTime5.compareTo(instant9) == 0) == dateTime5.equals(instant9));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(chronology14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone17.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime15.toMutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology22 = chronology4.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.joda.time.DurationField durationField24 = chronology22.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.dayOfMonth();
        org.joda.time.DurationField durationField26 = chronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField23, and durationField24", !(durationField26.compareTo(durationField23) == 0) || (Math.signum(durationField26.compareTo(durationField24)) == Math.signum(durationField23.compareTo(durationField24))));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology13 = dateTime5.getChronology();
        org.joda.time.DateTime.Property property14 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfMinute();
        org.joda.time.DateTime dateTime22 = dateTime18.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        java.lang.String str25 = dateTimeFieldType23.toString();
        int int26 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime28 = dateTime22.plusYears(26172);
        boolean boolean29 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        int int33 = localDateTime31.getDayOfYear();
        org.joda.time.Chronology chronology34 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.hourOfDay();
        org.joda.time.DateTime dateTime37 = dateTime15.toDateTime(chronology34);
        org.joda.time.DateTime.Property property38 = dateTime15.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime37", (dateTime15.compareTo(dateTime37) == 0) == dateTime15.equals(dateTime37));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        java.util.Date date4 = dateTime3.toDate();
        org.joda.time.Instant instant5 = dateTime3.toInstant();
        int int6 = dateTime3.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant5", (dateTime3.compareTo(instant5) == 0) == dateTime3.equals(instant5));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime11.toMutableDateTime(chronology12);
        boolean boolean14 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        java.lang.Class<?> wildcardClass16 = dateTime11.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant15", (dateTime5.compareTo(instant15) == 0) == dateTime5.equals(instant15));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology13 = dateTime5.getChronology();
        org.joda.time.DateTime.Property property14 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfMinute();
        org.joda.time.DateTime dateTime22 = dateTime18.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        java.lang.String str25 = dateTimeFieldType23.toString();
        int int26 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime28 = dateTime22.plusYears(26172);
        boolean boolean29 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        int int33 = localDateTime31.getDayOfYear();
        org.joda.time.Chronology chronology34 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.hourOfDay();
        org.joda.time.DateTime dateTime37 = dateTime15.toDateTime(chronology34);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int39 = dateTime15.get(dateTimeFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime37", (dateTime15.compareTo(dateTime37) == 0) == dateTime15.equals(dateTime37));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.LocalDate.Property property5 = localDate2.yearOfCentury();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra(100);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str13 = dateTimeZone12.toString();
        java.lang.String str15 = dateTimeZone12.getShortName((long) 32772);
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtStartOfDay(dateTimeZone12);
        long long17 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime19 = dateTime16.withMinuteOfHour(4);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readablePeriod22);
        org.joda.time.DateTime.Property property24 = dateTime21.weekyear();
        java.lang.String str25 = dateTime21.toString();
        org.joda.time.ReadableInstant readableInstant26 = null;
        boolean boolean27 = dateTime21.isAfter(readableInstant26);
        java.util.GregorianCalendar gregorianCalendar28 = dateTime21.toGregorianCalendar();
        org.joda.time.DateMidnight dateMidnight29 = dateTime21.toDateMidnight();
        int int30 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and gregorianCalendar28", (calendar0.compareTo(gregorianCalendar28) == 0) == calendar0.equals(gregorianCalendar28));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime5.plusWeeks(23);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime5.plus(readableDuration9);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant6", (dateTime10.compareTo(instant6) == 0) == dateTime10.equals(instant6));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = instant0.toDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        int int7 = localDateTime5.getDayOfYear();
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTime dateTime11 = instant0.toDateTime(chronology8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant0.minus(readableDuration12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime11", (mutableDateTime1.compareTo(dateTime11) == 0) == mutableDateTime1.equals(dateTime11));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfDay();
        java.util.Locale locale7 = java.util.Locale.PRC;
        boolean boolean8 = dateTime5.equals((java.lang.Object) locale7);
        org.joda.time.DateTime.Property property9 = dateTime5.dayOfMonth();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime11.plus(readablePeriod12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.minutes();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.secondOfMinute();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime dateTime18 = dateTime5.toDateTime(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime17", (dateTime1.compareTo(dateTime17) == 0) == dateTime1.equals(dateTime17));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime7 = property6.getDateTime();
        org.joda.time.LocalDate localDate8 = dateTime7.toLocalDate();
        org.joda.time.DateTime dateTime10 = dateTime7.withMillisOfDay(26199);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        int int14 = dateTime12.getSecondOfDay();
        org.joda.time.DateTime dateTime16 = dateTime12.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        int int20 = dateTime18.getSecondOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime22.toMutableDateTime(chronology23);
        boolean boolean25 = dateTime12.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Instant instant26 = dateTime22.toInstant();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.minus(readableDuration27);
        boolean boolean29 = dateTime10.isBefore((org.joda.time.ReadableInstant) instant28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant28", (dateTime16.compareTo(instant28) == 0) == dateTime16.equals(instant28));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.roundCeilingCopy();
        org.joda.time.LocalDate localDate4 = property1.withMaximumValue();
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        long long6 = instant5.getMillis();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant5.plus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((long) 26200, 26186);
        org.joda.time.MutableDateTime mutableDateTime12 = instant8.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime13 = localDate4.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime12", (instant8.compareTo(mutableDateTime12) == 0) == instant8.equals(mutableDateTime12));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(4);
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime10.plusHours((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.era();
        boolean boolean15 = dateTime13.isSupported(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(295);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone17);
        int int20 = dateTimeZone17.getOffsetFromLocal((long) 2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime18", (dateTime13.compareTo(dateTime18) == 0) == dateTime13.equals(dateTime18));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.withSecondOfMinute(1);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis(355L);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        int int16 = localDateTime14.getDayOfYear();
        org.joda.time.Chronology chronology17 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology17.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology17.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime12.toMutableDateTime(chronology17);
        org.joda.time.DateTime dateTime24 = dateTime12.plusMonths(17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime22", (dateTime12.compareTo(mutableDateTime22) == 0) == dateTime12.equals(mutableDateTime22));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        org.joda.time.Instant instant9 = instant7.toInstant();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.minus(readableDuration10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant11", (dateTime5.compareTo(instant11) == 0) == dateTime5.equals(instant11));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.Locale locale2 = new java.util.Locale("hi!");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList9);
        java.util.stream.Stream<java.lang.String> strStream12 = strList11.stream();
        boolean boolean13 = strSet3.containsAll((java.util.Collection<java.lang.String>) strList11);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withDayOfYear(12);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusYears(7);
        boolean boolean20 = strSet3.remove((java.lang.Object) 7);
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList29);
        java.util.stream.Stream<java.lang.String> strStream32 = strList31.stream();
        boolean boolean33 = strSet23.containsAll((java.util.Collection<java.lang.String>) strList31);
        java.lang.Object[] objArray34 = strSet23.toArray();
        java.util.Iterator<java.lang.String> strItor35 = strSet23.iterator();
        boolean boolean36 = strSet3.removeAll((java.util.Collection<java.lang.String>) strSet23);
        boolean boolean37 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet23);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        int int40 = dateTime39.getEra();
        int int41 = dateTime39.getSecondOfDay();
        org.joda.time.DateTime dateTime43 = dateTime39.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        int int46 = dateTime45.getEra();
        int int47 = dateTime45.getSecondOfDay();
        org.joda.time.DateTime dateTime49 = dateTime45.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime49.toMutableDateTime(chronology50);
        boolean boolean52 = dateTime39.isBefore((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Instant instant53 = dateTime49.toInstant();
        boolean boolean54 = strSet23.equals((java.lang.Object) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant53", (dateTime43.compareTo(instant53) == 0) == dateTime43.equals(instant53));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology13 = dateTime5.getChronology();
        org.joda.time.DateTime.Property property14 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfMinute();
        org.joda.time.DateTime dateTime22 = dateTime18.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        java.lang.String str25 = dateTimeFieldType23.toString();
        int int26 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime28 = dateTime22.plusYears(26172);
        boolean boolean29 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        int int33 = localDateTime31.getDayOfYear();
        org.joda.time.Chronology chronology34 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.hourOfDay();
        org.joda.time.DateTime dateTime37 = dateTime15.toDateTime(chronology34);
        org.joda.time.Chronology chronology38 = dateTime15.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime37", (dateTime15.compareTo(dateTime37) == 0) == dateTime15.equals(dateTime37));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.withSecondOfMinute(1);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis(355L);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        int int16 = localDateTime14.getDayOfYear();
        org.joda.time.Chronology chronology17 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology17.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology17.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime12.toMutableDateTime(chronology17);
        org.joda.time.DateTimeField dateTimeField23 = chronology17.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime22", (dateTime8.compareTo(mutableDateTime22) == 0) == dateTime8.equals(mutableDateTime22));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.minuteOfHour();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property14 = dateTime11.minuteOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.toDateTime(chronology15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        long long21 = dateTimeZone18.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime16.toMutableDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology23 = chronology5.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField24 = chronology23.hours();
        org.joda.time.DurationField durationField25 = chronology23.years();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology23);
        boolean boolean27 = durationFieldType0.isSupported(chronology23);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.hourOfDay();
        int int31 = localDateTime29.getDayOfYear();
        org.joda.time.Chronology chronology32 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.clockhourOfHalfday();
        boolean boolean36 = durationFieldType0.isSupported(chronology32);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.hourOfDay();
        int int40 = localDateTime38.getDayOfYear();
        org.joda.time.Chronology chronology41 = localDateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.hourOfDay();
        org.joda.time.DurationField durationField44 = chronology41.weekyears();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology41.getZone();
        org.joda.time.Chronology chronology46 = chronology32.withZone(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField44", (durationField25.compareTo(durationField44) == 0) == durationField25.equals(durationField44));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        long long4 = property3.remainder();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = property3.getAsShortText(locale5);
        org.joda.time.DateTime dateTime8 = property3.setCopy(7);
        int int9 = dateTime8.getDayOfYear();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        int int14 = dateTimeZone11.getOffsetFromLocal((long) 6);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime8.toMutableDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfMinute();
        org.joda.time.DateTime dateTime22 = dateTime18.withCenturyOfEra((int) ' ');
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime25 = dateTime22.plusWeeks(23);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.plus(readableDuration26);
        int int28 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant23", (dateTime27.compareTo(instant23) == 0) == dateTime27.equals(instant23));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant0.plus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant0.withDurationAdded(readableDuration4, 26176946);
        org.joda.time.DateTime dateTime7 = instant0.toDateTimeISO();
        org.joda.time.Instant instant9 = instant0.minus((long) 1200);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime10 = dateTime6.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        java.lang.String str13 = dateTimeFieldType11.toString();
        int int14 = dateTime10.get(dateTimeFieldType11);
        int int15 = dateTime10.getMonthOfYear();
        int int16 = property2.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime.Property property18 = dateTime10.property(dateTimeFieldType17);
        org.joda.time.DateTime dateTime20 = dateTime10.plusHours(3);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.withDurationAdded(readableDuration21, (int) (byte) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekyear(26225);
        org.joda.time.Instant instant26 = dateTime23.toInstant();
        org.joda.time.DateTime dateTime28 = dateTime23.withMinuteOfHour(22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant26", (dateTime23.compareTo(instant26) == 0) == dateTime23.equals(instant26));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.withSecondOfMinute(1);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis(355L);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        int int16 = localDateTime14.getDayOfYear();
        org.joda.time.Chronology chronology17 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology17.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology17.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime12.toMutableDateTime(chronology17);
        org.joda.time.DateTimeField dateTimeField23 = chronology17.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime22", (dateTime8.compareTo(mutableDateTime22) == 0) == dateTime8.equals(mutableDateTime22));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = instant7.toDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        int int14 = localDateTime12.getDayOfYear();
        org.joda.time.Chronology chronology15 = localDateTime12.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.days();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.year();
        org.joda.time.DateTime dateTime18 = instant7.toDateTime(chronology15);
        boolean boolean19 = dateTime3.isAfter((org.joda.time.ReadableInstant) instant7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime18", (dateTime3.compareTo(dateTime18) == 0) == dateTime3.equals(dateTime18));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(4);
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime10.minusDays((int) (byte) 100);
        org.joda.time.DateTime dateTime14 = dateTime10.toDateTime();
        org.joda.time.Instant instant15 = dateTime10.toInstant();
        org.joda.time.Instant instant17 = instant15.withMillis(0L);
        org.joda.time.Instant instant20 = instant15.withDurationAdded((long) 26164319, (int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.plus(readableDuration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant15", (dateTime7.compareTo(instant15) == 0) == dateTime7.equals(instant15));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = instant0.toDateTime(chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        boolean boolean5 = dateTime3.isEqual(readableInstant4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant0.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        int int14 = dateTime12.getSecondOfDay();
        org.joda.time.DateTime dateTime16 = dateTime12.minusMonths((int) 'a');
        boolean boolean17 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        java.lang.String str20 = dateTimeFieldType18.toString();
        org.joda.time.DateTime.Property property21 = dateTime12.property(dateTimeFieldType18);
        int int22 = instant3.get(dateTimeFieldType18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(26164);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.Instant instant13 = instant11.plus((long) 2032);
        org.joda.time.Instant instant15 = instant11.minus((long) 26206);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime22 = localTime19.withPeriodAdded(readablePeriod20, (int) (short) 100);
        org.joda.time.LocalTime localTime24 = localTime22.plusMillis(8);
        org.joda.time.LocalTime.Property property25 = localTime22.secondOfMinute();
        org.joda.time.Chronology chronology26 = localTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.dayOfYear();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay(10L, chronology26);
        org.joda.time.DateTime dateTime29 = instant15.toDateTime(chronology26);
        org.joda.time.DateTime dateTime30 = dateTime8.toDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant11", (dateTime8.compareTo(instant11) == 0) == dateTime8.equals(instant11));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        timeZone3.setID("Etc/UTC");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        int int8 = timeZone3.getOffset((long) 52);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        timeZone12.setID("Etc/UTC");
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone12, locale15);
        boolean boolean17 = timeZone3.hasSameRules(timeZone12);
        timeZone12.setID("\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar16", (calendar6.compareTo(calendar16) == 0) == calendar6.equals(calendar16));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMinutes((int) 'u');
        int int6 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusDays(365);
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.yearOfEra();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTime();
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        int int13 = property9.getDifference((org.joda.time.ReadableInstant) instant10);
        org.joda.time.LocalDateTime localDateTime14 = property9.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime11", (instant10.compareTo(mutableDateTime11) == 0) == instant10.equals(mutableDateTime11));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        java.util.Date date4 = dateTime3.toDate();
        org.joda.time.Instant instant5 = dateTime3.toInstant();
        int int6 = dateTime3.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant5", (dateTime3.compareTo(instant5) == 0) == dateTime3.equals(instant5));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant0.plus(readableDuration2);
        org.joda.time.Instant instant6 = instant3.withDurationAdded((long) 26200, 26186);
        org.joda.time.MutableDateTime mutableDateTime7 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant9 = instant3.withMillis((long) 26217);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears((int) (byte) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withMillisOfSecond(59);
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime9 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology10 = dateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withPeriodAdded(readablePeriod17, 26163);
        org.joda.time.Chronology chronology20 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime7.toMutableDateTime(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime23", (dateTime7.compareTo(mutableDateTime23) == 0) == dateTime7.equals(mutableDateTime23));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant10 = instant6.minus((long) 26202);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.centuryOfEra();
        org.joda.time.DurationField durationField8 = chronology5.weeks();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.weekyear();
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(obj0, chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField10", Math.signum(durationField8.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField8)));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime3.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        int int12 = localDateTime10.getDayOfYear();
        org.joda.time.Chronology chronology13 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.dayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime3.toDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime18 = dateTime3.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime17", (dateTime3.compareTo(dateTime17) == 0) == dateTime3.equals(dateTime17));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property13 = dateTime5.year();
        org.joda.time.Instant instant14 = dateTime5.toInstant();
        org.joda.time.Instant instant15 = instant14.toInstant();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant15.minus(readableDuration16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant17", (dateTime5.compareTo(instant17) == 0) == dateTime5.equals(instant17));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readablePeriod12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        long long18 = dateTimeZone16.nextTransition((long) ' ');
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 26169, dateTimeZone16);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = instant6.toMutableDateTime(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.DateTime dateTime6 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute((int) (short) 0);
        int int12 = localDateTime11.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int14 = localDateTime11.get(dateTimeFieldType13);
        int int15 = dateTime6.get(dateTimeFieldType13);
        org.joda.time.Instant instant16 = dateTime6.toInstant();
        org.joda.time.Instant instant18 = instant16.withMillis(1123200000L);
        org.joda.time.MutableDateTime mutableDateTime19 = instant18.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant16", (dateTime6.compareTo(instant16) == 0) == dateTime6.equals(instant16));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant8.minus(readableDuration9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant10", (dateTime5.compareTo(instant10) == 0) == dateTime5.equals(instant10));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Chronology chronology13 = dateTime5.getChronology();
        org.joda.time.DateTime.Property property14 = dateTime5.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfMinute();
        org.joda.time.DateTime dateTime22 = dateTime18.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        java.lang.String str25 = dateTimeFieldType23.toString();
        int int26 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime28 = dateTime22.plusYears(26172);
        boolean boolean29 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        int int33 = localDateTime31.getDayOfYear();
        org.joda.time.Chronology chronology34 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.hourOfDay();
        org.joda.time.DateTime dateTime37 = dateTime15.toDateTime(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime37", (dateTime5.compareTo(dateTime37) == 0) == dateTime5.equals(dateTime37));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) 2032);
        org.joda.time.Instant instant4 = instant0.minus((long) 26206);
        org.joda.time.DateTime dateTime5 = instant0.toDateTimeISO();
        org.joda.time.Instant instant8 = instant0.withDurationAdded(90943200032L, 26228);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 26194153);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.minusMonths(7);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(26169);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime14 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        int int18 = dateTime16.getSecondOfDay();
        org.joda.time.DateTime dateTime20 = dateTime16.minusMonths((int) 'a');
        boolean boolean21 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property22 = dateTime14.year();
        org.joda.time.Instant instant23 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime24 = localDate8.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Instant instant26 = instant23.plus(126000000L);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.minus(readableDuration27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant23", (dateTime14.compareTo(instant23) == 0) == dateTime14.equals(instant23));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime1.weekyear();
        java.lang.String str5 = dateTime1.toString();
        org.joda.time.Instant instant6 = dateTime1.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime1.minusYears(99);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant6", (dateTime1.compareTo(instant6) == 0) == dateTime1.equals(instant6));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        int int11 = localDateTime9.getDayOfYear();
        org.joda.time.Chronology chronology12 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfYear();
        boolean boolean14 = durationFieldType7.isSupported(chronology12);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(chronology12);
        org.joda.time.DurationField durationField16 = chronology12.years();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime3.toMutableDateTime(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMinutes((int) 'u');
        int int6 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusDays(365);
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.yearOfEra();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTime();
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        int int13 = property9.getDifference((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology14 = instant10.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime11", (instant10.compareTo(mutableDateTime11) == 0) == instant10.equals(mutableDateTime11));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 26181);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant3.plus(readableDuration4);
        org.joda.time.Instant instant7 = instant3.minus((long) 48);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getNameKey(0L);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 2, dateTimeZone10);
        long long15 = dateTimeZone10.nextTransition((long) 32769);
        long long17 = dateTimeZone10.previousTransition(2262297600000L);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) instant3, dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant21 = instant3.withDurationAdded(readableDuration19, (-37985));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime18", (instant21.compareTo(dateTime18) == 0) == instant21.equals(dateTime18));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.minus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime9 = dateTime4.plusYears(26168842);
        org.joda.time.DateTime dateTime11 = dateTime4.withYear(26194);
        int int12 = dateTime11.getEra();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        int int16 = localDateTime14.getDayOfYear();
        org.joda.time.Chronology chronology17 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.days();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.year();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.dayOfMonth();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime11.toMutableDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(0L, chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime22", (dateTime11.compareTo(mutableDateTime22) == 0) == dateTime11.equals(mutableDateTime22));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTimeISO();
        int int10 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime6);
        boolean boolean11 = dateTime2.isAfterNow();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime17 = localTime14.withPeriodAdded(readablePeriod15, (int) (short) 100);
        org.joda.time.LocalTime localTime19 = localTime17.plusMillis(8);
        org.joda.time.LocalTime localTime21 = localTime17.minusMillis(14);
        org.joda.time.LocalTime localTime23 = localTime21.minusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfSecond(0);
        org.joda.time.LocalTime localTime27 = localTime23.withMillisOfDay(29);
        org.joda.time.Chronology chronology28 = localTime23.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime2.toDateTime(chronology28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 835, chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime29", (dateTime2.compareTo(dateTime29) == 0) == dateTime2.equals(dateTime29));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        java.util.Date date5 = localDate2.toDate();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        org.joda.time.DateTime.Property property9 = dateTime7.secondOfMinute();
        org.joda.time.DateTime dateTime11 = dateTime7.withCenturyOfEra((int) ' ');
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime11.plusWeeks(23);
        java.util.Date date15 = dateTime11.toDate();
        boolean boolean16 = date5.before(date15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.setCopy((int) (short) 1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime10 = dateTime6.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        java.lang.String str13 = dateTimeFieldType11.toString();
        int int14 = dateTime10.get(dateTimeFieldType11);
        int int15 = dateTime10.getMonthOfYear();
        int int16 = property2.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime.Property property18 = dateTime10.property(dateTimeFieldType17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property25 = dateTime22.minuteOfDay();
        org.joda.time.DateTime dateTime27 = dateTime22.plusYears(26168842);
        org.joda.time.DateTime dateTime29 = dateTime22.withYear(26194);
        int int30 = dateTime29.getEra();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.hourOfDay();
        int int34 = localDateTime32.getDayOfYear();
        org.joda.time.Chronology chronology35 = localDateTime32.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.days();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.year();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.dayOfMonth();
        org.joda.time.DurationField durationField39 = chronology35.hours();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime29.toMutableDateTime(chronology35);
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType17.getField(chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and mutableDateTime40", (dateTime29.compareTo(mutableDateTime40) == 0) == dateTime29.equals(mutableDateTime40));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.withSecondOfMinute(1);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime8.getZone();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval14 = localDate11.toInterval();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate11.minus(readablePeriod15);
        org.joda.time.LocalDate.Property property17 = localDate11.era();
        boolean boolean18 = property17.isLeap();
        org.joda.time.LocalDate localDate19 = property17.roundHalfFloorCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.Instant instant22 = instant20.plus((long) 2032);
        org.joda.time.Instant instant24 = instant20.minus((long) 26206);
        org.joda.time.DateTime dateTime25 = instant20.toDateTimeISO();
        org.joda.time.DateTime dateTime26 = localDate19.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = dateTimeZone10.equals((java.lang.Object) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant20", (dateTime1.compareTo(instant20) == 0) == dateTime1.equals(instant20));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusMonths((int) 'a');
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfEra();
        org.joda.time.DateTime.Property property7 = dateTime5.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime9.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withPeriodAdded(readablePeriod14, 26163);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.plusMillis(7);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusSeconds(26164);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int22 = localDateTime18.get(dateTimeFieldType21);
        int int23 = dateTime5.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime25 = dateTime5.minusMinutes((int) (byte) 0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime5);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.lang.String str29 = dateTimeZone28.toString();
        java.lang.String str31 = dateTimeZone28.getShortName((long) 32772);
        long long33 = dateTimeZone28.previousTransition((long) (byte) 100);
        java.util.Locale locale38 = new java.util.Locale("\u65e5\u672c\u8a9e", "20", "\u4e2d\u6587\u4e2d\u56fd)");
        java.lang.String str39 = dateTimeZone28.getShortName((long) 31, locale38);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property45 = localDateTime41.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime41.withPeriodAdded(readablePeriod46, 26163);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = localDateTime48.toString(dateTimeFormatter49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime48.yearOfEra();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime48.withEra((int) (byte) 0);
        boolean boolean54 = dateTimeZone28.isLocalDateTimeGap(localDateTime48);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime5.toMutableDateTime(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant26", (dateTime5.compareTo(instant26) == 0) == dateTime5.equals(instant26));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.withSecondOfMinute(1);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis(355L);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        int int16 = localDateTime14.getDayOfYear();
        org.joda.time.Chronology chronology17 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology17.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology17.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime12.toMutableDateTime(chronology17);
        org.joda.time.DateTimeField dateTimeField23 = chronology17.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime22", (dateTime8.compareTo(mutableDateTime22) == 0) == dateTime8.equals(mutableDateTime22));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 26164);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) 26176946);
        java.util.Calendar.Builder builder6 = builder2.setLenient(false);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        int int10 = localDateTime8.getDayOfYear();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DurationField durationField14 = dateTimeField13.getRangeDurationField();
        org.joda.time.DurationField durationField15 = dateTimeField13.getLeapDurationField();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        timeZone20.setID("Etc/UTC");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone20, locale23);
        java.lang.String str25 = dateTimeField13.getAsShortText(26193, locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleKeys();
        java.util.Calendar.Builder builder27 = builder6.setLocale(locale23);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.toString();
        java.util.TimeZone timeZone31 = dateTimeZone29.toTimeZone();
        java.time.ZoneId zoneId32 = timeZone31.toZoneId();
        java.util.Locale locale34 = new java.util.Locale("+00:00");
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.lang.String str38 = locale34.getDisplayName(locale37);
        java.util.Locale.setDefault(locale37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getEra();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfMinute();
        org.joda.time.DateTime dateTime45 = dateTime41.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property46 = dateTime45.secondOfDay();
        java.util.Locale locale47 = java.util.Locale.PRC;
        boolean boolean48 = dateTime45.equals((java.lang.Object) locale47);
        java.lang.String str49 = locale37.getDisplayCountry(locale47);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone31, locale47);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        boolean boolean56 = timeZone53.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone53);
        boolean boolean58 = timeZone31.hasSameRules(timeZone53);
        java.util.Calendar.Builder builder59 = builder6.setTimeZone(timeZone31);
        java.util.Locale locale60 = java.util.Locale.PRC;
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone31, locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar50", (calendar24.compareTo(calendar50) == 0) == calendar24.equals(calendar50));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 26164);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) 26176946);
        java.util.Calendar.Builder builder6 = builder2.setLenient(false);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        int int10 = localDateTime8.getDayOfYear();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DurationField durationField14 = dateTimeField13.getRangeDurationField();
        org.joda.time.DurationField durationField15 = dateTimeField13.getLeapDurationField();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        timeZone20.setID("Etc/UTC");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone20, locale23);
        java.lang.String str25 = dateTimeField13.getAsShortText(26193, locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleKeys();
        java.util.Calendar.Builder builder27 = builder6.setLocale(locale23);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.toString();
        java.util.TimeZone timeZone31 = dateTimeZone29.toTimeZone();
        java.time.ZoneId zoneId32 = timeZone31.toZoneId();
        java.util.Locale locale34 = new java.util.Locale("+00:00");
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.lang.String str38 = locale34.getDisplayName(locale37);
        java.util.Locale.setDefault(locale37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getEra();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfMinute();
        org.joda.time.DateTime dateTime45 = dateTime41.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property46 = dateTime45.secondOfDay();
        java.util.Locale locale47 = java.util.Locale.PRC;
        boolean boolean48 = dateTime45.equals((java.lang.Object) locale47);
        java.lang.String str49 = locale37.getDisplayCountry(locale47);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone31, locale47);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        boolean boolean56 = timeZone53.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone53);
        boolean boolean58 = timeZone31.hasSameRules(timeZone53);
        java.util.Calendar.Builder builder59 = builder6.setTimeZone(timeZone31);
        java.util.TimeZone timeZone60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone60);
        java.util.TimeZone timeZone62 = dateTimeZone61.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        boolean boolean65 = timeZone62.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone62);
        boolean boolean67 = timeZone31.hasSameRules(timeZone62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar50", (calendar24.compareTo(calendar50) == 0) == calendar24.equals(calendar50));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(chronology14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone17.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime15.toMutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology22 = chronology4.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.joda.time.DurationField durationField24 = chronology22.years();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.hourOfDay();
        org.joda.time.DurationField durationField27 = chronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField23, and durationField24", !(durationField27.compareTo(durationField23) == 0) || (Math.signum(durationField27.compareTo(durationField24)) == Math.signum(durationField23.compareTo(durationField24))));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.centuryOfEra();
        org.joda.time.DurationField durationField7 = chronology4.weeks();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.weekyear();
        org.joda.time.DurationField durationField9 = chronology4.eras();
        long long13 = chronology4.add(1645514198000L, (long) 5, (-661182326));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withFieldAdded(durationFieldType7, 0);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        int int13 = localDateTime11.getDayOfYear();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.minuteOfHour();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property23 = dateTime20.minuteOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime20.toDateTime(chronology24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        long long30 = dateTimeZone27.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime25.toMutableDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology32 = chronology14.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField33 = chronology32.hours();
        boolean boolean34 = durationFieldType7.isSupported(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.weekyearOfCentury();
        org.joda.time.DurationField durationField36 = chronology32.weekyears();
        org.joda.time.DurationField durationField37 = durationFieldType0.getField(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField33, and durationField36", !(durationField37.compareTo(durationField33) == 0) || (Math.signum(durationField37.compareTo(durationField36)) == Math.signum(durationField33.compareTo(durationField36))));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.roundFloorCopy();
        org.joda.time.LocalDate localDate5 = localDate3.withDayOfWeek(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate5.isSupported(dateTimeFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate5.minus(readablePeriod8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra(100);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.toString();
        java.lang.String str19 = dateTimeZone16.getShortName((long) 32772);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property22 = localDate21.centuryOfEra();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.LocalDate localDate24 = property22.roundHalfEvenCopy();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.minus(readablePeriod27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) localDate24, dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDate14.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = localDate5.toDateMidnight(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours(9);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = localDate5.toDateTimeAtStartOfDay(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime37", (dateTime26.compareTo(dateTime37) == 0) == dateTime26.equals(dateTime37));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 26164);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) 26176946);
        java.util.Calendar.Builder builder6 = builder2.setLenient(false);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        int int10 = localDateTime8.getDayOfYear();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DurationField durationField14 = dateTimeField13.getRangeDurationField();
        org.joda.time.DurationField durationField15 = dateTimeField13.getLeapDurationField();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        timeZone20.setID("Etc/UTC");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone20, locale23);
        java.lang.String str25 = dateTimeField13.getAsShortText(26193, locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleKeys();
        java.util.Calendar.Builder builder27 = builder6.setLocale(locale23);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.toString();
        java.util.TimeZone timeZone31 = dateTimeZone29.toTimeZone();
        java.time.ZoneId zoneId32 = timeZone31.toZoneId();
        java.util.Locale locale34 = new java.util.Locale("+00:00");
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.lang.String str38 = locale34.getDisplayName(locale37);
        java.util.Locale.setDefault(locale37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getEra();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfMinute();
        org.joda.time.DateTime dateTime45 = dateTime41.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property46 = dateTime45.secondOfDay();
        java.util.Locale locale47 = java.util.Locale.PRC;
        boolean boolean48 = dateTime45.equals((java.lang.Object) locale47);
        java.lang.String str49 = locale37.getDisplayCountry(locale47);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone31, locale47);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        boolean boolean56 = timeZone53.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone53);
        boolean boolean58 = timeZone31.hasSameRules(timeZone53);
        java.util.Calendar.Builder builder59 = builder6.setTimeZone(timeZone31);
        java.util.Calendar.Builder builder63 = builder59.setWeekDate(26199, 399, 26297);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar50", (calendar24.compareTo(calendar50) == 0) == calendar24.equals(calendar50));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        calendar0.clear();
        calendar0.clear();
        calendar0.setMinimalDaysInFirstWeek((int) (short) 1);
        java.time.Instant instant8 = calendar0.toInstant();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        timeZone12.setID("Etc/UTC");
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone12);
        int int17 = timeZone12.getOffset((long) 52);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str20 = dateTimeZone19.toString();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        timeZone21.setID("Etc/UTC");
        java.util.Locale locale24 = java.util.Locale.ROOT;
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone21, locale24);
        boolean boolean26 = timeZone12.hasSameRules(timeZone21);
        boolean boolean27 = timeZone12.observesDaylightTime();
        calendar0.setTimeZone(timeZone12);
        int int30 = timeZone12.getOffset(26196657L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar25", (calendar15.compareTo(calendar25) == 0) == calendar15.equals(calendar25));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.year();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.minuteOfDay();
        org.joda.time.DurationField durationField9 = chronology4.months();
        org.joda.time.DurationField durationField10 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField9", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(4);
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime10.plusHours((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.era();
        boolean boolean15 = dateTime13.isSupported(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(295);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone17);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime18", (dateTime13.compareTo(dateTime18) == 0) == dateTime13.equals(dateTime18));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 26164);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) 26176946);
        java.util.Calendar.Builder builder6 = builder2.setLenient(false);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        int int10 = localDateTime8.getDayOfYear();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DurationField durationField14 = dateTimeField13.getRangeDurationField();
        org.joda.time.DurationField durationField15 = dateTimeField13.getLeapDurationField();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        timeZone20.setID("Etc/UTC");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone20, locale23);
        java.lang.String str25 = dateTimeField13.getAsShortText(26193, locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleKeys();
        java.util.Calendar.Builder builder27 = builder6.setLocale(locale23);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.toString();
        java.util.TimeZone timeZone31 = dateTimeZone29.toTimeZone();
        java.time.ZoneId zoneId32 = timeZone31.toZoneId();
        java.util.Locale locale34 = new java.util.Locale("+00:00");
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.lang.String str38 = locale34.getDisplayName(locale37);
        java.util.Locale.setDefault(locale37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getEra();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfMinute();
        org.joda.time.DateTime dateTime45 = dateTime41.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property46 = dateTime45.secondOfDay();
        java.util.Locale locale47 = java.util.Locale.PRC;
        boolean boolean48 = dateTime45.equals((java.lang.Object) locale47);
        java.lang.String str49 = locale37.getDisplayCountry(locale47);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone31, locale47);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        boolean boolean56 = timeZone53.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone53);
        boolean boolean58 = timeZone31.hasSameRules(timeZone53);
        java.util.Calendar.Builder builder59 = builder6.setTimeZone(timeZone31);
        java.util.Calendar.Builder builder61 = builder6.setInstant((-26291000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar50", (calendar24.compareTo(calendar50) == 0) == calendar24.equals(calendar50));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime6 = localTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis(8);
        org.joda.time.LocalTime.Property property9 = localTime6.secondOfMinute();
        org.joda.time.Chronology chronology10 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfYear();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(10L, chronology10);
        org.joda.time.DurationField durationField13 = chronology10.weekyears();
        org.joda.time.DurationField durationField14 = chronology10.years();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField14", (durationField13.compareTo(durationField14) == 0) == durationField13.equals(durationField14));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withFieldAdded(durationFieldType8, 0);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        int int14 = localDateTime12.getDayOfYear();
        org.joda.time.Chronology chronology15 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.minuteOfHour();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property24 = dateTime21.minuteOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.toDateTime(chronology25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        long long31 = dateTimeZone28.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime26.toMutableDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology33 = chronology15.withZone(dateTimeZone28);
        org.joda.time.DurationField durationField34 = chronology33.hours();
        boolean boolean35 = durationFieldType8.isSupported(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekyearOfCentury();
        org.joda.time.DurationField durationField37 = chronology33.days();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (short) 10, chronology33);
        org.joda.time.DateTimeField dateTimeField39 = chronology33.minuteOfDay();
        org.joda.time.DurationField durationField40 = durationFieldType0.getField(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField34, and durationField37", !(durationField40.compareTo(durationField34) == 0) || (Math.signum(durationField40.compareTo(durationField37)) == Math.signum(durationField34.compareTo(durationField37))));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusMonths((int) 'a');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property11 = localTime8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours(9);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localTime8.toDateTimeToday(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime5.toMutableDateTime(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime14", (dateTime1.compareTo(dateTime14) == 0) == dateTime1.equals(dateTime14));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        timeZone3.setID("Etc/UTC");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        int int8 = timeZone3.getOffset((long) 52);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        timeZone12.setID("Etc/UTC");
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone12, locale15);
        boolean boolean17 = timeZone3.hasSameRules(timeZone12);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        boolean boolean23 = timeZone20.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str28 = dateTimeZone27.toString();
        java.util.TimeZone timeZone29 = dateTimeZone27.toTimeZone();
        timeZone29.setID("Etc/UTC");
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone29);
        boolean boolean33 = timeZone20.hasSameRules(timeZone29);
        boolean boolean34 = timeZone20.observesDaylightTime();
        java.util.Locale locale36 = new java.util.Locale("+00:00");
        java.util.Locale locale37 = java.util.Locale.GERMANY;
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone20, locale36);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone3, locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar39", (calendar6.compareTo(calendar39) == 0) == calendar6.equals(calendar39));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        boolean boolean7 = property6.isLeap();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy(6);
        org.joda.time.DateTimeField dateTimeField10 = property6.getField();
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        int int12 = dateTimeField10.getMaximumShortTextLength(locale11);
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate16 = localDate14.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval17 = localDate14.toInterval();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate14.minus(readablePeriod18);
        org.joda.time.LocalDate.Property property20 = localDate14.era();
        boolean boolean21 = property20.isLeap();
        org.joda.time.LocalDate localDate23 = property20.addWrapFieldToCopy(6);
        org.joda.time.DateTimeField dateTimeField24 = property20.getField();
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        int int26 = dateTimeField24.getMaximumShortTextLength(locale25);
        java.util.Set<java.lang.String> strSet27 = locale25.getUnicodeLocaleAttributes();
        boolean boolean28 = strSet13.containsAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.fromCalendarFields(calendar29);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.fromCalendarFields(calendar29);
        int int32 = calendar29.getMinimalDaysInFirstWeek();
        calendar29.clear();
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.util.TimeZone timeZone36 = dateTimeZone35.toTimeZone();
        boolean boolean37 = timeZone36.observesDaylightTime();
        java.time.ZoneId zoneId38 = timeZone36.toZoneId();
        int int39 = timeZone36.getRawOffset();
        calendar29.setTimeZone(timeZone36);
        java.time.Instant instant41 = calendar29.toInstant();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance();
        calendar42.setTimeInMillis((-2182719659000L));
        calendar42.clear();
        calendar42.setLenient(false);
        java.time.Instant instant48 = calendar42.toInstant();
        java.util.Date date52 = new java.util.Date(10, (int) (byte) -1, (-1));
        java.time.Instant instant53 = date52.toInstant();
        java.util.Date date54 = java.util.Date.from(instant53);
        java.time.temporal.TemporalAdjuster[] temporalAdjusterArray55 = new java.time.temporal.TemporalAdjuster[] { instant41, instant48, instant53 };
        java.time.temporal.TemporalAdjuster[] temporalAdjusterArray56 = strSet13.toArray(temporalAdjusterArray55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar42", (calendar29.compareTo(calendar42) == 0) == calendar29.equals(calendar42));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 26173, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology5.weekyears();
        org.joda.time.DurationFieldType durationFieldType11 = durationField10.getType();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime17 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        int int21 = dateTime19.getSecondOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.minusMonths((int) 'a');
        boolean boolean24 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology25 = dateTime17.getChronology();
        boolean boolean26 = durationFieldType11.isSupported(chronology25);
        org.joda.time.DurationField durationField27 = chronology25.eras();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology25.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField27", Math.signum(durationField10.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField10)));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setMinimalDaysInFirstWeek(13);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        int int4 = timeZone3.getRawOffset();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3);
        calendar0.setTimeZone(timeZone3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, (int) (short) 100);
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTime dateTime23 = dateTime20.toDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = dateTime10.toDateTime(dateTimeZone22);
        java.util.Locale locale28 = new java.util.Locale("\u5354\u8abf\u4e16\u754c\u6642\u9593", "millisOfSecond");
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleAttributes();
        java.lang.String str30 = dateTime10.toString("\u4e2d\u56fd", locale28);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone3, locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar5", (calendar0.compareTo(calendar5) == 0) == calendar0.equals(calendar5));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime.Property property4 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property4.addToCopy(11);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, 16);
        java.lang.String str12 = dateTimeZone10.getNameKey(663224820000L);
        long long15 = dateTimeZone10.convertLocalToUTC(10L, true);
        java.lang.String str16 = dateTimeZone10.toString();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime7.toMutableDateTime(dateTimeZone10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property24 = dateTime21.minuteOfDay();
        org.joda.time.DateTime dateTime26 = dateTime21.withSecondOfMinute(1);
        org.joda.time.DateTime.Property property27 = dateTime26.year();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        long long30 = dateTimeZone10.getMillisKeepLocal(dateTimeZone28, (long) 26270);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime17", (dateTime6.compareTo(mutableDateTime17) == 0) == dateTime6.equals(mutableDateTime17));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.days();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plus(readableDuration13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        int int18 = localDateTime16.getDayOfYear();
        org.joda.time.Chronology chronology19 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.hourOfDay();
        int int23 = localDateTime21.getDayOfYear();
        org.joda.time.Chronology chronology24 = localDateTime21.getChronology();
        int[] intArray26 = chronology19.get((org.joda.time.ReadablePartial) localDateTime21, (long) 1);
        chronology5.validate((org.joda.time.ReadablePartial) localDateTime8, intArray26);
        org.joda.time.DurationField durationField28 = chronology5.eras();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(94359600000L, chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField28", Math.signum(durationField6.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField6)));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setMinimalDaysInFirstWeek(13);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        boolean boolean4 = calendar0.isWeekDateSupported();
        java.util.TimeZone timeZone5 = calendar0.getTimeZone();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone5, locale7);
        int int10 = timeZone5.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar9", (calendar0.compareTo(calendar9) == 0) == calendar0.equals(calendar9));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(4);
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime10.plusHours((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.era();
        boolean boolean15 = dateTime13.isSupported(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(295);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone17);
        long long20 = dateTimeZone17.previousTransition((long) 26254);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime18", (dateTime13.compareTo(dateTime18) == 0) == dateTime13.equals(dateTime18));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.hourOfDay();
        org.joda.time.DurationField durationField7 = dateTimeField6.getRangeDurationField();
        org.joda.time.DurationField durationField8 = dateTimeField6.getLeapDurationField();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.toString();
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        timeZone13.setID("Etc/UTC");
        java.util.Locale locale16 = java.util.Locale.ROOT;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone13, locale16);
        java.lang.String str18 = dateTimeField6.getAsShortText(26193, locale16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getEra();
        org.joda.time.DateTime.Property property23 = dateTime21.secondOfMinute();
        java.lang.String str24 = property23.getAsText();
        org.joda.time.DateTimeField dateTimeField25 = property23.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = dateTimeField25.getType();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        int int30 = localDateTime28.getDayOfYear();
        org.joda.time.Chronology chronology31 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property38 = localDateTime34.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.plus(readableDuration39);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.hourOfDay();
        int int44 = localDateTime42.getDayOfYear();
        org.joda.time.Chronology chronology45 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.hourOfDay();
        int int49 = localDateTime47.getDayOfYear();
        org.joda.time.Chronology chronology50 = localDateTime47.getChronology();
        int[] intArray52 = chronology45.get((org.joda.time.ReadablePartial) localDateTime47, (long) 1);
        chronology31.validate((org.joda.time.ReadablePartial) localDateTime34, intArray52);
        java.util.Locale locale55 = new java.util.Locale("Etc/UTC");
        java.lang.String str56 = dateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime34, locale55);
        java.lang.String str58 = locale55.getUnicodeLocaleType("34");
        boolean boolean59 = locale55.hasExtensions();
        java.lang.String str60 = locale55.getCountry();
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(locale55);
        java.lang.String str62 = dateTimeField6.getAsShortText(26270, locale55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar61", (calendar17.compareTo(calendar61) == 0) == calendar17.equals(calendar61));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        calendar0.clear();
        calendar0.clear();
        calendar0.roll(10, true);
        calendar0.setTimeInMillis((long) 7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.fromCalendarFields(calendar11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromCalendarFields(calendar11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.LocalDate.Property property16 = localDate13.year();
        boolean boolean17 = calendar0.before((java.lang.Object) property16);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.fromCalendarFields(calendar18);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromCalendarFields(calendar18);
        int int21 = calendar18.getMinimalDaysInFirstWeek();
        calendar18.set(0, (-41), 23600, 26205, 26188, 26175);
        calendar18.setMinimalDaysInFirstWeek(0);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.util.TimeZone.setDefault(timeZone33);
        int int37 = timeZone33.getRawOffset();
        calendar18.setTimeZone(timeZone33);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone33);
        calendar0.setTimeZone(timeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar39", (calendar11.compareTo(calendar39) == 0) == calendar11.equals(calendar39));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusYears(32772);
        org.joda.time.DateTime.Property property4 = dateTime1.weekOfWeekyear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology10);
        org.joda.time.DateTime dateTime12 = dateTime6.withFields((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.LocalTime localTime14 = localTime11.plusMillis(4);
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday();
        org.joda.time.LocalTime.Property property16 = localTime11.hourOfDay();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        int int18 = property16.getMaximumShortTextLength(locale17);
        java.lang.String str19 = locale17.getDisplayCountry();
        java.lang.String str20 = property4.getAsText(locale17);
        org.joda.time.DurationField durationField21 = property4.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField22 = property4.getField();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("1 Jan 1970 01:56:59 GMT");
        java.util.Locale locale25 = java.util.Locale.CHINESE;
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getEra();
        org.joda.time.DateTime.Property property30 = dateTime28.secondOfMinute();
        org.joda.time.DateTime dateTime32 = dateTime28.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property33 = dateTime32.secondOfDay();
        java.util.Locale locale34 = java.util.Locale.PRC;
        boolean boolean35 = dateTime32.equals((java.lang.Object) locale34);
        java.lang.String str36 = locale34.getISO3Language();
        java.lang.String str37 = locale34.getDisplayCountry();
        java.lang.String str38 = locale34.getLanguage();
        java.lang.String str39 = locale25.getDisplayScript(locale34);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone24, locale34);
        int int41 = dateTimeField22.getMaximumShortTextLength(locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar40", (calendar26.compareTo(calendar40) == 0) == calendar26.equals(calendar40));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale2 = new java.util.Locale("");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale0.getDisplayLanguage(locale2);
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleAttributes();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        boolean boolean11 = timeZone8.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str16 = dateTimeZone15.toString();
        java.util.TimeZone timeZone17 = dateTimeZone15.toTimeZone();
        timeZone17.setID("Etc/UTC");
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone17);
        boolean boolean21 = timeZone8.hasSameRules(timeZone17);
        boolean boolean22 = timeZone8.observesDaylightTime();
        java.util.Locale locale24 = new java.util.Locale("+00:00");
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.lang.String str26 = locale24.getDisplayCountry(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone8, locale24);
        java.lang.String str28 = locale0.getDisplayCountry(locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar20 and calendar27", (calendar20.compareTo(calendar27) == 0) == calendar20.equals(calendar27));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        timeZone3.setID("Etc/UTC");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        int int8 = timeZone3.getOffset((long) 52);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        timeZone12.setID("Etc/UTC");
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone12, locale15);
        boolean boolean17 = timeZone3.hasSameRules(timeZone12);
        timeZone12.setID("44_2022-02-22T07:16:14.603Z");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar16", (calendar6.compareTo(calendar16) == 0) == calendar6.equals(calendar16));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        timeZone3.setID("Etc/UTC");
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone3, locale6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        int int10 = dateTime9.getEra();
        org.joda.time.DateTime.Property property11 = dateTime9.secondOfMinute();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        long long15 = dateTimeField13.roundFloor((long) (byte) 10);
        java.lang.String str16 = dateTimeField13.getName();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getEra();
        org.joda.time.DateTime.Property property23 = dateTime21.secondOfMinute();
        org.joda.time.DateTime dateTime25 = dateTime21.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property26 = dateTime25.secondOfDay();
        java.util.Locale locale27 = java.util.Locale.PRC;
        boolean boolean28 = dateTime25.equals((java.lang.Object) locale27);
        java.lang.String str29 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localTime19, locale27);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(locale27);
        java.lang.String str31 = locale6.getDisplayVariant(locale27);
        java.lang.String str32 = locale27.getDisplayCountry();
        java.util.Set<java.lang.String> strSet33 = locale27.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar30", (calendar7.compareTo(calendar30) == 0) == calendar7.equals(calendar30));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.util.Date date5 = new java.util.Date(15, (int) '4', 26167, (int) (short) 1, 26167);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.monthOfYear();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.minuteOfDay();
        org.joda.time.DurationField durationField11 = chronology7.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfDay();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean12 = timeZone9.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.toString();
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        timeZone18.setID("Etc/UTC");
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone18);
        boolean boolean22 = timeZone9.hasSameRules(timeZone18);
        boolean boolean23 = timeZone9.observesDaylightTime();
        java.util.Locale locale25 = new java.util.Locale("+00:00");
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone9, locale25);
        int int29 = property6.getMaximumShortTextLength(locale25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar28", (calendar21.compareTo(calendar28) == 0) == calendar21.equals(calendar28));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean3 = timeZone2.observesDaylightTime();
        int int4 = timeZone2.getRawOffset();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        int int8 = localDateTime6.getDayOfYear();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        int int13 = localDateTime11.getDayOfYear();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        int[] intArray16 = chronology9.get((org.joda.time.ReadablePartial) localDateTime11, (long) 1);
        org.joda.time.DateTimeField dateTimeField17 = chronology9.dayOfWeek();
        java.lang.String str19 = dateTimeField17.getAsShortText((long) (-1));
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.lang.String str23 = locale22.getISO3Country();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale locale25 = builder24.build();
        java.lang.String str26 = locale22.getDisplayCountry(locale25);
        java.util.Locale locale27 = locale22.stripExtensions();
        java.lang.String str28 = dateTimeField17.getAsText(117L, locale22);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone2, locale22);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale32 = new java.util.Locale("+00:00");
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.lang.String str35 = locale33.getScript();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone2, locale33);
        int int37 = timeZone2.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar36", (calendar29.compareTo(calendar36) == 0) == calendar29.equals(calendar36));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone.setDefault(timeZone2);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval9 = localDate6.toInterval();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate6.minus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate6.era();
        boolean boolean13 = property12.isLeap();
        org.joda.time.LocalDate localDate15 = property12.addWrapFieldToCopy(6);
        int int16 = property12.getMinimumValueOverall();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfMinute();
        long long21 = property20.remainder();
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = property20.getAsShortText(locale22);
        java.lang.String str24 = property12.getAsShortText(locale22);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone2, locale22);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("1 Jan 1970 01:56:59 GMT");
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(locale28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        int int32 = dateTime31.getEra();
        org.joda.time.DateTime.Property property33 = dateTime31.secondOfMinute();
        org.joda.time.DateTime dateTime35 = dateTime31.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property36 = dateTime35.secondOfDay();
        java.util.Locale locale37 = java.util.Locale.PRC;
        boolean boolean38 = dateTime35.equals((java.lang.Object) locale37);
        java.lang.String str39 = locale37.getISO3Language();
        java.lang.String str40 = locale37.getDisplayCountry();
        java.lang.String str41 = locale37.getLanguage();
        java.lang.String str42 = locale28.getDisplayScript(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone27, locale37);
        boolean boolean44 = timeZone2.hasSameRules(timeZone27);
        java.lang.String str45 = timeZone27.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar25 and calendar43", (calendar25.compareTo(calendar43) == 0) == calendar25.equals(calendar43));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime6 = localTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis(8);
        org.joda.time.LocalTime.Property property9 = localTime6.secondOfMinute();
        org.joda.time.Chronology chronology10 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfYear();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(10L, chronology10);
        org.joda.time.DurationField durationField13 = chronology10.weekyears();
        org.joda.time.DurationField durationField14 = chronology10.years();
        org.joda.time.DurationField durationField15 = chronology10.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField14", (durationField13.compareTo(durationField14) == 0) == durationField13.equals(durationField14));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean3 = timeZone2.observesDaylightTime();
        int int4 = timeZone2.getRawOffset();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        int int8 = localDateTime6.getDayOfYear();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        int int13 = localDateTime11.getDayOfYear();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        int[] intArray16 = chronology9.get((org.joda.time.ReadablePartial) localDateTime11, (long) 1);
        org.joda.time.DateTimeField dateTimeField17 = chronology9.dayOfWeek();
        java.lang.String str19 = dateTimeField17.getAsShortText((long) (-1));
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.lang.String str23 = locale22.getISO3Country();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale locale25 = builder24.build();
        java.lang.String str26 = locale22.getDisplayCountry(locale25);
        java.util.Locale locale27 = locale22.stripExtensions();
        java.lang.String str28 = dateTimeField17.getAsText(117L, locale22);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone2, locale22);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale32 = new java.util.Locale("+00:00");
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.lang.String str35 = locale33.getScript();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone2, locale33);
        java.lang.String str37 = timeZone2.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar36", (calendar29.compareTo(calendar36) == 0) == calendar29.equals(calendar36));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(35);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter4.withZone(dateTimeZone9);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(dateTimeZone9);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight(dateTimeZone13);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        boolean boolean19 = timeZone18.observesDaylightTime();
        java.lang.String str20 = timeZone18.getID();
        int int21 = timeZone18.getRawOffset();
        java.util.Calendar.Builder builder22 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder26 = builder22.setDate((int) (byte) 0, 2, 26179);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getEra();
        org.joda.time.DateTime.Property property30 = dateTime28.secondOfMinute();
        java.lang.String str31 = property30.getAsText();
        org.joda.time.DateTimeField dateTimeField32 = property30.getField();
        long long34 = dateTimeField32.roundFloor((long) (byte) 10);
        java.lang.String str35 = dateTimeField32.getName();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        int int41 = dateTime40.getEra();
        org.joda.time.DateTime.Property property42 = dateTime40.secondOfMinute();
        org.joda.time.DateTime dateTime44 = dateTime40.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property45 = dateTime44.secondOfDay();
        java.util.Locale locale46 = java.util.Locale.PRC;
        boolean boolean47 = dateTime44.equals((java.lang.Object) locale46);
        java.lang.String str48 = dateTimeField32.getAsShortText((org.joda.time.ReadablePartial) localTime38, locale46);
        org.joda.time.tz.NameProvider nameProvider49 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology50);
        int int52 = dateTime51.getEra();
        org.joda.time.DateTime.Property property53 = dateTime51.secondOfMinute();
        java.lang.String str54 = property53.getAsText();
        org.joda.time.DateTimeField dateTimeField55 = property53.getField();
        long long57 = dateTimeField55.roundFloor((long) (byte) 10);
        java.lang.String str58 = dateTimeField55.getName();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalTime localTime61 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getEra();
        org.joda.time.DateTime.Property property65 = dateTime63.secondOfMinute();
        org.joda.time.DateTime dateTime67 = dateTime63.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property68 = dateTime67.secondOfDay();
        java.util.Locale locale69 = java.util.Locale.PRC;
        boolean boolean70 = dateTime67.equals((java.lang.Object) locale69);
        java.lang.String str71 = dateTimeField55.getAsShortText((org.joda.time.ReadablePartial) localTime61, locale69);
        java.util.Calendar calendar72 = java.util.Calendar.getInstance(locale69);
        java.lang.String str75 = nameProvider49.getShortName(locale69, "", "UTC");
        java.lang.String str76 = locale46.getDisplayName(locale69);
        java.util.Calendar.Builder builder77 = builder26.setLocale(locale69);
        java.util.Locale locale78 = java.util.Locale.GERMAN;
        java.util.Calendar.Builder builder79 = builder26.setLocale(locale78);
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(timeZone18, locale78);
        boolean boolean81 = localDate11.equals((java.lang.Object) timeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar72 and calendar80", (calendar72.compareTo(calendar80) == 0) == calendar72.equals(calendar80));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Date date4 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int5 = date4.getDate();
        java.lang.String str6 = date4.toGMTString();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date4);
        java.util.Calendar.Builder builder9 = builder7.setLenient(true);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.toString();
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        java.util.Calendar.Builder builder14 = builder9.setTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        boolean boolean18 = timeZone17.observesDaylightTime();
        java.lang.String str19 = timeZone17.getID();
        int int20 = timeZone17.getRawOffset();
        java.util.Calendar.Builder builder21 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder25 = builder21.setDate((int) (byte) 0, 2, 26179);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        int int28 = dateTime27.getEra();
        org.joda.time.DateTime.Property property29 = dateTime27.secondOfMinute();
        java.lang.String str30 = property29.getAsText();
        org.joda.time.DateTimeField dateTimeField31 = property29.getField();
        long long33 = dateTimeField31.roundFloor((long) (byte) 10);
        java.lang.String str34 = dateTimeField31.getName();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        int int40 = dateTime39.getEra();
        org.joda.time.DateTime.Property property41 = dateTime39.secondOfMinute();
        org.joda.time.DateTime dateTime43 = dateTime39.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property44 = dateTime43.secondOfDay();
        java.util.Locale locale45 = java.util.Locale.PRC;
        boolean boolean46 = dateTime43.equals((java.lang.Object) locale45);
        java.lang.String str47 = dateTimeField31.getAsShortText((org.joda.time.ReadablePartial) localTime37, locale45);
        org.joda.time.tz.NameProvider nameProvider48 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology49);
        int int51 = dateTime50.getEra();
        org.joda.time.DateTime.Property property52 = dateTime50.secondOfMinute();
        java.lang.String str53 = property52.getAsText();
        org.joda.time.DateTimeField dateTimeField54 = property52.getField();
        long long56 = dateTimeField54.roundFloor((long) (byte) 10);
        java.lang.String str57 = dateTimeField54.getName();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalTime localTime60 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology61);
        int int63 = dateTime62.getEra();
        org.joda.time.DateTime.Property property64 = dateTime62.secondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime62.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property67 = dateTime66.secondOfDay();
        java.util.Locale locale68 = java.util.Locale.PRC;
        boolean boolean69 = dateTime66.equals((java.lang.Object) locale68);
        java.lang.String str70 = dateTimeField54.getAsShortText((org.joda.time.ReadablePartial) localTime60, locale68);
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(locale68);
        java.lang.String str74 = nameProvider48.getShortName(locale68, "", "UTC");
        java.lang.String str75 = locale45.getDisplayName(locale68);
        java.util.Calendar.Builder builder76 = builder25.setLocale(locale68);
        java.util.Locale locale77 = java.util.Locale.GERMAN;
        java.util.Calendar.Builder builder78 = builder25.setLocale(locale77);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(timeZone17, locale77);
        boolean boolean80 = timeZone13.hasSameRules(timeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar71 and calendar79", (calendar71.compareTo(calendar79) == 0) == calendar71.equals(calendar79));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis((-2182719659000L));
        java.util.Date date6 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int7 = date6.getTimezoneOffset();
        java.util.Date date13 = new java.util.Date(0, 0, 0, 9, (int) '#');
        boolean boolean14 = date6.before(date13);
        calendar0.setTime(date13);
        java.util.TimeZone timeZone16 = calendar0.getTimeZone();
        calendar0.setTimeInMillis((long) 26173);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears(32772);
        org.joda.time.DateTime dateTime24 = dateTime20.plusMinutes((int) 'a');
        org.joda.time.DateTime dateTime26 = dateTime20.plusMonths(0);
        boolean boolean27 = calendar0.after((java.lang.Object) dateTime20);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.lang.String str31 = dateTimeZone30.toString();
        java.util.TimeZone timeZone32 = dateTimeZone30.toTimeZone();
        timeZone32.setID("Etc/UTC");
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone32);
        java.util.Date date42 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date42.setMinutes((int) (short) -1);
        int int45 = date42.getDate();
        calendar35.setTime(date42);
        java.lang.String str47 = date42.toGMTString();
        java.lang.String str48 = date42.toLocaleString();
        calendar0.setTime(date42);
        java.util.Date date53 = new java.util.Date(10, (int) (byte) -1, (-1));
        date53.setHours((int) (byte) 0);
        java.lang.String str56 = date53.toGMTString();
        java.lang.String str57 = date53.toLocaleString();
        int int58 = date42.compareTo(date53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar35", (calendar0.compareTo(calendar35) == 0) == calendar0.equals(calendar35));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.dayOfMonth();
        org.joda.time.DurationField durationField9 = chronology4.eras();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(chronology4);
        org.joda.time.DurationField durationField11 = chronology4.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0L, chronology5);
        org.joda.time.DurationField durationField8 = chronology5.weeks();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField10", Math.signum(durationField8.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField8)));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setMinimalDaysInFirstWeek(13);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        int int4 = timeZone3.getRawOffset();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3);
        calendar0.setTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar5", (calendar0.compareTo(calendar5) == 0) == calendar0.equals(calendar5));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean5 = timeZone2.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        java.util.TimeZone timeZone11 = dateTimeZone9.toTimeZone();
        timeZone11.setID("Etc/UTC");
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        boolean boolean15 = timeZone2.hasSameRules(timeZone11);
        boolean boolean16 = timeZone2.observesDaylightTime();
        java.util.Locale locale18 = new java.util.Locale("+00:00");
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone2, locale18);
        java.util.Locale locale22 = locale18.stripExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar21", (calendar14.compareTo(calendar21) == 0) == calendar14.equals(calendar21));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 26173, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology5.weekyears();
        org.joda.time.DurationFieldType durationFieldType11 = durationField10.getType();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime17 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        int int21 = dateTime19.getSecondOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.minusMonths((int) 'a');
        boolean boolean24 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology25 = dateTime17.getChronology();
        boolean boolean26 = durationFieldType11.isSupported(chronology25);
        org.joda.time.DurationField durationField27 = chronology25.eras();
        org.joda.time.Chronology chronology28 = chronology25.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField27", Math.signum(durationField10.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField10)));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMonths(26164319);
        boolean boolean6 = dateTime5.isEqualNow();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfMinute();
        org.joda.time.DateTime dateTime12 = dateTime8.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        java.lang.String str15 = dateTimeFieldType13.toString();
        int int16 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime dateTime18 = dateTime12.withYearOfCentury(17);
        boolean boolean19 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology21);
        org.joda.time.LocalTime localTime24 = localTime22.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property25 = localTime22.millisOfDay();
        org.joda.time.LocalTime localTime27 = property25.setCopy(5);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(26207);
        long long32 = dateTimeZone29.adjustOffset((long) 26228, true);
        org.joda.time.DateTime dateTime33 = localTime27.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTime dateTime34 = dateTime18.toDateTime(dateTimeZone29);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime34", (dateTime18.compareTo(dateTime34) == 0) == dateTime18.equals(dateTime34));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean5 = timeZone2.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        java.util.TimeZone timeZone11 = dateTimeZone9.toTimeZone();
        timeZone11.setID("Etc/UTC");
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        boolean boolean15 = timeZone2.hasSameRules(timeZone11);
        timeZone11.setRawOffset(26227);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        java.lang.String str21 = dateTimeZone19.getID();
        boolean boolean22 = dateTimeZone19.isFixed();
        java.util.TimeZone timeZone23 = dateTimeZone19.toTimeZone();
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str25 = locale24.getCountry();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale24);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone23, locale24);
        boolean boolean28 = timeZone11.hasSameRules(timeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar26", (calendar14.compareTo(calendar26) == 0) == calendar14.equals(calendar26));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean3 = timeZone2.observesDaylightTime();
        java.lang.String str4 = timeZone2.getID();
        int int5 = timeZone2.getRawOffset();
        java.util.Calendar.Builder builder6 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder10 = builder6.setDate((int) (byte) 0, 2, 26179);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        org.joda.time.DateTime.Property property14 = dateTime12.secondOfMinute();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DateTimeField dateTimeField16 = property14.getField();
        long long18 = dateTimeField16.roundFloor((long) (byte) 10);
        java.lang.String str19 = dateTimeField16.getName();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        int int25 = dateTime24.getEra();
        org.joda.time.DateTime.Property property26 = dateTime24.secondOfMinute();
        org.joda.time.DateTime dateTime28 = dateTime24.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property29 = dateTime28.secondOfDay();
        java.util.Locale locale30 = java.util.Locale.PRC;
        boolean boolean31 = dateTime28.equals((java.lang.Object) locale30);
        java.lang.String str32 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localTime22, locale30);
        org.joda.time.tz.NameProvider nameProvider33 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        int int36 = dateTime35.getEra();
        org.joda.time.DateTime.Property property37 = dateTime35.secondOfMinute();
        java.lang.String str38 = property37.getAsText();
        org.joda.time.DateTimeField dateTimeField39 = property37.getField();
        long long41 = dateTimeField39.roundFloor((long) (byte) 10);
        java.lang.String str42 = dateTimeField39.getName();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        int int48 = dateTime47.getEra();
        org.joda.time.DateTime.Property property49 = dateTime47.secondOfMinute();
        org.joda.time.DateTime dateTime51 = dateTime47.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property52 = dateTime51.secondOfDay();
        java.util.Locale locale53 = java.util.Locale.PRC;
        boolean boolean54 = dateTime51.equals((java.lang.Object) locale53);
        java.lang.String str55 = dateTimeField39.getAsShortText((org.joda.time.ReadablePartial) localTime45, locale53);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(locale53);
        java.lang.String str59 = nameProvider33.getShortName(locale53, "", "UTC");
        java.lang.String str60 = locale30.getDisplayName(locale53);
        java.util.Calendar.Builder builder61 = builder10.setLocale(locale53);
        java.util.Locale locale62 = java.util.Locale.GERMAN;
        java.util.Calendar.Builder builder63 = builder10.setLocale(locale62);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone2, locale62);
        java.util.Set<java.lang.String> strSet65 = locale62.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar56 and calendar64", (calendar56.compareTo(calendar64) == 0) == calendar56.equals(calendar64));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.minuteOfHour();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property14 = dateTime11.minuteOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.toDateTime(chronology15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        long long21 = dateTimeZone18.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime16.toMutableDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology23 = chronology5.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField24 = chronology23.hours();
        org.joda.time.DurationField durationField25 = chronology23.years();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology23);
        boolean boolean27 = durationFieldType0.isSupported(chronology23);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime29.withPeriodAdded(readablePeriod34, 26163);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = localDateTime36.toString(dateTimeFormatter37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.yearOfEra();
        int int40 = localDateTime36.getHourOfDay();
        org.joda.time.Chronology chronology41 = localDateTime36.getChronology();
        org.joda.time.DurationField durationField42 = durationFieldType0.getField(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.era();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.yearOfCentury();
        org.joda.time.DurationField durationField45 = chronology41.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField24, and durationField25", !(durationField45.compareTo(durationField24) == 0) || (Math.signum(durationField45.compareTo(durationField25)) == Math.signum(durationField24.compareTo(durationField25))));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        timeZone3.setID("Etc/UTC");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        int int8 = timeZone3.getOffset((long) 52);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        timeZone12.setID("Etc/UTC");
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone12, locale15);
        boolean boolean17 = timeZone3.hasSameRules(timeZone12);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str20 = dateTimeZone19.toString();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        java.lang.String str22 = timeZone21.getID();
        boolean boolean23 = timeZone12.hasSameRules(timeZone21);
        java.util.TimeZone.setDefault(timeZone21);
        int int25 = timeZone21.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar16", (calendar6.compareTo(calendar16) == 0) == calendar6.equals(calendar16));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property13 = dateTime5.year();
        org.joda.time.DateTime dateTime15 = property13.addToCopy((int) (short) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfDay();
        int int17 = dateTime15.getWeekyear();
        org.joda.time.DateTime dateTime19 = dateTime15.minusDays(26297168);
        int int20 = dateTime19.getDayOfYear();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfEra();
        org.joda.time.DurationField durationField24 = chronology21.eras();
        org.joda.time.DurationField durationField25 = chronology21.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField25, and durationField24", !(durationField24.compareTo(durationField25) == 0) || (Math.signum(durationField24.compareTo(durationField24)) == Math.signum(durationField25.compareTo(durationField24))));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (short) 0);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMillis(0);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology10);
        org.joda.time.LocalTime localTime13 = localTime11.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property14 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime16 = property14.setCopy(5);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(26207);
        long long21 = dateTimeZone18.adjustOffset((long) 26228, true);
        org.joda.time.DateTime dateTime22 = localTime16.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime6.withZone(dateTimeZone18);
        long long25 = dateTimeZone18.convertUTCToLocal((long) (-159));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime23", (dateTime1.compareTo(dateTime23) == 0) == dateTime1.equals(dateTime23));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        java.lang.String str8 = dateTimeFieldType6.toString();
        int int9 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime5.getZone();
        org.joda.time.DateTime.Property property11 = dateTime5.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property11.getDateTime();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        boolean boolean16 = timeZone15.observesDaylightTime();
        java.lang.String str17 = timeZone15.getID();
        int int18 = timeZone15.getRawOffset();
        java.util.Calendar.Builder builder19 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder23 = builder19.setDate((int) (byte) 0, 2, 26179);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        int int26 = dateTime25.getEra();
        org.joda.time.DateTime.Property property27 = dateTime25.secondOfMinute();
        java.lang.String str28 = property27.getAsText();
        org.joda.time.DateTimeField dateTimeField29 = property27.getField();
        long long31 = dateTimeField29.roundFloor((long) (byte) 10);
        java.lang.String str32 = dateTimeField29.getName();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        int int38 = dateTime37.getEra();
        org.joda.time.DateTime.Property property39 = dateTime37.secondOfMinute();
        org.joda.time.DateTime dateTime41 = dateTime37.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property42 = dateTime41.secondOfDay();
        java.util.Locale locale43 = java.util.Locale.PRC;
        boolean boolean44 = dateTime41.equals((java.lang.Object) locale43);
        java.lang.String str45 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) localTime35, locale43);
        org.joda.time.tz.NameProvider nameProvider46 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology47);
        int int49 = dateTime48.getEra();
        org.joda.time.DateTime.Property property50 = dateTime48.secondOfMinute();
        java.lang.String str51 = property50.getAsText();
        org.joda.time.DateTimeField dateTimeField52 = property50.getField();
        long long54 = dateTimeField52.roundFloor((long) (byte) 10);
        java.lang.String str55 = dateTimeField52.getName();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        int int61 = dateTime60.getEra();
        org.joda.time.DateTime.Property property62 = dateTime60.secondOfMinute();
        org.joda.time.DateTime dateTime64 = dateTime60.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property65 = dateTime64.secondOfDay();
        java.util.Locale locale66 = java.util.Locale.PRC;
        boolean boolean67 = dateTime64.equals((java.lang.Object) locale66);
        java.lang.String str68 = dateTimeField52.getAsShortText((org.joda.time.ReadablePartial) localTime58, locale66);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(locale66);
        java.lang.String str72 = nameProvider46.getShortName(locale66, "", "UTC");
        java.lang.String str73 = locale43.getDisplayName(locale66);
        java.util.Calendar.Builder builder74 = builder23.setLocale(locale66);
        java.util.Locale locale75 = java.util.Locale.GERMAN;
        java.util.Calendar.Builder builder76 = builder23.setLocale(locale75);
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(timeZone15, locale75);
        java.lang.String str78 = property11.getAsShortText(locale75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar69 and calendar77", (calendar69.compareTo(calendar77) == 0) == calendar69.equals(calendar77));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setMinimalDaysInFirstWeek(13);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        boolean boolean4 = calendar0.isWeekDateSupported();
        java.util.TimeZone timeZone5 = calendar0.getTimeZone();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone5, locale7);
        java.lang.String str10 = locale7.getISO3Country();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar9", (calendar0.compareTo(calendar9) == 0) == calendar0.equals(calendar9));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        java.time.ZoneId zoneId4 = timeZone3.toZoneId();
        java.util.Locale locale6 = new java.util.Locale("+00:00");
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale6.getDisplayName(locale9);
        java.util.Locale.setDefault(locale9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime13.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property18 = dateTime17.secondOfDay();
        java.util.Locale locale19 = java.util.Locale.PRC;
        boolean boolean20 = dateTime17.equals((java.lang.Object) locale19);
        java.lang.String str21 = locale9.getDisplayCountry(locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone3, locale19);
        calendar22.setFirstDayOfWeek(26375);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromCalendarFields(calendar25);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.fromCalendarFields(calendar25);
        int int28 = calendar25.getMinimalDaysInFirstWeek();
        java.time.Instant instant29 = calendar25.toInstant();
        java.util.Date date30 = java.util.Date.from(instant29);
        int int31 = date30.getTimezoneOffset();
        java.lang.String str32 = date30.toGMTString();
        calendar22.setTime(date30);
        date30.setTime((-1514392796589L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar25", (calendar22.compareTo(calendar25) == 0) == calendar22.equals(calendar25));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.days();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.plus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.hourOfDay();
        int int17 = localDateTime15.getDayOfYear();
        org.joda.time.Chronology chronology18 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
        int int22 = localDateTime20.getDayOfYear();
        org.joda.time.Chronology chronology23 = localDateTime20.getChronology();
        int[] intArray25 = chronology18.get((org.joda.time.ReadablePartial) localDateTime20, (long) 1);
        chronology4.validate((org.joda.time.ReadablePartial) localDateTime7, intArray25);
        org.joda.time.DurationField durationField27 = chronology4.eras();
        org.joda.time.DurationField durationField28 = chronology4.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField27", Math.signum(durationField5.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField5)));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(chronology14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone17.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime15.toMutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology22 = chronology4.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.joda.time.DurationField durationField24 = chronology22.years();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.Chronology chronology26 = chronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = chronology22.dayOfYear();
        org.joda.time.DurationField durationField28 = chronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology22.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField28", (durationField24.compareTo(durationField28) == 0) == durationField24.equals(durationField28));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(4);
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime10.minusDays((int) (byte) 100);
        org.joda.time.DateTime dateTime15 = dateTime10.minusMonths(26171);
        int int16 = dateTime10.getSecondOfDay();
        org.joda.time.DateTime dateTime18 = dateTime10.minusSeconds(29);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, 16);
        java.lang.String str24 = dateTimeZone22.getNameKey(663224820000L);
        long long28 = dateTimeZone22.convertLocalToUTC((long) 26228, false, (long) 26222311);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType29, 26202, 26166, 26204714);
        boolean boolean34 = dateTimeZone22.equals((java.lang.Object) 26202);
        org.joda.time.DateTime dateTime35 = dateTime19.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime36", (dateTime1.compareTo(dateTime36) == 0) == dateTime1.equals(dateTime36));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime7 = property6.getDateTime();
        org.joda.time.DateTime dateTime8 = property6.withMinimumValue();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        int int13 = property6.compareTo((org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime12.getYearOfEra();
        boolean boolean15 = dateTime12.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, 16);
        java.lang.String str20 = dateTimeZone18.getNameKey(663224820000L);
        long long23 = dateTimeZone18.convertLocalToUTC(10L, true);
        java.lang.String str24 = dateTimeZone18.toString();
        org.joda.time.DateTime dateTime25 = dateTime12.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded((long) 26223, 56);
        org.joda.time.LocalDateTime localDateTime29 = dateTime28.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime25", (dateTime1.compareTo(dateTime25) == 0) == dateTime1.equals(dateTime25));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime5 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths((int) 'a');
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property13 = dateTime5.year();
        org.joda.time.DateTime dateTime15 = property13.addToCopy((int) (short) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfDay();
        int int17 = dateTime15.getWeekyear();
        org.joda.time.DateTime dateTime19 = dateTime15.minusDays(26297168);
        int int20 = dateTime19.getDayOfYear();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfEra();
        org.joda.time.DurationField durationField24 = chronology21.eras();
        org.joda.time.DurationField durationField25 = chronology21.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField25, and durationField24", !(durationField24.compareTo(durationField25) == 0) || (Math.signum(durationField24.compareTo(durationField24)) == Math.signum(durationField25.compareTo(durationField24))));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("1 Jan 1970 01:56:59 GMT");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getEra();
        org.joda.time.DateTime.Property property7 = dateTime5.secondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime5.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfDay();
        java.util.Locale locale11 = java.util.Locale.PRC;
        boolean boolean12 = dateTime9.equals((java.lang.Object) locale11);
        java.lang.String str13 = locale11.getISO3Language();
        java.lang.String str14 = locale11.getDisplayCountry();
        java.lang.String str15 = locale11.getLanguage();
        java.lang.String str16 = locale2.getDisplayScript(locale11);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale11);
        java.lang.String str18 = timeZone1.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar17", (calendar3.compareTo(calendar17) == 0) == calendar3.equals(calendar17));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 26164);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) 26176946);
        java.util.Calendar.Builder builder6 = builder2.setLenient(false);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        int int10 = localDateTime8.getDayOfYear();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DurationField durationField14 = dateTimeField13.getRangeDurationField();
        org.joda.time.DurationField durationField15 = dateTimeField13.getLeapDurationField();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        timeZone20.setID("Etc/UTC");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone20, locale23);
        java.lang.String str25 = dateTimeField13.getAsShortText(26193, locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleKeys();
        java.util.Calendar.Builder builder27 = builder6.setLocale(locale23);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.toString();
        java.util.TimeZone timeZone31 = dateTimeZone29.toTimeZone();
        java.time.ZoneId zoneId32 = timeZone31.toZoneId();
        java.util.Locale locale34 = new java.util.Locale("+00:00");
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.lang.String str38 = locale34.getDisplayName(locale37);
        java.util.Locale.setDefault(locale37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getEra();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfMinute();
        org.joda.time.DateTime dateTime45 = dateTime41.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property46 = dateTime45.secondOfDay();
        java.util.Locale locale47 = java.util.Locale.PRC;
        boolean boolean48 = dateTime45.equals((java.lang.Object) locale47);
        java.lang.String str49 = locale37.getDisplayCountry(locale47);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone31, locale47);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        boolean boolean56 = timeZone53.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone53);
        boolean boolean58 = timeZone31.hasSameRules(timeZone53);
        java.util.Calendar.Builder builder59 = builder6.setTimeZone(timeZone31);
        int int60 = timeZone31.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar50", (calendar24.compareTo(calendar50) == 0) == calendar24.equals(calendar50));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str3 = dateTimeZone1.getID();
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale6.getCountry();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone5, locale6);
        java.util.Date date13 = new java.util.Date(10, (int) (byte) -1, (-1));
        date13.setHours((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromDateFields(date13);
        date13.setMinutes(0);
        date13.setSeconds(26218);
        boolean boolean21 = calendar9.before((java.lang.Object) 26218);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, 16);
        java.lang.String str26 = dateTimeZone24.getNameKey(663224820000L);
        long long30 = dateTimeZone24.convertLocalToUTC((long) 26228, false, (long) 26222311);
        int int32 = dateTimeZone24.getOffsetFromLocal((long) 26211);
        long long35 = dateTimeZone24.adjustOffset(1645514185879L, true);
        java.lang.String str37 = dateTimeZone24.getShortName((long) 26361582);
        boolean boolean38 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 26218, (java.lang.Object) str37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar9", (calendar8.compareTo(calendar9) == 0) == calendar8.equals(calendar9));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone.setDefault(timeZone2);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval9 = localDate6.toInterval();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate6.minus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate6.era();
        boolean boolean13 = property12.isLeap();
        org.joda.time.LocalDate localDate15 = property12.addWrapFieldToCopy(6);
        int int16 = property12.getMinimumValueOverall();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfMinute();
        long long21 = property20.remainder();
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = property20.getAsShortText(locale22);
        java.lang.String str24 = property12.getAsShortText(locale22);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone2, locale22);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("1 Jan 1970 01:56:59 GMT");
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(locale28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        int int32 = dateTime31.getEra();
        org.joda.time.DateTime.Property property33 = dateTime31.secondOfMinute();
        org.joda.time.DateTime dateTime35 = dateTime31.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property36 = dateTime35.secondOfDay();
        java.util.Locale locale37 = java.util.Locale.PRC;
        boolean boolean38 = dateTime35.equals((java.lang.Object) locale37);
        java.lang.String str39 = locale37.getISO3Language();
        java.lang.String str40 = locale37.getDisplayCountry();
        java.lang.String str41 = locale37.getLanguage();
        java.lang.String str42 = locale28.getDisplayScript(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone27, locale37);
        boolean boolean44 = timeZone2.hasSameRules(timeZone27);
        boolean boolean45 = timeZone27.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar25 and calendar43", (calendar25.compareTo(calendar43) == 0) == calendar25.equals(calendar43));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = instant0.toDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        int int7 = localDateTime5.getDayOfYear();
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTime dateTime11 = instant0.toDateTime(chronology8);
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField12", Math.signum(durationField9.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField9)));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate((int) (byte) 0, 2, 26179);
        java.util.Calendar.Builder builder9 = builder0.setTimeOfDay(3222, (int) (byte) 1, (int) (byte) 100, 26173);
        java.util.Calendar.Builder builder11 = builder9.setLenient(true);
        java.util.Calendar calendar12 = builder9.build();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromCalendarFields(calendar13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromCalendarFields(calendar13);
        int int16 = calendar13.getMinimalDaysInFirstWeek();
        calendar13.clear();
        calendar13.clear();
        calendar13.setMinimalDaysInFirstWeek((int) (short) 1);
        java.time.Instant instant21 = calendar13.toInstant();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.toString();
        java.util.TimeZone timeZone25 = dateTimeZone23.toTimeZone();
        timeZone25.setID("Etc/UTC");
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone25);
        int int30 = timeZone25.getOffset((long) 52);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        java.lang.String str33 = dateTimeZone32.toString();
        java.util.TimeZone timeZone34 = dateTimeZone32.toTimeZone();
        timeZone34.setID("Etc/UTC");
        java.util.Locale locale37 = java.util.Locale.ROOT;
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone34, locale37);
        boolean boolean39 = timeZone25.hasSameRules(timeZone34);
        boolean boolean40 = timeZone25.observesDaylightTime();
        calendar13.setTimeZone(timeZone25);
        calendar13.set(0, 8, 26215);
        java.util.TimeZone timeZone46 = calendar13.getTimeZone();
        int int47 = timeZone46.getRawOffset();
        calendar12.setTimeZone(timeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar38", (calendar28.compareTo(calendar38) == 0) == calendar28.equals(calendar38));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("en-CA");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        int int6 = calendar3.getMinimalDaysInFirstWeek();
        calendar3.set(0, (-41), 23600, 26205, 26188, 26175);
        calendar3.setMinimalDaysInFirstWeek(0);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone.setDefault(timeZone18);
        int int22 = timeZone18.getRawOffset();
        calendar3.setTimeZone(timeZone18);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone18);
        boolean boolean25 = timeZone18.observesDaylightTime();
        java.time.ZoneId zoneId26 = timeZone18.toZoneId();
        boolean boolean27 = timeZone1.hasSameRules(timeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar24", (calendar2.compareTo(calendar24) == 0) == calendar2.equals(calendar24));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.getLocalDate();
        org.joda.time.LocalDate localDate3 = property1.roundCeilingCopy();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        org.joda.time.LocalDate localDate7 = property1.setCopy("5", locale6);
        int int8 = localDate7.getYearOfEra();
        int int9 = localDate7.getMonthOfYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear(35);
        int int15 = dateTimeFormatter12.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(9);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter12.withZone(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDate7.toDateTimeAtMidnight(dateTimeZone20);
        int int25 = dateTimeZone20.getStandardOffset(1645514388472L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime27.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime31 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        int int34 = dateTime33.getEra();
        int int35 = dateTime33.getSecondOfDay();
        org.joda.time.DateTime dateTime37 = dateTime33.minusMonths((int) 'a');
        boolean boolean38 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology39 = dateTime31.getChronology();
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.now(chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.minuteOfDay();
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((java.lang.Object) 1645514388472L, chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime27", (dateTime21.compareTo(dateTime27) == 0) == dateTime21.equals(dateTime27));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime7 = property6.getDateTime();
        org.joda.time.DateTime dateTime8 = property6.withMinimumValue();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        int int13 = property6.compareTo((org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime12.getYearOfEra();
        boolean boolean15 = dateTime12.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, 16);
        java.lang.String str20 = dateTimeZone18.getNameKey(663224820000L);
        long long23 = dateTimeZone18.convertLocalToUTC(10L, true);
        java.lang.String str24 = dateTimeZone18.toString();
        org.joda.time.DateTime dateTime25 = dateTime12.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded((long) 26223, 56);
        int int29 = dateTime28.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime25", (dateTime1.compareTo(dateTime25) == 0) == dateTime1.equals(dateTime25));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfMinute();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        long long14 = dateTimeField12.roundFloor((long) (byte) 10);
        java.lang.String str15 = dateTimeField12.getName();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        org.joda.time.DateTime.Property property22 = dateTime20.secondOfMinute();
        org.joda.time.DateTime dateTime24 = dateTime20.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfDay();
        java.util.Locale locale26 = java.util.Locale.PRC;
        boolean boolean27 = dateTime24.equals((java.lang.Object) locale26);
        java.lang.String str28 = dateTimeField12.getAsShortText((org.joda.time.ReadablePartial) localTime18, locale26);
        java.util.Calendar calendar29 = dateTime5.toCalendar(locale26);
        org.joda.time.DateMidnight dateMidnight30 = dateTime5.toDateMidnight();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        int int33 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime.Property property34 = dateTime32.millisOfDay();
        org.joda.time.DateTime dateTime35 = property34.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, 16);
        long long40 = dateTimeZone38.previousTransition((long) 355);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime46 = localTime43.withPeriodAdded(readablePeriod44, (int) (short) 100);
        org.joda.time.LocalTime localTime48 = localTime46.plusMillis(8);
        org.joda.time.LocalTime localTime50 = localTime46.minusMillis(14);
        org.joda.time.LocalTime.Property property51 = localTime50.millisOfSecond();
        org.joda.time.LocalTime localTime52 = property51.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime54 = property51.addWrapFieldToCopy((-26206));
        boolean boolean55 = dateTimeZone38.equals((java.lang.Object) (-26206));
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int59 = dateTime57.get(dateTimeFieldType58);
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime57.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime61 = dateTime57.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getEra();
        int int65 = dateTime63.getSecondOfDay();
        org.joda.time.DateTime dateTime67 = dateTime63.minusMonths((int) 'a');
        boolean boolean68 = dateTime61.isEqual((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime.Property property69 = dateTime61.year();
        org.joda.time.DateTime dateTime71 = property69.addToCopy((int) (short) 10);
        org.joda.time.DateTime.Property property72 = dateTime71.secondOfDay();
        int int73 = dateTime71.getWeekyear();
        boolean boolean74 = dateTimeZone38.equals((java.lang.Object) int73);
        long long76 = dateTimeZone38.previousTransition((-18729568016778464L));
        org.joda.time.DateTime dateTime77 = dateTime35.withZone(dateTimeZone38);
        org.joda.time.DurationFieldType durationFieldType78 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property82 = localDateTime81.hourOfDay();
        int int83 = localDateTime81.getDayOfYear();
        org.joda.time.Chronology chronology84 = localDateTime81.getChronology();
        org.joda.time.DurationField durationField85 = chronology84.days();
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((long) 26171, chronology84);
        org.joda.time.DurationField durationField87 = durationFieldType78.getField(chronology84);
        java.lang.String str88 = chronology84.toString();
        org.joda.time.DateTimeField dateTimeField89 = chronology84.era();
        org.joda.time.DateTime dateTime90 = dateTime35.toDateTime(chronology84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime77", (dateTime1.compareTo(dateTime77) == 0) == dateTime1.equals(dateTime77));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(chronology14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone17.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime15.toMutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology22 = chronology4.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField23 = chronology4.clockhourOfDay();
        org.joda.time.DurationField durationField24 = chronology4.hours();
        org.joda.time.DateTimeField dateTimeField25 = chronology4.weekyear();
        org.joda.time.DurationField durationField26 = chronology4.eras();
        org.joda.time.DurationField durationField27 = chronology4.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField26", Math.signum(durationField24.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField24)));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 26164);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) 26176946);
        java.util.Calendar.Builder builder6 = builder2.setLenient(false);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        int int10 = localDateTime8.getDayOfYear();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DurationField durationField14 = dateTimeField13.getRangeDurationField();
        org.joda.time.DurationField durationField15 = dateTimeField13.getLeapDurationField();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        timeZone20.setID("Etc/UTC");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone20, locale23);
        java.lang.String str25 = dateTimeField13.getAsShortText(26193, locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleKeys();
        java.util.Calendar.Builder builder27 = builder6.setLocale(locale23);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.toString();
        java.util.TimeZone timeZone31 = dateTimeZone29.toTimeZone();
        java.time.ZoneId zoneId32 = timeZone31.toZoneId();
        java.util.Locale locale34 = new java.util.Locale("+00:00");
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.lang.String str38 = locale34.getDisplayName(locale37);
        java.util.Locale.setDefault(locale37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getEra();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfMinute();
        org.joda.time.DateTime dateTime45 = dateTime41.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property46 = dateTime45.secondOfDay();
        java.util.Locale locale47 = java.util.Locale.PRC;
        boolean boolean48 = dateTime45.equals((java.lang.Object) locale47);
        java.lang.String str49 = locale37.getDisplayCountry(locale47);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone31, locale47);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        boolean boolean56 = timeZone53.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone53);
        boolean boolean58 = timeZone31.hasSameRules(timeZone53);
        java.util.Calendar.Builder builder59 = builder6.setTimeZone(timeZone31);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar50", (calendar24.compareTo(calendar50) == 0) == calendar24.equals(calendar50));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis((-2182719659000L));
        java.util.Date date6 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int7 = date6.getTimezoneOffset();
        java.util.Date date13 = new java.util.Date(0, 0, 0, 9, (int) '#');
        boolean boolean14 = date6.before(date13);
        calendar0.setTime(date13);
        java.util.TimeZone timeZone16 = calendar0.getTimeZone();
        calendar0.setTimeInMillis((long) 26173);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears(32772);
        org.joda.time.DateTime dateTime24 = dateTime20.plusMinutes((int) 'a');
        org.joda.time.DateTime dateTime26 = dateTime20.plusMonths(0);
        boolean boolean27 = calendar0.after((java.lang.Object) dateTime20);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.lang.String str31 = dateTimeZone30.toString();
        java.util.TimeZone timeZone32 = dateTimeZone30.toTimeZone();
        timeZone32.setID("Etc/UTC");
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone32);
        java.util.Date date42 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date42.setMinutes((int) (short) -1);
        int int45 = date42.getDate();
        calendar35.setTime(date42);
        java.lang.String str47 = date42.toGMTString();
        java.lang.String str48 = date42.toLocaleString();
        calendar0.setTime(date42);
        int int50 = date42.getTimezoneOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar35", (calendar0.compareTo(calendar35) == 0) == calendar0.equals(calendar35));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        timeZone3.setID("Etc/UTC");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        int int8 = timeZone3.getOffset((long) 52);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        timeZone12.setID("Etc/UTC");
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone12, locale15);
        boolean boolean17 = timeZone3.hasSameRules(timeZone12);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str20 = dateTimeZone19.toString();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        java.lang.String str22 = timeZone21.getID();
        boolean boolean23 = timeZone12.hasSameRules(timeZone21);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone12);
        java.util.TimeZone.setDefault(timeZone12);
        boolean boolean26 = timeZone12.observesDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar16", (calendar6.compareTo(calendar16) == 0) == calendar6.equals(calendar16));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.centuryOfEra();
        org.joda.time.DurationField durationField7 = chronology4.weeks();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.weekyear();
        org.joda.time.DurationField durationField9 = chronology4.eras();
        org.joda.time.DurationField durationField10 = chronology4.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setMinimalDaysInFirstWeek(13);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        int int4 = timeZone3.getRawOffset();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3);
        calendar0.setTimeZone(timeZone3);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        int int8 = localDate7.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar5", (calendar0.compareTo(calendar5) == 0) == calendar0.equals(calendar5));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = instant0.toDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        int int7 = localDateTime5.getDayOfYear();
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.DateTime dateTime11 = instant0.toDateTime(chronology8);
        org.joda.time.DurationField durationField12 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField12", Math.signum(durationField9.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField9)));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        int int5 = localDateTime4.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int7 = localDateTime4.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withWeekyear(26166);
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.months();
        org.joda.time.DurationField durationField12 = chronology10.eras();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField12", Math.signum(durationField11.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField11)));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-22T07:16:20.552Z");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromCalendarFields(calendar2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar2);
        int int5 = calendar2.getMinimalDaysInFirstWeek();
        calendar2.set(0, (-41), 23600, 26205, 26188, 26175);
        calendar2.setMinimalDaysInFirstWeek(0);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone.setDefault(timeZone17);
        int int21 = timeZone17.getRawOffset();
        calendar2.setTimeZone(timeZone17);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone17);
        boolean boolean24 = timeZone17.observesDaylightTime();
        java.time.ZoneId zoneId25 = timeZone17.toZoneId();
        boolean boolean26 = timeZone1.hasSameRules(timeZone17);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        calendar27.setTimeInMillis((-2182719659000L));
        java.util.Date date33 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int34 = date33.getTimezoneOffset();
        java.util.Date date40 = new java.util.Date(0, 0, 0, 9, (int) '#');
        boolean boolean41 = date33.before(date40);
        calendar27.setTime(date40);
        java.util.TimeZone timeZone43 = calendar27.getTimeZone();
        boolean boolean44 = timeZone1.hasSameRules(timeZone43);
        int int45 = timeZone43.getRawOffset();
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        java.util.TimeZone timeZone48 = dateTimeZone47.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        boolean boolean51 = timeZone48.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone48);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        java.lang.String str56 = dateTimeZone55.toString();
        java.util.TimeZone timeZone57 = dateTimeZone55.toTimeZone();
        timeZone57.setID("Etc/UTC");
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone57);
        boolean boolean61 = timeZone48.hasSameRules(timeZone57);
        boolean boolean62 = timeZone48.observesDaylightTime();
        int int63 = timeZone48.getRawOffset();
        boolean boolean64 = timeZone48.observesDaylightTime();
        int int65 = timeZone48.getRawOffset();
        boolean boolean66 = timeZone43.hasSameRules(timeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar60", (calendar23.compareTo(calendar60) == 0) == calendar23.equals(calendar60));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears((int) (byte) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withMillisOfSecond(59);
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime9 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology10 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(28);
        org.joda.time.DateTime dateTime13 = dateTime7.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property20 = dateTime17.minuteOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime23.withPeriodAdded(readablePeriod24, (int) (short) 100);
        org.joda.time.DateTime dateTime27 = localTime23.toDateTimeToday();
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTime dateTime30 = dateTime27.toDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = dateTime17.toDateTime(dateTimeZone29);
        java.util.Locale locale35 = new java.util.Locale("\u5354\u8abf\u4e16\u754c\u6642\u9593", "millisOfSecond");
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str37 = dateTime17.toString("\u4e2d\u56fd", locale35);
        java.util.Calendar calendar38 = dateTime7.toCalendar(locale35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime13", (dateTime7.compareTo(dateTime13) == 0) == dateTime7.equals(dateTime13));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean3 = timeZone2.observesDaylightTime();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        boolean boolean9 = timeZone6.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.toString();
        java.util.TimeZone timeZone15 = dateTimeZone13.toTimeZone();
        timeZone15.setID("Etc/UTC");
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone15);
        boolean boolean19 = timeZone6.hasSameRules(timeZone15);
        boolean boolean20 = timeZone2.hasSameRules(timeZone15);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate23 = localDate21.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval24 = localDate21.toInterval();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate21.minus(readablePeriod25);
        org.joda.time.LocalDate.Property property27 = localDate21.era();
        boolean boolean28 = property27.isLeap();
        org.joda.time.LocalDate localDate30 = property27.addWrapFieldToCopy(6);
        org.joda.time.DateTimeField dateTimeField31 = property27.getField();
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        int int33 = dateTimeField31.getMaximumShortTextLength(locale32);
        java.util.Locale locale34 = locale32.stripExtensions();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone15, locale32);
        timeZone15.setRawOffset(114);
        int int39 = timeZone15.getOffset((long) 26554032);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar35", (calendar18.compareTo(calendar35) == 0) == calendar18.equals(calendar35));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean3 = timeZone2.observesDaylightTime();
        int int4 = timeZone2.getRawOffset();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        int int8 = localDateTime6.getDayOfYear();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        int int13 = localDateTime11.getDayOfYear();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        int[] intArray16 = chronology9.get((org.joda.time.ReadablePartial) localDateTime11, (long) 1);
        org.joda.time.DateTimeField dateTimeField17 = chronology9.dayOfWeek();
        java.lang.String str19 = dateTimeField17.getAsShortText((long) (-1));
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.lang.String str23 = locale22.getISO3Country();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale locale25 = builder24.build();
        java.lang.String str26 = locale22.getDisplayCountry(locale25);
        java.util.Locale locale27 = locale22.stripExtensions();
        java.lang.String str28 = dateTimeField17.getAsText(117L, locale22);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone2, locale22);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale32 = new java.util.Locale("+00:00");
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.lang.String str35 = locale33.getScript();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone2, locale33);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfDay();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int43 = dateTime41.get(dateTimeFieldType42);
        int int44 = property39.compareTo((org.joda.time.ReadableInstant) dateTime41);
        int int45 = property39.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField46 = property39.getField();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        int int50 = dateTime49.getEra();
        org.joda.time.DateTime.Property property51 = dateTime49.secondOfMinute();
        java.lang.String str52 = property51.getAsText();
        org.joda.time.DateTimeField dateTimeField53 = property51.getField();
        long long55 = dateTimeField53.roundFloor((long) (byte) 10);
        java.lang.String str56 = dateTimeField53.getName();
        java.lang.String str57 = dateTimeField53.toString();
        int int58 = dateTimeField53.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = dateTimeField53.getType();
        int int61 = dateTimeField53.getMinimumValue((long) ' ');
        java.util.Locale.Builder builder63 = new java.util.Locale.Builder();
        java.util.Locale locale64 = builder63.build();
        java.util.Locale locale65 = builder63.build();
        java.lang.String str66 = locale65.getDisplayScript();
        java.lang.String str67 = dateTimeField53.getAsShortText(8, locale65);
        java.lang.String str68 = dateTimeField46.getAsText((long) 12, locale65);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone2, locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar30", (calendar29.compareTo(calendar30) == 0) == calendar29.equals(calendar30));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setMinimalDaysInFirstWeek(13);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        boolean boolean4 = calendar0.isWeekDateSupported();
        java.util.TimeZone timeZone5 = calendar0.getTimeZone();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayLanguage();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone5, locale7);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar9", (calendar0.compareTo(calendar9) == 0) == calendar0.equals(calendar9));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean5 = timeZone2.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        java.util.TimeZone timeZone11 = dateTimeZone9.toTimeZone();
        timeZone11.setID("Etc/UTC");
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        boolean boolean15 = timeZone2.hasSameRules(timeZone11);
        boolean boolean16 = timeZone2.observesDaylightTime();
        java.util.Locale locale18 = new java.util.Locale("+00:00");
        java.util.Locale locale19 = java.util.Locale.GERMANY;
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone2, locale18);
        int int22 = calendar21.getMinimalDaysInFirstWeek();
        int int23 = calendar21.getFirstDayOfWeek();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        java.lang.String str27 = dateTimeZone25.getID();
        boolean boolean28 = dateTimeZone25.isFixed();
        java.util.TimeZone timeZone29 = dateTimeZone25.toTimeZone();
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str31 = locale30.getCountry();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale30);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone29, locale30);
        java.util.Date date37 = new java.util.Date(10, (int) (byte) -1, (-1));
        date37.setHours((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.fromDateFields(date37);
        date37.setMinutes(0);
        date37.setSeconds(26218);
        boolean boolean45 = calendar33.before((java.lang.Object) 26218);
        calendar33.set(1999, 45, 26465667, 26361582, 26296, 26488);
        int int53 = calendar21.compareTo(calendar33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar32", (calendar14.compareTo(calendar32) == 0) == calendar14.equals(calendar32));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) (short) 0);
        int int6 = localDateTime5.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int8 = localDateTime5.get(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withWeekyear(26166);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.months();
        org.joda.time.DurationField durationField13 = chronology11.eras();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((-172799997L), chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField13", Math.signum(durationField12.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField12)));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.util.Locale locale2 = new java.util.Locale("java.util.GregorianCalendar[time=7,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=7,ZONE_OFFSET=0,DST_OFFSET=0]", "year");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        java.util.TimeZone timeZone4 = calendar3.getTimeZone();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readablePeriod7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property11 = dateTime8.minuteOfDay();
        java.util.Locale locale13 = new java.util.Locale("+00:00");
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale13.getDisplayName(locale16);
        java.util.Locale.setDefault(locale16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        org.joda.time.DateTime.Property property22 = dateTime20.secondOfMinute();
        org.joda.time.DateTime dateTime24 = dateTime20.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfDay();
        java.util.Locale locale26 = java.util.Locale.PRC;
        boolean boolean27 = dateTime24.equals((java.lang.Object) locale26);
        java.lang.String str28 = locale16.getDisplayCountry(locale26);
        java.util.Calendar calendar29 = dateTime8.toCalendar(locale26);
        int int30 = dateTime8.getMillisOfDay();
        org.joda.time.LocalDate localDate31 = dateTime8.toLocalDate();
        boolean boolean32 = calendar3.before((java.lang.Object) localDate31);
        java.util.TimeZone timeZone33 = calendar3.getTimeZone();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId35 = timeZone34.toZoneId();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getTimeZone(zoneId35);
        boolean boolean37 = timeZone33.hasSameRules(timeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar29", (calendar3.compareTo(calendar29) == 0) == calendar3.equals(calendar29));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) dateTime1);
        org.joda.time.DateTime dateTime6 = dateTime1.minusYears((int) (byte) -1);
        org.joda.time.LocalDate localDate7 = dateTime1.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(49);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readablePeriod12);
        org.joda.time.DateTime.Property property14 = dateTime11.weekyear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.plus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime11.plusHours(26362);
        int int19 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime1.toMutableDateTime(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime20", (dateTime11.compareTo(dateTime20) == 0) == dateTime11.equals(dateTime20));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property5 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime6 = dateTime1.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(8303753);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime9", (dateTime1.compareTo(dateTime9) == 0) == dateTime1.equals(dateTime9));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis((-2182719659000L));
        java.util.Date date6 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int7 = date6.getTimezoneOffset();
        java.util.Date date13 = new java.util.Date(0, 0, 0, 9, (int) '#');
        boolean boolean14 = date6.before(date13);
        calendar0.setTime(date13);
        java.util.TimeZone timeZone16 = calendar0.getTimeZone();
        calendar0.setTimeInMillis((long) 26173);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears(32772);
        org.joda.time.DateTime dateTime24 = dateTime20.plusMinutes((int) 'a');
        org.joda.time.DateTime dateTime26 = dateTime20.plusMonths(0);
        boolean boolean27 = calendar0.after((java.lang.Object) dateTime20);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.lang.String str31 = dateTimeZone30.toString();
        java.util.TimeZone timeZone32 = dateTimeZone30.toTimeZone();
        timeZone32.setID("Etc/UTC");
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone32);
        java.util.Date date42 = new java.util.Date((int) (short) 10, (int) (byte) 1, 9, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        date42.setMinutes((int) (short) -1);
        int int45 = date42.getDate();
        calendar35.setTime(date42);
        java.lang.String str47 = date42.toGMTString();
        java.lang.String str48 = date42.toLocaleString();
        calendar0.setTime(date42);
        int int50 = date42.getMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar35", (calendar0.compareTo(calendar35) == 0) == calendar0.equals(calendar35));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Date date4 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int5 = date4.getDate();
        java.lang.String str6 = date4.toGMTString();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date4);
        java.util.Calendar.Builder builder9 = builder7.setLenient(true);
        java.util.Calendar.Builder builder11 = builder9.setLenient(true);
        java.util.Locale locale14 = new java.util.Locale("44", "2022-02-22T07:16:14.603Z");
        java.util.Calendar.Builder builder15 = builder11.setLocale(locale14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone.setDefault(timeZone18);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate24 = localDate22.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval25 = localDate22.toInterval();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate22.minus(readablePeriod26);
        org.joda.time.LocalDate.Property property28 = localDate22.era();
        boolean boolean29 = property28.isLeap();
        org.joda.time.LocalDate localDate31 = property28.addWrapFieldToCopy(6);
        int int32 = property28.getMinimumValueOverall();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        int int35 = dateTime34.getEra();
        org.joda.time.DateTime.Property property36 = dateTime34.secondOfMinute();
        long long37 = property36.remainder();
        java.util.Locale locale38 = java.util.Locale.PRC;
        java.lang.String str39 = property36.getAsShortText(locale38);
        java.lang.String str40 = property28.getAsShortText(locale38);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone18, locale38);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getTimeZone("1 Jan 1970 01:56:59 GMT");
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        int int48 = dateTime47.getEra();
        org.joda.time.DateTime.Property property49 = dateTime47.secondOfMinute();
        org.joda.time.DateTime dateTime51 = dateTime47.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property52 = dateTime51.secondOfDay();
        java.util.Locale locale53 = java.util.Locale.PRC;
        boolean boolean54 = dateTime51.equals((java.lang.Object) locale53);
        java.lang.String str55 = locale53.getISO3Language();
        java.lang.String str56 = locale53.getDisplayCountry();
        java.lang.String str57 = locale53.getLanguage();
        java.lang.String str58 = locale44.getDisplayScript(locale53);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone43, locale53);
        boolean boolean60 = timeZone18.hasSameRules(timeZone43);
        java.util.Calendar.Builder builder61 = builder11.setTimeZone(timeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar41 and calendar59", (calendar41.compareTo(calendar59) == 0) == calendar41.equals(calendar59));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone.setDefault(timeZone2);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval9 = localDate6.toInterval();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate6.minus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate6.era();
        boolean boolean13 = property12.isLeap();
        org.joda.time.LocalDate localDate15 = property12.addWrapFieldToCopy(6);
        int int16 = property12.getMinimumValueOverall();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfMinute();
        long long21 = property20.remainder();
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = property20.getAsShortText(locale22);
        java.lang.String str24 = property12.getAsShortText(locale22);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone2, locale22);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("1 Jan 1970 01:56:59 GMT");
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(locale28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        int int32 = dateTime31.getEra();
        org.joda.time.DateTime.Property property33 = dateTime31.secondOfMinute();
        org.joda.time.DateTime dateTime35 = dateTime31.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property36 = dateTime35.secondOfDay();
        java.util.Locale locale37 = java.util.Locale.PRC;
        boolean boolean38 = dateTime35.equals((java.lang.Object) locale37);
        java.lang.String str39 = locale37.getISO3Language();
        java.lang.String str40 = locale37.getDisplayCountry();
        java.lang.String str41 = locale37.getLanguage();
        java.lang.String str42 = locale28.getDisplayScript(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone27, locale37);
        boolean boolean44 = timeZone2.hasSameRules(timeZone27);
        java.lang.Object obj45 = timeZone27.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar25 and calendar43", (calendar25.compareTo(calendar43) == 0) == calendar25.equals(calendar43));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(4);
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime10.plusHours((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.era();
        boolean boolean15 = dateTime13.isSupported(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(295);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone17);
        org.joda.time.DateTime.Property property19 = dateTime18.year();
        int int20 = property19.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime18", (dateTime13.compareTo(dateTime18) == 0) == dateTime13.equals(dateTime18));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        java.time.ZoneId zoneId4 = timeZone3.toZoneId();
        java.util.Locale locale6 = new java.util.Locale("+00:00");
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale6.getDisplayName(locale9);
        java.util.Locale.setDefault(locale9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime13.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property18 = dateTime17.secondOfDay();
        java.util.Locale locale19 = java.util.Locale.PRC;
        boolean boolean20 = dateTime17.equals((java.lang.Object) locale19);
        java.lang.String str21 = locale9.getDisplayCountry(locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone3, locale19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusYears(32772);
        org.joda.time.DateTime.Property property27 = dateTime24.weekOfWeekyear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology33);
        org.joda.time.DateTime dateTime35 = dateTime29.withFields((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.LocalTime localTime37 = localTime34.plusMillis(4);
        org.joda.time.DateTime dateTime38 = localTime34.toDateTimeToday();
        org.joda.time.LocalTime.Property property39 = localTime34.hourOfDay();
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        int int41 = property39.getMaximumShortTextLength(locale40);
        java.lang.String str42 = locale40.getDisplayCountry();
        java.lang.String str43 = property27.getAsText(locale40);
        java.lang.String str44 = locale19.getDisplayLanguage(locale40);
        java.lang.String str45 = locale40.getScript();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.hourOfDay();
        int int49 = localDateTime47.getDayOfYear();
        org.joda.time.Chronology chronology50 = localDateTime47.getChronology();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.hourOfDay();
        int int54 = localDateTime52.getDayOfYear();
        org.joda.time.Chronology chronology55 = localDateTime52.getChronology();
        int[] intArray57 = chronology50.get((org.joda.time.ReadablePartial) localDateTime52, (long) 1);
        org.joda.time.DateTimeField dateTimeField58 = chronology50.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField59 = chronology50.millisOfDay();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.DateTime dateTime64 = dateTime62.minus(readablePeriod63);
        org.joda.time.DateTime dateTime66 = dateTime64.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime66.getZone();
        java.util.Locale locale69 = java.util.Locale.ITALIAN;
        java.lang.String str70 = dateTimeZone67.getName((long) (-292275054), locale69);
        java.lang.String str71 = dateTimeField59.getAsShortText(48, locale69);
        java.util.TimeZone timeZone73 = java.util.TimeZone.getDefault();
        int int74 = timeZone73.getRawOffset();
        timeZone73.setID("\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        boolean boolean77 = timeZone73.observesDaylightTime();
        boolean boolean78 = timeZone73.observesDaylightTime();
        java.util.Locale locale79 = java.util.Locale.GERMANY;
        java.lang.String str80 = locale79.getISO3Language();
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(timeZone73, locale79);
        java.lang.String str82 = dateTimeField59.getAsText(65764742400000L, locale79);
        java.lang.String str83 = locale40.getDisplayName(locale79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar81", (calendar22.compareTo(calendar81) == 0) == calendar22.equals(calendar81));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.withSecondOfMinute(1);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis(355L);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        int int16 = localDateTime14.getDayOfYear();
        org.joda.time.Chronology chronology17 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DurationField durationField20 = chronology17.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology17.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime12.toMutableDateTime(chronology17);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone.setDefault(timeZone25);
        java.util.TimeZone.setDefault(timeZone25);
        boolean boolean30 = timeZone25.observesDaylightTime();
        boolean boolean31 = mutableDateTime22.equals((java.lang.Object) timeZone25);
        org.joda.time.Instant instant32 = org.joda.time.Instant.now();
        long long33 = instant32.getMillis();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant32.plus(readableDuration34);
        org.joda.time.Instant instant38 = instant35.withDurationAdded((long) 26200, 26186);
        org.joda.time.MutableDateTime mutableDateTime39 = instant35.toMutableDateTimeISO();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property45 = localDateTime41.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plus(readableDuration46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withEra((int) (short) 0);
        int int50 = localDateTime49.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minus(readablePeriod51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType54 = dateTimeFieldType53.getDurationType();
        java.lang.String str55 = dateTimeFieldType53.toString();
        int int56 = localDateTime49.get(dateTimeFieldType53);
        boolean boolean57 = mutableDateTime39.isSupported(dateTimeFieldType53);
        boolean boolean58 = mutableDateTime22.isSupported(dateTimeFieldType53);
        org.joda.time.Chronology chronology59 = mutableDateTime22.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.weeks();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.hourOfDay();
        int int64 = localDateTime62.getDayOfYear();
        org.joda.time.Chronology chronology65 = localDateTime62.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.yearOfEra();
        org.joda.time.DateTimeField dateTimeField67 = chronology65.minuteOfHour();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology68);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.DateTime dateTime71 = dateTime69.minus(readablePeriod70);
        org.joda.time.DateTime dateTime73 = dateTime71.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property74 = dateTime71.minuteOfDay();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = dateTime71.toDateTime(chronology75);
        java.util.TimeZone timeZone77 = null;
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forTimeZone(timeZone77);
        java.util.TimeZone timeZone79 = dateTimeZone78.toTimeZone();
        long long81 = dateTimeZone78.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime76.toMutableDateTime(dateTimeZone78);
        org.joda.time.Chronology chronology83 = chronology65.withZone(dateTimeZone78);
        org.joda.time.DurationField durationField84 = chronology83.hours();
        org.joda.time.DurationField durationField85 = chronology83.years();
        org.joda.time.DateTimeField dateTimeField86 = chronology83.dayOfMonth();
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime(chronology83);
        org.joda.time.DateTimeField dateTimeField88 = chronology83.minuteOfDay();
        org.joda.time.DurationField durationField89 = dateTimeField88.getRangeDurationField();
        long long92 = durationField89.subtract((long) 26218893, 1123226188);
        int int93 = durationField60.compareTo(durationField89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField85", (durationField20.compareTo(durationField85) == 0) == durationField20.equals(durationField85));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean3 = timeZone2.observesDaylightTime();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        boolean boolean9 = timeZone6.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.lang.String str14 = dateTimeZone13.toString();
        java.util.TimeZone timeZone15 = dateTimeZone13.toTimeZone();
        timeZone15.setID("Etc/UTC");
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone15);
        boolean boolean19 = timeZone6.hasSameRules(timeZone15);
        boolean boolean20 = timeZone2.hasSameRules(timeZone15);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate23 = localDate21.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval24 = localDate21.toInterval();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate21.minus(readablePeriod25);
        org.joda.time.LocalDate.Property property27 = localDate21.era();
        boolean boolean28 = property27.isLeap();
        org.joda.time.LocalDate localDate30 = property27.addWrapFieldToCopy(6);
        org.joda.time.DateTimeField dateTimeField31 = property27.getField();
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        int int33 = dateTimeField31.getMaximumShortTextLength(locale32);
        java.util.Locale locale34 = locale32.stripExtensions();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone15, locale32);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        java.util.TimeZone.setDefault(timeZone38);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate44 = localDate42.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval45 = localDate42.toInterval();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDate localDate47 = localDate42.minus(readablePeriod46);
        org.joda.time.LocalDate.Property property48 = localDate42.era();
        boolean boolean49 = property48.isLeap();
        org.joda.time.LocalDate localDate51 = property48.addWrapFieldToCopy(6);
        int int52 = property48.getMinimumValueOverall();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        int int55 = dateTime54.getEra();
        org.joda.time.DateTime.Property property56 = dateTime54.secondOfMinute();
        long long57 = property56.remainder();
        java.util.Locale locale58 = java.util.Locale.PRC;
        java.lang.String str59 = property56.getAsShortText(locale58);
        java.lang.String str60 = property48.getAsShortText(locale58);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone38, locale58);
        boolean boolean62 = timeZone38.observesDaylightTime();
        java.time.ZoneId zoneId63 = timeZone38.toZoneId();
        java.util.TimeZone timeZone64 = java.util.TimeZone.getTimeZone(zoneId63);
        calendar35.setTimeZone(timeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar61", (calendar18.compareTo(calendar61) == 0) == calendar18.equals(calendar61));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        int int8 = localDateTime6.getDayOfYear();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        int[] intArray11 = chronology4.get((org.joda.time.ReadablePartial) localDateTime6, (long) 1);
        org.joda.time.DateTimeField dateTimeField12 = chronology4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int[] intArray16 = chronology4.get((org.joda.time.ReadablePartial) localDateTime14, (long) 8);
        org.joda.time.DateTimeField dateTimeField17 = chronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology4.minuteOfHour();
        org.joda.time.DurationField durationField19 = chronology4.eras();
        long long23 = chronology4.add(0L, (long) 26172, 26502);
        org.joda.time.DurationField durationField24 = chronology4.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField24, and durationField19", !(durationField19.compareTo(durationField24) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField24.compareTo(durationField19))));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        timeZone3.setID("Etc/UTC");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3);
        int int8 = timeZone3.getOffset((long) 52);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        timeZone12.setID("Etc/UTC");
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone12, locale15);
        boolean boolean17 = timeZone3.hasSameRules(timeZone12);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str20 = dateTimeZone19.toString();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        java.lang.String str22 = timeZone21.getID();
        boolean boolean23 = timeZone12.hasSameRules(timeZone21);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone12);
        java.time.ZoneId zoneId25 = timeZone12.toZoneId();
        java.time.ZoneId zoneId26 = timeZone12.toZoneId();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar16", (calendar6.compareTo(calendar16) == 0) == calendar6.equals(calendar16));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 26173, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.monthOfYear();
        org.joda.time.DurationField durationField13 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField13", Math.signum(durationField10.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField10)));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withPeriodAdded(readablePeriod6, 26163);
        org.joda.time.Chronology chronology9 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology9.years();
        org.joda.time.Chronology chronology12 = chronology9.withUTC();
        java.lang.String str13 = chronology9.toString();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField14", Math.signum(durationField11.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField11)));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.monthOfYear();
        org.joda.time.DurationField durationField8 = chronology4.years();
        org.joda.time.DurationField durationField9 = chronology4.weekyears();
        org.joda.time.DurationField durationField10 = chronology4.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField9", (durationField8.compareTo(durationField9) == 0) == durationField8.equals(durationField9));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.Interval interval3 = localDate0.toInterval();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate0.minus(readablePeriod4);
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        boolean boolean7 = property6.isLeap();
        org.joda.time.LocalDate localDate8 = property6.roundHalfFloorCopy();
        int int9 = localDate8.size();
        org.joda.time.LocalDate.Property property10 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate11 = property10.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        org.joda.time.DateTime.Property property16 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property16.addToCopy(11);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, 16);
        java.lang.String str24 = dateTimeZone22.getNameKey(663224820000L);
        long long27 = dateTimeZone22.convertLocalToUTC(10L, true);
        java.lang.String str28 = dateTimeZone22.toString();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime19.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime30 = localDate11.toDateTimeAtMidnight(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime29", (dateTime18.compareTo(mutableDateTime29) == 0) == dateTime18.equals(mutableDateTime29));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.LocalDate.Property property5 = localDate2.monthOfYear();
        org.joda.time.Chronology chronology6 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) localDate2);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra(100);
        org.joda.time.Interval interval13 = localDate10.toInterval();
        int int14 = localDate10.getMonthOfYear();
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTime dateTime16 = localDate10.toDateTime(localTime15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate10.withPeriodAdded(readablePeriod17, 14);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, 16);
        long long24 = dateTimeZone22.previousTransition((long) 355);
        java.lang.String str25 = dateTimeZone22.toString();
        java.util.TimeZone timeZone26 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDate10.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.DateTime dateTime28 = localDate7.toDateTimeAtCurrentTime(dateTimeZone22);
        int int30 = dateTimeZone22.getOffset(701610423L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime28", (dateTime4.compareTo(dateTime28) == 0) == dateTime4.equals(dateTime28));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.util.Locale locale1 = new java.util.Locale("hi!");
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        int int9 = localDateTime7.getDayOfYear();
        org.joda.time.Chronology chronology10 = localDateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        int int14 = localDateTime12.getDayOfYear();
        org.joda.time.Chronology chronology15 = localDateTime12.getChronology();
        int[] intArray17 = chronology10.get((org.joda.time.ReadablePartial) localDateTime12, (long) 1);
        org.joda.time.DateTimeField dateTimeField18 = chronology10.dayOfWeek();
        java.lang.String str20 = dateTimeField18.getAsShortText((long) (-1));
        java.util.Locale locale23 = new java.util.Locale("hi!");
        java.lang.String str24 = locale23.getISO3Country();
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale locale26 = builder25.build();
        java.lang.String str27 = locale23.getDisplayCountry(locale26);
        java.util.Locale locale28 = locale23.stripExtensions();
        java.lang.String str29 = dateTimeField18.getAsText(117L, locale23);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(locale23);
        java.util.Set<java.lang.Character> charSet31 = locale23.getExtensionKeys();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        int int34 = dateTime33.getEra();
        int int35 = dateTime33.getSecondOfDay();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        int int40 = dateTime39.getEra();
        int int41 = dateTime39.getSecondOfDay();
        org.joda.time.DateTime dateTime43 = dateTime39.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime43.toMutableDateTime(chronology44);
        boolean boolean46 = dateTime33.isBefore((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property52 = localDateTime48.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime48.withPeriodAdded(readablePeriod53, 26163);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime48.plusMillis(7);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minusSeconds(26164);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int61 = localDateTime57.get(dateTimeFieldType60);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.hourOfDay();
        int int66 = localDateTime64.getDayOfYear();
        org.joda.time.Chronology chronology67 = localDateTime64.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfEra();
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(0L, chronology67);
        org.joda.time.DateTimeField dateTimeField70 = chronology67.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType60.getField(chronology67);
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.util.Locale locale73 = locale72.stripExtensions();
        int int74 = dateTimeField71.getMaximumTextLength(locale72);
        java.util.Locale locale76 = java.util.Locale.forLanguageTag("43");
        java.lang.String str77 = locale72.getDisplayName(locale76);
        java.util.Calendar calendar78 = dateTime33.toCalendar(locale72);
        java.util.Locale.setDefault(locale72);
        java.lang.String str80 = locale23.getDisplayCountry(locale72);
        java.lang.String str81 = locale4.getDisplayLanguage(locale72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar30 and calendar78", (calendar30.compareTo(calendar78) == 0) == calendar30.equals(calendar78));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 26173, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.monthOfYear();
        org.joda.time.DurationField durationField13 = chronology5.eras();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField13", Math.signum(durationField10.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField10)));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.minuteOfHour();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property14 = dateTime11.minuteOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.toDateTime(chronology15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        long long21 = dateTimeZone18.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime16.toMutableDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology23 = chronology5.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField24 = chronology23.hours();
        org.joda.time.DurationField durationField25 = chronology23.years();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.Chronology chronology27 = chronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = chronology23.dayOfYear();
        org.joda.time.DurationField durationField29 = chronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType0.getField(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField29", (durationField25.compareTo(durationField29) == 0) == durationField25.equals(durationField29));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        java.time.ZoneId zoneId4 = timeZone3.toZoneId();
        java.util.Locale locale6 = new java.util.Locale("+00:00");
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale6.getDisplayName(locale9);
        java.util.Locale.setDefault(locale9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime13.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property18 = dateTime17.secondOfDay();
        java.util.Locale locale19 = java.util.Locale.PRC;
        boolean boolean20 = dateTime17.equals((java.lang.Object) locale19);
        java.lang.String str21 = locale9.getDisplayCountry(locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone3, locale19);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        boolean boolean28 = timeZone25.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone25);
        boolean boolean30 = timeZone3.hasSameRules(timeZone25);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.minus(readablePeriod33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime36.getZone();
        java.lang.String str38 = dateTimeZone37.toString();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getEra();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfMinute();
        java.lang.String str44 = property43.getAsText();
        org.joda.time.DateTimeField dateTimeField45 = property43.getField();
        long long47 = dateTimeField45.roundFloor((long) (byte) 10);
        java.util.Locale locale48 = java.util.Locale.CHINESE;
        java.lang.String str49 = locale48.getDisplayLanguage();
        int int50 = dateTimeField45.getMaximumTextLength(locale48);
        java.lang.String str51 = locale48.getLanguage();
        java.lang.String str52 = dateTimeZone37.getShortName(0L, locale48);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(dateTimeZone37);
        java.util.TimeZone timeZone54 = dateTimeZone37.toTimeZone();
        java.util.TimeZone timeZone55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        java.util.TimeZone timeZone57 = dateTimeZone56.toTimeZone();
        boolean boolean58 = timeZone57.observesDaylightTime();
        java.time.ZoneId zoneId59 = timeZone57.toZoneId();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone57);
        java.util.TimeZone timeZone61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forTimeZone(timeZone61);
        java.util.TimeZone timeZone63 = dateTimeZone62.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone63);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone63);
        boolean boolean66 = timeZone63.observesDaylightTime();
        java.time.ZoneId zoneId67 = timeZone63.toZoneId();
        boolean boolean68 = timeZone57.hasSameRules(timeZone63);
        int int70 = timeZone63.getOffset((long) 26300);
        boolean boolean71 = timeZone54.hasSameRules(timeZone63);
        boolean boolean72 = timeZone25.hasSameRules(timeZone63);
        java.util.TimeZone timeZone73 = null;
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        java.util.TimeZone timeZone75 = dateTimeZone74.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        boolean boolean78 = timeZone75.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone75);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        java.util.TimeZone timeZone81 = null;
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forTimeZone(timeZone81);
        java.lang.String str83 = dateTimeZone82.toString();
        java.util.TimeZone timeZone84 = dateTimeZone82.toTimeZone();
        timeZone84.setID("Etc/UTC");
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone84);
        boolean boolean88 = timeZone75.hasSameRules(timeZone84);
        boolean boolean89 = timeZone75.observesDaylightTime();
        boolean boolean90 = timeZone25.hasSameRules(timeZone75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar87", (calendar22.compareTo(calendar87) == 0) == calendar22.equals(calendar87));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        int int3 = localDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) (byte) -1);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(chronology14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        long long20 = dateTimeZone17.convertUTCToLocal((long) 'u');
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime15.toMutableDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology22 = chronology4.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.joda.time.DurationField durationField24 = chronology22.years();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.Chronology chronology26 = chronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = chronology22.dayOfYear();
        org.joda.time.DurationField durationField28 = chronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = chronology22.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField28", (durationField24.compareTo(durationField28) == 0) == durationField24.equals(durationField28));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean3 = timeZone2.observesDaylightTime();
        int int4 = timeZone2.getRawOffset();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        int int8 = localDateTime6.getDayOfYear();
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        int int13 = localDateTime11.getDayOfYear();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        int[] intArray16 = chronology9.get((org.joda.time.ReadablePartial) localDateTime11, (long) 1);
        org.joda.time.DateTimeField dateTimeField17 = chronology9.dayOfWeek();
        java.lang.String str19 = dateTimeField17.getAsShortText((long) (-1));
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.lang.String str23 = locale22.getISO3Country();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale locale25 = builder24.build();
        java.lang.String str26 = locale22.getDisplayCountry(locale25);
        java.util.Locale locale27 = locale22.stripExtensions();
        java.lang.String str28 = dateTimeField17.getAsText(117L, locale22);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone2, locale22);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale32 = new java.util.Locale("+00:00");
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.lang.String str35 = locale33.getScript();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone2, locale33);
        int int37 = timeZone2.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar36", (calendar29.compareTo(calendar36) == 0) == calendar29.equals(calendar36));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology2);
        org.joda.time.LocalTime localTime5 = localTime3.minusSeconds((int) 'u');
        org.joda.time.LocalTime.Property property6 = localTime3.millisOfDay();
        org.joda.time.Chronology chronology7 = localTime3.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.millis();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DurationField durationField11 = chronology7.halfdays();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(829821199564800000L, chronology7);
        org.joda.time.DurationField durationField13 = chronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField9, and durationField11", !(durationField13.compareTo(durationField9) == 0) || (Math.signum(durationField13.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate((int) (byte) 0, 2, 26179);
        java.util.Calendar.Builder builder9 = builder0.setTimeOfDay(3222, (int) (byte) 1, (int) (byte) 100, 26173);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Calendar.Builder builder11 = builder0.setLocale(locale10);
        java.util.Locale locale13 = new java.util.Locale("+00:00");
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale13.getDisplayName(locale16);
        java.util.Calendar.Builder builder18 = builder11.setLocale(locale16);
        java.util.Calendar.Builder builder23 = builder18.setTimeOfDay(26253, 8, 52, 19045);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("DateTimeField[centuryOfEra]");
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone25);
        java.util.Calendar.Builder builder27 = builder23.setTimeZone(timeZone25);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance();
        calendar28.setTimeInMillis((-2182719659000L));
        calendar28.clear();
        calendar28.set(9, 32772);
        calendar28.set(26175, 26366, 220, 100, 26362);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        boolean boolean46 = timeZone43.observesDaylightTime();
        java.time.ZoneId zoneId47 = timeZone43.toZoneId();
        java.util.Locale locale48 = java.util.Locale.UK;
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone43, locale48);
        calendar28.setTimeZone(timeZone43);
        boolean boolean51 = timeZone25.hasSameRules(timeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar49", (calendar26.compareTo(calendar49) == 0) == calendar26.equals(calendar49));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(100);
        org.joda.time.LocalDate localDate6 = localDate2.minusWeeks(13);
        org.joda.time.LocalDate localDate8 = localDate2.minusDays((int) (short) 10);
        org.joda.time.LocalDate localDate10 = localDate2.plusDays((int) (byte) 10);
        org.joda.time.LocalDate localDate12 = localDate2.withYear(26311131);
        int int13 = localDate2.getDayOfWeek();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        int int16 = dateTime15.getEra();
        org.joda.time.DateTime.Property property17 = dateTime15.secondOfMinute();
        java.lang.String str18 = property17.getAsText();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        long long21 = dateTimeField19.roundFloor((long) (byte) 10);
        java.lang.String str22 = dateTimeField19.getName();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property24 = localDate23.centuryOfEra();
        int int25 = localDate23.getDayOfMonth();
        org.joda.time.LocalDate.Property property26 = localDate23.centuryOfEra();
        int[] intArray31 = new int[] { 'u', 31, (-2600), '#' };
        int int32 = dateTimeField19.getMaximumValue((org.joda.time.ReadablePartial) localDate23, intArray31);
        org.joda.time.DurationField durationField33 = dateTimeField19.getRangeDurationField();
        long long35 = dateTimeField19.roundFloor((long) 70);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = dateTimeField19.getType();
        boolean boolean37 = localDate2.isSupported(dateTimeFieldType36);
        org.joda.time.LocalDate.Property property38 = localDate2.era();
        org.joda.time.DurationField durationField39 = property38.getDurationField();
        java.lang.String str40 = property38.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField33 and durationField39", Math.signum(durationField33.compareTo(durationField39)) == -Math.signum(durationField39.compareTo(durationField33)));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 26173, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.yearOfEra();
        org.joda.time.DurationField durationField10 = chronology5.weekyears();
        org.joda.time.DurationFieldType durationFieldType11 = durationField10.getType();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime17 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        int int21 = dateTime19.getSecondOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.minusMonths((int) 'a');
        boolean boolean24 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology25 = dateTime17.getChronology();
        boolean boolean26 = durationFieldType11.isSupported(chronology25);
        org.joda.time.DurationField durationField27 = chronology25.eras();
        java.lang.String str28 = chronology25.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField27", Math.signum(durationField10.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField10)));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str3 = dateTimeZone1.getID();
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale6.getCountry();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone5, locale6);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale6);
        int int11 = calendar10.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar9", (calendar8.compareTo(calendar9) == 0) == calendar8.equals(calendar9));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(100);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        org.joda.time.DateTime dateTime8 = dateTime6.withMillisOfDay((int) (short) 10);
        int int9 = dateTime6.getMillisOfDay();
        int int10 = dateTime6.getEra();
        org.joda.time.DateTime dateTime12 = dateTime6.minusDays(1);
        int int13 = dateTime12.getCenturyOfEra();
        int int14 = dateTime12.getDayOfYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        int int18 = dateTime16.getSecondOfDay();
        org.joda.time.DateTime dateTime20 = dateTime16.minusYears((int) (byte) -1);
        org.joda.time.DateTime dateTime22 = dateTime20.withMillisOfSecond(59);
        org.joda.time.DateTime.Property property23 = dateTime22.secondOfDay();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology25 = dateTime22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(28);
        org.joda.time.DateTime dateTime28 = dateTime22.withZone(dateTimeZone27);
        int int29 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime28", (dateTime22.compareTo(dateTime28) == 0) == dateTime22.equals(dateTime28));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime6.plusMillis(4);
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime10.plusHours((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.era();
        boolean boolean15 = dateTime13.isSupported(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(295);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone17);
        org.joda.time.DateTime.Property property19 = dateTime18.year();
        org.joda.time.DateTime dateTime21 = property19.addWrapFieldToCopy(26212);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime18", (dateTime13.compareTo(dateTime18) == 0) == dateTime13.equals(dateTime18));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 26164);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) 26176946);
        java.util.Calendar.Builder builder6 = builder2.setLenient(false);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        int int10 = localDateTime8.getDayOfYear();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DurationField durationField14 = dateTimeField13.getRangeDurationField();
        org.joda.time.DurationField durationField15 = dateTimeField13.getLeapDurationField();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        timeZone20.setID("Etc/UTC");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone20, locale23);
        java.lang.String str25 = dateTimeField13.getAsShortText(26193, locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleKeys();
        java.util.Calendar.Builder builder27 = builder6.setLocale(locale23);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.toString();
        java.util.TimeZone timeZone31 = dateTimeZone29.toTimeZone();
        java.time.ZoneId zoneId32 = timeZone31.toZoneId();
        java.util.Locale locale34 = new java.util.Locale("+00:00");
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.lang.String str38 = locale34.getDisplayName(locale37);
        java.util.Locale.setDefault(locale37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getEra();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfMinute();
        org.joda.time.DateTime dateTime45 = dateTime41.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime.Property property46 = dateTime45.secondOfDay();
        java.util.Locale locale47 = java.util.Locale.PRC;
        boolean boolean48 = dateTime45.equals((java.lang.Object) locale47);
        java.lang.String str49 = locale37.getDisplayCountry(locale47);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone31, locale47);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        boolean boolean56 = timeZone53.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone53);
        boolean boolean58 = timeZone31.hasSameRules(timeZone53);
        java.util.Calendar.Builder builder59 = builder6.setTimeZone(timeZone31);
        java.lang.String str60 = timeZone31.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar50", (calendar24.compareTo(calendar50) == 0) == calendar24.equals(calendar50));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.LocalDate.Property property5 = localDate2.monthOfYear();
        org.joda.time.Chronology chronology6 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) localDate2);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra(100);
        org.joda.time.Interval interval13 = localDate10.toInterval();
        int int14 = localDate10.getMonthOfYear();
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTime dateTime16 = localDate10.toDateTime(localTime15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate10.withPeriodAdded(readablePeriod17, 14);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, 16);
        long long24 = dateTimeZone22.previousTransition((long) 355);
        java.lang.String str25 = dateTimeZone22.toString();
        java.util.TimeZone timeZone26 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDate10.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.DateTime dateTime28 = localDate7.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime28", (dateTime4.compareTo(dateTime28) == 0) == dateTime4.equals(dateTime28));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withPeriodAdded(readablePeriod6, 26163);
        org.joda.time.Chronology chronology9 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DurationField durationField12 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.minuteOfHour();
        org.joda.time.DurationField durationField14 = chronology9.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField14, and durationField12", !(durationField12.compareTo(durationField14) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField14.compareTo(durationField12))));
    }
}

